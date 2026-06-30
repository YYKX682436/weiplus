package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final hk1.e a(com.tencent.mm.plugin.appbrand.o6 runtime) {
        android.view.View rootView;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.page.d5 x07 = runtime.x0();
        android.view.View findViewById = (x07 == null || (rootView = x07.getRootView()) == null) ? null : rootView.findViewById(com.tencent.mm.R.id.w_);
        if (findViewById instanceof hk1.e) {
            return (hk1.e) findViewById;
        }
        return null;
    }
}
