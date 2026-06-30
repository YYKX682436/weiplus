package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0 f269985a;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0 b() {
        if (f269985a == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0.class) {
                if (f269985a == null) {
                    f269985a = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0();
                }
            }
        }
        return f269985a;
    }

    public final void a(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            f(z17, str, 3);
            return;
        }
        java.util.List b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.b(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "WepkgPreloadFile downloadComplete:false list.size:%s", java.lang.Integer.valueOf(b17.size()));
            f(z17, str, 1);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
        c19540x47e34072.f269876h = 3006;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda = c19540x47e34072.f269877i;
        c19543x781c5eda.f269907d = str;
        c19543x781c5eda.f269924x = true;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            c19540x47e34072.z();
        } else {
            c19540x47e34072.s();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.d(str);
        if (d17 != null && d17.f269921u != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("downloadCompleteTime", "", d17.f269907d, d17.f269909f, -1L, java.lang.System.currentTimeMillis() - (d17.f269921u * 1000), null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e340722 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
            c19540x47e340722.f269876h = com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872.f46687xbf7f413d;
            c19540x47e340722.f269877i.f269907d = str;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                c19540x47e340722.z();
            } else {
                c19540x47e340722.s();
            }
        }
        f(z17, str, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "WepkgPreloadFile downloadComplete:true");
    }

    public final void c(java.lang.String str, java.util.List list, boolean z17) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "loopDownload WepkgPreloadFile is empty");
                a(str, z17);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 c19542xf3901c27 = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27) list.remove(0);
            if (c19542xf3901c27 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "download item is null, to loop");
                c(str, list, z17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "download preload files pkgid:%s, version:%s, rid:%s", c19542xf3901c27.f269896e, c19542xf3901c27.f269897f, c19542xf3901c27.f269899h);
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s0(this, str, list, z17);
                s0Var.f269927a = c19542xf3901c27;
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.a(2, c19542xf3901c27.f269896e, c19542xf3901c27.f269899h, c19542xf3901c27.f269902n, c19542xf3901c27.f269903o, c19542xf3901c27.f269897f, c19542xf3901c27.f269901m, c19542xf3901c27.f269904p, s0Var);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgUpdater", "loopDownload err:%s", e17.getMessage());
        }
    }

    public void d(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            f(z17, str, 3);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.q0(this, z17, str);
        q0Var.f269927a = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "start update wepkg. pkgid:%s, isAutoUpdate:%s", str, java.lang.Boolean.valueOf(z17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            f(z17, str, 3);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "update big package. pkgid:%s, isAutoUpdate:%s", str, java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.d(str);
        if (d17 == null) {
            f(z17, str, 3);
            return;
        }
        if (!d17.f269923w) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.a(1, d17.f269907d, "", d17.f269917q, d17.f269918r, d17.f269909f, d17.f269916p, d17.f269919s, new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.r0(this, q0Var, z17, str));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
        c19540x47e34072.f269866f = true;
        c19540x47e34072.f269867g = true;
        q0Var.a(c19540x47e34072);
    }

    public void e(r45.k85 k85Var, int i17) {
        r45.ya7 ya7Var;
        r45.qa7 qa7Var;
        r45.ta7 ta7Var;
        r45.wa7 wa7Var;
        r45.ta7 ta7Var2;
        if (k85Var == null || (ya7Var = k85Var.f460025f) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "dont need to update wepkg");
            if (k85Var != null) {
                d(k85Var.f460023d, false);
                return;
            }
            return;
        }
        r45.qa7 qa7Var2 = ya7Var.f472466f;
        r45.xa7 xa7Var = ya7Var.f472467g;
        if (qa7Var2 == null && xa7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "bigPackage is null and preloadFiles is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.c().e(k85Var.f460023d, 2, 5);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
        c19540x47e34072.f269876h = 2002;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda = c19540x47e34072.f269877i;
        c19543x781c5eda.getClass();
        c19543x781c5eda.f269907d = k85Var.f460023d;
        r45.va7 va7Var = k85Var.f460024e;
        r45.ya7 ya7Var2 = k85Var.f460025f;
        if (va7Var != null) {
            c19543x781c5eda.f269908e = va7Var.f469589d;
            r45.sa7 sa7Var = va7Var.f469590e;
            if (sa7Var != null) {
                c19543x781c5eda.f269909f = sa7Var.f467134d;
                c19543x781c5eda.f269911h = sa7Var.f467135e;
                c19543x781c5eda.f269912i = sa7Var.f467136f;
                c19543x781c5eda.f269913m = sa7Var.f467137g;
            }
        }
        if (ya7Var2 != null) {
            c19543x781c5eda.f269915o = ya7Var2.f472464d;
            c19543x781c5eda.f269922v = ya7Var2.f472465e;
            r45.qa7 qa7Var3 = ya7Var2.f472466f;
            if (qa7Var3 == null || (ta7Var2 = qa7Var3.f465328d) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ta7Var2.f467793e)) {
                c19543x781c5eda.f269923w = true;
            } else {
                r45.ta7 ta7Var3 = qa7Var3.f465328d;
                c19543x781c5eda.f269916p = ta7Var3.f467792d;
                c19543x781c5eda.f269917q = ta7Var3.f467793e;
                c19543x781c5eda.f269918r = ta7Var3.f467795g;
                c19543x781c5eda.f269919s = ta7Var3.f467794f;
                c19543x781c5eda.f269923w = false;
            }
            r45.xa7 xa7Var2 = ya7Var2.f472467g;
            if (xa7Var2 != null) {
                c19543x781c5eda.f269925y = xa7Var2.f471453e;
            }
            if (xa7Var2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(xa7Var2.f471452d) || !xa7Var2.f471453e) {
                c19543x781c5eda.f269924x = true;
            } else {
                c19543x781c5eda.f269924x = false;
            }
            c19543x781c5eda.f269926z = 0;
        }
        c19543x781c5eda.A = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19539x5f5d0071 c19539x5f5d0071 = c19540x47e34072.f269879n;
        c19539x5f5d0071.getClass();
        r45.ya7 ya7Var3 = k85Var.f460025f;
        if (ya7Var3 != null && (qa7Var = ya7Var3.f472466f) != null && (ta7Var = qa7Var.f465328d) != null && (wa7Var = ta7Var.f467796h) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wa7Var.f470553e)) {
            r45.wa7 wa7Var2 = k85Var.f460025f.f472466f.f465328d.f467796h;
            c19539x5f5d0071.f269871g = k85Var.f460024e.f469590e.f467134d;
            c19539x5f5d0071.f269868d = k85Var.f460023d;
            c19539x5f5d0071.f269872h = wa7Var2.f470553e;
            c19539x5f5d0071.f269873i = wa7Var2.f470552d;
            c19539x5f5d0071.f269874m = wa7Var2.f470555g;
            c19539x5f5d0071.f269875n = wa7Var2.f470554f;
        }
        r45.xa7 xa7Var3 = k85Var.f460025f.f472467g;
        if (xa7Var3 != null) {
            java.util.LinkedList linkedList = xa7Var3.f471452d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.ua7 ua7Var = (r45.ua7) it.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 c19542xf3901c27 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27();
                    java.lang.String str = k85Var.f460023d;
                    java.lang.String str2 = k85Var.f460024e.f469590e.f467134d;
                    if (ua7Var != null) {
                        c19542xf3901c27.f269895d = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.c(str, ua7Var.f468721d);
                        c19542xf3901c27.f269896e = str;
                        c19542xf3901c27.f269897f = str2;
                        c19542xf3901c27.f269899h = ua7Var.f468721d;
                        c19542xf3901c27.f269900i = ua7Var.f468722e;
                        r45.ta7 ta7Var4 = ua7Var.f468723f;
                        if (ta7Var4 != null) {
                            c19542xf3901c27.f269901m = ta7Var4.f467792d;
                            c19542xf3901c27.f269902n = ta7Var4.f467793e;
                            c19542xf3901c27.f269903o = ta7Var4.f467795g;
                            c19542xf3901c27.f269904p = ta7Var4.f467794f;
                        }
                        c19542xf3901c27.f269905q = false;
                    }
                    arrayList.add(c19542xf3901c27);
                }
                c19540x47e34072.f269881p = arrayList;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            c19540x47e34072.z();
        } else {
            c19540x47e34072.s();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "downloadTriggerType:%d", java.lang.Integer.valueOf(i17));
        if (i17 == -1 || i17 == 0) {
            d(k85Var.f460023d, false);
            return;
        }
        if (i17 == 1) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                d(k85Var.f460023d, false);
            }
        } else {
            if (i17 != 2) {
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5600x21ae9db5 c5600x21ae9db5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5600x21ae9db5();
            c5600x21ae9db5.e();
            if (c5600x21ae9db5.f135925g.f89536a) {
                d(k85Var.f460023d, false);
            }
        }
    }

    public final void f(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3 c6276xb08681d3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3();
            c6276xb08681d3.f136525g.f89502a = 0;
            c6276xb08681d3.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
        c19540x47e34072.f269876h = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46357xe9bcaf57;
        c19540x47e34072.f269877i.f269907d = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            c19540x47e34072.z();
        } else {
            c19540x47e34072.s();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.c().e(str, 3, 6);
    }
}
