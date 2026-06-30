package com.p314xaae8f345.p373xbe494963.p393x32b0ec;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.live.V2TXLivePlayerJni */
/* loaded from: classes16.dex */
public class C3798x48cd8f38 extends com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d {
    private static final java.lang.String TAG = "V2TXLivePlayerJni";

    /* renamed from: mClearLastImage */
    private boolean f14832x296a8e65 = true;

    /* renamed from: mNativeV2TXLivePlayerJni */
    protected long f14833x3a073cd4;

    /* renamed from: mObserver */
    private com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 f14834x39c4fa63;

    /* renamed from: mProxy */
    private com.p314xaae8f345.p420x6236cc6.p421x316220.C3881xd0e3e0ed f14835xbe9d1601;

    /* renamed from: com.tencent.liteav.live.V2TXLivePlayerJni$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128014a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f128015b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f128016c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f128017d;

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f128018e;

        static {
            int[] iArr = new int[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.m29578xcee59d22().length];
            f128018e = iArr;
            try {
                iArr[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128018e[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f128018e[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_180.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f128018e[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.m30958xcee59d22().length];
            f128017d = iArr2;
            try {
                iArr2[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_BUFFER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f128017d[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f128017d[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.TEXTURE_2D.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.m30954xcee59d22().length];
            f128016c = iArr3;
            try {
                iArr3[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.I420.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f128016c[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode.m31862xcee59d22().length];
            f128015b = iArr4;
            try {
                iArr4[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode.V2TXLiveFillModeFill.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f128015b[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode.V2TXLiveFillModeScaleFill.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            int[] iArr5 = new int[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation.m31884xcee59d22().length];
            f128014a = iArr5;
            try {
                iArr5[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation.V2TXLiveRotation90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                f128014a[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation.V2TXLiveRotation180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                f128014a[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation.V2TXLiveRotation270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
        }
    }

    public C3798x48cd8f38(android.content.Context context, com.p314xaae8f345.p420x6236cc6.p421x316220.C3881xd0e3e0ed c3881xd0e3e0ed) {
        this.f14833x3a073cd4 = 0L;
        this.f14835xbe9d1601 = c3881xd0e3e0ed;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29241x91f62b6f(context.getApplicationContext());
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29246xa5f59752("liteav");
        this.f14833x3a073cd4 = m29955x73c02ff3(new java.lang.ref.WeakReference(this));
    }

    /* renamed from: enableExtensionCallback */
    private void m29952xc2336261(boolean z17) {
        synchronized (this) {
            m29958x9147c04a(this.f14833x3a073cd4, z17);
        }
    }

    /* renamed from: getJavaV2TXLivePlayerStatistics */
    public static com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePlayerStatistics m29953x55aeecc8(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int i66) {
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePlayerStatistics v2TXLivePlayerStatistics = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePlayerStatistics();
        v2TXLivePlayerStatistics.f15355xabe44fc7 = i17;
        v2TXLivePlayerStatistics.f15363x434cb4f9 = i18;
        v2TXLivePlayerStatistics.rtt = i19;
        v2TXLivePlayerStatistics.f15368x6be2dc6 = i27;
        v2TXLivePlayerStatistics.f15360xb7389127 = i28;
        v2TXLivePlayerStatistics.fps = i29;
        v2TXLivePlayerStatistics.f15364xf1220e72 = i37;
        v2TXLivePlayerStatistics.f15356x9b599ab7 = i38;
        v2TXLivePlayerStatistics.f15358xa8c62841 = i39;
        v2TXLivePlayerStatistics.f15366x5299d6a6 = i47;
        v2TXLivePlayerStatistics.f15361xa6b12897 = i48;
        v2TXLivePlayerStatistics.f15359xeab8278c = i49;
        v2TXLivePlayerStatistics.f15357x4166ebd7 = i57;
        v2TXLivePlayerStatistics.f15367xc941b71 = i58;
        v2TXLivePlayerStatistics.f15365x46e15cd2 = i59;
        v2TXLivePlayerStatistics.f15362x4c4ee0aa = i66;
        return v2TXLivePlayerStatistics;
    }

    /* renamed from: getStreamListFormJsonString */
    private static java.util.ArrayList<com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveStreamInfo> m29954x479e7c51(java.lang.String str) {
        java.util.ArrayList<com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveStreamInfo> arrayList = new java.util.ArrayList<>();
        if (str != null && !str.isEmpty()) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    arrayList.add(new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveStreamInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getInt(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63), (float) jSONObject.getDouble(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37652x913da09d), jSONObject.getString("url")));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: nativeCreate */
    private static native long m29955x73c02ff3(java.lang.ref.WeakReference<com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3798x48cd8f38> weakReference);

    /* renamed from: nativeDestroy */
    private static native void m29956x23caefe3(long j17);

    /* renamed from: nativeEnableCustomRendering */
    private static native int m29957xd4620a41(long j17, boolean z17, int i17, int i18);

    /* renamed from: nativeEnableExtensionCallback */
    private static native void m29958x9147c04a(long j17, boolean z17);

    /* renamed from: nativeEnableObserveAudioFrame */
    private static native int m29959xb007dc19(long j17, boolean z17);

    /* renamed from: nativeEnableReceiveSeiMessage */
    private static native int m29960x5eedb999(long j17, boolean z17, int i17);

    /* renamed from: nativeEnableVolumeEvaluation */
    private static native int m29961x516df690(long j17, int i17);

    /* renamed from: nativeGetStreamList */
    private static native java.lang.String m29962x4a92695d(long j17);

    /* renamed from: nativeIsPlaying */
    private static native int m29963xa669114d(long j17);

    /* renamed from: nativePauseAudio */
    private static native int m29964xe1860af7(long j17);

    /* renamed from: nativePauseVideo */
    private static native int m29965xe2a8839c(long j17);

    /* renamed from: nativeResumeAudio */
    private static native int m29966xd32f2b12(long j17);

    /* renamed from: nativeResumeVideo */
    private static native int m29967xd451a3b7(long j17);

    /* renamed from: nativeSetCacheParams */
    private static native int m29968x594acddd(long j17, float f17, float f18);

    /* renamed from: nativeSetPlayoutVolume */
    private static native int m29969x3e7ac849(long j17, int i17);

    /* renamed from: nativeSetProperty */
    private static native int m29970x14ebafc0(long j17, java.lang.String str, java.lang.Object obj);

    /* renamed from: nativeSetRenderFillMode */
    private static native int m29971xf20b4f27(long j17, int i17);

    /* renamed from: nativeSetRenderRotation */
    private static native int m29972x1b1c34df(long j17, int i17);

    /* renamed from: nativeSetRenderView */
    private static native int m29973x71e3886(long j17, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3 c3826xc46e8cd3);

    /* renamed from: nativeSetSharedEGLContext */
    private static native void m29974x19964f75(long j17, java.lang.Object obj);

    /* renamed from: nativeShowDebugView */
    private static native void m29975x71823244(long j17, boolean z17);

    /* renamed from: nativeSnapshot */
    private static native int m29976x28ed82fb(long j17);

    /* renamed from: nativeStartPlay */
    private static native int m29977x6776bc5f(long j17, java.lang.String str);

    /* renamed from: nativeStartRecord */
    private static native int m29978x67c0febc(long j17, java.lang.String str, int i17, int i18);

    /* renamed from: nativeStopPlay */
    private static native int m29979x7e26e38d(long j17, boolean z17);

    /* renamed from: nativeStopRecord */
    private static native void m29980x9304126a(long j17);

    /* renamed from: nativeSwitchStream */
    private static native int m29981xa1eff58b(long j17, java.lang.String str);

    /* renamed from: weakToStrongReference */
    public static com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3798x48cd8f38 m29982x259965e1(java.lang.ref.WeakReference<com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3798x48cd8f38> weakReference) {
        return weakReference.get();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: enableObserveAudioFrame */
    public int mo29983xe0f37e30(boolean z17) {
        return m29959xb007dc19(this.f14833x3a073cd4, z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: enableObserveVideoFrame */
    public int mo29984x242ba4ab(boolean z17, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat v2TXLivePixelFormat, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType v2TXLiveBufferType) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType pixelFormatType;
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a aVar;
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat v2TXLivePixelFormat2 = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        if (v2TXLivePixelFormat == v2TXLivePixelFormat2 && v2TXLiveBufferType == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray) {
            pixelFormatType = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.I420;
            aVar = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_ARRAY;
        } else if (v2TXLivePixelFormat == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D && v2TXLiveBufferType == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeTexture) {
            pixelFormatType = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA;
            aVar = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.TEXTURE_2D;
        } else {
            if (v2TXLivePixelFormat != v2TXLivePixelFormat2 || v2TXLiveBufferType != com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Enable custom render failed, invalid params. format:" + v2TXLivePixelFormat + " type:" + v2TXLiveBufferType);
                return -4;
            }
            pixelFormatType = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.I420;
            aVar = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_BUFFER;
        }
        return m29957xd4620a41(this.f14833x3a073cd4, z17, pixelFormatType.m30955x754a37bb(), aVar.ordinal());
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: enableReceiveSeiMessage */
    public int mo29985x8fd95bb0(boolean z17, int i17) {
        return m29960x5eedb999(this.f14833x3a073cd4, z17, i17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: enableVolumeEvaluation */
    public int mo29986x740a3599(int i17) {
        return m29961x516df690(this.f14833x3a073cd4, i17);
    }

    /* renamed from: finalize */
    public void m29987xd764dc1e() {
        m29956x23caefe3(this.f14833x3a073cd4);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: getStreamList */
    public java.util.ArrayList<com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveStreamInfo> mo29988xa7066c34() {
        return m29954x479e7c51(m29962x4a92695d(this.f14833x3a073cd4));
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: isPlaying */
    public int mo29989xc00617a4() {
        return m29963xa669114d(this.f14833x3a073cd4);
    }

    /* renamed from: onAudioLoading */
    public void m29990x2ac58c05(android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31674x2ac58c05(this.f14835xbe9d1601, bundle);
        }
    }

    /* renamed from: onAudioPlaying */
    public void m29991xf9497af7(boolean z17, android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31675xf9497af7(this.f14835xbe9d1601, z17, bundle);
        }
    }

    /* renamed from: onConnected */
    public void m29992xdba42fea(android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31676xdba42fea(this.f14835xbe9d1601, bundle);
        }
    }

    /* renamed from: onError */
    public void m29993xaf8aa769(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31677xaf8aa769(this.f14835xbe9d1601, i17, str, bundle);
        }
    }

    /* renamed from: onNetworkQuality */
    public void m29994xf01276b0(int i17) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 == null || !(abstractC3876x3753a323 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.a)) {
            return;
        }
        ((com.p314xaae8f345.p420x6236cc6.p421x316220.a.a) abstractC3876x3753a323).mo31926xf01276b0(i17);
    }

    /* renamed from: onPlayEvent */
    public void m29995x8cd414a7(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 == null || !(abstractC3876x3753a323 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.a)) {
            return;
        }
        ((com.p314xaae8f345.p420x6236cc6.p421x316220.a.a) abstractC3876x3753a323).mo31927x8cd414a7(i17, bundle);
    }

    /* renamed from: onPlayNetStatus */
    public void m29996x61e7cf7c(android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 == null || !(abstractC3876x3753a323 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.a)) {
            return;
        }
        ((com.p314xaae8f345.p420x6236cc6.p421x316220.a.a) abstractC3876x3753a323).mo31928x61e7cf7c(bundle);
    }

    /* renamed from: onPlayoutAudioFrame */
    public void m29997x8916a52(byte[] bArr, int i17, int i18) {
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame v2TXLiveAudioFrame = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.f15296x2eefaa = bArr;
        v2TXLiveAudioFrame.f15297x88751aa = i17;
        v2TXLiveAudioFrame.f15295x2c0b7d03 = i18;
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.m31896x8916a52(this.f14835xbe9d1601, v2TXLiveAudioFrame);
        }
    }

    /* renamed from: onPlayoutVolumeUpdate */
    public void m29998x4b08ccde(int i17) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31678x4b08ccde(this.f14835xbe9d1601, i17);
        }
    }

    /* renamed from: onReceiveSeiMessage */
    public void m29999x5d08b6d4(int i17, byte[] bArr) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31679x5d08b6d4(this.f14835xbe9d1601, i17, bArr);
        }
    }

    /* renamed from: onRecordBegin */
    public void m30000x6975af79(int i17, java.lang.String str) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.m31893x795c626c(this.f14835xbe9d1601, i17, str);
        }
    }

    /* renamed from: onRecordComplete */
    public void m30001xf9aec869(int i17, java.lang.String str) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.m31894x69614c96(this.f14835xbe9d1601, i17, str);
        }
    }

    /* renamed from: onRecordProgress */
    public void m30002xe1be595d(long j17, java.lang.String str) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.m31895x92f8e85(this.f14835xbe9d1601, j17, str);
        }
    }

    /* renamed from: onRenderVideoFrame */
    public void m30003x3cf387e7(int i17, int i18, java.lang.Object obj, int i19, int i27, int i28, int i29, long j17, byte[] bArr, java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame();
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType a17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.a(i17);
        int i37 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3798x48cd8f38.AnonymousClass1.f128016c[a17.ordinal()];
        if (i37 == 1) {
            v2TXLiveVideoFrame.f15419xa0fe3a1d = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        } else if (i37 != 2) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Invalid pixelFormat. pixelFormat:" + a17 + ".");
        } else {
            v2TXLiveVideoFrame.f15419xa0fe3a1d = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a a18 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.a(i18);
        int i38 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3798x48cd8f38.AnonymousClass1.f128017d[a18.ordinal()];
        if (i38 == 1) {
            v2TXLiveVideoFrame.f15416x719f779a = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
        } else if (i38 == 2) {
            v2TXLiveVideoFrame.f15416x719f779a = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
        } else if (i38 != 3) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Invalid bufferType. bufferType:" + a18 + ".");
        } else {
            v2TXLiveVideoFrame.f15416x719f779a = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeTexture;
        }
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTexture v2TXLiveTexture = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTexture();
        v2TXLiveTexture.f15397xc35d0396 = i19;
        if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            v2TXLiveTexture.f15395x5f488f24 = (javax.microedition.khronos.egl.EGLContext) obj;
        } else if (obj instanceof android.opengl.EGLContext) {
            v2TXLiveTexture.f15396x5f488f28 = (android.opengl.EGLContext) obj;
        }
        v2TXLiveVideoFrame.f15421xab7dd51b = v2TXLiveTexture;
        v2TXLiveVideoFrame.f15417x2eefaa = bArr;
        v2TXLiveVideoFrame.f15415xaddb9440 = byteBuffer;
        v2TXLiveVideoFrame.f15422x6be2dc6 = i27;
        v2TXLiveVideoFrame.f15418xb7389127 = i28;
        int i39 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3798x48cd8f38.AnonymousClass1.f128018e[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(i29).ordinal()];
        if (i39 == 1) {
            v2TXLiveVideoFrame.f15420xfd990f7e = 0;
        } else if (i39 == 2) {
            v2TXLiveVideoFrame.f15420xfd990f7e = 90;
        } else if (i39 == 3) {
            v2TXLiveVideoFrame.f15420xfd990f7e = 180;
        } else if (i39 != 4) {
            v2TXLiveVideoFrame.f15420xfd990f7e = 0;
        } else {
            v2TXLiveVideoFrame.f15420xfd990f7e = 270;
        }
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31680x3cf387e7(this.f14835xbe9d1601, v2TXLiveVideoFrame);
        }
    }

    /* renamed from: onSnapshotComplete */
    public void m30004x7ddd1b1c(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31681x7ddd1b1c(this.f14835xbe9d1601, bitmap);
        }
    }

    /* renamed from: onStatisticsUpdate */
    public void m30005x7935e3cb(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePlayerStatistics v2TXLivePlayerStatistics) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31682x7935e3cb(this.f14835xbe9d1601, v2TXLivePlayerStatistics);
        }
    }

    /* renamed from: onStreamSwitched */
    public void m30006x93e0a232(int i17, java.lang.String str) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.m31897x93e0a232(this.f14835xbe9d1601, str, i17);
        }
    }

    /* renamed from: onVideoLoading */
    public void m30007x808dffc0(android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31683x808dffc0(this.f14835xbe9d1601, bundle);
        }
    }

    /* renamed from: onVideoPlaying */
    public void m30008x4f11eeb2(boolean z17, android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31684x4f11eeb2(this.f14835xbe9d1601, z17, bundle);
        }
    }

    /* renamed from: onVideoResolutionChanged */
    public void m30009xc6f171ec(int i17, int i18) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31685xc6f171ec(this.f14835xbe9d1601, i17, i18);
        }
    }

    /* renamed from: onWarning */
    public void m30010x92abb0bd(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323 = this.f14834x39c4fa63;
        if (abstractC3876x3753a323 != null) {
            abstractC3876x3753a323.mo31686x92abb0bd(this.f14835xbe9d1601, i17, str, bundle);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: pauseAudio */
    public int mo30011xfb89cf80() {
        return m29964xe1860af7(this.f14833x3a073cd4);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: pauseVideo */
    public int mo30012xfcac4825() {
        return m29965xe2a8839c(this.f14833x3a073cd4);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: resumeAudio */
    public int mo30013xf9a3f7a9() {
        return m29966xd32f2b12(this.f14833x3a073cd4);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: resumeVideo */
    public int mo30014xfac6704e() {
        return m29967xd451a3b7(this.f14833x3a073cd4);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: setCacheParams */
    public int mo30015x8b5725e6(float f17, float f18) {
        if (f17 < 0.0f || f18 < 0.0f) {
            return -2;
        }
        return m29968x594acddd(this.f14833x3a073cd4, f17, f18);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: setObserver */
    public void mo30016x8b59f158(com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323) {
        this.f14834x39c4fa63 = abstractC3876x3753a323;
        if (abstractC3876x3753a323 == null || !(abstractC3876x3753a323 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.a)) {
            return;
        }
        m29952xc2336261(true);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: setPlayoutVolume */
    public int mo30017x1ed14212(int i17) {
        return m29969x3e7ac849(this.f14833x3a073cd4, i17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: setProperty */
    public int mo30018x3b607c57(java.lang.String str, java.lang.Object obj) {
        char c17;
        synchronized (this) {
            switch (str.hashCode()) {
                case 480042124:
                    if (str.equals(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15458xebbebcb3)) {
                        c17 = 2;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 582452376:
                    if (str.equals(com.p314xaae8f345.p420x6236cc6.p421x316220.C3882xa9b84921.f15460xf1d964bf)) {
                        c17 = 0;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 1120433643:
                    if (str.equals(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15457x14b68192)) {
                        c17 = 1;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 1615550654:
                    if (str.equals(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15455xee75cb25)) {
                        c17 = 3;
                        break;
                    }
                    c17 = 65535;
                    break;
                default:
                    c17 = 65535;
                    break;
            }
            if (c17 != 0) {
                if (c17 == 1) {
                    if (obj == null) {
                        return m29973x71e3886(this.f14833x3a073cd4, null);
                    }
                    if (obj instanceof android.view.Surface) {
                        return m29973x71e3886(this.f14833x3a073cd4, new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3((android.view.Surface) obj));
                    }
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                    return -2;
                }
                if (c17 == 2) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "set surface size is unnecessary");
                } else {
                    if (c17 != 3) {
                        return m29970x14ebafc0(this.f14833x3a073cd4, str, obj);
                    }
                    if (!(obj instanceof javax.microedition.khronos.egl.EGLContext) && !(obj instanceof android.opengl.EGLContext)) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                        return -2;
                    }
                    m29974x19964f75(this.f14833x3a073cd4, obj);
                }
            } else {
                if (!(obj instanceof java.lang.Boolean)) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                    return -2;
                }
                this.f14832x296a8e65 = ((java.lang.Boolean) obj).booleanValue();
            }
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: setRenderFillMode */
    public int mo30019x1c840e7e(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode v2TXLiveFillMode) {
        int i17 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3798x48cd8f38.AnonymousClass1.f128015b[v2TXLiveFillMode.ordinal()];
        return m29971xf20b4f27(this.f14833x3a073cd4, (i17 != 1 ? i17 != 2 ? com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FIT_CENTER : com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FILL : com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP).f14883xbee9dd04);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: setRenderRotation */
    public int mo30020x4594f436(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation v2TXLiveRotation) {
        int i17 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3798x48cd8f38.AnonymousClass1.f128014a[v2TXLiveRotation.ordinal()];
        return m29972x1b1c34df(this.f14833x3a073cd4, (i17 != 1 ? i17 != 2 ? i17 != 3 ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270 : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_180 : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90).f14773xbee9dd04);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: setRenderView */
    public int mo30023x63923b5d(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        return m29973x71e3886(this.f14833x3a073cd4, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null ? new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) : null);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: showDebugView */
    public void mo30024xcdf6351b(boolean z17) {
        m29975x71823244(this.f14833x3a073cd4, z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: snapshot */
    public int mo30025x10fad5c4() {
        return m29976x28ed82fb(this.f14833x3a073cd4);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: startLivePlay */
    public int mo30026x5c1200c2(java.lang.String str) {
        return m29977x6776bc5f(this.f14833x3a073cd4, str);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: startLocalRecording */
    public int mo30027xcf0b23c8(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        if (v2TXLiveLocalRecordingParams == null || android.text.TextUtils.isEmpty(v2TXLiveLocalRecordingParams.f15319xd426afc1)) {
            return -2;
        }
        return m29978x67c0febc(this.f14833x3a073cd4, v2TXLiveLocalRecordingParams.f15319xd426afc1, v2TXLiveLocalRecordingParams.f15321x2bca8994.ordinal(), v2TXLiveLocalRecordingParams.f15320x21ffe4c5);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: stopLocalRecording */
    public void mo30028x97678f68() {
        m29980x9304126a(this.f14833x3a073cd4);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: stopPlay */
    public int mo30029x66343656() {
        return m29979x7e26e38d(this.f14833x3a073cd4, this.f14832x296a8e65);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: switchStream */
    public int mo30030x4a14bbd4(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            return m29981xa1eff58b(this.f14833x3a073cd4, str);
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Invalid params.");
        return -2;
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: setRenderView */
    public int mo30022x63923b5d(android.view.TextureView textureView) {
        return m29973x71e3886(this.f14833x3a073cd4, textureView != null ? new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3(textureView) : null);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d
    /* renamed from: setRenderView */
    public int mo30021x63923b5d(android.view.SurfaceView surfaceView) {
        return m29973x71e3886(this.f14833x3a073cd4, surfaceView != null ? new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3(surfaceView) : null);
    }
}
