package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes9.dex */
public class g9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f288262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f288263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288265g;

    public g9(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8, int i17, int i18, java.lang.String str) {
        this.f288265g = activityC22325x8baa24f8;
        this.f288262d = i17;
        this.f288263e = i18;
        this.f288264f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288265g;
        java.lang.String string = activityC22325x8baa24f8.getString(this.f288262d, java.lang.Integer.valueOf(this.f288263e));
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f82 = this.f288265g;
        db5.e1.A(activityC22325x8baa24f8, string, "", activityC22325x8baa24f82.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571444f7), activityC22325x8baa24f82.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2690x38b72420.f9(this), null);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
