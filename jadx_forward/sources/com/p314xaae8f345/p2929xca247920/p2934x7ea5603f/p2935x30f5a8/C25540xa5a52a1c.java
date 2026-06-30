package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.HostOpenPathDelegate */
/* loaded from: classes12.dex */
public class C25540xa5a52a1c {

    /* renamed from: logger */
    private static final com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 f46702xbe97f590 = com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25509x39e6a13a.m94647x23af1886("WVA.HostOpenPathDelegate");

    /* renamed from: mHostFds */
    private static final java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> f46703xdf950f80 = new java.util.HashMap();

    /* renamed from: addHostOpenPath */
    public static void m95578xfcd8de98(java.lang.String str, java.lang.String str2) {
        try {
            android.os.ParcelFileDescriptor open = android.os.ParcelFileDescriptor.open(new java.io.File(str2), 939524096);
            java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> map = f46703xdf950f80;
            if (map.containsKey(str)) {
                map.get(str).close();
            }
            map.put(str, open);
            f46702xbe97f590.mo46953x3164ae("addHostOpenPath key:" + str + " path:" + str2);
        } catch (java.lang.Exception e17) {
            f46702xbe97f590.mo46949x5c4d208("addHostOpenPath error", (java.lang.Throwable) e17);
        }
    }

    /* renamed from: getHostOpenFdsMap */
    public static java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> m95579x7c78514f() {
        return f46703xdf950f80;
    }
}
