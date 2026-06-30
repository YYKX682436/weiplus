package uc5;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f508035d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f508036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f508037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f508038g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ uc5.n f508039h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f508040i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f508041m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ uc5.d f508042n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f508043o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.View view, java.lang.String str, uc5.n nVar, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, uc5.d dVar, java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f508037f = view;
        this.f508038g = str;
        this.f508039h = nVar;
        this.f508040i = context;
        this.f508041m = f9Var;
        this.f508042n = dVar;
        this.f508043o = obj;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        uc5.j jVar = new uc5.j(this.f508037f, this.f508038g, this.f508039h, this.f508040i, this.f508041m, this.f508042n, this.f508043o, interfaceC29045xdcb5ca57);
        jVar.f508036e = obj;
        return jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((uc5.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r13.f508035d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L27
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L9f
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            java.lang.Object r1 = r13.f508036e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L75
        L27:
            java.lang.Object r1 = r13.f508036e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L42
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            java.lang.Object r14 = r13.f508036e
            kotlinx.coroutines.y0 r14 = (p3325xe03a0797.p3326xc267989b.y0) r14
            r13.f508036e = r14
            r13.f508035d = r6
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.g4.a(r13)
            if (r1 != r0) goto L41
            return r0
        L41:
            r1 = r14
        L42:
            android.view.View r14 = r13.f508037f
            r6 = 2131314814(0x7f09487e, float:1.8248064E38)
            java.lang.Object r14 = r14.getTag(r6)
            boolean r6 = r14 instanceof java.lang.String
            if (r6 == 0) goto L52
            java.lang.String r14 = (java.lang.String) r14
            goto L53
        L52:
            r14 = r3
        L53:
            java.lang.String r6 = r13.f508038g
            boolean r14 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r14, r6)
            if (r14 != 0) goto L5c
            return r2
        L5c:
            p3325xe03a0797.p3326xc267989b.z0.g(r1)
            java.lang.String r14 = "$context"
            android.content.Context r6 = r13.f508040i
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r14)
            r13.f508036e = r1
            r13.f508035d = r5
            uc5.n r14 = r13.f508039h
            com.tencent.mm.storage.f9 r5 = r13.f508041m
            java.lang.Object r14 = r14.w(r6, r5, r13)
            if (r14 != r0) goto L75
            return r0
        L75:
            r11 = r14
            uc5.r0 r11 = (uc5.r0) r11
            uc5.d r14 = r13.f508042n
            r14.f508010e = r11
            p3325xe03a0797.p3326xc267989b.z0.g(r1)
            kotlinx.coroutines.p0 r14 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r14 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            uc5.i r1 = new uc5.i
            android.view.View r6 = r13.f508037f
            java.lang.String r7 = r13.f508038g
            uc5.n r8 = r13.f508039h
            android.content.Context r9 = r13.f508040i
            java.lang.Object r10 = r13.f508043o
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.f508036e = r3
            r13.f508035d = r4
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.l.g(r14, r1, r13)
            if (r14 != r0) goto L9f
            return r0
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: uc5.j.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
