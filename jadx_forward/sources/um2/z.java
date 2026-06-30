package um2;

/* loaded from: classes3.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f510635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(um2.x5 x5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f510636e = x5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new um2.z(this.f510636e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((um2.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        sf2.d3 d3Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f510635d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            um2.x5 x5Var = this.f510636e;
            fm2.c cVar = x5Var.f101139c;
            if (cVar != null && (m57663xfb7e5820 = cVar.m57663xfb7e5820()) != null && (c14197x319b1b9e = m57663xfb7e5820.f390664f) != null && (d3Var = (sf2.d3) c14197x319b1b9e.m56798x25fe639c(sf2.d3.class)) != null) {
                r45.nx1 nx1Var = new r45.nx1();
                nx1Var.f463254d = ((mm2.c1) x5Var.c(mm2.c1.class)).m8();
                this.f510635d = 1;
                obj = d3Var.a7(12, nx1Var, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        return jz5.f0.f384359a;
    }
}
