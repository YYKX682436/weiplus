package is1;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final is1.f f375946d = new is1.f();

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.String i18 = is1.l.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplInfoManager", "cleanInvalidTmpl saveDir:%s", i18);
        com.p314xaae8f345.mm.vfs.r6 l17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.l(i18);
        if (!l17.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.TmplInfoManager", "fileDir:%s is not exist, err", i18);
            return;
        }
        if (!l17.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.TmplInfoManager", "fileDir:%s is not dir, err", i18);
            return;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = l17.G();
        if (G != null) {
            if (!(G.length == 0)) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                is1.l lVar = is1.l.f375956a;
                for (java.lang.Integer num : (java.lang.Integer[]) ((jz5.n) is1.l.f375959d).mo141623x754a37bb()) {
                    int intValue = num.intValue();
                    r45.vm6 j17 = is1.l.j(lVar, intValue, null, 2, null);
                    java.util.Set stringSet = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().getStringSet(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.f(is1.l.f(intValue)), new java.util.HashSet());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringSet);
                    java.util.List<java.lang.String> S0 = kz5.n0.S0(stringSet);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(S0, 10));
                    for (java.lang.String str2 : S0) {
                        r45.vm6 vm6Var = new r45.vm6();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                        lVar.l(vm6Var, intValue, str2);
                        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        arrayList2.add(vm6Var);
                    }
                    for (r45.vm6 vm6Var2 : kz5.n0.K0(kz5.n0.F0(arrayList2, new is1.g()), ((java.lang.Number) ((jz5.n) is1.l.f375963h).mo141623x754a37bb()).intValue())) {
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.j(vm6Var2)) {
                            arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.a(vm6Var2));
                        }
                        if (j17.f469906e != vm6Var2.f469906e) {
                            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.a(vm6Var2);
                            com.p314xaae8f345.mm.vfs.r6 l18 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.l(a17);
                            if (l18.y()) {
                                com.p314xaae8f345.mm.vfs.r6[] G2 = l18.G();
                                if (G2 != null) {
                                    int length = G2.length;
                                    while (i17 < length) {
                                        com.p314xaae8f345.mm.vfs.r6 r6Var = G2[i17];
                                        java.lang.String o17 = r6Var.o();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                                        if (!((r26.t) ((jz5.n) is1.l.f375964i).mo141623x754a37bb()).e(o17)) {
                                            java.lang.String o18 = r6Var.o();
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
                                            i17 = r26.i0.n(o18, ".js.utf16", false) ? 0 : i17 + 1;
                                        }
                                        r6Var.l();
                                        r6Var.u();
                                    }
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.TmplInfoManager", "deleteInvalidCacheFile fileDir:%s is not dir, err", a17);
                            }
                        }
                    }
                }
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y3.b(r6Var2.B(), 604800000L)) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(r6Var2.o());
                        sb6.append(r6Var2.y() ? "/" : "");
                        if (!arrayList.contains(sb6.toString())) {
                            arrayList3.add(r6Var2.o());
                        }
                    }
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
                if (1 >= com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016()) {
                    arrayList.size();
                }
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    java.lang.String str6 = (java.lang.String) it.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.l(str6).y()) {
                        com.p314xaae8f345.mm.vfs.w6.g(str6, true);
                    } else {
                        com.p314xaae8f345.mm.vfs.w6.h(str6);
                    }
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.TmplInfoManager", "files is null");
    }
}
