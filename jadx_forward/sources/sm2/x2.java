package sm2;

/* loaded from: classes3.dex */
public final class x2 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491313a;

    public x2(sm2.o4 o4Var) {
        this.f491313a = o4Var;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        sm2.o4 o4Var = this.f491313a;
        if (((mm2.c1) o4Var.f101142a.a(mm2.c1.class)).T7()) {
            sm2.o4.k(o4Var);
            dk2.ef efVar = dk2.ef.f314905a;
            tn0.w0 w0Var = dk2.ef.f314911d;
            in0.q qVar = w0Var instanceof in0.q ? (in0.q) w0Var : null;
            if (qVar != null) {
                qVar.c1(ko0.c0.f391358a.b().f401529e);
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", true);
        fm2.a aVar = o4Var.f101128c;
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", aVar != null && aVar.m57705xa1e2cd37() ? 1 : 3);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
        fm2.a aVar2 = o4Var.f101128c;
        if (aVar2 != null) {
            aVar2.mo46557x60d69242(qo0.b.B, bundle);
        }
        fm2.a aVar3 = o4Var.f101128c;
        if (aVar3 != null) {
            aVar3.m57757xd4d1ef72(false);
        }
        o4Var.L();
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        sm2.o4 o4Var = this.f491313a;
        fm2.a aVar = o4Var.f101128c;
        if (aVar != null) {
            aVar.m57757xd4d1ef72(false);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        fm2.a aVar2 = o4Var.f101128c;
        if (aVar2 != null) {
            aVar2.mo46557x60d69242(qo0.b.G, bundle);
        }
        sm2.o4.k(o4Var);
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        sm2.o4 o4Var = this.f491313a;
        fm2.a aVar = o4Var.f101128c;
        if (aVar != null) {
            aVar.m57757xd4d1ef72(false);
        }
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        fm2.a aVar2 = o4Var.f101128c;
        if (aVar2 != null) {
            aVar2.mo46557x60d69242(qo0.b.E, bundle);
        }
        sm2.o4.k(o4Var);
    }
}
