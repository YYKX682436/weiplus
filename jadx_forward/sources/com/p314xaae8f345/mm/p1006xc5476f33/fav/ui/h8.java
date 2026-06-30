package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class h8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 f182669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t72.a f182671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182672g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f182673h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var, int i17, t72.a aVar, java.lang.String str, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f182669d = y8Var;
        this.f182670e = i17;
        this.f182671f = aVar;
        this.f182672g = str;
        this.f182673h = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h8(this.f182669d, this.f182670e, this.f182671f, this.f182672g, this.f182673h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h8 h8Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        h8Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var = this.f182669d;
        java.util.List list = y8Var.f183159e;
        t72.a aVar2 = this.f182671f;
        int i17 = this.f182670e;
        list.set(i17, aVar2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[editTag] newName = ");
        sb6.append(this.f182672g);
        sb6.append(", position = ");
        int i18 = this.f182673h;
        sb6.append(i18);
        sb6.append(", index = ");
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        int i19 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopMenu", sb7, null);
        y8Var.m8147xed6e4d18(i18);
        return jz5.f0.f384359a;
    }
}
