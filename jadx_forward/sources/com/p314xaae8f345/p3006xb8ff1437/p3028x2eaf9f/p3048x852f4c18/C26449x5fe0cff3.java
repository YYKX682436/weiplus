package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18;

/* renamed from: com.tencent.thumbplayer.core.subtitle.TPSubtitleParser */
/* loaded from: classes16.dex */
public class C26449x5fe0cff3 {

    /* renamed from: TP_SUBTITLE_OUTPUT_RGBA */
    public static final int f53728xe8d5e9ee = 1;

    /* renamed from: TP_SUBTITLE_OUTPUT_TEXT */
    public static final int f53729xe8d6cde7 = 0;

    /* renamed from: mCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.InterfaceC26446x3df3a6a1 f53730x1ab9c7d2;

    /* renamed from: mHttpHeader */
    private java.util.Map<java.lang.String, java.lang.String> f53731x664982;

    /* renamed from: mInited */
    private boolean f53732x8d8947c;

    /* renamed from: mIsLibLoaded */
    private boolean f53733xe0a15a33;

    /* renamed from: mNativeContext */
    private long f53734x5abc8e2b;

    /* renamed from: mOutputType */
    private int f53735x9044ac28;

    /* renamed from: mUrl */
    private java.lang.String f53736x32d9c2;

    public C26449x5fe0cff3(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.InterfaceC26446x3df3a6a1 interfaceC26446x3df3a6a1) {
        this.f53736x32d9c2 = null;
        this.f53731x664982 = null;
        this.f53735x9044ac28 = 0;
        this.f53730x1ab9c7d2 = null;
        this.f53732x8d8947c = false;
        this.f53733xe0a15a33 = false;
        this.f53734x5abc8e2b = 0L;
        m102911xeb57c8f5();
        this.f53736x32d9c2 = str;
        this.f53730x1ab9c7d2 = interfaceC26446x3df3a6a1;
    }

    /* renamed from: _subtitleCreate */
    private native int m102898xc652d553(java.lang.String str, java.lang.Object obj, int i17);

    /* renamed from: _subtitleCreateWithUrlHttpHeader */
    private native int m102899xf690ffcb(java.lang.String str, java.lang.Object[] objArr, java.lang.Object obj, int i17);

    /* renamed from: _subtitleDelete */
    private native void m102900xc753ba02();

    /* renamed from: _subtitleGetFrame */
    private native com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26328x6fe3d33a m102901x84e1ca4e(long j17);

    /* renamed from: _subtitleGetText */
    private native java.lang.String m102902xc23f042c(long j17, int i17);

    /* renamed from: _subtitleGetTrackCount */
    private native int m102903xf0edca43();

    /* renamed from: _subtitleGetTrackName */
    private native java.lang.String m102904x5a5f0ad7(int i17);

    /* renamed from: _subtitleLoadAsync */
    private native void m102905x4eea457f();

    /* renamed from: _subtitlePauseAsync */
    private native void m102906xb58666fd();

    /* renamed from: _subtitleSelectTrackAsync */
    private native int m102907x77b131a4(int i17, long j17);

    /* renamed from: _subtitleSetRenderParams */
    private native void m102908x10eb69c7(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26448xe1fd3147 c26448xe1fd3147);

    /* renamed from: _subtitleStartAsync */
    private native void m102909x5a91ec11();

    /* renamed from: _subtitleStop */
    private native void m102910x8c26619();

    /* renamed from: loadLibrary */
    private void m102911xeb57c8f5() {
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101882x9ec66011(null);
            this.f53733xe0a15a33 = true;
        } catch (java.lang.UnsupportedOperationException unused) {
            this.f53733xe0a15a33 = false;
        }
    }

    /* renamed from: getSubtitleFrame */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26328x6fe3d33a m102912xfae3f87f(long j17) {
        if (!this.f53733xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f53732x8d8947c) {
            return m102901x84e1ca4e(j17);
        }
        throw new java.lang.IllegalStateException("Failed to getSubtitleFrame due to invalid state.");
    }

    /* renamed from: getSubtitleText */
    public java.lang.String m102913xe715cbdb(long j17, int i17) {
        if (!this.f53733xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f53732x8d8947c) {
            return m102902xc23f042c(j17, i17);
        }
        throw new java.lang.IllegalStateException("Failed to getSubtitleText due to invalid state.");
    }

    /* renamed from: getTrackInfo */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1[] m102914x2ae89de3() {
        if (!this.f53733xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.f53732x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to getTrackInfo due to invalid state.");
        }
        int m102903xf0edca43 = m102903xf0edca43();
        if (m102903xf0edca43 <= 0) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1[] c26311x67c84ab1Arr = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1[m102903xf0edca43];
        for (int i17 = 0; i17 < m102903xf0edca43; i17++) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1 c26311x67c84ab1 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1();
            c26311x67c84ab1.f52218x2b805725 = 3;
            c26311x67c84ab1.f52217x2b7d4276 = m102904x5a5f0ad7(i17);
            c26311x67c84ab1Arr[i17] = c26311x67c84ab1;
        }
        return c26311x67c84ab1Arr;
    }

    /* renamed from: init */
    public void m102915x316510() {
        if (!this.f53733xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f53732x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to init due to invalid state.");
        }
        this.f53732x8d8947c = true;
        java.lang.String str = this.f53736x32d9c2;
        if (str == null || this.f53730x1ab9c7d2 == null) {
            return;
        }
        m102899xf690ffcb(str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26420xce765a9d.m102743x8779895c(this.f53731x664982), this.f53730x1ab9c7d2, this.f53735x9044ac28);
    }

    /* renamed from: loadAsync */
    public void m102916x512c6d36() {
        if (!this.f53733xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.f53732x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to loadAsync due to invalid state.");
        }
        m102905x4eea457f();
    }

    /* renamed from: pauseAsync */
    public void m102917xfb893626() {
        if (!this.f53733xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.f53732x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to pauseAsync due to invalid state.");
        }
        m102906xb58666fd();
    }

    /* renamed from: selectTrackAsync */
    public int m102918x56fc3e0d(int i17, long j17) {
        if (!this.f53733xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f53732x8d8947c) {
            return m102907x77b131a4(i17, j17);
        }
        throw new java.lang.IllegalStateException("Failed to selectTrackAsync due to invalid state.");
    }

    /* renamed from: selectTracksAsync */
    public int m102919xdb1aac38(int[] iArr, long j17) {
        return 0;
    }

    /* renamed from: setRenderParams */
    public void m102920xbd48ac3e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26448xe1fd3147 c26448xe1fd3147) {
        if (!this.f53733xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.f53732x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to setRenderParams due to invalid state.");
        }
        m102908x10eb69c7(c26448xe1fd3147);
    }

    /* renamed from: startAsync */
    public void m102921xa094bb3a() {
        if (!this.f53733xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.f53732x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to startAsync due to invalid state.");
        }
        m102909x5a91ec11();
    }

    /* renamed from: stop */
    public void m102922x360802() {
        if (!this.f53733xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.f53732x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to stop due to invalid state.");
        }
        m102910x8c26619();
    }

    /* renamed from: unInit */
    public void m102923xcdd7f349() {
        if (!this.f53733xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f53732x8d8947c) {
            this.f53732x8d8947c = false;
            m102900xc753ba02();
        }
    }

    public C26449x5fe0cff3(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.InterfaceC26446x3df3a6a1 interfaceC26446x3df3a6a1) {
        this.f53736x32d9c2 = null;
        this.f53731x664982 = null;
        this.f53735x9044ac28 = 0;
        this.f53730x1ab9c7d2 = null;
        this.f53732x8d8947c = false;
        this.f53733xe0a15a33 = false;
        this.f53734x5abc8e2b = 0L;
        m102911xeb57c8f5();
        this.f53736x32d9c2 = str;
        this.f53731x664982 = map;
        this.f53730x1ab9c7d2 = interfaceC26446x3df3a6a1;
    }

    public C26449x5fe0cff3(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.InterfaceC26446x3df3a6a1 interfaceC26446x3df3a6a1, int i17) {
        this.f53736x32d9c2 = null;
        this.f53731x664982 = null;
        this.f53735x9044ac28 = 0;
        this.f53730x1ab9c7d2 = null;
        this.f53732x8d8947c = false;
        this.f53733xe0a15a33 = false;
        this.f53734x5abc8e2b = 0L;
        m102911xeb57c8f5();
        this.f53736x32d9c2 = str;
        this.f53730x1ab9c7d2 = interfaceC26446x3df3a6a1;
        this.f53735x9044ac28 = i17;
    }

    public C26449x5fe0cff3(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.InterfaceC26446x3df3a6a1 interfaceC26446x3df3a6a1, int i17) {
        this.f53736x32d9c2 = null;
        this.f53731x664982 = null;
        this.f53735x9044ac28 = 0;
        this.f53730x1ab9c7d2 = null;
        this.f53732x8d8947c = false;
        this.f53733xe0a15a33 = false;
        this.f53734x5abc8e2b = 0L;
        m102911xeb57c8f5();
        this.f53736x32d9c2 = str;
        this.f53731x664982 = map;
        this.f53730x1ab9c7d2 = interfaceC26446x3df3a6a1;
        this.f53735x9044ac28 = i17;
    }
}
