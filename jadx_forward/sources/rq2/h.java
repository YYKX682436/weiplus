package rq2;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f480361d;

    /* renamed from: e, reason: collision with root package name */
    public int f480362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f480363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.jp1 f480364g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r45.qt2 qt2Var, r45.jp1 jp1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480363f = qt2Var;
        this.f480364g = jp1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rq2.h(this.f480363f, this.f480364g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rq2.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f480362e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r0 = r8.f480361d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto La6
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.f480361d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L8a
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L6b
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r45.g22 r9 = new r45.g22
            r9.<init>()
            db2.t4 r1 = db2.t4.f309704a
            r6 = 11815(0x2e27, float:1.6556E-41)
            r45.qt2 r7 = r8.f480363f
            r45.kv0 r1 = r1.b(r6, r7)
            r9.set(r4, r1)
            r1 = 4
            java.util.LinkedList r1 = r9.m75941xfb821914(r1)
            r45.jp1 r6 = r8.f480364g
            r1.add(r6)
            zl2.q4 r1 = zl2.q4.f555466a
            r45.rn1 r1 = zl2.q4.d(r1, r5, r5, r2, r5)
            r9.set(r3, r1)
            java.lang.String r1 = "FinderLiveNewSquareStateReporter"
            java.lang.String r6 = " createCgi for enter"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)
            com.tencent.mm.modelbase.i r9 = r9.d()
            az2.j r9 = (az2.j) r9
            r8.f480362e = r4
            java.lang.Object r9 = xg2.g.d(r9, r5, r8, r4, r5)
            if (r9 != r0) goto L6b
            return r0
        L6b:
            r1 = r9
            xg2.h r1 = (xg2.h) r1
            boolean r9 = r1 instanceof xg2.i
            if (r9 == 0) goto L8a
            oz5.l r9 = r1.f535925a
            if (r9 != 0) goto L7a
            oz5.l r9 = r8.mo48699x76847179()
        L7a:
            rq2.g r4 = new rq2.g
            r4.<init>(r1, r5)
            r8.f480361d = r1
            r8.f480362e = r3
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.l.g(r9, r4, r8)
            if (r9 != r0) goto L8a
            return r0
        L8a:
            boolean r9 = r1 instanceof xg2.b
            if (r9 == 0) goto La6
            oz5.l r9 = r1.f535925a
            if (r9 != 0) goto L96
            oz5.l r9 = r8.mo48699x76847179()
        L96:
            rq2.f r3 = new rq2.f
            r3.<init>(r1, r5)
            r8.f480361d = r1
            r8.f480362e = r2
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.l.g(r9, r3, r8)
            if (r9 != r0) goto La6
            return r0
        La6:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rq2.h.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
