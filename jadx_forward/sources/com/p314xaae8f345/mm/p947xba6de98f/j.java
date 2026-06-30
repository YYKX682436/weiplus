package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.z f152542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f152544f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p947xba6de98f.z zVar, java.lang.String str, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f152542d = zVar;
        this.f152543e = str;
        this.f152544f = i2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p947xba6de98f.j(this.f152542d, this.f152543e, this.f152544f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p947xba6de98f.j jVar = (com.p314xaae8f345.mm.p947xba6de98f.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p947xba6de98f.z zVar = this.f152542d;
        java.util.concurrent.ConcurrentHashMap Z6 = zVar.Z6();
        com.p314xaae8f345.mm.p947xba6de98f.i iVar = new com.p314xaae8f345.mm.p947xba6de98f.i(zVar);
        java.lang.String str = this.f152543e;
        com.p314xaae8f345.mm.p947xba6de98f.e eVar = (com.p314xaae8f345.mm.p947xba6de98f.e) Z6.remove(str);
        int intValue = eVar != null ? ((java.lang.Number) iVar.mo149xb9724478(str, eVar)).intValue() : -1;
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = new com.p314xaae8f345.mm.p947xba6de98f.n1(com.p314xaae8f345.mm.p947xba6de98f.m1.f152623v, str);
        n1Var.f152638c = intValue;
        zVar.W6(this.f152544f, n1Var);
        return jz5.f0.f384359a;
    }
}
