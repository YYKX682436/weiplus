package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class q {
    public static final int A;
    public static final int B;
    public static final java.lang.String[] C;

    /* renamed from: z, reason: collision with root package name */
    public static int f177579z;

    /* renamed from: a, reason: collision with root package name */
    public int f177580a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f177581b;

    /* renamed from: c, reason: collision with root package name */
    public wo.i1 f177582c;

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaFormat f177583d;

    /* renamed from: e, reason: collision with root package name */
    public int f177584e;

    /* renamed from: f, reason: collision with root package name */
    public int f177585f;

    /* renamed from: g, reason: collision with root package name */
    public int f177586g;

    /* renamed from: h, reason: collision with root package name */
    public int f177587h;

    /* renamed from: i, reason: collision with root package name */
    public final int f177588i;

    /* renamed from: n, reason: collision with root package name */
    public int f177593n;

    /* renamed from: o, reason: collision with root package name */
    public int f177594o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f177595p;

    /* renamed from: q, reason: collision with root package name */
    public long f177596q;

    /* renamed from: r, reason: collision with root package name */
    public long f177597r;

    /* renamed from: t, reason: collision with root package name */
    public int f177599t;

    /* renamed from: u, reason: collision with root package name */
    public int f177600u;

    /* renamed from: v, reason: collision with root package name */
    public int f177601v;

    /* renamed from: w, reason: collision with root package name */
    public int f177602w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.a f177603x;

    /* renamed from: j, reason: collision with root package name */
    public int f177589j = -2;

    /* renamed from: k, reason: collision with root package name */
    public boolean f177590k = false;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f177591l = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f177592m = false;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.x f177598s = null;

    /* renamed from: y, reason: collision with root package name */
    public int f177604y = 0;

    static {
        android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        A = 18;
        B = 19;
        C = new java.lang.String[]{"OMX.qcom.", "OMX.Exynos.", "OMX.hisi", "OMX.MTK", "OMX.sprd", "c2.exynos", "c2.qti", "c2.mtk", "c2.unisoc"};
    }

    public q(int i17, int i18, int i19, int i27, int i28, java.lang.String str) {
        this.f177581b = "hevc";
        this.f177588i = 1;
        this.f177603x = null;
        this.f177584e = i17;
        this.f177585f = i18;
        this.f177593n = i17;
        this.f177594o = i18;
        this.f177581b = str;
        this.f177586g = i19;
        this.f177587h = i27;
        this.f177588i = i28;
        f177579z = 0;
        this.f177596q = 0L;
        this.f177603x = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.a();
        this.f177582c = null;
        this.f177600u = 8;
        this.f177599t = 0;
        this.f177601v = 0;
        this.f177580a = 0;
        this.f177595p = null;
        this.f177602w = 0;
        this.f177597r = 0L;
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
        if (this.f177582c != null) {
            b();
        }
        int codecCount = android.media.MediaCodecList.getCodecCount();
        int i18 = 0;
        loop0: while (true) {
            str = this.f177581b;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenVoice[HWEnc]", "steve: Unable to find an appropriate codec for " + str);
            this.f177580a = 2001;
            return -2001;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenVoice[HWEnc]", "steve: found HW codec: " + mediaCodecInfo.getName());
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(str, this.f177584e, this.f177585f);
        this.f177583d = createVideoFormat;
        createVideoFormat.setInteger("color-format", 21);
        this.f177583d.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, this.f177587h * 1000);
        this.f177583d.setInteger("frame-rate", this.f177586g);
        int i19 = 1;
        this.f177583d.setInteger("i-frame-interval", 1);
        java.lang.String string = this.f177583d.getString("mime");
        this.f177599t = 1;
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
                int i28 = this.f177588i;
                boolean z27 = i28 > 0 && (i28 & 1) != 0;
                boolean z28 = i28 > 0 && (i28 & 4) != 0;
                int i29 = 8;
                if (8 <= this.f177600u) {
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
                    this.f177583d.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, 8);
                    this.f177583d.setInteger(ya.b.f77487x44fa364, 256);
                } else if (z27) {
                    this.f177583d.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, 1);
                    this.f177583d.setInteger(ya.b.f77487x44fa364, 256);
                } else {
                    int i37 = this.f177600u;
                    if (fp.h.c(23)) {
                        try {
                            capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenVoice[HWEnc]", "trySetProfile error: " + e17.getMessage());
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
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenVoice[HWEnc]", "steve : profile: " + i39 + ", level: " + i47 + ", maxProfile: " + i37 + ", isRecognized:" + z19);
                                i38++;
                                i19 = 1;
                                i29 = 8;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenVoice[HWEnc]", "best profile: " + codecProfileLevel2.profile + ", best level: " + codecProfileLevel2.level);
                            int i48 = codecProfileLevel2.profile;
                            if (i48 > 0 && codecProfileLevel2.level >= 256) {
                                this.f177583d.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, i48);
                                this.f177583d.setInteger(ya.b.f77487x44fa364, 256);
                                i17 = 1;
                                i19 = i17;
                            }
                        }
                    }
                    i17 = 0;
                    i19 = i17;
                }
                if (i19 != 0) {
                    this.f177599t = this.f177583d.getInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589);
                } else {
                    this.f177599t = 1;
                }
            }
        }
        this.f177583d.setInteger("bitrate-mode", 2);
        try {
            this.f177582c = wo.i1.d(string, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenVoice[HWEnc]", "steve: mediaFormat: " + this.f177583d + ", actProfile: " + this.f177599t);
            this.f177582c.a(this.f177583d, null, null, 1);
            this.f177582c.x();
            this.f177598s = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.x();
            return 2000;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenVoice[HWEnc]", " error:" + e18.toString());
            this.f177580a = 2002;
            return -2002;
        }
    }

    public final void b() {
        try {
            wo.i1 i1Var = this.f177582c;
            if (i1Var != null) {
                i1Var.y();
                this.f177582c.q();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenVoice[HWEnc]", " error:" + e17.toString());
        }
    }

    public void c(byte[] bArr, int i17, int i18) {
        if (bArr != null) {
            int i19 = this.f177581b.equalsIgnoreCase("video/hevc") ? B : A;
            if (this.f177590k) {
                i19 |= 128;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.g0.f177443c.m120005x8b643bfd(bArr, bArr.length, this.f177589j, i17, i19);
        }
    }
}
