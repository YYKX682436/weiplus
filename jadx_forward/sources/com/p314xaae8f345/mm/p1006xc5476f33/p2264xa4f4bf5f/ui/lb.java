package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class lb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255588d;

    public lb(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078) {
        this.f255588d = activityC18639xf6f98078;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        pj4.k2 k2Var;
        java.util.ArrayList<java.lang.String> arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$visibilityClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255099u2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255588d;
        android.content.Intent className = activityC18639xf6f98078.C7() ? new android.content.Intent().setClassName(activityC18639xf6f98078, "com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI") : new android.content.Intent().setClassName(activityC18639xf6f98078, "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(className);
        if (activityC18639xf6f98078.C7() && (arrayList = activityC18639xf6f98078.f255106c2) != null) {
            className.putStringArrayListExtra("label_id", arrayList);
        }
        className.putExtra("KLabel_range_index", activityC18639xf6f98078.Y1);
        className.putExtra("Klabel_name_list", activityC18639xf6f98078.Z1);
        className.putExtra("Kother_user_name_list", activityC18639xf6f98078.f255104a2);
        className.putExtra("Kchat_room_name_list", activityC18639xf6f98078.f255105b2);
        className.putExtra("k_show_private", false);
        className.putExtra("k_show_include", false);
        activityC18639xf6f98078.getClass();
        className.putExtra("k_sns_label_ui_style", 0);
        if (activityC18639xf6f98078.Y1 == 0 && (k2Var = (pj4.k2) ((jz5.n) activityC18639xf6f98078.f255114g2).mo141623x754a37bb()) != null) {
            className.putExtra("k_last_range_visible_state", k2Var.f436692d);
            className.putExtra("k_last_range_label_list", k2Var.f436694f);
            className.putExtra("k_last_range_user_list", k2Var.f436693e);
        }
        activityC18639xf6f98078.startActivityForResult(className, 4);
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC18639xf6f98078.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(mo55332x76847179, 8, pj4.h2.class);
        if (h2Var != null) {
            h2Var.I++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$visibilityClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
