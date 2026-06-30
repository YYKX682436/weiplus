package com.p314xaae8f345.p373xbe494963.p389xacf8107c;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::manager")
/* renamed from: com.tencent.liteav.beauty.TXBeautyManagerImpl */
/* loaded from: classes16.dex */
public class C3786x3af8072d implements com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d {

    /* renamed from: mNativeBeautyManager */
    private long f14793xd3115f0d;

    public C3786x3af8072d(long j17) {
        this.f14793xd3115f0d = j17;
    }

    /* renamed from: nativeDestroy */
    private static native void m29622x23caefe3(long j17);

    /* renamed from: nativeEnableSharpnessEnhancement */
    private static native void m29623x61c268a5(long j17, boolean z17);

    /* renamed from: nativeSetBeautyLevel */
    private static native void m29624x11b8ea9d(long j17, float f17);

    /* renamed from: nativeSetBeautyStyle */
    private static native void m29625x12226cca(long j17, int i17);

    /* renamed from: nativeSetChinLevel */
    private static native int m29626xb00fa0cf(long j17, float f17);

    /* renamed from: nativeSetEyeAngleLevel */
    private static native int m29627x74428477(long j17, float f17);

    /* renamed from: nativeSetEyeDistanceLevel */
    private static native int m29628x7d6f84c9(long j17, float f17);

    /* renamed from: nativeSetEyeLightenLevel */
    private static native int m29629xd685830b(long j17, float f17);

    /* renamed from: nativeSetEyeScaleLevel */
    private static native int m29630xd334a660(long j17, float f17);

    /* renamed from: nativeSetFaceBeautyLevel */
    private static native int m29631xd5c3ed80(long j17, float f17);

    /* renamed from: nativeSetFaceNarrowLevel */
    private static native int m29632x94558901(long j17, float f17);

    /* renamed from: nativeSetFaceShortLevel */
    private static native int m29633x751d2c50(long j17, float f17);

    /* renamed from: nativeSetFaceSlimLevel */
    private static native int m29634xadcacb5f(long j17, float f17);

    /* renamed from: nativeSetFaceVLevel */
    private static native int m29635xe52b5096(long j17, float f17);

    /* renamed from: nativeSetFilter */
    private static native void m29636xf2b81c23(long j17, android.graphics.Bitmap bitmap);

    /* renamed from: nativeSetFilterStrength */
    private static native void m29637xead6fd84(long j17, float f17);

    /* renamed from: nativeSetForeheadLevel */
    private static native int m29638x6ecfb93d(long j17, float f17);

    /* renamed from: nativeSetGreenScreenFile */
    private static native int m29639x2d9c5720(long j17, java.lang.String str);

    /* renamed from: nativeSetLipsThicknessLevel */
    private static native int m29640x1a9df0fb(long j17, float f17);

    /* renamed from: nativeSetMotionMute */
    private static native void m29641x94f5be1a(long j17, boolean z17);

    /* renamed from: nativeSetMotionTmpl */
    private static native void m29642x94f8ce36(long j17, java.lang.String str);

    /* renamed from: nativeSetMouthShapeLevel */
    private static native int m29643xc4da443f(long j17, float f17);

    /* renamed from: nativeSetNosePositionLevel */
    private static native int m29644x14af993d(long j17, float f17);

    /* renamed from: nativeSetNoseSlimLevel */
    private static native int m29645xdbe536a9(long j17, float f17);

    /* renamed from: nativeSetNoseWingLevel */
    private static native int m29646xf395809b(long j17, float f17);

    /* renamed from: nativeSetPounchRemoveLevel */
    private static native int m29647x9a1b6c58(long j17, float f17);

    /* renamed from: nativeSetRuddyLevel */
    private static native void m29648x5ca9d979(long j17, float f17);

    /* renamed from: nativeSetSmileLinesRemoveLevel */
    private static native int m29649x123683fe(long j17, float f17);

    /* renamed from: nativeSetToothWhitenLevel */
    private static native int m29650x84109022(long j17, float f17);

    /* renamed from: nativeSetWhitenessLevel */
    private static native void m29651xad27470f(long j17, float f17);

    /* renamed from: nativeSetWrinkleRemoveLevel */
    private static native int m29652xc1359907(long j17, float f17);

    /* renamed from: clear */
    public void m29653x5a5b64d() {
        this.f14793xd3115f0d = 0L;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: enableSharpnessEnhancement */
    public void mo29592x4ea5fb2e(boolean z17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 != 0) {
            m29623x61c268a5(j17, z17);
        }
    }

    /* renamed from: finalize */
    public void m29654xd764dc1e() {
        super.finalize();
        long j17 = this.f14793xd3115f0d;
        if (j17 != 0) {
            m29622x23caefe3(j17);
            this.f14793xd3115f0d = 0L;
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setBeautyLevel */
    public void mo29593x43c542a6(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 != 0) {
            m29624x11b8ea9d(j17, f17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setBeautyStyle */
    public void mo29594x442ec4d3(int i17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 != 0) {
            m29625x12226cca(j17, i17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setChinLevel */
    public int mo29595x58346718(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29626xb00fa0cf(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setEyeAngleLevel */
    public int mo29596x5498fe40(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29627x74428477(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setEyeDistanceLevel */
    public int mo29597xecb5ca60(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29628x7d6f84c9(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setEyeLightenLevel */
    public int mo29598xfb24ae94(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29629xd685830b(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setEyeScaleLevel */
    public int mo29599xb38b2029(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29630xd334a660(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setFaceBeautyLevel */
    public int mo29600xfa631909(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29631xd5c3ed80(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setFaceNarrowLevel */
    public int mo29601xb8f4b48a(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29632x94558901(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setFaceShortLevel */
    public int mo29602x9f95eba7(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29633x751d2c50(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setFaceSlimLevel */
    public int mo29603x8e214528(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29634xadcacb5f(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setFaceVLevel */
    public int mo29604x419f536d(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29635xe52b5096(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setFilter */
    public void mo29605xc55227a(android.graphics.Bitmap bitmap) {
        long j17 = this.f14793xd3115f0d;
        if (j17 != 0) {
            m29636xf2b81c23(j17, bitmap);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setFilterStrength */
    public void mo29606x154fbcdb(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 != 0) {
            m29637xead6fd84(j17, f17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setForeheadLevel */
    public int mo29607x4f263306(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29638x6ecfb93d(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setGreenScreenFile */
    public int mo29608x523b82a9(java.lang.String str) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29639x2d9c5720(j17, str);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setLipsThicknessLevel */
    public int mo29609xd1692cd2(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29640x1a9df0fb(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setMotionMute */
    public void mo29610xf169c0f1(boolean z17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 != 0) {
            m29641x94f5be1a(j17, z17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setMotionTmpl */
    public void mo29611xf16cd10d(java.lang.String str) {
        long j17 = this.f14793xd3115f0d;
        if (j17 != 0) {
            m29642x94f8ce36(j17, str);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setMouthShapeLevel */
    public int mo29612xe9796fc8(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29643xc4da443f(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setNosePositionLevel */
    public int mo29613x8e320686(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29644x14af993d(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setNoseSlimLevel */
    public int mo29614xbc3bb072(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29645xdbe536a9(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setNoseWingLevel */
    public int mo29615xd3ebfa64(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29646xf395809b(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setPounchRemoveLevel */
    public int mo29616x139dd9a1(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29647x9a1b6c58(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setRuddyLevel */
    public void mo29617xb91ddc50(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 != 0) {
            m29648x5ca9d979(j17, f17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setSmileLinesRemoveLevel */
    public int mo29618xfebf24c7(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29649x123683fe(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setToothWhitenLevel */
    public int mo29619xf356d5b9(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29650x84109022(j17, f17);
        return 0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setWhitenessLevel */
    public void mo29620xd7a00666(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 != 0) {
            m29651xad27470f(j17, f17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d
    /* renamed from: setWrinkleRemoveLevel */
    public int mo29621x7800d4de(float f17) {
        long j17 = this.f14793xd3115f0d;
        if (j17 == 0) {
            return 0;
        }
        m29652xc1359907(j17, f17);
        return 0;
    }
}
