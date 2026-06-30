package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class tb implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ub f292312d;

    public tb(com.p314xaae8f345.mm.ui.p2740x696c9db.ub ubVar) {
        this.f292312d = ubVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ShowImageUI$ImageAdapter$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752 = this.f292312d.f292360n;
        if (activityC22534xec824752.f291727g) {
            activityC22534xec824752.f291736s = 1;
            activityC22534xec824752.Z6();
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/tools/ShowImageUI$ImageAdapter$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
