package dk5;

/* loaded from: classes9.dex */
public class q3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316360a;

    public q3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93) {
        this.f316360a = activityC22571x51759e93;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316360a;
        intent.setClassName(activityC22571x51759e93.mo55332x76847179(), "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        intent.putExtra("app_msg_id", activityC22571x51759e93.M1);
        intent.putExtra("msg_talker", activityC22571x51759e93.N1);
        intent.putExtra("app_show_share", false);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e932 = this.f316360a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC22571x51759e932, arrayList.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI$34", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC22571x51759e932.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC22571x51759e932, "com/tencent/mm/ui/transmit/SelectConversationUI$34", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
