package com.p314xaae8f345.mm.ui.p2649x8f4dc54e;

/* loaded from: classes11.dex */
public class a implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b f279573d;

    public a(com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b) {
        this.f279573d = activityC21598xfb43db0b;
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
        yj0.a.b("com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b = this.f279573d;
        activityC21598xfb43db0b.f279556g = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) activityC21598xfb43db0b.f279555f.getItem(i17);
        activityC21598xfb43db0b.f279561o = activityC21598xfb43db0b.f279556g.h1();
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = activityC21598xfb43db0b.f279556g;
        if (l4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandServiceConversationUI", "user should not be null. position:%d, size:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(activityC21598xfb43db0b.f279555f.getCount()));
            activityC21598xfb43db0b.f279555f.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent(activityC21598xfb43db0b, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        intent.putExtra("Chat_User", l4Var.h1());
        intent.putExtra("finish_direct", true);
        intent.putExtra("biz_click_item_unread_count", activityC21598xfb43db0b.f279556g.d1());
        intent.putExtra("biz_click_item_position", i17 + 1);
        intent.putExtra("KOpenArticleSceneFromScene", 287);
        intent.putExtra("specific_chat_from_scene", 14);
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b2 = this.f279573d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC21598xfb43db0b2, arrayList2.toArray(), "com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$11", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC21598xfb43db0b2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC21598xfb43db0b2, "com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$11", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.l lVar = activityC21598xfb43db0b.f279555f;
        lVar.getClass();
        lVar.x(l4Var, ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).J(l4Var), i17, true, view);
        yj0.a.h(this, "com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
