package g05;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g05.r f349014d;

    public o(g05.r rVar) {
        this.f349014d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        g05.r rVar = this.f349014d;
        java.util.List y57 = cj6.y5("gh_25d9ac85a4bc", ((java.lang.Number) ((jz5.n) rVar.f349020g).mo141623x754a37bb()).intValue());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(y57, "getLastMsg(...)");
        java.util.Iterator it = y57.iterator();
        while (it.hasNext()) {
            ot0.q v17 = ot0.q.v(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()).U1());
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j0 j0Var = v17 != null ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j0) v17.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j0.class) : null;
            if ((j0Var != null ? j0Var.f273255c : null) != null && j0Var.f273254b != null) {
                java.lang.String frameSetName = j0Var.f273255c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameSetName, "frameSetName");
                java.lang.String mbCardData = j0Var.f273254b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mbCardData, "mbCardData");
                rVar.Ni(frameSetName, mbCardData, new android.graphics.Rect(0, 0, rVar.wi(), 0), hq0.m0.f364565d);
            }
        }
    }
}
