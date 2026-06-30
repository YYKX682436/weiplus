package sr0;

/* loaded from: classes14.dex */
public abstract class f implements sr0.i {

    /* renamed from: d, reason: collision with root package name */
    public final int f492963d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f492964e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.y f492965f;

    /* renamed from: g, reason: collision with root package name */
    public nr0.y f492966g;

    /* renamed from: h, reason: collision with root package name */
    public nr0.x f492967h;

    /* renamed from: i, reason: collision with root package name */
    public xr0.c f492968i;

    /* renamed from: m, reason: collision with root package name */
    public xr0.b f492969m;

    /* renamed from: o, reason: collision with root package name */
    public p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f492971o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f492973q;

    /* renamed from: r, reason: collision with root package name */
    public int f492974r;

    /* renamed from: n, reason: collision with root package name */
    public final xr0.d f492970n = new xr0.d(null, null, false, 0, 0, false, 0, 127, null);

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f492972p = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.Camera.BaseCameraInstance");

    /* renamed from: s, reason: collision with root package name */
    public bs0.f f492975s = bs0.f.f105316d;

    public f(int i17) {
        this.f492963d = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object D(sr0.f r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            boolean r0 = r9 instanceof sr0.a
            if (r0 == 0) goto L13
            r0 = r9
            sr0.a r0 = (sr0.a) r0
            int r1 = r0.f492940g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f492940g = r1
            goto L18
        L13:
            sr0.a r0 = new sr0.a
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f492938e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f492940g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r5) goto L2d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto Lbb
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.f492937d
            sr0.f r8 = (sr0.f) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto La7
        L3d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.String r9 = "MicroMsg.Camera.BaseCameraInstance"
            java.lang.String r2 = "onResume"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r2)
            r0.f492937d = r8
            r0.f492940g = r4
            r8.getClass()
            oz5.n r2 = new oz5.n
            kotlin.coroutines.Continuation r6 = pz5.f.b(r0)
            r2.<init>(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "makeSureScreenReady >> "
            r6.<init>(r7)
            xr0.d r7 = r8.f492970n
            xr0.k r7 = r7.f537693b
            xr0.j r7 = r7.f537708a
            int r7 = r7.f537706a
            r6.append(r7)
            java.lang.String r7 = ", "
            r6.append(r7)
            xr0.d r7 = r8.f492970n
            xr0.k r7 = r7.f537693b
            xr0.j r7 = r7.f537708a
            int r7 = r7.f537707b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r6)
            xr0.d r9 = r8.f492970n
            xr0.k r9 = r9.f537693b
            xr0.j r9 = r9.f537708a
            int r6 = r9.f537706a
            if (r6 <= 0) goto L8f
            int r9 = r9.f537707b
            if (r9 <= 0) goto L8f
            goto L90
        L8f:
            r4 = 0
        L90:
            if (r4 == 0) goto L9a
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r3)
            r2.mo48700xdecd0e93(r9)
            goto L9c
        L9a:
            r8.f492971o = r2
        L9c:
            java.lang.Object r9 = r2.a()
            if (r9 != r1) goto La3
            goto La4
        La3:
            r9 = r3
        La4:
            if (r9 != r1) goto La7
            return r1
        La7:
            boolean r9 = r8.v()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r2 = 0
            r0.f492937d = r2
            r0.f492940g = r5
            java.lang.Object r8 = r8.n(r9, r0)
            if (r8 != r1) goto Lbb
            return r1
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sr0.f.D(sr0.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object E(sr0.f r25, int r26, int r27, int r28, boolean r29, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r30) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sr0.f.E(sr0.f, int, int, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object G(sr0.f r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            boolean r0 = r11 instanceof sr0.d
            if (r0 == 0) goto L13
            r0 = r11
            sr0.d r0 = (sr0.d) r0
            int r1 = r0.f492958h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f492958h = r1
            goto L18
        L13:
            sr0.d r0 = new sr0.d
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f492956f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f492958h
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            int r10 = r0.f492955e
            java.lang.Object r0 = r0.f492954d
            sr0.f r0 = (sr0.f) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lcc
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            int r10 = r0.f492955e
            java.lang.Object r2 = r0.f492954d
            sr0.f r2 = (sr0.f) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r7 = r10
            r10 = r2
            goto Lac
        L46:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            int r11 = r10.d()
            int r2 = r10.A()
            int r6 = r2 - r11
            int r6 = r6 + 360
            int r6 = r6 % 360
            int r7 = r11 - r2
            int r7 = r7 + 360
            int r7 = r7 % 360
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "cameraRotate:"
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r11 = " displayRotate:"
            r8.append(r11)
            r8.append(r2)
            java.lang.String r11 = " render rotate:"
            r8.append(r11)
            r8.append(r6)
            java.lang.String r11 = " mirror:"
            r8.append(r11)
            boolean r11 = r10.mo165060xa5b697f5()
            r8.append(r11)
            java.lang.String r11 = " focusRotate:"
            r8.append(r11)
            r8.append(r7)
            java.lang.String r11 = r8.toString()
            java.lang.String r2 = "MicroMsg.Camera.BaseCameraInstance"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r11)
            nr0.x r11 = r10.f492967h
            if (r11 == 0) goto Lae
            r0.f492954d = r10
            r0.f492955e = r7
            r0.f492958h = r5
            nr0.u r2 = new nr0.u
            r2.<init>(r6, r11, r3)
            java.lang.String r5 = "updateInputRotate"
            java.lang.Object r11 = r11.m(r5, r2, r0)
            if (r11 != r1) goto Lac
            return r1
        Lac:
            jz5.f0 r11 = (jz5.f0) r11
        Lae:
            nr0.x r11 = r10.f492967h
            if (r11 == 0) goto Ld0
            boolean r2 = r10.mo165060xa5b697f5()
            r0.f492954d = r10
            r0.f492955e = r7
            r0.f492958h = r4
            nr0.t r4 = new nr0.t
            r4.<init>(r2, r11, r3)
            java.lang.String r2 = "updateInputMirror"
            java.lang.Object r11 = r11.m(r2, r4, r0)
            if (r11 != r1) goto Lca
            return r1
        Lca:
            r0 = r10
            r10 = r7
        Lcc:
            jz5.f0 r11 = (jz5.f0) r11
            r7 = r10
            r10 = r0
        Ld0:
            r10.F(r7)
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sr0.f.G(sr0.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object H(sr0.f r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            boolean r0 = r8 instanceof sr0.e
            if (r0 == 0) goto L13
            r0 = r8
            sr0.e r0 = (sr0.e) r0
            int r1 = r0.f492962g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f492962g = r1
            goto L18
        L13:
            sr0.e r0 = new sr0.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f492960e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f492962g
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L50
            if (r2 == r6) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L91
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f492959d
            sr0.f r7 = (sr0.f) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L81
        L40:
            java.lang.Object r7 = r0.f492959d
            sr0.f r7 = (sr0.f) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L72
        L48:
            java.lang.Object r7 = r0.f492959d
            sr0.f r7 = (sr0.f) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L62
        L50:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            nr0.x r8 = r7.f492967h
            if (r8 == 0) goto L64
            r0.f492959d = r7
            r0.f492962g = r6
            java.lang.Object r8 = r8.k(r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            jz5.f0 r8 = (jz5.f0) r8
        L64:
            r0.f492959d = r7
            r0.f492962g = r5
            r7.getClass()
            java.lang.Object r8 = G(r7, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            nr0.x r8 = r7.f492967h
            if (r8 == 0) goto L81
            r0.f492959d = r7
            r0.f492962g = r4
            java.lang.Object r8 = r8.i(r0)
            if (r8 != r1) goto L81
            return r1
        L81:
            nr0.x r7 = r7.f492967h
            if (r7 == 0) goto L92
            r8 = 0
            r0.f492959d = r8
            r0.f492962g = r3
            java.lang.Object r8 = r7.n(r0)
            if (r8 != r1) goto L91
            return r1
        L91:
            return r8
        L92:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sr0.f.H(sr0.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public int A() {
        int i17;
        android.content.Context context = this.f492964e;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
            throw null;
        }
        int l17 = com.p314xaae8f345.mm.ui.bl.l(context);
        if (l17 != 0) {
            if (l17 == 1) {
                i17 = 90;
            } else if (l17 == 2) {
                i17 = 180;
            } else if (l17 == 3) {
                i17 = 270;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.BaseCameraInstance", "displayRotation:" + i17);
            return i17;
        }
        i17 = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.BaseCameraInstance", "displayRotation:" + i17);
        return i17;
    }

    public xr0.j B() {
        return this.f492970n.f537693b.f537709b;
    }

    public final boolean C() {
        xr0.b bVar = this.f492969m;
        if (bVar != null && bVar.f537683a) {
            if ((bVar != null && bVar.f537684b) && this.f492973q && v()) {
                return true;
            }
        }
        return false;
    }

    public abstract void F(int i17);

    @Override // sr0.j
    public java.lang.Object i(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.BaseCameraInstance", "onPause");
        java.lang.Object q17 = q(interfaceC29045xdcb5ca57);
        return q17 == pz5.a.f440719d ? q17 : jz5.f0.f384359a;
    }

    @Override // sr0.i
    public java.lang.Object j(int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.BaseCameraInstance", "updateScreenSize >> " + i17 + ", " + i18);
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572 = this.f492971o;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (interfaceC29045xdcb5ca572 != null) {
            ((oz5.n) interfaceC29045xdcb5ca572).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
        }
        this.f492971o = null;
        return f0Var;
    }

    @Override // sr0.i
    public java.lang.Object l(int i17, int i18, int i19, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return E(this, i17, i18, i19, z17, interfaceC29045xdcb5ca57);
    }

    @Override // sr0.i
    /* renamed from: needMirror */
    public boolean mo165060xa5b697f5() {
        return v();
    }

    @Override // sr0.i
    public boolean o() {
        return this.f492970n.f537692a.f537681b;
    }

    @Override // sr0.i
    public java.lang.Object q(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f492970n.f537697f = false;
        return jz5.f0.f384359a;
    }

    @Override // sr0.j
    public java.lang.Object r(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return D(this, interfaceC29045xdcb5ca57);
    }

    @Override // sr0.i
    public java.lang.Object s(android.content.Context context, p012xc85e97e9.p093xedfae76a.y yVar, nr0.x xVar, nr0.y yVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<set-?>");
        this.f492964e = context;
        this.f492965f = yVar;
        this.f492967h = xVar;
        if (xVar != null) {
            xVar.f420666y = m();
        }
        this.f492966g = yVar2;
        xr0.k kVar = xVar.f420654m;
        xr0.d dVar = this.f492970n;
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<set-?>");
        dVar.f537693b = kVar;
        or0.c cVar = or0.c.f428962a;
        or0.c.f428965d = dVar;
        return jz5.f0.f384359a;
    }

    @Override // sr0.i
    public boolean t() {
        return this.f492970n.f537692a.f537682c;
    }

    @Override // sr0.i
    public java.lang.Object w(bs0.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.BaseCameraInstance", "setCameraViewRatio >> " + fVar + ", " + this.f492975s);
        this.f492975s = fVar;
        return jz5.f0.f384359a;
    }

    public final android.graphics.Bitmap y(int i17, int i18, int i19, android.graphics.Bitmap bitmap, boolean z17) {
        if (bitmap == null) {
            return null;
        }
        if (i17 > 0 && i18 > 0) {
            float min = java.lang.Math.min((i17 * 1.0f) / bitmap.getWidth(), (i18 * 1.0f) / bitmap.getHeight());
            return min >= 1.0f ? i19 == 0 ? bitmap : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, i19) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.A0(bitmap, i19, min, min, z17);
        }
        if (i17 > 0) {
            float min2 = (i17 * 1.0f) / java.lang.Math.min(bitmap.getHeight(), bitmap.getWidth());
            return (min2 < 1.0f || i19 != 0 || z17) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.A0(bitmap, i19, java.lang.Math.min(min2, 1.0f), java.lang.Math.min(min2, 1.0f), z17) : bitmap;
        }
        if (i18 > 0) {
            float min3 = java.lang.Math.min((i18 * 1.0f) / java.lang.Math.max(bitmap.getHeight(), bitmap.getWidth()), 1.0f);
            return (min3 < 1.0f || i19 != 0 || z17) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.A0(bitmap, i19, java.lang.Math.min(min3, 1.0f), java.lang.Math.min(min3, 1.0f), z17) : bitmap;
        }
        if (i19 <= 0) {
            return bitmap;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.BaseCameraInstance", "BitmapUtil mirror error");
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.x0(bitmap, i19, true);
    }

    public final void z(android.util.Range range, int i17, int i18) {
        as0.a aVar = as0.a.f94958a;
        boolean z17 = this.f492973q;
        int i19 = this.f492963d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a17 = aVar.a(i19);
        if (a17 != null) {
            a17.W = z17 ? 1L : 2L;
        }
        int i27 = v() ? 1 : 2;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a18 = aVar.a(i19);
        if (a18 != null) {
            a18.V = i27;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a19 = aVar.a(i19);
        if (a19 != null) {
            a19.f137090f = i18;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a27 = aVar.a(i19);
        if (a27 != null) {
            a27.U = i17;
        }
        java.lang.Integer num = range != null ? (java.lang.Integer) range.getLower() : null;
        int intValue = num == null ? 0 : num.intValue();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a28 = aVar.a(i19);
        if (a28 != null) {
            a28.S = intValue;
        }
        java.lang.Integer num2 = range != null ? (java.lang.Integer) range.getUpper() : null;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a29 = aVar.a(i19);
        if (a29 != null) {
            a29.T = intValue2;
        }
    }
}
