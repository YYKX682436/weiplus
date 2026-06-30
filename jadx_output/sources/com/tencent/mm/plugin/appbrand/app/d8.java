package com.tencent.mm.plugin.appbrand.app;

@j95.b
/* loaded from: classes7.dex */
public final class d8 extends i95.w implements com.tencent.mm.plugin.appbrand.jsapi.media.w {
    public void wi(final android.content.Context activity, final com.tencent.mm.plugin.appbrand.jsapi.l component, final java.lang.Runnable runnable, final java.lang.Runnable runnable2) {
        if (!com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.app.d8$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.app.d8.this.wi(activity, component, runnable, runnable2);
                }
            });
            return;
        }
        jz5.g gVar = com.tencent.mm.plugin.appbrand.utils.o0.f90521a;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(component, "component");
        if (activity instanceof android.app.Activity) {
            ((com.tencent.mm.plugin.appbrand.utils.j0) ((jz5.n) com.tencent.mm.plugin.appbrand.utils.o0.f90521a).getValue()).c((android.app.Activity) activity, component, "android.permission.WRITE_EXTERNAL_STORAGE", new com.tencent.mm.plugin.appbrand.utils.n0(runnable, runnable2));
        } else if (runnable2 != null) {
            runnable2.run();
        }
    }
}
