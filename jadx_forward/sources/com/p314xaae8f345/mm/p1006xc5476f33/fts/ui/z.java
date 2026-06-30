package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15591x5482e11c f219918d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15591x5482e11c activityC15591x5482e11c) {
        this.f219918d = activityC15591x5482e11c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddWw$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15591x5482e11c activityC15591x5482e11c = this.f219918d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC15591x5482e11c.f219443n)) {
            activityC15591x5482e11c.D = true;
            su4.k3.c(activityC15591x5482e11c.f219443n, activityC15591x5482e11c.E, 1, 16);
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15591x5482e11c.P;
        activityC15591x5482e11c.g7();
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSAddWw$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
