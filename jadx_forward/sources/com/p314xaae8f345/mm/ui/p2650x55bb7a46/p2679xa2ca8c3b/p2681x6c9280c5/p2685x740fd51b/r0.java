package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes12.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f286384d;

    /* renamed from: e, reason: collision with root package name */
    public int f286385e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f286386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b11.f f286387g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 f286388h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(b11.f fVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 c22101xd1256332, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f286387g = fVar;
        this.f286388h = c22101xd1256332;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.r0 r0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.r0(this.f286387g, this.f286388h, interfaceC29045xdcb5ca57);
        r0Var.f286386f = obj;
        return r0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f286385e;
        b11.f fVar = this.f286387g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f286386f;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(fVar.m9578x3092e94f(), fVar.k());
            if (k17 == null) {
                throw new java.lang.IllegalStateException("preloadPrepareContext, msgInfo is null");
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.q0 q0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.q0(k17, null);
            this.f286386f = y0Var;
            this.f286384d = k17;
            this.f286385e = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, q0Var, this);
            if (obj == aVar) {
                return aVar;
            }
            f9Var = k17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f286384d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        t21.v2 v2Var = (t21.v2) obj;
        if (v2Var == null) {
            throw new java.lang.IllegalStateException("preloadPrepareContext, videoInfo is null");
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 c22101xd1256332 = this.f286388h;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h0 h0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h0(fVar, f9Var, v2Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332.o(c22101xd1256332, f9Var, v2Var));
        c22101xd1256332.f286268v = h0Var;
        return h0Var;
    }
}
