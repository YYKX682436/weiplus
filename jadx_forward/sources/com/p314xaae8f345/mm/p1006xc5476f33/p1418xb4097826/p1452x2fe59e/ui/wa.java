package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class wa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14012x51a69428 f192226d;

    public wa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14012x51a69428 activityC14012x51a69428) {
        this.f192226d = activityC14012x51a69428;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14012x51a69428 activityC14012x51a69428 = this.f192226d;
        if (activityC14012x51a69428.mo55332x76847179() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            android.content.Intent intent2 = !(activityC14012x51a69428.mo55332x76847179() instanceof android.app.Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            intent.putExtra("KEY_CAN_MODEI_ALIAS", true);
            intent.putExtra("KEY_SOURCE", 2);
            intent.putExtra("KEY_IS_FROM_SETTING", true);
            intent.setClassName(activityC14012x51a69428.mo55332x76847179(), "com.tencent.mm.plugin.finder.feed.ui.FinderSelectIdentityUI");
            activityC14012x51a69428.mo55332x76847179().startActivityForResult(intent, 1001);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
