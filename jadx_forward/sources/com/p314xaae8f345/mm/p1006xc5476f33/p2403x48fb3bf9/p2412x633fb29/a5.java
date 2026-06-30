package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public abstract class a5 {
    public static android.content.Intent a(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewShortcutManager", "buildIntent, install = %b", java.lang.Boolean.valueOf(z17));
        if (bitmap == null && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewShortcutManager", "no bmp");
            return null;
        }
        android.content.Intent intent = new android.content.Intent(z17 ? "com.android.launcher.action.INSTALL_SHORTCUT" : "com.android.launcher.action.UNINSTALL_SHORTCUT");
        intent.putExtra("android.intent.extra.shortcut.NAME", str2);
        intent.putExtra("duplicate", false);
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.action.WX_SHORTCUT");
        intent2.putExtra("type", 4);
        try {
            intent2.putExtra("ext_info", java.net.URLEncoder.encode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        intent2.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        intent2.addFlags(67108864);
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        if (bitmap != null) {
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
            intent.putExtra("shortcut_is_adaptive_icon", true);
        }
        return intent;
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z4 z4Var, boolean z17) {
        if (z4Var != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean(ya.b.f77504xbb80cbe3, z17);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.f) z4Var).f264098a.a(bundle);
        }
    }
}
