package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes4.dex */
public final class d2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f391762d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f391763e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f391764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.t f391765g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, yz5.t tVar) {
        super(3, interfaceC29045xdcb5ca57);
        this.f391765g = tVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.d2 d2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.d2((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3, this.f391765g);
        d2Var.f391763e = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj;
        d2Var.f391764f = (java.lang.Object[]) obj2;
        return d2Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f391762d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f391763e;
            java.lang.Object[] objArr = (java.lang.Object[]) this.f391764f;
            yz5.t tVar = this.f391765g;
            java.lang.Object obj2 = objArr[0];
            java.lang.Object obj3 = objArr[1];
            java.lang.Object obj4 = objArr[2];
            java.lang.Object obj5 = objArr[3];
            java.lang.Object obj6 = objArr[4];
            this.f391763e = kVar;
            this.f391762d = 1;
            obj = tVar.J(obj2, obj3, obj4, obj5, obj6, this);
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
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f391763e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f391763e = null;
        this.f391762d = 2;
        if (kVar.mo771x2f8fd3(obj, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
