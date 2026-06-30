package oc2;

/* loaded from: classes8.dex */
public final class h0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f425728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b f425729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oc2.i0 f425730c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cp5 f425731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f425732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f425733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425734g;

    public h0(android.graphics.drawable.BitmapDrawable bitmapDrawable, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b, oc2.i0 i0Var, r45.cp5 cp5Var, java.lang.ref.WeakReference weakReference, long j17, java.lang.String str) {
        this.f425728a = bitmapDrawable;
        this.f425729b = c13738xbdff117b;
        this.f425730c = i0Var;
        this.f425731d = cp5Var;
        this.f425732e = weakReference;
        this.f425733f = j17;
        this.f425734g = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f425728a;
        if (bitmapDrawable.getBitmap() == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b = this.f425729b;
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c13738xbdff117b.h(), "[asyncLoadIcon] but result is null!");
            return;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapDrawable.getBitmap());
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, bitmapDrawable.getBitmap().getWidth(), bitmapDrawable.getBitmap().getHeight());
        canvas.drawColor(c13738xbdff117b.f187348m, android.graphics.PorterDuff.Mode.CLEAR);
        canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
        canvas.drawBitmap(bitmap, rect, rect2, new android.graphics.Paint(3));
        pm0.v.X(new oc2.g0(this.f425730c, this.f425731d, this.f425729b, this.f425728a, this.f425732e, this.f425733f, bitmap, rect, rect2, this.f425734g));
    }
}
