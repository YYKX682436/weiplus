package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes11.dex */
public class xr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096 f253116d;

    public xr(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096 activityC18116x89222096) {
        this.f253116d = activityC18116x89222096;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096 activityC18116x89222096 = this.f253116d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096.T6(activityC18116x89222096) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTagPartlyUI", "The adapter is null..");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
            return;
        }
        java.lang.Object tag = view.getTag();
        if (tag == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTagPartlyUI", "The tag is null..");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
        } else {
            if (!(tag instanceof java.lang.Integer)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTagPartlyUI", "The tag is not a instance of Integer.");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096.T6(activityC18116x89222096).getItem(((java.lang.Integer) tag).intValue());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096 activityC18116x892220962 = this.f253116d;
            activityC18116x892220962.f248989f = db5.e1.Q(activityC18116x892220962, null, null, true, true, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wr(this));
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f3(3, q2Var.f69153x29d92ad0, q2Var.f69154x183bff00));
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
        }
    }
}
