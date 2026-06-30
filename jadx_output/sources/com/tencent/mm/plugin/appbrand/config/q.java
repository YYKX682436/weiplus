package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public abstract class q extends k91.h5 {
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0054 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static km5.q c(java.util.List r17, k91.h1 r18, k91.e5 r19) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.config.q.c(java.util.List, k91.h1, k91.e5):km5.q");
    }

    public static km5.q d(java.util.List list, k91.h1 h1Var) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return pq5.h.b(java.util.Collections.emptyList());
        }
        k91.i1 i1Var = new k91.i1(list, h1Var);
        int hashCode = i1Var.hashCode();
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrSyncHelper", "BatchWxaAttrSync(%d) commit", java.lang.Integer.valueOf(hashCode));
        return i1Var.l().i(new k91.z4(hashCode, h1Var, list));
    }

    public static boolean e(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || k01.o.a(str)) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrSyncHelper", "checkLogIfInvalidUsername %s, %s", str, com.tencent.mm.sdk.platformtools.z3.c(new java.lang.Throwable()));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(me1.b.CTRL_INDEX, 1);
        return true;
    }

    public static com.tencent.mm.protobuf.g f(java.lang.String str) {
        k91.v5 k17 = com.tencent.mm.plugin.appbrand.app.r9.ij().k1(str, "syncVersion");
        return k17 == null ? new com.tencent.mm.protobuf.g(new byte[0], 0, 0) : k91.j4.i1(k17);
    }

    public static long g(boolean z17, boolean z18) {
        if (!z17) {
            return z18 ? com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().L : com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().K;
        }
        long j17 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().M.f77277i;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrSyncHelper", "getSyncFreq forInvalidContact, return %d", java.lang.Long.valueOf(j17));
        return j17;
    }

    public static android.util.Pair h(java.lang.String str, boolean z17, k91.g5 g5Var, k91.d5 d5Var) {
        return e(str) ? new android.util.Pair(null, null) : i(str, z17, g5Var, new k91.r4(str, d5Var), null);
    }

    public static android.util.Pair i(java.lang.String str, boolean z17, k91.g5 g5Var, k91.a5 a5Var, com.tencent.mm.pointers.PBool pBool) {
        java.lang.Object obj;
        java.lang.String str2;
        com.tencent.mm.modelbase.f fVar = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !gm0.j1.b().f273254q) {
            return android.util.Pair.create(null, null);
        }
        if (z17) {
            obj = null;
        } else {
            obj = a5Var.e(str);
            if (obj != null && !a5Var.a(obj)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, no need cgi sync, key:%s", java.lang.Boolean.valueOf(z17), str);
                m(obj);
                return android.util.Pair.create(obj, fVar);
            }
        }
        if (g5Var != null) {
            g5Var.a();
        }
        com.tencent.mm.modelbase.f t17 = a5Var.b(str).t();
        if (t17 == null || (t17 instanceof com.tencent.mm.modelbase.k3) || t17.f70615a != 0 || t17.f70616b != 0) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Boolean.valueOf(z17);
            objArr[1] = java.lang.Integer.valueOf(t17 == null ? -1 : t17.f70615a);
            objArr[2] = java.lang.Integer.valueOf(t17 != null ? t17.f70616b : -1);
            objArr[3] = t17 == null ? "null resp" : t17.f70617c;
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, errType = %d, errCode = %d, errMsg = %s", objArr);
            return (obj == null && (obj = a5Var.e(str)) == null) ? android.util.Pair.create(null, t17) : android.util.Pair.create(obj, t17);
        }
        java.util.Iterator it = ((r45.zc7) t17.f70618d).f391921e.iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            }
            r45.yc7 yc7Var = (r45.yc7) it.next();
            if ("UserName".equalsIgnoreCase(yc7Var.f390971d)) {
                str2 = yc7Var.f390972e;
                if (!str2.endsWith("@app")) {
                    str2 = str2.concat("@app");
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = a5Var.getUsername();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, key %s, cgi sync fail username invalid", java.lang.Boolean.valueOf(z17), str);
                return android.util.Pair.create(null, null);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrSyncHelper", "loadOrSync key(%s), username(%s), flushAttrs", str, str2);
        k91.m4 ij6 = com.tencent.mm.plugin.appbrand.app.r9.ij();
        com.tencent.mm.protobuf.f fVar2 = t17.f70618d;
        if (ij6.W0(str2, ((r45.zc7) fVar2).f391920d, ((r45.zc7) fVar2).f391921e, true) && pBool != null) {
            pBool.value = true;
        }
        obj = a5Var.e(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, cgi sync result, key:%s", java.lang.Boolean.valueOf(z17), str);
        m(obj);
        fVar = t17;
        return android.util.Pair.create(obj, fVar);
    }

    public static void j(java.lang.String str, boolean z17, k91.c5 c5Var, k91.d5 d5Var) {
        if (e(str)) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new k91.t4(str, z17, d5Var, c5Var));
    }

    public static boolean k(java.lang.String str) {
        k91.v5 n17 = com.tencent.mm.plugin.appbrand.app.r9.ij().n1(str, "syncTimeSecond");
        return l(str, false, false, n17 == null ? 0L : n17.field_syncTimeSecond);
    }

    public static boolean l(java.lang.String str, boolean z17, boolean z18, long j17) {
        if (com.tencent.mm.plugin.appbrand.app.r9.ij() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaAttrSyncHelper", "needUpdateAttr(%s), storage NULL", str);
            return false;
        }
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        long g17 = g(z17, z18);
        com.tencent.mars.xlog.Log.getLogLevel();
        return i17 - j17 >= g17 || j17 > i17 + g17;
    }

    public static void m(java.lang.Object obj) {
        if (!(obj instanceof k91.v5)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrSyncHelper", "printContact %s", obj);
            return;
        }
        k91.v5 v5Var = (k91.v5) obj;
        v5Var.getClass();
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String[] strArr = {java.lang.String.format(locale, ">>>>>> WxaAttributes(%s|%s|%s)START >>>>>>", v5Var.field_username, v5Var.field_appId, v5Var.field_nickname), ">>> field_appInfo=" + v5Var.field_appInfo, ">>> field_versionInfo=" + v5Var.field_versionInfo, ">>> field_dynamicInfo=" + v5Var.field_dynamicInfo, java.lang.String.format(locale, ">>>>>> WxaAttributes(%s|%s|%s) END >>>>>>", v5Var.field_username, v5Var.field_appId, v5Var.field_nickname)};
        for (int i17 = 0; i17 < 5; i17++) {
            com.tencent.stubs.logger.Log.println(4, "MicroMsg.AppBrand.WxaAttributes", strArr[i17]);
        }
    }

    public static void n(java.lang.String str) {
        if (!e(str) && k(str)) {
            h(str, true, null, null);
        }
    }

    public static void o(java.lang.String str) {
        if (e(str)) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new k91.p4(str));
    }
}
