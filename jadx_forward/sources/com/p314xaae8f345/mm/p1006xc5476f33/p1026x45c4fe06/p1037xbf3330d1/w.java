package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* loaded from: classes7.dex */
public enum w {
    /* JADX INFO: Fake field, exist only in values array */
    LOCATION(2, com.p314xaae8f345.mm.R.C30867xcad56011.f571605k4),
    /* JADX INFO: Fake field, exist only in values array */
    APPBRAND_VOIP(4, com.p314xaae8f345.mm.R.C30867xcad56011.f571608k7),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO_OF_VIDEO_BACKGROUND_PLAY(8, com.p314xaae8f345.mm.R.C30867xcad56011.f571602k1),
    /* JADX INFO: Fake field, exist only in values array */
    APPBRAND_VOIP_1v1(16, com.p314xaae8f345.mm.R.C30867xcad56011.f571608k7),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH(32, com.p314xaae8f345.mm.R.C30867xcad56011.f571603k2),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_BACKGROUND_PLAY(64, -1),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(65535, -1);


    /* renamed from: d, reason: collision with root package name */
    public final int f158530d;

    /* renamed from: e, reason: collision with root package name */
    public final int f158531e;

    w(int i17, int i18) {
        this.f158530d = i17;
        this.f158531e = i18;
    }

    public static java.lang.String a(java.util.List list) {
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() != 1) {
            return java.lang.String.format("%s %s", java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571606k5), java.lang.Integer.valueOf(list.size())), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571604k3));
        }
        return java.lang.String.format("%s %s", java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571607k6), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6) list.get(0)).f158458h), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571604k3));
    }

    public static boolean b(int i17, int i18) {
        return (i17 & i18) > 0;
    }
}
