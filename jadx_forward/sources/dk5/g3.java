package dk5;

/* loaded from: classes9.dex */
public class g3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f316168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316169b;

    public g3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, android.content.Intent intent) {
        this.f316169b = activityC22571x51759e93;
        this.f316168a = intent;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316169b;
        activityC22571x51759e93.mo48674x36654fab();
        android.content.Intent intent = this.f316168a;
        if (!z17) {
            int i18 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.B2;
            activityC22571x51759e93.a8(0, intent);
            if (activityC22571x51759e93.f292524k2) {
                activityC22571x51759e93.finish();
                return;
            }
            return;
        }
        activityC22571x51759e93.f292545y2 = str;
        intent.putExtra("custom_send_text", str);
        intent.putExtra("KSendGroupToDo", activityC22571x51759e93.f292523j2);
        intent.putExtra("KShowTodoIntroduceView", activityC22571x51759e93.f292522i2);
        activityC22571x51759e93.a8(-1, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "onDialogClick: native game card forward click ok.");
        activityC22571x51759e93.finish();
    }
}
