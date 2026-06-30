package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class q {
    public static final int A;
    public static final int B;
    public static final java.lang.String[] C;

    /* renamed from: z, reason: collision with root package name */
    public static int f96046z;

    /* renamed from: a, reason: collision with root package name */
    public int f96047a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f96048b;

    /* renamed from: c, reason: collision with root package name */
    public wo.i1 f96049c;

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaFormat f96050d;

    /* renamed from: e, reason: collision with root package name */
    public int f96051e;

    /* renamed from: f, reason: collision with root package name */
    public int f96052f;

    /* renamed from: g, reason: collision with root package name */
    public int f96053g;

    /* renamed from: h, reason: collision with root package name */
    public int f96054h;

    /* renamed from: i, reason: collision with root package name */
    public final int f96055i;

    /* renamed from: n, reason: collision with root package name */
    public int f96060n;

    /* renamed from: o, reason: collision with root package name */
    public int f96061o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f96062p;

    /* renamed from: q, reason: collision with root package name */
    public long f96063q;

    /* renamed from: r, reason: collision with root package name */
    public long f96064r;

    /* renamed from: t, reason: collision with root package name */
    public int f96066t;

    /* renamed from: u, reason: collision with root package name */
    public int f96067u;

    /* renamed from: v, reason: collision with root package name */
    public int f96068v;

    /* renamed from: w, reason: collision with root package name */
    public int f96069w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a f96070x;

    /* renamed from: j, reason: collision with root package name */
    public int f96056j = -2;

    /* renamed from: k, reason: collision with root package name */
    public boolean f96057k = false;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f96058l = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f96059m = false;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.x f96065s = null;

    /* renamed from: y, reason: collision with root package name */
    public int f96071y = 0;

    static {
        android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        A = 18;
        B = 19;
        C = new java.lang.String[]{"OMX.qcom.", "OMX.Exynos.", "OMX.hisi", "OMX.MTK", "OMX.sprd", "c2.exynos", "c2.qti", "c2.mtk", "c2.unisoc"};
    }

    public q(int i17, int i18, int i19, int i27, int i28, java.lang.String str) {
        this.f96048b = "hevc";
        this.f96055i = 1;
        this.f96070x = null;
        this.f96051e = i17;
        this.f96052f = i18;
        this.f96060n = i17;
        this.f96061o = i18;
        this.f96048b = str;
        this.f96053g = i19;
        this.f96054h = i27;
        this.f96055i = i28;
        f96046z = 0;
        this.f96063q = 0L;
        this.f96070x = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a();
        this.f96049c = null;
        this.f96067u = 8;
        this.f96066t = 0;
        this.f96068v = 0;
        this.f96047a = 0;
        this.f96062p = null;
        this.f96069w = 0;
        this.f96064r = 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int a() {
        java.lang.String str;
        android.media.MediaCodecInfo mediaCodecInfo;
        boolean z17;
        boolean z18;
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType;
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i17;
        boolean z19;
        if (this.f96049c != null) {
            b();
        }
        int codecCount = android.media.MediaCodecList.getCodecCount();
        int i18 = 0;
        loop0: while (true) {
            str = this.f96048b;
            if (i18 >= codecCount) {
                mediaCodecInfo = null;
                break;
            }
            mediaCodecInfo = android.media.MediaCodecList.getCodecInfoAt(i18);
            if (mediaCodecInfo.isEncoder()) {
                for (java.lang.String str2 : mediaCodecInfo.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        mediaCodecInfo.getName();
                        break loop0;
                    }
                }
            }
            i18++;
        }
        if (mediaCodecInfo == null) {
            com.tencent.mars.xlog.Log.e("OpenVoice[HWEnc]", "steve: Unable to find an appropriate codec for " + str);
            this.f96047a = 2001;
            return -2001;
        }
        com.tencent.mars.xlog.Log.i("OpenVoice[HWEnc]", "steve: found HW codec: " + mediaCodecInfo.getName());
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(str, this.f96051e, this.f96052f);
        this.f96050d = createVideoFormat;
        createVideoFormat.setInteger("color-format", 21);
        this.f96050d.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.f96054h * 1000);
        this.f96050d.setInteger("frame-rate", this.f96053g);
        int i19 = 1;
        this.f96050d.setInteger("i-frame-interval", 1);
        java.lang.String string = this.f96050d.getString("mime");
        this.f96066t = 1;
        if (str.equalsIgnoreCase("video/avc")) {
            java.lang.String name = mediaCodecInfo.getName();
            java.lang.String[] strArr = C;
            int length = strArr.length;
            int i27 = 0;
            while (true) {
                if (i27 >= length) {
                    z17 = false;
                    break;
                }
                if (name.startsWith(strArr[i27])) {
                    z17 = true;
                    break;
                }
                i27++;
            }
            if (z17 && fp.h.c(23)) {
                int i28 = this.f96055i;
                boolean z27 = i28 > 0 && (i28 & 1) != 0;
                boolean z28 = i28 > 0 && (i28 & 4) != 0;
                int i29 = 8;
                if (8 <= this.f96067u) {
                    java.lang.String name2 = mediaCodecInfo.getName();
                    z18 = false;
                    for (java.lang.String str3 : strArr) {
                        if (name2.startsWith(str3)) {
                            try {
                                for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(string).profileLevels) {
                                    if (codecProfileLevel.profile == 8) {
                                        z18 = true;
                                    }
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        }
                    }
                } else {
                    z18 = false;
                }
                if (z28 && z18) {
                    this.f96050d.setInteger(com.google.android.gms.common.Scopes.PROFILE, 8);
                    this.f96050d.setInteger(ya.b.LEVEL, 256);
                } else if (z27) {
                    this.f96050d.setInteger(com.google.android.gms.common.Scopes.PROFILE, 1);
                    this.f96050d.setInteger(ya.b.LEVEL, 256);
                } else {
                    int i37 = this.f96067u;
                    if (fp.h.c(23)) {
                        try {
                            capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("OpenVoice[HWEnc]", "trySetProfile error: " + e17.getMessage());
                        }
                        if (capabilitiesForType != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
                            android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = new android.media.MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel2.level = 0;
                            codecProfileLevel2.profile = 0;
                            int length2 = codecProfileLevelArr.length;
                            int i38 = 0;
                            while (i38 < length2) {
                                android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = codecProfileLevelArr[i38];
                                int i39 = codecProfileLevel3.profile;
                                int i47 = codecProfileLevel3.level;
                                if (((i39 == i19 || i39 == 2 || i39 == i29) ? i19 : 0) != 0) {
                                    if (i39 >= codecProfileLevel2.profile && i47 >= codecProfileLevel2.level && i39 <= i37) {
                                        codecProfileLevel2.profile = i39;
                                        codecProfileLevel2.level = i47;
                                    }
                                    z19 = i19;
                                } else {
                                    z19 = 0;
                                }
                                com.tencent.mars.xlog.Log.i("OpenVoice[HWEnc]", "steve : profile: " + i39 + ", level: " + i47 + ", maxProfile: " + i37 + ", isRecognized:" + z19);
                                i38++;
                                i19 = 1;
                                i29 = 8;
                            }
                            com.tencent.mars.xlog.Log.i("OpenVoice[HWEnc]", "best profile: " + codecProfileLevel2.profile + ", best level: " + codecProfileLevel2.level);
                            int i48 = codecProfileLevel2.profile;
                            if (i48 > 0 && codecProfileLevel2.level >= 256) {
                                this.f96050d.setInteger(com.google.android.gms.common.Scopes.PROFILE, i48);
                                this.f96050d.setInteger(ya.b.LEVEL, 256);
                                i17 = 1;
                                i19 = i17;
                            }
                        }
                    }
                    i17 = 0;
                    i19 = i17;
                }
                if (i19 != 0) {
                    this.f96066t = this.f96050d.getInteger(com.google.android.gms.common.Scopes.PROFILE);
                } else {
                    this.f96066t = 1;
                }
            }
        }
        this.f96050d.setInteger("bitrate-mode", 2);
        try {
            this.f96049c = wo.i1.d(string, false);
            com.tencent.mars.xlog.Log.i("OpenVoice[HWEnc]", "steve: mediaFormat: " + this.f96050d + ", actProfile: " + this.f96066t);
            this.f96049c.a(this.f96050d, null, null, 1);
            this.f96049c.x();
            this.f96065s = new com.tencent.mm.plugin.voip.model.x();
            return 2000;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("OpenVoice[HWEnc]", " error:" + e18.toString());
            this.f96047a = 2002;
            return -2002;
        }
    }

    public final void b() {
        try {
            wo.i1 i1Var = this.f96049c;
            if (i1Var != null) {
                i1Var.y();
                this.f96049c.q();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("OpenVoice[HWEnc]", " error:" + e17.toString());
        }
    }

    public void c(byte[] bArr, int i17, int i18) {
        if (bArr != null) {
            int i19 = this.f96048b.equalsIgnoreCase("video/hevc") ? B : A;
            if (this.f96057k) {
                i19 |= 128;
            }
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g0.f95910c.SendVideoData(bArr, bArr.length, this.f96056j, i17, i19);
        }
    }
}
