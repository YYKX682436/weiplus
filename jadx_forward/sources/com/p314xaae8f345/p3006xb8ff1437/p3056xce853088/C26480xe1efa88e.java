package com.p314xaae8f345.p3006xb8ff1437.p3056xce853088;

/* renamed from: com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer */
/* loaded from: classes16.dex */
public class C26480xe1efa88e implements com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59 {

    /* renamed from: mInnerProcessCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.TPRichMediaInnerProcessCallback f53986xa389b2ab;

    /* renamed from: mNativeRichMediaProcessor */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726 f53987xe18ce30e;

    /* renamed from: mProcessCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.TPRichMediaProcessCallback f53988x287ff3a7;

    /* renamed from: mTPPluginManager */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26527x371857de f53989x4233cfd1;

    /* renamed from: com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer$TPRichMediaInnerProcessCallback */
    /* loaded from: classes16.dex */
    public class TPRichMediaInnerProcessCallback implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26434xd2c4ad2d {

        /* renamed from: mInnerSynchronizerListener */
        private com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59.ITPRichMediaInnerSynchronizerListener f53990x365d2b7f;

        public TPRichMediaInnerProcessCallback() {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26434xd2c4ad2d
        /* renamed from: onGetCurrentPositionMs */
        public long mo102814xa74df6d1(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726 interfaceC26435xdb813726) {
            com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59.ITPRichMediaInnerSynchronizerListener iTPRichMediaInnerSynchronizerListener = this.f53990x365d2b7f;
            if (iTPRichMediaInnerSynchronizerListener == null) {
                return -1L;
            }
            long mo100457xa74df6d1 = iTPRichMediaInnerSynchronizerListener.mo100457xa74df6d1(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this);
            com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this.m103248xd0c233a0(311, (int) mo100457xa74df6d1, 0, null, null);
            return mo100457xa74df6d1;
        }

        /* renamed from: setInnerSynchronizerListener */
        public void m103250xe305d2a(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59.ITPRichMediaInnerSynchronizerListener iTPRichMediaInnerSynchronizerListener) {
            this.f53990x365d2b7f = iTPRichMediaInnerSynchronizerListener;
        }
    }

    /* renamed from: com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer$TPRichMediaProcessCallback */
    /* loaded from: classes16.dex */
    public class TPRichMediaProcessCallback implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26436x7a19358b {

        /* renamed from: mSynchronizerListener */
        private com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26249xd39699f9 f53992x3f542803;

        public TPRichMediaProcessCallback() {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26436x7a19358b
        /* renamed from: onDeselectFeatureSuccess */
        public void mo102827x99420f09(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726 interfaceC26435xdb813726, int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this.m103248xd0c233a0(305, i17, 0, null, null);
            com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26249xd39699f9 interfaceC26249xd39699f9 = this.f53992x3f542803;
            if (interfaceC26249xd39699f9 != null) {
                interfaceC26249xd39699f9.m101523x99420f09(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this, i17);
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26436x7a19358b
        /* renamed from: onRichMediaError */
        public void mo102828xf6ed4a3f(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726 interfaceC26435xdb813726, int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this.m103248xd0c233a0(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54457x5e52d6e7, i17, 0, null, null);
            com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26249xd39699f9 interfaceC26249xd39699f9 = this.f53992x3f542803;
            if (interfaceC26249xd39699f9 != null) {
                interfaceC26249xd39699f9.m101524xf6ed4a3f(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this, i17);
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26436x7a19358b
        /* renamed from: onRichMediaFeatureData */
        public void mo102829xa5e5a6b7(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726 interfaceC26435xdb813726, int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26439x15a9e08b c26439x15a9e08b) {
            com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26249xd39699f9 interfaceC26249xd39699f9 = this.f53992x3f542803;
            if (interfaceC26249xd39699f9 != null) {
                interfaceC26249xd39699f9.m101525xa5e5a6b7(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this, i17, new com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26251xfbde32d4(c26439x15a9e08b));
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26436x7a19358b
        /* renamed from: onRichMediaFeatureFailure */
        public void mo102830x8fc035d(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726 interfaceC26435xdb813726, int i17, int i18) {
            com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this.m103248xd0c233a0(310, i17, i18, null, null);
            com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26249xd39699f9 interfaceC26249xd39699f9 = this.f53992x3f542803;
            if (interfaceC26249xd39699f9 != null) {
                interfaceC26249xd39699f9.m101526x8fc035d(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this, i17, i18);
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26436x7a19358b
        /* renamed from: onRichMediaInfo */
        public void mo102831x5a8d8997(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726 interfaceC26435xdb813726, int i17, long j17, long j18, long j19, java.lang.Object obj) {
            com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26249xd39699f9 interfaceC26249xd39699f9 = this.f53992x3f542803;
            if (interfaceC26249xd39699f9 != null) {
                interfaceC26249xd39699f9.m101527x5a8d8997(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this, i17, j17, j18, j19, obj);
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26436x7a19358b
        /* renamed from: onRichMediaPrepared */
        public void mo102832x88391ca6(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726 interfaceC26435xdb813726) {
            com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this.m103248xd0c233a0(301, 0, 0, null, com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this.mo101516x6a8721b3());
            com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26249xd39699f9 interfaceC26249xd39699f9 = this.f53992x3f542803;
            if (interfaceC26249xd39699f9 != null) {
                interfaceC26249xd39699f9.m101528x88391ca6(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this);
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26436x7a19358b
        /* renamed from: onSelectFeatureSuccess */
        public void mo102833x88e170c8(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726 interfaceC26435xdb813726, int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this.m103248xd0c233a0(303, i17, 0, null, null);
            com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26249xd39699f9 interfaceC26249xd39699f9 = this.f53992x3f542803;
            if (interfaceC26249xd39699f9 != null) {
                interfaceC26249xd39699f9.m101529x88e170c8(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.this, i17);
            }
        }

        /* renamed from: setSynchronizerListener */
        public void m103251xfe8d5778(com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26249xd39699f9 interfaceC26249xd39699f9) {
            this.f53992x3f542803 = interfaceC26249xd39699f9;
        }
    }

    public C26480xe1efa88e(android.content.Context context) {
        this.f53987xe18ce30e = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26440x8363701d(context);
        com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.TPRichMediaInnerProcessCallback tPRichMediaInnerProcessCallback = new com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.TPRichMediaInnerProcessCallback();
        this.f53986xa389b2ab = tPRichMediaInnerProcessCallback;
        this.f53987xe18ce30e.mo102823xbb73da43(tPRichMediaInnerProcessCallback);
        com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.TPRichMediaProcessCallback tPRichMediaProcessCallback = new com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e.TPRichMediaProcessCallback();
        this.f53988x287ff3a7 = tPRichMediaProcessCallback;
        this.f53987xe18ce30e.mo102825x981bb2b5(tPRichMediaProcessCallback);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26527x371857de c26527x371857de = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26527x371857de();
        this.f53989x4233cfd1 = c26527x371857de;
        c26527x371857de.mo103644xfa7f1734(new com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3058xe3a677a0.C26482xe4959135());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pushEvent */
    public void m103248xd0c233a0(int i17, int i18, int i19, java.lang.String str, java.lang.Object obj) {
        this.f53989x4233cfd1.mo103281xaf8c47fb(i17, i18, i19, str, obj);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625
    /* renamed from: deselectFeatureAsync */
    public void mo101515x19733e83(int i17) {
        this.f53987xe18ce30e.mo102815x19733e83(i17);
        m103248xd0c233a0(304, i17, 0, null, null);
    }

    /* renamed from: finalize */
    public void m103249xd764dc1e() {
        this.f53987xe18ce30e.mo102823xbb73da43(null);
        this.f53987xe18ce30e.mo102825x981bb2b5(null);
        this.f53987xe18ce30e.mo102819x41012807();
        this.f53988x287ff3a7.m103251xfe8d5778(null);
        this.f53986xa389b2ab.m103250xe305d2a(null);
        super.finalize();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59
    /* renamed from: getCurrentPositionMsFeatureData */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26251xfbde32d4 mo103243x88417a0e(long j17, int[] iArr) {
        return new com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26251xfbde32d4(this.f53987xe18ce30e.mo102816x88417a0e(j17, iArr));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625
    /* renamed from: getFeatures */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[] mo101516x6a8721b3() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26438x8b800541 c26438x8b800541;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26438x8b800541[] mo102817x6a8721b3 = this.f53987xe18ce30e.mo102817x6a8721b3();
        if (mo102817x6a8721b3 == null) {
            return new com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[0];
        }
        com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[] c26250xdf42e40aArr = new com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a[mo102817x6a8721b3.length];
        for (int i17 = 0; i17 < mo102817x6a8721b3.length && (c26438x8b800541 = mo102817x6a8721b3[i17]) != null; i17++) {
            c26250xdf42e40aArr[i17] = new com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26250xdf42e40a(c26438x8b800541);
        }
        return c26250xdf42e40aArr;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625
    /* renamed from: prepareAsync */
    public void mo101517x857611b5() {
        this.f53987xe18ce30e.mo102818x857611b5();
        m103248xd0c233a0(300, 0, 0, null, null);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625
    /* renamed from: release */
    public void mo101518x41012807() {
        this.f53987xe18ce30e.mo102823xbb73da43(null);
        this.f53987xe18ce30e.mo102825x981bb2b5(null);
        this.f53987xe18ce30e.mo102819x41012807();
        this.f53988x287ff3a7.m103251xfe8d5778(null);
        this.f53986xa389b2ab.m103250xe305d2a(null);
        m103248xd0c233a0(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54460xdba898a8, 0, 0, null, null);
        this.f53989x4233cfd1.mo103645x41012807();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625
    /* renamed from: reset */
    public void mo101519x6761d4f() {
        this.f53987xe18ce30e.mo102820x6761d4f();
        m103248xd0c233a0(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630, 0, 0, null, null);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59
    /* renamed from: seek */
    public void mo103244x35ce78(long j17) {
        this.f53987xe18ce30e.mo102821x35ce78(j17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625
    /* renamed from: selectFeatureAsync */
    public void mo101520x7a02f042(int i17, com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26253x903e107b c26253x903e107b) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26441x4bfd5d24 c26441x4bfd5d24 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26441x4bfd5d24();
        c26441x4bfd5d24.m102868x3865d74f(c26253x903e107b.m101540x4280d0b0());
        this.f53987xe18ce30e.mo102822x7a02f042(i17, c26441x4bfd5d24);
        m103248xd0c233a0(302, i17, 0, null, null);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59
    /* renamed from: setInnerListener */
    public void mo103245x2817e3e8(com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59.ITPRichMediaInnerSynchronizerListener iTPRichMediaInnerSynchronizerListener) {
        this.f53986xa389b2ab.m103250xe305d2a(iTPRichMediaInnerSynchronizerListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625
    /* renamed from: setListener */
    public void mo101521xc6cf6336(com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26249xd39699f9 interfaceC26249xd39699f9) {
        this.f53988x287ff3a7.m103251xfe8d5778(interfaceC26249xd39699f9);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59
    /* renamed from: setPlaybackRate */
    public void mo103246xe8059f1d(float f17) {
        this.f53987xe18ce30e.mo102824xe8059f1d(f17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625
    /* renamed from: setRichMediaSource */
    public void mo101522x6ec811e1(java.lang.String str) {
        this.f53987xe18ce30e.mo102826x6ec811e1(str);
        m103248xd0c233a0(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54463x110bac93, 0, 0, str, null);
    }
}
