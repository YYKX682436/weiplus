package com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016;

/* renamed from: com.tencent.liteav.extensions.codec.HardwareAacEncoder */
/* loaded from: classes13.dex */
public class C3792x53359f81 {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016.C3790x8dc61fbe f128013a = new com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016.C3790x8dc61fbe(com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016.C3790x8dc61fbe.a.f128009a);

    /* renamed from: encode */
    public java.nio.ByteBuffer m29720xb2963e16(java.nio.ByteBuffer byteBuffer) {
        return this.f128013a.m29711x756f483e(byteBuffer);
    }

    /* renamed from: init */
    public boolean m29721x316510(int i17, int i18, int i19) {
        android.media.MediaFormat createAudioFormat = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", i17, i18);
        createAudioFormat.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, i19);
        createAudioFormat.setInteger("aac-profile", 2);
        return this.f128013a.a(createAudioFormat);
    }

    /* renamed from: unInit */
    public void m29722xcdd7f349() {
        this.f128013a.a();
    }
}
