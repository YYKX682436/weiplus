package km2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f390625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f390626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f390627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km2.g0 f390628g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(java.util.List list, java.util.ArrayList arrayList, km2.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f390626e = list;
        this.f390627f = arrayList;
        this.f390628g = g0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        km2.e0 e0Var = new km2.e0(this.f390626e, this.f390627f, this.f390628g, interfaceC29045xdcb5ca57);
        e0Var.f390625d = obj;
        return e0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        km2.e0 e0Var = (km2.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f390625d;
        java.util.Iterator it = this.f390626e.iterator();
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new km2.d0(this.f390627f, this.f390628g, (com.p314xaae8f345.mm.p944x882e457a.i) it.next(), null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
