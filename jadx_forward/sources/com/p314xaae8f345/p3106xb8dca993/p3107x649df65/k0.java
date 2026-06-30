package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final android.net.Uri f297135a = android.net.Uri.parse("content://cn.nubia.identity/identity");

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        java.lang.String str2 = null;
        try {
            android.content.ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f297135a);
            android.os.Bundle call = acquireUnstableContentProviderClient.call("getAAID", str, null);
            acquireUnstableContentProviderClient.close();
            if (call.getInt("code", -1) == 0) {
                str2 = call.getString(dm.i4.f66865x76d1ec5a);
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b("NubiaLog succeed:".concat(java.lang.String.valueOf(str2)));
            } else {
                str2 = call.getString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b("NubiaLog failed:".concat(java.lang.String.valueOf(str2)));
            }
        } catch (java.lang.Exception unused) {
        }
        return str2;
    }

    public static java.lang.String b(android.content.Context context) {
        java.lang.String str = null;
        try {
            android.content.ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f297135a);
            android.os.Bundle call = acquireUnstableContentProviderClient.call(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b, null, null);
            acquireUnstableContentProviderClient.close();
            if (call.getInt("code", -1) == 0) {
                str = call.getString(dm.i4.f66865x76d1ec5a);
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b("NubiaLog succeed:".concat(java.lang.String.valueOf(str)));
            } else {
                str = call.getString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b("NubiaLog failed:".concat(java.lang.String.valueOf(str)));
            }
        } catch (java.lang.Exception unused) {
        }
        return str;
    }

    public static boolean a(android.content.Context context) {
        android.os.Bundle call;
        try {
            android.content.ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f297135a);
            call = acquireUnstableContentProviderClient.call("isSupport", null, null);
            acquireUnstableContentProviderClient.close();
        } catch (java.lang.Exception unused) {
        }
        if (call.getInt("code", -1) == 0) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b("NubiaLog succeed");
            return call.getBoolean("issupport", true);
        }
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b("NubiaLog failed:" + call.getString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7));
        return false;
    }
}
