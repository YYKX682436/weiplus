package dk5;

/* loaded from: classes9.dex */
public class x3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316523a;

    public x3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93) {
        this.f316523a = activityC22571x51759e93;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "go to RecordMsgDetailUI");
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316523a;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 f17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.f(activityC22571x51759e93.mo55332x76847179());
        am.fq fqVar = f17.f136197h;
        q45.c cVar = fqVar.f88230f;
        java.lang.String h17 = bt3.g2.h(cVar.f441662d, cVar.f441663e, fqVar.f88229e.f135623g.f87848a, f17.f136196g.f88130o, activityC22571x51759e93.M1, activityC22571x51759e93.N1);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ot0.q v17 = ot0.q.v(h17);
        if (v17 == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("message_id", activityC22571x51759e93.M1);
        intent.putExtra("message_talker", activityC22571x51759e93.S1.Q0());
        intent.putExtra("record_xml", v17.f430196h0);
        intent.putExtra("record_show_share", false);
        j45.l.j(activityC22571x51759e93.mo55332x76847179(), "record", ".ui.RecordMsgDetailUI", intent, null);
    }
}
