package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y f169084d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y yVar) {
        this.f169084d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895 = this.f169084d.f169100a.f169056f;
        if (c12753x672cc895.H) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "showOnLoading");
            android.view.View view = c12753x672cc895.B;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showOnLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showOnLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
