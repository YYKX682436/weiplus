package bg2;

/* loaded from: classes2.dex */
public final class g3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f101638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f101639e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(bg2.z3 z3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101639e = z3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.g3(this.f101639e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.g3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f101638d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bg2.z3 z3Var = this.f101639e;
            bg2.n2 n2Var = (bg2.n2) z3Var.N6(bg2.n2.class);
            if (n2Var == null || (j2Var = n2Var.f101856f) == null) {
                return jz5.f0.f384359a;
            }
            bg2.f3 f3Var = new bg2.f3(z3Var);
            this.f101638d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).a(f3Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
