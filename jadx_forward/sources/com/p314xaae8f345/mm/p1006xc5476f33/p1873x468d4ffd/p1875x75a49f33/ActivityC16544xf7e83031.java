package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.VideoCompressUI */
/* loaded from: classes10.dex */
public class ActivityC16544xf7e83031 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: q, reason: collision with root package name */
    public static int f230492q;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f230493e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f230494f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f230495g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f230497i;

    /* renamed from: o, reason: collision with root package name */
    public boolean f230500o;

    /* renamed from: h, reason: collision with root package name */
    public final k55.k f230496h = new k55.k(this);

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 f230498m = null;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.q1 f230499n = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.q1(this, null);

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f230501p = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.p1(this);

    public static java.lang.String O6(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16544xf7e83031 activityC16544xf7e83031, java.lang.String str, java.lang.String str2) {
        activityC16544xf7e83031.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return str2;
        }
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setData(android.net.Uri.parse("file://" + str));
            gp.a b17 = gp.b.b(activityC16544xf7e83031, intent, -1);
            if (b17 == null || b17.f355693b == null) {
                return str2;
            }
            str2 = activityC16544xf7e83031.T6(str);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(b17.f355693b, 80, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
            return str2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoCompressUI", e17, "get thumb error: %s", e17.getMessage());
            return str2;
        }
    }

    public static void P6(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16544xf7e83031 activityC16544xf7e83031, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17;
        int i18;
        activityC16544xf7e83031.getClass();
        gp.c cVar = new gp.c();
        try {
            try {
                cVar.k(str);
                int d18 = cVar.d();
                android.media.MediaFormat mediaFormat = null;
                android.media.MediaFormat mediaFormat2 = null;
                int i19 = 0;
                while (i19 < d18) {
                    android.media.MediaFormat e17 = cVar.e(i19);
                    if (e17.containsKey("mime")) {
                        java.lang.String string = e17.getString("mime");
                        i18 = d18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompressUI", "find video mime : %s", string);
                        if (string != null) {
                            if (string.startsWith("video/")) {
                                if (mediaFormat == null) {
                                    mediaFormat = e17;
                                }
                            } else if (string.startsWith("audio/") && mediaFormat2 == null) {
                                mediaFormat2 = e17;
                            }
                            if (mediaFormat2 != null && mediaFormat != null) {
                                break;
                            }
                        }
                    } else {
                        i18 = d18;
                    }
                    i19++;
                    d18 = i18;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.q1 q1Var = activityC16544xf7e83031.f230499n;
                if (q1Var != null) {
                    if (q1Var.f230609c == -1) {
                        java.lang.String str4 = "";
                        if (mediaFormat != null) {
                            try {
                                q1Var.f230612f = !mediaFormat.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) ? 0 : mediaFormat.getInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63);
                                if (mediaFormat.containsKey("durationUs")) {
                                    str3 = "MicroMsg.VideoCompressUI";
                                    try {
                                        i17 = (int) (mediaFormat.getLong("durationUs") / 1000);
                                    } catch (java.lang.Exception e18) {
                                        e = e18;
                                        str2 = str3;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "Video extractor init failed. video path = [%s] e = [%s]", str, e.getMessage());
                                    }
                                } else {
                                    str3 = "MicroMsg.VideoCompressUI";
                                    i17 = 0;
                                }
                                q1Var.f230609c = i17;
                                q1Var.f230610d = !mediaFormat.containsKey("height") ? 0 : mediaFormat.getInteger("height");
                                q1Var.f230611e = !mediaFormat.containsKey("width") ? 0 : mediaFormat.getInteger("width");
                                q1Var.f230607a = !mediaFormat.containsKey("mime") ? "" : mediaFormat.getString("mime");
                                q1Var.f230613g = !mediaFormat.containsKey("i-frame-interval") ? 0 : mediaFormat.getInteger("i-frame-interval");
                                q1Var.f230614h = !mediaFormat.containsKey("frame-rate") ? 0 : mediaFormat.getInteger("frame-rate");
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q1Var.f230607a) && q1Var.f230607a.equalsIgnoreCase("video/hevc")) {
                                    activityC16544xf7e83031.f230500o = true;
                                }
                            } catch (java.lang.Exception e19) {
                                e = e19;
                                str3 = "MicroMsg.VideoCompressUI";
                                str2 = str3;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "Video extractor init failed. video path = [%s] e = [%s]", str, e.getMessage());
                            }
                        } else {
                            str3 = "MicroMsg.VideoCompressUI";
                        }
                        if (mediaFormat2 != null) {
                            q1Var.f230615i = !mediaFormat2.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) ? 0 : mediaFormat2.getInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63);
                            if (mediaFormat2.containsKey("mime")) {
                                str4 = mediaFormat2.getString("mime");
                            }
                            q1Var.f230608b = str4;
                        }
                        if ((q1Var.f230612f <= 0 || q1Var.f230610d <= 0 || q1Var.f230611e <= 0 || q1Var.f230609c <= 0) && (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true)) != null) {
                            int i27 = d17.f243916b;
                            if (i27 > 0) {
                                q1Var.f230612f = i27;
                            }
                            int i28 = d17.f243918d;
                            if (i28 > 0) {
                                q1Var.f230610d = i28;
                            }
                            int i29 = d17.f243917c;
                            if (i29 > 0) {
                                q1Var.f230611e = i29;
                            }
                            int i37 = d17.f243915a;
                            if (i37 > 0) {
                                q1Var.f230609c = i37;
                            }
                        }
                        str2 = str3;
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "videoAnalysis result: %s", q1Var);
                        } catch (java.lang.Exception e27) {
                            e = e27;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "Video extractor init failed. video path = [%s] e = [%s]", str, e.getMessage());
                        }
                    }
                }
            } catch (java.lang.Exception e28) {
                e = e28;
                str2 = "MicroMsg.VideoCompressUI";
            }
        } finally {
            cVar.g();
        }
    }

    public static android.graphics.Point Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16544xf7e83031 activityC16544xf7e83031, int i17, int i18, int i19, int i27) {
        int i28;
        int i29;
        activityC16544xf7e83031.getClass();
        if (i17 > i18 && i19 < i27) {
            int max = java.lang.Math.max(i19, i27);
            i27 = java.lang.Math.min(i19, i27);
            i19 = max;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompressUI", "scale() called with: decoderOutputWidth = [" + i17 + "], decoderOutputHeight = [" + i18 + "], specWidth = [" + i19 + "], specHeight = [" + i27 + "]");
        if (i17 <= i19 && i18 <= i27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompressUI", "calc scale, small or equal to spec size");
            return null;
        }
        int max2 = java.lang.Math.max(i17, i18);
        int min = java.lang.Math.min(i17, i18);
        int max3 = java.lang.Math.max(i19, i27);
        int min2 = java.lang.Math.min(i19, i27);
        if (max2 % 16 == 0 && java.lang.Math.abs(max2 - max3) < 16 && min % 16 == 0 && java.lang.Math.abs(min - min2) < 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompressUI", "calc scale, same len divide by 16, no need scale");
            return null;
        }
        int i37 = max2 / 2;
        int i38 = min / 2;
        if (i37 % 16 == 0 && java.lang.Math.abs(i37 - max3) < 16 && i38 % 16 == 0 && java.lang.Math.abs(i38 - min2) < 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompressUI", "calc scale, double ratio divide by 16");
            int i39 = i17 / 2;
            int i47 = i18 / 2;
            if (i39 % 2 != 0) {
                i39++;
            }
            if (i47 % 2 != 0) {
                i47++;
            }
            return new android.graphics.Point(i39, i47);
        }
        android.graphics.Point point = new android.graphics.Point();
        if (i17 < i18) {
            i28 = java.lang.Math.min(i19, i27);
            i29 = (int) (i18 / ((i17 * 1.0d) / i28));
        } else {
            int min3 = java.lang.Math.min(i19, i27);
            i28 = (int) (i17 / ((i18 * 1.0d) / min3));
            i29 = min3;
        }
        if (i29 % 2 != 0) {
            i29++;
        }
        if (i28 % 2 != 0) {
            i28++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompressUI", "calc scale, outputsize: %s %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
        point.x = i28;
        point.y = i29;
        return point;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean R6(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16544xf7e83031 r2, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r3) {
        /*
            r2.getClass()
            r0 = 1
            if (r3 == 0) goto L10
            int r3 = r3.f152727g
            com.tencent.mm.plugin.mmsight.segment.q1 r1 = r2.f230499n
            int r1 = r1.f230612f
            if (r3 >= r1) goto L17
            r3 = r0
            goto L18
        L10:
            java.lang.String r3 = "MicroMsg.VideoCompressUI"
            java.lang.String r1 = "hy: given target trans param is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r1)
        L17:
            r3 = 0
        L18:
            boolean r2 = r2.f230500o
            if (r2 == 0) goto L1d
            goto L1e
        L1d:
            r0 = r3
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16544xf7e83031.R6(com.tencent.mm.plugin.mmsight.segment.VideoCompressUI, com.tencent.mm.modelcontrol.VideoTransPara):boolean");
    }

    public static java.lang.String S6(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16544xf7e83031 activityC16544xf7e83031, java.lang.String str) {
        activityC16544xf7e83031.getClass();
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66807x1efd7235() + "videoCompressTmp/";
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.mm.vfs.w6.g(str2, true);
        }
        com.p314xaae8f345.mm.vfs.w6.u(str2);
        java.lang.String str3 = str2 + "video_send_preprocess_tmp_" + java.lang.System.currentTimeMillis() + ".mp4";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompressUI", "initAndGetTmpPath: %s", str3);
        return str3;
    }

    public final java.lang.String T6(java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66807x1efd7235() + "videoCompressTmpThumb/";
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.mm.vfs.w6.g(str2, true);
        }
        com.p314xaae8f345.mm.vfs.w6.u(str2);
        java.lang.String str3 = str2 + "video_send_preprocess_thumb_" + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompressUI", "thumbPath: %s", str3);
        return str3;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569701j3);
        android.content.Intent intent = getIntent();
        if (intent == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getStringExtra("K_SEGMENTVIDEOPATH"))) {
            setResult(0);
            finish();
            return;
        }
        this.f230495g = db5.e1.Q(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, null);
        this.f230493e = intent.getStringExtra("K_SEGMENTVIDEOPATH");
        this.f230494f = intent.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
        k55.k kVar = this.f230496h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66801xe1c076d2(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8(kVar));
        kVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.n1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k55.k kVar = this.f230496h;
        if (kVar != null) {
            kVar.d();
        }
    }
}
