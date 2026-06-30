package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class t9 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f90237e;

    public t9(java.lang.String str, java.lang.ref.WeakReference weakReference) {
        this.f90236d = str;
        this.f90237e = weakReference;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIMoveTaskToBackGuardIPCHelper", "callback invoke, key:" + this.f90236d);
        com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = (com.tencent.mm.plugin.appbrand.ui.AppBrandUI) this.f90237e.get();
        if (appBrandUI != null) {
            appBrandUI.n7();
        }
    }
}
