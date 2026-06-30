package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoCodecInfo */
/* loaded from: classes15.dex */
public class C29886x94209fc9 {

    /* renamed from: H264_CONSTRAINED_BASELINE_3_1 */
    public static final java.lang.String f76038xc17c92cb = "42e01f";

    /* renamed from: H264_CONSTRAINED_HIGH_3_1 */
    public static final java.lang.String f76039x847feba8 = "640c1f";

    /* renamed from: H264_FMTP_LEVEL_ASYMMETRY_ALLOWED */
    public static final java.lang.String f76040x1a08be26 = "level-asymmetry-allowed";

    /* renamed from: H264_FMTP_PACKETIZATION_MODE */
    public static final java.lang.String f76041x62783f6b = "packetization-mode";

    /* renamed from: H264_FMTP_PROFILE_LEVEL_ID */
    public static final java.lang.String f76042x96175131 = "profile-level-id";

    /* renamed from: H264_LEVEL_3_1 */
    public static final java.lang.String f76043xe4997173 = "1f";

    /* renamed from: H264_PROFILE_CONSTRAINED_BASELINE */
    public static final java.lang.String f76044x7b7cf0db = "42e0";

    /* renamed from: H264_PROFILE_CONSTRAINED_HIGH */
    public static final java.lang.String f76045x7dbaab38 = "640c";

    /* renamed from: name */
    public final java.lang.String f76046x337a8b;

    /* renamed from: params */
    public final java.util.Map<java.lang.String, java.lang.String> f76047xc4aaf986;

    /* renamed from: payload */
    @java.lang.Deprecated
    public final int f76048xd11be18e;

    public C29886x94209fc9(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.f76048xd11be18e = 0;
        this.f76046x337a8b = str;
        this.f76047xc4aaf986 = map;
    }

    /* renamed from: equals */
    public boolean m156494xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.p3371xd0ce3e8d.C29886x94209fc9)) {
            return false;
        }
        org.p3371xd0ce3e8d.C29886x94209fc9 c29886x94209fc9 = (org.p3371xd0ce3e8d.C29886x94209fc9) obj;
        return this.f76046x337a8b.equalsIgnoreCase(c29886x94209fc9.f76046x337a8b) && this.f76047xc4aaf986.equals(c29886x94209fc9.f76047xc4aaf986);
    }

    /* renamed from: getName */
    public java.lang.String m156495xfb82e301() {
        return this.f76046x337a8b;
    }

    /* renamed from: getParams */
    public java.util.Map m156496x29c21c7c() {
        return this.f76047xc4aaf986;
    }

    /* renamed from: hashCode */
    public int m156497x8cdac1b() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f76046x337a8b.toUpperCase(java.util.Locale.ROOT), this.f76047xc4aaf986});
    }

    /* renamed from: toString */
    public java.lang.String m156498x9616526c() {
        return "VideoCodec{" + this.f76046x337a8b + " " + this.f76047xc4aaf986 + "}";
    }

    @java.lang.Deprecated
    public C29886x94209fc9(int i17, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.f76048xd11be18e = i17;
        this.f76046x337a8b = str;
        this.f76047xc4aaf986 = map;
    }
}
