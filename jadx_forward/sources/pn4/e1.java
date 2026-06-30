package pn4;

/* loaded from: classes14.dex */
public final class e1 implements y21.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f438615a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f438616b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f438617c;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f438618d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f438619e;

    /* renamed from: f, reason: collision with root package name */
    public pn4.u0 f438620f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f438621g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f438622h;

    /* renamed from: i, reason: collision with root package name */
    public final pn4.t0 f438623i;

    /* renamed from: j, reason: collision with root package name */
    public int f438624j;

    /* renamed from: k, reason: collision with root package name */
    public int f438625k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f438626l;

    public e1(long j17, java.lang.String transText, java.lang.String fileBasePath, p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transText, "transText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileBasePath, "fileBasePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f438615a = j17;
        this.f438616b = transText;
        this.f438617c = fileBasePath;
        this.f438618d = scope;
        this.f438619e = "MicroMsg.TextTransToVoiceStream-" + j17;
        this.f438620f = pn4.u0.f438762d;
        this.f438621g = new java.util.ArrayList();
        this.f438623i = new pn4.t0();
        this.f438626l = new java.util.ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
    
        if (r1 == pz5.a.f440719d) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x011b -> B:12:0x011e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0125 -> B:13:0x012e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(pn4.e1 r20, r45.ih6 r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.e1.c(pn4.e1, r45.ih6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(pn4.e1 r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof pn4.d1
            if (r0 == 0) goto L16
            r0 = r6
            pn4.d1 r0 = (pn4.d1) r0
            int r1 = r0.f438607g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f438607g = r1
            goto L1b
        L16:
            pn4.d1 r0 = new pn4.d1
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f438605e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f438607g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f438604d
            pn4.e1 r5 = (pn4.e1) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L75
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r45.hh6 r6 = new r45.hh6
            r6.<init>()
            r2 = 0
            java.lang.String r4 = r5.f438616b
            r6.set(r2, r4)
            com.tencent.mm.modelbase.l r2 = new com.tencent.mm.modelbase.l
            r2.<init>()
            r4 = 11791(0x2e0f, float:1.6523E-41)
            r2.f152200d = r4
            java.lang.String r4 = "/cgi-bin/micromsg-bin/submit_asynctts"
            r2.f152199c = r4
            r2.f152197a = r6
            r6 = 5000(0x1388, float:7.006E-42)
            r2.f152205i = r6
            r45.ih6 r6 = new r45.ih6
            r6.<init>()
            r2.f152198b = r6
            com.tencent.mm.modelbase.o r6 = r2.a()
            com.tencent.mm.modelbase.i r2 = new com.tencent.mm.modelbase.i
            r2.<init>()
            r2.p(r6)
            r0.f438604d = r5
            r0.f438607g = r3
            java.lang.Object r6 = rm0.h.b(r2, r0)
            if (r6 != r1) goto L75
            goto Lb5
        L75:
            com.tencent.mm.modelbase.f r6 = (com.p314xaae8f345.mm.p944x882e457a.f) r6
            boolean r0 = r6.b()
            r1 = 0
            if (r0 != 0) goto La7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "submit error err type: "
            r0.<init>(r2)
            int r2 = r6.f152148a
            r0.append(r2)
            java.lang.String r2 = " code: "
            r0.append(r2)
            int r2 = r6.f152149b
            r0.append(r2)
            java.lang.String r2 = " msg: "
            r0.append(r2)
            java.lang.String r6 = r6.f152150c
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.i(r6)
            goto Lb5
        La7:
            com.tencent.mm.protobuf.f r6 = r6.f152151d
            r45.ih6 r6 = (r45.ih6) r6
            if (r6 != 0) goto Lb4
            java.lang.String r6 = "submit resp is null"
            r5.i(r6)
            goto Lb5
        Lb4:
            r1 = r6
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.e1.d(pn4.e1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(pn4.e1 r5, int r6, com.p314xaae8f345.mm.p2495xc50a8b8b.g r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.e1.j(pn4.e1, int, com.tencent.mm.protobuf.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        if ((((long) ((java.lang.Number) r2.f384374d).intValue()) <= r10) != false) goto L23;
     */
    @Override // y21.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float a(long r10) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.e1.a(long):float");
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
            boolean r0 = r10 instanceof pn4.v0
            if (r0 == 0) goto L13
            r0 = r10
            pn4.v0 r0 = (pn4.v0) r0
            int r1 = r0.f438771g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f438771g = r1
            goto L18
        L13:
            pn4.v0 r0 = new pn4.v0
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f438769e
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f438771g
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r8 = r6.f438768d
            pn4.e1 r8 = (pn4.e1) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L62
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            pn4.u0 r10 = r7.f438620f
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
            pn4.t0 r1 = r7.f438623i
            int r3 = r7.f438624j
            r5 = 1
            r6.f438768d = r7
            r6.f438771g = r2
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
            int r10 = r8.f438624j
            int r10 = r10 + r9
            r8.f438624j = r10
            r8 = r9
        L6e:
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.e1.b(byte[], int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // y21.b
    /* renamed from: close */
    public void mo158760x5a5ddf8() {
        java.lang.String str = this.f438619e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "close");
        if (this.f438620f != pn4.u0.f438763e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set state from ");
            sb6.append(this.f438620f);
            sb6.append(" to ");
            pn4.u0 u0Var = pn4.u0.f438765g;
            sb6.append(u0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, sb6.toString());
            h(u0Var);
        }
        this.f438622h = null;
        this.f438623i.b();
    }

    public final java.lang.String e() {
        return this.f438617c + "/stream/" + this.f438615a + ".ext";
    }

    public final java.lang.String f() {
        return this.f438617c + "/stream/" + this.f438615a;
    }

    public final java.lang.String g() {
        return this.f438617c + "/stream/" + this.f438615a + ".tmp";
    }

    public final void h(pn4.u0 u0Var) {
        yz5.l lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438619e, "current state trans from " + this.f438620f + " to " + u0Var);
        if (u0Var != this.f438620f && (lVar = this.f438622h) != null) {
            lVar.mo146xb9724478(u0Var);
        }
        this.f438620f = u0Var;
    }

    public final void i(java.lang.String str) {
        h(pn4.u0.f438765g);
        com.p314xaae8f345.mm.vfs.w6.h(f());
        com.p314xaae8f345.mm.vfs.w6.h(g());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f438619e, "trans error cause " + str);
    }
}
