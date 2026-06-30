package dk5;

/* loaded from: classes9.dex */
public class s3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f316409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316410b;

    public s3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, ot0.q qVar) {
        this.f316410b = activityC22571x51759e93;
        this.f316409a = qVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "go to RecordMsgDetailUI");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316410b;
        intent.putExtra("message_id", activityC22571x51759e93.M1);
        intent.putExtra("message_talker", activityC22571x51759e93.N1);
        intent.putExtra("Retr_Security_Msg_Id", activityC22571x51759e93.M1);
        intent.putExtra("Retr_Security_Msg_Talker", activityC22571x51759e93.N1);
        intent.putExtra("record_xml", this.f316409a.f430196h0);
        intent.putExtra("record_show_share", false);
        j45.l.j(activityC22571x51759e93.mo55332x76847179(), "record", ".ui.RecordMsgDetailUI", intent, null);
    }
}
