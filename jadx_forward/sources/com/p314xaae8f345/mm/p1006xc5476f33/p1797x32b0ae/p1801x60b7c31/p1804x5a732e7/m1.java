package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f225208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f225210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f225211g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225212h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f225213i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n1 f225214m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(int i17, long j17, int i18, java.lang.String str, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n1 n1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f225209e = i17;
        this.f225210f = j17;
        this.f225211g = i18;
        this.f225212h = str;
        this.f225213i = i19;
        this.f225214m = n1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m1(this.f225209e, this.f225210f, this.f225211g, this.f225212h, this.f225213i, this.f225214m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f225208d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
            int i18 = this.f225209e;
            long j17 = this.f225210f;
            int i19 = this.f225211g;
            java.lang.String reqBufStr = this.f225212h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(reqBufStr, "$reqBufStr");
            int i27 = this.f225213i;
            this.f225208d = 1;
            obj = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var).hj(i18, j17, i19, reqBufStr, i27, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f225214m.f224976f.c((org.json.JSONObject) obj, false);
        return jz5.f0.f384359a;
    }
}
