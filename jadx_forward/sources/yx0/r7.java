package yx0;

/* loaded from: classes5.dex */
public final class r7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f549154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549155e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(jz5.l lVar, yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549154d = lVar;
        this.f549155e = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.r7(this.f549154d, this.f549155e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yx0.r7 r7Var = (yx0.r7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.l lVar = this.f549154d;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4024xee1c0e5a c4024xee1c0e5a = lVar != null ? (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4024xee1c0e5a) lVar.f384367e : null;
        boolean z17 = true;
        if (c4024xee1c0e5a != null) {
            c4024xee1c0e5a.m32766x908d523b();
            if (c4024xee1c0e5a.m32766x908d523b() != 0) {
                z17 = false;
            }
        }
        yx0.b8 b8Var = this.f549155e;
        if (z17) {
            ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) b8Var.f548710d).l0();
        } else {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) b8Var.f548710d;
            c10977x8e40eced.n0();
            qx0.e eVar = c10977x8e40eced.D1;
            if (eVar.isShowing()) {
                eVar.dismiss();
            }
        }
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) b8Var.f548710d).j1(c4024xee1c0e5a);
        return jz5.f0.f384359a;
    }
}
