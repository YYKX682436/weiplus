package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes11.dex */
public class y2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd f176992d;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd activityC13056x715f08fd) {
        this.f176992d = activityC13056x715f08fd;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardListSelectedUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd activityC13056x715f08fd = this.f176992d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13056x715f08fd.E)) {
            lu1.d.k(activityC13056x715f08fd, activityC13056x715f08fd.E, activityC13056x715f08fd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ath));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
