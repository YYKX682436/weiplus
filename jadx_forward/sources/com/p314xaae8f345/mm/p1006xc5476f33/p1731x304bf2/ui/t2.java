package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15954xd8d7563b f223295d;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15954xd8d7563b activityC15954xd8d7563b) {
        this.f223295d = activityC15954xd8d7563b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameDetailUI2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15954xd8d7563b activityC15954xd8d7563b = this.f223295d;
        if (activityC15954xd8d7563b.f222285n) {
            activityC15954xd8d7563b.f222283i.setMaxLines(3);
            activityC15954xd8d7563b.f222284m.setText(activityC15954xd8d7563b.getResources().getText(com.p314xaae8f345.mm.R.C30867xcad56011.flo));
            activityC15954xd8d7563b.f222285n = false;
        } else {
            activityC15954xd8d7563b.f222283i.setMaxLines(100);
            activityC15954xd8d7563b.f222284m.setText(activityC15954xd8d7563b.getResources().getText(com.p314xaae8f345.mm.R.C30867xcad56011.flp));
            activityC15954xd8d7563b.f222285n = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
