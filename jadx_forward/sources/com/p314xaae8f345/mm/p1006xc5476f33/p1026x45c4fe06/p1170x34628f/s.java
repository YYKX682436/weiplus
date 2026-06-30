package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f168602a = new java.util.HashMap();

    public final android.view.View a(java.lang.Class clazz, android.content.Context ctx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f168602a.get(clazz);
        android.view.View view = linkedList != null ? (android.view.View) linkedList.pollFirst() : null;
        if (!(view instanceof android.view.View)) {
            view = null;
        }
        if (view != null) {
            float f17 = ctx.getResources().getDisplayMetrics().density;
            float f18 = view.getContext().getResources().getDisplayMetrics().density;
            if (!(f17 == f18)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDecorWidgetFactoryWC", "getPreloadedWidget: [%s]([%f]) preloaded but outer density([%f]) has changed, ret null", clazz.getCanonicalName(), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
                return null;
            }
        }
        return view;
    }
}
