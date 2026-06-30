package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AssetExportSession */
/* loaded from: classes10.dex */
public class C25655x2c777b52 {
    public static final java.lang.String TAG = "AssetExportSession";

    /* renamed from: appliesPreferredTrackTransform */
    boolean f47148xa9a60b16;

    /* renamed from: asset */
    com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 f47149x58ceaf0;

    /* renamed from: assetExtension */
    com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f f47150xf1239f2f;

    /* renamed from: audioMix */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 f47151x3a2afaa6;

    /* renamed from: calculateBfsTransform */
    boolean f47152xb35f5203;

    /* renamed from: exportConfig */
    private final com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 f47153xb154ec16;

    /* renamed from: exportErrorStatus */
    com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 f47154x9f92e3c6;

    /* renamed from: exportThread */
    private com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce f47155xcdf676de;

    /* renamed from: isEnableNewTextureBlitting */
    private boolean f47156x3527020b;

    /* renamed from: isEnableOptimizedVideoFrameSampling */
    private boolean f47157x9c45adb3;

    /* renamed from: isNeedCheckFrameProcessTimeout */
    private boolean f47158x5097cd97;

    /* renamed from: loggerConfig */
    private com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 f47159xc231f8f2;

    /* renamed from: maxTimeoutMs */
    private long f47160xae3bcde3;

    /* renamed from: mediaFactory */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25652xcd3d9f6f f47161xc0157086;

    /* renamed from: metadata */
    private java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> f47162xe52d7b2f;

    /* renamed from: outputFilePath */
    java.lang.String f47163x3e2d9be2;

    /* renamed from: outputFileType */
    java.lang.String f47164x3e2fc6f7;

    /* renamed from: presetName */
    private java.lang.String f47165x58bf4a0a;

    /* renamed from: processErrorStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 f47166x4de8662b;

    /* renamed from: progress */
    float f47167xc454c22d;

    /* renamed from: renderContextParams */
    private com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff f47168x16878e1f;

    /* renamed from: revertMode */
    private boolean f47169xd16405a7;

    /* renamed from: status */
    com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus f47170xcacdcff2;

    /* renamed from: supportedFileTypes */
    private java.util.List<java.lang.String> f47171x204c2f4f;

    /* renamed from: timeRange */
    com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47172x16fae70;

    /* renamed from: timeoutInterruptWork */
    private boolean f47173x734ee833;

    /* renamed from: videoCompositing */
    com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 f47174xaffe9209;

    /* renamed from: videoComposition */
    com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f f47175xaffe922f;

    /* renamed from: com.tencent.tav.core.AssetExportSession$AssetExportSessionStatus */
    /* loaded from: classes10.dex */
    public enum AssetExportSessionStatus {
        AssetExportSessionStatusUnknown,
        AssetExportSessionStatusExporting,
        AssetExportSessionStatusCompleted,
        AssetExportSessionStatusFailed,
        AssetExportSessionStatusCancelled,
        AssetExportSessionStatusTimeout
    }

    /* renamed from: com.tencent.tav.core.AssetExportSession$ExportCallbackHandler */
    /* loaded from: classes16.dex */
    public interface ExportCallbackHandler {
        /* renamed from: handlerCallback */
        void mo96356xc562f1af(com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b52);
    }

    @java.lang.Deprecated
    public C25655x2c777b52(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.OutputConfig outputConfig) {
        this(abstractC25633x3c9fad0, new com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036(outputConfig), new com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47245x96f5d2e7));
    }

    /* renamed from: cancelExport */
    public void m96313x7be5eace() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("AssetExportSession", "cancelExport");
        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce handlerThreadC25656x34da0dce = this.f47155xcdf676de;
        if (handlerThreadC25656x34da0dce != null) {
            handlerThreadC25656x34da0dce.m96413xae7a2e7a();
        }
    }

    /* renamed from: exportAsynchronouslyWithCompletionHandler */
    public void m96314xae405e7f(com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.ExportCallbackHandler exportCallbackHandler) {
        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce handlerThreadC25656x34da0dce = new com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce(this, exportCallbackHandler, this.f47151x3a2afaa6, this.f47153xb154ec16);
        this.f47155xcdf676de = handlerThreadC25656x34da0dce;
        handlerThreadC25656x34da0dce.m96417xbcfc2a5d(this.f47168x16878e1f);
        this.f47155xcdf676de.m96416x5750fe08(this.f47161xc0157086);
        this.f47155xcdf676de.m96418xa1d0ffca(this.f47158x5097cd97, this.f47173x734ee833, this.f47160xae3bcde3);
        this.f47155xcdf676de.m96415x596d8674(this.f47159xc231f8f2);
        this.f47155xcdf676de.m96419x791872b6();
    }

    /* renamed from: getAsset */
    public com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 m96315x742a913a() {
        return this.f47149x58ceaf0;
    }

    /* renamed from: getAudioMix */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 m96316xb605381c() {
        return this.f47151x3a2afaa6;
    }

    /* renamed from: getErrCode */
    public int m96317xe591acbc() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6 = this.f47154x9f92e3c6;
        if (c25680x8a5723a6 != null) {
            return c25680x8a5723a6.f47510x2eaded;
        }
        return 0;
    }

    /* renamed from: getExportConfig */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 m96318x12477e8c() {
        return this.f47153xb154ec16;
    }

    /* renamed from: getExportErrorStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96319xf2c76b10() {
        return this.f47154x9f92e3c6;
    }

    /* renamed from: getMetadata */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> m96320x6107b8a5() {
        return this.f47162xe52d7b2f;
    }

    /* renamed from: getOutputFilePath */
    public java.lang.String m96321x2cc568d8() {
        return this.f47163x3e2d9be2;
    }

    /* renamed from: getOutputFileType */
    public java.lang.String m96322x2cc793ed() {
        return this.f47164x3e2fc6f7;
    }

    /* renamed from: getPresetName */
    public java.lang.String m96323x47000200() {
        return this.f47165x58bf4a0a;
    }

    /* renamed from: getProgress */
    public float m96324x402effa3() {
        return this.f47167xc454c22d;
    }

    /* renamed from: getRenderContextParams */
    public com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff m96325x6eb76ae9() {
        return this.f47168x16878e1f;
    }

    /* renamed from: getReportSession */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e m96326xfebfff0c() {
        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce handlerThreadC25656x34da0dce = this.f47155xcdf676de;
        if (handlerThreadC25656x34da0dce != null) {
            return handlerThreadC25656x34da0dce.m96414xfebfff0c();
        }
        return null;
    }

    /* renamed from: getStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus m96327x2fe4f2e8() {
        return this.f47170xcacdcff2;
    }

    /* renamed from: getSupportedFileTypes */
    public java.util.List<java.lang.String> m96328x33a89145() {
        return this.f47171x204c2f4f;
    }

    /* renamed from: getThrowable */
    public java.lang.Throwable m96329xb494ca8a() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6 = this.f47154x9f92e3c6;
        if (c25680x8a5723a6 != null) {
            return c25680x8a5723a6.f47512xb5275940;
        }
        return null;
    }

    /* renamed from: getTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m96330xdd1fba() {
        return this.f47172x16fae70;
    }

    /* renamed from: getVideoComposition */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f m96331x57d6f9a5() {
        return this.f47175xaffe922f;
    }

    /* renamed from: isEnableNewTextureBlitting */
    public boolean m96332x3527020b() {
        return this.f47156x3527020b;
    }

    /* renamed from: isEnableOptimizedVideoFrameSampling */
    public boolean m96333x9c45adb3() {
        return this.f47157x9c45adb3;
    }

    /* renamed from: isRevertMode */
    public boolean m96334x52cf0271() {
        return this.f47169xd16405a7;
    }

    /* renamed from: release */
    public void m96335x41012807() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 c25671x3e055ec6 = this.f47151x3a2afaa6;
        if (c25671x3e055ec6 != null) {
            c25671x3e055ec6.m96686x41012807();
            this.f47151x3a2afaa6 = null;
        }
    }

    /* renamed from: setAppliesPreferredTrackTransform */
    public void m96336x507dfc18(boolean z17) {
        this.f47148xa9a60b16 = z17;
    }

    /* renamed from: setAudioMix */
    public void m96337xb0bd9928(com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 c25671x3e055ec6) {
        this.f47151x3a2afaa6 = c25671x3e055ec6;
    }

    /* renamed from: setCalculateBfsTransform */
    public void m96338x8f1dd6c1(boolean z17) {
        this.f47152xb35f5203 = z17;
    }

    /* renamed from: setEnableNewTextureBlitting */
    public void m96339x715c8943(boolean z17) {
        this.f47156x3527020b = z17;
    }

    /* renamed from: setEnableOptimizedVideoFrameSampling */
    public void m96340x7668c57b(boolean z17) {
        this.f47157x9c45adb3 = z17;
    }

    @java.lang.Deprecated
    /* renamed from: setEncoderFactory */
    public void m96341x2851c150(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25768xd59ba4f7 interfaceC25768xd59ba4f7) {
        this.f47161xc0157086 = new com.p314xaae8f345.tav.p2946x5a71016.C25649x2dc0947(interfaceC25768xd59ba4f7, null);
    }

    /* renamed from: setLoggerConfig */
    public void m96342x596d8674(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 c25800x8b670e73) {
        this.f47159xc231f8f2 = c25800x8b670e73;
    }

    /* renamed from: setMediaFactory */
    public void m96343x5750fe08(com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25652xcd3d9f6f interfaceC25652xcd3d9f6f) {
        this.f47161xc0157086 = interfaceC25652xcd3d9f6f;
    }

    /* renamed from: setMetadata */
    public void m96344x5bc019b1(java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> list) {
        this.f47162xe52d7b2f = list;
    }

    /* renamed from: setOutputFilePath */
    public void m96345xf4bbd0e4(java.lang.String str) {
        this.f47163x3e2d9be2 = str;
    }

    /* renamed from: setOutputFileType */
    public void m96346xf4bdfbf9(java.lang.String str) {
        this.f47164x3e2fc6f7 = str;
    }

    /* renamed from: setRenderContextParams */
    public void m96347xbcfc2a5d(com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff c25780x613b55ff) {
        this.f47168x16878e1f = c25780x613b55ff;
        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce handlerThreadC25656x34da0dce = this.f47155xcdf676de;
        if (handlerThreadC25656x34da0dce != null) {
            handlerThreadC25656x34da0dce.m96417xbcfc2a5d(c25780x613b55ff);
        }
    }

    /* renamed from: setRevertMode */
    public void m96348xedc90ba9(boolean z17) {
        this.f47169xd16405a7 = z17;
    }

    /* renamed from: setTimeRange */
    public void m96349x5d30e02e(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47172x16fae70 = c25738xead39d26;
    }

    /* renamed from: setTimeoutParameter */
    public void m96350xa1d0ffca(boolean z17, boolean z18, long j17) {
        this.f47158x5097cd97 = z17;
        this.f47173x734ee833 = z18;
        this.f47160xae3bcde3 = j17;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("AssetExportSession", "setNeedCheckFrameProcessTimeout:%b timeoutInterruptWork:%b timeoutMs:%d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(j17));
    }

    /* renamed from: setVideoComposition */
    public void m96351xfbd38eb1(com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f) {
        this.f47175xaffe922f = c25706x7dc2d64f;
        if (c25706x7dc2d64f != null) {
            this.f47174xaffe9209 = c25706x7dc2d64f.mo96924x35bb4175();
        }
    }

    public C25655x2c777b52(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0, com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036) {
        this(abstractC25633x3c9fad0, c25679xbb204036, new com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47245x96f5d2e7));
    }

    public C25655x2c777b52(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0, com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036, com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f c25657xb56a6b4f) {
        this.f47164x3e2fc6f7 = "mp4";
        this.f47169xd16405a7 = false;
        this.f47157x9c45adb3 = false;
        this.f47156x3527020b = false;
        this.f47158x5097cd97 = true;
        this.f47173x734ee833 = false;
        this.f47160xae3bcde3 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        this.f47159xc231f8f2 = com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1.INSTANCE.m97817x2dcd4331();
        this.f47148xa9a60b16 = false;
        this.f47152xb35f5203 = false;
        this.f47149x58ceaf0 = abstractC25633x3c9fad0;
        this.f47150xf1239f2f = c25657xb56a6b4f;
        if (c25679xbb204036 == null || !c25679xbb204036.m96730xd4418ac9()) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e("AssetExportSession", "AssetExportSession: encodeOption 不合法");
            c25679xbb204036 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036((int) abstractC25633x3c9fad0.mo96120x47007694().f47833x6be2dc6, (int) abstractC25633x3c9fad0.mo96120x47007694().f47832xb7389127);
        }
        this.f47153xb154ec16 = c25679xbb204036;
    }
}
