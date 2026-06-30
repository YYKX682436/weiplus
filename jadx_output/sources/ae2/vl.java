package ae2;

/* loaded from: classes3.dex */
public final class vl extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.vl f4250d = new ae2.vl();

    public vl() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        vd2.w2 w2Var = (vd2.w2) ((ss5.g0) i95.n0.c(ss5.g0.class));
        w2Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveReddotFeature", "generateDebugReddot: " + ((java.lang.Number) ae2.in.f3687J.r()).intValue());
        if (intValue == 0) {
            w2Var.wi(intValue, "live.personalcenter.startlive", "live.personalcenter.startlive.live", true);
        } else if (intValue == 1) {
            w2Var.wi(intValue, "finder.personalcenter.startlive", "finder.personalcenter.startlive.live", true);
        } else if (intValue == 2) {
            w2Var.wi(intValue, "finderprofile.startlive", "finderprofile.startlive.live", true);
        } else if (intValue == 3) {
            w2Var.wi(1, "live.personalcenter.startlive", "live.personalcenter.startlive.live", true);
            w2Var.wi(2, "finder.personalcenter.startlive", "finder.personalcenter.startlive.live", true);
            w2Var.wi(3, "finderprofile.startlive", "finderprofile.startlive.live", true);
            r45.vs2 vs2Var = new r45.vs2();
            vs2Var.f388491i = 3600;
            vs2Var.f388486d = 400000;
            vs2Var.C = -4758357817339078452L;
            vs2Var.f388487e = 30004;
            vs2Var.f388494o = true;
            vs2Var.f388500u = "test.group1";
            java.util.LinkedList linkedList = vs2Var.f388489g;
            r45.f03 f03Var = new r45.f03();
            f03Var.f373887d = 1;
            f03Var.f373900t = 0;
            f03Var.f373891h = 1;
            f03Var.f373892i = "startlive.mode.audio";
            linkedList.add(f03Var);
            java.util.LinkedList linkedList2 = vs2Var.f388489g;
            r45.f03 f03Var2 = new r45.f03();
            f03Var2.f373887d = 1;
            f03Var2.f373891h = 1;
            f03Var2.f373900t = 1;
            f03Var2.f373892i = "startlive.mode.audio.ktv";
            linkedList2.add(f03Var2);
            vs2Var.f388490h = java.lang.String.valueOf(1501439274);
            zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var, "appendRed", null, true, null, 20, null);
        }
        return jz5.f0.f302826a;
    }
}
