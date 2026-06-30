package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes5.dex */
public final class m8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255631d;

    public m8(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078) {
        this.f255631d = activityC18639xf6f98078;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$cameraClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255631d;
        if (java.lang.Math.abs(currentTimeMillis - activityC18639xf6f98078.f255116h2) < 1000) {
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$cameraClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        activityC18639xf6f98078.f255116h2 = currentTimeMillis;
        android.view.LayoutInflater.from(activityC18639xf6f98078);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC18639xf6f98078, 1, false);
        db5.g4 g4Var = new db5.g4(activityC18639xf6f98078);
        new db5.g4(activityC18639xf6f98078);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.k8 k8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.k8(activityC18639xf6f98078);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.l8 l8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.l8(activityC18639xf6f98078);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(activityC18639xf6f98078);
        k8Var.mo887xc459429a(g4Var2);
        if (g4Var2.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f293405n = k8Var;
            k0Var.f293414s = l8Var;
            k0Var.f293387d = null;
            k0Var.G = null;
            k0Var.v();
        }
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC18639xf6f98078.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(mo55332x76847179, 8, pj4.h2.class);
        if (h2Var != null) {
            h2Var.E++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$cameraClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
