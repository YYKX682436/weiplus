package com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984;

/* renamed from: com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest */
/* loaded from: classes16.dex */
public class C25699x9dbd9fd8 {

    /* renamed from: assetExtension */
    private final com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f f47609xf1239f2f;

    /* renamed from: authorComposition */
    private final java.lang.Object f47610x2ae1bb1f;

    /* renamed from: compositionTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47612x3ed5eb97;

    /* renamed from: error */
    private volatile com.p314xaae8f345.tav.p2957xa228aba5.C25740x57112479 f47613x5c4d208;

    /* renamed from: renderContext */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25702xbab3092a f47614x399b739;

    /* renamed from: videoCompositionInstruction */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25700xb60b20d6 f47618x34921edf;

    /* renamed from: sourceTrackIDs */
    private java.util.List<java.lang.Integer> f47616xfa7422c8 = new java.util.ArrayList();

    /* renamed from: composedVideoFrame */
    private volatile com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 f47611xb4a02864 = null;

    /* renamed from: status */
    private volatile int f47617xcacdcff2 = Integer.MIN_VALUE;

    /* renamed from: sampleBuffers */
    private android.util.SparseArray<com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14> f47615x4e324329 = new android.util.SparseArray<>();

    /* renamed from: com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest$RequestStatus */
    /* loaded from: classes16.dex */
    public @interface RequestStatus {

        /* renamed from: Cancel */
        public static final int f47619x77df1a9a = 1;

        /* renamed from: Error */
        public static final int f47620x401e1e8 = -1;

        /* renamed from: Success */
        public static final int f47621xf3edd7e3 = 0;

        /* renamed from: UnKnow */
        public static final int f47622x973dc8e4 = Integer.MIN_VALUE;
    }

    public C25699x9dbd9fd8(java.lang.Object obj, com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f c25657xb56a6b4f) {
        this.f47610x2ae1bb1f = obj;
        this.f47609xf1239f2f = c25657xb56a6b4f;
    }

    /* renamed from: notifyFinish */
    private void m96891x40cfb53c() {
        java.lang.Object obj = this.f47610x2ae1bb1f;
        if (obj != null) {
            synchronized (obj) {
                this.f47610x2ae1bb1f.notifyAll();
            }
        }
    }

    /* renamed from: appendCMSampleBuffer */
    public void m96892x6616f5ae(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14, int i17) {
        this.f47615x4e324329.put(i17, c25734xcdff9c14);
        this.f47616xfa7422c8.add(java.lang.Integer.valueOf(i17));
    }

    /* renamed from: finishCancelledRequest */
    public void m96893xb84ebeb1() {
        synchronized (this) {
            this.f47617xcacdcff2 = 1;
        }
        m96891x40cfb53c();
    }

    /* renamed from: finishWithComposedVideoFrame */
    public void m96894x58b3683d(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        synchronized (this) {
            this.f47611xb4a02864 = c25734xcdff9c14;
            this.f47617xcacdcff2 = 0;
        }
        m96891x40cfb53c();
    }

    /* renamed from: finishWithError */
    public void m96895xe289c58f(com.p314xaae8f345.tav.p2957xa228aba5.C25740x57112479 c25740x57112479) {
        synchronized (this) {
            this.f47613x5c4d208 = c25740x57112479;
            this.f47617xcacdcff2 = -1;
        }
        m96891x40cfb53c();
    }

    /* renamed from: getAssetExtension */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f m96896xdfbb6c25() {
        return this.f47609xf1239f2f;
    }

    /* renamed from: getComposedSampleBuffer */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96897xd1ba5532() {
        return this.f47611xb4a02864;
    }

    /* renamed from: getCompositionTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96898x2337bd61() {
        return this.f47612x3ed5eb97;
    }

    /* renamed from: getRenderContext */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25702xbab3092a m96899xc0f97383() {
        return this.f47614x399b739;
    }

    /* renamed from: getSourceTrackIDs */
    public java.util.List<java.lang.Integer> m96900xe90befbe() {
        return this.f47616xfa7422c8;
    }

    /* renamed from: getStatus */
    public synchronized int m96901x2fe4f2e8() {
        return this.f47617xcacdcff2;
    }

    /* renamed from: getVideoCompositionInstruction */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25700xb60b20d6 m96902xbb2591a9() {
        return this.f47618x34921edf;
    }

    /* renamed from: setCompositionTime */
    public void m96903x5a0e56d5(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f47612x3ed5eb97 = c25736x76b98a57;
    }

    /* renamed from: setRenderContext */
    public void m96904x53cfd9f7(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25702xbab3092a c25702xbab3092a) {
        this.f47614x399b739 = c25702xbab3092a;
    }

    /* renamed from: setVideoCompositionInstruction */
    public void m96905xc33d9d1d(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25700xb60b20d6 interfaceC25700xb60b20d6) {
        this.f47618x34921edf = interfaceC25700xb60b20d6;
    }

    /* renamed from: sourceFrameByTrackID */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96906xcc32495d(int i17) {
        android.util.SparseArray<com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14> sparseArray = this.f47615x4e324329;
        if (sparseArray != null) {
            return sparseArray.get(i17);
        }
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m96907x9616526c() {
        return "AsynchronousVideoCompositionRequest{renderContext=" + this.f47614x399b739 + ", compositionTime=" + this.f47612x3ed5eb97 + ", videoCompositionInstruction=" + this.f47618x34921edf + ", sampleBuffers=" + this.f47615x4e324329 + '}';
    }
}
