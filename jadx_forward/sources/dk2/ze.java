package dk2;

/* loaded from: classes3.dex */
public final class ze implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315970a;

    public ze(android.content.Context context) {
        this.f315970a = context;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", c1Var != null && c1Var.P1);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 3);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
        efVar.m0(bundle, this.f315970a);
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            efVar.p0(eVar, efVar.e() != null, qo0.b.B, bundle, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        }
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        android.os.Bundle bundle = new android.os.Bundle();
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            efVar.p0(eVar, efVar.e() != null, qo0.b.G, bundle, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        }
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            efVar.p0(eVar, efVar.e() != null, qo0.b.E, bundle, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        }
    }
}
