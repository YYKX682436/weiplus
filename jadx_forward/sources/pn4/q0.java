package pn4;

/* loaded from: classes14.dex */
public final class q0 implements y21.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f438719a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f438720b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f438721c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f438722d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f438723e;

    /* renamed from: f, reason: collision with root package name */
    public pn4.f0 f438724f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f438725g;

    /* renamed from: h, reason: collision with root package name */
    public final pn4.e0 f438726h;

    /* renamed from: i, reason: collision with root package name */
    public int f438727i;

    /* renamed from: j, reason: collision with root package name */
    public int f438728j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f438729k;

    public q0(long j17, java.lang.String transText, java.lang.String fileBasePath, com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transText, "transText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileBasePath, "fileBasePath");
        this.f438719a = j17;
        this.f438720b = transText;
        this.f438721c = fileBasePath;
        this.f438722d = c20976x6ba6452a;
        this.f438723e = "MicroMsg.TextToSpeechStream-" + j17;
        this.f438724f = pn4.f0.f438633d;
        this.f438725g = new java.util.ArrayList();
        this.f438726h = new pn4.e0();
        this.f438729k = new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x012b -> B:12:0x012f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0136 -> B:13:0x013f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(pn4.q0 r18, r45.ly3 r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.q0.c(pn4.q0, r45.ly3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(pn4.q0 r5, r45.jy3 r6, r45.iy3 r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof pn4.p0
            if (r0 == 0) goto L16
            r0 = r8
            pn4.p0 r0 = (pn4.p0) r0
            int r1 = r0.f438702g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f438702g = r1
            goto L1b
        L16:
            pn4.p0 r0 = new pn4.p0
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r8 = r0.f438700e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f438702g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f438699d
            pn4.q0 r5 = (pn4.q0) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L90
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r45.ky3 r8 = new r45.ky3
            r8.<init>()
            java.lang.String r2 = r5.f438720b
            r4 = 0
            r8.set(r4, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r8.set(r3, r2)
            int r6 = r6.f459750d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2 = 5
            r8.set(r2, r6)
            int r6 = r7.f458944d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 4
            r8.set(r7, r6)
            com.tencent.mm.modelbase.l r6 = new com.tencent.mm.modelbase.l
            r6.<init>()
            r7 = 23602(0x5c32, float:3.3073E-41)
            r6.f152200d = r7
            java.lang.String r7 = "/cgi-bin/micromsg-bin/im_submit_asynctts"
            r6.f152199c = r7
            r6.f152197a = r8
            r7 = 5000(0x1388, float:7.006E-42)
            r6.f152205i = r7
            r45.ly3 r7 = new r45.ly3
            r7.<init>()
            r6.f152198b = r7
            com.tencent.mm.modelbase.o r6 = r6.a()
            com.tencent.mm.modelbase.i r7 = new com.tencent.mm.modelbase.i
            r7.<init>()
            r7.p(r6)
            r0.f438699d = r5
            r0.f438702g = r3
            java.lang.Object r8 = rm0.h.b(r7, r0)
            if (r8 != r1) goto L90
            goto Ld0
        L90:
            com.tencent.mm.modelbase.f r8 = (com.p314xaae8f345.mm.p944x882e457a.f) r8
            boolean r6 = r8.b()
            r1 = 0
            if (r6 != 0) goto Lc2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "submit error err type: "
            r6.<init>(r7)
            int r7 = r8.f152148a
            r6.append(r7)
            java.lang.String r7 = " code: "
            r6.append(r7)
            int r7 = r8.f152149b
            r6.append(r7)
            java.lang.String r7 = " msg: "
            r6.append(r7)
            java.lang.String r7 = r8.f152150c
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.j(r6)
            goto Ld0
        Lc2:
            com.tencent.mm.protobuf.f r6 = r8.f152151d
            r45.ly3 r6 = (r45.ly3) r6
            if (r6 != 0) goto Lcf
            java.lang.String r6 = "submit resp is null"
            r5.j(r6)
            goto Ld0
        Lcf:
            r1 = r6
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.q0.d(pn4.q0, r45.jy3, r45.iy3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(pn4.q0 r5, int r6, com.p314xaae8f345.mm.p2495xc50a8b8b.g r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.q0.k(pn4.q0, int, com.tencent.mm.protobuf.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0075, code lost:
    
        if ((((long) ((java.lang.Number) r2.f384374d).intValue()) <= r10) != false) goto L26;
     */
    @Override // y21.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float a(long r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.q0.a(long):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // y21.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(byte[] r8, int r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof pn4.g0
            if (r0 == 0) goto L13
            r0 = r10
            pn4.g0 r0 = (pn4.g0) r0
            int r1 = r0.f438643g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f438643g = r1
            goto L18
        L13:
            pn4.g0 r0 = new pn4.g0
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f438641e
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f438643g
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r8 = r6.f438640d
            pn4.q0 r8 = (pn4.q0) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L62
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            pn4.f0 r10 = r7.f438724f
            int r10 = r10.ordinal()
            if (r10 == 0) goto L4f
            if (r10 == r2) goto L4f
            r1 = 2
            if (r10 == r1) goto L4f
            r8 = 3
            if (r10 != r8) goto L49
            r8 = 0
            goto L6e
        L49:
            jz5.j r8 = new jz5.j
            r8.<init>()
            throw r8
        L4f:
            pn4.e0 r1 = r7.f438726h
            int r3 = r7.f438727i
            r5 = 1
            r6.f438640d = r7
            r6.f438643g = r2
            r2 = r8
            r4 = r9
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L61
            return r0
        L61:
            r8 = r7
        L62:
            java.lang.Number r10 = (java.lang.Number) r10
            int r9 = r10.intValue()
            int r10 = r8.f438727i
            int r10 = r10 + r9
            r8.f438727i = r10
            r8 = r9
        L6e:
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.q0.b(byte[], int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // y21.b
    /* renamed from: close */
    public void mo158760x5a5ddf8() {
        java.lang.String str = this.f438723e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "close");
        if (this.f438724f != pn4.f0.f438634e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set state from ");
            sb6.append(this.f438724f);
            sb6.append(" to ");
            pn4.f0 f0Var = pn4.f0.f438636g;
            sb6.append(f0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, sb6.toString());
            i(f0Var);
        }
        this.f438726h.b();
    }

    public final java.lang.String e() {
        return this.f438721c + "/stream/" + this.f438719a + ".ext";
    }

    public final java.lang.String f() {
        return this.f438721c + "/stream/" + this.f438719a;
    }

    public final java.lang.String g() {
        return this.f438721c + "/stream/" + this.f438719a + ".tmp";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(int r11, r45.hy3 r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof pn4.i0
            if (r0 == 0) goto L13
            r0 = r13
            pn4.i0 r0 = (pn4.i0) r0
            int r1 = r0.f438650f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f438650f = r1
            goto L18
        L13:
            pn4.i0 r0 = new pn4.i0
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f438648d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f438650f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L60
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r13 = 2
            com.tencent.mm.protobuf.g r13 = r12.m75934xbce7f2f(r13)
            if (r13 == 0) goto L3c
            byte[] r13 = r13.f273689a
            goto L3d
        L3c:
            r13 = 0
        L3d:
            r8 = r13
            if (r8 != 0) goto L4b
            java.lang.String r11 = r10.f438723e
            java.lang.String r12 = "handle new data bytes is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r12)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L4b:
            kotlinx.coroutines.p0 r13 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            pn4.k0 r2 = new pn4.k0
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f438650f = r3
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r13, r2, r0)
            if (r11 != r1) goto L60
            return r1
        L60:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.q0.h(int, r45.hy3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void i(pn4.f0 f0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438723e, "current state trans from " + this.f438724f + " to " + f0Var);
        pn4.f0 f0Var2 = this.f438724f;
        this.f438724f = f0Var;
    }

    public final void j(java.lang.String str) {
        i(pn4.f0.f438636g);
        com.p314xaae8f345.mm.vfs.w6.h(f());
        com.p314xaae8f345.mm.vfs.w6.h(g());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f438723e, "trans error cause " + str);
    }

    public final void l(r45.jy3 scene, r45.iy3 language) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(language, "language");
        java.lang.String str = this.f438723e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start trans");
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(f());
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = this.f438722d;
        if (j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "already downloaded");
            if (c20976x6ba6452a != null) {
                v65.i.b(c20976x6ba6452a, null, new pn4.n0(this, null), 1, null);
            }
            i(pn4.f0.f438634e);
            return;
        }
        i(pn4.f0.f438635f);
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new pn4.o0(this, scene, language, null), 1, null);
        }
    }
}
