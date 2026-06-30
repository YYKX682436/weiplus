package yn1;

/* loaded from: classes11.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f545273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f545274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545274e = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.l0(this.f545274e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.l0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545273d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yn1.z0 z0Var = yn1.z0.f545466a;
            this.f545273d = 1;
            if (z0Var.v(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                this.f545274e.mo146xb9724478(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()));
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bp1.d dVar = bp1.e.f104573a;
        bp1.f[] fVarArr = bp1.e.f104574b;
        this.f545273d = 2;
        obj = dVar.a(fVarArr, this);
        if (obj == aVar) {
            return aVar;
        }
        this.f545274e.mo146xb9724478(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()));
        return jz5.f0.f384359a;
    }
}
