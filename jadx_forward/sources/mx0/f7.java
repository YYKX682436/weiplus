package mx0;

/* loaded from: classes5.dex */
public final class f7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f413514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413513d = c10977x8e40eced;
        this.f413514e = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.f7(this.f413513d, this.f413514e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.f7 f7Var = (mx0.f7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        f7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        mx0.ja m47325xd23b40d7;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        m47325xd23b40d7 = this.f413513d.m47325xd23b40d7();
        m47325xd23b40d7.getClass();
        java.util.List newData = this.f413514e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newData, "newData");
        m47325xd23b40d7.f413614m.addAll(newData);
        mx0.t9 t9Var = m47325xd23b40d7.f413613i;
        t9Var.getClass();
        java.util.ArrayList arrayList = t9Var.f413891f;
        arrayList.addAll(newData);
        t9Var.m8151xc67946d3(0, arrayList.size());
        return jz5.f0.f384359a;
    }
}
