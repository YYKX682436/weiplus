package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class g4 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19015x36b35eb1 f259717a;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19015x36b35eb1 activityC19015x36b35eb1) {
        this.f259717a = activityC19015x36b35eb1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanBeforeHomeUI", "on index cache callback");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.m85 m85Var = (r45.m85) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanBeforeHomeUI", "on index response callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19015x36b35eb1 activityC19015x36b35eb1 = this.f259717a;
        if (m85Var != null) {
            int i19 = m85Var.f461771d;
            if (i19 == 0) {
                java.util.LinkedList linkedList = m85Var.f461773f;
                if (linkedList == null || linkedList.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanBeforeHomeUI", "go to WalletLqtPlanAddUI");
                    android.content.Intent intent = new android.content.Intent(activityC19015x36b35eb1, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192.class);
                    if (m85Var.f461779o == 1) {
                        intent.putExtra("key_plan_go_scene_ui", 1);
                    } else {
                        intent.putExtra("key_plan_go_scene_ui", 2);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19015x36b35eb1 activityC19015x36b35eb12 = this.f259717a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityC19015x36b35eb12, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanBeforeHomeUI$1", "netCallback", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC19015x36b35eb12.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityC19015x36b35eb12, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanBeforeHomeUI$1", "netCallback", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanBeforeHomeUI", "go to WalletLqtPlanHomeUI");
                    android.content.Intent intent2 = new android.content.Intent(activityC19015x36b35eb1, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192.class);
                    intent2.putExtra("key_plan_go_scene_ui", 3);
                    intent2.putExtra("key_plan_index_resp", com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.r.s(m85Var));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19015x36b35eb1 activityC19015x36b35eb13 = this.f259717a;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(activityC19015x36b35eb13, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanBeforeHomeUI$1", "netCallback", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC19015x36b35eb13.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(activityC19015x36b35eb13, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanBeforeHomeUI$1", "netCallback", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else {
                at4.j0.c(i19, m85Var.f461772e).a(activityC19015x36b35eb1, true);
            }
        } else {
            at4.j0.b(-1, -1).a(activityC19015x36b35eb1, true);
        }
        activityC19015x36b35eb1.finish();
    }
}
