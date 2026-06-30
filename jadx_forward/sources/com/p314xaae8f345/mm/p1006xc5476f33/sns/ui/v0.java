package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17947x83d458f1 f252140d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17947x83d458f1 c17947x83d458f1) {
        this.f252140d = c17947x83d458f1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.AtContactWidget$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/AtContactWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17947x83d458f1.f247771p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17947x83d458f1 c17947x83d458f1 = this.f252140d;
        android.view.View view2 = c17947x83d458f1.f247773e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.a5n);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/AtContactWidget$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/AtContactWidget$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.b() || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.c()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("sns_with_together_at_contact_red", 1);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("sns_with_together_at_contact_red_second_version", 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (c17947x83d458f1.f247779n == null) {
            c17947x83d458f1.f247779n = new java.util.LinkedList();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 c18131x711b760 = c17947x83d458f1.f247778m;
        if (c18131x711b760 == null || c18131x711b760.m70809x36bdc8b7() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealAddWithContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            android.content.Intent intent = new android.content.Intent();
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_withta_select_conversation, 0);
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.a() && Ni == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showTeachDialog", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_withta_show_teach_dialog, false)) {
                    c17947x83d458f1.c();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTeachDialog", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV").getBoolean("SnsMMKVWithTaTeachDialog", true)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV").G("SnsMMKVWithTaTeachDialog", false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtContactWiget", "showTeachDialog");
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(c17947x83d458f1.getContext(), 2, 3);
                    z2Var.y(c17947x83d458f1.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                    z2Var.F = new v61.C30646x56d4592(z2Var);
                    z2Var.l(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3() { // from class: com.tencent.mm.plugin.sns.ui.AtContactWidget$$a
                        @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
                        /* renamed from: dismiss */
                        public final void mo2069x63a3b28a() {
                            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17947x83d458f1.f247771p;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17947x83d458f1.this.c();
                        }
                    });
                    z2Var.x(1);
                    z2Var.z(c17947x83d458f1.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aax));
                    z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.cte);
                    z2Var.t(android.view.LayoutInflater.from(c17947x83d458f1.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ctf, (android.view.ViewGroup) null));
                    z2Var.C();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTeachDialog", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                } else {
                    c17947x83d458f1.c();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTeachDialog", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                }
            } else {
                intent.putExtra("Contact_Compose", true);
                intent.putExtra("List_Type", 1);
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.a()) {
                    intent.putExtra("Add_address_titile", c17947x83d458f1.f247772d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jgi));
                    intent.putExtra("address_ui_sub_title", c17947x83d458f1.f247772d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhh));
                    intent.putExtra("footer_tip", c17947x83d458f1.f247772d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhf));
                    intent.putExtra("no_result_tip", c17947x83d458f1.f247772d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8y));
                } else {
                    intent.putExtra("Add_address_titile", c17947x83d458f1.f247772d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhl));
                }
                intent.putExtra("Contact_GroupFilter_Type", "@micromsg.qq.com");
                intent.putExtra("Block_list", c01.z1.r());
                intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c17947x83d458f1.f247779n, ","));
                intent.putExtra("sns_address_count", 0);
                com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
                android.app.Activity activity = c17947x83d458f1.f247772d;
                y7Var.getClass();
                if (activity != null) {
                    intent.setClassName(activity, "com.tencent.mm.ui.contact.SnsAddressUI");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(6);
                    arrayList3.add(intent);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.k(activity, arrayList3.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startSnsAddressUIForResult", "(Landroid/content/Intent;Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealAddWithContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(c17947x83d458f1.getContext());
            u1Var.u(c17947x83d458f1.f247772d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jdy));
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.l_e);
            u1Var.q(false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/AtContactWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.AtContactWidget$1");
    }
}
