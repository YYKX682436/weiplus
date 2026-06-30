package st3;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final st3.t f494130a = new st3.t();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f494131b = null;

    /* renamed from: c, reason: collision with root package name */
    public static int f494132c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f494133d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f494134e = false;

    /* renamed from: f, reason: collision with root package name */
    public static int f494135f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f494136g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static int f494137h = -1;

    public static final void a(android.graphics.Point cropPreviewSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cropPreviewSize, "cropPreviewSize");
        int i17 = cropPreviewSize.x;
        int i18 = cropPreviewSize.y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen, cropPreviewWidth:" + i17 + ", cropPreviewHeight:" + i18 + ", recorderType:" + di3.w.f314303d.f314233a + ", resolutionLimit:" + f494132c);
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = f494131b;
        if (c11120x15dce88d != null) {
            if (di3.w.f314303d.f314233a == 1) {
                if (i18 > c11120x15dce88d.f152724d) {
                    int i19 = f494132c;
                    if (i19 == 1080) {
                        c11120x15dce88d.f152724d = i18 / 2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen ffempg 1080p, videoWidth:" + c11120x15dce88d.f152724d);
                    } else if (i19 == 720) {
                        c11120x15dce88d.f152724d = (int) (i18 * 0.75d);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen ffempg 720p, videoWidth:" + c11120x15dce88d.f152724d);
                    }
                    c11120x15dce88d.f152725e = (int) ((i17 / i18) * c11120x15dce88d.f152724d);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen ffmpeg use crop preview size");
                    c11120x15dce88d.f152724d = i18;
                    c11120x15dce88d.f152725e = i17;
                }
                int i27 = c11120x15dce88d.f152724d;
                if (i27 % 2 != 0) {
                    c11120x15dce88d.f152724d = i27 - 1;
                }
                int i28 = c11120x15dce88d.f152725e;
                if (i28 % 2 != 0) {
                    c11120x15dce88d.f152725e = i28 - 1;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen ffmpeg final videoSize:" + c11120x15dce88d.f152724d + 'x' + c11120x15dce88d.f152725e);
                return;
            }
            int i29 = f494132c;
            if ((i29 == 720 || i29 == 540) && i18 < c11120x15dce88d.f152724d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen mediacodec 720p or 540p:" + f494132c + ", adjust video size");
                int i37 = f494132c;
                if (i37 == 540) {
                    c11120x15dce88d.f152724d = i18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen mediacodec 540p, videoWidth:" + c11120x15dce88d.f152724d);
                } else if (i37 == 720) {
                    c11120x15dce88d.f152724d = (int) (i18 * 0.75d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen mediacodec 720p, videoWidth:" + c11120x15dce88d.f152724d);
                }
                float f17 = i17 / i18;
                int i38 = c11120x15dce88d.f152724d;
                c11120x15dce88d.f152725e = (int) (f17 * i38);
                c11120x15dce88d.f152724d = ai3.d.a(i38);
                c11120x15dce88d.f152725e = ai3.d.a(c11120x15dce88d.f152725e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen final adjust video size:" + c11120x15dce88d.f152724d + 'x' + c11120x15dce88d.f152725e);
            }
        }
    }

    public final boolean b() {
        di3.f0 f0Var = di3.w.f314303d;
        if (f0Var == null || !f494134e) {
            return false;
        }
        boolean z17 = f0Var.f314233a == 1;
        java.lang.Object b17 = bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Media_CaptureCpuCrop_Int, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cpuCrop: recorderTypeCpuCrop:");
        sb6.append(z17);
        sb6.append(", serverConfigUseCpuCrop:");
        sb6.append(f494133d);
        sb6.append(", swEnableHevc:");
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = f494131b;
        sb6.append(c11120x15dce88d != null ? java.lang.Integer.valueOf(c11120x15dce88d.K) : null);
        sb6.append(", hwEnableHevc:");
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = f494131b;
        sb6.append(c11120x15dce88d2 != null ? java.lang.Integer.valueOf(c11120x15dce88d2.f152723J) : null);
        sb6.append(", repairerConfig:");
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightRecordConfig", sb6.toString());
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, 0)) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, 1);
        }
        if (!z17 && !f494133d) {
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d3 = f494131b;
            if (!(c11120x15dce88d3 != null && c11120x15dce88d3.K == 1)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x00a2, code lost:
    
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66817xb58848b9(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC, -1) != (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00ba, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00b8, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00b6, code lost:
    
        if (gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC, -1) != (-1)) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st3.t.c(com.tencent.mm.modelcontrol.VideoTransPara, int, boolean):void");
    }

    public final java.lang.String d() {
        return "cpuCrop:" + b() + ", recorderType:" + e() + ", resolutionLimit:" + f494132c + ", videoParams:" + f494131b;
    }

    public final int e() {
        java.lang.Object b17 = bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Media_CaptureSoft_Int, 0);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, 0)) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, 1) ? 1 : 2;
        }
        di3.f0 f0Var = di3.w.f314303d;
        if (f0Var == null || !f494134e) {
            return 2;
        }
        return f0Var.f314233a;
    }
}
