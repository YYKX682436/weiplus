package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class ul extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0 f211462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f211463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d f211464f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0 abstractC15091x20e3bca0, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d c15099x5c64104d, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f211462d = abstractC15091x20e3bca0;
        this.f211463e = arrayList;
        this.f211464f = c15099x5c64104d;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ul(this.f211462d, this.f211463e, this.f211464f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ul ulVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ul) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        ulVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0 abstractC15091x20e3bca0 = this.f211462d;
        abstractC15091x20e3bca0.f210354t.clear();
        java.util.ArrayList arrayList = abstractC15091x20e3bca0.f210354t;
        java.util.ArrayList arrayList2 = this.f211463e;
        arrayList.addAll(arrayList2);
        this.f211464f.O6(arrayList2);
        return jz5.f0.f384359a;
    }
}
