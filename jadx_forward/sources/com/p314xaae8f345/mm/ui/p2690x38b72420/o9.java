package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class o9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288599d;

    public o9(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8) {
        this.f288599d = activityC22325x8baa24f8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288599d;
        if (activityC22325x8baa24f8.G1 || activityC22325x8baa24f8.K1) {
            db5.e1.y(activityC22325x8baa24f8, activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.htx), "", activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), new com.p314xaae8f345.mm.ui.p2690x38b72420.m9(this));
            a14.a.a().f82124j++;
        } else if (activityC22325x8baa24f8.H1 || activityC22325x8baa24f8.L1) {
            db5.e1.y(activityC22325x8baa24f8, activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.htw), "", activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), new com.p314xaae8f345.mm.ui.p2690x38b72420.n9(this));
            a14.a.a().f82125k++;
            a14.a.a().f82123i++;
        } else {
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.w7(activityC22325x8baa24f8);
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
