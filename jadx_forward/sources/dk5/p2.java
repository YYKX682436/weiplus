package dk5;

/* loaded from: classes9.dex */
public class p2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316329b;

    public p2(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, java.lang.String str) {
        this.f316329b = activityC22571x51759e93;
        this.f316328a = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316329b;
        activityC22571x51759e93.mo48674x36654fab();
        if (z17) {
            activityC22571x51759e93.f292545y2 = str;
            android.content.Intent intent = new android.content.Intent();
            java.lang.String str2 = this.f316328a;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2)) {
                java.lang.String str3 = activityC22571x51759e93.A1;
                iz5.a.g("cardNameToSend is null", str3 != null);
                intent.putExtra("be_send_card_name", str3);
                intent.putExtra("received_card_name", str2);
                intent.putExtra("Is_Chatroom", true);
            } else {
                java.lang.String str4 = activityC22571x51759e93.A1;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(str2);
                activityC22571x51759e93.Z7(intent, str4, linkedList);
            }
            intent.putExtra("custom_send_text", str);
            activityC22571x51759e93.X7(str2);
            activityC22571x51759e93.a8(-1, intent);
            activityC22571x51759e93.finish();
        }
    }
}
