package jf2;

/* loaded from: classes3.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f380905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jf2.k0 f380906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(jf2.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f380906e = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jf2.g0(this.f380906e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jf2.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f380905d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            jf2.k0 k0Var = this.f380906e;
            mm2.n0 n0Var = (mm2.n0) k0Var.m56788xbba4bfc0(mm2.n0.class);
            if (n0Var == null || (f3Var = n0Var.f410804p) == null) {
                return jz5.f0.f384359a;
            }
            jf2.f0 f0Var = new jf2.f0(k0Var);
            this.f380905d = 1;
            if (f3Var.a(f0Var, this) == aVar) {
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
