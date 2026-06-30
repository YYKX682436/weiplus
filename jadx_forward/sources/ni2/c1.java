package ni2;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418794d;

    /* renamed from: e, reason: collision with root package name */
    public int f418795e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ni2.f1 f418797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418798h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ni2.f1 f1Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f418797g = f1Var;
        this.f418798h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ni2.c1 c1Var = new ni2.c1(this.f418797g, this.f418798h, interfaceC29045xdcb5ca57);
        c1Var.f418796f = obj;
        return c1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ni2.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f418795e
            jz5.f0 r2 = jz5.f0.f384359a
            ni2.f1 r3 = r9.f418797g
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L35
            if (r1 == r6) goto L29
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L8d
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f418796f
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L72
        L29:
            java.lang.Object r1 = r9.f418794d
            ni2.f1 r1 = (ni2.f1) r1
            java.lang.Object r6 = r9.f418796f
            kotlinx.coroutines.y0 r6 = (p3325xe03a0797.p3326xc267989b.y0) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L54
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Object r10 = r9.f418796f
            kotlinx.coroutines.y0 r10 = (p3325xe03a0797.p3326xc267989b.y0) r10
            xh2.a r1 = r3.f418829q
            if (r1 == 0) goto L74
            lj2.x0 r8 = r3.f418825m
            r9.f418796f = r10
            r9.f418794d = r3
            r9.f418795e = r6
            java.lang.String r6 = r9.f418798h
            java.lang.Object r1 = r8.O(r1, r6, r9)
            if (r1 != r0) goto L51
            return r0
        L51:
            r6 = r10
            r10 = r1
            r1 = r3
        L54:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L72
            kotlinx.coroutines.p0 r10 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r10 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            ni2.a1 r8 = new ni2.a1
            r8.<init>(r1, r7)
            r9.f418796f = r6
            r9.f418794d = r7
            r9.f418795e = r5
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r8, r9)
            if (r10 != r0) goto L72
            return r0
        L72:
            r10 = r2
            goto L75
        L74:
            r10 = r7
        L75:
            if (r10 != 0) goto L8d
            kotlinx.coroutines.p0 r10 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r10 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            ni2.b1 r1 = new ni2.b1
            r1.<init>(r3, r7)
            r9.f418796f = r7
            r9.f418794d = r7
            r9.f418795e = r4
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r1, r9)
            if (r10 != r0) goto L8d
            return r0
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ni2.c1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
