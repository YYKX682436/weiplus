package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public abstract class b0 {
    public static boolean a(android.widget.ImageView imageView, r45.dp0 dp0Var, float f17) {
        if (dp0Var == null || dp0Var.f372638h != 1 || android.text.TextUtils.isEmpty(dp0Var.f372634d)) {
            return false;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, dp0Var.f372634d, f17);
        return true;
    }

    public static boolean b(r45.dp0 dp0Var) {
        if (dp0Var == null) {
            return false;
        }
        return dp0Var.f372638h == 3 || dp0Var.f372642o == 1;
    }

    public static java.util.HashMap c(o72.r2 r2Var) {
        r45.dp0 dp0Var = r2Var.field_favProto.I;
        r45.gp0 J2 = o72.x1.J(r2Var);
        java.lang.String format = java.lang.String.format("file://%s", o72.x1.X(J2));
        if (!com.tencent.mm.vfs.w6.j(format)) {
            format = java.lang.String.format("file://%s", o72.x1.x(J2));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("desc", r2Var.field_favProto.f370972q);
        hashMap.put("type", 2);
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, r2Var.field_favProto.f370972q);
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, dp0Var.f372635e);
        hashMap.put("pkg_type", java.lang.Integer.valueOf(dp0Var.f372636f));
        hashMap.put("pkg_version", java.lang.Integer.valueOf(dp0Var.f372641n));
        hashMap.put("img_url", format);
        hashMap.put("is_dynamic", java.lang.Boolean.FALSE);
        hashMap.put("cache_key", "");
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, dp0Var.f372639i);
        hashMap.put("subType", java.lang.Integer.valueOf(dp0Var.f372645r));
        com.tencent.mars.xlog.Log.i("MicroMsg.FavAppBrandLogic", "buildAppBrandMsgParamsForIntent image path:%s", format);
        return hashMap;
    }
}
