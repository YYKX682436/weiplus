package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPCodecUtils */
/* loaded from: classes14.dex */
public class C26292x6745a9d7 {

    /* renamed from: CAP_AUDIO_AAC */
    public static final int f51757x40818bcd = 8;

    /* renamed from: CAP_AUDIO_DD */
    public static final int f51758x96b9db96 = 16;

    /* renamed from: CAP_AUDIO_DDP */
    public static final int f51759x4081977a = 32;

    /* renamed from: CAP_AUDIO_DTS */
    public static final int f51760x4081996d = 128;

    /* renamed from: CAP_AUDIO_FLAC */
    public static final int f51761xcfb25cfe = 64;

    /* renamed from: CAP_VIDEO_AVC */
    public static final int f51762x84bd2c7d = 1;

    /* renamed from: CAP_VIDEO_HEVC */
    public static final int f51763x12eb547b = 2;

    /* renamed from: CAP_VIDEO_VP8 */
    public static final int f51764x84bd7a8d = 256;

    /* renamed from: CAP_VIDEO_VP9 */
    public static final int f51765x84bd7a8e = 4;

    /* renamed from: PLAYER_LEVEL_0 */
    public static final int f51766x2d0d2ab7 = 0;

    /* renamed from: PLAYER_LEVEL_1 */
    public static final int f51767x2d0d2ab8 = 1;

    /* renamed from: PLAYER_LEVEL_11 */
    public static final int f51768x74982c79 = 11;

    /* renamed from: PLAYER_LEVEL_16 */
    public static final int f51769x74982c7e = 16;

    /* renamed from: PLAYER_LEVEL_21 */
    public static final int f51770x74982c98 = 21;

    /* renamed from: PLAYER_LEVEL_26 */
    public static final int f51771x74982c9d = 26;

    /* renamed from: PLAYER_LEVEL_28 */
    public static final int f51772x74982c9f = 28;

    /* renamed from: PLAYER_LEVEL_33 */
    public static final int f51773x74982cb9 = 33;

    /* renamed from: PLAYER_LEVEL_6 */
    public static final int f51774x2d0d2abd = 6;

    /* renamed from: PLAYER_LEVEL_UNKNOWN */
    public static final int f51775x34402171 = -1;
    private static final java.lang.String TAG = "TPCodecUtils";

    /* renamed from: VVC_SHD_HISI_CPU_NAME */
    private static final java.lang.String f51776xa275279e = "Kirin9000E";

    /* renamed from: VVC_SHD_MTK_CPU_NAME */
    private static final java.lang.String f51777x430b4a29 = "MT6893";

    /* renamed from: VVC_SHD_QUALCOMMN_CPU_NAME */
    private static final java.lang.String f51778x62542ba = "SM8250";

    /* renamed from: VVC_SHD_SAMSUNG_CPU_NAME */
    private static final java.lang.String f51779xc50bd493 = "Exynos2100";

    /* renamed from: mAACMaxSupportedBitrate */
    private static int f51780xdb92bbed = 510000;

    /* renamed from: mAACMaxSupportedChannels */
    private static int f51781xa920f350 = 8;

    /* renamed from: mAACMaxSupportedSamplerate */
    private static int f51782x605ccd0a = 96000;

    /* renamed from: mAV1SWMaxCapability */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability f51786x601d76a9 = null;

    /* renamed from: mAVCSWMaxCapability */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability f51787x3c5f1057 = null;

    /* renamed from: mAVS3WMaxCapability */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability f51788x1a0fa627 = null;

    /* renamed from: mAvs3DeviceLevel */
    private static int f51790xabacfa4c = -1;

    /* renamed from: mCodecCapBlackList */
    private static java.util.HashMap<java.lang.String, java.lang.Integer> f51792x24d263d4 = null;

    /* renamed from: mCodecCapWhiteList */
    private static java.util.HashMap<java.lang.String, java.lang.Integer> f51793x72ca7afe = null;

    /* renamed from: mContext */
    private static android.content.Context f51794xd6cfe882 = null;

    /* renamed from: mDDPMaxSupportedBitrate */
    private static int f51795x5826af20 = 6144000;

    /* renamed from: mDDPMaxSupportedChannels */
    private static int f51796xbf0b667d = 8;

    /* renamed from: mDDPMaxSupportedSamplerate */
    private static int f51797xa57728f7 = 48000;

    /* renamed from: mFLACMaxSupportedBitrate */
    private static int f51800xa26d3cce = 21000000;

    /* renamed from: mFLACMaxSupportedChannels */
    private static int f51801xbd968e8f = 8;

    /* renamed from: mFLACMaxSupportedSamplerate */
    private static int f51802x2dd89489 = 192000;

    /* renamed from: mHEVCSWMaxCapability */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability f51808x34eebe61 = null;

    /* renamed from: mHevcDeviceLevel */
    private static int f51815x5dca93d7 = -1;

    /* renamed from: mIsFFmpegCapGot */
    private static boolean f51816x3e30a1f6 = false;

    /* renamed from: mLocalCache */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 f51818x2853c324 = null;

    /* renamed from: mMaxACodecHwCapabilityMap */
    private static java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability> f51819xcdc075e9 = null;

    /* renamed from: mMaxACodecSwCapabilityMap */
    private static java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability> f51820xaa2e06b4 = null;

    /* renamed from: mMaxVCodecHwCapabilityMap */
    private static java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability> f51821xd64c997e = null;

    /* renamed from: mMaxVCodecSwCapabilityMap */
    private static java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability> f51822xb2ba2a49 = null;

    /* renamed from: mVP8SWMaxCapability */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability f51833xc716e047 = null;

    /* renamed from: mVP9SWMaxCapability */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability f51834xa8a8be26 = null;

    /* renamed from: mVVCSWMaxCapability */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability f51835x5c569ce2 = null;

    /* renamed from: mVvcDeviceLevel */
    private static int f51837x1366a6f8 = -1;

    /* renamed from: mVMediaCodecCapList */
    protected static java.util.ArrayList<java.lang.String> f51832x2806b215 = new java.util.ArrayList<>();

    /* renamed from: mAMediaCodecCapList */
    protected static java.util.ArrayList<java.lang.String> f51785x80f258a = new java.util.ArrayList<>();

    /* renamed from: mVMediaCodecBlackListModel */
    private static java.util.ArrayList<java.lang.String> f51831xb01575c7 = new java.util.ArrayList<>();

    /* renamed from: mAMediaCodecBlackListModel */
    private static java.util.ArrayList<java.lang.String> f51784xd81f24b2 = new java.util.ArrayList<>();

    /* renamed from: mAMediaCodecBlackListInstance */
    private static java.util.ArrayList<java.lang.String> f51783x962d126c = new java.util.ArrayList<>();

    /* renamed from: mSupportedMediaCodec */
    private static java.util.ArrayList<java.lang.String> f51830xd88b3c33 = new java.util.ArrayList<>();

    /* renamed from: mHdrWhiteMap */
    private static java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange>> f51814x1eec36dc = new java.util.HashMap<>();

    /* renamed from: mHdrBlackMap */
    private static java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange>> f51813x5e78db46 = new java.util.HashMap<>();

    /* renamed from: mHDRVividSupportVersionMap */
    private static java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange> f51807xedb6dc5e = new java.util.HashMap<>();

    /* renamed from: mHDRTypeToHDRSoftwareCodecWhiteListMap */
    private static java.util.HashMap<java.lang.Integer, java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange>> f51806x809de48c = new java.util.HashMap<>();

    /* renamed from: mHDRTypeToHDRHardwareCodecWhiteListMap */
    private static java.util.HashMap<java.lang.Integer, java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange>> f51805x1c6c4a6b = new java.util.HashMap<>();

    /* renamed from: mAudioMaxCapCodecInstance */
    private static java.util.HashMap<java.lang.String, java.lang.String> f51789x294e1774 = new java.util.HashMap<>();

    /* renamed from: mWideVineBlackListModel */
    private static java.util.ArrayList<java.lang.String> f51838x390deb36 = new java.util.ArrayList<>();

    /* renamed from: mDrmL1BlackList */
    private static java.util.HashMap<java.lang.Integer, java.util.ArrayList<java.lang.String>> f51799x7b1d9026 = new java.util.HashMap<>();

    /* renamed from: mBlackListModel */
    private static java.util.ArrayList<java.lang.String> f51791xe3d035b9 = new java.util.ArrayList<>();

    /* renamed from: mSupportedHWCodec */
    private static java.util.ArrayList<java.lang.String> f51829x97765e66 = new java.util.ArrayList<>();

    /* renamed from: mIsInitDone */
    private static boolean f51817xbce29449 = false;

    /* renamed from: mPreferredSoftwareComponent */
    private static boolean f51823x4ebf2ae2 = false;

    /* renamed from: mShdHevcQualcommIndex */
    private static int f51827x59aa278b = 32;

    /* renamed from: mHdHevcQualcommIndex */
    private static int f51811xcdad2d24 = 20;

    /* renamed from: mShdHevcMtkIndex */
    private static int f51826xe4e5943a = 12;

    /* renamed from: mHdHevcMtkIndex */
    private static int f51810xbe59b301 = 8;

    /* renamed from: mShdHevcHisiIndex */
    private static int f51825x3791e8cf = 8;

    /* renamed from: mHdHevcHisiIndex */
    private static int f51809x8ca1a2e8 = 3;

    /* renamed from: mShdHevcSamsungIndex */
    private static int f51828x59580ba4 = 8;

    /* renamed from: mHdHevcSamsungIndex */
    private static int f51812xa816eeb = 5;

    /* renamed from: mFhdAvs3QualcommIndex */
    private static int f51804xf554e1ed = 58;

    /* renamed from: mShdAvs3QualcommIndex */
    private static int f51824xb88cc4c0 = 55;

    /* renamed from: mFhdAvs3HisiIndex */
    private static int f51803x33ed2431 = 14;

    /* renamed from: mVideoCodecIdToSwCapabilityModel */
    private static android.util.SparseArray<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.VideoSwCapabilityModel> f51836x2037e7cf = new android.util.SparseArray<>();

    /* renamed from: mDefinitionNameToDecodeLevelTable */
    private static java.util.HashMap<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.DefinitionName, java.lang.Integer> f51798xcccf477e = new java.util.HashMap<>();

    /* renamed from: com.tencent.thumbplayer.core.common.TPCodecUtils$DefinitionName */
    /* loaded from: classes14.dex */
    public enum DefinitionName {
        DEFINITION_720P
    }

    /* renamed from: com.tencent.thumbplayer.core.common.TPCodecUtils$VideoSwCapabilityModel */
    /* loaded from: classes14.dex */
    public static class VideoSwCapabilityModel {

        /* renamed from: mCpuProducerToAllDefinitionDecTable */
        android.util.SparseArray<java.util.HashMap<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.DefinitionName, java.lang.String>> f51841x84e9b1b8;

        /* renamed from: com.tencent.thumbplayer.core.common.TPCodecUtils$VideoSwCapabilityModel$Builder */
        /* loaded from: classes14.dex */
        public static class Builder {

            /* renamed from: mCpuProducerToAllDefinitionDecCapabilities */
            private android.util.SparseArray<java.util.HashMap<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.DefinitionName, java.lang.String>> f51842xe030fe8c = new android.util.SparseArray<>();

            /* renamed from: addVideoDecCap */
            public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.VideoSwCapabilityModel.Builder m101753x48bc956a(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.DefinitionName definitionName, java.lang.String str) {
                java.util.HashMap<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.DefinitionName, java.lang.String> hashMap = this.f51842xe030fe8c.get(i17);
                if (hashMap == null) {
                    hashMap = new java.util.HashMap<>();
                    this.f51842xe030fe8c.put(i17, hashMap);
                }
                hashMap.put(definitionName, str);
                return this;
            }

            /* renamed from: build */
            public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.VideoSwCapabilityModel m101754x59bc66e() {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.VideoSwCapabilityModel videoSwCapabilityModel = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.VideoSwCapabilityModel();
                videoSwCapabilityModel.f51841x84e9b1b8 = this.f51842xe030fe8c;
                return videoSwCapabilityModel;
            }
        }

        private VideoSwCapabilityModel() {
            this.f51841x84e9b1b8 = new android.util.SparseArray<>();
        }
    }

    static {
        java.util.HashMap<java.lang.String, java.lang.Integer> hashMap = new java.util.HashMap<>();
        f51793x72ca7afe = hashMap;
        hashMap.put("NX511J", 11);
        f51793x72ca7afe.put("Hi3798MV100", 11);
        f51793x72ca7afe.put("长虹智能电视", 11);
        f51793x72ca7afe.put("Android TV on Tcl 901", 11);
        f51793x72ca7afe.put("xt880b", 11);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "white list init");
        f51830xd88b3c33.add("video/avc");
        f51830xd88b3c33.add("video/hevc");
        f51830xd88b3c33.add("video/x-vnd.on2.vp8");
        f51830xd88b3c33.add("video/x-vnd.on2.vp9");
        f51830xd88b3c33.add("video/av01");
        f51830xd88b3c33.add("video/vvc");
        f51830xd88b3c33.add("audio/mp4a-latm");
        f51830xd88b3c33.add(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54244xb1630448);
        f51830xd88b3c33.add(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54253xe4f8678e);
        f51830xd88b3c33.add(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54254x5c6a3f6d);
        f51830xd88b3c33.add(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54255x7affee51);
        f51830xd88b3c33.add(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54250xb16311ba);
        f51783x962d126c.add("OMX.qti.audio.decoder.flac");
        f51831xb01575c7.add("SM-J7008");
        f51831xb01575c7.add("SM-J5008");
        f51831xb01575c7.add("TCL i806");
        f51831xb01575c7.add("NX511J");
        f51831xb01575c7.add("vivo Y11i T");
        f51831xb01575c7.add("长虹智能电视");
        f51831xb01575c7.add("MI 1S");
        f51831xb01575c7.add("SP9832A");
        f51831xb01575c7.add("SP9830A");
        f51831xb01575c7.add("VOTO GT17");
        f51831xb01575c7.add("EVA-AL10");
        f51807xedb6dc5e.put("TAS-AL00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("TAS-TL00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("TAS-AN00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("LIO-AN00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("LIO-AN00P", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("LIO-AN00m", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("LIO-TL00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("LIO-AL00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("ANA-AN00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("ANA-TN00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("ELS-AN00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("ELS-TN00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("ELS-AN10", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100166, 99, 3));
        f51807xedb6dc5e.put("BAL-AL60", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("CET-AL00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("DCO-AL00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("CET-AL60", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        f51807xedb6dc5e.put("MRX-AL09", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        f51807xedb6dc5e.put("MRX-AL19", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        f51807xedb6dc5e.put("MRX-W09", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        f51807xedb6dc5e.put("MRX-W19", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        f51807xedb6dc5e.put("MRX-AN19", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        f51807xedb6dc5e.put("MRX-W29", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        f51807xedb6dc5e.put("MRX-W39", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        f51807xedb6dc5e.put("OCE-AN00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("OCE-AN10", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("OCE-AL50", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("OCE-AN50", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("NOH-NX9", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("NOH-AN00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("NOH-AN01", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("NOH-AL00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("NOP-AN00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("JAD-AN00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("JAD-AN10", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("JAD-AL50", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("JAD-AL60", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("JAD-N29", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("JAD-N09", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("HEGE-550", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        f51807xedb6dc5e.put("HEGE-550B", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        f51807xedb6dc5e.put("HEGE-550C", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        f51807xedb6dc5e.put("HEGE-550X", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        f51807xedb6dc5e.put("HEGE-550AX", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        f51807xedb6dc5e.put("HEGE-560", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        f51807xedb6dc5e.put("HEGE-560B", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        f51807xedb6dc5e.put("HEGE-570", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        f51807xedb6dc5e.put("PLAT-760", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200172, 99, 0));
        f51807xedb6dc5e.put("KANT-350", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        f51807xedb6dc5e.put("KANT-350B", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        f51807xedb6dc5e.put("KANT-350C", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        f51807xedb6dc5e.put("KANT-350S", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        f51807xedb6dc5e.put("KANT-360", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        f51807xedb6dc5e.put("KANT-360S", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        f51807xedb6dc5e.put("KANT-370", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        f51807xedb6dc5e.put("KANT-370S", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        f51807xedb6dc5e.put("KANT-359", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200183, 99, 0));
        f51807xedb6dc5e.put("KANT-369", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 200183, 99, 0));
        f51807xedb6dc5e.put("THAL-550", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("THAL-560", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("THAL-570", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("THAL-580", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("FREG-770", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("DESC-220", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("DESC-250SY", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        f51807xedb6dc5e.put("DESC-250S", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        f51807xedb6dc5e.put("DESC-250SZ", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        f51807xedb6dc5e.put("DESC-250", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        f51807xedb6dc5e.put("DESC-260SY", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        f51807xedb6dc5e.put("DESC-260S", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        f51807xedb6dc5e.put("DESC-260SZ", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        f51807xedb6dc5e.put("DESC-260", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        f51807xedb6dc5e.put("DESC-270", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 10200547, 99, 0));
        f51807xedb6dc5e.put("SOKR-790A", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("VOLT-350S", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("SDY-AN00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51807xedb6dc5e.put("HPB-AN00", new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        f51838x390deb36.add("RVL-AL09");
        f51838x390deb36.add("CLT-L29");
        f51838x390deb36.add("ASUS_Z00AD");
        f51838x390deb36.add(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7());
        f51799x7b1d9026.put(0, f51838x390deb36);
        android.util.SparseArray<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.VideoSwCapabilityModel> sparseArray = f51836x2037e7cf;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.VideoSwCapabilityModel.Builder builder = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.VideoSwCapabilityModel.Builder();
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.DefinitionName definitionName = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.DefinitionName.DEFINITION_720P;
        sparseArray.put(193, builder.m101753x48bc956a(0, definitionName, f51778x62542ba).m101753x48bc956a(1, definitionName, f51777x430b4a29).m101753x48bc956a(2, definitionName, f51776xa275279e).m101753x48bc956a(3, definitionName, f51779xc50bd493).m101754x59bc66e());
        f51798xcccf477e.put(definitionName, 21);
        f51816x3e30a1f6 = false;
        f51787x3c5f1057 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(0, 0, 0, 30);
        f51808x34eebe61 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(0, 0, 0, 30);
        f51834xa8a8be26 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(0, 0, 0, 30);
        f51788x1a0fa627 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(0, 0, 0, 30);
        f51786x601d76a9 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(0, 0, 0, 30);
        f51833xc716e047 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(0, 0, 0, 30);
        f51835x5c569ce2 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(0, 0, 0, 30);
        f51821xd64c997e = new java.util.HashMap<>();
        f51822xb2ba2a49 = new java.util.HashMap<>();
        f51819xcdc075e9 = new java.util.HashMap<>();
        f51820xaa2e06b4 = new java.util.HashMap<>();
    }

    /* renamed from: addDRMLevel1Blacklist */
    public static boolean m101696x9a538952(int i17) {
        if (!f51799x7b1d9026.containsKey(java.lang.Integer.valueOf(i17))) {
            return true;
        }
        java.util.ArrayList<java.lang.String> arrayList = f51799x7b1d9026.get(java.lang.Integer.valueOf(i17));
        if (!arrayList.contains(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7())) {
            arrayList.add(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7());
        }
        f51799x7b1d9026.remove(java.lang.Integer.valueOf(i17));
        f51799x7b1d9026.put(java.lang.Integer.valueOf(i17), arrayList);
        return true;
    }

    /* renamed from: addHDRBlackList */
    public static boolean m101697x2f088628(int i17, java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        if (tPHdrSupportVersionRange == null) {
            return false;
        }
        if (!f51813x5e78db46.containsKey(java.lang.Integer.valueOf(i17))) {
            java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange> hashMap = new java.util.HashMap<>();
            hashMap.put(str, tPHdrSupportVersionRange);
            f51813x5e78db46.put(java.lang.Integer.valueOf(i17), hashMap);
            return true;
        }
        java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange> hashMap2 = f51813x5e78db46.get(java.lang.Integer.valueOf(i17));
        f51813x5e78db46.remove(java.lang.Integer.valueOf(i17));
        if (!hashMap2.containsKey(str)) {
            hashMap2.put(str, tPHdrSupportVersionRange);
        }
        hashMap2.remove(str);
        hashMap2.put(str, tPHdrSupportVersionRange);
        f51813x5e78db46.put(java.lang.Integer.valueOf(i17), hashMap2);
        return true;
    }

    /* renamed from: addHDRVersionRangeToWhiteList */
    private static void m101698x95113952(int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange tPHdrSupportVersionRange, java.util.HashMap<java.lang.Integer, java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange>> hashMap) {
        java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange> arrayList = hashMap.containsKey(java.lang.Integer.valueOf(i17)) ? hashMap.get(java.lang.Integer.valueOf(i17)) : new java.util.ArrayList<>();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (m101745xd91ee7d2(tPHdrSupportVersionRange, arrayList.get(i18))) {
                return;
            }
        }
        arrayList.add(tPHdrSupportVersionRange);
        hashMap.put(java.lang.Integer.valueOf(i17), arrayList);
    }

    /* renamed from: addHDRVideoDecoderTypeWhiteList */
    public static boolean m101699x7681486f(int i17, int i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        if (i18 == 101) {
            m101698x95113952(i17, tPHdrSupportVersionRange, f51806x809de48c);
        } else {
            if (i18 != 102) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "addHDRVideoDecoderTypeWhiteList, decoder not support.");
                return false;
            }
            m101698x95113952(i17, tPHdrSupportVersionRange, f51805x1c6c4a6b);
        }
        return true;
    }

    /* renamed from: addHDRWhiteList */
    public static boolean m101700x7d009d52(int i17, java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        if (tPHdrSupportVersionRange == null) {
            return false;
        }
        if (!f51814x1eec36dc.containsKey(java.lang.Integer.valueOf(i17))) {
            java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange> hashMap = new java.util.HashMap<>();
            hashMap.put(str, tPHdrSupportVersionRange);
            f51814x1eec36dc.put(java.lang.Integer.valueOf(i17), hashMap);
            return true;
        }
        java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange> hashMap2 = f51814x1eec36dc.get(java.lang.Integer.valueOf(i17));
        f51814x1eec36dc.remove(java.lang.Integer.valueOf(i17));
        if (!hashMap2.containsKey(str)) {
            hashMap2.put(str, tPHdrSupportVersionRange);
        }
        hashMap2.remove(str);
        hashMap2.put(str, tPHdrSupportVersionRange);
        f51814x1eec36dc.put(java.lang.Integer.valueOf(i17), hashMap2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0126  */
    /* renamed from: checkHDRVividSupportByVersion */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m101701xb94a89e2(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101701xb94a89e2(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: convertDefinitionNameToDecodeLevel */
    private static int m101702x3649a92a(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.DefinitionName definitionName) {
        java.lang.Integer num = f51798xcccf477e.get(definitionName);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: convertDolbyVisionToOmxLevel */
    public static int m101703x1fd5cc72(int i17) {
        int i18 = 1 << i17;
        if (i18 < 1 || i18 > 256) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "convertDolbyVisionToOmxLevel Unsupported level" + i17);
            return i17;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "convertDolbyVisionToOmxLevel dolbyVisionLevel:" + i17 + " omxLevel:" + i18);
        return i18;
    }

    /* renamed from: convertDolbyVisionToOmxProfile */
    public static int m101704x6afa3717(int i17) {
        int i18 = 1 << i17;
        if (i17 < 1 || i17 > 512) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "convertDolbyVisionToOmxProfile Unsupported profile" + i17);
            return i17;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "convertDolbyVisionToOmxProfile dolbyVisionProfile:" + i17 + " omxProfile:" + i18);
        return i18;
    }

    /* renamed from: getACodecSWMaxCapabilityMap */
    public static synchronized java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability> m101705xa00b470f() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.class) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "getACodecSWMaxCapabilityMap func in");
            if (!f51820xaa2e06b4.isEmpty()) {
                return f51820xaa2e06b4;
            }
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(0, 0, f51782x605ccd0a, f51780xdb92bbed, f51781xa920f350);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability2 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(0, 0, f51802x2dd89489, f51800xa26d3cce, f51801xbd968e8f);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability3 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(0, 0, f51797xa57728f7, f51795x5826af20, f51796xbf0b667d);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability4 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(0, 0, f51797xa57728f7, f51795x5826af20, f51796xbf0b667d);
                f51820xaa2e06b4.put(5002, tPCodecMaxCapability);
                f51820xaa2e06b4.put(5012, tPCodecMaxCapability2);
                f51820xaa2e06b4.put(5003, tPCodecMaxCapability3);
                f51820xaa2e06b4.put(5040, tPCodecMaxCapability4);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "getACodecSWMaxCapabilityMap success.");
                return f51820xaa2e06b4;
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "getACodecSWMaxCapabilityMap exception");
                return null;
            }
        }
    }

    /* renamed from: getAMediaCodecMaxCapabilityMap */
    public static synchronized java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability> m101706xd44484dd() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.class) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "getAMediaCodecMaxCapabilityMap func in");
            if (!f51819xcdc075e9.isEmpty()) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "return memory stored audio max cap map");
                return f51819xcdc075e9;
            }
            try {
                for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a c26307xa598bb2a : com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26308xa59a071a.m101851x1afabf73(f51818x2853c324)) {
                    java.lang.String m101827xeef34bbc = c26307xa598bb2a.m101827xeef34bbc();
                    if (c26307xa598bb2a.m101835x7a7648cc() && m101744x7112f456(m101827xeef34bbc) && !m101739xff6b9a5c(m101827xeef34bbc) && !m101728xd4ded1a9(c26307xa598bb2a.m101828x21f31fb9())) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "Audio MimeType: " + m101827xeef34bbc + " codecName: " + c26307xa598bb2a.m101828x21f31fb9());
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel m101832xdaee98a9 = c26307xa598bb2a.m101832xdaee98a9();
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(m101832xdaee98a9.f52178xed8e89a9, m101832xdaee98a9.f52177x6219b84, c26307xa598bb2a.m101831x7ed7f612(), c26307xa598bb2a.m101829x2e58e425(), c26307xa598bb2a.m101830xb0e2c238());
                        if (!f51819xcdc075e9.containsKey(java.lang.Integer.valueOf(m101720x3b7896b9(m101827xeef34bbc)))) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "audio codecName: " + c26307xa598bb2a.m101828x21f31fb9() + " maxSamplerate: " + c26307xa598bb2a.m101831x7ed7f612() + " maxChannels: " + c26307xa598bb2a.m101830xb0e2c238());
                            m101747x413cb2b4(java.lang.Integer.valueOf(m101720x3b7896b9(m101827xeef34bbc)), tPCodecMaxCapability, f51819xcdc075e9);
                            m101747x413cb2b4(m101827xeef34bbc, c26307xa598bb2a.m101828x21f31fb9(), f51789x294e1774);
                            f51785x80f258a.add(m101827xeef34bbc);
                        } else if (c26307xa598bb2a.m101831x7ed7f612() > f51819xcdc075e9.get(java.lang.Integer.valueOf(m101720x3b7896b9(m101827xeef34bbc))).f51640xc2a6662e || android.text.TextUtils.equals(m101827xeef34bbc, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54254x5c6a3f6d)) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "audio codecName: " + c26307xa598bb2a.m101828x21f31fb9() + " maxSamplerate: " + c26307xa598bb2a.m101831x7ed7f612() + " maxChannels: " + c26307xa598bb2a.m101830xb0e2c238());
                            m101747x413cb2b4(java.lang.Integer.valueOf(m101720x3b7896b9(m101827xeef34bbc)), tPCodecMaxCapability, f51819xcdc075e9);
                            m101747x413cb2b4(m101827xeef34bbc, c26307xa598bb2a.m101828x21f31fb9(), f51789x294e1774);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "getAMediaCodecMaxCapabilityMap failed:" + e17.getMessage());
            }
            return f51819xcdc075e9;
        }
    }

    /* renamed from: getAV1SWDecodeLevel */
    public static int m101707x269ad76c() {
        return m101710x91bda8b2();
    }

    /* renamed from: getAudioMediaCodecPassThroughCap */
    public static boolean m101708xe9fed330(int i17, int i18, int i19) {
        if (i17 != 5004) {
            return false;
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.m101688xfbc9fda7(i18 == 20 ? 7 : (i18 == 50 || i18 == 60) ? 8 : 1, i19);
    }

    /* renamed from: getAvs3SWDecodeLevel */
    public static int m101709xd4e1e587() {
        java.lang.String m101943x709d7b26 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101943x709d7b26();
        int m101942x42e863db = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101942x42e863db(m101943x709d7b26);
        int m101941x1ff16ac4 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101941x1ff16ac4(m101943x709d7b26);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "[getAvs3SWDecodeLevel], mCpuHWProducter = " + m101942x42e863db + ", getMaxCpuFreq() = " + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101948x6ef38a32() + ", numCores = " + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101949x9b92a44() + ", mCpuHWProductIdx=" + m101941x1ff16ac4 + ", hardware=" + m101943x709d7b26);
        int i17 = f51790xabacfa4c;
        if (-1 != i17) {
            return i17;
        }
        f51790xabacfa4c = 0;
        if (-1 == m101942x42e863db) {
            f51790xabacfa4c = m101710x91bda8b2();
        } else if (m101942x42e863db != 0) {
            if (m101942x42e863db == 1) {
                f51790xabacfa4c = m101710x91bda8b2();
            } else if (m101942x42e863db != 2) {
                if (m101942x42e863db == 3) {
                    f51790xabacfa4c = m101710x91bda8b2();
                }
            } else if (m101941x1ff16ac4 >= f51803x33ed2431) {
                f51790xabacfa4c = 26;
            } else {
                f51790xabacfa4c = m101710x91bda8b2();
            }
        } else if (m101941x1ff16ac4 >= f51804xf554e1ed) {
            f51790xabacfa4c = 26;
        } else if (m101941x1ff16ac4 >= f51824xb88cc4c0) {
            f51790xabacfa4c = 21;
        } else {
            f51790xabacfa4c = m101710x91bda8b2();
        }
        return f51790xabacfa4c;
    }

    /* renamed from: getDecodeLevelByCoresAndFreq */
    private static int m101710x91bda8b2() {
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101949x9b92a44() >= 8) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101948x6ef38a32() / 1000 >= 1200) {
                return 21;
            }
        } else if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101949x9b92a44() >= 6) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101948x6ef38a32() / 1000 >= 1400) {
                return 21;
            }
        } else {
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101949x9b92a44() < 4) {
                return 6;
            }
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101948x6ef38a32() / 1000 >= 1600) {
                return 21;
            }
        }
        return 16;
    }

    /* renamed from: getDecoderMaxCapabilityMapAsync */
    public static synchronized void m101711xc2c944ce() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.class) {
            if (f51817xbce29449) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "decoder capability already init,return directly!");
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "decoder capability not init,acquire async with create thread!");
            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.common.TPCodecUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101724x87eae4b2();
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101706xd44484dd();
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101723x4c2bff5a();
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101705xa00b470f();
                    boolean unused = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.f51817xbce29449 = true;
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.TAG, "new thread getDecoderMaxCapabilityMap done");
                }
            });
            thread.setName("TP_codec_init_thread");
            thread.start();
        }
    }

    /* renamed from: getDecoderName */
    public static java.lang.String m101712x21f31fb9(java.lang.String str, boolean z17) {
        if (str.contains("audio")) {
            if (android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54253xe4f8678e) && f51789x294e1774.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54254x5c6a3f6d)) {
                return f51789x294e1774.get(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54254x5c6a3f6d);
            }
            if (f51789x294e1774.containsKey(str)) {
                return f51789x294e1774.get(str);
            }
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a c26307xa598bb2a : com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26308xa59a071a.m101851x1afabf73(f51818x2853c324)) {
            if (android.text.TextUtils.equals(str, c26307xa598bb2a.m101827xeef34bbc()) && c26307xa598bb2a.m101837xaaabbbc3() == z17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "getDecoderName:" + c26307xa598bb2a.m101828x21f31fb9());
                arrayList.add(c26307xa598bb2a);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a c26307xa598bb2a2 = (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a) it.next();
            if ((c26307xa598bb2a2.m101839x7b98c171() && c26307xa598bb2a2.m101840xa4a8570e() == f51823x4ebf2ae2) || (c26307xa598bb2a2.m101835x7a7648cc() && c26307xa598bb2a2.m101836x82cc6329() == f51823x4ebf2ae2)) {
                return c26307xa598bb2a2.m101828x21f31fb9();
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a) arrayList.get(0)).m101828x21f31fb9();
    }

    /* renamed from: getDecoderNameWithoutCache */
    public static java.lang.String m101713xa5d8a1f3(java.lang.String str, boolean z17) {
        if (!str.contains("audio")) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a c26307xa598bb2a : com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26308xa59a071a.m101851x1afabf73(null)) {
                if (android.text.TextUtils.equals(str, c26307xa598bb2a.m101827xeef34bbc()) && c26307xa598bb2a.m101837xaaabbbc3() == z17) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "getDecoderName:" + c26307xa598bb2a.m101828x21f31fb9());
                    arrayList.add(c26307xa598bb2a);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a c26307xa598bb2a2 = (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a) it.next();
                if ((c26307xa598bb2a2.m101839x7b98c171() && c26307xa598bb2a2.m101840xa4a8570e() == f51823x4ebf2ae2) || (c26307xa598bb2a2.m101835x7a7648cc() && c26307xa598bb2a2.m101836x82cc6329() == f51823x4ebf2ae2)) {
                    return c26307xa598bb2a2.m101828x21f31fb9();
                }
            }
            if (!arrayList.isEmpty()) {
                return ((com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a) arrayList.get(0)).m101828x21f31fb9();
            }
        } else {
            if (android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54253xe4f8678e) && f51789x294e1774.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54254x5c6a3f6d)) {
                return f51789x294e1774.get(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54254x5c6a3f6d);
            }
            if (f51789x294e1774.containsKey(str)) {
                return f51789x294e1774.get(str);
            }
        }
        return null;
    }

    /* renamed from: getDisplayVersion */
    public static java.lang.String m101714x64596aac() {
        if (!android.text.TextUtils.equals(android.os.Build.BRAND, "HUAWEI") && !android.text.TextUtils.equals(android.os.Build.MANUFACTURER, "HONOR")) {
            return null;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getDeclaredMethod("get", java.lang.String.class).invoke(cls, "ro.build.display.id");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "get huawei display version failed:" + e17.getMessage());
            return null;
        }
    }

    /* renamed from: getDolbyVisionDecoderName */
    public static java.lang.String m101715xcce9f065(java.lang.String str, int i17, int i18, boolean z17) {
        if (!android.text.TextUtils.equals("video/dolby-vision", str)) {
            return null;
        }
        int m101704x6afa3717 = m101704x6afa3717(i17);
        for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a c26307xa598bb2a : com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26308xa59a071a.m101851x1afabf73(f51818x2853c324)) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel[] m101834x719764c2 = c26307xa598bb2a.m101834x719764c2();
            if (android.text.TextUtils.equals(c26307xa598bb2a.m101827xeef34bbc(), str)) {
                for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel decoderProfileLevel : m101834x719764c2) {
                    if (decoderProfileLevel.f52178xed8e89a9 == m101704x6afa3717) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "getDolbyVisionDecoderName  profile:" + decoderProfileLevel.f52178xed8e89a9 + " dvProfile:" + i17 + " bSecure:" + z17 + " name:" + c26307xa598bb2a.m101828x21f31fb9());
                        if (c26307xa598bb2a.m101837xaaabbbc3() == z17) {
                            return c26307xa598bb2a.m101828x21f31fb9();
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: getHevcSWDecodeLevel */
    public static int m101716x75ff4852() {
        java.lang.String m101943x709d7b26 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101943x709d7b26();
        int m101942x42e863db = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101942x42e863db(m101943x709d7b26);
        int m101941x1ff16ac4 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101941x1ff16ac4(m101943x709d7b26);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "[getHevcSWDecodeLevel], mCpuHWProducter = " + m101942x42e863db + ", getMaxCpuFreq() = " + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101948x6ef38a32() + ", numCores = " + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101949x9b92a44() + ", mCpuHWProductIdx=" + m101941x1ff16ac4 + ", hardware=" + m101943x709d7b26);
        int i17 = f51815x5dca93d7;
        if (-1 != i17) {
            return i17;
        }
        f51815x5dca93d7 = 0;
        if (-1 == m101942x42e863db) {
            f51815x5dca93d7 = m101710x91bda8b2();
        } else if (m101942x42e863db != 0) {
            if (m101942x42e863db != 1) {
                if (m101942x42e863db != 2) {
                    if (m101942x42e863db == 3) {
                        if (m101941x1ff16ac4 >= f51828x59580ba4) {
                            f51815x5dca93d7 = 21;
                        } else if (m101941x1ff16ac4 >= f51812xa816eeb) {
                            f51815x5dca93d7 = 16;
                        } else {
                            f51815x5dca93d7 = m101710x91bda8b2();
                        }
                    }
                } else if (m101941x1ff16ac4 >= f51825x3791e8cf) {
                    f51815x5dca93d7 = 21;
                } else if (m101941x1ff16ac4 >= f51809x8ca1a2e8) {
                    f51815x5dca93d7 = 16;
                } else {
                    f51815x5dca93d7 = m101710x91bda8b2();
                }
            } else if (m101941x1ff16ac4 >= f51826xe4e5943a) {
                f51815x5dca93d7 = 21;
            } else if (m101941x1ff16ac4 >= f51810xbe59b301) {
                f51815x5dca93d7 = 16;
            } else {
                f51815x5dca93d7 = m101710x91bda8b2();
            }
        } else if (m101941x1ff16ac4 >= f51827x59aa278b) {
            f51815x5dca93d7 = 21;
        } else if (m101941x1ff16ac4 >= f51811xcdad2d24) {
            f51815x5dca93d7 = 16;
        } else {
            f51815x5dca93d7 = m101710x91bda8b2();
        }
        return f51815x5dca93d7;
    }

    /* renamed from: getMaxLumaSample */
    public static int m101717x230a35b5(java.lang.String str, int i17) {
        if (android.text.TextUtils.equals(str, "video/avc")) {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.m101802x22898b3(i17);
        }
        if (android.text.TextUtils.equals(str, "video/hevc")) {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.m101803xc692a48b(i17);
        }
        if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.m101804xb373a4a3(i17);
        }
        if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.m101805x95516e42(i17);
        }
        if (android.text.TextUtils.equals(str, "video/av01")) {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.m101801x20906b85(i17);
        }
        if (android.text.TextUtils.equals(str, "video/vvc")) {
            for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a c26307xa598bb2a : com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26308xa59a071a.m101851x1afabf73(f51818x2853c324)) {
                if (c26307xa598bb2a.m101827xeef34bbc().equalsIgnoreCase("video/vvc")) {
                    return c26307xa598bb2a.m101826x59cab4f0() * c26307xa598bb2a.m101825xc5bcef3d();
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        r10 = r4.m101826x59cab4f0();
        r1 = r4.m101825xc5bcef3d();
        r2 = r4.m101822x330f4a7b();
        r11 = r4.m101821x150b0b12();
        r12 = r4.m101824xebeca4cf();
        r13 = r4.m101823x7e3dce17();
        m101741xdf427475(r10, r1, r2, r11, r16, r17);
        r9 = java.lang.Integer.valueOf((int) java.lang.Math.min(r13, java.lang.Math.max(1.0f, (((r10 * r11) * 1.0f) / java.lang.Math.max((r16 * r17) * 1.0f, 1.0f)) * r12)));
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.TAG, "getSupportedFrameRatesFor codecID:" + r15 + " max width:" + r10 + " max height:" + r11 + " max framerate for max resolution:" + r12 + " current width:" + r16 + " height:" + r17 + " max support framerate:" + r9);
     */
    /* renamed from: getMaxSupportedFrameRatesFor */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int m101718xc8ab7a83(int r14, int r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101718xc8ab7a83(int, int, int, int):int");
    }

    /* renamed from: getSoftMaxSamples */
    private static int m101719x84640ac5(int i17) {
        if (i17 == 1) {
            return 129600;
        }
        if (i17 == 6) {
            return 307200;
        }
        if (i17 == 11) {
            return 407040;
        }
        if (i17 == 16) {
            return 480000;
        }
        if (i17 == 21) {
            return com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56204xe102e506;
        }
        if (i17 == 26) {
            return 2073600;
        }
        if (i17 != 28) {
            return i17 != 33 ? 0 : 8847360;
        }
        return 8294400;
    }

    /* renamed from: getSupportedCodecId */
    private static int m101720x3b7896b9(java.lang.String str) {
        if (android.text.TextUtils.equals(str, "video/avc")) {
            return 26;
        }
        if (android.text.TextUtils.equals(str, "video/hevc")) {
            return 172;
        }
        if (android.text.TextUtils.equals(str, "video/vvc")) {
            return 193;
        }
        if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            return 138;
        }
        if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            return 166;
        }
        if (android.text.TextUtils.equals(str, "video/av01")) {
            return 1029;
        }
        if (android.text.TextUtils.equals(str, "audio/mp4a-latm")) {
            return 5002;
        }
        if (android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54244xb1630448)) {
            return 5003;
        }
        if (android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54253xe4f8678e) || android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54254x5c6a3f6d)) {
            return 5040;
        }
        if (android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54255x7affee51)) {
            return 5012;
        }
        return android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54250xb16311ba) ? 5004 : -1;
    }

    /* renamed from: getSupportedHWMimeType */
    private static java.lang.String m101721x26040bb5(int i17) {
        return i17 != 26 ? i17 != 138 ? i17 != 166 ? i17 != 172 ? i17 != 193 ? i17 != 1029 ? "" : "video/av01" : "video/vvc" : "video/hevc" : "video/x-vnd.on2.vp9" : "video/x-vnd.on2.vp8" : "video/avc";
    }

    /* renamed from: getSystemPatchVersion */
    public static java.lang.String m101722xbcfd8d35() {
        if (!android.text.TextUtils.equals(android.os.Build.BRAND, "HUAWEI")) {
            return null;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getDeclaredMethod("get", java.lang.String.class).invoke(cls, "hwouc.hwpatch.version");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "get huawei system patch version failed:" + e17.getMessage());
            return null;
        }
    }

    /* renamed from: getVCodecSWMaxCapabilityMap */
    public static synchronized java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability> m101723x4c2bff5a() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.class) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "getVCodecSWMaxCapabilityMap func in");
            if (f51816x3e30a1f6) {
                return f51822xb2ba2a49;
            }
            try {
                int m101716x75ff4852 = m101716x75ff4852();
                int m101719x84640ac5 = m101719x84640ac5(m101716x75ff4852);
                int m101709xd4e1e587 = m101709xd4e1e587();
                int m101707x269ad76c = m101707x269ad76c();
                int m101726x50b3e5 = m101726x50b3e5();
                int m101719x84640ac52 = m101719x84640ac5(m101709xd4e1e587);
                int m101719x84640ac53 = m101719x84640ac5(m101707x269ad76c);
                int m101719x84640ac54 = m101719x84640ac5(m101726x50b3e5);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "getVCodecSWMaxCapabilityMap, hevcDecodeLevel:" + m101716x75ff4852 + ", avs3DecodeLevel:" + m101709xd4e1e587 + ", AV1DecodeLevel:" + m101707x269ad76c + ", vvcDecodeLevel:" + m101726x50b3e5);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability = f51787x3c5f1057;
                tPCodecMaxCapability.f51638x4fa4b468 = m101719x84640ac5;
                tPCodecMaxCapability.f51639x338763a5 = 64;
                tPCodecMaxCapability.f51637x1740c480 = 65536;
                f51822xb2ba2a49.put(26, f51787x3c5f1057);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability2 = f51808x34eebe61;
                tPCodecMaxCapability2.f51638x4fa4b468 = m101719x84640ac5;
                tPCodecMaxCapability2.f51639x338763a5 = 2;
                tPCodecMaxCapability2.f51637x1740c480 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432;
                f51822xb2ba2a49.put(172, f51808x34eebe61);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability3 = f51834xa8a8be26;
                tPCodecMaxCapability3.f51638x4fa4b468 = m101719x84640ac5;
                tPCodecMaxCapability3.f51639x338763a5 = 8;
                tPCodecMaxCapability3.f51637x1740c480 = 8192;
                f51822xb2ba2a49.put(166, f51834xa8a8be26);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability4 = f51833xc716e047;
                tPCodecMaxCapability4.f51638x4fa4b468 = m101719x84640ac5;
                tPCodecMaxCapability4.f51639x338763a5 = 1;
                tPCodecMaxCapability4.f51637x1740c480 = 8;
                f51822xb2ba2a49.put(138, f51833xc716e047);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability5 = f51788x1a0fa627;
                tPCodecMaxCapability5.f51638x4fa4b468 = m101719x84640ac52;
                tPCodecMaxCapability5.f51639x338763a5 = 0;
                tPCodecMaxCapability5.f51637x1740c480 = 0;
                f51822xb2ba2a49.put(192, f51788x1a0fa627);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability6 = f51786x601d76a9;
                tPCodecMaxCapability6.f51638x4fa4b468 = m101719x84640ac53;
                tPCodecMaxCapability6.f51639x338763a5 = 0;
                tPCodecMaxCapability6.f51637x1740c480 = 0;
                f51822xb2ba2a49.put(1029, f51786x601d76a9);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability7 = f51835x5c569ce2;
                tPCodecMaxCapability7.f51638x4fa4b468 = m101719x84640ac54;
                tPCodecMaxCapability7.f51639x338763a5 = 0;
                tPCodecMaxCapability7.f51637x1740c480 = 0;
                f51822xb2ba2a49.put(193, f51835x5c569ce2);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "getVCodecSWMaxCapabilityMap success, maxHevcLumaSamples:" + m101719x84640ac5 + ", maxAvs3LumaSamples:" + m101719x84640ac52 + ", maxAV1LumaSamples:" + m101719x84640ac53 + ", maxVvcLumaSamples:" + m101719x84640ac54);
                f51816x3e30a1f6 = true;
                return f51822xb2ba2a49;
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "getVCodecSWMaxCapabilityMap exception");
                return null;
            }
        }
    }

    /* renamed from: getVMediaCodecMaxCapabilityMap */
    public static synchronized java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability> m101724x87eae4b2() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.class) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "getVMediaCodecMaxCapabilityMap func in");
            if (!f51821xd64c997e.isEmpty()) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "return memory stored video max cap map");
                return f51821xd64c997e;
            }
            try {
                for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a c26307xa598bb2a : com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26308xa59a071a.m101851x1afabf73(f51818x2853c324)) {
                    java.lang.String m101827xeef34bbc = c26307xa598bb2a.m101827xeef34bbc();
                    if (c26307xa598bb2a.m101839x7b98c171()) {
                        f51832x2806b215.add(m101827xeef34bbc);
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "Video MimeType: " + m101827xeef34bbc + " codecName: " + c26307xa598bb2a.m101828x21f31fb9());
                        if (m101744x7112f456(m101827xeef34bbc) && !c26307xa598bb2a.m101837xaaabbbc3()) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel m101832xdaee98a9 = c26307xa598bb2a.m101832xdaee98a9();
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability tPCodecMaxCapability = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPCodecMaxCapability(m101717x230a35b5(m101827xeef34bbc, m101832xdaee98a9.f52177x6219b84), m101832xdaee98a9.f52178xed8e89a9, m101832xdaee98a9.f52177x6219b84, (int) c26307xa598bb2a.m101824xebeca4cf());
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "video codecName: " + c26307xa598bb2a.m101828x21f31fb9() + " lumasample: " + m101717x230a35b5(m101827xeef34bbc, m101832xdaee98a9.f52177x6219b84) + " framerate: " + c26307xa598bb2a.m101824xebeca4cf());
                            if (!f51821xd64c997e.containsKey(java.lang.Integer.valueOf(m101720x3b7896b9(m101827xeef34bbc))) || m101832xdaee98a9.f52177x6219b84 > f51821xd64c997e.get(java.lang.Integer.valueOf(m101720x3b7896b9(m101827xeef34bbc))).f51637x1740c480) {
                                m101747x413cb2b4(java.lang.Integer.valueOf(m101720x3b7896b9(m101827xeef34bbc)), tPCodecMaxCapability, f51821xd64c997e);
                            }
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "getVMediaCodecMaxCapabilityMap failed:" + android.util.Log.getStackTraceString(e17));
            }
            return f51821xd64c997e;
        }
    }

    /* renamed from: getValueFromSubstring */
    private static int m101725x64b915cc(java.lang.String str, int i17, int i18) {
        if (i17 < 0) {
            i17 = 0;
        }
        if (i18 >= str.length()) {
            i18 = str.length() - 1;
        }
        if (i17 > i18) {
            i17 = i18;
        }
        return java.lang.Integer.parseInt(str.substring(i17, i18));
    }

    /* renamed from: getVvcSWDecodeLevel */
    private static int m101726x50b3e5() {
        int i17 = f51837x1366a6f8;
        if (i17 != -1) {
            return i17;
        }
        java.lang.String m101943x709d7b26 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101943x709d7b26();
        int m101942x42e863db = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101942x42e863db(m101943x709d7b26);
        int m101941x1ff16ac4 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101941x1ff16ac4(m101943x709d7b26);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "[getVvcSWDecodeLevel], mCpuHWProducer = " + m101942x42e863db + ", getMaxCpuFreq() = " + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101948x6ef38a32() + ", numCores = " + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101949x9b92a44() + ", mCpuHWProductIdx = " + m101941x1ff16ac4 + ", hardware = " + m101943x709d7b26);
        if (m101942x42e863db == -1) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "current cpu manufacturer is not listed in the performance list, cpuHwProducer:" + m101942x42e863db);
            f51837x1366a6f8 = 0;
            return 0;
        }
        if (m101941x1ff16ac4 != -1) {
            int m101748x488a7b96 = m101748x488a7b96(193, m101942x42e863db, m101941x1ff16ac4);
            int i18 = m101748x488a7b96 != -1 ? m101748x488a7b96 : 0;
            f51837x1366a6f8 = i18;
            return i18;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "current cpu model is not listed in the performance list, cpuHwProductIdx:" + m101941x1ff16ac4);
        f51837x1366a6f8 = 0;
        return 0;
    }

    /* renamed from: init */
    public static synchronized void m101727x316510(android.content.Context context, boolean z17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.class) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "is local cache enabled:" + z17);
            android.content.Context applicationContext = context.getApplicationContext();
            f51794xd6cfe882 = applicationContext;
            if (z17) {
                f51818x2853c324 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.get(applicationContext);
            }
            m101711xc2c944ce();
        }
    }

    /* renamed from: isAMediaCodecBlackListInstance */
    public static boolean m101728xd4ded1a9(java.lang.String str) {
        return f51783x962d126c.contains(str);
    }

    /* renamed from: isAMediaCodecBlackListModel */
    public static boolean m101729x6576f695() {
        return f51784xd81f24b2.contains(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7());
    }

    /* renamed from: isBlackListType */
    public static boolean m101730x3e12110d(java.lang.String str) {
        return java.util.Arrays.asList("PRO 7 Plus", "PRO 7-H", "PRO+7+Plus").contains(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7()) && android.text.TextUtils.equals(str, "video/hevc");
    }

    /* renamed from: isHDR10Support */
    private static synchronized boolean m101731x8f0c98c4(int i17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.class) {
            for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a c26307xa598bb2a : com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26308xa59a071a.m101851x1afabf73(f51818x2853c324)) {
                if (android.text.TextUtils.equals(c26307xa598bb2a.m101827xeef34bbc(), "video/hevc")) {
                    for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel decoderProfileLevel : c26307xa598bb2a.m101834x719764c2()) {
                        if (decoderProfileLevel.f52178xed8e89a9 == i17) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "support hdr10 " + i17);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: isHDRDVSupport */
    private static synchronized boolean m101732xfb8d7ef1(int i17, int i18) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.class) {
            if (i17 == 0 && i18 == 0) {
                return f51832x2806b215.contains("video/dolby-vision");
            }
            for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a c26307xa598bb2a : com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26308xa59a071a.m101851x1afabf73(f51818x2853c324)) {
                if (android.text.TextUtils.equals(c26307xa598bb2a.m101827xeef34bbc(), "video/dolby-vision")) {
                    for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel decoderProfileLevel : c26307xa598bb2a.m101834x719764c2()) {
                        if (decoderProfileLevel.f52178xed8e89a9 == i17 && decoderProfileLevel.f52177x6219b84 == i18) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "support dolbyvision");
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: isHDRDecoderTypeSupport */
    public static boolean m101733xebf3f6dd(int i17, int i18) {
        if (i18 != 102 && i18 != 101) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "isHDRDecodeTypeSupport, not support decoderType, decoderType = " + i18);
            return false;
        }
        java.util.HashMap<java.lang.Integer, java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange>> hashMap = i18 == 102 ? f51805x1c6c4a6b : f51806x809de48c;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return m101736xebfc905b(hashMap.get(java.lang.Integer.valueOf(i17)));
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "isHDRDecodeTypeSupport, not config hdrType whiteList, hdrType = " + i17);
        return false;
    }

    /* renamed from: isHDRsupport */
    public static boolean m101734xf9014ce3(int i17, int i18, int i19) {
        if (i17 == 2) {
            return m101732xfb8d7ef1(i18, i19);
        }
        if (i17 == 0) {
            return m101731x8f0c98c4(4096);
        }
        if (i17 == 1) {
            return m101731x8f0c98c4(8192);
        }
        if (i17 != 4) {
            return false;
        }
        java.lang.String m101714x64596aac = m101714x64596aac();
        java.lang.String m101722xbcfd8d35 = m101722xbcfd8d35();
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "isHDRsupport(HDRVivid):display version:" + m101714x64596aac);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "isHDRsupport(HDRVivid):patch version:" + m101722xbcfd8d35);
        return m101701xb94a89e2(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7(), m101714x64596aac, m101722xbcfd8d35);
    }

    /* renamed from: isInDRMLevel1Blacklist */
    public static boolean m101735x44848d20(int i17) {
        if (f51799x7b1d9026.containsKey(java.lang.Integer.valueOf(i17))) {
            return f51799x7b1d9026.get(java.lang.Integer.valueOf(i17)).contains(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7());
        }
        return false;
    }

    /* renamed from: isInHDRVersionRangeWhiteList */
    private static boolean m101736xebfc905b(java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange> arrayList) {
        if (arrayList == null) {
            return false;
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange tPHdrSupportVersionRange = arrayList.get(i17);
            int i18 = android.os.Build.VERSION.SDK_INT;
            if (i18 <= tPHdrSupportVersionRange.f51644xd02df75d && i18 >= tPHdrSupportVersionRange.f51641x35d4e43c) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "inHDRVersionRangeWhiteList!");
                return true;
            }
        }
        return false;
    }

    /* renamed from: isInHDRVividBlackList */
    public static boolean m101737x3cf94ec6(java.lang.String str, int i17, int i18) {
        if (f51813x5e78db46.containsKey(4)) {
            java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange> hashMap = f51813x5e78db46.get(4);
            if (hashMap.containsKey(str)) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange tPHdrSupportVersionRange = hashMap.get(str);
                if (i17 <= tPHdrSupportVersionRange.f51646x246946ed && i17 >= tPHdrSupportVersionRange.f51643x5a53df8c && i18 <= tPHdrSupportVersionRange.f51645x80a133ac && i18 >= tPHdrSupportVersionRange.f51642xec18b2d) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: isInHDRVividWhiteList */
    public static boolean m101738x8af165f0(java.lang.String str, int i17, int i18) {
        if (f51814x1eec36dc.containsKey(4)) {
            java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange> hashMap = f51814x1eec36dc.get(4);
            if (hashMap.containsKey(str)) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange tPHdrSupportVersionRange = hashMap.get(str);
                if (i17 <= tPHdrSupportVersionRange.f51646x246946ed && i17 >= tPHdrSupportVersionRange.f51643x5a53df8c && i18 <= tPHdrSupportVersionRange.f51645x80a133ac && i18 >= tPHdrSupportVersionRange.f51642xec18b2d) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: isInMediaCodecBlackList */
    public static boolean m101739xff6b9a5c(java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.Integer> hashMap;
        java.lang.String m101947x1ccda9f7 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7();
        if (android.text.TextUtils.isEmpty(m101947x1ccda9f7) || (hashMap = f51792x24d263d4) == null || !hashMap.containsKey(m101947x1ccda9f7)) {
            return false;
        }
        java.lang.Integer num = f51792x24d263d4.get(m101947x1ccda9f7);
        if (android.text.TextUtils.equals(str, "video/avc")) {
            if ((num.intValue() & 1) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "video/hevc")) {
            if ((num.intValue() & 2) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            if ((num.intValue() & 256) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            if ((num.intValue() & 4) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "audio/mp4a-latm")) {
            if ((num.intValue() & 8) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54244xb1630448)) {
            if ((num.intValue() & 16) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54253xe4f8678e)) {
            if ((num.intValue() & 32) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54255x7affee51)) {
            if ((num.intValue() & 64) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54250xb16311ba)) {
            if ((num.intValue() & 128) == 0) {
                return false;
            }
        } else if (!android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54254x5c6a3f6d) || (num.intValue() & 32) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: isInMediaCodecWhiteList */
    public static boolean m101740x4d63b186(java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.Integer> hashMap;
        java.lang.String m101947x1ccda9f7 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7();
        if (android.text.TextUtils.isEmpty(m101947x1ccda9f7) || (hashMap = f51793x72ca7afe) == null || !hashMap.containsKey(m101947x1ccda9f7)) {
            return false;
        }
        java.lang.Integer num = f51793x72ca7afe.get(m101947x1ccda9f7);
        if (android.text.TextUtils.equals(str, "video/avc")) {
            if ((num.intValue() & 1) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "video/hevc")) {
            if ((num.intValue() & 2) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            if ((num.intValue() & 256) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            if ((num.intValue() & 4) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "audio/mp4a-latm")) {
            if ((num.intValue() & 8) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54244xb1630448)) {
            if ((num.intValue() & 16) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54253xe4f8678e)) {
            if ((num.intValue() & 32) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54255x7affee51)) {
            if ((num.intValue() & 64) == 0) {
                return false;
            }
        } else if (!android.text.TextUtils.equals(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54250xb16311ba) || (num.intValue() & 128) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: isLimitMaxWidthOrMaxHeight */
    private static boolean m101741xdf427475(int i17, int i18, int i19, int i27, int i28, int i29) {
        if ((i28 <= i29 || (i28 <= i17 && i29 <= i27)) && (i28 >= i29 || (i28 <= i19 && i29 <= i18))) {
            return false;
        }
        int i37 = i28 > i29 ? i27 * i17 : i19 * i18;
        if (i17 < i28 || i18 < i29 || i37 < i28 * i29) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "getSupportedFrameRatesFor width:" + i28 + " height:" + i29 + " do not support! maxWidth:" + i17 + " maxHeight:" + i18);
            return true;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "getSupportedFrameRatesFor width:" + i28 + " height:" + i29 + " limit maxLumaWidth or maxLumaHeight, but not limit maxLumaSamples, do support! maxWidth:" + i17 + " maxHeight:" + i18 + " maxLumaSamples:" + i37);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.f51785x80f258a.contains(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54254x5c6a3f6d) != false) goto L13;
     */
    /* renamed from: isMediaCodecDDPlusSupported */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean m101742xfcb56cb8() {
        /*
            java.lang.Class<com.tencent.thumbplayer.core.common.TPCodecUtils> r0 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.class
            monitor-enter(r0)
            boolean r1 = m101729x6576f695()     // Catch: java.lang.Throwable -> L23
            r2 = 0
            if (r1 == 0) goto Lc
            monitor-exit(r0)
            return r2
        Lc:
            java.util.ArrayList<java.lang.String> r1 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.f51785x80f258a     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "audio/eac3"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L20
            java.util.ArrayList<java.lang.String> r1 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.f51785x80f258a     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "audio/eac3-joc"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L21
        L20:
            r2 = 1
        L21:
            monitor-exit(r0)
            return r2
        L23:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101742xfcb56cb8():boolean");
    }

    /* renamed from: isMediaCodecDolbyDSSupported */
    public static synchronized boolean m101743x35999803() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.class) {
            if (m101729x6576f695()) {
                return false;
            }
            return f51785x80f258a.contains(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54244xb1630448);
        }
    }

    /* renamed from: isSupportedMediaCodec */
    private static boolean m101744x7112f456(java.lang.String str) {
        return f51830xd88b3c33.contains(str);
    }

    /* renamed from: isTheSameVersionRange */
    private static boolean m101745xd91ee7d2(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange tPHdrSupportVersionRange, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26288x79bb53b2.TPHdrSupportVersionRange tPHdrSupportVersionRange2) {
        return tPHdrSupportVersionRange.f51642xec18b2d == tPHdrSupportVersionRange2.f51642xec18b2d && tPHdrSupportVersionRange.f51643x5a53df8c == tPHdrSupportVersionRange2.f51643x5a53df8c && tPHdrSupportVersionRange.f51645x80a133ac == tPHdrSupportVersionRange2.f51645x80a133ac && tPHdrSupportVersionRange.f51646x246946ed == tPHdrSupportVersionRange2.f51646x246946ed;
    }

    /* renamed from: isVMediaCodecBlackListModel */
    public static boolean m101746x3d6d47aa() {
        return f51831xb01575c7.contains(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7());
    }

    /* renamed from: replace */
    private static <K, T> void m101747x413cb2b4(K k17, T t17, java.util.HashMap<K, T> hashMap) {
        if (!hashMap.containsKey(k17)) {
            hashMap.put(k17, t17);
        } else {
            hashMap.remove(k17);
            hashMap.put(k17, t17);
        }
    }

    /* renamed from: selectBestDecodeLevelFromCapabilityTable */
    private static int m101748x488a7b96(int i17, int i18, int i19) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.VideoSwCapabilityModel videoSwCapabilityModel = f51836x2037e7cf.get(i17);
        if (videoSwCapabilityModel == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "No corresponding codec id found, codecId:" + i17);
            return -1;
        }
        java.util.HashMap<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.DefinitionName, java.lang.String> hashMap = videoSwCapabilityModel.f51841x84e9b1b8.get(i18);
        if (hashMap == null || hashMap.isEmpty()) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "No corresponding cpu producer found, cpuHwProducer:" + i18);
            return -1;
        }
        for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.DefinitionName definitionName : com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.DefinitionName.m101752xcee59d22()) {
            java.lang.String str = hashMap.get(definitionName);
            if (!android.text.TextUtils.isEmpty(str) && i19 >= com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101940x1ff16ac4(i18, str)) {
                return m101702x3649a92a(definitionName);
            }
        }
        return -1;
    }

    /* renamed from: setMediaCodecPreferredSoftwareComponent */
    public static void m101749x36d3bc49(boolean z17) {
        f51823x4ebf2ae2 = z17;
    }
}
