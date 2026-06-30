package nu0;

/* loaded from: classes5.dex */
public final class g3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(nu0.b4 b4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421477d = b4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.g3(this.f421477d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        nu0.g3 g3Var = (nu0.g3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        nu0.b4 b4Var = this.f421477d;
        b4Var.f2().d();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10998xc859527c p76 = b4Var.p7();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 k76 = b4Var.k7();
        p76.getClass();
        p76.f151220e.remove(k76);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10998xc859527c p77 = b4Var.p7();
        jz5.g gVar = b4Var.V;
        bv0.e handleBoxGesture = (bv0.e) ((jz5.n) gVar).mo141623x754a37bb();
        p77.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleBoxGesture, "handleBoxGesture");
        java.util.ArrayList arrayList = p77.f151219d;
        if (arrayList.contains(handleBoxGesture)) {
            arrayList.remove(handleBoxGesture);
        }
        ((bv0.e) ((jz5.n) gVar).mo141623x754a37bb()).f106227e.clear();
        return jz5.f0.f384359a;
    }
}
