package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f87069a = new java.util.HashMap();

    public final android.view.View a(java.lang.Class clazz, android.content.Context ctx) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        kotlin.jvm.internal.o.g(ctx, "ctx");
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f87069a.get(clazz);
        android.view.View view = linkedList != null ? (android.view.View) linkedList.pollFirst() : null;
        if (!(view instanceof android.view.View)) {
            view = null;
        }
        if (view != null) {
            float f17 = ctx.getResources().getDisplayMetrics().density;
            float f18 = view.getContext().getResources().getDisplayMetrics().density;
            if (!(f17 == f18)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDecorWidgetFactoryWC", "getPreloadedWidget: [%s]([%f]) preloaded but outer density([%f]) has changed, ret null", clazz.getCanonicalName(), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
                return null;
            }
        }
        return view;
    }
}
