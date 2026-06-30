package ws2;

/* loaded from: classes3.dex */
public final class j2 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f530592f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f530593g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f530594h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f530595i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f530596m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f530592f = "LiveRecordCountDownSlick";
        this.f530593g = jz5.h.b(ws2.c2.f530553d);
        this.f530594h = new java.util.HashMap();
        this.f530596m = jz5.h.b(new ws2.h2(this, liveContext));
    }

    public final void N6() {
        r45.nt2 nt2Var = ((mm2.f6) this.f410496d.a(mm2.f6.class)).E;
        boolean z17 = false;
        if (nt2Var != null && nt2Var.m75939xb282bd08(0) == 2) {
            z17 = true;
        }
        if (!z17) {
            pm0.v.K(null, new ws2.e2(this));
        } else {
            this.f530594h.clear();
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.f530596m).mo141623x754a37bb()).d();
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        this.f530594h.clear();
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.f530596m).mo141623x754a37bb()).d();
    }
}
