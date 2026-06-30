package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7 f157481a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f157482b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q7.f157450d);

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb c11661x55afe3eb) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c11661x55afe3eb, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
        n9Var.f67177x28d45f97 = "@LibraryAppId";
        n9Var.f67185x8987ca93 = c11661x55afe3eb.f156910d;
        n9Var.f67180x8ecd6328 = c11661x55afe3eb.f156911e;
        n9Var.f67183x55b471cc = c11661x55afe3eb.f156912f;
        n9Var.f67181x238eac02 = c11661x55afe3eb.f156913g;
        java.lang.String str = c11661x55afe3eb.f156914h;
        n9Var.f67176xd0b3bac3 = str;
        n9Var.f67186x912ff5eb = str;
        n9Var.f67178x795e65e8 = c11661x55afe3eb.f156915i;
        n9Var.f67179xac3be4e = c11661x55afe3eb.f156916m;
        n9Var.f67184x1bb3b54a = c11661x55afe3eb.f156917n;
        n9Var.f67182x14c61803 = c11661x55afe3eb.f156918o;
        return n9Var;
    }

    public final int a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7 y7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = y7Var.g();
        java.util.List n17 = g17 == null ? null : y7Var.n(g17, z17);
        int i17 = 0;
        if (n17 != null && !n17.isEmpty()) {
            java.util.Iterator it = n17.iterator();
            while (it.hasNext()) {
                if (com.p314xaae8f345.mm.vfs.w6.h(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) it.next()).f156912f) && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.b(z17);
        return i17;
    }

    public final boolean b(r45.fc7 response, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k8 k8Var;
        int size;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        if (response.f455745f < 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(response.f455743d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(response.f455744e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommonLib.Helper", "flushLibPkgVersionInfo, invalid resp: version( " + response.f455745f + " ), url( " + response.f455743d + " ), md5( " + response.f455744e + " )");
            return false;
        }
        if (response.f455747h > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7 y7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a;
            int i17 = response.f455745f;
            y7Var.a();
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157599b) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = y7Var.g();
                if (g17 == null) {
                    size = 0;
                } else {
                    int j17 = y7Var.j(true);
                    java.util.List m17 = y7Var.m(g17);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : m17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb c11661x55afe3eb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) obj;
                        if (!(c11661x55afe3eb.f156911e == j17 && c11661x55afe3eb.f156910d > i17)) {
                            arrayList.add(obj);
                        }
                    }
                    size = m17.size() - arrayList.size();
                    if (size > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.p(g17, arrayList);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommonLib.Helper", "flushLibPkgVersionInfo, delete manifest.version > " + response.f455745f + ", ret = " + size);
            if (c19767x257d7f != null) {
                c19767x257d7f.f38864x6ac9171 = size;
            }
        }
        int i18 = response.f455745f;
        java.lang.String md52 = response.f455744e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(md52, "md5");
        java.lang.String url = response.f455743d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommonLib.Helper", "flushWxaPkgVersionInfo for release, appId @LibraryAppId, type 0, version " + i18 + ", md5 " + md52 + ", url " + url);
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a;
        if (i18 == i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommonLib.Helper", "flushWxaPkgVersionInfo, given version == local library version %d, skip", java.lang.Integer.valueOf(i19));
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7 y7Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb h17 = y7Var2.h(y7Var2.j(true), i18);
        if (h17 == null) {
            y7Var2.k(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb(i18, 0, null, url, md52, 0L, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 0L, 0L, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommonLib.Helper", "flushWxaPkgVersionInfo, insert record true, appId @LibraryAppId, version " + i18 + ", url " + url + ", md5 " + md52);
            z17 = true;
        } else {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str = h17.f156914h;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str == null ? "" : str, md52);
            java.lang.String str2 = h17.f156913g;
            if (!b17) {
                k8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k8();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x4 x4Var = k8Var.f157163c;
                x4Var.f157581a = md52;
                x4Var.f157582b = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x4 x4Var2 = k8Var.f157162b;
                x4Var2.f157581a = url;
                x4Var2.f157582b = true;
                z17 = true;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(url, str2)) {
                z17 = true;
                k8Var = null;
            } else {
                k8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k8();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x4 x4Var3 = k8Var.f157162b;
                x4Var3.f157581a = url;
                z17 = true;
                x4Var3.f157582b = true;
            }
            boolean z19 = k8Var != null ? z17 : false;
            int i27 = h17.f156910d;
            if (z19) {
                y7Var2.q(h17.f156911e, i27, k8Var);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("flushWxaPkgVersionInfo, update record ");
            sb6.append(k8Var != null ? z17 : false);
            sb6.append(", appId @LibraryAppId, oldVersion ");
            sb6.append(i27);
            sb6.append(", newVersion ");
            sb6.append(i18);
            sb6.append(", oldURL ");
            sb6.append(str2);
            sb6.append(", newURL ");
            sb6.append(url);
            sb6.append(", oldMd5 ");
            sb6.append(str);
            sb6.append(", newMd5 ");
            sb6.append(md52);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommonLib.Helper", sb6.toString());
            if (k8Var == null) {
                return false;
            }
        }
        return z17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb c11661x55afe3eb;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.g();
        if (g17 == null) {
            c11661x55afe3eb = null;
        } else {
            c11661x55afe3eb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) g17.r(z17 ? "release_valid_latest_index" : "debug_valid_latest_index", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb.class);
        }
        if (c11661x55afe3eb == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7 r7Var = f157481a;
        boolean z18 = true;
        java.util.List list = c11661x55afe3eb.f156919p;
        if (!z17) {
            if (!(list == null || list.isEmpty()) && !list.contains(java.lang.Integer.valueOf(r7Var.d()))) {
                z18 = false;
            }
        }
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommonLib.Helper", "getLatestValidPkgRecordForType fail, uinList=" + list + ", uin=" + r7Var.d());
            c11661x55afe3eb = null;
        }
        if (c11661x55afe3eb == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 f17 = f(c11661x55afe3eb);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i8.f157131a.a(f17)) {
            return f17;
        }
        return null;
    }

    public final int d() {
        return gm0.j1.a() ? gm0.j1.b().h() : ((java.lang.Number) ((jz5.n) f157482b).mo141623x754a37bb()).intValue();
    }

    public final boolean e(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b("@LibraryAppId", appId);
    }
}
