package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class ip implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f103681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.jp f103682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.o3 f103683f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103684g;

    public ip(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, com.tencent.mm.plugin.finder.convert.jp jpVar, so2.o3 o3Var, in5.s0 s0Var) {
        this.f103681d = weImageView;
        this.f103682e = jpVar;
        this.f103683f = o3Var;
        this.f103684g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert$bindOperateLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f103681d;
        java.lang.Object tag = weImageView.getTag(com.tencent.mm.R.id.qco);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        boolean z17 = !(bool != null ? bool.booleanValue() : false);
        com.tencent.mm.plugin.finder.convert.jp jpVar = this.f103682e;
        yz5.p pVar = jpVar.f103772m;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        so2.o3 o3Var = this.f103683f;
        pVar.invoke(valueOf, o3Var);
        weImageView.setTag(com.tencent.mm.R.id.qco, java.lang.Boolean.valueOf(z17));
        in5.s0 s0Var = this.f103684g;
        if (z17) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_good);
            weImageView.setIconColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.Red_100));
            dm.pd pdVar = o3Var.f410411d;
            int i17 = pdVar.field_extFlag;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            pdVar.field_extFlag = i17 | 128;
            kotlin.jvm.internal.o.d(view);
            hc2.f1.d(view);
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_star_new);
            weImageView.setIconColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.FG_0));
            dm.pd pdVar2 = o3Var.f410411d;
            int i18 = pdVar2.field_extFlag;
            java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            pdVar2.field_extFlag = i18 & (-129);
        }
        long j17 = jpVar.f103770h.f103851a == 2 ? 15L : 14L;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int i19 = jpVar.f103770h.f103851a;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = o3Var.f410411d.field_contact;
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        java.lang.String l17 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.l(finderMsgContract, context, i19, false, str, o3Var.f410411d, false, false, true, true, 100, null);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, context2, j17, 1L, false, jpVar.f103770h.f103851a, 6, l17, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert$bindOperateLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
