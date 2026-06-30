package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 f146868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f146870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f146868d = b1Var;
        this.f146869e = str;
        this.f146870f = f9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.a0(this.f146868d, this.f146869e, this.f146870f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var = this.f146868d;
        java.lang.String str = this.f146869e;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = false;
        try {
            java.util.List oj6 = b1Var.oj(str, this.f146870f.mo78012x3fdd41df());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "fetchNextBatch loaded " + oj6.size() + " messages talker=" + str);
            if (oj6.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "fetchNextBatch no more messages");
            } else {
                b1Var.f146888r.addAll(oj6);
                z17 = true;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRecordsTtsService", "fetchNextBatch error talker=" + str, e17);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
