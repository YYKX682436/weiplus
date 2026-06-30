package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class j4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f259757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 f259758b;

    public j4(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c4, android.app.Dialog dialog) {
        this.f259758b = activityC19016xf99a44c4;
        this.f259757a = dialog;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.jg5 jg5Var = (r45.jg5) obj;
        java.lang.String str = jg5Var.f459330f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c4 = this.f259758b;
        activityC19016xf99a44c4.f259538f = str;
        java.util.LinkedList linkedList = jg5Var.f459331g;
        if (linkedList.size() != 0) {
            java.util.List list = activityC19016xf99a44c4.f259539g;
            ((java.util.ArrayList) list).addAll(linkedList);
            activityC19016xf99a44c4.B = false;
            java.lang.String str2 = activityC19016xf99a44c4.f259538f;
            if (str2 != null) {
                activityC19016xf99a44c4.f259546q.setText(str2);
            }
            if (list != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (!arrayList.isEmpty()) {
                    activityC19016xf99a44c4.A += arrayList.size();
                    activityC19016xf99a44c4.f259541i.notifyDataSetChanged();
                }
            }
        } else {
            activityC19016xf99a44c4.B = true;
        }
        if (activityC19016xf99a44c4.C && linkedList.size() == 0) {
            activityC19016xf99a44c4.f259547r.setText(activityC19016xf99a44c4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kq8));
            activityC19016xf99a44c4.f259547r.setVisibility(0);
            activityC19016xf99a44c4.f259549t.setVisibility(8);
            android.view.View view = activityC19016xf99a44c4.f259553x;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$3", "call", "(Lcom/tencent/mm/protocal/protobuf/QryAutoPlanOrderListResp;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$3", "call", "(Lcom/tencent/mm/protocal/protobuf/QryAutoPlanOrderListResp;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC19016xf99a44c4.C = false;
        } else {
            activityC19016xf99a44c4.f259548s.setVisibility(0);
            activityC19016xf99a44c4.f259549t.setVisibility(0);
            android.view.View view2 = activityC19016xf99a44c4.f259553x;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$3", "call", "(Lcom/tencent/mm/protocal/protobuf/QryAutoPlanOrderListResp;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$3", "call", "(Lcom/tencent/mm/protocal/protobuf/QryAutoPlanOrderListResp;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC19016xf99a44c4.f259547r.setVisibility(8);
            activityC19016xf99a44c4.C = false;
        }
        this.f259757a.dismiss();
        return null;
    }
}
