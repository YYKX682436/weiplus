package w24;

/* loaded from: classes11.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f524168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17660x9d61a64 f524169e;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17660x9d61a64 c17660x9d61a64, java.lang.String str) {
        this.f524169e = c17660x9d61a64;
        this.f524168d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        w24.t tVar = this.f524169e.f243593q;
        if (tVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.om omVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.om) tVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea = omVar.f242933a;
            java.util.HashMap hashMap = (java.util.HashMap) activityC17463xb337a9ea.f242232v;
            java.lang.String str = this.f524168d;
            java.lang.String string = activityC17463xb337a9ea.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574621iz0, ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17358xfe5b6e70) hashMap.get(str)).f241581e);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea2 = omVar.f242933a;
            db5.e1.A(activityC17463xb337a9ea, string, activityC17463xb337a9ea2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC17463xb337a9ea2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu), activityC17463xb337a9ea2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.nm(omVar, str), null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
