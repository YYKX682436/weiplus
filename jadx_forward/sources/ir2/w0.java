package ir2;

/* loaded from: classes2.dex */
public final class w0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f375766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f375767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ir2.a0 f375768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ir2.a1 a1Var, ir2.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f375767e = a1Var;
        this.f375768f = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ir2.w0(this.f375767e, this.f375768f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((ir2.w0) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f375766d;
        ir2.a1 a1Var = this.f375767e;
        ir2.a0 a0Var = this.f375768f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ir2.v0 v0Var = new ir2.v0(a0Var);
            ir2.g0 g0Var = ir2.a1.f375622r;
            a1Var.getClass();
            ir2.r1 r1Var = new ir2.r1(v0Var, null, null, 2, null);
            this.f375766d = 1;
            obj = ay1.l.j(r1Var, false, this, 1, null);
            if (obj == aVar) {
                return aVar;
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
        ir2.e1 e1Var = (ir2.e1) obj;
        boolean z17 = e1Var instanceof ir2.a;
        if (z17) {
            ir2.c cVar = a0Var instanceof ir2.c ? (ir2.c) a0Var : null;
            if (cVar != null) {
                ir2.a aVar2 = z17 ? (ir2.a) e1Var : null;
                cVar.f375651d = aVar2 != null ? aVar2.f375616e : null;
            }
        }
        ir2.v vVar = new ir2.v(e1Var, null, 2, null);
        this.f375766d = 2;
        if (a1Var.T6(vVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
