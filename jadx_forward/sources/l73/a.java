package l73;

/* loaded from: classes14.dex */
public class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f398408a = null;

    public static java.lang.String i(java.lang.String str) {
        wo.i1 i1Var = null;
        try {
            try {
                i1Var = wo.i1.d(str, true);
                java.lang.String l17 = i1Var.l();
                try {
                    i1Var.q();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskFindHardwareInfo", e17, "codec release exception", new java.lang.Object[0]);
                }
                return l17;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskFindHardwareInfo", e18, "hy: error in handle media codec", new java.lang.Object[0]);
                if (i1Var != null) {
                    try {
                        i1Var.q();
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskFindHardwareInfo", e19, "codec release exception", new java.lang.Object[0]);
                    }
                }
                return "undefined";
            }
        } catch (java.lang.Throwable th6) {
            if (i1Var != null) {
                try {
                    i1Var.q();
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskFindHardwareInfo", e27, "codec release exception", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }

    public final void b() {
        r45.rs rsVar = new r45.rs();
        rsVar.f466699f = android.os.Build.CPU_ABI;
        java.util.Map c17 = wo.t.c();
        java.lang.String str = (java.lang.String) c17.get("Processor");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        rsVar.f466697d = str;
        rsVar.f466700g = (java.lang.String) c17.get("model name");
        rsVar.f466701h = (java.lang.String) c17.get("Hardware");
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            try {
                randomAccessFile = com.p314xaae8f345.mm.vfs.w6.A(com.p314xaae8f345.mm.vfs.z7.a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"), false);
                rsVar.f466698e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(randomAccessFile.readLine(), -1) / 1000;
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskFindHardwareInfo", e17, "hy: error when close read cpu files", new java.lang.Object[0]);
                }
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskFindHardwareInfo", e18, "hy: error when reading cpu frequency", new java.lang.Object[0]);
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (java.io.IOException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskFindHardwareInfo", e19, "hy: error when close read cpu files", new java.lang.Object[0]);
                    }
                }
            }
            k73.a.b().a().f469198e = rsVar;
        } catch (java.lang.Throwable th6) {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskFindHardwareInfo", e27, "hy: error when close read cpu files", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }

    public final void c() {
        r45.yq0 yq0Var = new r45.yq0();
        yq0Var.f472822d = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
        yq0Var.f472823e = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        yq0Var.f472824f = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.location.gps");
        yq0Var.f472825g = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        yq0Var.f472826h = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.camera.front");
        yq0Var.f472827i = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.microphone");
        yq0Var.f472828m = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.nfc");
        yq0Var.f472839x = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
        yq0Var.f472829n = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.nfc");
        yq0Var.f472830o = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.fingerprint");
        yq0Var.f472831p = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.telephony.cdma");
        yq0Var.f472832q = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.telephony.gsm");
        yq0Var.f472833r = this.f398408a.getPackageManager().hasSystemFeature("android.software.sip");
        yq0Var.f472834s = this.f398408a.getPackageManager().hasSystemFeature("android.software.sip.voip");
        yq0Var.f472835t = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepdetector");
        yq0Var.f472836u = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter");
        yq0Var.f472837v = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.sensor.accelerometer");
        yq0Var.f472838w = this.f398408a.getPackageManager().hasSystemFeature("android.hardware.sensor.light");
        k73.a.b().a().f469203m = yq0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        this.f398408a = (android.content.Context) obj;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            r45.uv3 k17 = k();
            if (k17 != null) {
                k73.a.b().f386315a = k17;
            } else {
                r45.ce ceVar = new r45.ce();
                ceVar.f453025d = wo.w0.g(false);
                ceVar.f453026e = android.os.Build.MANUFACTURER;
                ceVar.f453027f = wo.w0.m();
                ceVar.f453028g = android.os.Build.VERSION.INCREMENTAL;
                k73.a.b().a().f469197d = ceVar;
                b();
                f();
                h();
                d();
                g();
                e();
                c();
                j();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskFindHardwareInfo", "hy: calc hardware using: %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k73.a.b().a();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskFindHardwareInfo", e17, "hy: exception when find hardware info", new java.lang.Object[0]);
            km5.b c17 = km5.u.c();
            if (c17 != null) {
                c17.a(null);
            }
            return null;
        }
    }

    public final void d() {
        android.opengl.EGLDisplay eglGetDisplay;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        android.content.pm.ConfigurationInfo deviceConfigurationInfo = ((android.app.ActivityManager) this.f398408a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getDeviceConfigurationInfo();
        r45.v53 v53Var = new r45.v53();
        int i17 = deviceConfigurationInfo.reqGlEsVersion;
        v53Var.f469426d = i17 >= 131072;
        v53Var.f469427e = i17 >= 196608;
        try {
            ((fa1.u) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d6.class))).getClass();
            v53Var.f469428f = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getDeviceConfigurationInfo().reqGlEsVersion >= 196608 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("android.hardware.vulkan.version");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskFindHardwareInfo", th6, "hy: error when retrieve vulkan support!", new java.lang.Object[0]);
            v53Var.f469428f = false;
        }
        try {
            eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskFindHardwareInfo", th7, "hy: failed in getting info", new java.lang.Object[0]);
        }
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("Unable to get EGL14 display");
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr2, 0)) {
            throw new java.lang.RuntimeException("Unable to initialize EGL14");
        }
        v53Var.f469429g = java.lang.String.format("%d.%d", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr2[0]));
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr3 = new int[1];
        if (!android.opengl.EGL14.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr3, 0) || iArr3[0] == 0) {
            throw new java.lang.RuntimeException("Unable to choose EGLConfig");
        }
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
        if (!android.opengl.EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
            throw new java.lang.RuntimeException("Unable to make EGL context current");
        }
        java.lang.String glGetString = android.opengl.GLES20.glGetString(7937);
        java.lang.String glGetString2 = android.opengl.GLES20.glGetString(7938);
        java.lang.String glGetString3 = android.opengl.GLES20.glGetString(35724);
        java.lang.String glGetString4 = android.opengl.GLES20.glGetString(7939);
        java.lang.String glGetString5 = android.opengl.GLES20.glGetString(7936);
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        android.opengl.EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
        android.opengl.EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
        android.opengl.EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
        android.opengl.EGL14.eglTerminate(eglGetDisplay);
        v53Var.f469432m = glGetString;
        v53Var.f469433n = glGetString2;
        v53Var.f469434o = glGetString3;
        v53Var.f469430h = glGetString4;
        v53Var.f469431i = glGetString5;
        k73.a.b().a().f469204n = v53Var;
        android.os.SystemClock.elapsedRealtime();
    }

    public final void e() {
        r45.h50 h50Var = new r45.h50();
        h50Var.f457381d = i("video/avc");
        h50Var.f457382e = i("video/hevc");
        int codecCount = android.media.MediaCodecList.getCodecCount();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (codecInfoAt.isEncoder()) {
                for (java.lang.String str : codecInfoAt.getSupportedTypes()) {
                    java.util.Set set = (java.util.Set) hashMap.get(str.toLowerCase());
                    if (set == null) {
                        set = new java.util.HashSet();
                    }
                    set.add(codecInfoAt.getName());
                    hashMap.put(str.toLowerCase(), set);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskFindHardwareInfo", "hy: allCodecNames: %s", hashMap);
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            r45.nm4 nm4Var = new r45.nm4();
            nm4Var.f463029d = (java.lang.String) entry.getKey();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (entry.getValue() != null) {
                linkedList2.addAll((java.util.Collection) entry.getValue());
            }
            nm4Var.f463030e = linkedList2;
            linkedList.add(nm4Var);
        }
        h50Var.f457383f = linkedList;
        k73.a.b().a().f469202i = h50Var;
        java.util.LinkedList linkedList3 = h50Var.f457383f;
        if (linkedList3 != null) {
            linkedList3.size();
        }
    }

    public final void f() {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) this.f398408a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        r45.pk4 pk4Var = new r45.pk4();
        pk4Var.f464661d = (int) ((memoryInfo.totalMem / 1024) / 1024);
        pk4Var.f464662e = (int) ((memoryInfo.threshold / 1024) / 1024);
        pk4Var.f464663f = ((android.app.ActivityManager) this.f398408a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getLargeMemoryClass();
        pk4Var.f464664g = ((android.app.ActivityManager) this.f398408a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getMemoryClass();
        k73.a.b().a().f469199f = pk4Var;
    }

    public final void g() {
        android.view.Display defaultDisplay = ((android.view.WindowManager) this.f398408a.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        int i17 = point.x;
        int i18 = point.y;
        r45.pv5 pv5Var = new r45.pv5();
        pv5Var.f464951d = i17 + "x" + i18;
        pv5Var.f464952e = (int) this.f398408a.getResources().getDisplayMetrics().density;
        k73.a.b().a().f469201h = pv5Var;
    }

    public final void h() {
        android.os.StatFs statFs = new android.os.StatFs(lp0.b.e0());
        r45.ie6 ie6Var = new r45.ie6();
        ie6Var.f458509d = (int) ((statFs.getTotalBytes() / 1024) / 1024);
        ie6Var.f458510e = android.os.Environment.getExternalStorageState().equals("mounted");
        k73.a.b().a().f469200g = ie6Var;
    }

    public final void j() {
        try {
            r45.uv3 a17 = k73.a.b().a();
            if (a17 != null) {
                if (a17.f469198e != null) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HARDWARE_CPU_FREQUENCY_MHZ_INT_SYNC, java.lang.Integer.valueOf(a17.f469198e.f466698e));
                }
                if (a17.f469199f != null) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HARDWARE_MEMORY_IN_MB_INT_SYNC, java.lang.Integer.valueOf(a17.f469199f.f464661d));
                }
                java.lang.String format = java.lang.String.format("%s#%s", "KEY_PREFIX", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskFindHardwareInfo", "hy: try saving hardware info with key %s", format);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("HARDWARE_INFO_MMKV").H(format, a17.mo14344x5f01b1f6());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskFindHardwareInfo", e17, "save hardware info to config storage exception", new java.lang.Object[0]);
        }
    }

    public final r45.uv3 k() {
        java.lang.String format = java.lang.String.format("%s#%s", "KEY_PREFIX", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskFindHardwareInfo", "hy: try parse hardware info from %s", format);
        byte[] j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("HARDWARE_INFO_MMKV").j(format);
        if (j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskFindHardwareInfo", "hy: no former saved hardwareInfo");
            return null;
        }
        try {
            r45.uv3 uv3Var = (r45.uv3) new r45.uv3().mo11468x92b714fd(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskFindHardwareInfo", "hy: got info from mmkv");
            return uv3Var;
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TaskFindHardwareInfo", "hy: can not parse from mmkv data!");
            return null;
        } catch (java.lang.ClassCastException unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TaskFindHardwareInfo", "hy: can not parse to hardware info");
            return null;
        }
    }
}
