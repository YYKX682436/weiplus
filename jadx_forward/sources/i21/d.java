package i21;

/* loaded from: classes11.dex */
public final class d extends qz5.l implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public int f369418d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f369419e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int f369420f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f369421g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i21.g f369422h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i21.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(4, interfaceC29045xdcb5ca57);
        this.f369422h = gVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj2).intValue();
        i21.d dVar = new i21.d(this.f369422h, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj4);
        dVar.f369419e = (java.lang.String) obj;
        dVar.f369420f = intValue;
        dVar.f369421g = (com.p314xaae8f345.mm.p947xba6de98f.n1) obj3;
        return dVar.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f369418d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = this.f369420f;
            com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = (com.p314xaae8f345.mm.p947xba6de98f.n1) this.f369421g;
            this.f369419e = null;
            this.f369418d = 1;
            int i19 = i21.b.f369411a[n1Var.f152636a.ordinal()];
            i21.g gVar = this.f369422h;
            if (i19 == 1) {
                gVar.a(true, i18);
            } else {
                gVar.a(false, i18);
            }
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
