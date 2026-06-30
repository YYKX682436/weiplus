package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public class q0 implements com.tencent.mm.plugin.appbrand.platform.window.activity.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f87640a;

    public q0(android.app.Activity activity) {
        this.f87640a = activity;
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.m0
    public boolean a() {
        return nf.x.f336615a.h(this.f87640a);
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.m0
    public void b(android.view.WindowManager.LayoutParams layoutParams) {
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.m0
    public int c() {
        android.app.Activity activity = this.f87640a;
        if (activity == null) {
            return 0;
        }
        nf.y yVar = nf.x.f336616b;
        return yVar != null ? yVar.c(activity) : com.tencent.mm.ui.v9.b(activity);
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.m0
    public void d(android.content.res.Configuration configuration) {
    }
}
