package cc1;

/* loaded from: classes7.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f121966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cc1.l f121967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(org.json.JSONObject jSONObject, cc1.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f121966d = jSONObject;
        this.f121967e = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cc1.k(this.f121966d, this.f121967e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cc1.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Object opt = this.f121966d.opt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        boolean z17 = opt instanceof java.nio.ByteBuffer;
        cc1.l lVar = this.f121967e;
        if (z17) {
            lVar.f121968d.update((java.nio.ByteBuffer) opt);
        } else {
            if (!(opt instanceof java.lang.String)) {
                throw new cc1.n(jc1.f.f380452h, "signature not string or arraybuffer");
            }
            java.security.Signature signature = lVar.f121968d;
            byte[] bytes = ((java.lang.String) opt).getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            signature.update(bytes);
        }
        return new java.util.HashMap();
    }
}
