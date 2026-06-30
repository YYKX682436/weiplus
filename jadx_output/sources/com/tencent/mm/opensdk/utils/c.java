package com.tencent.mm.opensdk.utils;

/* loaded from: classes6.dex */
public final class c {

    /* loaded from: classes8.dex */
    public static final class a {
        public static java.lang.Object a(int i17, java.lang.String str) {
            try {
                switch (i17) {
                    case 1:
                        return java.lang.Integer.valueOf(str);
                    case 2:
                        return java.lang.Long.valueOf(str);
                    case 3:
                        return str;
                    case 4:
                        return java.lang.Boolean.valueOf(str);
                    case 5:
                        return java.lang.Float.valueOf(str);
                    case 6:
                        return java.lang.Double.valueOf(str);
                    default:
                        com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                        return null;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + e17.getMessage());
                return null;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = android.net.Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref");
    }
}
