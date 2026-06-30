package wc5;

/* loaded from: classes4.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f526062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wc5.c0 f526063e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.util.List list, wc5.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f526062d = list;
        this.f526063e = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wc5.a0(this.f526062d, this.f526063e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        wc5.a0 a0Var = (wc5.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.List list = this.f526062d;
        boolean z17 = !list.isEmpty();
        wc5.c0 c0Var = this.f526063e;
        if (z17) {
            c0Var.f526076g = list;
            c0Var.U6(list);
        } else {
            java.util.List list2 = wc5.c0.f526072h;
            c0Var.W6();
            c0Var.f526076g = kz5.p0.f395529d;
        }
        return jz5.f0.f384359a;
    }
}
