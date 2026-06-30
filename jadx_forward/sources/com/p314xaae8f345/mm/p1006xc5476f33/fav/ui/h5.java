package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 f182666d;

    public h5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257) {
        this.f182666d = activityC13570xd6b9f257;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavSearchUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.N;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = this.f182666d;
        if (activityC13570xd6b9f257.a7()) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            activityC13570xd6b9f257.finish();
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
