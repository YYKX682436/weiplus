package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class v8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f183026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 f183028f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f183029g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f183030h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f183027e = str;
        this.f183028f = y8Var;
        this.f183029g = i17;
        this.f183030h = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v8(this.f183027e, this.f183028f, this.f183029g, this.f183030h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f183026d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = "[removeTag] start, current thread = " + java.lang.Thread.currentThread().getName();
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopMenu", str, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(this.f183027e);
            o72.z4 uj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj();
            this.f183026d = 1;
            obj = ((t72.l) uj6).W6(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u8 u8Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u8(this.f183028f, this.f183029g, this.f183027e, this.f183030h, null);
        this.f183026d = 2;
        return p3325xe03a0797.p3326xc267989b.l.g(g3Var, u8Var, this) == aVar ? aVar : f0Var;
    }
}
