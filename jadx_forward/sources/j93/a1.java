package j93;

/* loaded from: classes.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.j1 f379891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(j93.j1 j1Var) {
        super(1);
        this.f379891d = j1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        j93.j1 j1Var = this.f379891d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = j1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
            abstractActivityC21394xb3d2c0cf.mo64405x4dab7448(j1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            abstractActivityC21394xb3d2c0cf.mo78578x8b18f126(j1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            int e17 = com.p314xaae8f345.mm.ui.zk.e(j1Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            int e18 = com.p314xaae8f345.mm.ui.zk.e(j1Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
            int e19 = com.p314xaae8f345.mm.ui.zk.e(j1Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
            if (fp.h.c(23)) {
                abstractActivityC21394xb3d2c0cf.mo78514x143f1b92().Q0(com.p314xaae8f345.mm.ui.uk.d(j1Var.m158354x19263085(), com.p314xaae8f345.mm.R.raw.f80008xda567a70, j1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832), e18, e19, j1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77626xb498cd1b), e17, 0.5f * e17));
            }
            if (state.e()) {
                abstractActivityC21394xb3d2c0cf.m78494xd9193382(1, (java.lang.String) ((jz5.n) j1Var.f379950h).mo141623x754a37bb(), new j93.z0(j1Var), null, com.p314xaae8f345.mm.ui.fb.a(((java.lang.Number) ((jz5.n) j1Var.f379949g).mo141623x754a37bb()).intValue()));
                j1Var.V6(state);
            }
        }
        if (state.e()) {
            j75.d dVar2 = state.f379599d;
            if (dVar2 != null && (dVar2 instanceof wi5.t0) && (eVar = ((wi5.t0) dVar2).f379600a) != null && (eVar instanceof wi5.w0)) {
                if (((wi5.w0) eVar).f527891b == wi5.u0.f527878d) {
                    j1Var.V6(state);
                }
            }
            j75.d dVar3 = state.f379599d;
            if (dVar3 != null && (dVar3 instanceof wi5.x0)) {
                j1Var.V6(state);
            }
            j75.d dVar4 = state.f379599d;
            if (dVar4 != null && (dVar4 instanceof wi5.k0)) {
                j1Var.V6(state);
            }
            j75.d dVar5 = state.f379599d;
            if (dVar5 != null && (dVar5 instanceof wi5.j0)) {
                j1Var.V6(state);
            }
            j75.d dVar6 = state.f379599d;
            if (dVar6 != null && (dVar6 instanceof wi5.r)) {
                j1Var.V6(state);
            }
        }
        return jz5.f0.f384359a;
    }
}
