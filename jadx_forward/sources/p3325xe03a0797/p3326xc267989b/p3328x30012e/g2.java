package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes4.dex */
public final class g2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f391796d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f391797e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f391798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f391799g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(yz5.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f391799g = qVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.g2 g2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.g2(this.f391799g, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        g2Var.f391797e = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj;
        g2Var.f391798f = (java.lang.Object[]) obj2;
        return g2Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f391796d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f391797e;
            java.lang.Object[] objArr = (java.lang.Object[]) this.f391798f;
            java.lang.Object obj2 = objArr[0];
            java.lang.Object obj3 = objArr[1];
            this.f391797e = kVar;
            this.f391796d = 1;
            obj = this.f391799g.mo147xb9724478(obj2, obj3, this);
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
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f391797e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f391797e = null;
        this.f391796d = 2;
        if (kVar.mo771x2f8fd3(obj, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
