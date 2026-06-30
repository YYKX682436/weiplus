package cw1;

/* loaded from: classes12.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f304431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f304432e;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d) {
        this.f304432e = activityC13111x890e232d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f304431d) {
            yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d = this.f304432e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13111x890e232d);
        u1Var.k(activityC13111x890e232d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.b7q);
        u1Var.g(activityC13111x890e232d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7t));
        u1Var.l(new cw1.c2(activityC13111x890e232d, false));
        u1Var.i(null);
        u1Var.e(new cw1.d2(this));
        u1Var.q(false);
        this.f304431d = true;
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
