package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.z f152501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f152503f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p947xba6de98f.z zVar, java.lang.String str, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f152501d = zVar;
        this.f152502e = str;
        this.f152503f = i2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p947xba6de98f.h(this.f152501d, this.f152502e, this.f152503f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p947xba6de98f.h hVar = (com.p314xaae8f345.mm.p947xba6de98f.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p947xba6de98f.z zVar = this.f152501d;
        java.util.concurrent.ConcurrentHashMap Y6 = zVar.Y6();
        com.p314xaae8f345.mm.p947xba6de98f.g gVar = new com.p314xaae8f345.mm.p947xba6de98f.g(zVar);
        java.lang.String str = this.f152502e;
        com.p314xaae8f345.mm.p947xba6de98f.e eVar = (com.p314xaae8f345.mm.p947xba6de98f.e) Y6.remove(str);
        int intValue = eVar != null ? ((java.lang.Number) gVar.mo149xb9724478(str, eVar)).intValue() : -1;
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = new com.p314xaae8f345.mm.p947xba6de98f.n1(com.p314xaae8f345.mm.p947xba6de98f.m1.f152618q, str);
        n1Var.f152638c = intValue;
        zVar.W6(this.f152503f, n1Var);
        return jz5.f0.f384359a;
    }
}
