package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class ex implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw f249803d;

    public ex(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw kwVar) {
        this.f249803d = kwVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$27");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineClickEvent", "noteLinkRedirectListener");
        if (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.E(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.b(this.f249803d), (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) view.getTag());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$27");
    }
}
