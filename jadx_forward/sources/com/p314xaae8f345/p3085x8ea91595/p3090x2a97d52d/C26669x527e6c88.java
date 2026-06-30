package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.DownloadSetting */
/* loaded from: classes13.dex */
public class C26669x527e6c88 {

    /* renamed from: ISDOWNLOADWIFIONLY */
    public static final java.lang.String f56122xcb5a51f3 = "isDownloadWifiOnly";

    /* renamed from: ISTASKAUTORESUME */
    public static final java.lang.String f56123x788dd58b = "isTaskAutoResume";

    /* renamed from: MAXTASKNUM */
    public static final java.lang.String f56124xa409f9fd = "maxTaskNum";
    private static final java.lang.String TAG = "DownloadSetting";

    /* renamed from: TYPE_BOOLEAN */
    public static final java.lang.String f56125x52684c03 = "boolean";

    /* renamed from: TYPE_INTEGER */
    public static final java.lang.String f56126xc3426119 = "Integer";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88 f56127x46143c22;

    /* renamed from: isTaskAutoResume */
    protected boolean f56129x6caf89eb = true;

    /* renamed from: isDownloadWifiOnly */
    protected boolean f56128x34069253 = false;

    /* renamed from: maxTaskNum */
    protected int f56130xea582dbd = 5;

    public C26669x527e6c88() {
        m104917xdcd6ca2e();
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88 m104915x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88 c26669x527e6c88;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.class) {
            if (f56127x46143c22 == null) {
                f56127x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88();
            }
            c26669x527e6c88 = f56127x46143c22;
        }
        return c26669x527e6c88;
    }

    /* renamed from: getSplitSizeInBytes */
    public static int m104916xd81af701(java.lang.String str) {
        if (str.equalsIgnoreCase("WIFI")) {
            throw new java.lang.UnsupportedOperationException("Split is not allowed in current version. netType: ".concat(str));
        }
        return (!str.contains("net") && str.contains("wap")) ? com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56205xe103064f : com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56204xe102e506;
    }

    /* renamed from: loadFromDB */
    private void m104917xdcd6ca2e() {
        java.util.HashMap<java.lang.String, java.lang.String> m105453x66f18c8 = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26771xc4857426.m105453x66f18c8();
        java.lang.String str = m105453x66f18c8.get(f56123x788dd58b);
        if (str != null && str.length() > 0) {
            this.f56129x6caf89eb = !str.equals("false");
        }
        java.lang.String str2 = m105453x66f18c8.get(f56122xcb5a51f3);
        if (str2 != null && str2.length() > 0) {
            this.f56128x34069253 = !str2.equals("false");
        }
        java.lang.String str3 = m105453x66f18c8.get(f56124xa409f9fd);
        if (str3 == null || str3.length() <= 0) {
            return;
        }
        this.f56130xea582dbd = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, 0);
    }

    /* renamed from: getIsDownloadWifiOnly */
    public boolean m104918x4762f449() {
        return this.f56128x34069253;
    }

    /* renamed from: getIsTaskAutoResume */
    public boolean m104919x1487f161() {
        return this.f56129x6caf89eb;
    }

    /* renamed from: getMaxTaskNum */
    public int m104920xd898e5b3() {
        return this.f56130xea582dbd;
    }

    /* renamed from: isAutoDownload */
    public boolean m104921x1d5cdda1() {
        if (!this.f56129x6caf89eb) {
            return false;
        }
        java.lang.String m104885x3d316d39 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104885x3d316d39();
        return m104885x3d316d39.contains("wifi") || m104885x3d316d39.contains("net");
    }

    /* renamed from: setIsDownloadWifiOnly */
    public void m104923xde8e7655(boolean z17) {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88 c26669x527e6c88 = f56127x46143c22;
        if (c26669x527e6c88.f56128x34069253 == z17) {
            return;
        }
        c26669x527e6c88.f56128x34069253 = z17;
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26771xc4857426.m105454x35c17d(f56122xcb5a51f3, java.lang.String.valueOf(z17), f56125x52684c03);
    }

    /* renamed from: setIsTaskAutoResume */
    public void m104924xb884866d(boolean z17) {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88 c26669x527e6c88 = f56127x46143c22;
        if (c26669x527e6c88.f56129x6caf89eb == z17) {
            return;
        }
        c26669x527e6c88.f56129x6caf89eb = z17;
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26771xc4857426.m105454x35c17d(f56123x788dd58b, java.lang.String.valueOf(z17), f56125x52684c03);
    }

    /* renamed from: setMaxTaskNum */
    public void m104925x6bd33bf(int i17) {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88 c26669x527e6c88 = f56127x46143c22;
        if (c26669x527e6c88.f56130xea582dbd == i17) {
            return;
        }
        c26669x527e6c88.f56130xea582dbd = i17;
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26771xc4857426.m105454x35c17d(f56124xa409f9fd, java.lang.String.valueOf(i17), f56126xc3426119);
    }

    /* renamed from: isAutoDownload */
    public boolean m104922x1d5cdda1(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "downloadInfoNetType = " + str);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "currentNetType = " + str2);
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (str2.equalsIgnoreCase("WIFI")) {
            return true;
        }
        return str2.contains("net") && !str.equalsIgnoreCase("WIFI");
    }
}
