package pr0;

/* loaded from: classes14.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f439344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(pr0.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439344e = g0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pr0.b0(this.f439344e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        xr0.d dVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f439343d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        pr0.g0 g0Var = this.f439344e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            sr0.i iVar = g0Var.f439367e;
            if (iVar != null && (dVar = ((sr0.f) iVar).f492970n) != null) {
                boolean o17 = iVar != null ? iVar.o() : false;
                sr0.i iVar2 = g0Var.f439367e;
                boolean t17 = iVar2 != null ? iVar2.t() : false;
                boolean z17 = dVar.f537694c;
                if ((z17 && t17) || (!z17 && o17)) {
                    sr0.i iVar3 = g0Var.f439367e;
                    if (iVar3 != null) {
                        this.f439343d = 1;
                        obj = iVar3.p(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                }
            }
        }
        if (i17 != 1) {
            if (i17 == 2) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f439343d = 2;
        int i18 = pr0.g0.f439372v;
        g0Var.getClass();
        sr0.i iVar4 = ((pr0.d) g0Var).f439367e;
        if ((iVar4 != null ? ((sr0.f) iVar4).f492970n : null) != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("camera_boolean", !r9.f537694c);
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) g0Var.f439373u).mo771x2f8fd3(new jz5.l(bs0.g.f105322f, bundle), this);
        }
        return f0Var == aVar ? aVar : f0Var;
    }
}
