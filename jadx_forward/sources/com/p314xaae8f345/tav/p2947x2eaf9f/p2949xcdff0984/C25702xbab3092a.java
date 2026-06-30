package com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984;

/* renamed from: com.tencent.tav.core.compositing.VideoCompositionRenderContext */
/* loaded from: classes14.dex */
public class C25702xbab3092a {

    /* renamed from: edgeWidths */
    android.graphics.RectF f47623x908fe38a;

    /* renamed from: renderContext */
    private com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f47624x399b739;

    /* renamed from: renderScale */
    private float f47625x9e4c6554;

    /* renamed from: renderTransform */
    private android.graphics.Matrix f47626xdb06b276;

    /* renamed from: size */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f47627x35e001;

    /* renamed from: videoComposition */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f f47628xaffe922f;

    /* renamed from: videoTexture */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f47629xa2b86820;

    public C25702xbab3092a(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719) {
        this.f47624x399b739 = c25779x3338e719;
        this.f47627x35e001 = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(c25779x3338e719.m97645x6be2dc6(), c25779x3338e719.m97632xb7389127());
    }

    /* renamed from: getEdgeWidths */
    public android.graphics.RectF m96914x7ed09b80() {
        return this.f47623x908fe38a;
    }

    /* renamed from: getRenderContext */
    public com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 m96915xc0f97383() {
        return this.f47624x399b739;
    }

    /* renamed from: getRenderScale */
    public float m96916x7822ac1e() {
        return this.f47625x9e4c6554;
    }

    /* renamed from: getRenderTransform */
    public android.graphics.Matrix m96917xbf688440() {
        return this.f47626xdb06b276;
    }

    /* renamed from: getSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m96918xfb854877() {
        return this.f47627x35e001;
    }

    /* renamed from: getVideoComposition */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f m96919x57d6f9a5() {
        return this.f47628xaffe922f;
    }

    /* renamed from: newTextureInfo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m96920x7e2662a9() {
        if (this.f47629xa2b86820 == null) {
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("newSampleBuffer");
            int m97623x3164f87f = com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(3553);
            com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f47627x35e001;
            this.f47629xa2b86820 = new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(m97623x3164f87f, 3553, (int) c25732x76648a85.f47833x6be2dc6, (int) c25732x76648a85.f47832xb7389127, 0);
        }
        return this.f47629xa2b86820;
    }

    /* renamed from: setVideoComposition */
    public void m96921xfbd38eb1(com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f) {
        this.f47628xaffe922f = c25706x7dc2d64f;
    }

    /* renamed from: toString */
    public java.lang.String m96922x9616526c() {
        return "VideoCompositionRenderContext{size=" + this.f47627x35e001 + ", renderContext=" + this.f47624x399b739 + '}';
    }
}
