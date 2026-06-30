package dk5;

/* loaded from: classes9.dex */
public class d4 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f316123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316124b;

    public d4(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, android.content.Intent intent) {
        this.f316124b = activityC22571x51759e93;
        this.f316123a = intent;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316124b;
        activityC22571x51759e93.mo48674x36654fab();
        if (!z17) {
            int i18 = activityC22571x51759e93.L1;
            if ((10 == i18 || 13 == i18) && activityC22571x51759e93.H1) {
                com.p314xaae8f345.mm.p959x883644fd.b.b(activityC22571x51759e93.S1, 10);
                return;
            }
            return;
        }
        activityC22571x51759e93.f292545y2 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "MicroMsg.SelectConversationUI", "onDialogClick: multiselect forward click ok ");
        activityC22571x51759e93.W7();
        android.content.Intent intent = this.f316123a;
        intent.putExtra("custom_send_text", str);
        activityC22571x51759e93.a8(-1, intent);
        activityC22571x51759e93.finish();
        int i19 = activityC22571x51759e93.L1;
        if ((10 == i19 || 13 == i19) && activityC22571x51759e93.H1) {
            com.p314xaae8f345.mm.p959x883644fd.b.b(activityC22571x51759e93.S1, 9);
        }
    }
}
