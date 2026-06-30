package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c4 f198349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198350e;

    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c4 c4Var, java.lang.String str) {
        this.f198349d = c4Var;
        this.f198350e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditWidget$checkEnableAdd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c4 c4Var = this.f198349d;
        int i17 = c4Var.M;
        int i18 = 1;
        if (i17 != 1 && i17 == 2) {
            i18 = 4;
        }
        java.lang.String link = this.f198350e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.x3 x3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.x3(link, c4Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(link, "link");
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x3(link, i18, null, x3Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditWidget$checkEnableAdd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
