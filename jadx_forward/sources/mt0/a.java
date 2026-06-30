package mt0;

/* loaded from: classes4.dex */
public class a extends android.graphics.drawable.Drawable implements com.p314xaae8f345.mm.p872xbfc2bd01.l {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f412718d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p872xbfc2bd01.r f412719e;

    public a(java.lang.String str, com.p314xaae8f345.mm.p872xbfc2bd01.r rVar) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f412718d = paint;
        this.f412719e = rVar;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(false);
        paint.setColor(-1118482);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.l
    public void a() {
        com.p314xaae8f345.mm.p872xbfc2bd01.r rVar = this.f412719e;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.l
    public void b() {
        com.p314xaae8f345.mm.p872xbfc2bd01.r rVar = this.f412719e;
        if (rVar != null) {
            rVar.b();
        }
    }

    public com.p314xaae8f345.mm.p872xbfc2bd01.r c() {
        com.p314xaae8f345.mm.p872xbfc2bd01.r rVar = this.f412719e;
        if (rVar != null) {
            return rVar;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        com.p314xaae8f345.mm.p872xbfc2bd01.r rVar = this.f412719e;
        if (rVar == null || rVar.e()) {
            canvas.drawColor(-1118482);
        } else {
            canvas.drawBitmap(rVar.f150503d, (android.graphics.Rect) null, bounds, this.f412718d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        com.p314xaae8f345.mm.p872xbfc2bd01.r rVar = this.f412719e;
        if (rVar == null || rVar.e()) {
            return 0;
        }
        return rVar.f150503d.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        com.p314xaae8f345.mm.p872xbfc2bd01.r rVar = this.f412719e;
        if (rVar == null || rVar.e()) {
            return 0;
        }
        return rVar.f150503d.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    /* renamed from: toString */
    public java.lang.String m148350x9616526c() {
        return super.toString();
    }
}
