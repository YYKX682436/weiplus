package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class m2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z2 f206155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cq2 f206156e;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z2 z2Var, r45.cq2 cq2Var) {
        this.f206155d = z2Var;
        this.f206156e = cq2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderPostPlayBannerWidget$handlePostPlayBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.cq2 cq2Var = this.f206156e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z2 z2Var = this.f206155d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = z2Var.f206378a;
        try {
            java.util.LinkedList idea_list = cq2Var.f453317d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(idea_list, "idea_list");
            if (!idea_list.isEmpty()) {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14068xa373942a.class);
                java.lang.String str = cq2Var.f453319f;
                if (str == null) {
                    str = "";
                }
                intent.putExtra("by_pass", str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                intent.putExtra("key_from_comment_scene", nyVar != null ? nyVar.f216913n : 0);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = z2Var.f206378a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC0065xcd7aa112, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/widget/HeaderPostPlayBannerWidget", "jumpToPostPlayList", "(Lcom/tencent/mm/protocal/protobuf/FinderPostPlayBanner;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC0065xcd7aa112.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC0065xcd7aa112, "com/tencent/mm/plugin/finder/profile/widget/HeaderPostPlayBannerWidget", "jumpToPostPlayList", "(Lcom/tencent/mm/protocal/protobuf/FinderPostPlayBanner;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HeaderPostPlayBannerWidget", "jumpToPostPlayList error: " + e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderPostPlayBannerWidget$handlePostPlayBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
