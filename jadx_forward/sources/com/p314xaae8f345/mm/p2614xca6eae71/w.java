package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class w extends qz5.l implements yz5.p {
    public w(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2614xca6eae71.w(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p2614xca6eae71.w wVar = new com.p314xaae8f345.mm.p2614xca6eae71.w((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        wVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (com.p314xaae8f345.mm.p2614xca6eae71.c0.f274762e == null) {
            com.p314xaae8f345.mm.p2614xca6eae71.c0.f274762e = com.p314xaae8f345.mm.p2614xca6eae71.c0.a(com.p314xaae8f345.mm.p2614xca6eae71.c0.f274758a);
        }
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = com.p314xaae8f345.mm.p2614xca6eae71.c0.f274761d;
        if (((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).a()) {
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.c.c(dVar, null, 1, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiOcrService", "resume successfully");
        return jz5.f0.f384359a;
    }
}
