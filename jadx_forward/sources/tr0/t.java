package tr0;

/* loaded from: classes14.dex */
public final class t extends sr0.f {
    public boolean A;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f502891t;

    /* renamed from: u, reason: collision with root package name */
    public wo.h f502892u;

    /* renamed from: v, reason: collision with root package name */
    public wo.d1 f502893v;

    /* renamed from: w, reason: collision with root package name */
    public final tr0.d f502894w;

    /* renamed from: x, reason: collision with root package name */
    public final tr0.v f502895x;

    /* renamed from: y, reason: collision with root package name */
    public final tr0.b f502896y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f502897z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 stateFlow, int i17) {
        super(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateFlow, "stateFlow");
        this.f502891t = stateFlow;
        this.f502894w = new tr0.d();
        this.f502895x = new tr0.v();
        this.f502896y = new tr0.b();
    }

    public static final java.lang.Object I(tr0.t tVar, java.lang.Boolean bool, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        tVar.f492970n.f537697f = true;
        return jz5.f0.f384359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J(tr0.t r19, int r20, int r21, int r22, boolean r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.t.J(tr0.t, int, int, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sr0.f
    public void F(int i17) {
        this.f492970n.f537696e = i17;
        nr0.x xVar = this.f492967h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xVar);
        xr0.j jVar = xVar.f420654m.f537708a;
        this.f502894w.a(!v(), i17, B().f537706a, B().f537707b, jVar.f537706a, jVar.f537707b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        if (r0.f537685c == true) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(wo.h r10) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.t.K(wo.h):void");
    }

    public final java.lang.String L() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CameraKit-");
        wo.d1 d1Var = this.f502893v;
        sb6.append(d1Var != null ? java.lang.Integer.valueOf(d1Var.hashCode()) : null);
        return sb6.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M(boolean r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.t.M(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void N(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (qr0.a.f447590c) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6357x4121d0db c6357x4121d0db = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6357x4121d0db();
            c6357x4121d0db.f137085i = c6357x4121d0db.b("SessionId", java.lang.String.valueOf(this.f492963d), true);
            c6357x4121d0db.f137080d = c6357x4121d0db.b("MethodName", name, true);
            c6357x4121d0db.k();
        }
    }

    public final boolean O(android.hardware.Camera.Parameters parameters) {
        int i17 = this.f492963d;
        try {
            android.hardware.Camera.Size previewSize = parameters.getPreviewSize();
            java.util.List<android.hardware.Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            if (supportedPictureSizes != null) {
                int i18 = 0;
                for (java.lang.Object obj : supportedPictureSizes) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    android.hardware.Camera.Size size = (android.hardware.Camera.Size) obj;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera1Impl", "setPictureSize: index:" + i18 + " resolution:[" + size.width + ' ' + size.height + ']');
                    i18 = i19;
                }
            }
            if (supportedPictureSizes.contains(previewSize)) {
                parameters.setPictureSize(previewSize.width, previewSize.height);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera1Impl", "picture size no contain preview size");
            as0.a.f94958a.c(i17, 1);
            return false;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera1Impl", "setPictureSize >> is error");
            as0.a.f94958a.c(i17, 2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(xr0.j r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.t.P(xr0.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[Catch: all -> 0x002c, Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:39:0x0024, B:15:0x0033, B:17:0x0039, B:20:0x0048, B:22:0x006b, B:25:0x0075, B:35:0x0072), top: B:38:0x0024, outer: #1 }] */
    @Override // sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Float a() {
        /*
            r10 = this;
            tr0.v r0 = r10.f502895x
            boolean r1 = r0.f502901c
            java.lang.String r2 = "MicroMsg.Camera.Camera1ZoomHelper"
            r3 = 0
            if (r1 == 0) goto L10
            java.lang.String r0 = "ignore onZoomOut,for"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r0)
            goto L88
        L10:
            r1 = 1
            r0.f502901c = r1
            wo.h r4 = r0.f502900b
            if (r4 == 0) goto L20
            wo.d1 r4 = r4.f529246a
            if (r4 == 0) goto L20
            android.hardware.Camera$Parameters r4 = r4.c()
            goto L21
        L20:
            r4 = r3
        L21:
            r5 = 0
            if (r4 == 0) goto L30
            boolean r6 = r4.isZoomSupported()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r6 != r1) goto L30
            r6 = r1
            goto L31
        L2c:
            r1 = move-exception
            goto L83
        L2e:
            r1 = move-exception
            goto L7b
        L30:
            r6 = r5
        L31:
            if (r6 == 0) goto L86
            int r6 = r4.getZoom()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.util.ArrayList r7 = r0.f502899a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            int r8 = r7.indexOf(r8)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            int r9 = r4.getMaxZoom()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r6 < r9) goto L48
            goto L86
        L48:
            int r8 = r8 + r1
            int r6 = r7.size()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            int r6 = r6 - r1
            int r1 = java.lang.Math.min(r8, r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.Object r1 = r7.get(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.String r6 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r4.isSmoothZoomSupported()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r4.setZoom(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            wo.h r6 = r0.f502900b     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r6 == 0) goto L6e
            wo.d1 r6 = r6.f529246a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            goto L6f
        L6e:
            r6 = r3
        L6f:
            if (r6 != 0) goto L72
            goto L75
        L72:
            r6.f(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
        L75:
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.Float r3 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            goto L86
        L7b:
            java.lang.String r4 = "onZoomOut error:"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r4, r6)     // Catch: java.lang.Throwable -> L2c
            goto L86
        L83:
            r0.f502901c = r5
            throw r1
        L86:
            r0.f502901c = r5
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.t.a():java.lang.Float");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[Catch: all -> 0x002c, Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:39:0x0024, B:15:0x0033, B:17:0x0039, B:20:0x0044, B:22:0x005f, B:25:0x0069, B:35:0x0066), top: B:38:0x0024, outer: #1 }] */
    @Override // sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Float b() {
        /*
            r9 = this;
            tr0.v r0 = r9.f502895x
            boolean r1 = r0.f502901c
            java.lang.String r2 = "MicroMsg.Camera.Camera1ZoomHelper"
            r3 = 0
            if (r1 == 0) goto L10
            java.lang.String r0 = "ignore onZoomOut,for"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r0)
            goto L7c
        L10:
            r1 = 1
            r0.f502901c = r1
            wo.h r4 = r0.f502900b
            if (r4 == 0) goto L20
            wo.d1 r4 = r4.f529246a
            if (r4 == 0) goto L20
            android.hardware.Camera$Parameters r4 = r4.c()
            goto L21
        L20:
            r4 = r3
        L21:
            r5 = 0
            if (r4 == 0) goto L30
            boolean r6 = r4.isZoomSupported()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r6 != r1) goto L30
            r6 = r1
            goto L31
        L2c:
            r1 = move-exception
            goto L77
        L2e:
            r1 = move-exception
            goto L6f
        L30:
            r6 = r5
        L31:
            if (r6 == 0) goto L7a
            int r6 = r4.getZoom()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.util.ArrayList r7 = r0.f502899a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            int r8 = r7.indexOf(r8)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r6 != 0) goto L44
            goto L7a
        L44:
            int r8 = r8 - r1
            int r1 = java.lang.Math.max(r5, r8)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.Object r1 = r7.get(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.String r6 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r4.setZoom(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            wo.h r6 = r0.f502900b     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r6 == 0) goto L62
            wo.d1 r6 = r6.f529246a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            goto L63
        L62:
            r6 = r3
        L63:
            if (r6 != 0) goto L66
            goto L69
        L66:
            r6.f(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
        L69:
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.Float r3 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            goto L7a
        L6f:
            java.lang.String r4 = "onZoomIn error:"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r4, r6)     // Catch: java.lang.Throwable -> L2c
            goto L7a
        L77:
            r0.f502901c = r5
            throw r1
        L7a:
            r0.f502901c = r5
        L7c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.t.b():java.lang.Float");
    }

    @Override // sr0.h
    public int c(int i17) {
        return 2;
    }

    @Override // sr0.i
    public int d() {
        wo.h hVar = this.f502892u;
        if (hVar != null) {
            return hVar.f529247b;
        }
        return 0;
    }

    @Override // sr0.i
    public void e(boolean z17) {
        wo.d1 d1Var;
        int i17 = this.f492963d;
        xr0.b bVar = this.f492969m;
        boolean z18 = bVar != null && bVar.f537684b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera1Impl", "switchFlash >> " + z17 + ", " + this.f492973q + ", " + v() + ", " + z18);
        if (z18) {
            this.f492973q = z17;
            if (v()) {
                try {
                    wo.h hVar = this.f502892u;
                    android.hardware.Camera.Parameters c17 = (hVar == null || (d1Var = hVar.f529246a) == null) ? null : d1Var.c();
                    if (c17 != null) {
                        c17.setFlashMode(z17 ? "on" : "off");
                    }
                    wo.h hVar2 = this.f502892u;
                    wo.d1 d1Var2 = hVar2 != null ? hVar2.f529246a : null;
                    if (d1Var2 != null) {
                        d1Var2.f(c17);
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a17 = as0.a.f94958a.a(i17);
                    if (a17 != null) {
                        a17.Y = 1;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera1Impl", "switch flash error " + e17.getMessage());
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a18 = as0.a.f94958a.a(i17);
                    if (a18 != null) {
                        a18.Y = 2;
                    }
                }
            }
        }
    }

    @Override // sr0.h
    public java.lang.Object f(int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x003f, Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:34:0x0037, B:14:0x0046, B:16:0x004e, B:21:0x0053), top: B:33:0x0037, outer: #1 }] */
    @Override // sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(float r8) {
        /*
            r7 = this;
            tr0.v r0 = r7.f502895x
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "setZoomValue: >> "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.Camera.Camera1ZoomHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            boolean r1 = r0.f502901c
            r3 = 0
            if (r1 == 0) goto L23
            java.lang.String r8 = "ignore onZoomOut,for"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r8)
            goto L67
        L23:
            r1 = 1
            r0.f502901c = r1
            wo.h r4 = r0.f502900b
            r5 = 0
            if (r4 == 0) goto L34
            wo.d1 r4 = r4.f529246a
            if (r4 == 0) goto L34
            android.hardware.Camera$Parameters r4 = r4.c()
            goto L35
        L34:
            r4 = r5
        L35:
            if (r4 == 0) goto L43
            boolean r6 = r4.isZoomSupported()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            if (r6 != r1) goto L43
            r6 = r1
            goto L44
        L3f:
            r8 = move-exception
            goto L62
        L41:
            r8 = move-exception
            goto L5a
        L43:
            r6 = r3
        L44:
            if (r6 == 0) goto L65
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r4.setZoom(r8)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            wo.h r8 = r0.f502900b     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            if (r8 == 0) goto L50
            wo.d1 r5 = r8.f529246a     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
        L50:
            if (r5 != 0) goto L53
            goto L56
        L53:
            r5.f(r4)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
        L56:
            r0.f502901c = r3
            r3 = r1
            goto L67
        L5a:
            java.lang.String r1 = "onZoomIn error:"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r8, r1, r4)     // Catch: java.lang.Throwable -> L3f
            goto L65
        L62:
            r0.f502901c = r3
            throw r8
        L65:
            r0.f502901c = r3
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.t.g(float):boolean");
    }

    @Override // sr0.i
    /* renamed from: getHorizontalViewAngle */
    public java.lang.Float mo165061xdd520634() {
        wo.d1 d1Var;
        android.hardware.Camera.Parameters c17;
        wo.h hVar = this.f502892u;
        java.lang.Float valueOf = (hVar == null || (d1Var = hVar.f529246a) == null || (c17 = d1Var.c()) == null) ? null : java.lang.Float.valueOf(c17.getHorizontalViewAngle());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.a(valueOf, -1.0f)) {
            return null;
        }
        return valueOf;
    }

    @Override // sr0.i
    public void h(float f17, float f18) {
        int i17;
        wo.d1 d1Var;
        wo.d1 d1Var2;
        wo.d1 d1Var3;
        android.hardware.Camera.Parameters c17;
        tr0.d dVar = this.f502894w;
        int i18 = dVar.f492977b;
        if (i18 <= 0 || (i17 = dVar.f492976a) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera1FocusHelper", "ignore focus,for width:" + dVar.f492976a + " height:" + dVar.f492977b);
        } else {
            android.graphics.Rect b17 = dVar.b(f17, f18, 1.25f, i17, i18);
            android.graphics.Rect b18 = dVar.b(f17, f18, 1.0f, dVar.f492976a, dVar.f492977b);
            try {
                wo.h hVar = dVar.f502822e;
                dVar.f502823f = (hVar == null || (d1Var3 = hVar.f529246a) == null || (c17 = d1Var3.c()) == null) ? null : c17.getFocusMode();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera1FocusHelper", "focus on point:[" + f17 + ' ' + f18 + "] focusRect:" + b17 + " meteringRect:" + b18);
                wo.h hVar2 = dVar.f502822e;
                android.hardware.Camera.Parameters c18 = (hVar2 == null || (d1Var2 = hVar2.f529246a) == null) ? null : d1Var2.c();
                java.util.List<java.lang.String> supportedFocusModes = c18 != null ? c18.getSupportedFocusModes() : null;
                if (supportedFocusModes != null && supportedFocusModes.contains("auto")) {
                    c18.setFocusMode("auto");
                }
                boolean z17 = false;
                if ((c18 != null ? c18.getMaxNumFocusAreas() : 0) > 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(1);
                    arrayList.add(new android.hardware.Camera.Area(b17, 1000));
                    if (c18 != null) {
                        c18.setFocusAreas(arrayList);
                    }
                }
                if ((c18 != null ? c18.getMaxNumMeteringAreas() : 0) > 0) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
                    arrayList2.add(new android.hardware.Camera.Area(b18, 1000));
                    if (c18 != null) {
                        c18.setMeteringAreas(arrayList2);
                    }
                }
                xr0.b bVar = dVar.f502825h;
                if (bVar != null && bVar.f537684b) {
                    z17 = true;
                }
                if (z17) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c18 != null ? c18.getFlashMode() : null, "on")) {
                        c18.setFlashMode("off");
                    }
                }
                wo.h hVar3 = dVar.f502822e;
                wo.d1 d1Var4 = hVar3 != null ? hVar3.f529246a : null;
                if (d1Var4 != null) {
                    d1Var4.f(c18);
                }
                wo.h hVar4 = dVar.f502822e;
                if (hVar4 != null && (d1Var = hVar4.f529246a) != null) {
                    d1Var.b(dVar.f502826i);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Camera.Camera1FocusHelper", "autofocus with area fail, exception %s", e17.getMessage());
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetExpo >> origin: ");
        tr0.b bVar2 = this.f502896y;
        sb6.append(bVar2.f502818f);
        sb6.append(", cur: ");
        sb6.append(bVar2.f502817e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera1ExpoHelper", sb6.toString());
        int i19 = bVar2.f502818f;
        if (i19 != bVar2.f502817e) {
            bVar2.f502817e = i19;
            bVar2.a(i19);
        }
    }

    @Override // sr0.f, sr0.j
    public java.lang.Object i(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f502897z;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        java.lang.Object i17 = super.i(interfaceC29045xdcb5ca57);
        return i17 == pz5.a.f440719d ? i17 : jz5.f0.f384359a;
    }

    @Override // sr0.f, sr0.i
    public java.lang.Object j(int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super.j(i17, i18, interfaceC29045xdcb5ca57);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pz5.a aVar = pz5.a.f440719d;
        return f0Var;
    }

    @Override // sr0.i
    public jz5.l k() {
        tr0.b bVar = this.f502896y;
        android.util.Range range = bVar.f502819g;
        int i17 = bVar.f502818f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera1Impl", "getExpoData >> " + range + ", " + i17);
        return new jz5.l(range, java.lang.Integer.valueOf(i17));
    }

    @Override // sr0.f, sr0.i
    public java.lang.Object l(int i17, int i18, int i19, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.f1 f1Var;
        if (!C()) {
            return sr0.f.E(this, i17, i18, i19, z17, interfaceC29045xdcb5ca57);
        }
        if (!this.f492970n.f537697f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera1Impl", "takePictureAsync >> but is no previewing");
            return null;
        }
        nr0.y yVar = this.f492966g;
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera1Impl", "takePictureAsync >> but coroutines is null");
            return null;
        }
        if (yVar != null) {
            tr0.r rVar = new tr0.r(this, i17, i18, i19, z17, null);
            pr0.n nVar = (pr0.n) yVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", "cameraAsyncWithSync Start[takePictureAsync]");
            f1Var = p3325xe03a0797.p3326xc267989b.l.b(nVar.f439431n, null, null, new pr0.j(nVar, "takePictureAsync", java.lang.System.currentTimeMillis(), rVar, null), 3, null);
        } else {
            f1Var = null;
        }
        if (f1Var != null) {
            return ((p3325xe03a0797.p3326xc267989b.g1) f1Var).k(interfaceC29045xdcb5ca57);
        }
        return null;
    }

    @Override // sr0.i
    public int m() {
        return 1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(5:18|19|20|21|22))(4:30|(3:32|33|(2:35|(1:37)(2:38|22))(1:40))|13|14)|23|(1:25)|13|14))|45|6|7|(0)(0)|23|(0)|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0032, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [sr0.f] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v6 */
    @Override // sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.Boolean r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof tr0.k
            if (r0 == 0) goto L13
            r0 = r11
            tr0.k r0 = (tr0.k) r0
            int r1 = r0.f502852h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f502852h = r1
            goto L18
        L13:
            tr0.k r0 = new tr0.k
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f502850f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f502852h
            java.lang.String r3 = "MicroMsg.Camera.Camera1Impl"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r10 = r0.f502848d
            tr0.t r10 = (tr0.t) r10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)     // Catch: java.lang.Exception -> L32
            goto Lbb
        L32:
            r11 = move-exception
            goto L9f
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            java.lang.Object r10 = r0.f502849e
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r2 = r0.f502848d
            tr0.t r2 = (tr0.t) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)     // Catch: java.lang.Exception -> L4d
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r8
            goto L80
        L4d:
            r11 = move-exception
            r10 = r2
            goto L9f
        L50:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "startPreview isPreviewing:"
            r11.<init>(r2)
            xr0.d r2 = r9.f492970n
            boolean r7 = r2.f537697f
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r11)
            boolean r11 = r2.f537697f
            if (r11 != 0) goto Lbb
            nr0.x r11 = r9.f492967h     // Catch: java.lang.Exception -> L83
            if (r11 == 0) goto L85
            r0.f502848d = r9     // Catch: java.lang.Exception -> L83
            r0.f502849e = r10     // Catch: java.lang.Exception -> L83
            r0.f502852h = r5     // Catch: java.lang.Exception -> L83
            java.lang.Object r11 = r11.n(r0)     // Catch: java.lang.Exception -> L83
            if (r11 != r1) goto L7d
            return r1
        L7d:
            r2 = r11
            r11 = r10
            r10 = r9
        L80:
            jz5.f0 r2 = (jz5.f0) r2     // Catch: java.lang.Exception -> L32
            goto L87
        L83:
            r11 = move-exception
            goto L9e
        L85:
            r11 = r10
            r10 = r9
        L87:
            r10.A = r6     // Catch: java.lang.Exception -> L32
            or0.c r2 = or0.c.f428962a     // Catch: java.lang.Exception -> L32
            tr0.l r5 = new tr0.l     // Catch: java.lang.Exception -> L32
            r7 = 0
            r5.<init>(r10, r11, r7)     // Catch: java.lang.Exception -> L32
            r0.f502848d = r10     // Catch: java.lang.Exception -> L32
            r0.f502849e = r7     // Catch: java.lang.Exception -> L32
            r0.f502852h = r4     // Catch: java.lang.Exception -> L32
            java.lang.Object r10 = r2.a(r5, r0)     // Catch: java.lang.Exception -> L32
            if (r10 != r1) goto Lbb
            return r1
        L9e:
            r10 = r9
        L9f:
            as0.a r0 = as0.a.f94958a
            int r1 = r10.f492963d
            r0.b(r1, r6)
            xr0.d r10 = r10.f492970n
            r10.f537697f = r6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "startPreview error:"
            r10.<init>(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r10)
        Lbb:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.t.n(java.lang.Boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sr0.f, sr0.i
    /* renamed from: needMirror */
    public boolean mo165060xa5b697f5() {
        return v();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof tr0.n
            if (r0 == 0) goto L13
            r0 = r9
            tr0.n r0 = (tr0.n) r0
            int r1 = r0.f502864g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f502864g = r1
            goto L18
        L13:
            tr0.n r0 = new tr0.n
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f502862e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f502864g
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L5c
            if (r2 == r7) goto L54
            if (r2 == r6) goto L4c
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto Lb8
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3c:
            java.lang.Object r2 = r0.f502861d
            tr0.t r2 = (tr0.t) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto La8
        L44:
            java.lang.Object r2 = r0.f502861d
            tr0.t r2 = (tr0.t) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L99
        L4c:
            java.lang.Object r2 = r0.f502861d
            tr0.t r2 = (tr0.t) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L85
        L54:
            java.lang.Object r2 = r0.f502861d
            tr0.t r2 = (tr0.t) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L76
        L5c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.String r9 = "MicroMsg.Camera.Camera1Impl"
            java.lang.String r2 = "switchCamera"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r2)
            nr0.x r9 = r8.f492967h
            if (r9 == 0) goto L79
            r0.f502861d = r8
            r0.f502864g = r7
            java.lang.Object r9 = r9.k(r0)
            if (r9 != r1) goto L75
            return r1
        L75:
            r2 = r8
        L76:
            jz5.f0 r9 = (jz5.f0) r9
            goto L7a
        L79:
            r2 = r8
        L7a:
            r0.f502861d = r2
            r0.f502864g = r6
            java.lang.Object r9 = r2.q(r0)
            if (r9 != r1) goto L85
            return r1
        L85:
            xr0.d r9 = r2.f492970n
            boolean r9 = r9.f537694c
            r9 = r9 ^ r7
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r0.f502861d = r2
            r0.f502864g = r5
            java.lang.Object r9 = r2.n(r9, r0)
            if (r9 != r1) goto L99
            return r1
        L99:
            nr0.x r9 = r2.f492967h
            if (r9 == 0) goto La8
            r0.f502861d = r2
            r0.f502864g = r4
            java.lang.Object r9 = r9.i(r0)
            if (r9 != r1) goto La8
            return r1
        La8:
            nr0.x r9 = r2.f492967h
            if (r9 == 0) goto Lba
            r2 = 0
            r0.f502861d = r2
            r0.f502864g = r3
            java.lang.Object r9 = r9.n(r0)
            if (r9 != r1) goto Lb8
            return r1
        Lb8:
            jz5.f0 r9 = (jz5.f0) r9
        Lba:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.t.p(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // sr0.f, sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof tr0.m
            if (r0 == 0) goto L13
            r0 = r6
            tr0.m r0 = (tr0.m) r0
            int r1 = r0.f502860g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f502860g = r1
            goto L18
        L13:
            tr0.m r0 = new tr0.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f502858e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f502860g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f502857d
            tr0.t r0 = (tr0.t) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.String r6 = "MicroMsg.Camera.Camera1Impl"
            java.lang.String r2 = "stopPreview"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r2)
            r0.f502857d = r5
            r0.f502860g = r4
            super.q(r0)
            if (r3 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r6 = 0
            r0.K(r6)
            wo.d1 r1 = r0.f502893v
            if (r1 == 0) goto L55
            r1.l()
        L55:
            wo.d1 r1 = r0.f502893v
            if (r1 == 0) goto L5c
            r1.d()
        L5c:
            r0.f502893v = r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.t.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sr0.f, sr0.j
    public java.lang.Object r(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f502897z;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
        java.lang.Object D = sr0.f.D(this, interfaceC29045xdcb5ca57);
        return D == pz5.a.f440719d ? D : jz5.f0.f384359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // sr0.f, sr0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(android.content.Context r17, p012xc85e97e9.p093xedfae76a.y r18, nr0.x r19, nr0.y r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.t.s(android.content.Context, androidx.lifecycle.y, nr0.x, nr0.y, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sr0.i
    /* renamed from: setLightTorch */
    public void mo165062xf597288(boolean z17) {
        int i17 = this.f492963d;
        xr0.b bVar = this.f492969m;
        boolean z18 = bVar != null && bVar.f537684b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera1Impl", "setRecordStatus >> " + this.f492973q + ", " + z18 + ", " + v());
        if (z18 && v()) {
            java.lang.String str = z17 ? "torch" : "on";
            try {
                wo.d1 d1Var = this.f502893v;
                android.hardware.Camera.Parameters c17 = d1Var != null ? d1Var.c() : null;
                if (c17 != null) {
                    c17.setFlashMode(str);
                    wo.d1 d1Var2 = this.f502893v;
                    if (d1Var2 != null) {
                        d1Var2.f(c17);
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a17 = as0.a.f94958a.a(i17);
                    if (a17 != null) {
                        a17.f137087a0 = 1;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera1Impl", "set torch is error " + e17.getMessage() + ", " + z17);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a18 = as0.a.f94958a.a(i17);
                if (a18 != null) {
                    a18.f137087a0 = 2;
                }
            }
        }
    }

    @Override // sr0.i
    public void u(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera1Impl", "onLargeExpo >> " + i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enLargeExpo >> cur: ");
        tr0.b bVar = this.f502896y;
        sb6.append(bVar.f502817e);
        sb6.append(", ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(bVar.f502816d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera1ExpoHelper", sb6.toString());
        int i18 = bVar.f502817e;
        int i19 = i17 + i18;
        int i27 = bVar.f502816d;
        if (i19 >= i27) {
            i19 = i27;
        }
        if (i18 != i19) {
            bVar.f502817e = i19;
            bVar.a(i19);
        }
    }

    @Override // sr0.i
    public void x(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera1Impl", "onReduceExpo >> " + i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reduceExpo >> cur: ");
        tr0.b bVar = this.f502896y;
        sb6.append(bVar.f502817e);
        sb6.append(", ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(bVar.f502816d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera1ExpoHelper", sb6.toString());
        int i18 = bVar.f502817e;
        int i19 = i18 - i17;
        int i27 = bVar.f502815c;
        if (i19 <= i27) {
            i19 = i27;
        }
        if (i18 != i19) {
            bVar.f502817e = i19;
            bVar.a(i19);
        }
    }
}
