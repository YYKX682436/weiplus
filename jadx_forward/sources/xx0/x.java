package xx0;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx0.d0 f539485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f539486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(xx0.d0 d0Var, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f539485d = d0Var;
        this.f539486e = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xx0.x(this.f539485d, this.f539486e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xx0.x xVar = (xx0.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        xVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xx0.d0 d0Var = this.f539485d;
        d0Var.f539413h.setVisibility(0);
        xx0.t tVar = d0Var.f539414i;
        tVar.getClass();
        java.util.List data = this.f539486e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.ArrayList arrayList = (java.util.ArrayList) tVar.f539474g;
        arrayList.clear();
        arrayList.addAll(data);
        tVar.m8146xced61ae5();
        return jz5.f0.f384359a;
    }
}
