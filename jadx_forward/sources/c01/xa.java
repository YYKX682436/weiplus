package c01;

/* loaded from: classes2.dex */
public final class xa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f119098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f119099e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new c01.xa(this.f119099e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((c01.xa) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0079, code lost:
    
        if (r14.f452315e > 0) goto L19;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r0 = "response: "
            pz5.a r1 = pz5.a.f440719d
            int r2 = r13.f119098d
            r3 = 0
            java.lang.String r4 = "MicroMsg.RelatedWordDataStore"
            r5 = 1
            if (r2 == 0) goto L1c
            if (r2 != r5) goto L14
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)     // Catch: rm0.j -> L12
            goto L64
        L12:
            r14 = move-exception
            goto L7d
        L14:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            gm0.b0 r14 = gm0.j1.u()
            com.tencent.mm.storage.n3 r14 = r14.c()
            r2 = 0
            r6 = 274436(0x43004, float:3.84567E-40)
            java.lang.Object r14 = r14.l(r6, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "getQueryIsToIntercept >> region: "
            r2.<init>(r6)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)
            java.lang.String r2 = "CN"
            boolean r14 = r14.equals(r2)
            if (r14 != 0) goto L4e
            java.lang.String r14 = "no CN to intercept"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r14)
            goto L91
        L4e:
            c01.p9 r6 = new c01.p9     // Catch: rm0.j -> L12
            java.lang.String r14 = r13.f119099e     // Catch: rm0.j -> L12
            r6.<init>(r14, r2)     // Catch: rm0.j -> L12
            r7 = 0
            r9 = 0
            r11 = 3
            r12 = 0
            r13.f119098d = r5     // Catch: rm0.j -> L12
            r10 = r13
            java.lang.Object r14 = rm0.h.a(r6, r7, r9, r10, r11, r12)     // Catch: rm0.j -> L12
            if (r14 != r1) goto L64
            return r1
        L64:
            r45.bi4 r14 = (r45.bi4) r14     // Catch: rm0.j -> L12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: rm0.j -> L12
            r1.<init>(r0)     // Catch: rm0.j -> L12
            int r0 = r14.f452315e     // Catch: rm0.j -> L12
            r1.append(r0)     // Catch: rm0.j -> L12
            java.lang.String r0 = r1.toString()     // Catch: rm0.j -> L12
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)     // Catch: rm0.j -> L12
            int r14 = r14.f452315e     // Catch: rm0.j -> L12
            if (r14 <= 0) goto L91
        L7b:
            r3 = r5
            goto L91
        L7d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getQueryIsToIntercept >> exception， "
            r0.<init>(r1)
            java.lang.String r14 = r14.f478959g
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r14)
            goto L7b
        L91:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.xa.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
