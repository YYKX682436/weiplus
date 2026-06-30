package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class r8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f182910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t72.a f182912f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(java.util.ArrayList arrayList, int i17, t72.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f182910d = arrayList;
        this.f182911e = i17;
        this.f182912f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r8(this.f182910d, this.f182911e, this.f182912f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r8 r8Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r8Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = this.f182911e;
        this.f182910d.add(new java.lang.Integer(i17));
        java.lang.String str = "[removeTag] finish tag = " + this.f182912f + ", index = " + i17 + ", current thread = " + java.lang.Thread.currentThread().getName();
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopMenu", str, null);
        return jz5.f0.f384359a;
    }
}
