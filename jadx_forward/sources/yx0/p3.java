package yx0;

/* loaded from: classes5.dex */
public final class p3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f549081f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(yx0.b8 b8Var, java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549079d = b8Var;
        this.f549080e = str;
        this.f549081f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.p3(this.f549079d, this.f549080e, this.f549081f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.p3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            yx0.b8 r7 = r6.f549079d
            yx0.v r7 = r7.f548725s
            int r7 = r7.ordinal()
            r0 = 2
            java.lang.String r1 = "toggleSubtitle >> but state is "
            java.lang.String r2 = "MicroMsg.ShootComposingCorePlugin"
            r3 = 1
            r4 = 0
            if (r7 == r0) goto L2d
            switch(r7) {
                case 6: goto L2d;
                case 7: goto L2d;
                case 8: goto L2d;
                case 9: goto L2d;
                case 10: goto L2d;
                case 11: goto L2d;
                default: goto L19;
            }
        L19:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            yx0.b8 r0 = r6.f549079d
            yx0.v r0 = r0.f548725s
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r7)
            goto L3a
        L2d:
            yx0.n3 r7 = new yx0.n3
            yx0.b8 r0 = r6.f549079d
            r7.<init>(r0, r4)
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.l.f(r4, r7, r3, r4)
            jz5.f0 r7 = (jz5.f0) r7
        L3a:
            yx0.b8 r7 = r6.f549079d
            yx0.v r7 = r7.f548725s
            yx0.v r0 = yx0.v.f549228f
            jz5.f0 r5 = jz5.f0.f384359a
            if (r7 != r0) goto L53
            yx0.o3 r7 = new yx0.o3
            boolean r0 = r6.f549081f
            java.lang.String r1 = r6.f549080e
            yx0.b8 r2 = r6.f549079d
            r7.<init>(r0, r1, r2, r4)
            p3325xe03a0797.p3326xc267989b.l.f(r4, r7, r3, r4)
            return r5
        L53:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            yx0.b8 r0 = r6.f549079d
            yx0.v r0 = r0.f548725s
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r7)
            yx0.b8 r7 = r6.f549079d
            mx0.z r7 = r7.f548710d
            java.lang.String r0 = r6.f549080e
            boolean r1 = r6.f549081f
            r2 = 0
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout r7 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) r7
            r7.H0(r0, r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.p3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
