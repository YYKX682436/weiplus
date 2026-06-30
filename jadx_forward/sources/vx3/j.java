package vx3;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f522843d;

    /* renamed from: e, reason: collision with root package name */
    public int f522844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t45.l0 f522845f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t45.l0 l0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f522845f = l0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vx3.j(this.f522845f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vx3.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object b17;
        long j17;
        java.lang.Object g17;
        t45.a0 a0Var;
        t45.n0 n0Var;
        xx3.a aVar;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f522844e;
        vx3.k kVar = vx3.l.E;
        t45.l0 l0Var = this.f522845f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (l0Var.f497134d == 1) {
                t45.e0 e0Var = l0Var.f497137g;
                if (e0Var == null) {
                    return null;
                }
                int i18 = e0Var.f497080d;
                this.f522844e = 1;
                g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new mx3.o(i18, null), this);
                if (g17 == aVar2) {
                    return aVar2;
                }
                a0Var = (t45.a0) g17;
                if (a0Var != null) {
                    return vx3.k.h(kVar, l0Var.f497135e, l0Var.f497136f, n0Var, null, 8, null);
                }
            } else {
                t45.f fVar = l0Var.f497138h;
                if (fVar != null) {
                    long j18 = fVar.f497082d;
                    if (fVar != null && (str = fVar.f497083e) != null) {
                        this.f522843d = j18;
                        this.f522844e = 2;
                        b17 = xx3.h.b(j18, str, this);
                        if (b17 == aVar2) {
                            return aVar2;
                        }
                        j17 = j18;
                        aVar = (xx3.a) b17;
                        if (aVar != null) {
                            return vx3.k.c(kVar, l0Var.f497135e, l0Var.f497136f, c19792x256d2725, j17, null, null, false, 112, null);
                        }
                    }
                }
            }
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g17 = obj;
            a0Var = (t45.a0) g17;
            if (a0Var != null && (n0Var = a0Var.f497056d) != null) {
                return vx3.k.h(kVar, l0Var.f497135e, l0Var.f497136f, n0Var, null, 8, null);
            }
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j19 = this.f522843d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j17 = j19;
            b17 = obj;
            aVar = (xx3.a) b17;
            if (aVar != null && (c19792x256d2725 = aVar.f539526a) != null) {
                return vx3.k.c(kVar, l0Var.f497135e, l0Var.f497136f, c19792x256d2725, j17, null, null, false, 112, null);
            }
        }
        return null;
    }
}
