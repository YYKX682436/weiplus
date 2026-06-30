package com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873;

/* renamed from: com.tencent.mm.plugin.voipmp.platform.ZIDL_oeNivDgqB */
/* loaded from: classes14.dex */
class C18972x6f20c171 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.l f258735a;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[LOOP:0: B:18:0x005d->B:24:0x0081, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[EDGE_INSN: B:25:0x0085->B:26:0x0085 BREAK  A[LOOP:0: B:18:0x005d->B:24:0x0081], SYNTHETIC] */
    /* renamed from: ZIDL_A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m73447x9db8edf9(byte[] r21) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.C18972x6f20c171.m73447x9db8edf9(byte[]):long");
    }

    /* renamed from: ZIDL_B */
    public void m73448x9db8edfa(long j17) {
        jo5.i iVar = (jo5.i) this.f258735a;
        jo5.c a17 = iVar.a(j17);
        if (a17 == null) {
            return;
        }
        iVar.c(a17);
        jo5.b bVar = a17.f382469c;
        android.hardware.camera2.CameraDevice cameraDevice = bVar.f382462e;
        if (cameraDevice != null) {
            java.util.concurrent.Semaphore semaphore = bVar.f382464g;
            semaphore.drainPermits();
            cameraDevice.close();
            semaphore.tryAcquire(3000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            bVar.f382462e = null;
            bVar.f382463f = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusClosed;
        }
        android.view.Surface surface = a17.f382471e;
        if (surface != null) {
            surface.release();
        }
        a17.f382471e = null;
        boolean z17 = true;
        if (j17 == 0) {
            return;
        }
        int i17 = (int) (j17 - 1);
        java.util.ArrayList arrayList = iVar.f382484a;
        arrayList.set(i17, null);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        kz5.q qVar = iVar.f382485b;
        qVar.m144678xbb8646d7(valueOf);
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!(((jo5.c) it.next()) == null)) {
                    z17 = false;
                    break;
                }
            }
        }
        if (z17) {
            arrayList.clear();
            qVar.clear();
        }
    }

    /* renamed from: ZIDL_C */
    public boolean m73449x9db8edfb(long j17) {
        jo5.c a17 = ((jo5.i) this.f258735a).a(j17);
        if (a17 == null) {
            return false;
        }
        if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40960xab2f7f06() && (!qo5.b.f447197b || !((jp5.o) i95.n0.c(jp5.o.class)).g3())) {
            return false;
        }
        jo5.b bVar = a17.f382469c;
        if (bVar.f382462e != null) {
            return true;
        }
        java.util.concurrent.Semaphore semaphore = bVar.f382464g;
        semaphore.drainPermits();
        bVar.f382465h = false;
        try {
            int i17 = android.os.Build.VERSION.SDK_INT;
            jo5.a aVar = bVar.f382466i;
            java.lang.String str = bVar.f382459b;
            if (i17 >= 28) {
                android.hardware.camera2.CameraManager cameraManager = bVar.f382458a;
                java.util.concurrent.Executor executor = bVar.f382460c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(aVar);
                arrayList.add(executor);
                arrayList.add(str);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(cameraManager, arrayList.toArray(), "com/tencent/mm/voipmp/v2/driver/VoIPMPCamera2Device", "open", "(J)Z", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V");
            } else {
                android.hardware.camera2.CameraManager cameraManager2 = bVar.f382458a;
                android.os.Handler handler = bVar.f382461d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(handler);
                arrayList2.add(aVar);
                arrayList2.add(str);
                java.util.Collections.reverse(arrayList2);
                yj0.a.k(cameraManager2, arrayList2.toArray(), "com/tencent/mm/voipmp/v2/driver/VoIPMPCamera2Device", "open", "(J)Z", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
            }
            if (semaphore.tryAcquire(5000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return bVar.f382465h;
            }
            return false;
        } catch (java.lang.SecurityException | java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: ZIDL_D */
    public boolean m73450x9db8edfc(long j17) {
        jo5.i iVar = (jo5.i) this.f258735a;
        jo5.c a17 = iVar.a(j17);
        if (a17 == null) {
            return false;
        }
        iVar.c(a17);
        jo5.b bVar = a17.f382469c;
        android.hardware.camera2.CameraDevice cameraDevice = bVar.f382462e;
        if (cameraDevice != null) {
            java.util.concurrent.Semaphore semaphore = bVar.f382464g;
            semaphore.drainPermits();
            cameraDevice.close();
            semaphore.tryAcquire(3000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            bVar.f382462e = null;
            bVar.f382463f = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusClosed;
        }
        android.view.Surface surface = a17.f382471e;
        if (surface != null) {
            surface.release();
        }
        a17.f382471e = null;
        return true;
    }

    /* renamed from: ZIDL_E */
    public boolean m73451x9db8edfd(long j17, long j18, byte[] bArr) {
        android.graphics.SurfaceTexture surfaceTexture;
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.l lVar = this.f258735a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.i) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.i.f258800h, bArr);
        jo5.c a17 = ((jo5.i) lVar).a(j17);
        boolean z17 = false;
        if (a17 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79.f295314d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.b bVar = null;
        if (c22889xa2f9dd79 == null || c22889xa2f9dd79.a(j18) || (surfaceTexture = ((jo5.m) c22889xa2f9dd79.f295316b.get((int) (j18 - 1))).f382498a) == null) {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            return false;
        }
        if (iVar != null) {
            bVar = iVar.f258804g[1] ? iVar.f258801d : com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.b.VoIPMPCameraDefinition480P;
        }
        if (bVar == null) {
            bVar = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.b.VoIPMPCameraDefinition720P;
        }
        int ordinal = bVar.ordinal();
        android.util.Size size = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? new android.util.Size(1280, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf) : new android.util.Size(1920, 1080) : new android.util.Size(1280, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf) : new android.util.Size(640, 480);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        android.view.Surface surface = a17.f382471e;
        if (surface != null) {
            surface.release();
        }
        a17.f382471e = new android.view.Surface(surfaceTexture);
        int i17 = iVar != null && iVar.f258804g[2] ? iVar.f258802e : 15;
        if (iVar != null && iVar.f258804g[3]) {
            z17 = true;
        }
        a17.f382472f = new android.util.Range(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? iVar.f258803f : 15));
        return true;
    }

    /* renamed from: ZIDL_F */
    public boolean m73452x9db8edfe(long j17) {
        android.hardware.camera2.CameraDevice cameraDevice;
        android.view.Surface surface;
        jo5.i iVar = (jo5.i) this.f258735a;
        jo5.c a17 = iVar.a(j17);
        if (a17 == null || (cameraDevice = a17.f382469c.f382462e) == null || (surface = a17.f382471e) == null) {
            return false;
        }
        iVar.c(a17);
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        jo5.h hVar = new jo5.h(a17, cameraDevice, surface, iVar, c0Var, countDownLatch);
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                cameraDevice.createCaptureSession(new android.hardware.camera2.params.SessionConfiguration(0, kz5.b0.c(new android.hardware.camera2.params.OutputConfiguration(surface)), (java.util.concurrent.Executor) ((jz5.n) iVar.f382488e).mo141623x754a37bb(), hVar));
            } else {
                cameraDevice.createCaptureSession(kz5.b0.c(surface), hVar, iVar.b());
            }
            if (countDownLatch.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return c0Var.f391645d;
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: ZIDL_G */
    public boolean m73453x9db8edff(long j17) {
        jo5.i iVar = (jo5.i) this.f258735a;
        jo5.c a17 = iVar.a(j17);
        if (a17 == null) {
            return false;
        }
        iVar.c(a17);
        jo5.b bVar = a17.f382469c;
        if (bVar.f382463f == com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusStarted) {
            bVar.f382463f = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusOpened;
        }
        return true;
    }

    /* renamed from: ZIDL_H */
    public int m73454x9db8ee00(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.g gVar;
        jo5.c a17 = ((jo5.i) this.f258735a).a(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.g gVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.g.VoIPMPFrameRotation0;
        if (a17 != null) {
            try {
                android.hardware.camera2.CameraCharacteristics cameraCharacteristics = a17.f382467a.getCameraCharacteristics(a17.f382468b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cameraCharacteristics, "getCameraCharacteristics(...)");
                java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
                if (num == null) {
                    num = 0;
                }
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == 90) {
                        gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.g.VoIPMPFrameRotation90;
                    } else if (intValue == 180) {
                        gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.g.VoIPMPFrameRotation180;
                    } else if (intValue == 270) {
                        gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.g.VoIPMPFrameRotation270;
                    }
                    gVar2 = gVar;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return gVar2.f258792d;
    }

    /* renamed from: ZIDL_I */
    public int m73455x9db8ee01(long j17) {
        jo5.c a17 = ((jo5.i) this.f258735a).a(j17);
        return (a17 == null ? com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusUninitialized : a17.f382469c.f382463f).f258779d;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        this.f258735a = (com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.l) obj;
    }
}
