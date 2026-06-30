package e04;

/* loaded from: classes.dex */
public final class i2 implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        java.lang.String str2;
        if (strArr != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//scan", strArr[0]) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("showDebug", strArr[1]) && strArr.length > 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("ScanDebug").putBoolean("scan_debug_show_debug_view", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0) == 1);
            return true;
        }
        if (strArr != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//scan", strArr[0]) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("clearSearch", strArr[1]) && strArr.length > 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c01.z1.r() + "__image_gallery_search_preview_slot_mmkv_key__");
            if (M != null) {
                M.d();
            }
            return true;
        }
        if (strArr != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//scan", strArr[0]) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("clearConfig", strArr[1]) && strArr.length > 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c01.z1.r() + "_scan_config_mmkv");
            if (M2 != null) {
                M2.d();
            }
            return true;
        }
        if (strArr != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//scan", strArr[0]) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("loadLocalSo", strArr[1]) && strArr.length > 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("ScanDebug").putBoolean("loadSoFromSDCard", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0) == 1);
            db5.t7.m123883x26a183b(context, ya.b.f77504xbb80cbe3, 0).show();
            return true;
        }
        if (strArr != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//scan", strArr[0]) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("loadLocalConfig", strArr[1]) && strArr.length > 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("ScanDebug");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(strArr[2], "null")) {
                R.putString("debugFFEngineConfig", "");
                db5.t7.m123883x26a183b(context, "cancel success", 0).show();
                return true;
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(strArr[2])) {
                R.putString("debugFFEngineConfig", com.p314xaae8f345.mm.vfs.w6.M(strArr[2]));
                db5.t7.m123883x26a183b(context, ya.b.f77504xbb80cbe3, 0).show();
                return true;
            }
            db5.t7.m123883x26a183b(context, "config file not exist", 0).show();
            R.getClass();
            return false;
        }
        if (strArr != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//scan", strArr[0]) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("skipFrame", strArr[1]) && strArr.length >= 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("ScanDebug").putInt("skipFrame", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
            db5.t7.m123883x26a183b(context, ya.b.f77504xbb80cbe3, 0).show();
            return true;
        }
        if (strArr != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//scan", strArr[0]) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("serverDetect", strArr[1]) && strArr.length >= 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("ScanDebug").putBoolean("serverDetect", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0) == 1);
            db5.t7.m123883x26a183b(context, ya.b.f77504xbb80cbe3, 0).show();
            return true;
        }
        if (strArr != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//scan", strArr[0]) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("localDetect", strArr[1]) && strArr.length >= 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("ScanDebug").putBoolean("localDetect", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 1) == 1);
            db5.t7.m123883x26a183b(context, ya.b.f77504xbb80cbe3, 0).show();
            return true;
        }
        if (strArr != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//scan", strArr[0]) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("disableMerge", strArr[1]) && strArr.length >= 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("ScanDebug").putBoolean("disableMerge", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0) == 1);
            db5.t7.m123883x26a183b(context, ya.b.f77504xbb80cbe3, 0).show();
            return true;
        }
        if (strArr != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//scan", strArr[0]) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("xnet", strArr[1]) && strArr.length >= 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("ScanDebug").putBoolean("useXNet", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0) == 1);
            db5.t7.m123883x26a183b(context, ya.b.f77504xbb80cbe3, 0).show();
            return true;
        }
        if (strArr == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//scan", strArr[0]) || strArr.length < 2 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("dump", strArr[1])) {
            return false;
        }
        zs5.j0 j0Var = zs5.j0.P;
        java.lang.String str3 = "扫码\n" + zs5.j0.P.c() + "\n\n图片识别\n" + zs5.j0.Q.c();
        if (context == null || (str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr)) == null) {
            str2 = "";
        }
        db5.e1.y(context, str3, "", str2, new e04.h2(context, str3));
        return true;
    }
}
