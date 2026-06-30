package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes.dex */
public final class fg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18671x7236daa1 f255416d;

    public fg(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18671x7236daa1 activityC18671x7236daa1) {
        this.f255416d = activityC18671x7236daa1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusShowExpireStatusUI$onCreate$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusShowExpireStatusUI", " btnClose OnClickListener ");
        this.f255416d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusShowExpireStatusUI$onCreate$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
