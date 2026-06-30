package an4;

/* loaded from: classes15.dex */
public final class a extends jk3.v {
    public final void c0(r45.un6 topStoryVideoContext, r45.xn6 currentVideoInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topStoryVideoContext, "topStoryVideoContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentVideoInfo, "currentVideoInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStoryMultiTaskHelper", "updateFloatBallData contextId:%s videoId:%s", topStoryVideoContext.f469045r, currentVideoInfo.f471792h);
        r45.wn6 wn6Var = new r45.wn6();
        wn6Var.f470846d = topStoryVideoContext.f469034d;
        wn6Var.f470847e = topStoryVideoContext.f469035e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(topStoryVideoContext.f469040m)) {
            wn6Var.f470848f = topStoryVideoContext.f469036f;
        } else {
            wn6Var.f470848f = topStoryVideoContext.f469040m;
        }
        wn6Var.f470849g = topStoryVideoContext.f469037g;
        wn6Var.f470850h = topStoryVideoContext.f469043p;
        wn6Var.f470852m = topStoryVideoContext.f469045r;
        wn6Var.f470854o = topStoryVideoContext.A;
        wn6Var.f470853n = topStoryVideoContext.f469046s;
        wn6Var.f470851i = topStoryVideoContext.f469038h;
        wn6Var.f470855p = topStoryVideoContext.f469039i;
        wn6Var.f470856q = topStoryVideoContext.f469041n;
        wn6Var.f470858s = currentVideoInfo.W;
        wn6Var.f470857r.add(currentVideoInfo);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
            r45.lr4 v07 = c16601x7ed0e40c != null ? c16601x7ed0e40c.v0() : null;
            if (v07 != null) {
                v07.set(1, currentVideoInfo.f471788d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = this.f381610a;
            if (c16601x7ed0e40c2 != null) {
                c16601x7ed0e40c2.f66790x225a93cf = wn6Var.mo14344x5f01b1f6();
            }
            J();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStoryMultiTaskHelper", e17, "updateFloatBallData exception:%s", e17);
        }
    }

    @Override // jk3.b
    public boolean x() {
        return true;
    }

    @Override // jk3.v, jk3.b
    public void y(int i17, java.lang.String str) {
        super.y(i17, str);
    }
}
