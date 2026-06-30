package com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1;

/* renamed from: com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest */
/* loaded from: classes15.dex */
public class C26471x3d8a6055 implements com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac {

    /* renamed from: mContentInformation */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.C26245xdfa71862 f53914x8f86ee40;

    /* renamed from: mIsCancelled */
    private boolean f53915xcb27c9a = false;

    /* renamed from: mIsFinished */
    private boolean f53916x84c26009 = false;

    /* renamed from: mLoadingDataRequest */
    private com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b f53917xfda9cbf6;

    /* renamed from: mRequestNum */
    private int f53918xde67fac4;

    public C26471x3d8a6055(long j17, long j18, int i17, boolean z17) {
        this.f53918xde67fac4 = i17;
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b c26470x5aa8a24b = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b(j17, j18, z17);
        this.f53917xfda9cbf6 = c26470x5aa8a24b;
        c26470x5aa8a24b.m103156x1e9b0879(i17);
    }

    /* renamed from: cancelRequest */
    public synchronized void m103157x902cfeb5() {
        this.f53915xcb27c9a = true;
        this.f53917xfda9cbf6.m103153x41012807();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac
    /* renamed from: finishLoading */
    public synchronized void mo101496xa1f73129() {
        this.f53916x84c26009 = true;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac
    /* renamed from: getContentInformation */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.C26245xdfa71862 mo101497xa393f4e9() {
        return this.f53914x8f86ee40;
    }

    /* renamed from: getDataReadyLength */
    public int m103158xed32f629(long j17) {
        return this.f53917xfda9cbf6.m103152xed32f629(j17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac
    /* renamed from: isCancelled */
    public synchronized boolean mo101499x62a56b47() {
        return this.f53915xcb27c9a;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac
    /* renamed from: isFinished */
    public synchronized boolean mo101500xa89067bc() {
        return this.f53916x84c26009;
    }

    /* renamed from: setContentInformation */
    public void m103159x3abf76f5(com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.C26245xdfa71862 c26245xdfa71862) {
        this.f53914x8f86ee40 = c26245xdfa71862;
    }

    /* renamed from: setDataWritePath */
    public void m103160x90c67ad8(java.lang.String str) {
        this.f53917xfda9cbf6.m103154x90c67ad8(str);
    }

    /* renamed from: setDataWriteThreadLooper */
    public void m103161x3b5338ae(android.os.Looper looper) {
        this.f53917xfda9cbf6.m103155x3b5338ae(looper);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac
    /* renamed from: getLoadingDataRequest */
    public com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b mo101498x11b6d29f() {
        return this.f53917xfda9cbf6;
    }
}
