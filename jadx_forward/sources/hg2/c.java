package hg2;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hg2.h f362872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.vf f362873f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hg2.h hVar, dk2.vf vfVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f362872e = hVar;
        this.f362873f = vfVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hg2.c(this.f362872e, this.f362873f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hg2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r10 == r0) goto L20;
     */
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
            int r1 = r9.f362871d
            jz5.f0 r2 = jz5.f0.f384359a
            dk2.vf r3 = r9.f362873f
            r4 = 1
            hg2.h r5 = r9.f362872e
            if (r1 == 0) goto L1b
            if (r1 != r4) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L83
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            com.tencent.mm.sdk.platformtools.b4 r10 = r5.f362889q
            r10.d()
            android.widget.ImageView r10 = r5.f362887o
            r45.mq1 r1 = r3.f315786d
            if (r1 == 0) goto L2f
            java.lang.String r1 = r1.m75945x2fec8307(r4)
            if (r1 != 0) goto L31
        L2f:
            java.lang.String r1 = ""
        L31:
            r9.f362871d = r4
            r5.getClass()
            if (r10 != 0) goto L39
            goto L7f
        L39:
            oz5.n r4 = new oz5.n
            kotlin.coroutines.Continuation r6 = pz5.f.b(r9)
            r4.<init>(r6)
            pf5.u r6 = pf5.u.f435469a
            java.lang.Class<zy2.b6> r7 = zy2.b6.class
            pf5.v r6 = r6.e(r7)
            java.lang.Class<mn2.i4> r7 = mn2.i4.class
            pf5.c r6 = r6.c(r7)
            mn2.i4 r6 = (mn2.i4) r6
            mn2.g3 r6 = (mn2.g3) r6
            jz5.g r6 = r6.H
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.mo141623x754a37bb()
            yo0.e r6 = (yo0.e) r6
            mn2.d1 r7 = new mn2.d1
            r7.<init>(r6)
            mn2.q3 r6 = new mn2.q3
            com.tencent.mm.plugin.finder.storage.y90 r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f
            r6.<init>(r1, r8)
            wo0.c r6 = r7.a(r6)
            hg2.f r7 = new hg2.f
            r7.<init>(r10, r5, r1, r4)
            r6.f529406d = r7
            r6.f()
            java.lang.Object r10 = r4.a()
            if (r10 != r0) goto L7f
            goto L80
        L7f:
            r10 = r2
        L80:
            if (r10 != r0) goto L83
            return r0
        L83:
            int r10 = r3.f315784b
            r5.getClass()
            int r0 = c01.id.e()
            r1 = 0
            if (r0 <= r10) goto L91
            r3 = r1
            goto L93
        L91:
            int r3 = r10 - r0
        L93:
            r5.f362888p = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "server time = "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", expire time = "
            r3.append(r0)
            r3.append(r10)
            java.lang.String r10 = ", set remaining time to "
            r3.append(r10)
            int r10 = r5.f362888p
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            java.lang.String r0 = r5.f362885m
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r10)
            android.view.ViewGroup r10 = r5.f362886n
            if (r10 != 0) goto Lbf
            goto Lc2
        Lbf:
            r10.setVisibility(r1)
        Lc2:
            com.tencent.mm.sdk.platformtools.b4 r10 = r5.f362889q
            r0 = 1000(0x3e8, double:4.94E-321)
            r10.c(r0, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hg2.c.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
