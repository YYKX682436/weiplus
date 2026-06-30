package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class wg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI f110698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f110699e;

    public wg(com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI finderNewManagementUI, r45.qt2 qt2Var) {
        this.f110698d = finderNewManagementUI;
        this.f110699e = qt2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderNewManagementUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI finderNewManagementUI = this.f110698d;
        if (finderNewManagementUI.getContext() instanceof com.tencent.mm.ui.MMActivity) {
            android.content.Intent intent2 = !(finderNewManagementUI.getContext() instanceof android.app.Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            intent.setClass(finderNewManagementUI.getContext(), com.tencent.mm.plugin.finder.feed.ui.FinderSettingGameRankUI.class);
            androidx.appcompat.app.AppCompatActivity context = finderNewManagementUI.getContext();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderNewManagementUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/feed/ui/FinderNewManagementUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.W2;
        java.util.HashMap i17 = kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "3"), new jz5.l("type", "3"));
        r45.qt2 qt2Var = this.f110699e;
        zy2.zb.T8(zbVar, t1Var, i17, qt2Var != null ? qt2Var.getString(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)).toString() : null, null, null, false, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderNewManagementUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
