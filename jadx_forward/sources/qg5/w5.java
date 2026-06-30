package qg5;

/* loaded from: classes8.dex */
public final class w5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public w5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.uq uqVar = event.f136212g;
        java.lang.String str = uqVar != null ? uqVar.f89659b : null;
        new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.tos.C20843x59f8ea4b();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "RepairerConfig_ResetYuanBaoUnifiedTos")) {
            return false;
        }
        vh0.p3 p3Var = (vh0.p3) ((vh0.o1) i95.n0.c(vh0.o1.class));
        com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10698x53096d50 agreement = p3Var.bj(false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(agreement, "agreement");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "revoke unified agreement");
        ((vh0.f2) ((vh0.d1) ((jz5.n) p3Var.f518471m).mo141623x754a37bb())).Di("yuanbao_unified_scene", new com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040(agreement.f149398d, agreement.f149399e, agreement.f149400f, agreement.f149401g, agreement.f149402h, agreement.f149403i), false);
        return true;
    }
}
