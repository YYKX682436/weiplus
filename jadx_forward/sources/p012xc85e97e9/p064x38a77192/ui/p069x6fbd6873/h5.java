package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class h5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f92112d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f92113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f92114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f92115g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f92116h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1065xff837ba9 f92117i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f92118m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, n0.b4 b4Var, p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1065xff837ba9 c1065xff837ba9, android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f92114f = h0Var;
        this.f92115g = b4Var;
        this.f92116h = yVar;
        this.f92117i = c1065xff837ba9;
        this.f92118m = view;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h5 h5Var = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h5(this.f92114f, this.f92115g, this.f92116h, this.f92117i, this.f92118m, interfaceC29045xdcb5ca57);
        h5Var.f92113e = obj;
        return h5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r14.f92112d
            jz5.f0 r2 = jz5.f0.f384359a
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r3 = r14.f92117i
            androidx.lifecycle.y r4 = r14.f92116h
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L24
            if (r1 != r5) goto L1c
            java.lang.Object r0 = r14.f92113e
            kotlinx.coroutines.r2 r0 = (p3325xe03a0797.p3326xc267989b.r2) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)     // Catch: java.lang.Throwable -> L19
            goto L98
        L19:
            r15 = move-exception
            goto Lac
        L1c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            java.lang.Object r15 = r14.f92113e
            r7 = r15
            kotlinx.coroutines.y0 r7 = (p3325xe03a0797.p3326xc267989b.y0) r7
            kotlin.jvm.internal.h0 r15 = r14.f92114f     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r15 = r15.f391656d     // Catch: java.lang.Throwable -> Laa
            androidx.compose.ui.platform.o3 r15 = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.o3) r15     // Catch: java.lang.Throwable -> Laa
            if (r15 == 0) goto L6a
            android.view.View r1 = r14.f92118m     // Catch: java.lang.Throwable -> Laa
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> Laa
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = "context.applicationContext"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r8)     // Catch: java.lang.Throwable -> Laa
            kotlinx.coroutines.flow.f3 r1 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k5.a(r1)     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r8 = r1.mo144003x754a37bb()     // Catch: java.lang.Throwable -> Laa
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> Laa
            float r8 = r8.floatValue()     // Catch: java.lang.Throwable -> Laa
            n0.v2 r9 = r15.f92209d     // Catch: java.lang.Throwable -> Laa
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch: java.lang.Throwable -> Laa
            n0.q4 r9 = (n0.q4) r9     // Catch: java.lang.Throwable -> Laa
            r9.mo148714x53d8522f(r8)     // Catch: java.lang.Throwable -> Laa
            r8 = 0
            r9 = 0
            androidx.compose.ui.platform.g5 r10 = new androidx.compose.ui.platform.g5     // Catch: java.lang.Throwable -> Laa
            r10.<init>(r1, r15, r6)     // Catch: java.lang.Throwable -> Laa
            r11 = 3
            r12 = 0
            kotlinx.coroutines.r2 r15 = p3325xe03a0797.p3326xc267989b.l.d(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Laa
            goto L6b
        L6a:
            r15 = r6
        L6b:
            n0.b4 r1 = r14.f92115g     // Catch: java.lang.Throwable -> La5
            r14.f92113e = r15     // Catch: java.lang.Throwable -> La5
            r14.f92112d = r5     // Catch: java.lang.Throwable -> La5
            r1.getClass()     // Catch: java.lang.Throwable -> La5
            n0.z3 r7 = new n0.z3     // Catch: java.lang.Throwable -> La5
            r7.<init>(r1, r6)     // Catch: java.lang.Throwable -> La5
            oz5.l r8 = r14.mo48699x76847179()     // Catch: java.lang.Throwable -> La5
            n0.r2 r8 = n0.s2.a(r8)     // Catch: java.lang.Throwable -> La5
            n0.x3 r9 = new n0.x3     // Catch: java.lang.Throwable -> La5
            r9.<init>(r1, r7, r8, r6)     // Catch: java.lang.Throwable -> La5
            n0.h r1 = r1.f414977a     // Catch: java.lang.Throwable -> La5
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.l.g(r1, r9, r14)     // Catch: java.lang.Throwable -> La5
            if (r1 != r0) goto L8f
            goto L90
        L8f:
            r1 = r2
        L90:
            if (r1 != r0) goto L93
            goto L94
        L93:
            r1 = r2
        L94:
            if (r1 != r0) goto L97
            return r0
        L97:
            r0 = r15
        L98:
            if (r0 == 0) goto L9d
            p3325xe03a0797.p3326xc267989b.p2.a(r0, r6, r5, r6)
        L9d:
            androidx.lifecycle.o r15 = r4.mo273xed6858b4()
            r15.c(r3)
            return r2
        La5:
            r0 = move-exception
            r13 = r0
            r0 = r15
            r15 = r13
            goto Lac
        Laa:
            r15 = move-exception
            r0 = r6
        Lac:
            if (r0 == 0) goto Lb1
            p3325xe03a0797.p3326xc267989b.p2.a(r0, r6, r5, r6)
        Lb1:
            androidx.lifecycle.o r0 = r4.mo273xed6858b4()
            r0.c(r3)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h5.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
