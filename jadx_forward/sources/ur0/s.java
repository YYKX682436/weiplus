package ur0;

/* loaded from: classes14.dex */
public final class s extends sr0.f {
    public final ur0.b A;
    public final ur0.p B;
    public final ur0.h C;
    public final ur0.i D;

    /* renamed from: t, reason: collision with root package name */
    public final android.hardware.camera2.CameraManager f511863t;

    /* renamed from: u, reason: collision with root package name */
    public int f511864u;

    /* renamed from: v, reason: collision with root package name */
    public android.hardware.camera2.CaptureRequest.Builder f511865v;

    /* renamed from: w, reason: collision with root package name */
    public android.hardware.camera2.CameraDevice f511866w;

    /* renamed from: x, reason: collision with root package name */
    public android.hardware.camera2.CameraCharacteristics f511867x;

    /* renamed from: y, reason: collision with root package name */
    public android.hardware.camera2.CameraCaptureSession f511868y;

    /* renamed from: z, reason: collision with root package name */
    public final ur0.t f511869z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 stateFlow, int i17) {
        super(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateFlow, "stateFlow");
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("camera");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        this.f511863t = (android.hardware.camera2.CameraManager) systemService;
        this.f511864u = 1;
        this.f511869z = new ur0.t();
        this.A = new ur0.b();
        this.B = new ur0.p(this);
        this.C = new ur0.h(this, i17);
        this.D = new ur0.i(i17, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(ur0.s r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ur0.s.I(ur0.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J(ur0.s r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof ur0.k
            if (r0 == 0) goto L16
            r0 = r9
            ur0.k r0 = (ur0.k) r0
            int r1 = r0.f511844h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f511844h = r1
            goto L1b
        L16:
            ur0.k r0 = new ur0.k
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f511842f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f511844h
            r3 = 0
            java.lang.String r4 = "MicroMsg.Camera.Camera2Impl"
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 != r5) goto L3a
            java.lang.Object r8 = r0.f511841e
            android.hardware.camera2.CameraDevice r8 = (android.hardware.camera2.CameraDevice) r8
            java.lang.Object r0 = r0.f511840d
            ur0.s r0 = (ur0.s) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: android.hardware.camera2.CameraAccessException -> L37
            r2 = r8
            r8 = r0
            goto L97
        L37:
            r8 = move-exception
            goto Lab
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            xr0.d r9 = r8.f492970n
            xr0.k r9 = r9.f537693b
            xr0.j r9 = r9.f537708a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "createCaptureSession >> "
            r2.<init>(r6)
            int r6 = r9.f537706a
            r2.append(r6)
            java.lang.String r6 = ", "
            r2.append(r6)
            int r7 = r9.f537707b
            r2.append(r7)
            r2.append(r6)
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r2.append(r7)
            r2.append(r6)
            android.hardware.camera2.CameraDevice r6 = r8.f511866w
            if (r6 == 0) goto L77
            int r6 = r6.hashCode()
            goto L78
        L77:
            r6 = r3
        L78:
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)
            android.hardware.camera2.CameraDevice r2 = r8.f511866w     // Catch: android.hardware.camera2.CameraAccessException -> La8
            if (r2 == 0) goto Lc7
            int r6 = r9.f537706a     // Catch: android.hardware.camera2.CameraAccessException -> La8
            int r9 = r9.f537707b     // Catch: android.hardware.camera2.CameraAccessException -> La8
            r0.f511840d = r8     // Catch: android.hardware.camera2.CameraAccessException -> La8
            r0.f511841e = r2     // Catch: android.hardware.camera2.CameraAccessException -> La8
            r0.f511844h = r5     // Catch: android.hardware.camera2.CameraAccessException -> La8
            java.lang.Object r9 = r8.M(r6, r9, r0)     // Catch: android.hardware.camera2.CameraAccessException -> La8
            if (r9 != r1) goto L97
            goto Lc9
        L97:
            java.util.List r9 = (java.util.List) r9     // Catch: android.hardware.camera2.CameraAccessException -> La8
            ur0.p r0 = r8.B     // Catch: android.hardware.camera2.CameraAccessException -> La8
            nr0.y r1 = r8.f492966g     // Catch: android.hardware.camera2.CameraAccessException -> La8
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)     // Catch: android.hardware.camera2.CameraAccessException -> La8
            pr0.n r1 = (pr0.n) r1     // Catch: android.hardware.camera2.CameraAccessException -> La8
            android.os.Handler r1 = r1.f439432o     // Catch: android.hardware.camera2.CameraAccessException -> La8
            r2.createCaptureSession(r9, r0, r1)     // Catch: android.hardware.camera2.CameraAccessException -> La8
            goto Lc7
        La8:
            r9 = move-exception
            r0 = r8
            r8 = r9
        Lab:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "createCaptureSession error >> "
            r9.<init>(r1)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r8)
            as0.a r8 = as0.a.f94958a
            int r9 = r0.f492963d
            r8.b(r9, r3)
        Lc7:
            jz5.f0 r1 = jz5.f0.f384359a
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ur0.s.J(ur0.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sr0.f
    public void F(int i17) {
        this.f492970n.f537696e = i17;
        nr0.x xVar = this.f492967h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xVar);
        xr0.j jVar = xVar.f420654m.f537708a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "updateFocusParam >> " + i17 + ", " + jVar.f537707b + ", " + jVar.f537706a);
        this.A.a(v() ^ true, i17, B().f537706a, B().f537707b, jVar.f537706a, jVar.f537707b);
    }

    public final void K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "close >> " + java.lang.Thread.currentThread());
        android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.f511868y;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
        }
        this.f511868y = null;
        android.hardware.camera2.CameraDevice cameraDevice = this.f511866w;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        this.f511866w = null;
        this.f511865v = null;
        this.f511867x = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L(boolean r22, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ur0.s.L(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(int r13, int r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ur0.s.M(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void N(android.hardware.camera2.CaptureRequest.Key key, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "makeCaptureRequest key:" + key + " value:" + i17);
        android.hardware.camera2.CaptureRequest.Builder builder = this.f511865v;
        if (builder != null) {
            builder.set(key, java.lang.Integer.valueOf(i17));
        }
        O();
    }

    public final java.lang.Integer O() {
        android.hardware.camera2.CaptureRequest build;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "setSessionReq >> " + java.lang.Thread.currentThread());
            android.hardware.camera2.CaptureRequest.Builder builder = this.f511865v;
            if (builder != null && (build = builder.build()) != null) {
                android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.f511868y;
                java.lang.Integer num = null;
                if (cameraCaptureSession != null) {
                    ur0.i iVar = this.D;
                    nr0.y yVar = this.f492966g;
                    num = java.lang.Integer.valueOf(cameraCaptureSession.setRepeatingRequest(build, iVar, yVar != null ? ((pr0.n) yVar).f439432o : null));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "setSessionReq captureSession:" + this.f511868y + " sequence:" + num);
                return num;
            }
            return -1;
        } catch (android.hardware.camera2.CameraAccessException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera2Impl", "setRepeatingRequest failed, errMsg: ");
            return -1;
        }
    }

    @Override // sr0.i
    public java.lang.Float a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "onZoomOut");
        nr0.y yVar = this.f492966g;
        if (yVar != null) {
            ((pr0.n) yVar).m("onZoomOut", new ur0.n(this, null));
        }
        return null;
    }

    @Override // sr0.i
    public java.lang.Float b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "onZoomIn");
        nr0.y yVar = this.f492966g;
        if (yVar != null) {
            ((pr0.n) yVar).m("onZoomIn", new ur0.m(this, null));
        }
        return null;
    }

    @Override // sr0.h
    public int c(int i17) {
        return 2;
    }

    @Override // sr0.i
    public int d() {
        java.lang.Integer num;
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.f511867x;
        if (cameraCharacteristics == null || (num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION)) == null) {
            return 0;
        }
        int intValue = num.intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "getCameraOrientation sensorRotation:" + intValue + " lensFace:" + ((java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)));
        return intValue;
    }

    @Override // sr0.i
    public void e(boolean z17) {
    }

    @Override // sr0.h
    public java.lang.Object f(int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return java.lang.Boolean.FALSE;
    }

    @Override // sr0.i
    public boolean g(float f17) {
        return false;
    }

    @Override // sr0.i
    /* renamed from: getHorizontalViewAngle */
    public java.lang.Float mo165061xdd520634() {
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.f511867x;
        float[] fArr = cameraCharacteristics != null ? (float[]) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS) : null;
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics2 = this.f511867x;
        android.util.SizeF sizeF = cameraCharacteristics2 != null ? (android.util.SizeF) cameraCharacteristics2.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE) : null;
        if (fArr != null) {
            if (!(fArr.length == 0) && sizeF != null) {
                return java.lang.Float.valueOf((float) java.lang.Math.toDegrees(java.lang.Math.atan(sizeF.getWidth() / (kz5.z.J(fArr) * 2.0d)) * 2.0d));
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    @Override // sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(float r12, float r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ur0.s.h(float, float):void");
    }

    @Override // sr0.i
    public jz5.l k() {
        return new jz5.l(null, 0);
    }

    @Override // sr0.i
    public int m() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.Boolean r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r7 = r8 instanceof ur0.q
            if (r7 == 0) goto L13
            r7 = r8
            ur0.q r7 = (ur0.q) r7
            int r0 = r7.f511858g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f511858g = r0
            goto L18
        L13:
            ur0.q r7 = new ur0.q
            r7.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r7.f511856e
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f511858g
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L34
            if (r1 != r4) goto L2c
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L74
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r1 = r7.f511855d
            ur0.s r1 = (ur0.s) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L64
        L3c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "startPreview >> "
            r8.<init>(r1)
            xr0.d r1 = r6.f492970n
            boolean r5 = r1.f537697f
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            java.lang.String r5 = "MicroMsg.Camera.Camera2Impl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r8)
            boolean r8 = r1.f537697f
            if (r8 != 0) goto L74
            r7.f511855d = r6
            r7.f511858g = r3
            r1.f537697f = r3
            if (r2 != r0) goto L63
            return r0
        L63:
            r1 = r6
        L64:
            boolean r8 = r1.v()
            r3 = 0
            r7.f511855d = r3
            r7.f511858g = r4
            java.lang.Object r7 = r1.L(r8, r7)
            if (r7 != r0) goto L74
            return r0
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ur0.s.n(java.lang.Boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ur0.s.p(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sr0.f, sr0.i
    public java.lang.Object q(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", "stopPreview");
        K();
        super.q(interfaceC29045xdcb5ca57);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pz5.a aVar = pz5.a.f440719d;
        return f0Var;
    }

    @Override // sr0.i
    /* renamed from: setLightTorch */
    public void mo165062xf597288(boolean z17) {
    }

    @Override // sr0.i
    public void u(int i17) {
    }

    @Override // sr0.i
    public boolean v() {
        return this.f511864u == 1;
    }

    @Override // sr0.i
    public void x(int i17) {
    }
}
