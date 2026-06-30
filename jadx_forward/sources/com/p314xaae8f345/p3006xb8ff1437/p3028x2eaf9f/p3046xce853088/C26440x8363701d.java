package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088;

/* renamed from: com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaProcessor */
/* loaded from: classes16.dex */
public class C26440x8363701d implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726 {

    /* renamed from: mNativeContext */
    private long f53692x5abc8e2b = 0;

    public C26440x8363701d(android.content.Context context) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101882x9ec66011(context.getApplicationContext());
        try {
            m102857x429ccee7();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "Failed to create native rich media:" + th6.getMessage());
            throw new java.lang.UnsupportedOperationException("Failed to create rich media");
        }
    }

    /* renamed from: _deselectFeatureAsync */
    private native int m102854xc6365962(int i17);

    /* renamed from: _getCurrentPositionMsFeatureData */
    private native int m102855x12292dcf(long j17, int[] iArr, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26439x15a9e08b c26439x15a9e08b);

    /* renamed from: _getFeatures */
    private native com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26438x8b800541[] m102856x45737ff4();

    /* renamed from: _nativeSetup */
    private native void m102857x429ccee7();

    /* renamed from: _prepareAsync */
    private native int m102858x8157b94();

    /* renamed from: _release */
    private native void m102859xcd90cec8();

    /* renamed from: _reset */
    private native int m102860xa8928050();

    /* renamed from: _seek */
    private native int m102861x5708757(long j17);

    /* renamed from: _selectFeatureAsync */
    private native int m102862xcc3d36e1(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26441x4bfd5d24 c26441x4bfd5d24);

    /* renamed from: _setInnerProcessorCallback */
    private native void m102863x6b19b2c4(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26434xd2c4ad2d interfaceC26434xd2c4ad2d);

    /* renamed from: _setPlaybackRate */
    private native int m102864x9d26f4de(float f17);

    /* renamed from: _setProcessorCallback */
    private native void m102865x44decd94(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26436x7a19358b interfaceC26436x7a19358b);

    /* renamed from: _setRichMediaSource */
    private native int m102866xc1025880(java.lang.String str);

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726
    /* renamed from: deselectFeatureAsync */
    public void mo102815x19733e83(int i17) {
        try {
            int m102854xc6365962 = m102854xc6365962(i17);
            if (m102854xc6365962 == 0) {
                return;
            }
            if (m102854xc6365962 == 1000012) {
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalStateException("deSelectAsync:" + m102854xc6365962);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726
    /* renamed from: getCurrentPositionMsFeatureData */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26439x15a9e08b mo102816x88417a0e(long j17, int[] iArr) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26439x15a9e08b c26439x15a9e08b = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26439x15a9e08b();
        try {
            int m102855x12292dcf = m102855x12292dcf(j17, iArr, c26439x15a9e08b);
            if (m102855x12292dcf == 0) {
                return c26439x15a9e08b;
            }
            if (m102855x12292dcf == 1000012) {
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalStateException("getCurrentTimeContent:" + m102855x12292dcf);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return null;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726
    /* renamed from: getFeatures */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26438x8b800541[] mo102817x6a8721b3() {
        try {
            return m102856x45737ff4();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26438x8b800541[0];
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726
    /* renamed from: prepareAsync */
    public void mo102818x857611b5() {
        try {
            int m102858x8157b94 = m102858x8157b94();
            if (m102858x8157b94 == 0) {
                return;
            }
            throw new java.lang.IllegalStateException("prepareAsync:" + m102858x8157b94);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726
    /* renamed from: release */
    public void mo102819x41012807() {
        try {
            m102859xcd90cec8();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726
    /* renamed from: reset */
    public void mo102820x6761d4f() {
        try {
            int m102860xa8928050 = m102860xa8928050();
            if (m102860xa8928050 == 0) {
                return;
            }
            throw new java.lang.IllegalStateException("reset:" + m102860xa8928050);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726
    /* renamed from: seek */
    public void mo102821x35ce78(long j17) {
        try {
            int m102861x5708757 = m102861x5708757(j17);
            if (m102861x5708757 == 0) {
                return;
            }
            if (m102861x5708757 == 1000012) {
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalStateException("seek:" + m102861x5708757);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726
    /* renamed from: selectFeatureAsync */
    public void mo102822x7a02f042(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26441x4bfd5d24 c26441x4bfd5d24) {
        try {
            int m102862xcc3d36e1 = m102862xcc3d36e1(i17, c26441x4bfd5d24);
            if (m102862xcc3d36e1 == 0) {
                return;
            }
            if (m102862xcc3d36e1 == 1000012) {
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalStateException("selectAsync:" + m102862xcc3d36e1);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726
    /* renamed from: setInnerProcessorCallback */
    public void mo102823xbb73da43(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26434xd2c4ad2d interfaceC26434xd2c4ad2d) {
        try {
            m102863x6b19b2c4(interfaceC26434xd2c4ad2d);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726
    /* renamed from: setPlaybackRate */
    public void mo102824xe8059f1d(float f17) {
        try {
            int m102864x9d26f4de = m102864x9d26f4de(f17);
            if (m102864x9d26f4de == 0) {
                return;
            }
            if (m102864x9d26f4de == 1000012) {
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalStateException("setPlaybackRate:" + m102864x9d26f4de);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726
    /* renamed from: setProcessorCallback */
    public void mo102825x981bb2b5(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26436x7a19358b interfaceC26436x7a19358b) {
        try {
            m102865x44decd94(interfaceC26436x7a19358b);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.InterfaceC26435xdb813726
    /* renamed from: setRichMediaSource */
    public void mo102826x6ec811e1(java.lang.String str) {
        try {
            int m102866xc1025880 = m102866xc1025880(str);
            if (m102866xc1025880 == 0) {
                return;
            }
            if (m102866xc1025880 == 1000012) {
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalStateException("setRichMediaSource:" + m102866xc1025880);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }
}
