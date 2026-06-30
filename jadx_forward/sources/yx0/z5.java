package yx0;

/* loaded from: classes5.dex */
public final class z5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f549345f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(yx0.b8 b8Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549344e = b8Var;
        this.f549345f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.z5(this.f549344e, this.f549345f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.z5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549343d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f549344e.f548727u;
            if (r2Var != null) {
                yx0.b8 b8Var = this.f549344e;
                this.f549343d = 1;
                if (b8Var.a0(r2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yx0.b8 b8Var2 = this.f549344e;
        boolean z17 = this.f549345f;
        this.f549343d = 2;
        if (yx0.b8.b(b8Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b, z17, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
