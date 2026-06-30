package gx0;

/* loaded from: classes5.dex */
public final class da extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f357860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f357861f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(gx0.ac acVar, ex0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357860e = acVar;
        this.f357861f = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.da(this.f357860e, this.f357861f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.da) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357859d;
        gx0.ac acVar = this.f357860e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            acVar.t7().b(this.f357861f.f338630g.f338712g);
            gx0.bf c86 = acVar.c8();
            this.f357859d = 1;
            if (gx0.bf.d7(c86, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.i(acVar.A7(), false, 1, null);
        return jz5.f0.f384359a;
    }
}
