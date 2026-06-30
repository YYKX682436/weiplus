package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class ta implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14009x25c8700f f192095d;

    public ta(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14009x25c8700f activityC14009x25c8700f) {
        this.f192095d = activityC14009x25c8700f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveMentionsUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14009x25c8700f activityC14009x25c8700f = this.f192095d;
        intent.setClass(activityC14009x25c8700f.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14008x2750248c.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14009x25c8700f.mo55332x76847179();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo55332x76847179, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMentionsUI$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x76847179.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMentionsUI$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        activityC14009x25c8700f.getClass();
        java.lang.String valueOf = java.lang.String.valueOf(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(valueOf, b52.b.b(), "person_page_message_page_more", "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMentionsUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
