package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f91168d;

    public f0(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f91168d = appBrandInitConfigWC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f91168d;
        com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = appBrandInitConfigWC.f77313z2;
        if (weAppOpenUICallbackIPCProxy == null) {
            new com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$EventOnHalfPageCommonHeaderShareButtonClick(appBrandInitConfigWC.L1.f77373w.f77391e).e();
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String token = appBrandInitConfigWC.L1.f77373w.f77391e;
        kotlin.jvm.internal.o.g(token, "token");
        weAppOpenUICallbackIPCProxy.f84478f.a(new com.tencent.mm.ipcinvoker.type.IPCString(token));
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
