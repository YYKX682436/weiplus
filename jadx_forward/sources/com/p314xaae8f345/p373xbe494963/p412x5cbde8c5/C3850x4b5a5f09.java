package com.p314xaae8f345.p373xbe494963.p412x5cbde8c5;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer2.HardwareVideoEncoder2 */
/* loaded from: classes14.dex */
public class C3850x4b5a5f09 {

    /* renamed from: mEGLCore */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 f15085xfa65459c;

    /* renamed from: mInputSurface */
    private android.view.Surface f15086x63e9ce90;

    /* renamed from: mNativeHandler */
    private long f15087x4b50afc6;

    /* renamed from: mParams */
    private final com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 f15089x14172053;

    /* renamed from: mPixelFrameRenderer */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.h f15090x68813b7;

    /* renamed from: mServerConfig */
    private com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3849xf5339e12 f15092xedddf972;

    /* renamed from: mSharedContext */
    private java.lang.Object f15094x82565e1d;

    /* renamed from: mSurfaceInputVideoEncoder */
    private com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b f15095xd90ff56b;

    /* renamed from: mTAG */
    private java.lang.String f15097x32cfed;

    /* renamed from: mTraceId */
    private java.lang.String f15099x5e797013;

    /* renamed from: mSurfaceSize */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 f15096x566e33a1 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(0, 0);

    /* renamed from: mNeedRestart */
    private final java.util.concurrent.atomic.AtomicBoolean f15088xbce409ec = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: mSessionStates */
    private final android.os.Bundle f15093x528e7ccb = new android.os.Bundle();

    /* renamed from: mThrottlers */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b f15098xc7e76f38 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b();

    /* renamed from: mPreFrameTimeStamp */
    private long f15091xf058269f = 0;

    /* renamed from: mVideoEncoderListener */
    private final com.tencent.liteav.videoproducer.encoder.e.a f15100xafa34c02 = new com.tencent.liteav.videoproducer.encoder.e.a() { // from class: com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.1
        @Override // com.tencent.liteav.videoproducer.encoder.e.a
        public final void a() {
            com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3850x4b5a5f09.this.f15088xbce409ec.set(true);
        }

        @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.b
        /* renamed from: onBitrateModeUpdated */
        public final void mo31507x6d6a182a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode bitrateMode) {
            com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3850x4b5a5f09 c3850x4b5a5f09 = com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3850x4b5a5f09.this;
            c3850x4b5a5f09.m31559xf3e7aae1(c3850x4b5a5f09.f15087x4b50afc6, bitrateMode.f15065xbee9dd04);
        }

        @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.b
        /* renamed from: onEncodedFail */
        public final void mo31431x8f5c21ed(com.tencent.liteav.videobase.videobase.e.a aVar) {
            com.tencent.liteav.videobase.videobase.e.a aVar2 = com.tencent.liteav.videobase.videobase.e.a.ERR_CODE_NONE;
            com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3850x4b5a5f09.this.m31568xd95e3a7d();
        }

        @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.b
        /* renamed from: onEncodedNAL */
        public final synchronized void mo31432xa9c9446a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140 c3811xcc176140, boolean z17) {
            if (com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3850x4b5a5f09.this.f15087x4b50afc6 == 0 || z17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3850x4b5a5f09.this.f15097x32cfed, "onEncodedNAL mNativeHandler=%d,isEos=%b", java.lang.Long.valueOf(com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3850x4b5a5f09.this.f15087x4b50afc6), java.lang.Boolean.valueOf(z17));
                return;
            }
            com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3850x4b5a5f09 c3850x4b5a5f09 = com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3850x4b5a5f09.this;
            long j17 = c3850x4b5a5f09.f15087x4b50afc6;
            java.nio.ByteBuffer byteBuffer = c3811xcc176140.f14889x2eefaa;
            int i17 = c3811xcc176140.f14897x668d77f3.f14909xbee9dd04;
            int i18 = c3811xcc176140.f14900xa979083.f14910xbee9dd04;
            int i19 = c3811xcc176140.f14887xbcfd1870.f14886xbee9dd04;
            int i27 = c3811xcc176140.f14902xfd990f7e;
            long j18 = c3811xcc176140.dts;
            long j19 = c3811xcc176140.pts;
            long j27 = c3811xcc176140.f14892x7ec3bd2a;
            long j28 = c3811xcc176140.f14891xd645ce0d;
            long j29 = c3811xcc176140.f14890xeea76b65;
            long j37 = c3811xcc176140.f14901xf807a458;
            int i28 = c3811xcc176140.f14905x6be2dc6;
            int i29 = c3811xcc176140.f14894xb7389127;
            java.lang.Integer num = c3811xcc176140.f14903x925e672e;
            c3850x4b5a5f09.m31561x1a47e21(j17, c3811xcc176140, byteBuffer, i17, i18, i19, i27, j18, j19, j27, j28, j29, j37, i28, i29, num != null, num == null ? 0 : num.intValue());
        }
    };

    public C3850x4b5a5f09(long j17, java.lang.String str, com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 c3846xefe8337) {
        this.f15099x5e797013 = str;
        this.f15097x32cfed = str + "HardwareVideoEncoder2_" + hashCode();
        this.f15087x4b50afc6 = j17;
        this.f15089x14172053 = c3846xefe8337;
    }

    /* renamed from: createPixelFrameByTexture */
    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 m31553x5507cb61(int i17, int i18, int i19, int i27, long j17, int i28, boolean z17, boolean z18, int i29, java.lang.Object obj) {
        int i37 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.TEXTURE_2D.f14885xbee9dd04;
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA.m30955x754a37bb();
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7(i17, i18, 0, i19, i27);
        c3817x73c266a7.m31100x6a716dc5(z17);
        c3817x73c266a7.m31101xf0963d57(z18);
        c3817x73c266a7.mo31106x1f1e3554(i29);
        c3817x73c266a7.m31096x7612fae8(obj);
        c3817x73c266a7.m31105x742bae00(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(i28));
        c3817x73c266a7.m31107x5f0a5ad4(j17);
        return c3817x73c266a7;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[Catch: d -> 0x00b9, TryCatch #0 {d -> 0x00b9, blocks: (B:6:0x0005, B:8:0x0017, B:11:0x0020, B:14:0x0028, B:15:0x0037, B:17:0x0044, B:18:0x004a, B:20:0x0058, B:21:0x0061, B:23:0x007d, B:24:0x009e, B:28:0x002c, B:31:0x0034), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[Catch: d -> 0x00b9, TryCatch #0 {d -> 0x00b9, blocks: (B:6:0x0005, B:8:0x0017, B:11:0x0020, B:14:0x0028, B:15:0x0037, B:17:0x0044, B:18:0x004a, B:20:0x0058, B:21:0x0061, B:23:0x007d, B:24:0x009e, B:28:0x002c, B:31:0x0034), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[Catch: d -> 0x00b9, TryCatch #0 {d -> 0x00b9, blocks: (B:6:0x0005, B:8:0x0017, B:11:0x0020, B:14:0x0028, B:15:0x0037, B:17:0x0044, B:18:0x004a, B:20:0x0058, B:21:0x0061, B:23:0x007d, B:24:0x009e, B:28:0x002c, B:31:0x0034), top: B:5:0x0005 }] */
    /* renamed from: drawFrameToInputSurface */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m31554x87699687(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 r7) {
        /*
            r6 = this;
            com.tencent.liteav.videobase.egl.EGLCore r0 = r6.f15085xfa65459c
            if (r0 != 0) goto L5
            return
        L5:
            r0.m31013x900967ab()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            com.tencent.liteav.videobase.frame.PixelFrame r0 = new com.tencent.liteav.videobase.frame.PixelFrame     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            r0.<init>(r7)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            com.tencent.liteav.base.util.k r7 = r0.m31079x79734cf4()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            com.tencent.liteav.base.util.k r1 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            r2 = 1
            r3 = 0
            if (r7 == r1) goto L2c
            com.tencent.liteav.base.util.k r7 = r0.m31079x79734cf4()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            com.tencent.liteav.base.util.k r1 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            if (r7 != r1) goto L20
            goto L2c
        L20:
            boolean r7 = r0.m31086xe0b3901f()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            if (r7 != 0) goto L27
            goto L28
        L27:
            r2 = r3
        L28:
            r0.m31101xf0963d57(r2)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            goto L37
        L2c:
            boolean r7 = r0.m31085xc8852e8d()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            if (r7 != 0) goto L33
            goto L34
        L33:
            r2 = r3
        L34:
            r0.m31100x6a716dc5(r2)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
        L37:
            com.tencent.liteav.base.util.Size r7 = r6.f15096x566e33a1     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            int r1 = r7.f14764x6be2dc6     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            int r7 = r7.f14763xb7389127     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31164x2199b4ab(r3, r3, r1, r7)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            com.tencent.liteav.videobase.frame.h r7 = r6.f15090x68813b7     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            if (r7 == 0) goto L4a
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r1 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            r2 = 0
            r7.a(r0, r1, r2)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
        L4a:
            com.tencent.liteav.videoproducer.encoder.b r7 = r6.f15095xd90ff56b     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            long r1 = r0.m31081x2b69a60()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            java.util.Deque<java.lang.Long> r3 = r7.f128679i     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            boolean r3 = r3.isEmpty()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            if (r3 == 0) goto L61
            java.util.concurrent.atomic.AtomicLong r3 = r7.f128680j     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            r3.set(r4)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
        L61:
            java.util.Deque<java.lang.Long> r3 = r7.f128679i     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            r3.addLast(r1)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            com.tencent.liteav.base.util.CustomHandler r7 = r7.f128673c     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            r1 = 10
            r2 = 10
            r7.sendEmptyMessageDelayed(r1, r2)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            long r1 = r0.m31081x2b69a60()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            long r3 = r6.f15091xf058269f     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 >= 0) goto L9e
            java.lang.String r7 = r6.f15097x32cfed     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            java.lang.String r2 = "timestamp is not increase. pre: "
            r1.<init>(r2)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            long r2 = r6.f15091xf058269f     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            r1.append(r2)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            java.lang.String r2 = ", cur: "
            r1.append(r2)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            long r2 = r0.m31081x2b69a60()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            r1.append(r2)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            java.lang.String r1 = r1.toString()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(r7, r1)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
        L9e:
            long r1 = r0.m31081x2b69a60()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            r6.f15091xf058269f = r1     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            com.tencent.liteav.videobase.egl.EGLCore r7 = r6.f15085xfa65459c     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            long r2 = r0.m31081x2b69a60()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            long r0 = r1.toNanos(r2)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            r7.m31014xab5ea589(r0)     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            com.tencent.liteav.videobase.egl.EGLCore r7 = r6.f15085xfa65459c     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            r7.m31015x82211f20()     // Catch: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d -> Lb9
            return
        Lb9:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VideoEncode: swapBuffer error, EGLCode:"
            r0.<init>(r1)
            int r1 = r7.f14919x8e53fa28
            r0.append(r1)
            java.lang.String r1 = " message:"
            r0.append(r1)
            java.lang.String r1 = r7.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.liteav.base.b.b r1 = r6.f15098xc7e76f38
            java.lang.String r2 = "EncodeFrameError"
            com.tencent.liteav.base.b.a r1 = r1.a(r2)
            java.lang.String r2 = r6.f15097x32cfed
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "makeCurrent failed. error = "
            java.lang.String r0 = r3.concat(r0)
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(r1, r2, r0, r7)
            r6.m31568xd95e3a7d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3850x4b5a5f09.m31554x87699687(com.tencent.liteav.videobase.frame.PixelFrame):void");
    }

    /* renamed from: getCurrentContext */
    public static java.lang.Object m31555xc88b72ec() {
        return com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31161xc88b72ec();
    }

    /* renamed from: getServerVideoProducerConfig */
    private com.p314xaae8f345.p373xbe494963.p408xb069390d.p411xc42bcf92.C3848xea956a6c m31556x4224a7d6(com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3849xf5339e12 c3849xf5339e12) {
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p411xc42bcf92.C3848xea956a6c c3848xea956a6c = new com.p314xaae8f345.p373xbe494963.p408xb069390d.p411xc42bcf92.C3848xea956a6c();
        c3848xea956a6c.m31528x855eaa7a(c3849xf5339e12.m31538xee33286e());
        c3848xea956a6c.m31530xbc0a2d8(c3849xf5339e12.m31539x3997a5cc());
        c3848xea956a6c.m31531x5db6ad1a(c3849xf5339e12.m31540xeac008a6());
        java.lang.Boolean m31542x4f879e1 = c3849xf5339e12.m31542x4f879e1();
        if (m31542x4f879e1 != null) {
            c3848xea956a6c.m31529x9d74ff19(m31542x4f879e1.booleanValue());
        }
        return c3848xea956a6c;
    }

    /* renamed from: initOpenGLComponents */
    private boolean m31557xc484de55(java.lang.Object obj, android.view.Surface surface) {
        if (surface == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f15098xc7e76f38.a("NoSurface"), this.f15097x32cfed, "init opengl: surface is null.", new java.lang.Object[0]);
            return false;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(this.f15098xc7e76f38.a("initGL"), this.f15097x32cfed, "initOpenGLComponents", new java.lang.Object[0]);
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa9 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9();
        this.f15085xfa65459c = c3814xbf852aa9;
        try {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = this.f15096x566e33a1;
            c3814xbf852aa9.m31012x33ebcb90(obj, surface, c3779x275421.f14764x6be2dc6, c3779x275421.f14763xb7389127);
            this.f15094x82565e1d = obj;
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x2754212 = this.f15096x566e33a1;
            this.f15090x68813b7 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.h(c3779x2754212.f14764x6be2dc6, c3779x2754212.f14763xb7389127);
            return true;
        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15098xc7e76f38.a("initGLError"), this.f15097x32cfed, "create EGLCore failed. error = ".concat(java.lang.String.valueOf("VideoEncode: create EGLCore failed, EGLCode:" + e17.f14919x8e53fa28 + " message:" + e17.getMessage())), e17);
            m31569xfe3974f3();
            this.f15085xfa65459c = null;
            return false;
        }
    }

    /* renamed from: isInUIThread */
    public static boolean m31558x91a2daad() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeOnBitrateModeUpdated */
    public native void m31559xf3e7aae1(long j17, int i17);

    /* renamed from: nativeOnEncodedFail */
    private native void m31560x32e81f16(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeOnEncodedNAL */
    public native void m31561x1a47e21(long j17, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140 c3811xcc176140, java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, long j18, long j19, long j27, long j28, long j29, long j37, int i28, int i29, boolean z17, int i37);

    /* renamed from: nativeOnStartEncodedFail */
    private native void m31562xb76ed400(long j17);

    /* renamed from: restart */
    private boolean m31563x416a9e0f() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(this.f15097x32cfed, "reStart");
        m31565x360802();
        return m31564x68ac462();
    }

    /* renamed from: start */
    private boolean m31564x68ac462() {
        if (this.f15095xd90ff56b != null) {
            return this.f15086x63e9ce90 != null;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15097x32cfed, "Start hw video encoder. %s", this.f15089x14172053);
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b bVar = new com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b(this.f15093x528e7ccb, new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.d(), this.f15099x5e797013);
        this.f15095xd90ff56b = bVar;
        bVar.f128673c = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.myLooper()) { // from class: com.tencent.liteav.videoproducer.encoder.b.1
            public AnonymousClass1(android.os.Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(android.os.Message message) {
                super.handleMessage(message);
                if (message.what == 10) {
                    com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b.this.c();
                }
            }
        };
        this.f15095xd90ff56b.a(m31556x4224a7d6(this.f15092xedddf972));
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b bVar2 = this.f15095xd90ff56b;
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 c3846xefe8337 = this.f15089x14172053;
        com.tencent.liteav.videoproducer.encoder.e.a aVar = this.f15100xafa34c02;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(bVar2.f128671a, "start");
        bVar2.f128675e = aVar;
        android.view.Surface a17 = bVar2.a(c3846xefe8337);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(bVar2.f128671a, "startCodecInternal success");
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1280);
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 c3846xefe83372 = bVar2.f128676f;
        if (c3846xefe83372 != null) {
            c3779x275421.set(c3846xefe83372.f15064x6be2dc6, c3846xefe83372.f15060xb7389127);
        }
        android.util.Pair pair = new android.util.Pair(a17, c3779x275421);
        this.f15086x63e9ce90 = (android.view.Surface) pair.first;
        this.f15096x566e33a1.set((com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421) pair.second);
        if (this.f15086x63e9ce90 != null) {
            return true;
        }
        m31569xfe3974f3();
        return false;
    }

    /* renamed from: stop */
    private void m31565x360802() {
        m31566xa95ca66e();
        android.view.Surface surface = this.f15086x63e9ce90;
        if (surface != null) {
            surface.release();
            this.f15086x63e9ce90 = null;
        }
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b bVar = this.f15095xd90ff56b;
        if (bVar != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(bVar.f128671a, "stop");
            bVar.b();
            bVar.a();
            this.f15095xd90ff56b.a();
            this.f15095xd90ff56b = null;
        }
    }

    /* renamed from: uninitOpenGLComponents */
    private void m31566xa95ca66e() {
        if (this.f15085xfa65459c == null) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(this.f15098xc7e76f38.a("uninitGL"), this.f15097x32cfed, "uninitOpenGLComponents", new java.lang.Object[0]);
        try {
            this.f15085xfa65459c.m31013x900967ab();
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.h hVar = this.f15090x68813b7;
            if (hVar != null) {
                hVar.a();
                this.f15090x68813b7 = null;
            }
        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15098xc7e76f38.a("unintGLError"), this.f15097x32cfed, "makeCurrent failed.", e17);
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9.m31004x5cd39ffa(this.f15085xfa65459c);
        this.f15085xfa65459c = null;
    }

    /* renamed from: encodeFrame */
    public void m31567x713ad8f7(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7) {
        if (c3817x73c266a7 == null) {
            return;
        }
        if (!this.f15088xbce409ec.getAndSet(false) || m31563x416a9e0f()) {
            if (this.f15095xd90ff56b != null || m31564x68ac462()) {
                c3817x73c266a7.m31071x19bf3a74();
                if (!com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29498xb2c87fbf(c3817x73c266a7.m31071x19bf3a74(), this.f15094x82565e1d)) {
                    m31566xa95ca66e();
                }
                if (this.f15085xfa65459c != null || m31557xc484de55(c3817x73c266a7.m31071x19bf3a74(), this.f15086x63e9ce90)) {
                    this.f15095xd90ff56b.c();
                    m31554x87699687(c3817x73c266a7);
                }
            }
        }
    }

    /* renamed from: notifyEncodeFail */
    public synchronized void m31568xd95e3a7d() {
        long j17 = this.f15087x4b50afc6;
        if (j17 != 0) {
            m31560x32e81f16(j17);
        }
    }

    /* renamed from: notifyStartEncodedFail */
    public synchronized void m31569xfe3974f3() {
        long j17 = this.f15087x4b50afc6;
        if (j17 != 0) {
            m31562xb76ed400(j17);
        }
    }

    /* renamed from: release */
    public synchronized void m31570x41012807() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(this.f15097x32cfed, "release");
        this.f15087x4b50afc6 = 0L;
        m31565x360802();
    }

    /* renamed from: requestKeyFrame */
    public void m31571xb6ce95fd() {
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b bVar = this.f15095xd90ff56b;
        if (bVar != null) {
            bVar.d();
        }
    }

    /* renamed from: setBitrate */
    public void m31572xab2604ab(int i17) {
        android.media.MediaCodec mediaCodec;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15097x32cfed, "SetBitrate ".concat(java.lang.String.valueOf(i17)));
        this.f15089x14172053.f15051xf9e77b6d = i17;
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b bVar = this.f15095xd90ff56b;
        if (bVar == null) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 c3846xefe8337 = bVar.f128676f;
        if (c3846xefe8337 == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(bVar.f128671a, "encoder not started yet. set bitrate to " + i17 + " kbps will not take effect.");
            return;
        }
        if (c3846xefe8337.f15051xf9e77b6d != i17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(bVar.f128671a, "set bitrate to " + i17 + " kbps");
            boolean z17 = false;
            if (i17 < bVar.f128676f.f15051xf9e77b6d) {
                if (bVar.f128672b.getBoolean("need_restart_when_down_bitrate", false)) {
                    z17 = true;
                } else {
                    bVar.a(i17);
                }
            }
            bVar.f128676f.f15051xf9e77b6d = i17;
            if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 19 || (mediaCodec = bVar.f128674d) == null) {
                return;
            }
            if (!z17) {
                bVar.a(mediaCodec, i17);
                return;
            }
            bVar.f128673c.removeCallbacks(bVar.f128681k);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - bVar.f128677g;
            if (elapsedRealtime >= java.util.concurrent.TimeUnit.SECONDS.toMillis(2L)) {
                bVar.f128681k.run();
            } else {
                bVar.f128673c.postDelayed(bVar.f128681k, 2000 - elapsedRealtime);
            }
        }
    }

    /* renamed from: setHWEncoderServerConfig */
    public void m31573x6410d2f0(com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3849xf5339e12 c3849xf5339e12) {
        this.f15092xedddf972 = c3849xf5339e12;
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b bVar = this.f15095xd90ff56b;
        if (bVar != null) {
            bVar.a(m31556x4224a7d6(c3849xf5339e12));
        }
    }

    /* renamed from: signalEndOfStream */
    public void m31574x4eaf2e6a() {
        final com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b bVar = this.f15095xd90ff56b;
        if (bVar != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(bVar.f128671a, "signalEndOfStream");
            android.media.MediaCodec mediaCodec = bVar.f128674d;
            if (mediaCodec != null) {
                try {
                    mediaCodec.signalEndOfInputStream();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(bVar.f128671a, "signalEndOfStream failed.", th6);
                }
            }
            if (bVar.f128678h == null) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.t tVar = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.t(android.os.Looper.myLooper(), new com.tencent.liteav.base.util.t.a(bVar) { // from class: com.tencent.liteav.videoproducer.encoder.d

                    /* renamed from: a, reason: collision with root package name */
                    private final com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b f128699a;

                    {
                        this.f128699a = bVar;
                    }

                    @Override // com.tencent.liteav.base.util.t.a
                    /* renamed from: onTimeout */
                    public final void mo29580x1554e82() {
                        this.f128699a.c();
                    }
                });
                bVar.f128678h = tVar;
                tVar.a(30);
            }
        }
    }
}
