package zl2;

/* loaded from: classes.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f555199d;

    /* renamed from: e, reason: collision with root package name */
    public int f555200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f555202g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f555203h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.u3 f555204i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f555205m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f555206n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.content.Context context, int i17, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f555201f = context;
        this.f555202g = i17;
        this.f555203h = i18;
        this.f555204i = u3Var;
        this.f555205m = c0Var;
        this.f555206n = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zl2.b1(this.f555201f, this.f555202g, this.f555203h, this.f555204i, this.f555205m, this.f555206n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zl2.b1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f555200e
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r12.f555199d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto Lc5
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.f555199d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L9c
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L70
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r45.my1 r13 = new r45.my1
            r13.<init>()
            db2.t4 r1 = db2.t4.f309704a
            r5 = 8334(0x208e, float:1.1678E-41)
            r45.kv0 r1 = r1.a(r5)
            r13.set(r4, r1)
            int r1 = r12.f555202g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.set(r3, r1)
            int r1 = r12.f555203h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.set(r2, r1)
            com.tencent.mm.modelbase.i r13 = r13.d()
            az2.j r13 = (az2.j) r13
            android.content.Context r6 = r12.f555201f
            r7 = 0
            r8 = 0
            r10 = 6
            r11 = 0
            r5 = r13
            az2.j.u(r5, r6, r7, r8, r10, r11)
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r1 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r12.f555200e = r4
            java.lang.Object r13 = xg2.g.b(r13, r1, r12)
            if (r13 != r0) goto L70
            return r0
        L70:
            r1 = r13
            xg2.h r1 = (xg2.h) r1
            if (r1 == 0) goto Lc5
            com.tencent.mm.storage.u3 r7 = r12.f555204i
            int r8 = r12.f555203h
            kotlin.jvm.internal.c0 r9 = r12.f555205m
            com.tencent.mm.ui.widget.dialog.k0 r10 = r12.f555206n
            boolean r13 = r1 instanceof xg2.i
            if (r13 == 0) goto L9c
            oz5.l r13 = r1.f535925a
            if (r13 != 0) goto L89
            oz5.l r13 = r12.mo48699x76847179()
        L89:
            zl2.a1 r11 = new zl2.a1
            r6 = 0
            r4 = r11
            r5 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.f555199d = r1
            r12.f555200e = r3
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r13, r11, r12)
            if (r13 != r0) goto L9c
            return r0
        L9c:
            if (r1 == 0) goto Lc5
            kotlinx.coroutines.p0 r13 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r13 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            boolean r3 = r1 instanceof xg2.b
            if (r3 == 0) goto Lc5
            if (r13 != 0) goto Lb0
            oz5.l r13 = r1.f535925a
            if (r13 != 0) goto Lb0
            oz5.l r13 = r12.mo48699x76847179()
        Lb0:
            zl2.z0 r3 = new zl2.z0
            r4 = 0
            android.content.Context r5 = r12.f555201f
            com.tencent.mm.ui.widget.dialog.k0 r6 = r12.f555206n
            r3.<init>(r1, r4, r5, r6)
            r12.f555199d = r1
            r12.f555200e = r2
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r13, r3, r12)
            if (r13 != r0) goto Lc5
            return r0
        Lc5:
            jz5.f0 r13 = jz5.f0.f384359a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.b1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
