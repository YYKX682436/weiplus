package c01;

/* loaded from: classes12.dex */
public abstract class je {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Set f37271a = java.util.Collections.emptySet();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f37272b = false;

    public static boolean a() {
        java.lang.String d17 = d();
        if (android.text.TextUtils.isEmpty(d17)) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
            return yp5.a.f464409a.a();
        }
        com.tencent.mm.sdk.platformtools.o4 s17 = s("xagreement_wallet_region");
        int i17 = s17 != null ? s17.getInt(d17, -1) : -1;
        return i17 == 0 || i17 == 1;
    }

    public static int b(long j17, long j18, long j19) {
        return (j18 & j17) == j17 ? 0 : 1;
    }

    public static int c() {
        com.tencent.mm.sdk.platformtools.o4 s17;
        java.lang.String d17 = d();
        if (d17 != null && (s17 = s("xagreement_id_store")) != null) {
            int n17 = s17.n(d17);
            com.tencent.mars.xlog.Log.i("MicroMsg.XAgreementSettings", "Decode xagreementId return %s for %s", java.lang.Integer.valueOf(n17), d17);
            return n17;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        com.tencent.mm.sdk.platformtools.z8 z8Var = yp5.a.f464409a;
        com.tencent.mars.xlog.Log.i("MicroMsg.XAgreementSettings", "Decode xagreementId return %s by default", 0);
        return 0;
    }

    public static java.lang.String d() {
        int i17 = gm0.m.i();
        if (i17 == 0) {
            return null;
        }
        return new kk.v(i17).toString();
    }

    public static com.tencent.mm.sdk.platformtools.o4 e(int i17) {
        return s("xagreement_biz_entry_by_id_" + i17);
    }

    public static com.tencent.mm.sdk.platformtools.o4 f(int i17) {
        return s("xagreement_domains_by_id_" + i17);
    }

    public static com.tencent.mm.sdk.platformtools.o4 g(int i17) {
        return s("xagreement_wordings_by_id_" + i17);
    }

    public static void h() {
        if (f37272b) {
            com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "[!] Already initialized.");
            return;
        }
        f37271a = new java.util.HashSet();
        t(c());
        com.tencent.mm.sdk.platformtools.g9.f192718a = new c01.ud();
        com.tencent.mm.sdk.platformtools.g9.f192719b = new c01.vd();
        c01.ie.a();
        f37272b = true;
    }

    public static void i() {
        java.util.Iterator it = f37271a.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    public static void j(r45.jg7 jg7Var) {
        try {
            k(jg7Var);
            ((java.util.concurrent.ConcurrentHashMap) c01.ee.f37168b.f37169a).clear();
            i();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.XAgreementSettings", th6, "", new java.lang.Object[0]);
        }
    }

    public static void k(r45.jg7 jg7Var) {
        com.tencent.mm.sdk.platformtools.o4 f17;
        com.tencent.mars.xlog.Log.i("MicroMsg.XAgreementSettings", "Save saveDomainSettingsImpl");
        if (jg7Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "xAgreementDmSetting is null.");
            return;
        }
        java.util.LinkedList linkedList = jg7Var.f377800e;
        if (linkedList == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "xAgreementDmSetting.Items is null.");
            return;
        }
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gf0 gf0Var = (r45.gf0) it.next();
            if (gf0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "dmItem is null..");
            } else if (gf0Var.f375184f < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "[!] illegal id, XAgreementId = " + gf0Var.f375184f);
            } else if (android.text.TextUtils.isEmpty(gf0Var.f375182d)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "[!] key is empty, XAgreementId = " + gf0Var.f375184f);
            } else {
                java.util.List list = (java.util.List) sparseArray.get(gf0Var.f375184f);
                if (list == null) {
                    list = new java.util.ArrayList();
                    sparseArray.put(gf0Var.f375184f, list);
                }
                list.add(new m3.d(gf0Var.f375182d, gf0Var.f375183e));
            }
        }
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            int keyAt = sparseArray.keyAt(i17);
            java.util.List<m3.d> list2 = (java.util.List) sparseArray.get(keyAt);
            if (list2 != null && (f17 = f(keyAt)) != null) {
                for (m3.d dVar : list2) {
                    f17.putString((java.lang.String) dVar.f323092a, (java.lang.String) dVar.f323093b);
                }
            }
        }
    }

    public static void l(long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.XAgreementSettings", "#saveFuncsSwith, FuncsSwitch = " + java.lang.Long.toBinaryString(j17) + ", FuncsUserChoiceSwitch = " + java.lang.Long.toBinaryString(j18));
        try {
            com.tencent.mm.sdk.platformtools.o4 e17 = e(com.tencent.mm.sdk.platformtools.n9.f192884a);
            if (e17 == null) {
                return;
            }
            e17.putInt("pay", b(1L, j17, j18));
            e17.putInt("mp", b(2L, j17, j18));
            e17.putInt("oa", b(4L, j17, j18));
            e17.putInt("third_party", b(8L, j17, j18));
            e17.putInt("cross_data", b(16L, j17, j18));
            e17.putInt("wecom", b(32L, j17, j18));
            e17.putInt("channels", b(64L, j17, j18));
            e17.putInt("secondary", b(128L, j17, j18));
            e17.putInt(ya.a.SEARCH, b(256L, j17, j18));
            e17.putInt("wechat_out", b(512L, j17, j18));
            e17.putInt("open", b(1024L, j17, j18));
            e17.putInt("live", b(2048L, j17, j18));
            e17.putInt("ads", b(4096L, j17, j18));
            i();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.XAgreementSettings", th6, "saveFuncsSwith fail", new java.lang.Object[0]);
        }
    }

    public static void m(int i17) {
        com.tencent.mm.sdk.platformtools.o4 s17;
        java.lang.String d17 = d();
        com.tencent.mars.xlog.Log.i("MicroMsg.XAgreementSettings", "#saveWalletRegion, walletRegion = " + i17 + ", uin = " + d17);
        if (i17 == -1 || android.text.TextUtils.isEmpty(d17) || (s17 = s("xagreement_wallet_region")) == null) {
            return;
        }
        s17.A(d17, i17);
    }

    public static void n(r45.mg7 mg7Var) {
        try {
            o(mg7Var);
            ((java.util.concurrent.ConcurrentHashMap) c01.ee.f37168b.f37169a).clear();
            i();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.XAgreementSettings", th6, "", new java.lang.Object[0]);
        }
    }

    public static void o(r45.mg7 mg7Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.XAgreementSettings", "Save XAgreementWordSettings");
        if (mg7Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "xAgreementWordingSetting is null.");
            return;
        }
        java.util.LinkedList linkedList = mg7Var.f380498e;
        if (linkedList == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "XAgreementWording is null.");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.lg7 lg7Var = (r45.lg7) it.next();
            if (lg7Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "xAgreementWording is null..");
            } else {
                int i17 = lg7Var.f379463d;
                if (i17 < 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "[!] illegal id, XAgreementId = " + lg7Var.f379463d);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.XAgreementSettings", "XAgreementId = %s", java.lang.Integer.valueOf(i17));
                    java.util.LinkedList linkedList2 = lg7Var.f379465f;
                    if (linkedList2 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "[!] LangWordings is null.", java.lang.Integer.valueOf(lg7Var.f379463d));
                    } else {
                        com.tencent.mm.sdk.platformtools.o4 g17 = g(lg7Var.f379463d);
                        if (g17 == null) {
                            return;
                        }
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            r45.k54 k54Var = (r45.k54) it6.next();
                            if (k54Var == null) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "[!] LangWordings is null..", java.lang.Integer.valueOf(lg7Var.f379463d));
                            } else if (android.text.TextUtils.isEmpty(k54Var.f378382d)) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "[!] lang is empty, XAgreementId = " + lg7Var.f379463d);
                            } else {
                                java.util.LinkedList linkedList3 = k54Var.f378384f;
                                if (linkedList3 == null) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "[!] LangWordings(lang = %s).Items is null.", java.lang.Integer.valueOf(lg7Var.f379463d), k54Var.f378382d);
                                } else {
                                    java.util.Iterator it7 = linkedList3.iterator();
                                    while (it7.hasNext()) {
                                        r45.nb7 nb7Var = (r45.nb7) it7.next();
                                        if (nb7Var == null) {
                                            com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "[!] LangWordings(lang = %s).Items is null..", java.lang.Integer.valueOf(lg7Var.f379463d), k54Var.f378382d);
                                        } else if (android.text.TextUtils.isEmpty(nb7Var.f381236d)) {
                                            com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "[!] wodring key is empty, XAgreementId = " + lg7Var.f379463d + ", lang = " + k54Var.f378382d);
                                        } else {
                                            java.lang.String str = k54Var.f378382d;
                                            g17.putString(nb7Var.f381236d + "@" + str, nb7Var.f381237e);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void p(int i17) {
        try {
            q(i17);
            ((java.util.concurrent.ConcurrentHashMap) c01.ee.f37168b.f37169a).clear();
            i();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.XAgreementSettings", th6, "", new java.lang.Object[0]);
        }
    }

    public static void q(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.XAgreementSettings", "Save XAgreementId %s", java.lang.Integer.valueOf(i17));
        if (com.tencent.mm.sdk.platformtools.n9.f192884a == i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.XAgreementSettings", "no need to update current XAgreementId");
            return;
        }
        java.lang.String d17 = d();
        if (d17 != null) {
            com.tencent.mm.sdk.platformtools.o4 s17 = s("xagreement_id_store");
            if (s17 != null) {
                s17.A(d17, i17);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.XAgreementSettings", "[!] saving xagreementId, but uin is invalid");
        }
        if (!(c01.ie.f37265a != -1)) {
            t(i17);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.XAgreementSettings", "skip and ust test XAgreementId, update = " + i17 + ", test = " + c01.ie.f37265a);
    }

    public static java.lang.String r(java.lang.String str) {
        return c01.ee.f37168b.a(str, new com.tencent.mm.pointers.PInt());
    }

    public static com.tencent.mm.sdk.platformtools.o4 s(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return com.tencent.mm.sdk.platformtools.o4.M(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.XAgreementSettings", th6, "try get mmkv fail!", new java.lang.Object[0]);
            return null;
        }
    }

    public static void t(int i17) {
        if (i17 == 0) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
            com.tencent.mm.sdk.platformtools.z8 z8Var = yp5.a.f464409a;
            i17 = 0;
        }
        com.tencent.mm.sdk.platformtools.n9.f192884a = i17;
        com.tencent.mm.sdk.platformtools.q9.a();
        c01.ee eeVar = c01.ee.f37168b;
        ((c01.xd) eeVar).reload();
        com.tencent.mm.sdk.platformtools.m9 m9Var = com.tencent.mm.sdk.platformtools.p9.f192935a;
        m9Var.f192867a = eeVar;
        m9Var.f192867a = new c01.wd();
    }
}
