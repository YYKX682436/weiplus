package xe2;

/* loaded from: classes3.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f535376d;

    /* renamed from: e, reason: collision with root package name */
    public int f535377e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f535378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q26.n f535379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xe2.h0 f535380h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(q26.n nVar, xe2.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535379g = nVar;
        this.f535380h = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        xe2.d0 d0Var = new xe2.d0(this.f535379g, this.f535380h, interfaceC29045xdcb5ca57);
        d0Var.f535378f = obj;
        return d0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xe2.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002c A[SYNTHETIC] */
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
            int r1 = r8.f535377e
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r8.f535376d
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r8.f535378f
            kotlinx.coroutines.y0 r3 = (p3325xe03a0797.p3326xc267989b.y0) r3
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L2b
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.Object r9 = r8.f535378f
            kotlinx.coroutines.y0 r9 = (p3325xe03a0797.p3326xc267989b.y0) r9
            q26.n r1 = r8.f535379g
            java.util.Iterator r1 = r1.mo144672x467c086e()
            r3 = r9
        L2b:
            r9 = r8
        L2c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L81
            java.lang.Object r4 = r1.next()
            r45.ch1 r4 = (r45.ch1) r4
            r45.cj1 r5 = new r45.cj1
            r5.<init>()
            r6 = 4
            com.tencent.mm.protobuf.g r4 = r4.m75934xbce7f2f(r6)
            r6 = 0
            if (r4 == 0) goto L4a
            byte[] r4 = r4.g()
            goto L4b
        L4a:
            r4 = r6
        L4b:
            if (r4 != 0) goto L4f
        L4d:
            r5 = r6
            goto L60
        L4f:
            r5.mo11468x92b714fd(r4)     // Catch: java.lang.Exception -> L53
            goto L60
        L53:
            r4 = move-exception
            java.lang.String r5 = ""
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r7 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r7, r5, r4)
            goto L4d
        L60:
            if (r5 == 0) goto L6a
            r4 = 3
            com.tencent.mm.protobuf.f r4 = r5.m75936x14adae67(r4)
            r6 = r4
            r45.kv1 r6 = (r45.kv1) r6
        L6a:
            if (r6 == 0) goto L2c
            boolean r4 = p3325xe03a0797.p3326xc267989b.z0.h(r3)
            if (r4 == 0) goto L2c
            dk2.u7 r4 = dk2.u7.f315714a
            r9.f535378f = r3
            r9.f535376d = r1
            r9.f535377e = r2
            java.lang.Object r4 = r4.k(r6, r9)
            if (r4 != r0) goto L2c
            return r0
        L81:
            xe2.c0 r0 = new xe2.c0
            xe2.h0 r1 = r9.f535380h
            r0.<init>(r1)
            q26.n r9 = r9.f535379g
            q26.n r9 = q26.h0.o(r9, r0)
            java.util.List r9 = q26.h0.z(r9)
            java.lang.String r0 = r1.f535399c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "#dealWithMsgList after trans to giftShowInfo. size="
            r2.<init>(r3)
            int r3 = r9.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)
            gk2.e r0 = r1.f526800a
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            mm2.c1 r0 = (mm2.c1) r0
            com.tencent.mm.plugin.finder.live.util.o1 r0 = r0.f410339g
            com.tencent.mm.plugin.finder.live.util.j1 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) r0
            r0.a(r9)
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.d0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
