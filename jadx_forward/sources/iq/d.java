package iq;

@j95.b
/* loaded from: classes14.dex */
public final class d extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f375159d = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();

    public static final void Ai(iq.d dVar, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6389xb3a5f5ae c6389xb3a5f5ae) {
        dVar.getClass();
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.Display.HdrCapabilities hdrCapabilities = ((android.view.WindowManager) systemService).getDefaultDisplay().getHdrCapabilities();
        if (hdrCapabilities == null) {
            return;
        }
        int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(supportedHdrTypes, "getSupportedHdrTypes(...)");
        c6389xb3a5f5ae.f137330d = c6389xb3a5f5ae.b("ScreenSupportedHdrType", kz5.z.c0(supportedHdrTypes, "|", null, null, 0, null, null, 62, null), true);
        float f17 = 100;
        c6389xb3a5f5ae.f137331e = (int) (hdrCapabilities.getDesiredMinLuminance() * f17);
        c6389xb3a5f5ae.f137332f = (int) (hdrCapabilities.getDesiredMaxLuminance() * f17);
        c6389xb3a5f5ae.f137333g = (int) (hdrCapabilities.getDesiredMaxAverageLuminance() * f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceSupportTask", "screen hdr type:" + c6389xb3a5f5ae.f137330d + " minLuminance:" + hdrCapabilities.getDesiredMinLuminance() + " maxLuminance:" + hdrCapabilities.getDesiredMaxLuminance() + " maxAverageLuminance:" + hdrCapabilities.getDesiredMaxAverageLuminance());
    }

    public static final boolean Bi(iq.d dVar, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6389xb3a5f5ae c6389xb3a5f5ae) {
        dVar.getClass();
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eglGetDisplay, android.opengl.EGL14.EGL_NO_DISPLAY)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DeviceSupportTask", "eglGetDisplay EGL_NO_DISPLAY");
            return false;
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DeviceSupportTask", "eglInitialize failed");
            return false;
        }
        java.lang.String eglQueryString = android.opengl.EGL14.eglQueryString(eglGetDisplay, 12373);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eglQueryString);
        boolean B = r26.n0.B(eglQueryString, "EGL_EXT_gl_colorspace_bt2020_pq", false);
        boolean B2 = r26.n0.B(eglQueryString, "EGL_EXT_gl_colorspace_bt2020_hlg", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceSupportTask", "supportPQExt:" + B + " supportHlgExt:" + B2);
        c6389xb3a5f5ae.f137348v = B ? 1 : 2;
        c6389xb3a5f5ae.f137349w = B2 ? 1 : 2;
        int[] iArr2 = new int[1];
        if (!android.opengl.EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12344}, 0, null, 0, 0, iArr2, 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DeviceSupportTask", "eglChooseConfig error");
            c6389xb3a5f5ae.f137350x = 3;
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceSupportTask", "eglChooseConfig result:" + iArr2[0]);
        c6389xb3a5f5ae.f137350x = iArr2[0] > 0 ? 1 : 2;
        if (!android.opengl.EGL14.eglTerminate(eglGetDisplay)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DeviceSupportTask", "eglTerminate error");
        }
        return B && B2 && iArr2[0] > 0;
    }

    public static final void Di(iq.d dVar, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6389xb3a5f5ae c6389xb3a5f5ae) {
        dVar.getClass();
        ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).getClass();
        yr2.e eVar = yr2.e.f546197a;
        c6389xb3a5f5ae.f137334h = eVar.a() ? 1 : 2;
        c6389xb3a5f5ae.f137335i = eVar.b() ? 1 : 2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSupportHDR10PLUS:");
        boolean z17 = yr2.e.f546200d;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HdrCapability", sb6.toString());
        c6389xb3a5f5ae.f137336j = z17 ? 1 : 2;
        c6389xb3a5f5ae.f137337k = eVar.c() ? 1 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceSupportTask", "checkHdrPlaySupport Dolby:" + c6389xb3a5f5ae.f137334h + " HDR10:" + c6389xb3a5f5ae.f137335i + " HDR10Plus:" + c6389xb3a5f5ae.f137336j + " HDRHLG:" + c6389xb3a5f5ae.f137337k);
    }

    public static final void Ni(iq.d dVar, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6389xb3a5f5ae c6389xb3a5f5ae, android.content.Context context) {
        dVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.os.LocaleList locales = context.getResources().getConfiguration().getLocales();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locales, "getLocales(...)");
        int size = locales.size();
        for (int i17 = 0; i17 < size; i17++) {
            sb6.append(locales.get(i17).toString());
            sb6.append("|");
        }
        c6389xb3a5f5ae.f137346t = c6389xb3a5f5ae.b("ConfigLocale", sb6.toString(), true);
        c6389xb3a5f5ae.f137345s = c6389xb3a5f5ae.b("WechatLocale", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(context), true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceSupportTask", "configLocale:" + c6389xb3a5f5ae.f137346t + " wechatLocale:" + c6389xb3a5f5ae.f137345s);
    }

    public static final void Ri(iq.d dVar, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6389xb3a5f5ae c6389xb3a5f5ae) {
        dVar.getClass();
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.content.pm.ConfigurationInfo deviceConfigurationInfo = ((android.app.ActivityManager) systemService).getDeviceConfigurationInfo();
        if (deviceConfigurationInfo == null) {
            return;
        }
        c6389xb3a5f5ae.f137338l = c6389xb3a5f5ae.b("OpenGLVersion", deviceConfigurationInfo.getGlEsVersion(), true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceSupportTask", "checkOpenGLVersion:" + c6389xb3a5f5ae.f137338l);
    }

    public static final void Ui(iq.d dVar, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6389xb3a5f5ae c6389xb3a5f5ae) {
        dVar.getClass();
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        c6389xb3a5f5ae.f137344r = (int) ((android.view.WindowManager) systemService).getDefaultDisplay().getRefreshRate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceSupportTask", "checkScreenFPS:" + c6389xb3a5f5ae.f137344r);
    }

    public static final void wi(iq.d dVar, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6389xb3a5f5ae c6389xb3a5f5ae) {
        dVar.getClass();
        c6389xb3a5f5ae.f137339m = rs0.n.f480839d.f();
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
        long j17 = 1024;
        c6389xb3a5f5ae.f137340n = (int) ((memoryInfo.totalMem / j17) / j17);
        java.lang.String str = (java.lang.String) ((java.util.HashMap) wo.w0.e()).get("hardware");
        c6389xb3a5f5ae.f137341o = c6389xb3a5f5ae.b("CPUName", str != null ? r26.i0.t(str, ",", ";", false) : "", true);
        int a17 = wo.r.a();
        c6389xb3a5f5ae.f137342p = (a17 >> 12) & 15;
        c6389xb3a5f5ae.f137343q = a17 & 255;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceSupportTask", "checkCPUSupport name:" + c6389xb3a5f5ae.f137341o + " freq:" + c6389xb3a5f5ae.f137343q + " core:" + c6389xb3a5f5ae.f137342p + " memB:" + c6389xb3a5f5ae.f137340n + " gpuScore:" + c6389xb3a5f5ae.f137339m);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        boolean z17 = true;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_device_support, true)) {
            ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
            long q17 = this.f375159d.q("MicroMsg.DeviceSupportTask", 0L);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || java.lang.System.currentTimeMillis() - q17 > 86400000) {
                this.f375159d.B("MicroMsg.DeviceSupportTask", java.lang.System.currentTimeMillis());
                ((ku5.t0) ku5.t0.f394148d).g(new iq.c(this, context));
            }
        }
    }
}
