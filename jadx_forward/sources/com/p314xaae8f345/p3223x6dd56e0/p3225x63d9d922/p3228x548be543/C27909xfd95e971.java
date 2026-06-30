package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState */
/* loaded from: classes14.dex */
public class C27909xfd95e971 extends com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb {
    private static final java.lang.String TAG = "ReflectLivenessState";

    /* renamed from: actRefData */
    private com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3244x2eefaa.C27974x9ac85366 f61941x9c2951eb;

    /* renamed from: appId */
    private java.lang.String f61943x58b7f1c;

    /* renamed from: colorData */
    private java.lang.String f61946x760b29ad;

    /* renamed from: faceStatus */
    private com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] f61951x224d98af;

    /* renamed from: mOriginParam */
    private com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27971x7d063c3a f61954x104e125a;

    /* renamed from: randomColorData */
    private java.lang.String f61963x965c102a;

    /* renamed from: reflectImagesShortenStrategy */
    int f61965x89546c63;

    /* renamed from: seleceData */
    private com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.SeleceData f61967x9c715a37;

    /* renamed from: legitimateReflectVersion */
    private java.lang.String f61953xb2c5a590 = "3.6.9.1";

    /* renamed from: poseState */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise f61962x5d20ee80 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NAN;

    /* renamed from: currentProcessType */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType f61949xdd7f4710 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.RPT_TIPWAIT;

    /* renamed from: continuousDetectCount */
    private int f61947x908f8d9d = 0;

    /* renamed from: nextStateName */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName f61961xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE;

    /* renamed from: isLoadResourceOnline */
    private boolean f61952x6923d51 = false;

    /* renamed from: needCheckFaces */
    private boolean f61955xafee26c4 = true;

    /* renamed from: simiThreshold */
    private int f61968xff8c4619 = 70;

    /* renamed from: securityLevel */
    private int f61966xd4f4bc24 = 2;

    /* renamed from: needLocalConfig */
    private boolean f61958x7029d817 = false;

    /* renamed from: stableFrameCount */
    private int f61969x51766d3d = 5;

    /* renamed from: backendProtoType */
    private int f61944x3340d90e = 0;

    /* renamed from: needCheckPose */
    private boolean f61957x3f800dc3 = false;

    /* renamed from: extraConfig */
    private java.lang.String f61950x35d0b772 = "";

    /* renamed from: changePointNum */
    private int f61945xac2fba6 = 2;

    /* renamed from: needRandom */
    private boolean f61960xadcc10f9 = false;

    /* renamed from: needManualTrigger */
    private boolean f61959xc244a61c = false;

    /* renamed from: controlConfig */
    private java.lang.String f61948x191f9aff = "";

    /* renamed from: actReflectUXMode */
    private int f61942x9b377871 = 0;

    /* renamed from: tipsTimer */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27887x52d8cd7b f61970xb82606ed = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27887x52d8cd7b("reflect tips timeout counter");

    /* renamed from: needCheckMultiFaces */
    private boolean f61956x3229d3af = false;

    /* renamed from: reflectBigFrameCount */
    private int f61964xadc7a105 = 0;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$11, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass11 {

        /* renamed from: $SwitchMap$com$tencent$youtu$sdkkitframework$liveness$ReflectLivenessState$ReflectProcessType */
        static final /* synthetic */ int[] f61973xd42c1e46;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.m120905xcee59d22().length];
            f61973xd42c1e46 = iArr;
            try {
                iArr[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.RPT_TIPWAIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f61973xd42c1e46[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.RPT_INIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f61973xd42c1e46[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.RPT_REFLECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f61973xd42c1e46[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.RPT_FINISH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$ReflectProcessType */
    /* loaded from: classes14.dex */
    public enum ReflectProcessType {
        RPT_TIPWAIT,
        RPT_INIT,
        RPT_REFLECT,
        RPT_FINISH
    }

    /* renamed from: clearData */
    private void m120885xb4382b97() {
        this.f61949xdd7f4710 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.RPT_TIPWAIT;
        this.f61947x908f8d9d = 0;
        this.f61962x5d20ee80 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NAN;
        this.f61955xafee26c4 = true;
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121052xae7a2e7a();
        this.f61961xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE;
        this.f61964xadc7a105 = 0;
    }

    /* renamed from: getActionReflectLiveReq */
    private com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27936xa7cd6797 m120886x18fbeae1(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27931x532e7d68 c27931x532e7d68, com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3231x2eefaa.C27924x80f5e010 c27924x80f5e010, java.lang.String str) {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27936xa7cd6797 c27936xa7cd6797 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27936xa7cd6797();
        c27936xa7cd6797.f62443xabe4b7f9 = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62364xbdc8caaf;
        c27936xa7cd6797.f62445x4cd79f06 = str;
        c27936xa7cd6797.f62452x6fbd6873 = 2;
        c27936xa7cd6797.f62455xcd0310d = c27924x80f5e010.f62397xcd0310d;
        if (c27931x532e7d68 != null) {
            c27936xa7cd6797.f62453x49b37fec = m120895x9249f2b1(c27931x532e7d68.f62429x1ea3cb);
        }
        c27936xa7cd6797.f62449x47c45c48 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27946x2eb0bfce(c27924x80f5e010.f62395x2e15e4);
        c27936xa7cd6797.f62448x1f5a6dcd = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27946x2eb0bfce(c27924x80f5e010.eye);
        c27936xa7cd6797.f62451x4c2657e3 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27946x2eb0bfce(c27924x80f5e010.f62396x6343cc7);
        c27936xa7cd6797.f62446xcf544981 = null;
        c27936xa7cd6797.f62450x3339a3 = 0;
        c27936xa7cd6797.f62456x630ddf64 = null;
        return c27936xa7cd6797;
    }

    /* renamed from: getReflectLiveReq */
    private com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27945x8bacc6b5 m120887xb5fdc78b(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27931x532e7d68 c27931x532e7d68, java.lang.String str) {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27945x8bacc6b5 c27945x8bacc6b5 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27945x8bacc6b5();
        c27945x8bacc6b5.f62501x4cd79f06 = str;
        c27945x8bacc6b5.f62505x6fbd6873 = 2;
        if (c27931x532e7d68 != null) {
            c27945x8bacc6b5.f62506x49b37fec = m120895x9249f2b1(c27931x532e7d68.f62429x1ea3cb);
            c27945x8bacc6b5.f62504x47c45c48 = null;
        }
        c27945x8bacc6b5.f62502xcf544981 = null;
        c27945x8bacc6b5.f62509x630ddf64 = null;
        c27945x8bacc6b5.f62499xabe4b7f9 = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62364xbdc8caaf;
        return c27945x8bacc6b5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleFailure */
    public void m120888xe1a99e42(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(str3, "failed :" + ("message:" + str + "\ntips:" + str2 + "\ncode:" + i17));
        java.lang.String m120909x550d367b = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.m120909x550d367b(this.f61962x5d20ee80);
        java.lang.String m120567xc0aa46c1 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(4194304, m120909x550d367b, str);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(i17, m120909x550d367b);
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61634x843277c9);
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61535x8c7929fb);
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, 4194304);
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61548x750ebf31, java.lang.Integer.valueOf(i17));
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, m120567xc0aa46c1);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(hashMap);
        this.f61949xdd7f4710 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.RPT_FINISH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSuccess */
    public void m120889xb322acbb(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27931x532e7d68 c27931x532e7d68) {
        if (this.f61949xdd7f4710 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.RPT_TIPWAIT) {
            return;
        }
        if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca() == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
            try {
                com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3244x2eefaa.C27975xbe8dbd1f c27975xbe8dbd1f = this.f61941x9c2951eb.f62689x2e15e4;
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3231x2eefaa.C27925x9e11c5b5 c27925x9e11c5b5 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3231x2eefaa.C27925x9e11c5b5(c27975xbe8dbd1f.f62692x5faa95b, c27975xbe8dbd1f.xys, c27975xbe8dbd1f.f62691x5b9b5c43);
                com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3244x2eefaa.C27975xbe8dbd1f c27975xbe8dbd1f2 = this.f61941x9c2951eb.eye;
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3231x2eefaa.C27925x9e11c5b5 c27925x9e11c5b52 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3231x2eefaa.C27925x9e11c5b5(c27975xbe8dbd1f2.f62692x5faa95b, c27975xbe8dbd1f2.xys, c27975xbe8dbd1f2.f62691x5b9b5c43);
                com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3244x2eefaa.C27975xbe8dbd1f c27975xbe8dbd1f3 = this.f61941x9c2951eb.f62690x6343cc7;
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27936xa7cd6797 m120886x18fbeae1 = m120886x18fbeae1(c27931x532e7d68, new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3231x2eefaa.C27924x80f5e010(c27925x9e11c5b5, c27925x9e11c5b52, new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3231x2eefaa.C27925x9e11c5b5(c27975xbe8dbd1f3.f62692x5faa95b, c27975xbe8dbd1f3.xys, c27975xbe8dbd1f3.f62691x5b9b5c43), this.f61967x9c715a37), this.f61946x760b29ad);
                m120886x18fbeae1.f62443xabe4b7f9 = this.f61943x58b7f1c;
                android.graphics.Bitmap bitmap = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61792xb20562cf;
                if (bitmap != null) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i17 = width > height ? width : height;
                    if (i17 > 640) {
                        bitmap = m120890xa95010af(bitmap, (width * 640) / i17, (height * 640) / i17);
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "resize image. from w:" + width + " h:" + height + " to w:" + bitmap.getWidth() + " h:" + bitmap.getHeight());
                    }
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
                    m120886x18fbeae1.f62446xcf544981 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27946x2eb0bfce(new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3231x2eefaa.C27925x9e11c5b5(byteArrayOutputStream.toByteArray(), null, null));
                }
                m120886x18fbeae1.f62445x4cd79f06 = this.f61946x760b29ad;
                this.f61739x83a477db.put("reflect_request_object", m120886x18fbeae1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "handle success failed: " + e17.getLocalizedMessage());
            }
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27945x8bacc6b5 m120887xb5fdc78b = m120887xb5fdc78b(c27931x532e7d68, this.f61946x760b29ad);
            android.graphics.Bitmap bitmap2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61792xb20562cf;
            if (bitmap2 != null) {
                java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                int width2 = bitmap2.getWidth();
                int height2 = bitmap2.getHeight();
                int i18 = width2 > height2 ? width2 : height2;
                if (i18 > 640) {
                    bitmap2 = m120890xa95010af(bitmap2, (width2 * 640) / i18, (height2 * 640) / i18);
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "resize image. from w:" + width2 + " h:" + height2 + " to w:" + bitmap2.getWidth() + " h:" + bitmap2.getHeight());
                }
                bitmap2.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream2);
                m120887xb5fdc78b.f62502xcf544981 = new java.lang.String(android.util.Base64.encode(byteArrayOutputStream2.toByteArray(), 2));
            }
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "on Request...");
            m120887xb5fdc78b.f62501x4cd79f06 = this.f61946x760b29ad;
            m120887xb5fdc78b.f62508xcd0310d = this.f61967x9c715a37;
            this.f61739x83a477db.put("reflect_request_object", m120887xb5fdc78b);
        }
        this.f61961xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.REFLECTION_END_CAMERA_RISK_STATE;
    }

    /* renamed from: imageScale */
    private static android.graphics.Bitmap m120890xa95010af(android.graphics.Bitmap bitmap, int i17, int i18) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(i17 / width, i18 / height);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* renamed from: setupRequset */
    private void m120891xbea12c2e() {
    }

    /* renamed from: startReflect */
    private void m120892x38ac57fb() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.9
            {
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61584xfb5a423a);
            }
        });
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27971x7d063c3a c27971x7d063c3a = this.f61954x104e125a;
        java.lang.String str = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "param: " + c27971x7d063c3a);
        c27971x7d063c3a.f62657xbfc8b6e1 = -1;
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121348x725ce521(c27971x7d063c3a);
        this.f61949xdd7f4710 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.RPT_REFLECT;
        m120891xbea12c2e();
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27923xf59fb73f m121053xf66c7e3f = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121053xf66c7e3f();
        m121053xf66c7e3f.f62394x4e99eff2 = this.f61966xd4f4bc24;
        m121053xf66c7e3f.f62393xbcf06007 = false;
        m121053xf66c7e3f.f62392x14adfe9d = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca() == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121065x2490cc4b(m121053xf66c7e3f);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "Settings: safetyLevel " + m121053xf66c7e3f.f62394x4e99eff2);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "Settings: isEncodeReflectData " + m121053xf66c7e3f.f62393xbcf06007);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "Settings: isActionReflect " + m121053xf66c7e3f.f62392x14adfe9d);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKPlatformContext m120705x76847179 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179();
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121070x68ac462(m120705x76847179.f61787xb485b2a7, m120705x76847179.f61788x695aadfe, m120705x76847179.f61789x7d672fb9, this.f61946x760b29ad, new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.LightLiveCheckResult() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.10
            @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.LightLiveCheckResult
            /* renamed from: onFailed */
            public void mo120896x428b6afc(int i17, java.lang.String str2, java.lang.String str3) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.this.m120888xe1a99e42(i17, str2, str3);
            }

            @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.LightLiveCheckResult
            /* renamed from: onSuccess */
            public void mo120897xe05b4124(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27931x532e7d68 c27931x532e7d68) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.TAG, "on start succeed!!!!!");
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.this.m120889xb322acbb(c27931x532e7d68);
            }
        }, this.f61964xadc7a105);
    }

    /* renamed from: translation */
    private com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27944x8e3afb90 m120895x9249f2b1(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27929x6e7b4503 c27929x6e7b4503) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "translation reflectImagesShortenStrategy：" + this.f61965x89546c63);
        int i17 = 0;
        if (this.f61965x89546c63 == 1) {
            int i18 = 0;
            while (true) {
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27932x8c9320e5[] c27932x8c9320e5Arr = c27929x6e7b4503.f62423x4f6bc2c5;
                if (i18 >= c27932x8c9320e5Arr.length) {
                    break;
                }
                if (i18 > 2 && i18 < c27932x8c9320e5Arr.length - 2 && i18 % 2 != 0) {
                    c27932x8c9320e5Arr[i18].f62433xdab7a40d = new byte[0];
                }
                i18++;
            }
        }
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27944x8e3afb90 c27944x8e3afb90 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27944x8e3afb90();
        java.util.ArrayList<com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27938x308994a> arrayList = new java.util.ArrayList<>();
        int i19 = 0;
        while (true) {
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27932x8c9320e5[] c27932x8c9320e5Arr2 = c27929x6e7b4503.f62423x4f6bc2c5;
            if (i19 >= c27932x8c9320e5Arr2.length) {
                break;
            }
            arrayList.add(m120894x9249f2b1(c27932x8c9320e5Arr2[i19]));
            i19++;
        }
        c27944x8e3afb90.m121179x2751ab4f(arrayList);
        if (c27929x6e7b4503.f62421xfe9b15e0 != null) {
            java.util.ArrayList<com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27937x22c90090> arrayList2 = new java.util.ArrayList<>();
            int i27 = 0;
            while (true) {
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27933x792f52b8[] c27933x792f52b8Arr = c27929x6e7b4503.f62421xfe9b15e0;
                if (i27 >= c27933x792f52b8Arr.length) {
                    break;
                }
                arrayList2.add(m120893x9249f2b1(c27933x792f52b8Arr[i27]));
                i27++;
            }
            c27944x8e3afb90.m121174xade8b790(arrayList2);
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "dataPack.refBigImgData is null");
        }
        c27944x8e3afb90.m121173x5eaf9aa5(c27929x6e7b4503.f62413xc00dc316);
        c27944x8e3afb90.m121175x3be4e44e(c27929x6e7b4503.f62414x4d9f06ad);
        c27944x8e3afb90.f62489x52528131 = new java.util.ArrayList<>();
        while (true) {
            long[] jArr = c27929x6e7b4503.f62415xc4560ceb;
            if (i17 >= jArr.length) {
                break;
            }
            c27944x8e3afb90.f62489x52528131.add(java.lang.Long.valueOf(jArr[i17]));
            i17++;
        }
        c27944x8e3afb90.m121182xf58ed723(c27929x6e7b4503.f62420x8b22353a);
        c27944x8e3afb90.m121177x7c443772(c27929x6e7b4503.f62417x9df376d9);
        c27944x8e3afb90.m121180x31d4b781(c27929x6e7b4503.f62419x3eeab50e);
        c27944x8e3afb90.m121184x53e9ee84(c27929x6e7b4503.f62424x6be2dc6);
        c27944x8e3afb90.m121178xf84e829(c27929x6e7b4503.f62418xb7389127);
        c27944x8e3afb90.f62497x14f51cd8 = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62360x3fc0a8b8;
        try {
            c27944x8e3afb90.m121181xca027b82(new java.lang.String(c27929x6e7b4503.log, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        c27944x8e3afb90.m121176xb698f2ee(c27929x6e7b4503.f62416x1f5d656c);
        return c27944x8e3afb90;
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enter */
    public void mo120689x5c306d8() {
        super.mo120689x5c306d8();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE));
        try {
            this.f61962x5d20ee80 = (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise) m120706x4137e3d.m120725x63c3c5c("pose_state");
            this.f61947x908f8d9d = ((java.lang.Integer) m120706x4137e3d.m120725x63c3c5c("continuous_detect_count")).intValue();
            this.f61951x224d98af = (com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[]) m120706x4137e3d.m120725x63c3c5c("face_status");
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (m120706x4137e3d2 != null) {
                this.f61967x9c715a37 = (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.SeleceData) m120706x4137e3d2.m120725x63c3c5c("select_data");
                if (!this.f61958x7029d817) {
                    this.f61946x760b29ad = (java.lang.String) m120706x4137e3d2.m120725x63c3c5c("color_data");
                } else if (this.f61960xadcc10f9) {
                    this.f61946x760b29ad = this.f61963x965c102a;
                }
                java.lang.String str = (java.lang.String) m120706x4137e3d2.m120725x63c3c5c("control_config");
                if (str != null) {
                    this.f61948x191f9aff = str;
                }
            }
            if (!this.f61948x191f9aff.isEmpty()) {
                java.lang.String[] split = this.f61948x191f9aff.split("&");
                if (split.length > 0) {
                    for (java.lang.String str2 : split) {
                        java.lang.String[] split2 = str2.split("=");
                        if (split2.length > 1 && split2[0].equals("actref_ux_mode")) {
                            this.f61942x9b377871 = java.lang.Integer.parseInt(split2[1]);
                        }
                        if (split2.length > 1 && split2[0].equals("reflect_images_shorten_strategy")) {
                            this.f61965x89546c63 = java.lang.Integer.parseInt(split2[1]);
                        }
                        if (split2.length > 1 && split2[0].equals("ref_big_frame_count")) {
                            this.f61964xadc7a105 = java.lang.Integer.parseInt(split2[1]);
                        }
                    }
                }
            }
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d3 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.ACTION_STATE));
            if (m120706x4137e3d3 != null) {
                this.f61941x9c2951eb = (com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3244x2eefaa.C27974x9ac85366) m120706x4137e3d3.m120725x63c3c5c("act_reflect_data");
            }
            if (this.f61942x9b377871 == 2) {
                this.f61949xdd7f4710 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.RPT_FINISH;
                m120889xb322acbb(null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "reflection enter failed " + e17.getLocalizedMessage());
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120568x9e70357b("reflection enter failed ", e17);
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enterFirst */
    public void mo120658xcdd362b8() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE)).mo120729x475c0edf("reset_timeout", null);
        this.f61970xb82606ed.m120585x6761d4f();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120704x5013f0ad();
        if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().m121018xd6e87247(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.StageName.stage_reflect) != null) {
            this.f61970xb82606ed.m120581xae7a2e7a();
            this.f61949xdd7f4710 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.RPT_INIT;
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: exit */
    public void mo120724x2fb91e() {
        super.mo120724x2fb91e();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: handleEvent */
    public void mo120728x5797ad52(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
        super.mo120728x5797ad52(ytFrameworkFireEventType, obj);
        if (this.f61959xc244a61c && ytFrameworkFireEventType == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            m120885xb4382b97();
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: loadStateWith */
    public void mo120730xc7c4b6b1(java.lang.String str, org.json.JSONObject jSONObject) {
        super.mo120730xc7c4b6b1(str, jSONObject);
        try {
            if (jSONObject.has("resource_online")) {
                this.f61952x6923d51 = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("similarity_threshold")) {
                this.f61968xff8c4619 = jSONObject.getInt("similarity_threshold");
            } else {
                this.f61968xff8c4619 = 70;
            }
            if (jSONObject.has("reflect_security_level")) {
                this.f61966xd4f4bc24 = jSONObject.getInt("reflect_security_level");
            }
            if (jSONObject.has("local_config_flag")) {
                this.f61958x7029d817 = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("color_data")) {
                this.f61946x760b29ad = jSONObject.getString("color_data");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.f61969x51766d3d = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("backend_proto_type")) {
                this.f61944x3340d90e = jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("force_pose_check")) {
                this.f61957x3f800dc3 = jSONObject.getBoolean("force_pose_check");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f61959xc244a61c = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("reflect_tips_countdown_ms")) {
                this.f61970xb82606ed.m120583x316510(java.lang.Math.max(0, java.lang.Math.min(10000, jSONObject.getInt("reflect_tips_countdown_ms"))), false);
            }
            if (jSONObject.has("control_config")) {
                this.f61948x191f9aff = jSONObject.getString("control_config");
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
        java.lang.String str2 = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str2, "Reflection version:3.6.9.2");
        java.lang.String[] split = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62360x3fc0a8b8.split("\\.");
        java.lang.String str3 = this.f61953xb2c5a590;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str2, "Wanted Reflection Version: " + str3);
        java.lang.String[] split2 = str3.split("\\.");
        if (java.lang.Integer.parseInt(split[0]) != java.lang.Integer.parseInt(split2[0])) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.1
                {
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61556x13b6961b, "反光库版本异常！目标版本：" + com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.this.f61953xb2c5a590 + " 当前版本：3.6.9.2");
                }
            });
        } else if (java.lang.Integer.parseInt(split[1]) != java.lang.Integer.parseInt(split2[1])) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.2
                {
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61556x13b6961b, "反光库版本异常！目标版本：" + com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.this.f61953xb2c5a590 + " 当前版本：3.6.9.2");
                }
            });
        } else if (java.lang.Integer.parseInt(split[2]) < java.lang.Integer.parseInt(split2[2])) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.3
                {
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61556x13b6961b, "反光库版本过低！目标版本：" + com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.this.f61953xb2c5a590 + " 当前版本：3.6.9.2");
                }
            });
        }
        try {
            this.f61943x58b7f1c = jSONObject.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
            if (jSONObject.has("extra_config")) {
                this.f61950x35d0b772 = jSONObject.getString("extra_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.f61945xac2fba6 = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("need_random_flag")) {
                this.f61960xadcc10f9 = jSONObject.getBoolean("need_random_flag");
            }
            this.f61956x3229d3af = jSONObject.optBoolean("need_check_multiface", false);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Failed to parse json:" + e18.getLocalizedMessage());
        }
        int m121057xefa44ff9 = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121057xefa44ff9(this.f61943x58b7f1c, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120775x14f51cd8().split("-")[0]);
        if (m121057xefa44ff9 != 0) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "failed to init reflect sdk " + m121057xefa44ff9);
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(m121057xefa44ff9, "failed to init reflect sdk");
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(m121057xefa44ff9) { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.4

                /* renamed from: val$initR */
                final /* synthetic */ int f61977x4867ddff;

                {
                    this.f61977x4867ddff = m121057xefa44ff9;
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61517xaacafee1));
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61517xaacafee1, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61592x3eaf17b8, "Init YTReflect SDK failed with " + m121057xefa44ff9));
                }
            });
        }
        this.f61954x104e125a = com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121335xaa667d15();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "mOriginParam: " + this.f61954x104e125a);
        if (this.f61960xadcc10f9) {
            this.f61963x965c102a = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121077xbd15d010(this.f61945xac2fba6, this.f61950x35d0b772);
        }
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121067x2093bab3(new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3234xc20796d8.InterfaceC27947x5a0ae09a() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.5
            @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3234xc20796d8.InterfaceC27947x5a0ae09a
            /* renamed from: onDelayCalc */
            public void mo120899xe22c6b59() {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.this.f61955xafee26c4 = false;
            }
        });
        if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61794x2116f291 != null) {
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121066x3c4f5dcf(new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.IYTReflectListener() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.6
                @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.IYTReflectListener
                /* renamed from: onGetAppBrightness */
                public float mo120900xee427d9b() {
                    try {
                        return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61794x2116f291.mo63471xee427d9b();
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.TAG, e19.getLocalizedMessage());
                        return -1.0f;
                    }
                }

                @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.IYTReflectListener
                /* renamed from: onReflectEvent */
                public void mo120901xbd8fe55c(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter, float f17) {
                    try {
                        if (!((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.this).f61739x83a477db.containsKey("refcontrol_begin")) {
                            ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.this).f61739x83a477db.put("refcontrol_begin", java.lang.String.valueOf(java.lang.System.currentTimeMillis() * 1000));
                        }
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61794x2116f291.mo63473xbd8fe55c(colorMatrixColorFilter, f17);
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.TAG, e19.getLocalizedMessage());
                    }
                }

                @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.IYTReflectListener
                /* renamed from: onReflectStart */
                public void mo120902xbe543724(long j17) {
                    try {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61794x2116f291.mo63474xbe543724(j17);
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.TAG, e19.getLocalizedMessage());
                    }
                }
            });
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121066x3c4f5dcf(null);
        }
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121083xd2cc768b(true);
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121092xdcf60544("log_level", "3");
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121091x26f6c366(new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.IYtLoggerListener() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.7
            @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.IYtLoggerListener
            public void log(java.lang.String str4, java.lang.String str5) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str4, str5);
            }
        });
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: moveToNextState */
    public void mo120731xb14ae492() {
        super.mo120731xb14ae492();
        if (this.f61961xfcf93909 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120719x424c1dc8(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(this.f61961xfcf93909));
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121348x725ce521(this.f61954x104e125a);
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120720x993b0803(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(this.f61961xfcf93909));
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: onPause */
    public void mo120732xb01dfb57() {
        super.mo120732xb01dfb57();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: onResume */
    public void mo120733x57429eec() {
        super.mo120733x57429eec();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: reset */
    public void mo120664x6761d4f() {
        m120885xb4382b97();
        super.mo120664x6761d4f();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: unload */
    public void mo120734xcde7deff() {
        super.mo120734xcde7deff();
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121052xae7a2e7a();
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121064x89dacf62();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: update */
    public void mo120735xce0038c9(byte[] bArr, int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise;
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] faceStatusArr;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise2;
        super.mo120735xce0038c9(bArr, i17, i18, i19, j17);
        int i27 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.AnonymousClass11.f61973xd42c1e46[this.f61949xdd7f4710.ordinal()];
        if (i27 != 1) {
            if (i27 == 2) {
                if (this.f61947x908f8d9d > this.f61969x51766d3d && (((facePreviewingAdvise = this.f61962x5d20ee80) == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) && (faceStatusArr = this.f61951x224d98af) != null && faceStatusArr.length > 0)) {
                    m120892x38ac57fb();
                }
                this.f61961xfcf93909 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE;
            } else if (i27 == 3) {
                java.lang.String str = TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reflect continuous_detect_count ");
                sb6.append(this.f61947x908f8d9d);
                sb6.append("pass flag ");
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise3 = this.f61962x5d20ee80;
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise facePreviewingAdvise4 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_PASS;
                sb6.append(facePreviewingAdvise3 != facePreviewingAdvise4);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, sb6.toString());
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "reflect pose state " + this.f61962x5d20ee80);
                if (this.f61955xafee26c4 && ((this.f61957x3f800dc3 && (facePreviewingAdvise2 = this.f61962x5d20ee80) != facePreviewingAdvise4 && facePreviewingAdvise2 != com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) || ((this.f61956x3229d3af && this.f61962x5d20ee80 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NO_FACE) || this.f61962x5d20ee80 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27912x7fe79699.FacePreviewingAdvise.ADVISE_NO_FACE))) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "reflect cancel:" + this.f61947x908f8d9d);
                    com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121052xae7a2e7a();
                    m120888xe1a99e42(-1, "检测异常", "请保持姿态");
                }
                if (this.f61951x224d98af != null) {
                    int i28 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61790x3fe50cbd;
                    com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus faceStatus = this.f61951x224d98af[0];
                    com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121063x4128b5ab(bArr, i17, i18, j17, i28, faceStatus.xys, faceStatus.f62629x65bc340, faceStatus.yaw, faceStatus.f62631x35807d);
                }
            }
        } else if (!this.f61970xb82606ed.m120584x39e05d35() || this.f61970xb82606ed.m120582xae11c739()) {
            this.f61970xb82606ed.m120581xae7a2e7a();
            this.f61949xdd7f4710 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27909xfd95e971.ReflectProcessType.RPT_INIT;
        } else if (this.f61947x908f8d9d <= 1) {
            this.f61970xb82606ed.m120585x6761d4f();
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.8
                {
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61587xecc5c7cc);
                }
            });
        }
        mo120731xb14ae492();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: updateSDKSetting */
    public void mo120737x1b37865f(org.json.JSONObject jSONObject) {
        try {
            this.f61957x3f800dc3 = jSONObject.optBoolean("force_pose_check", this.f61957x3f800dc3);
            this.f61956x3229d3af = jSONObject.optBoolean("need_check_multiface", this.f61956x3229d3af);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, e17.getLocalizedMessage());
        }
    }

    /* renamed from: translation */
    private com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27938x308994a m120894x9249f2b1(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27932x8c9320e5 c27932x8c9320e5) {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27938x308994a c27938x308994a = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27938x308994a();
        c27938x308994a.m121130x53266a19(new java.lang.String(android.util.Base64.encode(c27932x8c9320e5.f62433xdab7a40d, 2)));
        c27938x308994a.f62462x5b9b5c43 = c27932x8c9320e5.f62432x5b9b5c43;
        c27938x308994a.m121129xc4f46da8(c27932x8c9320e5.f62431x9b67b33);
        c27938x308994a.m121131x35d036(c27932x8c9320e5.f302189x);
        c27938x308994a.m121132x35d037(c27932x8c9320e5.f302190y);
        return c27938x308994a;
    }

    /* renamed from: translation */
    private com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27937x22c90090 m120893x9249f2b1(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27933x792f52b8 c27933x792f52b8) {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27937x22c90090 c27937x22c90090 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27937x22c90090();
        byte[] bArr = c27933x792f52b8.f62436xdab7a40d;
        if (bArr != null) {
            c27937x22c90090.m121124x53266a19(new java.lang.String(android.util.Base64.encode(bArr, 2)));
            c27937x22c90090.f62458x5b9b5c43 = c27933x792f52b8.f62435x5b9b5c43;
            c27937x22c90090.m121121x79f23571(c27933x792f52b8.f62434x9b67b33);
            c27937x22c90090.m121123x912af837(c27933x792f52b8.xys);
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "rawRefBigImgData.frameBuffer is null");
        }
        return c27937x22c90090;
    }
}
