package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 f178119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f178121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f178122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 f178123h;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 activityC13155x6eea6ae2, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7, java.lang.String str, int i17, int i18) {
        this.f178123h = activityC13155x6eea6ae2;
        this.f178119d = c5886xd11a0be7;
        this.f178120e = str;
        this.f178121f = i17;
        this.f178122g = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/EditorImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorImageUI", "request deal QBAR string");
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 activityC13155x6eea6ae2 = this.f178123h;
        if (activityC13155x6eea6ae2.f178018n.i()) {
            activityC13155x6eea6ae2.f178018n.u();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7 = this.f178119d;
        if (c5886xd11a0be7 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
        am.r3 r3Var = c5292x67f91197.f135612g;
        r3Var.f89314b = activityC13155x6eea6ae2;
        r3Var.f89313a = this.f178120e;
        r3Var.f89315c = this.f178121f;
        r3Var.f89317e = 8;
        int selectedItemPosition = activityC13155x6eea6ae2.f178013f.getSelectedItemPosition();
        if (-1 == selectedItemPosition) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Editor.EditorImageUI", "error position");
        } else {
            r45.gp0 gp0Var = ((ix1.c) activityC13155x6eea6ae2.f178014g.getItem(selectedItemPosition)).f376857m;
            if (gp0Var != null) {
                r3Var.f89322j = gp0Var.f456967s;
                r3Var.f89323k = gp0Var.f456971u;
            }
        }
        r3Var.f89316d = this.f178122g;
        r3Var.f89325m = c5886xd11a0be7.f136194g.f87901a;
        r3Var.f89327o = true;
        r3Var.f89329q = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.b(c5886xd11a0be7);
        if (activityC13155x6eea6ae2.getIntent() != null) {
            r3Var.f89324l = activityC13155x6eea6ae2.getIntent().getBundleExtra("_stat_obj");
        }
        c5292x67f91197.e();
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
