package df2;

/* loaded from: classes3.dex */
public final class r implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.s f312737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gk2.e f312738b;

    public r(df2.s sVar, gk2.e eVar) {
        this.f312737a = sVar;
        this.f312738b = eVar;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        df2.s sVar = this.f312737a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f312811m, "doMiniWindow onResultAllow");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        gk2.e eVar = this.f312738b;
        if (r4Var.W1(eVar) || r4Var.z1(eVar)) {
            if (sn0.b.f491497e2 == null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new java.lang.Object[0]);
                sn0.b.f491497e2 = new sn0.b();
            }
            sn0.b bVar = sn0.b.f491497e2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
            bVar.D.f391114a = true;
        } else {
            if (in0.q.f374302b2 == null) {
                in0.q.f374302b2 = new in0.q(rn0.a.f479142a.a());
            }
            in0.q qVar = in0.q.f374302b2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
            qVar.D.f391114a = true;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 12);
        sVar.X6(qo0.b.B, bundle);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f409116i;
        y4Var.U = true;
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        y4Var.V = false;
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        df2.s sVar = this.f312737a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f312811m, "doMiniWindow onResultCancel");
        if2.b.Y6(sVar, qo0.b.G, null, 2, null);
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        df2.s sVar = this.f312737a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f312811m, "doMiniWindow onResultRefuse");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        if2.b.Y6(sVar, qo0.b.E, null, 2, null);
    }
}
