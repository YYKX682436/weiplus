package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f225290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f225291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.s0 f225293g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(boolean z17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.s0 s0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f225291e = z17;
        this.f225292f = str;
        this.f225293g = s0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r0(this.f225291e, this.f225292f, this.f225293g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f225290d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.s0 s0Var = this.f225293g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean z17 = this.f225291e;
            java.lang.String designerId = this.f225292f;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("emoticonGetEmoticonDesigner", "force");
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(designerId, "$designerId");
                this.f225290d = 1;
                obj = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var).cj(designerId, this);
                if (obj == aVar) {
                    return aVar;
                }
                s0Var.f224976f.c((org.json.JSONObject) obj, false);
            } else {
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var2 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(designerId, "$designerId");
                this.f225290d = 2;
                obj = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var2).bj(designerId, this);
                if (obj == aVar) {
                    return aVar;
                }
                s0Var.f224976f.c((org.json.JSONObject) obj, false);
            }
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s0Var.f224976f.c((org.json.JSONObject) obj, false);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s0Var.f224976f.c((org.json.JSONObject) obj, false);
        }
        return jz5.f0.f384359a;
    }
}
