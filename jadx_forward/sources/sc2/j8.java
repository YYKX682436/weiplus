package sc2;

/* loaded from: classes2.dex */
public final class j8 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f487534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487536f;

    public j8(sc2.p8 p8Var, in5.s0 s0Var, android.view.View view) {
        this.f487534d = p8Var;
        this.f487535e = s0Var;
        this.f487536f = view;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 miniholder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(miniholder, "miniholder");
        sc2.v8 v8Var = (sc2.v8) miniholder.f374658i;
        sc2.p8 p8Var = this.f487534d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p8Var.f487685w, "onCarouselCardClick: position=" + i17 + ", jumpId=" + v8Var.f487850d.f534767a.m76501xf2fd2296());
        xc2.z2 z2Var = p8Var.f84684o;
        if (z2Var != null) {
            xc2.j jVar = (xc2.j) z2Var;
            in5.s0 holder = this.f487535e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
            android.view.View jumpView = this.f487536f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
            xc2.p0 infoEx = v8Var.f487850d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
            jVar.r(holder, jumpView, infoEx);
            jVar.q(holder, jumpView, infoEx);
        }
    }
}
