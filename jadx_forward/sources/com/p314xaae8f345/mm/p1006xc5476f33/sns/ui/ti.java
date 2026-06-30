package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ti implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 f252058d;

    public ti(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205) {
        this.f252058d = c18062xf8f7b205;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 pj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205 = this.f252058d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(c18062xf8f7b205.f248700f, true);
        if (n17 == null || !(n17.r2() || c18062xf8f7b205.f248705n)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            android.content.Context context = c18062xf8f7b205.f248703i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            android.content.Intent intent = ((android.app.Activity) context).getIntent();
            intent.putExtra("Contact_User", c18062xf8f7b205.f248700f);
            com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            android.content.Context context2 = c18062xf8f7b205.f248703i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            y7Var.l(intent, context2);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", c18062xf8f7b205.f248700f);
            java.lang.String str = c18062xf8f7b205.f248700f;
            if (str != null && str.length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                int i17 = c18062xf8f7b205.f248704m;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                intent2.putExtra("CONTACT_INFO_UI_SOURCE", i17 == 1 ? 101 : 1);
                com.p314xaae8f345.mm.app.y7 y7Var2 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                android.content.Context context3 = c18062xf8f7b205.f248703i;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                y7Var2.l(intent2, context3);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$1");
    }
}
