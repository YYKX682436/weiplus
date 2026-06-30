package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.AssetWriterVideoEncoder */
/* loaded from: classes16.dex */
public interface InterfaceC25753x6af89f24 {

    /* renamed from: OUTPUT_VIDEO_MIME_TYPE */
    public static final java.lang.String f47906xa5588643 = "video/avc";

    /* renamed from: WRITER_FINISH */
    public static final long f47907x7c5d0ddf = -1;

    /* renamed from: createInputSurface */
    android.view.Surface mo72496x4310109f();

    /* renamed from: flush */
    void mo72497x5d03b04();

    /* renamed from: getEncodeFormat */
    android.media.MediaFormat mo72498x16f04c23();

    /* renamed from: getEncodePresentationTimeUs */
    long mo72499xaafb0031();

    /* renamed from: getEncodeSize */
    com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 mo72500xd0e54f2d();

    /* renamed from: isEncodeToEndOfStream */
    boolean mo72501xa79748b7();

    /* renamed from: isNeedVideoOutputTexture */
    boolean mo72502x5836851f();

    /* renamed from: prepare */
    boolean mo72503xed060d07(com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036, android.media.MediaFormat mediaFormat);

    /* renamed from: processVideoTexture */
    void mo72504x7423ac2f(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57);

    /* renamed from: release */
    void mo72505x41012807();

    /* renamed from: reset */
    void mo72506x6761d4f();

    /* renamed from: setMediaMuxer */
    void mo72507x8f07f4fb(com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc422);

    /* renamed from: setVideoSampleRenderContext */
    void mo72508xd49e03b6(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719);

    /* renamed from: signalEndOfInputStream */
    void mo72509x4cb1f740();

    /* renamed from: start */
    boolean mo72510x68ac462();

    /* renamed from: stop */
    void mo72511x360802();

    /* renamed from: writeVideoSample */
    boolean mo72512x3f75eca6(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14, boolean z17);
}
