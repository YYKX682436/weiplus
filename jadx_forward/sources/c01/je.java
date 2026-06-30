package c01;

/* loaded from: classes12.dex */
public abstract class je {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Set f118804a = java.util.Collections.emptySet();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f118805b = false;

    public static boolean a() {
        java.lang.String d17 = d();
        if (android.text.TextUtils.isEmpty(d17)) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
            return yp5.a.f545942a.a();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 s17 = s("xagreement_wallet_region");
        int i17 = s17 != null ? s17.getInt(d17, -1) : -1;
        return i17 == 0 || i17 == 1;
    }

    public static int b(long j17, long j18, long j19) {
        return (j18 & j17) == j17 ? 0 : 1;
    }

    public static int c() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 s17;
        java.lang.String d17 = d();
        if (d17 != null && (s17 = s("xagreement_id_store")) != null) {
            int n17 = s17.n(d17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Decode xagreementId return %s for %s", java.lang.Integer.valueOf(n17), d17);
            return n17;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z8 z8Var = yp5.a.f545942a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Decode xagreementId return %s by default", 0);
        return 0;
    }

    public static java.lang.String d() {
        int i17 = gm0.m.i();
        if (i17 == 0) {
            return null;
        }
        return new kk.v(i17).m143587x9616526c();
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e(int i17) {
        return s("xagreement_biz_entry_by_id_" + i17);
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f(int i17) {
        return s("xagreement_domains_by_id_" + i17);
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g(int i17) {
        return s("xagreement_wordings_by_id_" + i17);
    }

    public static void h() {
        if (f118805b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "[!] Already initialized.");
            return;
        }
        f118804a = new java.util.HashSet();
        t(c());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.g9.f274251a = new c01.ud();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.g9.f274252b = new c01.vd();
        c01.ie.a();
        f118805b = true;
    }

    public static void i() {
        java.util.Iterator it = f118804a.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    public static void j(r45.jg7 jg7Var) {
        try {
            k(jg7Var);
            ((java.util.concurrent.ConcurrentHashMap) c01.ee.f118701b.f118702a).clear();
            i();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", th6, "", new java.lang.Object[0]);
        }
    }

    public static void k(r45.jg7 jg7Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Save saveDomainSettingsImpl");
        if (jg7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "xAgreementDmSetting is null.");
            return;
        }
        java.util.LinkedList linkedList = jg7Var.f459333e;
        if (linkedList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "xAgreementDmSetting.Items is null.");
            return;
        }
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gf0 gf0Var = (r45.gf0) it.next();
            if (gf0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "dmItem is null..");
            } else if (gf0Var.f456717f < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "[!] illegal id, XAgreementId = " + gf0Var.f456717f);
            } else if (android.text.TextUtils.isEmpty(gf0Var.f456715d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "[!] key is empty, XAgreementId = " + gf0Var.f456717f);
            } else {
                java.util.List list = (java.util.List) sparseArray.get(gf0Var.f456717f);
                if (list == null) {
                    list = new java.util.ArrayList();
                    sparseArray.put(gf0Var.f456717f, list);
                }
                list.add(new m3.d(gf0Var.f456715d, gf0Var.f456716e));
            }
        }
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            int keyAt = sparseArray.keyAt(i17);
            java.util.List<m3.d> list2 = (java.util.List) sparseArray.get(keyAt);
            if (list2 != null && (f17 = f(keyAt)) != null) {
                for (m3.d dVar : list2) {
                    f17.putString((java.lang.String) dVar.f404625a, (java.lang.String) dVar.f404626b);
                }
            }
        }
    }

    public static void l(long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "#saveFuncsSwith, FuncsSwitch = " + java.lang.Long.toBinaryString(j17) + ", FuncsUserChoiceSwitch = " + java.lang.Long.toBinaryString(j18));
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e17 = e(com.p314xaae8f345.mm.sdk.p2603x2137b148.n9.f274417a);
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
            e17.putInt(ya.a.f77450x918d59a8, b(256L, j17, j18));
            e17.putInt("wechat_out", b(512L, j17, j18));
            e17.putInt("open", b(1024L, j17, j18));
            e17.putInt("live", b(2048L, j17, j18));
            e17.putInt("ads", b(4096L, j17, j18));
            i();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", th6, "saveFuncsSwith fail", new java.lang.Object[0]);
        }
    }

    public static void m(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 s17;
        java.lang.String d17 = d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "#saveWalletRegion, walletRegion = " + i17 + ", uin = " + d17);
        if (i17 == -1 || android.text.TextUtils.isEmpty(d17) || (s17 = s("xagreement_wallet_region")) == null) {
            return;
        }
        s17.A(d17, i17);
    }

    public static void n(r45.mg7 mg7Var) {
        try {
            o(mg7Var);
            ((java.util.concurrent.ConcurrentHashMap) c01.ee.f118701b.f118702a).clear();
            i();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", th6, "", new java.lang.Object[0]);
        }
    }

    public static void o(r45.mg7 mg7Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Save XAgreementWordSettings");
        if (mg7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "xAgreementWordingSetting is null.");
            return;
        }
        java.util.LinkedList linkedList = mg7Var.f462031e;
        if (linkedList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "XAgreementWording is null.");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.lg7 lg7Var = (r45.lg7) it.next();
            if (lg7Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "xAgreementWording is null..");
            } else {
                int i17 = lg7Var.f460996d;
                if (i17 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "[!] illegal id, XAgreementId = " + lg7Var.f460996d);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "XAgreementId = %s", java.lang.Integer.valueOf(i17));
                    java.util.LinkedList linkedList2 = lg7Var.f460998f;
                    if (linkedList2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "[!] LangWordings is null.", java.lang.Integer.valueOf(lg7Var.f460996d));
                    } else {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = g(lg7Var.f460996d);
                        if (g17 == null) {
                            return;
                        }
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            r45.k54 k54Var = (r45.k54) it6.next();
                            if (k54Var == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "[!] LangWordings is null..", java.lang.Integer.valueOf(lg7Var.f460996d));
                            } else if (android.text.TextUtils.isEmpty(k54Var.f459915d)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "[!] lang is empty, XAgreementId = " + lg7Var.f460996d);
                            } else {
                                java.util.LinkedList linkedList3 = k54Var.f459917f;
                                if (linkedList3 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "[!] LangWordings(lang = %s).Items is null.", java.lang.Integer.valueOf(lg7Var.f460996d), k54Var.f459915d);
                                } else {
                                    java.util.Iterator it7 = linkedList3.iterator();
                                    while (it7.hasNext()) {
                                        r45.nb7 nb7Var = (r45.nb7) it7.next();
                                        if (nb7Var == null) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "[!] LangWordings(lang = %s).Items is null..", java.lang.Integer.valueOf(lg7Var.f460996d), k54Var.f459915d);
                                        } else if (android.text.TextUtils.isEmpty(nb7Var.f462769d)) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "[!] wodring key is empty, XAgreementId = " + lg7Var.f460996d + ", lang = " + k54Var.f459915d);
                                        } else {
                                            java.lang.String str = k54Var.f459915d;
                                            g17.putString(nb7Var.f462769d + "@" + str, nb7Var.f462770e);
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
            ((java.util.concurrent.ConcurrentHashMap) c01.ee.f118701b.f118702a).clear();
            i();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", th6, "", new java.lang.Object[0]);
        }
    }

    public static void q(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "Save XAgreementId %s", java.lang.Integer.valueOf(i17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.n9.f274417a == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "no need to update current XAgreementId");
            return;
        }
        java.lang.String d17 = d();
        if (d17 != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 s17 = s("xagreement_id_store");
            if (s17 != null) {
                s17.A(d17, i17);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XAgreementSettings", "[!] saving xagreementId, but uin is invalid");
        }
        if (!(c01.ie.f118798a != -1)) {
            t(i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XAgreementSettings", "skip and ust test XAgreementId, update = " + i17 + ", test = " + c01.ie.f118798a);
    }

    public static java.lang.String r(java.lang.String str) {
        return c01.ee.f118701b.a(str, new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f());
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 s(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XAgreementSettings", th6, "try get mmkv fail!", new java.lang.Object[0]);
            return null;
        }
    }

    public static void t(int i17) {
        if (i17 == 0) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z8 z8Var = yp5.a.f545942a;
            i17 = 0;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n9.f274417a = i17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.q9.a();
        c01.ee eeVar = c01.ee.f118701b;
        ((c01.xd) eeVar).mo13963xc84a8199();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m9 m9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.f274468a;
        m9Var.f274400a = eeVar;
        m9Var.f274400a = new c01.wd();
    }
}
