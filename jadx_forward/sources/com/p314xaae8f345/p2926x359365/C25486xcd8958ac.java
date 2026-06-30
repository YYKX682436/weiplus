package com.p314xaae8f345.p2926x359365;

/* renamed from: com.tencent.rtmp.TXLivePushConfig */
/* loaded from: classes16.dex */
public class C25486xcd8958ac implements java.io.Serializable {

    /* renamed from: DEFAULT_MAX_VIDEO_BITRATE */
    public static final int f46520x42181910 = 1200;

    /* renamed from: DEFAULT_MIN_VIDEO_BITRATE */
    public static final int f46521xcc14e17e = 800;

    /* renamed from: mAudioBitrate */
    public int f46522x32eeb3c4;

    /* renamed from: mAudioPreProcessFuncName */
    public java.lang.String f46524x8a0fb924;

    /* renamed from: mAudioPreProcessLibrary */
    public java.lang.String f46525x770ff066;

    /* renamed from: mMetaData */
    public java.util.HashMap<java.lang.String, java.lang.String> f46550xa1c96dc;

    /* renamed from: mVideoPreProcessFuncName */
    public java.lang.String f46563xb3553289;

    /* renamed from: mVideoPreProcessLibrary */
    public java.lang.String f46564xb2333661;

    /* renamed from: mWatermark */
    public android.graphics.Bitmap f46567x6dfeb277;

    /* renamed from: mCustomModeType */
    public int f46532x39adabdb = 0;

    /* renamed from: mAudioSample */
    public int f46526xc35c5673 = 48000;

    /* renamed from: mAudioChannels */
    public int f46523x3d43f659 = 1;

    /* renamed from: mVideoFPS */
    public int f46562x699e0dfb = 20;

    /* renamed from: mVideoResolution */
    public com.p314xaae8f345.p2926x359365.EnumC25488xb0702063 f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_540_960;

    /* renamed from: mVideoBitrate */
    public int f46559x88b7277f = 1200;

    /* renamed from: mMaxVideoBitrate */
    public int f46549x6f7c41c9 = 1500;

    /* renamed from: mMinVideoBitrate */
    public int f46551x2d4c4db7 = 800;

    /* renamed from: mBeautyLevel */
    public int f46529x7d9699bb = 0;

    /* renamed from: mWhiteningLevel */
    public int f46573xaa503ef4 = 0;

    /* renamed from: mRuddyLevel */
    public int f46557x78eace9b = 0;

    /* renamed from: mEyeScaleLevel */
    public int f46543xbe6305fe = 0;

    /* renamed from: mFaceSlimLevel */
    public int f46544x98f92afd = 0;

    /* renamed from: mConnectRetryCount */
    public int f46530x2dee6e4 = 3;

    /* renamed from: mConnectRetryInterval */
    public int f46531x498502d0 = 3;

    /* renamed from: mWatermarkX */
    public int f46569x51d79cc1 = 0;

    /* renamed from: mWatermarkY */
    public int f46571x51d79cc2 = 0;

    /* renamed from: mWatermarkXF */
    public float f46570xe91bfba5 = 0.0f;

    /* renamed from: mWatermarkYF */
    public float f46572xe91bfbc4 = 0.0f;

    /* renamed from: mWatermarkWidth */
    public float f46568x2f6c7d8f = -1.0f;

    /* renamed from: mVideoEncodeGop */
    public int f46560x73790a24 = 3;

    /* renamed from: mVideoEncoderXMirror */
    public boolean f46561x9a727549 = false;

    /* renamed from: mEnableHighResolutionCapture */
    public boolean f46537x3c85fd08 = false;

    /* renamed from: mEnableVideoHardEncoderMainProfile */
    public boolean f46541x1ef1072a = true;

    /* renamed from: mFrontCamera */
    public boolean f46545x227f9c01 = true;

    /* renamed from: mAutoAdjustBitrate */
    public boolean f46527xd251da82 = false;

    /* renamed from: mAutoAdjustStrategy */
    public int f46528x9f7126fe = 0;

    /* renamed from: mHardwareAccel */
    public int f46546x6be40c73 = 2;

    /* renamed from: mTouchFocus */
    public boolean f46558x7b9e2d26 = true;

    /* renamed from: mEnableZoom */
    public boolean f46542x4d0d3c43 = false;

    /* renamed from: mHomeOrientation */
    public int f46547xe4786744 = 1;

    /* renamed from: mPauseImg */
    public android.graphics.Bitmap f46554x70e8557a = null;

    /* renamed from: mPauseTime */
    public int f46555xac274bf6 = 300;

    /* renamed from: mPauseFps */
    public int f46553x70e84aa0 = 5;

    /* renamed from: mPauseFlag */
    public int f46552xac20f895 = 1;

    /* renamed from: mEnableAec */
    public boolean f46533x5510924f = false;

    /* renamed from: mEnableAgc */
    public boolean f46534x5510928d = false;

    /* renamed from: mEnableAns */
    public boolean f46535x55109376 = false;

    /* renamed from: mEnableAudioPreview */
    public boolean f46536xfa7ab82 = false;

    /* renamed from: mEnableScreenCaptureAutoRotate */
    public boolean f46540xf9e8c254 = false;

    /* renamed from: mEnablePureAudioPush */
    public boolean f46539xb3651188 = false;

    /* renamed from: mEnableNearestIP */
    public boolean f46538xcfe24795 = true;

    /* renamed from: mVolumeType */
    public int f46566x7fa7c5c1 = 0;

    /* renamed from: mLocalVideoMirrorType */
    public int f46548x8246bb96 = 0;

    /* renamed from: mRtmpChannelType */
    public int f46556x8b25ea0b = 0;

    @java.lang.Deprecated
    /* renamed from: enableAEC */
    public void m94546xda59443c(boolean z17) {
        this.f46533x5510924f = z17;
    }

    @java.lang.Deprecated
    /* renamed from: enableAGC */
    public void m94547xda59447a(boolean z17) {
        this.f46534x5510928d = z17;
    }

    /* renamed from: enableANS */
    public void m94548xda594563(boolean z17) {
        this.f46535x55109376 = z17;
    }

    /* renamed from: enableAudioEarMonitoring */
    public void m94549xa24faeb(boolean z17) {
        this.f46536xfa7ab82 = z17;
    }

    @java.lang.Deprecated
    /* renamed from: enableHighResolutionCaptureMode */
    public void m94550x62bcf8(boolean z17) {
        this.f46537x3c85fd08 = z17;
    }

    @java.lang.Deprecated
    /* renamed from: enableNearestIP */
    public void m94551x3417c2(boolean z17) {
        this.f46538xcfe24795 = z17;
    }

    /* renamed from: enablePureAudioPush */
    public void m94552xc8c90335(boolean z17) {
        this.f46539xb3651188 = z17;
    }

    /* renamed from: enableScreenCaptureAutoRotate */
    public void m94553xda603fc1(boolean z17) {
        this.f46540xf9e8c254 = z17;
    }

    /* renamed from: enableVideoHardEncoderMainProfile */
    public void m94554xd3620617(boolean z17) {
        this.f46541x1ef1072a = z17;
    }

    /* renamed from: setAudioChannels */
    public void m94555x326c1084(int i17) {
        this.f46523x3d43f659 = i17;
    }

    /* renamed from: setAudioSampleRate */
    public void m94556xc346e15e(int i17) {
        this.f46526xc35c5673 = i17;
    }

    /* renamed from: setAutoAdjustBitrate */
    public void m94557x643ae72d(boolean z17) {
        this.f46527xd251da82 = z17;
    }

    /* renamed from: setAutoAdjustStrategy */
    public void m94558x4aa9afb3(int i17) {
        this.f46528x9f7126fe = i17;
    }

    @java.lang.Deprecated
    /* renamed from: setBeautyFilter */
    public void m94559x2ada0896(int i17, int i18, int i19) {
        this.f46529x7d9699bb = i17;
        this.f46573xaa503ef4 = i18;
        this.f46557x78eace9b = i19;
    }

    /* renamed from: setConnectRetryCount */
    public void m94560x94c7f38f(int i17) {
        this.f46530x2dee6e4 = i17;
    }

    /* renamed from: setConnectRetryInterval */
    public void m94561x8be3245(int i17) {
        this.f46531x498502d0 = i17;
    }

    /* renamed from: setCustomModeType */
    public void m94562xe988d710(int i17) {
        this.f46532x39adabdb = i17;
    }

    /* renamed from: setEnableZoom */
    public void m94563x8d4049f8(boolean z17) {
        this.f46542x4d0d3c43 = z17;
    }

    @java.lang.Deprecated
    /* renamed from: setEyeScaleLevel */
    public void m94564xb38b2029(int i17) {
        this.f46543xbe6305fe = i17;
    }

    @java.lang.Deprecated
    /* renamed from: setFaceSlimLevel */
    public void m94565x8e214528(int i17) {
        this.f46544x98f92afd = i17;
    }

    @java.lang.Deprecated
    /* renamed from: setFrontCamera */
    public void m94566xe8ae44ec(boolean z17) {
        this.f46545x227f9c01 = z17;
    }

    /* renamed from: setHardwareAcceleration */
    public void m94567xca01de0a(int i17) {
        if (i17 < 0) {
            i17 = 2;
        }
        this.f46546x6be40c73 = i17 <= 2 ? i17 : 2;
    }

    /* renamed from: setHomeOrientation */
    public void m94568x3002a2af(int i17) {
        this.f46547xe4786744 = i17;
    }

    /* renamed from: setLocalVideoMirrorType */
    public void m94569x417feb0b(int i17) {
        this.f46548x8246bb96 = i17;
    }

    /* renamed from: setMaxVideoBitrate */
    public void m94570xbb067d34(int i17) {
        this.f46549x6f7c41c9 = i17;
    }

    /* renamed from: setMetaData */
    public void m94571x5bb18dd1(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        this.f46550xa1c96dc = hashMap;
    }

    /* renamed from: setMinVideoBitrate */
    public void m94572x78d68922(int i17) {
        this.f46551x2d4c4db7 = i17;
    }

    /* renamed from: setPauseFlag */
    public void m94573x8d2ae040(int i17) {
        this.f46552xac20f895 = i17;
    }

    /* renamed from: setPauseImg */
    public void m94575xc27d4c6f(android.graphics.Bitmap bitmap) {
        this.f46554x70e8557a = bitmap;
    }

    @java.lang.Deprecated
    /* renamed from: setRtmpChannelType */
    public void m94576xd6b02576(int i17) {
        this.f46556x8b25ea0b = i17;
    }

    /* renamed from: setTouchFocus */
    public void m94577xbbd13adb(boolean z17) {
        this.f46558x7b9e2d26 = z17;
    }

    /* renamed from: setVideoBitrate */
    public void m94578x885d9bf4(int i17) {
        this.f46559x88b7277f = i17;
    }

    /* renamed from: setVideoEncodeGop */
    public void m94579x23543559(int i17) {
        this.f46560x73790a24 = i17;
    }

    /* renamed from: setVideoEncoderXMirror */
    public void m94580x564b0334(boolean z17) {
        this.f46561x9a727549 = z17;
    }

    /* renamed from: setVideoFPS */
    public void m94581xbb3304f0(int i17) {
        this.f46562x699e0dfb = i17;
    }

    /* renamed from: setVideoResolution */
    public void m94582x534b6c5(int i17) {
        if (i17 == 30) {
            this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_1080_1920;
            return;
        }
        if (i17 == 31) {
            this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_1920_1080;
            return;
        }
        switch (i17) {
            case 0:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_360_640;
                return;
            case 1:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_540_960;
                return;
            case 2:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_720_1280;
                return;
            case 3:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_640_360;
                return;
            case 4:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_960_540;
                return;
            case 5:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_1280_720;
                return;
            case 6:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_320_480;
                return;
            case 7:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_180_320;
                return;
            case 8:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_270_480;
                return;
            case 9:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_320_180;
                return;
            case 10:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_480_270;
                return;
            case 11:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_240_320;
                return;
            case 12:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_360_480;
                return;
            case 13:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_480_640;
                return;
            case 14:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_320_240;
                return;
            case 15:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_480_360;
                return;
            case 16:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_640_480;
                return;
            case 17:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_480_480;
                return;
            case 18:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_270_270;
                return;
            case 19:
                this.f46565xb9aa7b5a = com.p314xaae8f345.p2926x359365.EnumC25488xb0702063.RESOLUTION_TYPE_160_160;
                return;
            default:
                return;
        }
    }

    /* renamed from: setVolumeType */
    public void m94583xbfdad376(int i17) {
        this.f46566x7fa7c5c1 = i17;
    }

    /* renamed from: setWatermark */
    public void m94585x4f089a22(android.graphics.Bitmap bitmap, int i17, int i18) {
        this.f46567x6dfeb277 = bitmap;
        this.f46569x51d79cc1 = i17;
        this.f46571x51d79cc2 = i18;
    }

    /* renamed from: toString */
    public java.lang.String m94586x9616526c() {
        return "[resolution:" + this.f46565xb9aa7b5a + "][fps:" + this.f46562x699e0dfb + "][gop:" + this.f46560x73790a24 + "][bitrate:" + this.f46559x88b7277f + "][maxBitrate:" + this.f46549x6f7c41c9 + "][minBitrate:" + this.f46551x2d4c4db7 + "][highCapture:" + this.f46537x3c85fd08 + "][hwAcc:" + this.f46546x6be40c73 + "][homeOrientation:" + this.f46547xe4786744 + "][volumeType:" + this.f46566x7fa7c5c1 + "][earMonitor:" + this.f46536xfa7ab82 + "][agc:" + this.f46534x5510928d + "][ans:" + this.f46535x55109376 + "][aec:" + this.f46533x5510924f + "][sample:" + this.f46526xc35c5673 + "][pureAudioPush:" + this.f46539xb3651188 + "]";
    }

    @java.lang.Deprecated
    /* renamed from: setPauseImg */
    public void m94574xc27d4c6f(int i17, int i18) {
        this.f46555xac274bf6 = i17;
        this.f46553x70e84aa0 = i18;
    }

    /* renamed from: setWatermark */
    public void m94584x4f089a22(android.graphics.Bitmap bitmap, float f17, float f18, float f19) {
        this.f46567x6dfeb277 = bitmap;
        this.f46570xe91bfba5 = f17;
        this.f46572xe91bfbc4 = f18;
        this.f46568x2f6c7d8f = f19;
    }
}
