package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class fg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15062xd67d4d74 f210771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f210772e;

    public fg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15062xd67d4d74 activityC15062xd67d4d74, ya2.b2 b2Var) {
        this.f210771d = activityC15062xd67d4d74;
        this.f210772e = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String D0 = this.f210772e.D0();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15062xd67d4d74.E;
        this.f210771d.c7(D0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
