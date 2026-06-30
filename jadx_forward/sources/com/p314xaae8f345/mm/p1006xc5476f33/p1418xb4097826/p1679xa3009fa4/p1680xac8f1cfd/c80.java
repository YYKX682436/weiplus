package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class c80 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 f215514d;

    public c80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 abstractC15479x2de36860) {
        this.f215514d = abstractC15479x2de36860;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderTabUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 abstractC15479x2de36860 = this.f215514d;
        abstractC15479x2de36860.k7();
        if (!abstractC15479x2de36860.m158354x19263085().isFinishing()) {
            abstractC15479x2de36860.m158354x19263085().finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTabUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
