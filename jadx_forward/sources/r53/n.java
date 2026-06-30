package r53;

/* loaded from: classes8.dex */
public abstract class n {
    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65) {
        if (c16008xdb77bd65 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c16008xdb77bd65.a())) {
            return false;
        }
        java.util.Iterator it = ((java.util.ArrayList) c16008xdb77bd65.a()).iterator();
        loop0: while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(tabItem.F)) {
                java.util.Iterator it6 = tabItem.F.iterator();
                while (it6.hasNext()) {
                    if (android.text.TextUtils.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211) it6.next()).f221709d, "chat")) {
                        break loop0;
                    }
                }
            }
        }
        return true;
    }

    public static void b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        boolean z17;
        boolean mo9952xce0038c9;
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameDataUtil", "Null appInfo");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67370x28d45f97)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameDataUtil", "Invalid appId");
            return;
        }
        java.lang.String str = mVar.f67370x28d45f97;
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        if (h17 == null) {
            h17 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
            h17.f67370x28d45f97 = str;
            z17 = true;
        } else {
            z17 = false;
        }
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        if (d17.equals("zh_CN")) {
            h17.f67372x453d1e07 = mVar.f67372x453d1e07;
        } else if (d17.equals("zh_TW") || d17.equals("zh_HK")) {
            h17.f67375x634ac3bb = mVar.f67372x453d1e07;
        } else {
            h17.f67373x634ac1e1 = mVar.f67372x453d1e07;
        }
        h17.f67378x454032b6 = mVar.f67378x454032b6;
        h17.f67386xa1e9e82c = mVar.f67386xa1e9e82c;
        h17.z0(mVar.f319901J);
        h17.y0(mVar.P);
        h17.w0(mVar.T);
        h17.A0(mVar.Q);
        h17.W = mVar.W;
        h17.X = mVar.X;
        h17.U = mVar.U;
        h17.V = mVar.V;
        h17.Z = mVar.Z;
        h17.A = true;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.M)) {
            h17.M = mVar.M;
            h17.A = true;
        }
        if (z17) {
            ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
            mo9952xce0038c9 = zo3.p.Ri().mo880xb970c2b9(h17);
            ((kt.a) ap3.e.a()).Ai(str);
        } else {
            int i17 = h17.f67379x119cf7dc;
            if (i17 < mVar.f67379x119cf7dc) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDataUtil", "oldVersion = %s, newVersion = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mVar.f67379x119cf7dc));
                ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                mo9952xce0038c9 = zo3.p.Ri().mo9952xce0038c9(h17, new java.lang.String[0]);
                ((kt.a) ap3.e.a()).Ai(str);
            } else {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f67369x5e556d3a) ? true : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67369x5e556d3a) ? false : !h17.f67369x5e556d3a.equals(mVar.f67369x5e556d3a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDataUtil", "oldIcon = %s, newIcon = %s", h17.f67369x5e556d3a, mVar.f67369x5e556d3a);
                    h17.f67369x5e556d3a = mVar.f67369x5e556d3a;
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    mo9952xce0038c9 = zo3.p.Ri().mo9952xce0038c9(h17, new java.lang.String[0]);
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    zo3.p.Di().a(str, 1);
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    zo3.p.Di().a(str, 2);
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    zo3.p.Di().a(str, 3);
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    zo3.p.Di().a(str, 4);
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    zo3.p.Di().a(str, 5);
                } else {
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    mo9952xce0038c9 = zo3.p.Ri().mo9952xce0038c9(h17, new java.lang.String[0]);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDataUtil", "Saving AppInfo, appId: %s, insert?: %s, return: %s", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(mo9952xce0038c9));
    }

    public static void c(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameDataUtil", "Null appInfos");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            b((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) it.next());
        }
    }
}
