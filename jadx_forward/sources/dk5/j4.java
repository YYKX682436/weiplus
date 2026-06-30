package dk5;

/* loaded from: classes9.dex */
public class j4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316222d;

    public j4(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93) {
        this.f316222d = activityC22571x51759e93;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/SelectConversationUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316222d;
        if (activityC22571x51759e93.E1) {
            activityC22571x51759e93.E7();
        } else {
            java.lang.String stringExtra = activityC22571x51759e93.getIntent().getStringExtra("Select_App_Id");
            if (activityC22571x51759e93.f292525l1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                activityC22571x51759e93.I7();
            } else {
                activityC22571x51759e93.D7();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/transmit/SelectConversationUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
