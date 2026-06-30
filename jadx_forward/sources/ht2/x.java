package ht2;

/* loaded from: classes5.dex */
public final class x implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f366460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f366461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f366462c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f366463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f366464e;

    public x(android.graphics.drawable.BitmapDrawable bitmapDrawable, boolean z17, int i17, ht2.y0 y0Var, yz5.a aVar) {
        this.f366460a = bitmapDrawable;
        this.f366461b = z17;
        this.f366462c = i17;
        this.f366463d = y0Var;
        this.f366464e = aVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicIconResService", "[getIconSpan] successfully load resource=[" + bitmap.getWidth() + ':' + bitmap.getHeight() + ']');
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f366460a;
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapDrawable.getBitmap());
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, bitmapDrawable.getBitmap().getWidth(), bitmapDrawable.getBitmap().getHeight());
        if (this.f366461b) {
            canvas.drawBitmap(bitmap, rect, rect2, new android.graphics.Paint(3));
        } else {
            android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.CLEAR;
            int i17 = this.f366462c;
            canvas.drawColor(i17, mode);
            canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
            canvas.drawBitmap(bitmap, rect, rect2, new android.graphics.Paint(3));
            this.f366463d.cj(bitmapDrawable, i17);
        }
        pm0.v.X(new ht2.w(bitmapDrawable, this.f366464e));
    }
}
