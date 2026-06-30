package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.H264Utils */
/* loaded from: classes15.dex */
class C29785x836a9c69 {

    /* renamed from: DEFAULT_H264_BASELINE_PROFILE_CODEC */
    public static org.p3371xd0ce3e8d.C29886x94209fc9 f75423x3d13f91f = new org.p3371xd0ce3e8d.C29886x94209fc9("H264", m155565xcf5f2519(false));

    /* renamed from: DEFAULT_H264_HIGH_PROFILE_CODEC */
    public static org.p3371xd0ce3e8d.C29886x94209fc9 f75424x8664263c = new org.p3371xd0ce3e8d.C29886x94209fc9("H264", m155565xcf5f2519(true));

    /* renamed from: H264_CONSTRAINED_BASELINE_3_1 */
    public static final java.lang.String f75425xc17c92cb = "42e01f";

    /* renamed from: H264_CONSTRAINED_HIGH_3_1 */
    public static final java.lang.String f75426x847feba8 = "640c1f";

    /* renamed from: H264_FMTP_LEVEL_ASYMMETRY_ALLOWED */
    public static final java.lang.String f75427x1a08be26 = "level-asymmetry-allowed";

    /* renamed from: H264_FMTP_PACKETIZATION_MODE */
    public static final java.lang.String f75428x62783f6b = "packetization-mode";

    /* renamed from: H264_FMTP_PROFILE_LEVEL_ID */
    public static final java.lang.String f75429x96175131 = "profile-level-id";

    /* renamed from: H264_LEVEL_3_1 */
    public static final java.lang.String f75430xe4997173 = "1f";

    /* renamed from: H264_PROFILE_CONSTRAINED_BASELINE */
    public static final java.lang.String f75431x7b7cf0db = "42e0";

    /* renamed from: H264_PROFILE_CONSTRAINED_HIGH */
    public static final java.lang.String f75432x7dbaab38 = "640c";

    /* renamed from: getDefaultH264Params */
    public static java.util.Map<java.lang.String, java.lang.String> m155565xcf5f2519(boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("level-asymmetry-allowed", "1");
        hashMap.put("packetization-mode", "1");
        hashMap.put("profile-level-id", z17 ? "640c1f" : "42e01f");
        return hashMap;
    }

    /* renamed from: isSameH264Profile */
    public static boolean m155566xffdd9cb1(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        return m155567xd564dd5a(map, map2);
    }

    /* renamed from: nativeIsSameH264Profile */
    private static native boolean m155567xd564dd5a(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2);
}
