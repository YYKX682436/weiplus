package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class sb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ub f282905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ub ubVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f282905d = ubVar;
        this.f282906e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.sb(this.f282905d, this.f282906e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.sb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str = this.f282906e;
        this.f282905d.getClass();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f5 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.f(str, c19767x257d7f, c19767x257d7f2, c19767x257d7f3, c19767x257d7f4, c19767x257d7f5);
        boolean z17 = true;
        if (!(f17 != null && r26.n0.B(f17, "hevc", true))) {
            if (!(f17 != null && r26.n0.B(f17, "H.265", true))) {
                if (!(f17 != null && r26.n0.B(f17, "h265", true))) {
                    z17 = false;
                }
            }
        }
        java.lang.String str2 = z17 ? "H.265" : "H.264";
        int i17 = c19767x257d7f5.f38864x6ac9171;
        int i18 = c19767x257d7f4.f38864x6ac9171;
        int i19 = c19767x257d7f2.f38864x6ac9171;
        int i27 = c19767x257d7f3.f38864x6ac9171;
        int i28 = c19767x257d7f.f38864x6ac9171;
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ob(str2, i17, i18, i19, i27, i28 > 0 ? i28 / 1000 : 0);
    }
}
