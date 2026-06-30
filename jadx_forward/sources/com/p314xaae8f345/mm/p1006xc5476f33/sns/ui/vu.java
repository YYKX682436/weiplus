package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class vu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 f252248d;

    public vu(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17) {
        this.f252248d = activityC18141xfedff17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$14");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUserUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.V;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17 = this.f252248d;
        activityC18141xfedff17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showSnsDatePicker", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserUI", "showSnsDatePicker: ");
        ca4.r0 r0Var = activityC18141xfedff17.H;
        if (r0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r0Var.f121542a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(activityC18141xfedff17.H.f121543b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsUserUI", "mDateInfo == null or displayYears == null or displayMonths == null, don't do anything");
        } else {
            activityC18141xfedff17.f249130f.j();
            ca4.r0 r0Var2 = activityC18141xfedff17.H;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(activityC18141xfedff17, r0Var2.f121542a, r0Var2.f121543b);
            c0Var.g(android.view.View.inflate(activityC18141xfedff17.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f571065cv2, null));
            int indexOf = activityC18141xfedff17.H.f121542a.indexOf(java.lang.String.valueOf(activityC18141xfedff17.C));
            int indexOf2 = (indexOf < 0 || indexOf >= activityC18141xfedff17.H.f121543b.size() || activityC18141xfedff17.H.f121543b.get(indexOf) == null) ? -1 : ((java.util.List) activityC18141xfedff17.H.f121543b.get(indexOf)).indexOf(java.lang.String.valueOf(activityC18141xfedff17.D));
            if (indexOf != -1 && indexOf2 != -1) {
                c0Var.j(indexOf, indexOf2);
            } else if (indexOf != -1) {
                c0Var.i(indexOf);
            } else if (indexOf2 != -1) {
                c0Var.j(0, indexOf2);
            }
            c0Var.f293792t = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wu(activityC18141xfedff17, c0Var);
            c0Var.l();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showSnsDatePicker", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.e7(activityC18141xfedff17) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342 e76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.e7(activityC18141xfedff17);
            e76.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onIsLoading", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17969xa50b38d6 c17969xa50b38d6 = e76.f249024o;
            c17969xa50b38d6.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLoading", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
            c17969xa50b38d6.f247859f.setVisibility(0);
            c17969xa50b38d6.f247860g.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLoading", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onIsLoading", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsUserUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$14");
    }
}
