package com.tencent.mm.opensdk.utils;

/* loaded from: classes8.dex */
public final class a {
    public static int a(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            return -1;
        }
        try {
            return bundle.getInt(str, -1);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e("MicroMsg.IntentUtil", "getIntExtra exception:" + e17.getMessage());
            return -1;
        }
    }

    public static java.lang.String b(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e("MicroMsg.IntentUtil", "getStringExtra exception:" + e17.getMessage());
            return null;
        }
    }
}
