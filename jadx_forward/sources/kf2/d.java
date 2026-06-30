package kf2;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f388742d;

    /* renamed from: e, reason: collision with root package name */
    public int f388743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f388744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kf2.e f388745g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f388746h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f388747i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.Object obj, kf2.e eVar, long j17, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f388744f = obj;
        this.f388745g = eVar;
        this.f388746h = j17;
        this.f388747i = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kf2.d(this.f388744f, this.f388745g, this.f388746h, this.f388747i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kf2.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f388743e
            r3 = 3
            r4 = 2
            jz5.f0 r5 = jz5.f0.f384359a
            r6 = 1
            if (r2 == 0) goto L33
            if (r2 == r6) goto L2d
            if (r2 == r4) goto L24
            if (r2 != r3) goto L1c
            java.lang.Object r1 = r0.f388742d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r19)
            goto Lcf
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L24:
            java.lang.Object r2 = r0.f388742d
            xg2.h r2 = (xg2.h) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r19)
            goto Laa
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r19)
            r2 = r19
            goto L82
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r19)
            kf2.w r2 = kf2.x.f388843c
            java.lang.String r7 = "audience_username"
            java.lang.Object r8 = r0.f388744f
            java.lang.String r14 = r2.c(r8, r7)
            if (r14 != 0) goto L43
            return r5
        L43:
            java.lang.String r7 = "enable"
            java.lang.Boolean r2 = r2.a(r8, r7)
            if (r2 == 0) goto Lcf
            boolean r16 = r2.booleanValue()
            ke2.j r2 = new ke2.j
            kf2.e r7 = r0.f388745g
            df2.k r8 = r7.f388844a
            java.lang.Class<mm2.e1> r9 = mm2.e1.class
            androidx.lifecycle.c1 r8 = r8.m56788xbba4bfc0(r9)
            mm2.e1 r8 = (mm2.e1) r8
            r45.nw1 r8 = r8.f410521r
            r10 = 0
            long r10 = r8.m75942xfb822ef2(r10)
            df2.k r7 = r7.f388844a
            androidx.lifecycle.c1 r7 = r7.m56788xbba4bfc0(r9)
            mm2.e1 r7 = (mm2.e1) r7
            long r12 = r7.f410516m
            r15 = 2
            kf2.a r17 = new kf2.a
            r17.<init>()
            r9 = r2
            r9.<init>(r10, r12, r14, r15, r16, r17)
            r0.f388743e = r6
            r7 = 0
            java.lang.Object r2 = xg2.g.d(r2, r7, r0, r6, r7)
            if (r2 != r1) goto L82
            return r1
        L82:
            xg2.h r2 = (xg2.h) r2
            kf2.e r9 = r0.f388745g
            long r10 = r0.f388746h
            int r12 = r0.f388747i
            boolean r6 = r2 instanceof xg2.i
            if (r6 == 0) goto Laa
            oz5.l r6 = r2.f535925a
            if (r6 != 0) goto L96
            oz5.l r6 = r18.mo48699x76847179()
        L96:
            r13 = r6
            kf2.c r14 = new kf2.c
            r8 = 0
            r6 = r14
            r7 = r2
            r6.<init>(r7, r8, r9, r10, r12)
            r0.f388742d = r2
            r0.f388743e = r4
            java.lang.Object r4 = p3325xe03a0797.p3326xc267989b.l.g(r13, r14, r0)
            if (r4 != r1) goto Laa
            return r1
        Laa:
            kf2.e r9 = r0.f388745g
            long r10 = r0.f388746h
            int r12 = r0.f388747i
            boolean r4 = r2 instanceof xg2.b
            if (r4 == 0) goto Lcf
            oz5.l r4 = r2.f535925a
            if (r4 != 0) goto Lbc
            oz5.l r4 = r18.mo48699x76847179()
        Lbc:
            kf2.b r13 = new kf2.b
            r8 = 0
            r6 = r13
            r7 = r2
            r6.<init>(r7, r8, r9, r10, r12)
            r0.f388742d = r2
            r0.f388743e = r3
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.l.g(r4, r13, r0)
            if (r2 != r1) goto Lcf
            return r1
        Lcf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf2.d.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
