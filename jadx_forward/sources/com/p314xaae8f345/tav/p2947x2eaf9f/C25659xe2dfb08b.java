package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AssetParallelExportSession */
/* loaded from: classes10.dex */
public class C25659xe2dfb08b {
    public static final java.lang.String TAG = "AssetExportSession";

    /* renamed from: appliesPreferredTrackTransform */
    public boolean f47283xa9a60b16;

    /* renamed from: asset */
    public com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 f47284x58ceaf0;

    /* renamed from: assetExtension */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f f47285xf1239f2f;

    /* renamed from: audioMix */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 f47286x3a2afaa6;

    /* renamed from: exportConfig */
    private final com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 f47287xb154ec16;

    /* renamed from: exportErrorStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 f47288x9f92e3c6;

    /* renamed from: exportWork */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.C25721x442f653c f47289xc7954e5;

    /* renamed from: indicatorInfo */
    private java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb> f47290xec76f75d;

    /* renamed from: isEnableNewTextureBlitting */
    private boolean f47291x3527020b;

    /* renamed from: isEnableOptimizedVideoFrameSampling */
    private boolean f47292x9c45adb3;

    /* renamed from: isNeedCheckFrameProcessTimeout */
    private boolean f47293x5097cd97;

    /* renamed from: maxTimeoutMs */
    private long f47294xae3bcde3;

    /* renamed from: mediaFactory */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25652xcd3d9f6f f47295xc0157086;

    /* renamed from: metadata */
    private java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> f47296xe52d7b2f;

    /* renamed from: outputFilePath */
    public java.lang.String f47297x3e2d9be2;

    /* renamed from: outputFileType */
    public java.lang.String f47298x3e2fc6f7;

    /* renamed from: presetName */
    private java.lang.String f47299x58bf4a0a;

    /* renamed from: processErrorStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 f47300x4de8662b;

    /* renamed from: progress */
    public float f47301xc454c22d;

    /* renamed from: renderContextParams */
    private com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff f47302x16878e1f;

    /* renamed from: revertMode */
    private boolean f47303xd16405a7;

    /* renamed from: status */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus f47304xcacdcff2;

    /* renamed from: supportedFileTypes */
    private java.util.List<java.lang.String> f47305x204c2f4f;

    /* renamed from: timeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47306x16fae70;

    /* renamed from: timeoutInterruptWork */
    private boolean f47307x734ee833;

    /* renamed from: videoCompositing */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 f47308xaffe9209;

    /* renamed from: videoComposition */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f f47309xaffe922f;

    /* renamed from: com.tencent.tav.core.AssetParallelExportSession$ExportCallbackHandler */
    /* loaded from: classes10.dex */
    public interface ExportCallbackHandler {
        /* renamed from: handlerCallback */
        void mo96511xc562f1af(com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b c25659xe2dfb08b);
    }

    @java.lang.Deprecated
    public C25659xe2dfb08b(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.OutputConfig outputConfig) {
        this(abstractC25633x3c9fad0, new com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036(outputConfig), new com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47245x96f5d2e7));
    }

    /* renamed from: cancelExport */
    public void m96471x7be5eace() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("AssetExportSession", "cancelExport");
        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.C25721x442f653c c25721x442f653c = this.f47289xc7954e5;
        if (c25721x442f653c != null) {
            c25721x442f653c.m97063xae7a2e7a();
        }
    }

    /* renamed from: exportAsynchronouslyWithCompletionHandler */
    public void m96472xae405e7f(com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b.ExportCallbackHandler exportCallbackHandler) {
        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.C25721x442f653c c25721x442f653c = new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.C25721x442f653c(this, exportCallbackHandler, this.f47286x3a2afaa6, this.f47287xb154ec16);
        this.f47289xc7954e5 = c25721x442f653c;
        c25721x442f653c.m97075xbcfc2a5d(this.f47302x16878e1f);
        this.f47289xc7954e5.m97074x5750fe08(this.f47295xc0157086);
        this.f47289xc7954e5.m97076xa1d0ffca(this.f47293x5097cd97, this.f47307x734ee833, this.f47294xae3bcde3);
        this.f47289xc7954e5.m97077x791872b6();
    }

    /* renamed from: getAsset */
    public com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 m96473x742a913a() {
        return this.f47284x58ceaf0;
    }

    /* renamed from: getAudioMix */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 m96474xb605381c() {
        return this.f47286x3a2afaa6;
    }

    /* renamed from: getErrCode */
    public int m96475xe591acbc() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6 = this.f47288x9f92e3c6;
        if (c25680x8a5723a6 != null) {
            return c25680x8a5723a6.f47510x2eaded;
        }
        return 0;
    }

    /* renamed from: getExportConfig */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 m96476x12477e8c() {
        return this.f47287xb154ec16;
    }

    /* renamed from: getExportErrorStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96477xf2c76b10() {
        return this.f47288x9f92e3c6;
    }

    /* renamed from: getIndicatorInfo */
    public java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb> m96478xa9d6b3a7() {
        return this.f47290xec76f75d;
    }

    /* renamed from: getMetadata */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> m96479x6107b8a5() {
        return this.f47296xe52d7b2f;
    }

    /* renamed from: getOutputFilePath */
    public java.lang.String m96480x2cc568d8() {
        return this.f47297x3e2d9be2;
    }

    /* renamed from: getOutputFileType */
    public java.lang.String m96481x2cc793ed() {
        return this.f47298x3e2fc6f7;
    }

    /* renamed from: getPresetName */
    public java.lang.String m96482x47000200() {
        return this.f47299x58bf4a0a;
    }

    /* renamed from: getProgress */
    public float m96483x402effa3() {
        return this.f47301xc454c22d;
    }

    /* renamed from: getRenderContextParams */
    public com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff m96484x6eb76ae9() {
        return this.f47302x16878e1f;
    }

    /* renamed from: getStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus m96485x2fe4f2e8() {
        return this.f47304xcacdcff2;
    }

    /* renamed from: getSupportedFileTypes */
    public java.util.List<java.lang.String> m96486x33a89145() {
        return this.f47305x204c2f4f;
    }

    /* renamed from: getThrowable */
    public java.lang.Throwable m96487xb494ca8a() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6 = this.f47288x9f92e3c6;
        if (c25680x8a5723a6 != null) {
            return c25680x8a5723a6.f47512xb5275940;
        }
        return null;
    }

    /* renamed from: getTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m96488xdd1fba() {
        return this.f47306x16fae70;
    }

    /* renamed from: getVideoCompositing */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 m96489x57d6f97f() {
        if (this.f47308xaffe9209 == null) {
            this.f47308xaffe9209 = m96494xe97d3fc9();
        }
        return this.f47308xaffe9209;
    }

    /* renamed from: getVideoComposition */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f m96490x57d6f9a5() {
        return this.f47309xaffe922f;
    }

    /* renamed from: isEnableNewTextureBlitting */
    public boolean m96491x3527020b() {
        return this.f47291x3527020b;
    }

    /* renamed from: isEnableOptimizedVideoFrameSampling */
    public boolean m96492x9c45adb3() {
        return this.f47292x9c45adb3;
    }

    /* renamed from: isRevertMode */
    public boolean m96493x52cf0271() {
        return this.f47303xd16405a7;
    }

    /* renamed from: newVideoCompositing */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 m96494xe97d3fc9() {
        return this.f47309xaffe922f.mo96924x35bb4175();
    }

    /* renamed from: parallelSize */
    public int m96495x959526a8() {
        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.C25721x442f653c c25721x442f653c = this.f47289xc7954e5;
        if (c25721x442f653c != null) {
            return c25721x442f653c.getMaxParallelCount();
        }
        return 0;
    }

    /* renamed from: release */
    public void m96496x41012807() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 c25671x3e055ec6 = this.f47286x3a2afaa6;
        if (c25671x3e055ec6 != null) {
            c25671x3e055ec6.m96686x41012807();
            this.f47286x3a2afaa6 = null;
        }
    }

    /* renamed from: setAppliesPreferredTrackTransform */
    public void m96497x507dfc18(boolean z17) {
        this.f47283xa9a60b16 = z17;
    }

    /* renamed from: setAudioMix */
    public void m96498xb0bd9928(com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 c25671x3e055ec6) {
        this.f47286x3a2afaa6 = c25671x3e055ec6;
    }

    /* renamed from: setEnableNewTextureBlitting */
    public void m96499x715c8943(boolean z17) {
        this.f47291x3527020b = z17;
    }

    /* renamed from: setEnableOptimizedVideoFrameSampling */
    public void m96500x7668c57b(boolean z17) {
        this.f47292x9c45adb3 = z17;
    }

    /* renamed from: setIndicatorInfo */
    public void m96501x3cad1a1b(java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb> arrayList) {
        this.f47290xec76f75d.clear();
        this.f47290xec76f75d.addAll(arrayList);
    }

    /* renamed from: setMediaFactory */
    public void m96502x5750fe08(com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25652xcd3d9f6f interfaceC25652xcd3d9f6f) {
        this.f47295xc0157086 = interfaceC25652xcd3d9f6f;
    }

    /* renamed from: setMetadata */
    public void m96503x5bc019b1(java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> list) {
        this.f47296xe52d7b2f = list;
    }

    /* renamed from: setOutputFilePath */
    public void m96504xf4bbd0e4(java.lang.String str) {
        this.f47297x3e2d9be2 = str;
    }

    /* renamed from: setOutputFileType */
    public void m96505xf4bdfbf9(java.lang.String str) {
        this.f47298x3e2fc6f7 = str;
    }

    /* renamed from: setRenderContextParams */
    public void m96506xbcfc2a5d(com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff c25780x613b55ff) {
        this.f47302x16878e1f = c25780x613b55ff;
        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.C25721x442f653c c25721x442f653c = this.f47289xc7954e5;
        if (c25721x442f653c != null) {
            c25721x442f653c.m97075xbcfc2a5d(c25780x613b55ff);
        }
    }

    /* renamed from: setRevertMode */
    public void m96507xedc90ba9(boolean z17) {
        this.f47303xd16405a7 = z17;
    }

    /* renamed from: setTimeRange */
    public void m96508x5d30e02e(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47306x16fae70 = c25738xead39d26;
    }

    /* renamed from: setTimeoutParameter */
    public void m96509xa1d0ffca(boolean z17, boolean z18, long j17) {
        this.f47293x5097cd97 = z17;
        this.f47307x734ee833 = z18;
        this.f47294xae3bcde3 = j17;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("AssetExportSession", "setNeedCheckFrameProcessTimeout:%b timeoutInterruptWork:%b timeoutMs:%d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(j17));
    }

    /* renamed from: setVideoComposition */
    public void m96510xfbd38eb1(com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f) {
        this.f47309xaffe922f = c25706x7dc2d64f;
    }

    public C25659xe2dfb08b(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0, com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036) {
        this(abstractC25633x3c9fad0, c25679xbb204036, new com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47245x96f5d2e7));
    }

    public C25659xe2dfb08b(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0, com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036, com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f c25657xb56a6b4f) {
        this.f47298x3e2fc6f7 = "mp4";
        this.f47303xd16405a7 = false;
        this.f47290xec76f75d = new java.util.ArrayList<>();
        this.f47292x9c45adb3 = false;
        this.f47291x3527020b = false;
        this.f47283xa9a60b16 = false;
        this.f47293x5097cd97 = true;
        this.f47307x734ee833 = false;
        this.f47294xae3bcde3 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        this.f47284x58ceaf0 = abstractC25633x3c9fad0;
        this.f47285xf1239f2f = c25657xb56a6b4f;
        if (c25679xbb204036 == null || !c25679xbb204036.m96730xd4418ac9()) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e("AssetExportSession", "AssetExportSession: encodeOption 不合法");
            c25679xbb204036 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036((int) abstractC25633x3c9fad0.mo96120x47007694().f47833x6be2dc6, (int) abstractC25633x3c9fad0.mo96120x47007694().f47832xb7389127);
        }
        this.f47287xb154ec16 = c25679xbb204036;
    }
}
