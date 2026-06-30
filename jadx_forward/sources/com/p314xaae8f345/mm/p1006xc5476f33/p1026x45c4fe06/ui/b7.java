package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f171109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f171110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c7 f171111f;

    public b7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c7 c7Var, android.view.View view, android.view.ViewGroup viewGroup) {
        this.f171111f = c7Var;
        this.f171109d = view;
        this.f171110e = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f171109d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f171110e.removeView(this.f171109d);
        yz5.a aVar = this.f171111f.f171158d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
