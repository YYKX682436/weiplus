package com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3057x58d027c;

/* renamed from: com.tencent.thumbplayer.richmedia.async.TPRichMediaAsyncRequester */
/* loaded from: classes16.dex */
public class C26481xbbb5b8cc implements com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26246x42ae6ca3 {

    /* renamed from: INVALID_REQUEST_ID */
    private static final int f53994xb5754053 = -1;
    private static final java.lang.String TAG = "TPRichMediaAsyncRequester";

    /* renamed from: mNativeRichMediaAsyncRequester */
    private final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c f53995xd02fd764;

    /* renamed from: com.tencent.thumbplayer.richmedia.async.TPRichMediaAsyncRequester$TPNativeRequestListener */
    /* loaded from: classes16.dex */
    public class TPNativeRequestListener implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26444xaeba6f20 {

        /* renamed from: mRichMediaAsyncRequesterListener */
        private final com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26247x4f2c4277 f53996x3cae18f;

        public TPNativeRequestListener(com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26247x4f2c4277 interfaceC26247x4f2c4277) {
            this.f53996x3cae18f = interfaceC26247x4f2c4277;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26444xaeba6f20
        /* renamed from: onFeatureDataRequestFailure */
        public void mo102883x7329b2bc(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c interfaceC26443x6ec4524c, int i17, int i18, int i19) {
            this.f53996x3cae18f.m101511x7329b2bc(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3057x58d027c.C26481xbbb5b8cc.this, i17, i18, i19);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26444xaeba6f20
        /* renamed from: onFeatureDataRequestSuccess */
        public void mo102884x44a2c135(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c interfaceC26443x6ec4524c, int i17, int i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26439x15a9e08b c26439x15a9e08b) {
            this.f53996x3cae18f.m101512x44a2c135(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3057x58d027c.C26481xbbb5b8cc.this, i17, i18, new com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26251xfbde32d4(c26439x15a9e08b));
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26444xaeba6f20
        /* renamed from: onRequesterError */
        public void mo102885x2523fab(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c interfaceC26443x6ec4524c, int i17) {
            this.f53996x3cae18f.m101513x2523fab(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3057x58d027c.C26481xbbb5b8cc.this, i17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26444xaeba6f20
        /* renamed from: onRequesterPrepared */
        public void mo102886x81e51fba(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.InterfaceC26443x6ec4524c interfaceC26443x6ec4524c) {
            this.f53996x3cae18f.m101514x81e51fba(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3057x58d027c.C26481xbbb5b8cc.this);
        }
    }

    public C26481xbbb5b8cc(android.content.Context context) {
        this.f53995xd02fd764 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.p3047x58d027c.C26445x99021bb5(context);
    }

    /* renamed from: toNativeTimeRanges */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26442xa1b78dfd[] m103252xec085815(com.p314xaae8f345.p3006xb8ff1437.api.C26200xaadfcf54[] c26200xaadfcf54Arr) {
        if (c26200xaadfcf54Arr == null || c26200xaadfcf54Arr.length == 0) {
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26442xa1b78dfd[0];
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26442xa1b78dfd[] c26442xa1b78dfdArr = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26442xa1b78dfd[c26200xaadfcf54Arr.length];
        for (int i17 = 0; i17 < c26200xaadfcf54Arr.length; i17++) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26200xaadfcf54 c26200xaadfcf54 = c26200xaadfcf54Arr[i17];
            if (c26200xaadfcf54 == null) {
                return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26442xa1b78dfd[0];
            }
            c26442xa1b78dfdArr[i17] = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26442xa1b78dfd(c26200xaadfcf54.m101180x6bb2831f(), c26200xaadfcf54.m101179x606f7358());
        }
        return c26442xa1b78dfdArr;
    }

    /* renamed from: toTPFeatureArray */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[] m103253x222a90da(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26438x8b800541[] c26438x8b800541Arr) {
        if (c26438x8b800541Arr == null || c26438x8b800541Arr.length == 0) {
            return new com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[0];
        }
        com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[] c26250xdf42e40aArr = new com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[c26438x8b800541Arr.length];
        for (int i17 = 0; i17 < c26438x8b800541Arr.length; i17++) {
            c26250xdf42e40aArr[i17] = new com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a(c26438x8b800541Arr[i17]);
        }
        return c26250xdf42e40aArr;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26246x42ae6ca3
    /* renamed from: cancelRequest */
    public void mo101501x902cfeb5(int i17) {
        this.f53995xd02fd764.mo102873x902cfeb5(i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26246x42ae6ca3
    /* renamed from: getFeatures */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[] mo101502x6a8721b3() {
        return m103253x222a90da(this.f53995xd02fd764.mo102874x6a8721b3());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26246x42ae6ca3
    /* renamed from: prepareAsync */
    public void mo101503x857611b5() {
        this.f53995xd02fd764.mo102875x857611b5();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26246x42ae6ca3
    /* renamed from: release */
    public void mo101504x41012807() {
        this.f53995xd02fd764.mo102876x41012807();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26246x42ae6ca3
    /* renamed from: requestFeatureDataAsyncAtTimeMs */
    public int mo101505xe54cbbd1(int i17, long j17) {
        return this.f53995xd02fd764.mo102877xe54cbbd1(i17, j17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26246x42ae6ca3
    /* renamed from: requestFeatureDataAsyncAtTimeMsArray */
    public int mo101506xcde8108(int i17, long[] jArr) {
        return this.f53995xd02fd764.mo102878xcde8108(i17, jArr);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26246x42ae6ca3
    /* renamed from: requestFeatureDataAsyncAtTimeRange */
    public int mo101507xdcd45732(int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26200xaadfcf54 c26200xaadfcf54) {
        if (c26200xaadfcf54 != null) {
            return this.f53995xd02fd764.mo102879xdcd45732(i17, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26442xa1b78dfd(c26200xaadfcf54.m101180x6bb2831f(), c26200xaadfcf54.m101179x606f7358()));
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "requestFeatureDataAsyncAtTimeRange, timeRange == null");
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26246x42ae6ca3
    /* renamed from: requestFeatureDataAsyncAtTimeRanges */
    public int mo101508xbdb68f81(int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26200xaadfcf54[] c26200xaadfcf54Arr) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26442xa1b78dfd[] m103252xec085815 = m103252xec085815(c26200xaadfcf54Arr);
        if (m103252xec085815.length != 0) {
            return this.f53995xd02fd764.mo102880xbdb68f81(i17, m103252xec085815);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "requestFeatureDataAsyncAtTimeRanges, toNativeTimeRanges return empty array");
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26246x42ae6ca3
    /* renamed from: setRequesterListener */
    public void mo101509xbedd180e(com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26247x4f2c4277 interfaceC26247x4f2c4277) {
        this.f53995xd02fd764.mo102881xbedd180e(new com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3057x58d027c.C26481xbbb5b8cc.TPNativeRequestListener(interfaceC26247x4f2c4277));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26246x42ae6ca3
    /* renamed from: setRichMediaSource */
    public void mo101510x6ec811e1(java.lang.String str) {
        this.f53995xd02fd764.mo102882x6ec811e1(str);
    }
}
