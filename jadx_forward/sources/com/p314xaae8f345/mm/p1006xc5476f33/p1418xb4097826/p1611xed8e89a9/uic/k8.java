package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f205426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f205427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205428f;

    public k8(boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar) {
        this.f205426d = z17;
        this.f205427e = z18;
        this.f205428f = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f205426d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205428f;
        if (z17 && this.f205427e && obVar.h7().E.getVisibility() != 0 && obVar.i7().getVisibility() != 0 && obVar.h7().H.getVisibility() != 0 && obVar.h7().f516093d0.getVisibility() != 0) {
            android.view.View view = (android.view.View) ((jz5.n) obVar.W).mo141623x754a37bb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleLabelLayoutPadding$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleLabelLayoutPadding$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) obVar.W).mo141623x754a37bb()).getLayoutParams();
        jz5.g gVar = obVar.W;
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleLabelLayoutPadding$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleLabelLayoutPadding$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (obVar.i7().getVisibility() == 0) {
            layoutParams.height = i65.a.b(obVar.m80379x76847179(), 12);
        } else {
            layoutParams.height = i65.a.b(obVar.m80379x76847179(), 16);
        }
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setLayoutParams(layoutParams);
    }
}
