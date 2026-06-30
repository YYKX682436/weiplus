package com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1;

/* loaded from: classes8.dex */
public final class a {
    public static int a(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            return -1;
        }
        try {
            return bundle.getInt(str, -1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.IntentUtil", "getIntExtra exception:" + e17.getMessage());
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
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.IntentUtil", "getStringExtra exception:" + e17.getMessage());
            return null;
        }
    }
}
