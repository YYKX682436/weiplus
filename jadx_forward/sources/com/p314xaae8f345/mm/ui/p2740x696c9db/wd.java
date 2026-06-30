package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class wd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22562x445aade9 f292422d;

    public wd(com.p314xaae8f345.mm.ui.p2740x696c9db.C22562x445aade9 c22562x445aade9) {
        this.f292422d = c22562x445aade9;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ZoneSelectOtherCountryPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2740x696c9db.xd xdVar = this.f292422d.M;
        if (xdVar != null) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.f7 f7Var = (com.p314xaae8f345.mm.ui.p2740x696c9db.f7) xdVar;
            f7Var.getClass();
            com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22513x4a79ed20 activityC22513x4a79ed20 = f7Var.f291950a;
            android.content.Intent intent = new android.content.Intent(activityC22513x4a79ed20, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22513x4a79ed20.class);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("GetAddress", activityC22513x4a79ed20.f291636q);
            bundle.putBoolean("ShowSelectedLocation", activityC22513x4a79ed20.f291638s);
            bundle.putBoolean("IsSelectNonChinaCountry", true);
            bundle.putBoolean("IsAutoPosition", false);
            bundle.putBoolean("IsNeedShowSearchBar", true);
            intent.putExtras(bundle);
            if (!activityC22513x4a79ed20.C.isEmpty()) {
                intent.putStringArrayListExtra("BlockedCountries", activityC22513x4a79ed20.C);
            }
            activityC22513x4a79ed20.startActivityForResult(intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/ZoneSelectOtherCountryPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
