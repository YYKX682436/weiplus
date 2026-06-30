package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c;

/* renamed from: com.tencent.thumbplayer.core.richmedia.async.TPNativeRichMediaAsyncRequester */
/* loaded from: classes16.dex */
public class C26445x99021bb5 implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c {

    /* renamed from: REQUEST_ID_NATIVE_EXCEPTION_THROW */
    private static final int f53696x32914062 = -100;

    /* renamed from: mNativeContext */
    private long f53697x5abc8e2b = 0;

    public C26445x99021bb5(android.content.Context context) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101882x9ec66011(context);
        try {
            if (m102889x429ccee7() == 0) {
            } else {
                throw new java.lang.UnsupportedOperationException("failed to setup rich media");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "Failed to create native rich media:" + th6.getMessage());
            throw new java.lang.UnsupportedOperationException("failed to create rich media");
        }
    }

    /* renamed from: _cancelRequest */
    private native void m102887x617ad0b6(int i17);

    /* renamed from: _getFeatures */
    private native com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26438x8b800541[] m102888x45737ff4();

    /* renamed from: _nativeSetup */
    private native int m102889x429ccee7();

    /* renamed from: _prepareAsync */
    private native int m102890x8157b94();

    /* renamed from: _release */
    private native void m102891xcd90cec8();

    /* renamed from: _requestFeatureDataAsyncAtTimeMs */
    private native int m102892x6f346f92(int i17, long j17);

    /* renamed from: _requestFeatureDataAsyncAtTimeMsArray */
    private native int m102893x5825fde7(int i17, long[] jArr);

    /* renamed from: _requestFeatureDataAsyncAtTimeRange */
    private native int m102894x7437fd1(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26442xa1b78dfd c26442xa1b78dfd);

    /* renamed from: _requestFeatureDataAsyncAtTimeRanges */
    private native int m102895xe12c7ac2(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26442xa1b78dfd[] c26442xa1b78dfdArr);

    /* renamed from: _setRequesterListener */
    private native void m102896x6ba032ed(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26444xaeba6f20 interfaceC26444xaeba6f20);

    /* renamed from: _setRichMediaSource */
    private native int m102897xc1025880(java.lang.String str);

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c
    /* renamed from: cancelRequest */
    public void mo102873x902cfeb5(int i17) {
        try {
            m102887x617ad0b6(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c
    /* renamed from: getFeatures */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26438x8b800541[] mo102874x6a8721b3() {
        try {
            return m102888x45737ff4();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26438x8b800541[0];
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c
    /* renamed from: prepareAsync */
    public void mo102875x857611b5() {
        int i17;
        try {
            i17 = m102890x8157b94();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            i17 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
        if (i17 == 0) {
            return;
        }
        throw new java.lang.IllegalStateException("prepareAsync, ret=" + i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c
    /* renamed from: release */
    public void mo102876x41012807() {
        try {
            m102891xcd90cec8();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c
    /* renamed from: requestFeatureDataAsyncAtTimeMs */
    public int mo102877xe54cbbd1(int i17, long j17) {
        try {
            return m102892x6f346f92(i17, j17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return -100;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c
    /* renamed from: requestFeatureDataAsyncAtTimeMsArray */
    public int mo102878xcde8108(int i17, long[] jArr) {
        try {
            return m102893x5825fde7(i17, jArr);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return -100;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c
    /* renamed from: requestFeatureDataAsyncAtTimeRange */
    public int mo102879xdcd45732(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26442xa1b78dfd c26442xa1b78dfd) {
        try {
            return m102894x7437fd1(i17, c26442xa1b78dfd);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return -100;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c
    /* renamed from: requestFeatureDataAsyncAtTimeRanges */
    public int mo102880xbdb68f81(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26442xa1b78dfd[] c26442xa1b78dfdArr) {
        try {
            return m102895xe12c7ac2(i17, c26442xa1b78dfdArr);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return -100;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c
    /* renamed from: setRequesterListener */
    public void mo102881xbedd180e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26444xaeba6f20 interfaceC26444xaeba6f20) {
        try {
            m102896x6ba032ed(interfaceC26444xaeba6f20);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c
    /* renamed from: setRichMediaSource */
    public void mo102882x6ec811e1(java.lang.String str) {
        int i17;
        try {
            i17 = m102897xc1025880(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            i17 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
        if (i17 == 0) {
            return;
        }
        if (i17 == 1000012) {
            throw new java.lang.IllegalArgumentException("setRichMediaSource，invalid argument, url=" + str);
        }
        throw new java.lang.IllegalStateException("setRichMediaSource:" + i17);
    }
}
