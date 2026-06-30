package xs2;

/* loaded from: classes3.dex */
public final class r implements vp.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xs2.u f537905a;

    public r(xs2.u uVar) {
        this.f537905a = uVar;
    }

    @Override // vp.w
    public void a(boolean z17) {
    }

    @Override // vp.w
    public void b(wp.a danmaku, zp.m touchPoint, zp.d clickResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmaku, "danmaku");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchPoint, "touchPoint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickResult, "clickResult");
        yz5.p pVar = this.f537905a.f537919b;
        if (pVar != null) {
            pVar.mo149xb9724478(danmaku, touchPoint);
        }
    }

    @Override // vp.w
    public void c(java.util.List list) {
    }
}
