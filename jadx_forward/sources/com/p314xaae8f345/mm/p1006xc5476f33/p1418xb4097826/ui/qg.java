package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class qg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15065x39babbd f211273d;

    public qg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15065x39babbd activityC15065x39babbd) {
        this.f211273d = activityC15065x39babbd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSettingDetailInfoUI$updateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15065x39babbd activityC15065x39babbd = this.f211273d;
        if (activityC15065x39babbd.f210247i != null) {
            android.content.Intent intent = new android.content.Intent();
            ya2.b2 b2Var = activityC15065x39babbd.f210248m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b2Var);
            intent.putStringArrayListExtra("key_url_list", kz5.c0.d(b2Var.m176700xe5e0d2a0()));
            intent.putExtra("key_preview_avatar", true);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Bj(activityC15065x39babbd, intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSettingDetailInfoUI$updateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
