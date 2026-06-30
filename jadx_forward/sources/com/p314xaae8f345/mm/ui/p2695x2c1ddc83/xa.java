package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public class xa implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22383x63d1b835 f289781e;

    public xa(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22383x63d1b835 activityC22383x63d1b835, java.lang.String str) {
        this.f289781e = activityC22383x63d1b835;
        this.f289780d = str;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22383x63d1b835 activityC22383x63d1b835 = this.f289781e;
        activityC22383x63d1b835.f288951g = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) activityC22383x63d1b835.f288950f.getItem(i17);
        activityC22383x63d1b835.f288954m = activityC22383x63d1b835.f288951g.h1();
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = activityC22383x63d1b835.f288951g;
        if (l4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServiceNotifyConversationUI", "user should not be null. position:%d, size:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(activityC22383x63d1b835.f288950f.getCount()));
            activityC22383x63d1b835.f288950f.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent(activityC22383x63d1b835, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        if (te5.s1.f500280a.a()) {
            java.lang.String charSequence = view.getTag() instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 ? ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2) view.getTag()).f289419c.m79231xfb85ada3().toString() : null;
            if (android.text.TextUtils.isEmpty(charSequence)) {
                charSequence = cm5.k.b(l4Var.h1(), l4Var.j(), view.getContext());
            }
            intent.putExtra("key_notify_message_title", charSequence);
        }
        intent.putExtra("Chat_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l4Var.W0()) ? l4Var.h1() : l4Var.W0());
        intent.putExtra("key_notify_message_real_username", l4Var.h1());
        intent.putExtra("finish_direct", true);
        intent.putExtra("biz_click_item_unread_count", activityC22383x63d1b835.f288951g.d1());
        intent.putExtra("biz_click_item_position", i17 + 1);
        intent.putExtra("container_enter_scene", 1);
        intent.putExtra("KOpenArticleSceneFromScene", 92);
        intent.putExtra("specific_chat_from_scene", 6);
        intent.putExtra("service_notify_session_id", this.f289780d);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22383x63d1b835 activityC22383x63d1b8352 = this.f289781e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC22383x63d1b8352, arrayList2.toArray(), "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC22383x63d1b8352.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC22383x63d1b8352, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC22383x63d1b835.f288950f.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21825, 5, l4Var.h1(), java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), null, null, 0, 0, 0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qg.c(l4Var.h1())), te5.v1.f500291b);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
