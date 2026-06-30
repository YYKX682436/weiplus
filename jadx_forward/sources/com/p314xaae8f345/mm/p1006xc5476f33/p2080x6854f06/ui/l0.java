package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f243837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17679x4e14a258 f243838e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17679x4e14a258 activityC17679x4e14a258, android.view.View view) {
        this.f243838e = activityC17679x4e14a258;
        this.f243837d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17679x4e14a258 activityC17679x4e14a258 = this.f243838e;
        int i17 = activityC17679x4e14a258.f243748g + 8;
        activityC17679x4e14a258.f243748g = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.g gVar = activityC17679x4e14a258.f243746e;
        gVar.c();
        gVar.f243798p = i17;
        gVar.q();
        if (activityC17679x4e14a258.f243749h <= activityC17679x4e14a258.f243748g) {
            activityC17679x4e14a258.f243747f.removeFooterView(this.f243837d);
            int i18 = activityC17679x4e14a258.f243748g;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
