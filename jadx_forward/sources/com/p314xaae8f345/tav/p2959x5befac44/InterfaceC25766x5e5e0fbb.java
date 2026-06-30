package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.IDecoder */
/* loaded from: classes16.dex */
public interface InterfaceC25766x5e5e0fbb {

    /* renamed from: SAMPLE_STATE_ERROR */
    public static final long f48100x6792c985 = -3;

    /* renamed from: SAMPLE_STATE_FAILED */
    public static final long f48101x8b878c40 = -2;

    /* renamed from: SAMPLE_STATE_FINISH */
    public static final long f48102x8bfa8496 = -1;

    /* renamed from: SAMPLE_STATE_TIMEOUT */
    public static final long f48103xd7dd559e = -4;

    /* renamed from: SAMPLE_STATE_UN_START */
    public static final long f48104xb3ac325f = -100;

    /* renamed from: com.tencent.tav.decoder.IDecoder$DecodeType */
    /* loaded from: classes16.dex */
    public enum DecodeType {
        Video,
        Audio
    }

    /* renamed from: getDecodePerformance */
    com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo97357xc291ccac();

    /* renamed from: getSourcePath */
    java.lang.String mo97358xabff72d6();

    /* renamed from: hasTrack */
    boolean mo97359x7c8fed1();

    /* renamed from: outputBuffer */
    java.nio.ByteBuffer mo97362xdb4114a1();

    /* renamed from: readSample */
    com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d mo97363xe121b2e0();

    /* renamed from: readSample */
    com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d mo97364xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57);

    /* renamed from: release */
    void mo97365x41012807();

    /* renamed from: seekTo */
    void mo97367xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57);

    /* renamed from: setLogger */
    void mo97368x16e44c92(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1);

    /* renamed from: start */
    void mo97369x68ac462(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26);

    /* renamed from: start */
    void mo97370x68ac462(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57);
}
