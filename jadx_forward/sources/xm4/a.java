package xm4;

/* loaded from: classes15.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {
    public static void t0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        byte[] byteArray;
        if (c12886x91aa2b6d != null) {
            synchronized (c12886x91aa2b6d) {
                byteArray = c12886x91aa2b6d.i("key_context") ? c12886x91aa2b6d.G.getByteArray("key_context") : null;
            }
            r45.wn6 wn6Var = new r45.wn6();
            try {
                wn6Var.mo11468x92b714fd(byteArray);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryFloatBallHelper", e17, "handleBallInfoClicked exception:%s", e17);
            }
            java.util.LinkedList linkedList = wn6Var.f470857r;
            if (linkedList.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryFloatBallHelper", "handleBallInfoClicked, cache video list size == 0");
                return;
            }
            r45.un6 un6Var = new r45.un6();
            un6Var.f469039i = wn6Var.f470855p;
            un6Var.f469043p = wn6Var.f470850h;
            r45.xn6 xn6Var = (r45.xn6) linkedList.get(0);
            un6Var.f469042o = xn6Var;
            java.lang.String str = xn6Var.f471792h;
            un6Var.f469034d = str;
            un6Var.f469036f = wn6Var.f470848f;
            un6Var.f469035e = wn6Var.f470847e;
            un6Var.f469037g = wn6Var.f470849g;
            un6Var.f469038h = wn6Var.f470851i;
            java.lang.String str2 = wn6Var.f470852m;
            un6Var.f469045r = str2;
            un6Var.A = wn6Var.f470854o;
            un6Var.f469046s = wn6Var.f470853n;
            un6Var.f469041n = wn6Var.f470856q;
            un6Var.f469044q = wn6Var.f470858s;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFloatBallHelper", "handleBallInfoClicked, contextId:%s videoId:%s", str2, str);
            su4.r2.r(((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).wi(), un6Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        t().f174619f = 7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean n() {
        return true;
    }

    public void u0(r45.un6 un6Var, r45.xn6 xn6Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFloatBallHelper", "updateFloatBallData contextId:%s videoId:%s", un6Var.f469045r, xn6Var.f471792h);
        r45.wn6 wn6Var = new r45.wn6();
        wn6Var.f470846d = un6Var.f469034d;
        wn6Var.f470847e = un6Var.f469035e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(un6Var.f469040m)) {
            wn6Var.f470848f = un6Var.f469036f;
        } else {
            wn6Var.f470848f = un6Var.f469040m;
        }
        wn6Var.f470849g = un6Var.f469037g;
        wn6Var.f470850h = un6Var.f469043p;
        wn6Var.f470852m = un6Var.f469045r;
        wn6Var.f470854o = un6Var.A;
        wn6Var.f470853n = un6Var.f469046s;
        wn6Var.f470851i = un6Var.f469038h;
        wn6Var.f470855p = un6Var.f469039i;
        wn6Var.f470856q = un6Var.f469041n;
        wn6Var.f470858s = un6Var.f469044q;
        wn6Var.f470857r.add(xn6Var);
        try {
            Z(xn6Var.f471788d);
            U("key_context", wn6Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryFloatBallHelper", e17, "updateFloatBallData exception:%s", e17);
        }
        t().f174620g = wn6Var.f470848f;
        t().f174621h = xn6Var.f471792h;
        t().f174618e = wn6Var.f470855p;
        g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean v() {
        return true;
    }
}
