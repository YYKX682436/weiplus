package com.p314xaae8f345.p414x32b0ec.p417xc5476f33;

/* renamed from: com.tencent.live.plugin.V2TXLivePusherPlugin */
/* loaded from: classes16.dex */
public class C3865xc3fe4ca6 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {
    private static final java.lang.String TAG = "V2TXLivePusherPlugin";

    /* renamed from: TC_COMPONENT_PUSHER */
    private static final int f15224x207b02b9 = 1;

    /* renamed from: TC_FRAMEWORK_LIVE */
    private static final int f15225x7f7b327d = 23;

    /* renamed from: _hellAccFlag_ */
    private byte f15226x7f11beae;

    /* renamed from: mChannel */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f15227xca242fd6;

    /* renamed from: mContext */
    private android.content.Context f15228xd6cfe882;

    /* renamed from: mCustomBeautyProcesser */
    private com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.InterfaceC3860x65876002 f15229x39c7a822;

    /* renamed from: mFlutterAssets */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets f15230x8ed61b52;

    /* renamed from: mIdentifier */
    private java.lang.String f15231x7bbaa4f6;

    /* renamed from: mMessenger */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f15232x251e0526;

    /* renamed from: mPusher */
    private com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 f15233x15318414;

    /* renamed from: mTXAudioEffectManager */
    private com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a f15234xca4f6e37;

    /* renamed from: mTXBeautyManager */
    private com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d f15235x9fe02760;

    /* renamed from: mTXDeviceManager */
    private com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853 f15236x4a14b046;

    /* renamed from: mTXRenderViewFactory */
    private com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3872xa0192a67 f15237x2663b7e;

    /* renamed from: com.tencent.live.plugin.V2TXLivePusherPlugin$5, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType */
        static final /* synthetic */ int[] f15252xae28ab7c;

        /* renamed from: $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyPixelFormat */
        static final /* synthetic */ int[] f15253xf59b827b;

        static {
            int[] iArr = new int[com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyPixelFormat.m31641xcee59d22().length];
            f15253xf59b827b = iArr;
            try {
                iArr[com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatUnknown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f15253xf59b827b[com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatI420.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f15253xf59b827b[com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatTexture2D.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyBufferType.m31638xcee59d22().length];
            f15252xae28ab7c = iArr2;
            try {
                iArr2[com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeUnknown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f15252xae28ab7c[com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeByteBuffer.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f15252xae28ab7c[com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeByteArray.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f15252xae28ab7c[com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeTexture.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.tencent.live.plugin.V2TXLivePusherPlugin$V2TXLivePusherObserverImpl */
    /* loaded from: classes16.dex */
    public class V2TXLivePusherObserverImpl extends com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 {
        public V2TXLivePusherObserverImpl() {
        }

        /* renamed from: invokeListener */
        public void m31808x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType v2TXLivePusherObserverType, java.util.Map map) {
            v2TXLivePusherObserverType.m31622xfb82e301();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", v2TXLivePusherObserverType.m31622xfb82e301());
            if (map != null) {
                hashMap.put("params", map);
            }
            if (com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.this.f15227xca242fd6 != null) {
                com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.this.f15227xca242fd6.m138438xd8c5c779("onPusherListener", hashMap);
            }
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onCaptureFirstAudioFrame */
        public void mo31809x94595aa0() {
            m31808x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onCaptureFirstAudioFrame"), java.util.Collections.emptyMap());
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onCaptureFirstVideoFrame */
        public void mo31810xd791811b() {
            m31808x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onCaptureFirstVideoFrame"), java.util.Collections.emptyMap());
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onError */
        public void mo31811xaf8aa769(int i17, java.lang.String str, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(i17));
            hashMap.put("errMsg", str);
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3866xce22eba2.m31824xed1e7fff(bundle));
            m31808x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onError"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onGLContextCreated */
        public void mo31812x2453e5d() {
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onGLContextDestroyed */
        public void mo31813xd8b04c4e() {
            com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.InterfaceC3861x752c2a8 m31627x104891a0 = com.p314xaae8f345.p414x32b0ec.C3857x32bdb54a.m31627x104891a0();
            if (m31627x104891a0 != null) {
                m31627x104891a0.m31635x556532b5();
            }
            com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.this.f15229x39c7a822 = null;
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onMicrophoneVolumeUpdate */
        public void mo31814xde91c78c(int i17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("volume", java.lang.Integer.valueOf(i17));
            m31808x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onMicrophoneVolumeUpdate"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onProcessVideoFrame */
        public int mo31815x20bf0162(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
            if (com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.this.f15229x39c7a822 == null) {
                return com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15120x37ee42f0;
            }
            com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyVideoFrame m31706xdb55b0fb = com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.m31706xdb55b0fb(v2TXLiveVideoFrame);
            com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyVideoFrame m31706xdb55b0fb2 = com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.m31706xdb55b0fb(v2TXLiveVideoFrame2);
            com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.this.f15229x39c7a822.m31633x20bf0162(m31706xdb55b0fb, m31706xdb55b0fb2);
            com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXThirdTexture tXThirdTexture = m31706xdb55b0fb2.f15194xab7dd51b;
            if (tXThirdTexture != null) {
                v2TXLiveVideoFrame2.f15421xab7dd51b.f15397xc35d0396 = tXThirdTexture.f15199xc35d0396;
            }
            v2TXLiveVideoFrame2.f15417x2eefaa = m31706xdb55b0fb2.f15190x2eefaa;
            v2TXLiveVideoFrame2.f15415xaddb9440 = m31706xdb55b0fb2.f15188xaddb9440;
            v2TXLiveVideoFrame2.f15422x6be2dc6 = m31706xdb55b0fb2.f15196x6be2dc6;
            v2TXLiveVideoFrame2.f15418xb7389127 = m31706xdb55b0fb2.f15191xb7389127;
            v2TXLiveVideoFrame2.f15420xfd990f7e = m31706xdb55b0fb2.f15193xfd990f7e;
            return 0;
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onPushStatusUpdate */
        public void mo31816x58c29794(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePushStatus v2TXLivePushStatus, java.lang.String str, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("status", v2TXLivePushStatus.name());
            hashMap.put("errMsg", str);
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3866xce22eba2.m31824xed1e7fff(bundle));
            m31808x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onPushStatusUpdate"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onScreenCaptureStarted */
        public void mo31817x42f07266() {
            m31808x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onScreenCaptureStarted"), java.util.Collections.emptyMap());
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onScreenCaptureStopped */
        public void mo31818x43b4c3b2(int i17) {
            m31808x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onScreenCaptureStopped"), java.util.Collections.emptyMap());
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onSetMixTranscodingConfig */
        public void mo31819xed58199b(int i17, java.lang.String str) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(i17));
            hashMap.put("errMsg", str);
            m31808x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onSetMixTranscodingConfig"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onSnapshotComplete */
        public void mo31820x7ddd1b1c(android.graphics.Bitmap bitmap) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("image", byteArray);
            m31808x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onSnapshotComplete"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onStatisticsUpdate */
        public void mo31821x7935e3cb(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePusherStatistics v2TXLivePusherStatistics) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appCpu", java.lang.Integer.valueOf(v2TXLivePusherStatistics.f15374xabe44fc7));
            hashMap.put("systemCpu", java.lang.Integer.valueOf(v2TXLivePusherStatistics.f15378x434cb4f9));
            hashMap.put("width", java.lang.Integer.valueOf(v2TXLivePusherStatistics.f15380x6be2dc6));
            hashMap.put("height", java.lang.Integer.valueOf(v2TXLivePusherStatistics.f15376xb7389127));
            hashMap.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, java.lang.Integer.valueOf(v2TXLivePusherStatistics.fps));
            hashMap.put("videoBitrate", java.lang.Integer.valueOf(v2TXLivePusherStatistics.f15379xf1220e72));
            hashMap.put("audioBitrate", java.lang.Integer.valueOf(v2TXLivePusherStatistics.f15375x9b599ab7));
            m31808x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onStatisticsUpdate"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
        /* renamed from: onWarning */
        public void mo31822x92abb0bd(int i17, java.lang.String str, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(i17));
            hashMap.put("errMsg", str);
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3866xce22eba2.m31824xed1e7fff(bundle));
            m31808x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onWarning"), hashMap);
        }
    }

    /* renamed from: com.tencent.live.plugin.V2TXLivePusherPlugin$V2TXMusicPlayObserverImpl */
    /* loaded from: classes16.dex */
    public class V2TXMusicPlayObserverImpl implements com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver {
        public V2TXMusicPlayObserverImpl() {
        }

        /* renamed from: invokeListener */
        public void m31823x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType v2TXLivePusherObserverType, java.util.Map map) {
            v2TXLivePusherObserverType.m31622xfb82e301();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", v2TXLivePusherObserverType.m31622xfb82e301());
            if (map != null) {
                hashMap.put("params", map);
            }
            if (com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.this.f15227xca242fd6 != null) {
                com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.this.f15227xca242fd6.m138438xd8c5c779("onPusherListener", hashMap);
            }
        }

        @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
        /* renamed from: onComplete */
        public void mo10551x815f5438(int i17, int i18) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(dm.i4.f66865x76d1ec5a, java.lang.Integer.valueOf(i17));
            hashMap.put("errCode", java.lang.Integer.valueOf(i18));
            m31823x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onMusicObserverComplete"), hashMap);
        }

        @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
        /* renamed from: onPlayProgress */
        public void mo10552xfd1c900(int i17, long j17, long j18) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(dm.i4.f66865x76d1ec5a, java.lang.Integer.valueOf(i17));
            hashMap.put("progressMs", java.lang.Long.valueOf(j17));
            hashMap.put("durationMs", java.lang.Long.valueOf(j18));
            m31823x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onMusicObserverPlayProgress"), hashMap);
        }

        @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
        /* renamed from: onStart */
        public void mo10553xb05099c3(int i17, int i18) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(dm.i4.f66865x76d1ec5a, java.lang.Integer.valueOf(i17));
            hashMap.put("errCode", java.lang.Integer.valueOf(i18));
            m31823x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType.m31619x13201a78("onMusicObserverStart"), hashMap);
        }
    }

    public C3865xc3fe4ca6(java.lang.String str, int i17, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets flutterAssets, com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3872xa0192a67 c3872xa0192a67) {
        this.f15232x251e0526 = interfaceC28679x1b8c77f2;
        this.f15231x7bbaa4f6 = str;
        this.f15228xd6cfe882 = context;
        this.f15230x8ed61b52 = flutterAssets;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(interfaceC28679x1b8c77f2, "pusher_" + this.f15231x7bbaa4f6);
        this.f15227xca242fd6 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
        if (i17 == 0) {
            this.f15233x15318414 = new com.p314xaae8f345.p420x6236cc6.p421x316220.C3883xd1d70053(this.f15228xd6cfe882, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMode.TXLiveMode_RTMP);
        } else {
            this.f15233x15318414 = new com.p314xaae8f345.p420x6236cc6.p421x316220.C3883xd1d70053(this.f15228xd6cfe882, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMode.TXLiveMode_RTC);
        }
        this.f15233x15318414.mo30155x8b59f158(new com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.V2TXLivePusherObserverImpl());
        this.f15237x2663b7e = c3872xa0192a67;
        this.f15235x9fe02760 = this.f15233x15318414.mo30104x2490fdb();
        this.f15236x4a14b046 = this.f15233x15318414.mo30105xac7d98c1();
        this.f15234xca4f6e37 = this.f15233x15318414.mo30103x5f1b9a9c();
    }

    /* renamed from: convertV2LiveBufferType */
    private static com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType m31704xd5a33b15(com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyBufferType tXCustomBeautyBufferType) {
        int i17 = com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.AnonymousClass5.f15252xae28ab7c[tXCustomBeautyBufferType.ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeUnknown : com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeTexture : com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray : com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer : com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeUnknown;
    }

    /* renamed from: convertV2LivePixelFormat */
    private static final com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat m31705xbd72e602(com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyPixelFormat tXCustomBeautyPixelFormat) {
        int i17 = com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.AnonymousClass5.f15253xf59b827b[tXCustomBeautyPixelFormat.ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatUnknown : com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D : com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatI420 : com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatUnknown;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createCustomBeautyVideoFrame */
    public static com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyVideoFrame m31706xdb55b0fb(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyVideoFrame tXCustomBeautyVideoFrame = new com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyVideoFrame();
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat v2TXLivePixelFormat = v2TXLiveVideoFrame.f15419xa0fe3a1d;
        if (v2TXLivePixelFormat == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatUnknown) {
            tXCustomBeautyVideoFrame.f15192xa0fe3a1d = com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatUnknown;
        } else if (v2TXLivePixelFormat == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatI420) {
            tXCustomBeautyVideoFrame.f15192xa0fe3a1d = com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatI420;
        } else if (v2TXLivePixelFormat == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D) {
            tXCustomBeautyVideoFrame.f15192xa0fe3a1d = com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatTexture2D;
        }
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType v2TXLiveBufferType = v2TXLiveVideoFrame.f15416x719f779a;
        if (v2TXLiveBufferType == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeUnknown) {
            tXCustomBeautyVideoFrame.f15189x719f779a = com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeUnknown;
        } else if (v2TXLiveBufferType == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray) {
            tXCustomBeautyVideoFrame.f15189x719f779a = com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeByteArray;
        } else if (v2TXLiveBufferType == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer) {
            tXCustomBeautyVideoFrame.f15189x719f779a = com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeByteBuffer;
        } else if (v2TXLiveBufferType == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeTexture) {
            tXCustomBeautyVideoFrame.f15189x719f779a = com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeTexture;
        }
        if (v2TXLiveVideoFrame.f15421xab7dd51b != null) {
            com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXThirdTexture tXThirdTexture = new com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXThirdTexture();
            tXCustomBeautyVideoFrame.f15194xab7dd51b = tXThirdTexture;
            com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.f15421xab7dd51b;
            tXThirdTexture.f15199xc35d0396 = v2TXLiveTexture.f15397xc35d0396;
            tXThirdTexture.f15197x5f488f24 = v2TXLiveTexture.f15395x5f488f24;
            tXThirdTexture.f15198x5f488f28 = v2TXLiveTexture.f15396x5f488f28;
        }
        tXCustomBeautyVideoFrame.f15190x2eefaa = v2TXLiveVideoFrame.f15417x2eefaa;
        tXCustomBeautyVideoFrame.f15188xaddb9440 = v2TXLiveVideoFrame.f15415xaddb9440;
        tXCustomBeautyVideoFrame.f15196x6be2dc6 = v2TXLiveVideoFrame.f15422x6be2dc6;
        tXCustomBeautyVideoFrame.f15191xb7389127 = v2TXLiveVideoFrame.f15418xb7389127;
        tXCustomBeautyVideoFrame.f15193xfd990f7e = v2TXLiveVideoFrame.f15420xfd990f7e;
        return tXCustomBeautyVideoFrame;
    }

    /* renamed from: getMixTranscodingConfigByMap */
    private com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTranscodingConfig m31707x244ae6b7(java.util.Map map) {
        java.util.List list;
        if (map == null || map.isEmpty()) {
            return null;
        }
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTranscodingConfig();
        if (map.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b)) {
            v2TXLiveTranscodingConfig.f15409x9f1bbe0b = ((java.lang.Integer) map.get(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b)).intValue();
        }
        if (map.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122)) {
            v2TXLiveTranscodingConfig.f15408x2a8d0982 = ((java.lang.Integer) map.get(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122)).intValue();
        }
        if (map.containsKey("videoBitrate")) {
            v2TXLiveTranscodingConfig.f15405xf1220e72 = ((java.lang.Integer) map.get("videoBitrate")).intValue();
        }
        if (map.containsKey("videoFramerate")) {
            v2TXLiveTranscodingConfig.f15406x336d5d92 = ((java.lang.Integer) map.get("videoFramerate")).intValue();
        }
        if (map.containsKey("videoGOP")) {
            v2TXLiveTranscodingConfig.f15407x44a06a0d = ((java.lang.Integer) map.get("videoGOP")).intValue();
        }
        if (map.containsKey("backgroundColor")) {
            v2TXLiveTranscodingConfig.f15401x4cb7f6d5 = ((java.lang.Integer) map.get("backgroundColor")).intValue();
        }
        if (map.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15505x57568ce2)) {
            v2TXLiveTranscodingConfig.f15402x4d0b70cd = (java.lang.String) map.get(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15505x57568ce2);
        }
        if (map.containsKey("audioSampleRate")) {
            v2TXLiveTranscodingConfig.f15400xa80e7620 = ((java.lang.Integer) map.get("audioSampleRate")).intValue();
        }
        if (map.containsKey("audioBitrate")) {
            v2TXLiveTranscodingConfig.f15398x9b599ab7 = ((java.lang.Integer) map.get("audioBitrate")).intValue();
        }
        if (map.containsKey("audioChannels")) {
            v2TXLiveTranscodingConfig.f15399xe235edc6 = ((java.lang.Integer) map.get("audioChannels")).intValue();
        }
        if (map.containsKey("mixStreams") && (list = (java.util.List) map.get("mixStreams")) != null && list.size() > 0) {
            v2TXLiveTranscodingConfig.f15403x77f0f2f7 = m31708xf62730cf(list);
        }
        if (v2TXLiveTranscodingConfig.f15403x77f0f2f7 == null) {
            v2TXLiveTranscodingConfig.f15403x77f0f2f7 = new java.util.ArrayList<>();
        }
        if (map.containsKey("outputStreamId")) {
            v2TXLiveTranscodingConfig.f15404xd4c664dc = (java.lang.String) map.get("outputStreamId");
        }
        return v2TXLiveTranscodingConfig;
    }

    /* renamed from: getV2TXLiveMixStreamByList */
    private java.util.ArrayList<com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMixStream> m31708xf62730cf(java.util.List list) {
        java.util.ArrayList<com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMixStream> arrayList = new java.util.ArrayList<>();
        if (list == null) {
            return arrayList;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.Map map = (java.util.Map) list.get(i17);
            com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMixStream v2TXLiveMixStream = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMixStream();
            if (map.containsKey("userId")) {
                v2TXLiveMixStream.f15345xce2b2e46 = (java.lang.String) map.get("userId");
            }
            if (map.containsKey("streamId")) {
                v2TXLiveMixStream.f15344x6abf78bb = (java.lang.String) map.get("streamId");
            }
            if (map.containsKey("x")) {
                v2TXLiveMixStream.f128721x = ((java.lang.Integer) map.get("x")).intValue();
            }
            if (map.containsKey("y")) {
                v2TXLiveMixStream.f128722y = ((java.lang.Integer) map.get("y")).intValue();
            }
            if (map.containsKey("width")) {
                v2TXLiveMixStream.f15346x6be2dc6 = ((java.lang.Integer) map.get("width")).intValue();
            }
            if (map.containsKey("height")) {
                v2TXLiveMixStream.f15342xb7389127 = ((java.lang.Integer) map.get("height")).intValue();
            }
            if (map.containsKey("zOrder")) {
                v2TXLiveMixStream.f15347xd4bdd2f4 = ((java.lang.Integer) map.get("zOrder")).intValue();
            }
            if (map.containsKey("inputType")) {
                v2TXLiveMixStream.f15343x65be6624 = com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31833xa200b4ca(((java.lang.Integer) map.get("inputType")).intValue());
            }
            arrayList.add(v2TXLiveMixStream);
        }
        return arrayList;
    }

    /* renamed from: setFramework */
    private void m31709x7c4f23bc() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46634x1dde913b, 23);
            jSONObject.put("component", 1);
            this.f15233x15318414.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15452x8ae8e1a3, jSONObject.toString());
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: destroy */
    public void m31710x5cd39ffa() {
        this.f15233x15318414.mo30155x8b59f158(null);
        this.f15227xca242fd6.m138441xdf757329(null);
    }

    /* renamed from: enableCameraAutoFocus */
    public void m31711x1a974ec1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15236x4a14b046.mo29655x1a974ec1(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "enable")).booleanValue())));
    }

    /* renamed from: enableCameraTorch */
    public void m31712xc8a25254(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Boolean.valueOf(this.f15236x4a14b046.mo29656xc8a25254(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "enable")).booleanValue())));
    }

    /* renamed from: enableCustomAudioCapture */
    public void m31713x9a8acb84(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30097x9a8acb84(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "enable")).booleanValue())));
    }

    /* renamed from: enableCustomVideoCapture */
    public void m31714xf0533f3f(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30098xf0533f3f(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "enable")).booleanValue())));
    }

    /* renamed from: enableCustomVideoProcess */
    public void m31715xbcf09668(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "enable")).booleanValue();
        com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.InterfaceC3861x752c2a8 m31627x104891a0 = com.p314xaae8f345.p414x32b0ec.C3857x32bdb54a.m31627x104891a0();
        if (m31627x104891a0 == null) {
            result.mo65718x5c4d208("Missing parameter", "beautyInstance is null!!!", java.lang.Integer.valueOf(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15120x37ee42f0));
            return;
        }
        com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.InterfaceC3860x65876002 m31634x44d946f3 = m31627x104891a0.m31634x44d946f3();
        this.f15229x39c7a822 = m31634x44d946f3;
        com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyBufferType m31631x45ab83b2 = m31634x44d946f3.m31631x45ab83b2();
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30099xbcf09668(booleanValue, m31705xbd72e602(this.f15229x39c7a822.m31632x4e73b105()), m31704xd5a33b15(m31631x45ab83b2))));
    }

    /* renamed from: enableSharpnessEnhancement */
    public void m31716x4ea5fb2e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15235x9fe02760.mo29592x4ea5fb2e(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "enable")).booleanValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: enableVoiceEarMonitor */
    public void m31717x52f4e3f3(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29046x52f4e3f3(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "enable")).booleanValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: enableVolumeEvaluation */
    public void m31718x740a3599(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30101x740a3599(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "intervalMs")).intValue())));
    }

    /* renamed from: getAudioEffectManager */
    public void m31719x5f1b9a9c(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37 = this.f15233x15318414.mo30103x5f1b9a9c();
        result.mo65720x90b54003(0);
    }

    /* renamed from: getBeautyManager */
    public void m31720x2490fdb(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15235x9fe02760 = this.f15233x15318414.mo30104x2490fdb();
        result.mo65720x90b54003(0);
    }

    /* renamed from: getCameraZoomMaxRatio */
    public void m31721x874067b5(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Float.valueOf(this.f15236x4a14b046.mo29657x874067b5()));
    }

    /* renamed from: getDeviceManager */
    public void m31722xac7d98c1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15236x4a14b046 = this.f15233x15318414.mo30105xac7d98c1();
        result.mo65720x90b54003(0);
    }

    /* renamed from: getMusicCurrentPosInMS */
    public void m31723x8f832095(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Long.valueOf(this.f15234xca4f6e37.mo29047x8f832095(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, dm.i4.f66865x76d1ec5a)).intValue())));
    }

    /* renamed from: getMusicDurationInMS */
    public void m31724x97cff34e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Long.valueOf(this.f15234xca4f6e37.mo29048x97cff34e((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714))));
    }

    /* renamed from: isAutoFocusEnabled */
    public void m31725x899e0be2(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Boolean.valueOf(this.f15236x4a14b046.mo29658x899e0be2()));
    }

    /* renamed from: isFrontCamera */
    public void m31726x24672724(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Boolean.valueOf(this.f15236x4a14b046.mo29659x24672724()));
    }

    /* renamed from: isPushing */
    public void m31727xd057a1fe(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30115xd057a1fe()));
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31841x3dd199a6(this.f15233x15318414, 2, "V2TXLivePusherPlugin, onMethodCall -> method:" + c28687x4bb242ff.f71610xbfc5d0e1 + ", arguments:" + c28687x4bb242ff.f71609x86ac7956);
        try {
            com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.class.getDeclaredMethod(c28687x4bb242ff.f71610xbfc5d0e1, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff.class, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result.class).invoke(this, c28687x4bb242ff, result);
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31841x3dd199a6(this.f15233x15318414, 4, "V2TXLivePusherPlugin, method=" + c28687x4bb242ff.f71610xbfc5d0e1 + "|arguments=" + c28687x4bb242ff.f71609x86ac7956 + "|error=" + e17);
        } catch (java.lang.NoSuchMethodException e18) {
            com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31841x3dd199a6(this.f15233x15318414, 4, "V2TXLivePusherPlugin, method=" + c28687x4bb242ff.f71610xbfc5d0e1 + "|arguments=" + c28687x4bb242ff.f71609x86ac7956 + "|error=" + e18);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31841x3dd199a6(this.f15233x15318414, 4, "V2TXLivePusherPlugin, method=" + c28687x4bb242ff.f71610xbfc5d0e1 + "|arguments=" + c28687x4bb242ff.f71609x86ac7956 + "|error=" + e19);
        }
    }

    /* renamed from: pauseAudio */
    public void m31728xfb89cf80(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30144xfb89cf80()));
    }

    /* renamed from: pausePlayMusic */
    public void m31729xff20a1fb(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29050xff20a1fb(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, dm.i4.f66865x76d1ec5a)).intValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: pauseVideo */
    public void m31730xfcac4825(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30145xfcac4825()));
    }

    /* renamed from: resumeAudio */
    public void m31731xf9a3f7a9(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30147xf9a3f7a9()));
    }

    /* renamed from: resumePlayMusic */
    public void m31732x96288da4(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29052x96288da4(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, dm.i4.f66865x76d1ec5a)).intValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: resumeVideo */
    public void m31733xfac6704e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30148xfac6704e()));
    }

    /* renamed from: seekMusicToPosInMS */
    public void m31734x9b52caf7(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29053x9b52caf7(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, dm.i4.f66865x76d1ec5a)).intValue(), ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, "pts")).intValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: sendCustomAudioFrame */
    public int m31735x5c9ba530(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        return -1;
    }

    /* renamed from: sendCustomVideoFrame */
    public int m31736x9fd3cbab(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return -1;
    }

    /* renamed from: sendSeiMessage */
    public void m31737xf24c7d58(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30151xf24c7d58(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "payloadType")).intValue(), (byte[]) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306))));
    }

    /* renamed from: setAllMusicVolume */
    public void m31738xdc5c9640(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29054xdc5c9640(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, "volume")).intValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: setAudioQuality */
    public void m31739x5f7e6dcb(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30152x5f7e6dcb(com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31829xb2354deb(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "quality")).intValue()))));
    }

    /* renamed from: setAudioRoute */
    public void m31740x78052215(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15236x4a14b046.mo29660x78052215(com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31825xde80ec0d(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f)).intValue()))));
    }

    /* renamed from: setBeautyLevel */
    public void m31741x43c542a6(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15235x9fe02760.mo29593x43c542a6(java.lang.Float.parseFloat((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "beautyLevel")));
        result.mo65720x90b54003(null);
    }

    /* renamed from: setBeautyStyle */
    public void m31742x442ec4d3(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15235x9fe02760.mo29594x442ec4d3(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15507x3fdf4e06)).intValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: setCameraFocusPosition */
    public void m31743x2d45073a(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15236x4a14b046.mo29662x2d45073a(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "x")).intValue(), ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "y")).intValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: setCameraZoomRatio */
    public void m31744xbdde2991(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15236x4a14b046.mo29663xbdde2991(java.lang.Float.parseFloat((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "value")))));
    }

    /* renamed from: setChinLevel */
    public void m31745x58346718(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29595x58346718(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "chinLevel")).intValue())));
    }

    /* renamed from: setEncoderMirror */
    public void m31746x3700bab9(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30153x3700bab9(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15521x925d47b7)).booleanValue())));
    }

    /* renamed from: setEyeAngleLevel */
    public void m31747x5498fe40(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29596x5498fe40(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "eyeAngleLevel")).intValue())));
    }

    /* renamed from: setEyeDistanceLevel */
    public void m31748xecb5ca60(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29597xecb5ca60(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "eyeDistanceLevel")).intValue())));
    }

    /* renamed from: setEyeLightenLevel */
    public void m31749xfb24ae94(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29598xfb24ae94(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "eyeLightenLevel")).intValue())));
    }

    /* renamed from: setEyeScaleLevel */
    public void m31750xb38b2029(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29599xb38b2029(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "eyeScaleLevel")).intValue())));
    }

    /* renamed from: setFaceBeautyLevel */
    public void m31751xfa631909(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29600xfa631909(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "faceBeautyLevel")).intValue())));
    }

    /* renamed from: setFaceNarrowLevel */
    public void m31752xb8f4b48a(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29601xb8f4b48a(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, ya.b.f77487x44fa364)).intValue())));
    }

    /* renamed from: setFaceShortLevel */
    public void m31753x9f95eba7(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29602x9f95eba7(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "faceShortLevel")).intValue())));
    }

    /* renamed from: setFaceSlimLevel */
    public void m31754x8e214528(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29603x8e214528(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "faceSlimLevel")).intValue())));
    }

    /* renamed from: setFaceVLevel */
    public void m31755x419f536d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29604x419f536d(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "faceVLevel")).intValue())));
    }

    /* renamed from: setFilter */
    public void m31756xc55227a(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        android.graphics.Bitmap decodeStream;
        java.lang.String str = (java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "type");
        final java.lang.String str2 = (java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "imageUrl");
        if (str.equals("network")) {
            new java.lang.Thread() { // from class: com.tencent.live.plugin.V2TXLivePusherPlugin.3

                /* renamed from: _hellAccFlag_ */
                private byte f15248x7f11beae;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str2).openConnection();
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        java.io.InputStream inputStream = httpURLConnection.getInputStream();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(inputStream);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin$3", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap decodeStream2 = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
                        yj0.a.e(obj, decodeStream2, "com/tencent/live/plugin/V2TXLivePusherPlugin$3", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                        com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.this.f15235x9fe02760.mo29605xc55227a(decodeStream2);
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p373xbe494963.p388x592d42e.log.C3783x944ec885.e(com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.TAG, "|method=setFilter|error=" + e17);
                    }
                }
            }.start();
        } else {
            try {
                if (str2.startsWith("/")) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(str2);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin", "setFilter", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                    decodeStream = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
                    yj0.a.e(obj, decodeStream, "com/tencent/live/plugin/V2TXLivePusherPlugin", "setFilter", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                } else {
                    java.io.InputStream open = this.f15228xd6cfe882.getAssets().open(this.f15230x8ed61b52.mo137498xa4fdae7d(str2));
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(open);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin", "setFilter", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                    decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0));
                    yj0.a.e(obj2, decodeStream, "com/tencent/live/plugin/V2TXLivePusherPlugin", "setFilter", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                }
                this.f15235x9fe02760.mo29605xc55227a(decodeStream);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p373xbe494963.p388x592d42e.log.C3783x944ec885.e(TAG, "|method=setFilter|error=" + e17);
            }
        }
        result.mo65720x90b54003(null);
    }

    /* renamed from: setFilterStrength */
    public void m31757x154fbcdb(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15235x9fe02760.mo29606x154fbcdb(java.lang.Float.parseFloat((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "strength")));
        result.mo65720x90b54003(null);
    }

    /* renamed from: setForeheadLevel */
    public void m31758x4f263306(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29607x4f263306(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "foreheadLevel")).intValue())));
    }

    /* renamed from: setGreenScreenFile */
    public void m31759x523b82a9(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29608x523b82a9((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714))));
    }

    /* renamed from: setLipsThicknessLevel */
    public void m31760xd1692cd2(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29609xd1692cd2(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "lipsThicknessLevel")).intValue())));
    }

    /* renamed from: setMixTranscodingConfig */
    public void m31761x99ee7a7a(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTranscodingConfig m31707x244ae6b7 = m31707x244ae6b7((java.util.Map) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "config"));
        new com.p176xb6135e39.p280x308fcb.i().g(m31707x244ae6b7);
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30154x99ee7a7a(m31707x244ae6b7)));
    }

    /* renamed from: setMotionMute */
    public void m31762xf169c0f1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15235x9fe02760.mo29610xf169c0f1(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "motionMute")).booleanValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: setMotionTmpl */
    public void m31763xf16cd10d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15235x9fe02760.mo29611xf16cd10d((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "tmplPath"));
        result.mo65720x90b54003(null);
    }

    /* renamed from: setMouthShapeLevel */
    public void m31764xe9796fc8(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29612xe9796fc8(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "mouthShapeLevel")).intValue())));
    }

    /* renamed from: setMusicObserver */
    public void m31765xe624d2d9(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29055xe624d2d9(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "musicId")).intValue(), new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver() { // from class: com.tencent.live.plugin.V2TXLivePusherPlugin.4
            @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
            /* renamed from: onComplete */
            public void mo10551x815f5438(int i17, int i18) {
            }

            @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
            /* renamed from: onPlayProgress */
            public void mo10552xfd1c900(int i17, long j17, long j18) {
            }

            @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
            /* renamed from: onStart */
            public void mo10553xb05099c3(int i17, int i18) {
            }
        });
        result.mo65720x90b54003(null);
    }

    /* renamed from: setMusicPitch */
    public void m31766xed0efa1d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29056xed0efa1d(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, dm.i4.f66865x76d1ec5a)).intValue(), java.lang.Float.parseFloat((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, "pitch")));
        result.mo65720x90b54003(null);
    }

    /* renamed from: setMusicPlayoutVolume */
    public void m31767xc0cc2931(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29057xc0cc2931(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, dm.i4.f66865x76d1ec5a)).intValue(), ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, "volume")).intValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: setMusicPublishVolume */
    public void m31768x6f0d32e6(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29058x6f0d32e6(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, dm.i4.f66865x76d1ec5a)).intValue(), ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, "volume")).intValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: setMusicSpeedRate */
    public void m31769xf86ac624(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29060xf86ac624(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, dm.i4.f66865x76d1ec5a)).intValue(), java.lang.Float.parseFloat((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, "speedRate")));
        result.mo65720x90b54003(null);
    }

    /* renamed from: setNosePositionLevel */
    public void m31770x8e320686(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29613x8e320686(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "nosePositionLevel")).intValue())));
    }

    /* renamed from: setNoseSlimLevel */
    public void m31771xbc3bb072(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29614xbc3bb072(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "noseSlimLevel")).intValue())));
    }

    /* renamed from: setNoseWingLevel */
    public void m31772xd3ebfa64(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29615xd3ebfa64(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "noseWingLevel")).intValue())));
    }

    /* renamed from: setObserver */
    public void m31773x8b59f158(com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89) {
    }

    /* renamed from: setPounchRemoveLevel */
    public void m31774x139dd9a1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29616x139dd9a1(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "pounchRemoveLevel")).intValue())));
    }

    /* renamed from: setProperty */
    public void m31775x3b607c57(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30156x3b607c57((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "key"), com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "value"))));
    }

    /* renamed from: setRenderMirror */
    public void m31776xb89b1e77(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30158xb89b1e77(com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31832x6190e5bb(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "mirrorType")).intValue()))));
    }

    /* renamed from: setRenderRotation */
    public void m31777x4594f436(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30159x4594f436(com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31835xbc979e20(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "rotation")).intValue()))));
    }

    /* renamed from: setRenderView */
    public int m31778x63923b5d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        int mo30162x63923b5d = this.f15233x15318414.mo30162x63923b5d((com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) this.f15237x2663b7e.m31849xc3196d8d(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, dm.i4.f66865x76d1ec5a)).intValue()).mo31848xfb86a31b());
        result.mo65720x90b54003(java.lang.Integer.valueOf(mo30162x63923b5d));
        return mo30162x63923b5d;
    }

    /* renamed from: setRuddyLevel */
    public void m31779xb91ddc50(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15235x9fe02760.mo29617xb91ddc50(java.lang.Float.parseFloat((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "ruddyLevel")));
        result.mo65720x90b54003(null);
    }

    /* renamed from: setSmileLinesRemoveLevel */
    public void m31780xfebf24c7(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29618xfebf24c7(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "smileLinesRemoveLevel")).intValue())));
    }

    /* renamed from: setSystemVolumeType */
    public void m31781x2bcf6985(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15236x4a14b046.mo29665x2bcf6985(com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31826x8d99d97d(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "type")).intValue()))));
    }

    /* renamed from: setToothWhitenLevel */
    public void m31782xf356d5b9(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29619xf356d5b9(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "toothWhitenLevel")).intValue())));
    }

    /* renamed from: setVideoQuality */
    public void m31783xb546e186(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        int intValue = ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "videoFps")).intValue();
        int intValue2 = ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "videoBitrate")).intValue();
        int intValue3 = ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "minVideoBitrate")).intValue();
        int intValue4 = ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "videoResolution")).intValue();
        int intValue5 = ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "videoResolutionMode")).intValue();
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoResolution m31836x94a062a5 = com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31836x94a062a5(intValue4);
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoResolutionMode m31837xb2d935e8 = com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31837xb2d935e8(intValue5);
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoEncoderParam(m31836x94a062a5);
        v2TXLiveVideoEncoderParam.f15410x5d9e1de4 = intValue3;
        v2TXLiveVideoEncoderParam.f15411xf1220e72 = intValue2;
        v2TXLiveVideoEncoderParam.f15412x44a06a6e = intValue;
        v2TXLiveVideoEncoderParam.f15414xb471ddca = m31837xb2d935e8;
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30163xb546e186(v2TXLiveVideoEncoderParam)));
    }

    /* renamed from: setVoiceCaptureVolume */
    public void m31784x49fdc1f0(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29063x49fdc1f0(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "volume")).intValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: setVoiceChangerType */
    public void m31785x26b7a50c(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29064x26b7a50c(com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31827x88821504(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "type")).intValue()));
        result.mo65720x90b54003(null);
    }

    /* renamed from: setVoiceEarMonitorVolume */
    public void m31786x5a036f6e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29065x5a036f6e(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "volume")).intValue());
        result.mo65720x90b54003(null);
    }

    /* renamed from: setVoicePitch */
    public void m31787xc141e730(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29066xc141e730(java.lang.Double.parseDouble((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "pitch")));
        result.mo65720x90b54003(null);
    }

    /* renamed from: setVoiceReverbType */
    public void m31788x486c863c(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15234xca4f6e37.mo29067x486c863c(com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31828x5c183744(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "type")).intValue()));
        result.mo65720x90b54003(null);
    }

    /* renamed from: setWatermark */
    public void m31789x4f089a22(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        android.graphics.Bitmap bitmap;
        final java.lang.String str = (java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "image");
        java.lang.String str2 = (java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "type");
        final float parseFloat = java.lang.Float.parseFloat((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "x"));
        final float parseFloat2 = java.lang.Float.parseFloat((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "y"));
        final float parseFloat3 = java.lang.Float.parseFloat((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "scale"));
        if (str2.equals("network")) {
            new java.lang.Thread() { // from class: com.tencent.live.plugin.V2TXLivePusherPlugin.2

                /* renamed from: _hellAccFlag_ */
                private byte f15241x7f11beae;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        java.io.InputStream inputStream = httpURLConnection.getInputStream();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(inputStream);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin$2", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
                        yj0.a.e(obj, decodeStream, "com/tencent/live/plugin/V2TXLivePusherPlugin$2", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                        result.mo65720x90b54003(java.lang.Integer.valueOf(com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.this.f15233x15318414.mo30164x4f089a22(decodeStream, parseFloat, parseFloat2, parseFloat3)));
                    } catch (java.io.IOException e17) {
                        e17.toString();
                    }
                }
            }.start();
            return;
        }
        try {
            if (str.startsWith("/")) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin", "setWatermark", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
                yj0.a.e(obj, bitmap, "com/tencent/live/plugin/V2TXLivePusherPlugin", "setWatermark", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            } else {
                java.io.InputStream open = this.f15228xd6cfe882.getAssets().open(this.f15230x8ed61b52.mo137498xa4fdae7d(str));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(open);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin", "setWatermark", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0));
                yj0.a.e(obj2, decodeStream, "com/tencent/live/plugin/V2TXLivePusherPlugin", "setWatermark", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                bitmap = decodeStream;
            }
            result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30164x4f089a22(bitmap, parseFloat, parseFloat2, parseFloat3)));
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
    }

    /* renamed from: setWhitenessLevel */
    public void m31790xd7a00666(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15235x9fe02760.mo29620xd7a00666(java.lang.Float.parseFloat((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "whitenessLevel")));
        result.mo65720x90b54003(null);
    }

    /* renamed from: setWrinkleRemoveLevel */
    public void m31791x7800d4de(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15235x9fe02760.mo29621x7800d4de(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "wrinkleRemoveLevel")).intValue())));
    }

    /* renamed from: showDebugView */
    public void m31792xcdf6351b(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15233x15318414.mo30165xcdf6351b(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "isShow")).booleanValue());
        result.mo65720x90b54003(0);
    }

    /* renamed from: snapshot */
    public void m31793x10fad5c4(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30166x10fad5c4()));
    }

    /* renamed from: startCamera */
    public void m31794x74692227(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        if (b3.l.m9698x3fed0563(this.f15228xd6cfe882, "android.permission.CAMERA") != 0) {
            result.mo65720x90b54003(-1314);
        } else {
            result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30167x74692227(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "frontCamera")).booleanValue())));
        }
    }

    /* renamed from: startMicrophone */
    public void m31795xc2faa72c(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        if (b3.l.m9698x3fed0563(this.f15228xd6cfe882, "android.permission.RECORD_AUDIO") != 0) {
            result.mo65720x90b54003(-1317);
        } else {
            result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30169xc2faa72c()));
        }
    }

    /* renamed from: startPlayMusic */
    public void m31796x79fb7d0f(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam = (com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam) new com.p176xb6135e39.p280x308fcb.i().b((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, "musicParam"), com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam.class);
        this.f15234xca4f6e37.mo29055xe624d2d9(audioMusicParam.f127778id, new com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.V2TXMusicPlayObserverImpl());
        result.mo65720x90b54003(java.lang.Boolean.valueOf(this.f15234xca4f6e37.mo29068x79fb7d0f(audioMusicParam)));
    }

    /* renamed from: startPush */
    public void m31797x8113e69c(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        m31709x7c4f23bc();
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30170x8113e69c((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "url"))));
    }

    /* renamed from: startScreenCapture */
    public void m31798x51e3a7f8(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30171x51e3a7f8()));
    }

    /* renamed from: startVirtualCamera */
    public void m31799xde9334ce(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        android.graphics.Bitmap decodeStream;
        java.lang.String str = (java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "type");
        final java.lang.String str2 = (java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "imageUrl");
        if (str.equals("network")) {
            new java.lang.Thread() { // from class: com.tencent.live.plugin.V2TXLivePusherPlugin.1

                /* renamed from: _hellAccFlag_ */
                private byte f15238x7f11beae;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str2).openConnection();
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        java.io.InputStream inputStream = httpURLConnection.getInputStream();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(inputStream);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap decodeStream2 = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
                        yj0.a.e(obj, decodeStream2, "com/tencent/live/plugin/V2TXLivePusherPlugin$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                        com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6.this.f15233x15318414.mo30173xde9334ce(decodeStream2);
                    } catch (java.io.IOException e17) {
                        e17.toString();
                    }
                }
            }.start();
        } else {
            try {
                if (str2.startsWith("/")) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(str2);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin", "startVirtualCamera", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                    decodeStream = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
                    yj0.a.e(obj, decodeStream, "com/tencent/live/plugin/V2TXLivePusherPlugin", "startVirtualCamera", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                } else {
                    java.io.InputStream open = this.f15228xd6cfe882.getAssets().open(this.f15230x8ed61b52.mo137498xa4fdae7d(str2));
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(open);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin", "startVirtualCamera", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                    decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0));
                    yj0.a.e(obj2, decodeStream, "com/tencent/live/plugin/V2TXLivePusherPlugin", "startVirtualCamera", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                }
                this.f15233x15318414.mo30173xde9334ce(decodeStream);
            } catch (java.lang.Exception e17) {
                e17.toString();
            }
        }
        result.mo65720x90b54003(null);
    }

    /* renamed from: stopCamera */
    public void m31800x933b2dc7(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15233x15318414.mo30174x933b2dc7();
        result.mo65720x90b54003(0);
    }

    /* renamed from: stopMicrophone */
    public void m31801xcc9de2cc(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30176xcc9de2cc()));
    }

    /* renamed from: stopPlayMusic */
    public void m31802x17324d6f(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        int intValue = ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31843x55cadf43(c28687x4bb242ff, result, dm.i4.f66865x76d1ec5a)).intValue();
        this.f15234xca4f6e37.mo29055xe624d2d9(intValue, null);
        this.f15234xca4f6e37.mo29069x17324d6f(intValue);
        result.mo65720x90b54003(null);
    }

    /* renamed from: stopPush */
    public void m31803x66345a3c(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30177x66345a3c()));
    }

    /* renamed from: stopScreenCapture */
    public void m31804xdc7b4858(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30178xdc7b4858()));
    }

    /* renamed from: stopVirtualCamera */
    public void m31805x692ad52e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15233x15318414.mo30180x692ad52e()));
    }

    /* renamed from: switchCamera */
    public void m31806x2db92f79(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15236x4a14b046.mo29666x2db92f79(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "isFrontCamera")).booleanValue())));
    }
}
