package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class u8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 f183006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f183009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var, int i17, java.lang.String str, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f183006d = y8Var;
        this.f183007e = i17;
        this.f183008f = str;
        this.f183009g = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u8(this.f183006d, this.f183007e, this.f183008f, this.f183009g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u8 u8Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        u8Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var = this.f183006d;
        java.util.List list = y8Var.f183159e;
        int i17 = this.f183007e;
        list.remove(i17);
        java.lang.String str = "[removeTag] finish tag = " + this.f183008f + ", position = " + this.f183009g + ", index = " + i17 + ", current thread = " + java.lang.Thread.currentThread().getName();
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopMenu", str, null);
        y8Var.m8146xced61ae5();
        return jz5.f0.f384359a;
    }
}
