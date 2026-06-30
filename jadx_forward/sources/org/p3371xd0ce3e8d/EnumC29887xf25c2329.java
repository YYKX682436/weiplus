package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoCodecMimeType */
/* loaded from: classes16.dex */
enum EnumC29887xf25c2329 {
    VP8("video/x-vnd.on2.vp8"),
    VP9("video/x-vnd.on2.vp9"),
    H264("video/avc"),
    AV1("video/av01");


    /* renamed from: mimeType */
    private final java.lang.String f76051xad05ed8e;

    EnumC29887xf25c2329(java.lang.String str) {
        this.f76051xad05ed8e = str;
    }

    /* renamed from: fromSdpCodecName */
    public static org.p3371xd0ce3e8d.EnumC29887xf25c2329 m156500x1d43fb0c(java.lang.String str) {
        return str.equals("AV1X") ? AV1 : m156501xdce0328(str);
    }

    /* renamed from: mimeType */
    public java.lang.String m156503xad05ed8e() {
        return this.f76051xad05ed8e;
    }

    /* renamed from: toSdpCodecName */
    public java.lang.String m156504x7fcb405d() {
        return this == AV1 ? "AV1X" : name();
    }
}
