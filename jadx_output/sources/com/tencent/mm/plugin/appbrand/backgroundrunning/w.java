package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public enum w {
    /* JADX INFO: Fake field, exist only in values array */
    LOCATION(2, com.tencent.mm.R.string.f490072k4),
    /* JADX INFO: Fake field, exist only in values array */
    APPBRAND_VOIP(4, com.tencent.mm.R.string.f490075k7),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO_OF_VIDEO_BACKGROUND_PLAY(8, com.tencent.mm.R.string.f490069k1),
    /* JADX INFO: Fake field, exist only in values array */
    APPBRAND_VOIP_1v1(16, com.tencent.mm.R.string.f490075k7),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH(32, com.tencent.mm.R.string.f490070k2),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_BACKGROUND_PLAY(64, -1),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(65535, -1);


    /* renamed from: d, reason: collision with root package name */
    public final int f76997d;

    /* renamed from: e, reason: collision with root package name */
    public final int f76998e;

    w(int i17, int i18) {
        this.f76997d = i17;
        this.f76998e = i18;
    }

    public static java.lang.String a(java.util.List list) {
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() != 1) {
            return java.lang.String.format("%s %s", java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490073k5), java.lang.Integer.valueOf(list.size())), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490071k3));
        }
        return java.lang.String.format("%s %s", java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490074k6), ((com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) list.get(0)).f76925h), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490071k3));
    }

    public static boolean b(int i17, int i18) {
        return (i17 & i18) > 0;
    }
}
