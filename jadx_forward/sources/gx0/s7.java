package gx0;

/* loaded from: classes5.dex */
public final class s7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358478d = w8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.s7(this.f358478d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gx0.s7 s7Var = (gx0.s7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gx0.w8 w8Var = this.f358478d;
        w8Var.f2().d();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10998xc859527c w76 = w8Var.w7();
        bv0.e handleBoxGesture = gx0.w8.e7(w8Var);
        w76.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleBoxGesture, "handleBoxGesture");
        java.util.ArrayList arrayList = w76.f151219d;
        if (arrayList.contains(handleBoxGesture)) {
            arrayList.remove(handleBoxGesture);
        }
        gx0.w8.e7(w8Var).f106227e.clear();
        return jz5.f0.f384359a;
    }
}
