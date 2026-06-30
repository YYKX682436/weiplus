package rv3;

/* loaded from: classes5.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d f481937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f481938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f481939f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv3.s f481940g;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d c17048x9295f61d, yz5.l lVar, int i17, rv3.s sVar) {
        this.f481937d = c17048x9295f61d;
        this.f481938e = lVar;
        this.f481939f = i17;
        this.f481940g = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d c17048x9295f61d = this.f481937d;
        android.text.TextPaint paint = c17048x9295f61d.getPaint();
        android.graphics.Rect rect = new android.graphics.Rect();
        java.lang.String obj = c17048x9295f61d.getText().toString();
        paint.getTextBounds(obj, 0, obj.length(), rect);
        rect.width();
        c17048x9295f61d.getWidth();
        if (rect.width() < c17048x9295f61d.getWidth()) {
            this.f481940g.getClass();
            c17048x9295f61d.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
            c17048x9295f61d.setMarqueeRepeatLimit(-1);
            c17048x9295f61d.d(false, -1);
            return;
        }
        c17048x9295f61d.setEllipsize(null);
        yz5.l lVar = this.f481938e;
        if (lVar != null) {
            lVar.mo146xb9724478(c17048x9295f61d);
        }
        c17048x9295f61d.d(true, this.f481939f);
    }
}
