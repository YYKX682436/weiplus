package km2;

/* loaded from: classes3.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f390618d;

    /* renamed from: e, reason: collision with root package name */
    public int f390619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f390620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km2.g0 f390621g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.i f390622h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.util.ArrayList arrayList, km2.g0 g0Var, com.p314xaae8f345.mm.p944x882e457a.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f390620f = arrayList;
        this.f390621g = g0Var;
        this.f390622h = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new km2.d0(this.f390620f, this.f390621g, this.f390622h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((km2.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f390619e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.ArrayList arrayList2 = this.f390620f;
            this.f390618d = arrayList2;
            this.f390619e = 1;
            km2.g0 g0Var = this.f390621g;
            g0Var.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            com.p314xaae8f345.mm.p944x882e457a.i iVar = this.f390622h;
            iVar.l().K(new km2.f0(g0Var, iVar, nVar));
            java.lang.Object a17 = nVar.a();
            if (a17 == aVar) {
                return aVar;
            }
            arrayList = arrayList2;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (java.util.ArrayList) this.f390618d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        arrayList.add(obj);
        return jz5.f0.f384359a;
    }
}
