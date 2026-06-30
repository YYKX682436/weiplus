package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class k4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15977x7ee4409d f222980d;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15977x7ee4409d activityC15977x7ee4409d) {
        this.f222980d = activityC15977x7ee4409d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameLibraryUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = view.getTag() instanceof java.lang.String;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15977x7ee4409d activityC15977x7ee4409d = this.f222980d;
        if (z17) {
            r53.f.I(view, activityC15977x7ee4409d);
            i17 = 7;
        } else {
            android.content.Intent intent = new android.content.Intent(activityC15977x7ee4409d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15944xcd1fadc4.class);
            intent.putExtra("extra_type", 2);
            intent.putExtra("extra_category_name", activityC15977x7ee4409d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fmt));
            intent.putExtra("game_report_from_scene", 1113);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15977x7ee4409d activityC15977x7ee4409d2 = this.f222980d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC15977x7ee4409d2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameLibraryUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC15977x7ee4409d2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC15977x7ee4409d2, "com/tencent/mm/plugin/game/ui/GameLibraryUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            i17 = 6;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15977x7ee4409d activityC15977x7ee4409d3 = this.f222980d;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(activityC15977x7ee4409d3, 11, 1113, 1, i17, activityC15977x7ee4409d3.A, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
