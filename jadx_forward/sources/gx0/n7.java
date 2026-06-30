package gx0;

/* loaded from: classes5.dex */
public final class n7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358291d = w8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.n7(this.f358291d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gx0.n7 n7Var = (gx0.n7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gx0.w8 w8Var = this.f358291d;
        if (!(w8Var.f2().f548104a.getParent() != null)) {
            if (w8Var.B7().getWidth() > 0) {
                w8Var.f2().a(w8Var.y7());
            } else {
                w8Var.B7().post(new gx0.m7(w8Var));
            }
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10998xc859527c w76 = w8Var.w7();
            bv0.e handleBoxGesture = gx0.w8.e7(w8Var);
            w76.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleBoxGesture, "handleBoxGesture");
            java.util.ArrayList arrayList = w76.f151219d;
            if (!arrayList.contains(handleBoxGesture)) {
                arrayList.add(handleBoxGesture);
            }
            gx0.w8.e7(w8Var).a(((gx0.x4) ((jz5.n) w8Var.f430434o).mo141623x754a37bb()).X6());
            gx0.w8.e7(w8Var).a((tv0.k0) ((jz5.n) ((tv0.j0) w8Var.T6(tv0.j0.class)).A).mo141623x754a37bb());
            gx0.w8.e7(w8Var).a((tv0.k0) ((jz5.n) ((iv0.w) w8Var.T6(iv0.w.class)).B).mo141623x754a37bb());
        }
        return jz5.f0.f384359a;
    }
}
