package i21;

/* loaded from: classes10.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f369434d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f369435e;

    /* renamed from: f, reason: collision with root package name */
    public int f369436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f369437g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f369437g = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new i21.k(this.f369437g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((i21.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        java.util.Iterator it;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f369436f;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i17 = 0;
            it = this.f369437g.iterator();
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f369434d;
            it = (java.util.Iterator) this.f369435e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            i21.n nVar = i21.p.f369444a;
            this.f369435e = it;
            this.f369434d = i19;
            this.f369436f = 1;
            if (i21.n.a(nVar, (java.lang.String) next, i17, this) == aVar) {
                return aVar;
            }
            i17 = i19;
        }
        return jz5.f0.f384359a;
    }
}
