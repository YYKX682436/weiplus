package t21;

/* loaded from: classes12.dex */
public class t0 implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v0 f496489d;

    public t0(t21.v0 v0Var) {
        this.f496489d = v0Var;
    }

    @Override // dn.l
    public void x(java.lang.String str, dn.h hVar) {
        boolean z17 = false;
        t21.v0 v0Var = this.f496489d;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetScenePreloadVideoFake", "%s onPreload completed but sceneResult is null", java.lang.Integer.valueOf(v0Var.hashCode()));
            t21.u0 u0Var = v0Var.f496527r;
            if (u0Var != null) {
                u0Var.a(v0Var, false, 0, 0);
                return;
            }
            return;
        }
        int i17 = (int) hVar.f69548xe026fea1;
        int i18 = (int) hVar.f69523x17c343e7;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePreloadVideoFake", "%d onPreload Completed [%s] videoInfoName[%s] [%d, %d] videoFormat[%d]", java.lang.Integer.valueOf(v0Var.hashCode()), str, v0Var.f496515f, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(hVar.f69571x9373c88d));
        if (i17 > 0 && i18 > 0) {
            v0Var.f496520k = v0Var.g(v0Var.f496515f, i17, true);
        }
        t21.u0 u0Var2 = v0Var.f496527r;
        if (u0Var2 != null) {
            if (i17 > 0 && i18 > 0) {
                z17 = true;
            }
            u0Var2.a(v0Var, z17, i17, i18);
        }
        v0Var.f496519j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v0Var.d(hVar.a(), hVar);
        if (!v0Var.f496510a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 143L, 1L, false);
            return;
        }
        f65.s preloadData = v0Var.f496525p;
        if (preloadData != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadData, "preloadData");
            ((kq3.e) ((bx1.s) i95.n0.c(bx1.s.class))).Bi(3L, preloadData.f341496a, preloadData.f341497b, 0L, preloadData.f341499d, preloadData.f341500e, preloadData.f341504i);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(354L, 142L, 1L, false);
        if (v0Var.f496521l == 1) {
            g0Var.mo68477x336bdfd8(354L, 123L, 1L, false);
        } else {
            g0Var.mo68477x336bdfd8(354L, 124L, 1L, false);
        }
        g0Var.mo68477x336bdfd8(354L, hVar.f69571x9373c88d + 240, 1L, false);
    }
}
