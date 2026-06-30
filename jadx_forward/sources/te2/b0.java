package te2;

/* loaded from: classes10.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f499421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.i0 f499422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.c0 f499423f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(te2.i0 i0Var, te2.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499422e = i0Var;
        this.f499423f = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.b0(this.f499422e, this.f499423f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499421d;
        te2.i0 i0Var = this.f499422e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (i0Var.f499629p == 1) {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D = i0Var.D();
                if (D != null) {
                    vl2.s sVar = vl2.s.f519401a;
                    vl2.h hVar = vl2.h.f519371y;
                    this.f499421d = 1;
                    if (sVar.d(hVar, D, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D2 = i0Var.D();
                if (D2 != null) {
                    vl2.s sVar2 = vl2.s.f519401a;
                    vl2.h hVar2 = vl2.h.f519372z;
                    this.f499421d = 2;
                    if (sVar2.d(hVar2, D2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D3 = i0Var.D();
        if (D3 != null) {
            D3.i(this.f499423f);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D4 = i0Var.D();
        if (D4 != null) {
            D4.m82583xcde73672(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D5 = i0Var.D();
        if (D5 != null) {
            D5.g();
        }
        return jz5.f0.f384359a;
    }
}
