package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes3.dex */
public class y4 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 f239582d;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883) {
        this.f239582d = activityC17133x39d21883;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$36", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883 = this.f239582d;
        if (activityC17133x39d21883.f238893n2 == null) {
            activityC17133x39d21883.f238893n2 = new rl5.r(activityC17133x39d21883.mo55332x76847179());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d218832 = this.f239582d;
        activityC17133x39d218832.f238893n2.h(view, activityC17133x39d218832, activityC17133x39d218832.f238903r2, activityC17133x39d218832.f238895o2, activityC17133x39d218832.f238899p2);
        activityC17133x39d21883.f238901q2 = view.getId();
        yj0.a.i(true, this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$36", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
