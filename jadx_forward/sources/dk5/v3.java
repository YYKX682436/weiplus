package dk5;

/* loaded from: classes.dex */
public class v3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f316493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316494b;

    public v3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, ot0.q qVar) {
        this.f316494b = activityC22571x51759e93;
        this.f316493a = qVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316494b;
        android.content.Intent intent = new android.content.Intent(activityC22571x51759e93.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22569xfbe3f599.class);
        intent.putExtra("Retr_Msg_content", this.f316493a.f430187f);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e932 = this.f316494b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC22571x51759e932, arrayList.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI$39", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC22571x51759e932.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC22571x51759e932, "com/tencent/mm/ui/transmit/SelectConversationUI$39", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(activityC22571x51759e93.mo55332x76847179());
    }
}
