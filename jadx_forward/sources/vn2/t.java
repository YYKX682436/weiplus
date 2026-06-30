package vn2;

/* loaded from: classes2.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f519908d;

    /* renamed from: e, reason: collision with root package name */
    public int f519909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f519910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f519911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519912h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r45.qt2 qt2Var, so2.j5 j5Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519910f = qt2Var;
        this.f519911g = j5Var;
        this.f519912h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vn2.t(this.f519910f, this.f519911g, this.f519912h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vn2.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f519909e
            java.lang.String r2 = r10.f519912h
            so2.j5 r3 = r10.f519911g
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L31
            if (r1 == r7) goto L2d
            if (r1 == r5) goto L25
            if (r1 != r4) goto L1d
            java.lang.Object r0 = r10.f519908d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lad
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            java.lang.Object r1 = r10.f519908d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L91
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L72
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r45.zu2 r11 = new r45.zu2
            r11.<init>()
            db2.t4 r1 = db2.t4.f309704a
            r8 = 10460(0x28dc, float:1.4658E-41)
            r45.qt2 r9 = r10.f519910f
            r45.kv0 r1 = r1.b(r8, r9)
            r11.set(r7, r1)
            long r8 = r3.mo2128x1ed62e84()
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r11.set(r5, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r11.set(r4, r1)
            r1 = r3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r1
            java.lang.String r1 = r1.g0()
            r8 = 4
            r11.set(r8, r1)
            com.tencent.mm.modelbase.i r11 = r11.d()
            az2.j r11 = (az2.j) r11
            r10.f519909e = r7
            java.lang.Object r11 = xg2.g.d(r11, r6, r10, r7, r6)
            if (r11 != r0) goto L72
            return r0
        L72:
            r1 = r11
            xg2.h r1 = (xg2.h) r1
            boolean r11 = r1 instanceof xg2.i
            if (r11 == 0) goto L91
            oz5.l r11 = r1.f535925a
            if (r11 != 0) goto L81
            oz5.l r11 = r10.mo48699x76847179()
        L81:
            vn2.s r7 = new vn2.s
            r7.<init>(r1, r6, r2, r3)
            r10.f519908d = r1
            r10.f519909e = r5
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r11, r7, r10)
            if (r11 != r0) goto L91
            return r0
        L91:
            boolean r11 = r1 instanceof xg2.b
            if (r11 == 0) goto Lad
            oz5.l r11 = r1.f535925a
            if (r11 != 0) goto L9d
            oz5.l r11 = r10.mo48699x76847179()
        L9d:
            vn2.r r3 = new vn2.r
            r3.<init>(r1, r6, r2)
            r10.f519908d = r1
            r10.f519909e = r4
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r11, r3, r10)
            if (r11 != r0) goto Lad
            return r0
        Lad:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vn2.t.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
