package dk5;

/* loaded from: classes9.dex */
public class g4 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316170a;

    public g4(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93) {
        this.f316170a = activityC22571x51759e93;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.e1
    public void a() {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316170a;
        if (activityC22571x51759e93.E1) {
            activityC22571x51759e93.E7();
        } else {
            activityC22571x51759e93.D7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.e1
    public void b() {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316170a;
        if (activityC22571x51759e93.f292532p2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectConversationUI", "onClickForwardToWeWork:isForbidSendToWeWork ");
            return;
        }
        boolean z17 = activityC22571x51759e93.f292539w2;
        if (z17 && activityC22571x51759e93.f292542x2) {
            activityC22571x51759e93.getClass();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC22571x51759e93, 1, false);
            k0Var.f293405n = new dk5.a4(activityC22571x51759e93);
            k0Var.f293414s = new dk5.b4(activityC22571x51759e93);
            k0Var.v();
            return;
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.w7(activityC22571x51759e93, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxwork);
        } else if (activityC22571x51759e93.f292542x2) {
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.w7(activityC22571x51759e93, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeLocal);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectConversationUI", "onClickForwardToWeWork: don't support");
        }
    }
}
