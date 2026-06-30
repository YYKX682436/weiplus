package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class mg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11465x677338b2 f155579d;

    public mg(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11465x677338b2 activityC11465x677338b2) {
        this.f155579d = activityC11465x677338b2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegByMobileVoiceVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11465x677338b2 activityC11465x677338b2 = this.f155579d;
        int i17 = activityC11465x677338b2.f155159m;
        if (i17 == 0 || i17 == 2 || i17 == 3) {
            activityC11465x677338b2.f155157h = new h11.e(activityC11465x677338b2.f155153d, i17 != 0 ? i17 != 2 ? 16 : 8 : 14, "", 1, activityC11465x677338b2.f155155f);
            gm0.j1.d().g(activityC11465x677338b2.f155157h);
            db5.e1.m(activityC11465x677338b2, com.p314xaae8f345.mm.R.C30867xcad56011.ahv, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.kg(this));
        } else if (i17 == 4 || i17 == 1) {
            activityC11465x677338b2.f155158i = new r61.e1(activityC11465x677338b2.f155153d, 1, "", 1, activityC11465x677338b2.f155155f, "");
            gm0.j1.d().g(activityC11465x677338b2.f155158i);
            db5.e1.m(activityC11465x677338b2, com.p314xaae8f345.mm.R.C30867xcad56011.ahv, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.lg(this));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegByMobileVoiceVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
