package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.r7 f75948a = new com.tencent.mm.plugin.appbrand.appcache.r7();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f75949b = jz5.h.b(com.tencent.mm.plugin.appbrand.appcache.q7.f75917d);

    public static final com.tencent.mm.plugin.appbrand.appcache.n9 f(com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord wxaCommonLibRecord) {
        kotlin.jvm.internal.o.g(wxaCommonLibRecord, "<this>");
        com.tencent.mm.plugin.appbrand.appcache.n9 n9Var = new com.tencent.mm.plugin.appbrand.appcache.n9();
        n9Var.field_appId = "@LibraryAppId";
        n9Var.field_version = wxaCommonLibRecord.f75377d;
        n9Var.field_debugType = wxaCommonLibRecord.f75378e;
        n9Var.field_pkgPath = wxaCommonLibRecord.f75379f;
        n9Var.field_downloadURL = wxaCommonLibRecord.f75380g;
        java.lang.String str = wxaCommonLibRecord.f75381h;
        n9Var.field_NewMd5 = str;
        n9Var.field_versionMd5 = str;
        n9Var.field_checksum = wxaCommonLibRecord.f75382i;
        n9Var.field_createTime = wxaCommonLibRecord.f75383m;
        n9Var.field_startTime = wxaCommonLibRecord.f75384n;
        n9Var.field_endTime = wxaCommonLibRecord.f75385o;
        return n9Var;
    }

    public final int a(boolean z17) {
        com.tencent.mm.plugin.appbrand.appcache.y7 y7Var = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a;
        com.tencent.mm.sdk.platformtools.o4 g17 = y7Var.g();
        java.util.List n17 = g17 == null ? null : y7Var.n(g17, z17);
        int i17 = 0;
        if (n17 != null && !n17.isEmpty()) {
            java.util.Iterator it = n17.iterator();
            while (it.hasNext()) {
                if (com.tencent.mm.vfs.w6.h(((com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord) it.next()).f75379f) && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.b(z17);
        return i17;
    }

    public final boolean b(r45.fc7 response, com.tencent.mm.pointers.PInt pInt) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.appcache.k8 k8Var;
        int size;
        kotlin.jvm.internal.o.g(response, "response");
        if (response.f374212f < 0 || com.tencent.mm.sdk.platformtools.t8.K0(response.f374210d) || com.tencent.mm.sdk.platformtools.t8.K0(response.f374211e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommonLib.Helper", "flushLibPkgVersionInfo, invalid resp: version( " + response.f374212f + " ), url( " + response.f374210d + " ), md5( " + response.f374211e + " )");
            return false;
        }
        if (response.f374214h > 0) {
            com.tencent.mm.plugin.appbrand.appcache.y7 y7Var = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a;
            int i17 = response.f374212f;
            y7Var.a();
            synchronized (com.tencent.mm.plugin.appbrand.appcache.y7.f76066b) {
                com.tencent.mm.sdk.platformtools.o4 g17 = y7Var.g();
                if (g17 == null) {
                    size = 0;
                } else {
                    int j17 = y7Var.j(true);
                    java.util.List m17 = y7Var.m(g17);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : m17) {
                        com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord wxaCommonLibRecord = (com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord) obj;
                        if (!(wxaCommonLibRecord.f75378e == j17 && wxaCommonLibRecord.f75377d > i17)) {
                            arrayList.add(obj);
                        }
                    }
                    size = m17.size() - arrayList.size();
                    if (size > 0) {
                        com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.p(g17, arrayList);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommonLib.Helper", "flushLibPkgVersionInfo, delete manifest.version > " + response.f374212f + ", ret = " + size);
            if (pInt != null) {
                pInt.value = size;
            }
        }
        int i18 = response.f374212f;
        java.lang.String md52 = response.f374211e;
        kotlin.jvm.internal.o.f(md52, "md5");
        java.lang.String url = response.f374210d;
        kotlin.jvm.internal.o.f(url, "url");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommonLib.Helper", "flushWxaPkgVersionInfo for release, appId @LibraryAppId, type 0, version " + i18 + ", md5 " + md52 + ", url " + url);
        int i19 = com.tencent.mm.plugin.appbrand.appcache.w8.f76026a;
        if (i18 == i19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommonLib.Helper", "flushWxaPkgVersionInfo, given version == local library version %d, skip", java.lang.Integer.valueOf(i19));
            return false;
        }
        com.tencent.mm.plugin.appbrand.appcache.y7 y7Var2 = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a;
        com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord h17 = y7Var2.h(y7Var2.j(true), i18);
        if (h17 == null) {
            y7Var2.k(new com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord(i18, 0, null, url, md52, 0L, com.tencent.mm.sdk.platformtools.t8.i1(), 0L, 0L, null));
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommonLib.Helper", "flushWxaPkgVersionInfo, insert record true, appId @LibraryAppId, version " + i18 + ", url " + url + ", md5 " + md52);
            z17 = true;
        } else {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str = h17.f75381h;
            boolean b17 = kotlin.jvm.internal.o.b(str == null ? "" : str, md52);
            java.lang.String str2 = h17.f75380g;
            if (!b17) {
                k8Var = new com.tencent.mm.plugin.appbrand.appcache.k8();
                com.tencent.mm.plugin.appbrand.appcache.x4 x4Var = k8Var.f75630c;
                x4Var.f76048a = md52;
                x4Var.f76049b = true;
                com.tencent.mm.plugin.appbrand.appcache.x4 x4Var2 = k8Var.f75629b;
                x4Var2.f76048a = url;
                x4Var2.f76049b = true;
                z17 = true;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(url) || kotlin.jvm.internal.o.b(url, str2)) {
                z17 = true;
                k8Var = null;
            } else {
                k8Var = new com.tencent.mm.plugin.appbrand.appcache.k8();
                com.tencent.mm.plugin.appbrand.appcache.x4 x4Var3 = k8Var.f75629b;
                x4Var3.f76048a = url;
                z17 = true;
                x4Var3.f76049b = true;
            }
            boolean z19 = k8Var != null ? z17 : false;
            int i27 = h17.f75377d;
            if (z19) {
                y7Var2.q(h17.f75378e, i27, k8Var);
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
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommonLib.Helper", sb6.toString());
            if (k8Var == null) {
                return false;
            }
        }
        return z17;
    }

    public final com.tencent.mm.plugin.appbrand.appcache.n9 c(boolean z17) {
        com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord wxaCommonLibRecord;
        com.tencent.mm.sdk.platformtools.o4 g17 = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.g();
        if (g17 == null) {
            wxaCommonLibRecord = null;
        } else {
            wxaCommonLibRecord = (com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord) g17.r(z17 ? "release_valid_latest_index" : "debug_valid_latest_index", com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord.class);
        }
        if (wxaCommonLibRecord == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.appcache.r7 r7Var = f75948a;
        boolean z18 = true;
        java.util.List list = wxaCommonLibRecord.f75386p;
        if (!z17) {
            if (!(list == null || list.isEmpty()) && !list.contains(java.lang.Integer.valueOf(r7Var.d()))) {
                z18 = false;
            }
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommonLib.Helper", "getLatestValidPkgRecordForType fail, uinList=" + list + ", uin=" + r7Var.d());
            wxaCommonLibRecord = null;
        }
        if (wxaCommonLibRecord == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.appcache.n9 f17 = f(wxaCommonLibRecord);
        if (com.tencent.mm.plugin.appbrand.appcache.i8.f75598a.a(f17)) {
            return f17;
        }
        return null;
    }

    public final int d() {
        return gm0.j1.a() ? gm0.j1.b().h() : ((java.lang.Number) ((jz5.n) f75949b).getValue()).intValue();
    }

    public final boolean e(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        return kotlin.jvm.internal.o.b("@LibraryAppId", appId);
    }
}
