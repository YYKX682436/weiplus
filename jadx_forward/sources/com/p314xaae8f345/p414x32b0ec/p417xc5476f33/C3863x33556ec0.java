package com.p314xaae8f345.p414x32b0ec.p417xc5476f33;

/* renamed from: com.tencent.live.plugin.V2TXLivePlayerPlugin */
/* loaded from: classes16.dex */
public class C3863x33556ec0 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {
    private static final java.lang.String TAG = "V2TXLivePlayerPlugin";

    /* renamed from: TC_COMPONENT_PUSHER */
    private static final int f15200x207b02b9 = 1;

    /* renamed from: TC_FRAMEWORK_LIVE */
    private static final int f15201x7f7b327d = 23;

    /* renamed from: mChannel */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f15202xca242fd6;

    /* renamed from: mContext */
    private android.content.Context f15203xd6cfe882;

    /* renamed from: mIdentifier */
    private java.lang.String f15204x7bbaa4f6;

    /* renamed from: mMessenger */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f15205x251e0526;

    /* renamed from: mPlayer */
    private com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d f15206x14aac1ae;

    /* renamed from: mSurfaceTextureEntry */
    private io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer f15209x1decefb7;

    /* renamed from: mTXRenderViewFactory */
    private com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3872xa0192a67 f15210x2663b7e;

    /* renamed from: mTextureRegistry */
    private io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f15211x1c754e4b;

    /* renamed from: mRenderWidth */
    private int f15208x48949b23 = 0;

    /* renamed from: mRenderHeight */
    private int f15207xb02fcf6a = 0;

    /* renamed from: mVideoWidth */
    private int f15213x7b4db658 = 0;

    /* renamed from: mVideoHeight */
    private int f15212xd49a1ad5 = 0;

    /* renamed from: com.tencent.live.plugin.V2TXLivePlayerPlugin$V2TXLivePlayerObserverImpl */
    /* loaded from: classes16.dex */
    public class V2TXLivePlayerObserverImpl extends com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 {
        public V2TXLivePlayerObserverImpl() {
        }

        /* renamed from: invokeListener */
        public void m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType v2TXLivePlayerObserverType, java.util.Map map) {
            v2TXLivePlayerObserverType.m31610xfb82e301();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", v2TXLivePlayerObserverType.m31610xfb82e301());
            if (map != null) {
                hashMap.put("params", map);
            }
            com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0.this.f15202xca242fd6.m138438xd8c5c779("onPlayerListener", hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onAudioLoading */
        public void mo31674x2ac58c05(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3866xce22eba2.m31824xed1e7fff(bundle));
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onAudioLoading"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onAudioPlaying */
        public void mo31675xf9497af7(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, boolean z17, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("firstPlay", java.lang.Boolean.valueOf(z17));
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3866xce22eba2.m31824xed1e7fff(bundle));
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onAudioPlaying"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onConnected */
        public void mo31676xdba42fea(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3866xce22eba2.m31824xed1e7fff(bundle));
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onConnected"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onError */
        public void mo31677xaf8aa769(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, int i17, java.lang.String str, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(i17));
            hashMap.put("errMsg", str);
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3866xce22eba2.m31824xed1e7fff(bundle));
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onError"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onPlayoutVolumeUpdate */
        public void mo31678x4b08ccde(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, int i17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("volume", java.lang.Integer.valueOf(i17));
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onPlayoutVolumeUpdate"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onReceiveSeiMessage */
        public void mo31679x5d08b6d4(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, int i17, byte[] bArr) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("payloadType", java.lang.Integer.valueOf(i17));
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, bArr);
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onReceiveSeiMessage"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onRenderVideoFrame */
        public void mo31680x3cf387e7(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("videoFrame", com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31844xfa0ef1fa(v2TXLiveVideoFrame));
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onRenderVideoFrame"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onSnapshotComplete */
        public void mo31681x7ddd1b1c(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, android.graphics.Bitmap bitmap) {
            if (bitmap == null) {
                return;
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("image", byteArray);
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onSnapshotComplete"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onStatisticsUpdate */
        public void mo31682x7935e3cb(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePlayerStatistics v2TXLivePlayerStatistics) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appCpu", java.lang.Integer.valueOf(v2TXLivePlayerStatistics.f15355xabe44fc7));
            hashMap.put("systemCpu", java.lang.Integer.valueOf(v2TXLivePlayerStatistics.f15363x434cb4f9));
            hashMap.put("width", java.lang.Integer.valueOf(v2TXLivePlayerStatistics.f15368x6be2dc6));
            hashMap.put("height", java.lang.Integer.valueOf(v2TXLivePlayerStatistics.f15360xb7389127));
            hashMap.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, java.lang.Integer.valueOf(v2TXLivePlayerStatistics.fps));
            hashMap.put("videoBitrate", java.lang.Integer.valueOf(v2TXLivePlayerStatistics.f15364xf1220e72));
            hashMap.put("audioBitrate", java.lang.Integer.valueOf(v2TXLivePlayerStatistics.f15356x9b599ab7));
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onStatisticsUpdate"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onVideoLoading */
        public void mo31683x808dffc0(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3866xce22eba2.m31824xed1e7fff(bundle));
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onVideoLoading"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onVideoPlaying */
        public void mo31684x4f11eeb2(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, boolean z17, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("firstPlay", java.lang.Boolean.valueOf(z17));
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3866xce22eba2.m31824xed1e7fff(bundle));
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onVideoPlaying"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onVideoResolutionChanged */
        public void mo31685xc6f171ec(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, int i17, int i18) {
            if (i17 != com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0.this.f15213x7b4db658 || i18 != com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0.this.f15212xd49a1ad5) {
                com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0.this.f15213x7b4db658 = i17;
                com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0.this.f15212xd49a1ad5 = i18;
                com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0.this.m31649xa107efb9();
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("width", java.lang.Integer.valueOf(i17));
            hashMap.put("height", java.lang.Integer.valueOf(i18));
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onVideoResolutionChanged"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
        /* renamed from: onWarning */
        public void mo31686x92abb0bd(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, int i17, java.lang.String str, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(i17));
            hashMap.put("errMsg", str);
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3866xce22eba2.m31824xed1e7fff(bundle));
            m31673x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType.m31607x13201a78("onWarning"), hashMap);
        }
    }

    public C3863x33556ec0(java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, android.content.Context context, com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3872xa0192a67 c3872xa0192a67, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658) {
        this.f15205x251e0526 = interfaceC28679x1b8c77f2;
        this.f15204x7bbaa4f6 = str;
        this.f15203xd6cfe882 = context;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(interfaceC28679x1b8c77f2, "player_" + this.f15204x7bbaa4f6);
        this.f15202xca242fd6 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
        com.p314xaae8f345.p420x6236cc6.p421x316220.C3881xd0e3e0ed c3881xd0e3e0ed = new com.p314xaae8f345.p420x6236cc6.p421x316220.C3881xd0e3e0ed(this.f15203xd6cfe882);
        this.f15206x14aac1ae = c3881xd0e3e0ed;
        c3881xd0e3e0ed.mo30016x8b59f158(new com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0.V2TXLivePlayerObserverImpl());
        this.f15210x2663b7e = c3872xa0192a67;
        this.f15211x1c754e4b = interfaceC28980x1159d658;
    }

    /* renamed from: setFramework */
    private void m31648x7c4f23bc() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46634x1dde913b, 23);
            jSONObject.put("component", 1);
            this.f15206x14aac1ae.mo30018x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15452x8ae8e1a3, jSONObject.toString());
        } catch (org.json.JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateDefaultBufferSize */
    public void m31649xa107efb9() {
        int i17;
        int i18;
        int i19;
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31839x2060cc4c(this.f15206x14aac1ae, 2, "V2TXLivePlayerPlugin, updateDefaultBufferSize: mRenderWidth-" + this.f15208x48949b23 + ", mRenderHeight-" + this.f15207xb02fcf6a + ", mVideoWidth-" + this.f15213x7b4db658 + ", mVideoHeight-" + this.f15212xd49a1ad5);
        if (this.f15209x1decefb7 != null && (i17 = this.f15207xb02fcf6a) > 0 && (i18 = this.f15208x48949b23) > 0) {
            int i27 = this.f15213x7b4db658;
            float f17 = 1.0f;
            if (i27 > 0 && (i19 = this.f15212xd49a1ad5) > 0) {
                f17 = java.lang.Math.max(java.lang.Math.max(i19 / i17, i27 / i18), 1.0f);
            }
            this.f15209x1decefb7.mo138098x76500f83((int) (this.f15208x48949b23 * f17), (int) (this.f15207xb02fcf6a * f17));
        }
    }

    /* renamed from: destroy */
    public void m31650x5cd39ffa() {
        this.f15206x14aac1ae.mo30016x8b59f158(null);
        this.f15202xca242fd6.m138441xdf757329(null);
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f15209x1decefb7;
        if (surfaceProducer != null) {
            surfaceProducer.mo138094x41012807();
            this.f15209x1decefb7 = null;
        }
    }

    /* renamed from: enableObserveVideoFrame */
    public void m31651x242ba4ab(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "enable")).booleanValue();
        int intValue = ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "pixelFormat")).intValue();
        int intValue2 = ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "bufferType")).intValue();
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo29984x242ba4ab(booleanValue, com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31834xda16903b(intValue), com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31830x6b34e5bc(intValue2))));
    }

    /* renamed from: enablePictureInPicture */
    public void m31652xdf5f485e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31839x2060cc4c(this.f15206x14aac1ae, 4, "V2TXLivePlayerPlugin, Not support PictureInPicture");
        result.mo65720x90b54003(-4);
    }

    /* renamed from: enableReceiveSeiMessage */
    public void m31653x8fd95bb0(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo29985x8fd95bb0(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "enable")).booleanValue(), ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "payloadType")).intValue())));
    }

    /* renamed from: enableVolumeEvaluation */
    public void m31654x740a3599(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo29986x740a3599(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "intervalMs")).intValue())));
    }

    /* renamed from: getTextureId */
    public void m31655xc2ca74e0(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31839x2060cc4c(this.f15206x14aac1ae, 2, "V2TXLivePlayerPlugin, getTextureId: method-" + c28687x4bb242ff.f71610xbfc5d0e1 + ", arguments-" + c28687x4bb242ff.f71609x86ac7956);
        if (this.f15209x1decefb7 == null) {
            this.f15209x1decefb7 = this.f15211x1c754e4b.m139631xfdf2a2c3();
        }
        long id6 = this.f15209x1decefb7.id();
        m31649xa107efb9();
        this.f15206x14aac1ae.mo30018x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15457x14b68192, this.f15209x1decefb7.mo138084xcf572877());
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31839x2060cc4c(this.f15206x14aac1ae, 2, "V2TXLivePlayerPlugin, getTextureId: " + id6);
        result.mo65720x90b54003(java.lang.Long.valueOf(id6));
    }

    /* renamed from: isPlaying */
    public void m31656xc00617a4(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo29989xc00617a4()));
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31839x2060cc4c(this.f15206x14aac1ae, 2, "V2TXLivePlayerPlugin, onMethodCall -> method:" + c28687x4bb242ff.f71610xbfc5d0e1 + ", arguments:" + c28687x4bb242ff.f71609x86ac7956);
        try {
            com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0.class.getDeclaredMethod(c28687x4bb242ff.f71610xbfc5d0e1, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff.class, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result.class).invoke(this, c28687x4bb242ff, result);
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31839x2060cc4c(this.f15206x14aac1ae, 4, "V2TXLivePlayerPlugin, method=" + c28687x4bb242ff.f71610xbfc5d0e1 + "|arguments=" + c28687x4bb242ff.f71609x86ac7956 + "|error=" + e17);
        } catch (java.lang.NoSuchMethodException e18) {
            com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31839x2060cc4c(this.f15206x14aac1ae, 4, "V2TXLivePlayerPlugin, method=" + c28687x4bb242ff.f71610xbfc5d0e1 + "|arguments=" + c28687x4bb242ff.f71609x86ac7956 + "|error=" + e18);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31839x2060cc4c(this.f15206x14aac1ae, 4, "V2TXLivePlayerPlugin, method=" + c28687x4bb242ff.f71610xbfc5d0e1 + "|arguments=" + c28687x4bb242ff.f71609x86ac7956 + "|error=" + e19);
        }
    }

    /* renamed from: pauseAudio */
    public void m31657xfb89cf80(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo30011xfb89cf80()));
    }

    /* renamed from: pauseVideo */
    public void m31658xfcac4825(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo30012xfcac4825()));
    }

    /* renamed from: resumeAudio */
    public void m31659xf9a3f7a9(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo30013xf9a3f7a9()));
    }

    /* renamed from: resumeVideo */
    public void m31660xfac6704e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo30014xfac6704e()));
    }

    /* renamed from: setCacheParams */
    public void m31661x8b5725e6(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo30015x8b5725e6(java.lang.Float.parseFloat((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "minTime")), java.lang.Float.parseFloat((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "maxTime")))));
    }

    /* renamed from: setObserver */
    public void m31662x8b59f158(com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323 abstractC3876x3753a323) {
    }

    /* renamed from: setPlayoutVolume */
    public void m31663x1ed14212(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo30017x1ed14212(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "volume")).intValue())));
    }

    /* renamed from: setProperty */
    public void m31664x3b607c57(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo30018x3b607c57((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "key"), com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "value"))));
    }

    /* renamed from: setRenderFillMode */
    public void m31665x1c840e7e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo30019x1c840e7e(com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31831x9386b868(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "mode")).intValue()))));
    }

    /* renamed from: setRenderRotation */
    public void m31666x4594f436(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo30020x4594f436(com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3867x8550a410.m31835xbc979e20(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "rotation")).intValue()))));
    }

    /* renamed from: setRenderView */
    public int m31667x63923b5d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        int mo30023x63923b5d = this.f15206x14aac1ae.mo30023x63923b5d((com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) this.f15210x2663b7e.m31849xc3196d8d(((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, dm.i4.f66865x76d1ec5a)).intValue()).mo31848xfb86a31b());
        result.mo65720x90b54003(java.lang.Integer.valueOf(mo30023x63923b5d));
        return mo30023x63923b5d;
    }

    /* renamed from: setTextureSize */
    public void m31668xd06addfa(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31839x2060cc4c(this.f15206x14aac1ae, 2, "V2TXLivePlayerPlugin, setTextureSize: method-" + c28687x4bb242ff.f71610xbfc5d0e1 + ", arguments-" + c28687x4bb242ff.f71609x86ac7956);
        java.lang.Double d17 = (java.lang.Double) c28687x4bb242ff.m138433xa13f5ebd("width");
        java.lang.Double d18 = (java.lang.Double) c28687x4bb242ff.m138433xa13f5ebd("height");
        if (d17 == null || d18 == null || d17.doubleValue() <= 0.0d || d18.doubleValue() <= 0.0d) {
            result.mo65720x90b54003(null);
            return;
        }
        if (this.f15208x48949b23 == d17.intValue() && this.f15207xb02fcf6a == d18.intValue()) {
            result.mo65720x90b54003(null);
            return;
        }
        this.f15208x48949b23 = d17.intValue();
        this.f15207xb02fcf6a = d18.intValue();
        m31649xa107efb9();
        this.f15206x14aac1ae.mo30018x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15457x14b68192, this.f15209x1decefb7.mo138084xcf572877());
        result.mo65720x90b54003(null);
    }

    /* renamed from: showDebugView */
    public void m31669xcdf6351b(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f15206x14aac1ae.mo30024xcdf6351b(((java.lang.Boolean) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "isShow")).booleanValue());
        result.mo65720x90b54003(0);
    }

    /* renamed from: snapshot */
    public void m31670x10fad5c4(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo30025x10fad5c4()));
    }

    /* renamed from: startLivePlay */
    public void m31671x5c1200c2(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        m31648x7c4f23bc();
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo30026x5c1200c2((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "url"))));
    }

    /* renamed from: stopPlay */
    public void m31672x66343656(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(java.lang.Integer.valueOf(this.f15206x14aac1ae.mo30029x66343656()));
    }
}
