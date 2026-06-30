package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes.dex */
public class o3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f219671d;

    public o3(java.lang.String str) {
        this.f219671d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSUIApiLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(view.getContext(), "com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI");
        java.lang.String str = this.f219671d;
        intent.putExtra("contact_search_query", str);
        intent.addFlags(268435456);
        android.content.Context context = view.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.f219908a;
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w2(2, str), 100L);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
