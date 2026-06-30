package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes.dex */
public final class b2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f391741d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f391742e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f391743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.r f391744g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, yz5.r rVar) {
        super(3, interfaceC29045xdcb5ca57);
        this.f391744g = rVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.b2 b2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.b2((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3, this.f391744g);
        b2Var.f391742e = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj;
        b2Var.f391743f = (java.lang.Object[]) obj2;
        return b2Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f391741d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f391742e;
            java.lang.Object[] objArr = (java.lang.Object[]) this.f391743f;
            java.lang.Object obj2 = objArr[0];
            java.lang.Object obj3 = objArr[1];
            java.lang.Object obj4 = objArr[2];
            this.f391742e = kVar;
            this.f391741d = 1;
            obj = this.f391744g.C(obj2, obj3, obj4, this);
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
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f391742e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f391742e = null;
        this.f391741d = 2;
        if (kVar.mo771x2f8fd3(obj, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
