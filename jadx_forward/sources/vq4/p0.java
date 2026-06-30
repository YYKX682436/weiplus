package vq4;

/* loaded from: classes14.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static r45.n27 f520907a;

    static {
        new java.lang.StringBuilder("VERSION.RELEASE:[").append(android.os.Build.VERSION.RELEASE);
        new java.lang.StringBuilder("] VERSION.CODENAME:[").append(android.os.Build.VERSION.CODENAME);
        new java.lang.StringBuilder("] VERSION.INCREMENTAL:[").append(android.os.Build.VERSION.INCREMENTAL);
        new java.lang.StringBuilder("] BOARD:[").append(android.os.Build.BOARD);
        new java.lang.StringBuilder("] DEVICE:[").append(android.os.Build.DEVICE);
        new java.lang.StringBuilder("] DISPLAY:[").append(android.os.Build.DISPLAY);
        new java.lang.StringBuilder("] FINGERPRINT:[").append(android.os.Build.FINGERPRINT);
        new java.lang.StringBuilder("] HOST:[").append(android.os.Build.HOST);
        new java.lang.StringBuilder("] MANUFACTURER:[").append(android.os.Build.MANUFACTURER);
        "] MODEL:[".concat(wo.w0.m());
        new java.lang.StringBuilder("] PRODUCT:[").append(android.os.Build.PRODUCT);
        new java.lang.StringBuilder("] TAGS:[").append(android.os.Build.TAGS);
        new java.lang.StringBuilder("] TYPE:[").append(android.os.Build.TYPE);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("] USER:[");
        sb6.append(android.os.Build.USER);
        sb6.append("]");
        android.net.Uri.parse("content://com.lbe.security.miui.permmgr/active");
    }

    public static android.app.Notification a(z2.k0 k0Var) {
        return fp.h.a(16) ? k0Var.b() : k0Var.b();
    }

    public static r45.n27 b() {
        if (f520907a == null) {
            r45.n27 n27Var = new r45.n27();
            f520907a = n27Var;
            n27Var.f462566d = android.os.Build.MANUFACTURER;
            f520907a.f462567e = wo.w0.m();
            f520907a.f462568f = android.os.Build.VERSION.RELEASE;
            f520907a.f462569g = android.os.Build.VERSION.INCREMENTAL;
            f520907a.f462570h = wo.r.a();
            f520907a.f462572m = new java.util.LinkedList();
            int i17 = 0;
            for (android.media.MediaCodecInfo mediaCodecInfo : new android.media.MediaCodecList(0).getCodecInfos()) {
                java.lang.String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                for (int i18 = 0; i18 < supportedTypes.length; i18++) {
                    if (supportedTypes[i18].startsWith("video/")) {
                        r45.ev3 ev3Var = new r45.ev3();
                        ev3Var.f455274d = mediaCodecInfo.getName();
                        ev3Var.f455275e = supportedTypes[i18];
                        f520907a.f462572m.add(ev3Var);
                        i17++;
                    }
                }
            }
            f520907a.f462571i = i17;
        }
        return f520907a;
    }

    public static boolean c() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5251xa8af0150 c5251xa8af0150 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5251xa8af0150();
        c5251xa8af0150.e();
        return c5251xa8af0150.f135584g.f89129a;
    }

    public static boolean d() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        c6231x4f3054ba.f136478g.f89948b = 2;
        c6231x4f3054ba.e();
        return c6231x4f3054ba.f136479h.f90034b;
    }
}
