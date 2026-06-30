package nu0;

/* loaded from: classes5.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(nu0.b4 b4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421409d = b4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.b3(this.f421409d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        nu0.b3 b3Var = (nu0.b3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        nu0.b4 b4Var = this.f421409d;
        if (!(b4Var.f2().f548104a.getParent() != null)) {
            if (b4Var.m7().getWidth() > 0) {
                b4Var.f2().a(b4Var.r7());
            } else {
                b4Var.m7().post(new nu0.a3(b4Var));
            }
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10998xc859527c p76 = b4Var.p7();
            jz5.g gVar = b4Var.V;
            bv0.e handleBoxGesture = (bv0.e) ((jz5.n) gVar).mo141623x754a37bb();
            p76.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleBoxGesture, "handleBoxGesture");
            java.util.ArrayList arrayList = p76.f151219d;
            if (!arrayList.contains(handleBoxGesture)) {
                arrayList.add(handleBoxGesture);
            }
            ((bv0.e) ((jz5.n) gVar).mo141623x754a37bb()).a(((nu0.b1) ((jz5.n) b4Var.f421450n).mo141623x754a37bb()).X6());
        }
        return jz5.f0.f384359a;
    }
}
