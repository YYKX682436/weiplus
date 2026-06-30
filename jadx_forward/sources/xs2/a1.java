package xs2;

/* loaded from: classes3.dex */
public final class a1 extends yp.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f537838a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f537839b;

    public a1(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f537838a = context;
        this.f537839b = "ReplayTextDanmakuRender";
    }

    @Override // yp.p
    public int j(java.lang.Object obj) {
        return 1;
    }

    @Override // yp.p
    public void l(int i17, yp.o viewHolder, wp.i danmaku) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmaku, "danmaku");
        xs2.z0 z0Var = (xs2.z0) viewHolder;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.Object obj = danmaku.f529887y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveMsgProxy");
        r45.t12 t12Var = (r45.t12) ((r45.z12) obj).m75936x14adae67(0);
        java.lang.String m75945x2fec8307 = t12Var != null ? t12Var.m75945x2fec8307(2) : null;
        ((ke0.e) xVar).getClass();
        z0Var.f537933g.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this.f537838a, m75945x2fec8307));
    }

    @Override // yp.p
    public yp.o m(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.view.View inflate = android.view.LayoutInflater.from(this.f537838a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ay7, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        xs2.z0 z0Var = new xs2.z0(inflate);
        com.p314xaae8f345.mm.ui.bk.r0(z0Var.f537933g.getPaint(), 0.8f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f537839b, "onCreateViewHolder: cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return z0Var;
    }
}
