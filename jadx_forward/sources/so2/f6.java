package so2;

/* loaded from: classes10.dex */
public final class f6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.z5 f491881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f491882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(so2.z5 z5Var, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f491881d = z5Var;
        this.f491882e = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new so2.f6(this.f491881d, this.f491882e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        so2.f6 f6Var = (so2.f6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        f6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        so2.a6 a6Var = (so2.a6) this.f491881d;
        a6Var.getClass();
        java.util.ArrayList drawables = this.f491882e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawables, "drawables");
        ((so2.k6) a6Var.f491794f).a(true, a6Var.f491789a.O6(a6Var.f491790b, a6Var.f491791c, a6Var.f491792d, a6Var.f491793e, drawables));
        return jz5.f0.f384359a;
    }
}
