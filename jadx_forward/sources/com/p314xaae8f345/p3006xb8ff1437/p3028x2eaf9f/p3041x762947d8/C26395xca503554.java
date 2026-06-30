package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8;

/* renamed from: com.tencent.thumbplayer.core.imagegenerator.TPImageGenerator */
/* loaded from: classes16.dex */
public class C26395xca503554 {

    /* renamed from: mCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.InterfaceC26394xf71c1b02 f53120x1ab9c7d2;
    private int mFd;

    /* renamed from: mFdLength */
    private long f53121xba17d4d1;

    /* renamed from: mFdOffset */
    private long f53122xbf40fe7e;

    /* renamed from: mHttpHeader */
    private java.util.Map<java.lang.String, java.lang.String> f53123x664982;

    /* renamed from: mInited */
    private boolean f53124x8d8947c;

    /* renamed from: mIsLibLoaded */
    private boolean f53125xe0a15a33;

    /* renamed from: mNativeContext */
    private long f53126x5abc8e2b;

    /* renamed from: mUrl */
    private java.lang.String f53127x32d9c2;

    public C26395xca503554(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.InterfaceC26394xf71c1b02 interfaceC26394xf71c1b02) {
        this.f53127x32d9c2 = null;
        this.f53123x664982 = null;
        this.f53120x1ab9c7d2 = null;
        this.mFd = -1;
        this.f53124x8d8947c = false;
        this.f53125xe0a15a33 = false;
        this.f53126x5abc8e2b = 0L;
        m102576xeb57c8f5();
        this.f53127x32d9c2 = str;
        this.f53120x1ab9c7d2 = interfaceC26394xf71c1b02;
    }

    /* renamed from: _cancelAllImageGenerations */
    private native void m102570xd22ad968();

    /* renamed from: _createWithFd */
    private native int m102571xe462ea1f(int i17, long j17, long j18, java.lang.Object obj);

    /* renamed from: _createWithUrl */
    private native int m102572xa7fa942e(java.lang.String str, java.lang.Object obj);

    /* renamed from: _generateImageAsyncAtTime */
    private native void m102573xcd302dd5(long j17, long j18, java.lang.Object obj);

    /* renamed from: _generateImagesAsyncForTimes */
    private native void m102574xe119038d(long[] jArr, long j17, java.lang.Object obj);

    /* renamed from: _release */
    private native void m102575xcd90cec8();

    /* renamed from: loadLibrary */
    private void m102576xeb57c8f5() {
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101882x9ec66011(null);
            this.f53125xe0a15a33 = true;
        } catch (java.lang.UnsupportedOperationException unused) {
            this.f53125xe0a15a33 = false;
        }
    }

    /* renamed from: cancelAllImageGenerations */
    public void m102577x228500e7() {
        if (!this.f53125xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f53124x8d8947c) {
            m102570xd22ad968();
        }
    }

    /* renamed from: generateImageAsyncAtTime */
    public void m102578xbf439a76(long j17, long j18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa c26396x622fcbfa) {
        if (!this.f53125xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f53124x8d8947c) {
            m102573xcd302dd5(j17, j18, c26396x622fcbfa);
            return;
        }
        throw new java.lang.IllegalStateException("Failed to generate image at time " + j17 + " due to invalid state.");
    }

    /* renamed from: generateImagesAsyncForTimes */
    public void m102579x8387474c(long[] jArr, long j17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa c26396x622fcbfa) {
        if (!this.f53125xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.f53124x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to generate images due to invalid state.");
        }
        m102574xe119038d(jArr, j17, c26396x622fcbfa);
    }

    /* renamed from: init */
    public void m102580x316510() {
        if (!this.f53125xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f53124x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to init due to invalid state.");
        }
        this.f53124x8d8947c = true;
        java.lang.String str = this.f53127x32d9c2;
        if (str == null || this.f53123x664982 == null) {
            if (str != null) {
                m102572xa7fa942e(str, this.f53120x1ab9c7d2);
            } else {
                m102571xe462ea1f(this.mFd, this.f53122xbf40fe7e, this.f53121xba17d4d1, this.f53120x1ab9c7d2);
            }
        }
    }

    /* renamed from: unInit */
    public void m102581xcdd7f349() {
        if (!this.f53125xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f53124x8d8947c) {
            this.f53124x8d8947c = false;
            m102575xcd90cec8();
        }
    }

    public C26395xca503554(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.InterfaceC26394xf71c1b02 interfaceC26394xf71c1b02) {
        this.f53127x32d9c2 = null;
        this.f53123x664982 = null;
        this.f53120x1ab9c7d2 = null;
        this.mFd = -1;
        this.f53124x8d8947c = false;
        this.f53125xe0a15a33 = false;
        this.f53126x5abc8e2b = 0L;
        m102576xeb57c8f5();
        this.f53127x32d9c2 = str;
        this.f53123x664982 = map;
        this.f53120x1ab9c7d2 = interfaceC26394xf71c1b02;
    }

    public C26395xca503554(int i17, long j17, long j18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.InterfaceC26394xf71c1b02 interfaceC26394xf71c1b02) {
        this.f53127x32d9c2 = null;
        this.f53123x664982 = null;
        this.f53120x1ab9c7d2 = null;
        this.mFd = -1;
        this.f53124x8d8947c = false;
        this.f53125xe0a15a33 = false;
        this.f53126x5abc8e2b = 0L;
        m102576xeb57c8f5();
        this.mFd = i17;
        this.f53122xbf40fe7e = j17;
        this.f53121xba17d4d1 = j18;
        this.f53120x1ab9c7d2 = interfaceC26394xf71c1b02;
    }
}
