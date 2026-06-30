package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class s5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18630xe2209fff f255815d;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18630xe2209fff activityC18630xe2209fff) {
        this.f255815d = activityC18630xe2209fff;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18630xe2209fff activityC18630xe2209fff = this.f255815d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC18630xe2209fff.mo55332x76847179();
        android.view.LayoutInflater.from(mo55332x76847179);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179, 1, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.o5 o5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.o5(activityC18630xe2209fff);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p5 p5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p5(activityC18630xe2209fff, ((mj4.k) activityC18630xe2209fff.U6()).l());
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it6.next());
            h4Var.f309914y = null;
            h4Var.f309915z = null;
        }
        arrayList.clear();
        db5.g4 g4Var = new db5.g4(mo55332x76847179);
        o5Var.mo887xc459429a(g4Var);
        if (g4Var.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f293405n = o5Var;
            k0Var.f293414s = p5Var;
            k0Var.f293387d = null;
            k0Var.G = null;
            k0Var.v();
        }
        return true;
    }
}
