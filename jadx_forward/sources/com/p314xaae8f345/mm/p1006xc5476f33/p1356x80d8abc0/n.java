package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes12.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.ActivityC13198x17b4d807 f178401d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.ActivityC13198x17b4d807 activityC13198x17b4d807) {
        this.f178401d = activityC13198x17b4d807;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/dbbackup/DBRecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (gm0.j1.u().m() == null) {
            db5.e1.i(this.f178401d, com.p314xaae8f345.mm.R.C30867xcad56011.bn9, 0);
            yj0.a.h(this, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.ActivityC13198x17b4d807 activityC13198x17b4d807 = this.f178401d;
        if (activityC13198x17b4d807.f178319m != 0) {
            db5.e1.l(activityC13198x17b4d807, com.p314xaae8f345.mm.R.C30867xcad56011.f572567bn2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.bnb, com.p314xaae8f345.mm.R.C30867xcad56011.f572570bn5, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.m(this), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560235ej);
        } else {
            activityC13198x17b4d807.V6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
