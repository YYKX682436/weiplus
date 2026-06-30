package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes.dex */
public class p5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f224515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d f224516e;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d activityC16151x42cade4d, android.widget.TextView textView) {
        this.f224516e = activityC16151x42cade4d;
        this.f224515d = textView;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d activityC16151x42cade4d = this.f224516e;
        activityC16151x42cade4d.getClass();
        android.view.LayoutInflater.from(activityC16151x42cade4d);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC16151x42cade4d, 1, false);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.q5 q5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.q5(activityC16151x42cade4d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.r5 r5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.r5(activityC16151x42cade4d, this.f224515d);
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
            h4Var.f309914y = null;
            h4Var.f309915z = null;
        }
        arrayList2.clear();
        db5.g4 g4Var = new db5.g4(activityC16151x42cade4d);
        q5Var.mo887xc459429a(g4Var);
        if (g4Var.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f293405n = q5Var;
            k0Var.f293414s = r5Var;
            k0Var.f293387d = null;
            k0Var.G = null;
            k0Var.v();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
