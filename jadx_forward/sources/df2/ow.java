package df2;

/* loaded from: classes3.dex */
public final class ow extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.xw f312543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f312544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(df2.xw xwVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312543d = xwVar;
        this.f312544e = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.ow(this.f312543d, this.f312544e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ow) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        df2.xw xwVar = this.f312543d;
        boolean isEmpty = xwVar.f313342m.isEmpty();
        jz5.f0 f0Var = jz5.f0.f384359a;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f312544e;
        if (isEmpty) {
            xwVar.f313342m.addAll((java.util.Collection) h0Var.f391656d);
            if2.b.Y6(xwVar, qo0.b.f446913l5, null, 2, null);
            return f0Var;
        }
        xwVar.f313342m.addAll((java.util.Collection) h0Var.f391656d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0 vk0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0) xwVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0.class);
        if (vk0Var == null) {
            return null;
        }
        vk0Var.v1((java.util.List) h0Var.f391656d);
        return f0Var;
    }
}
