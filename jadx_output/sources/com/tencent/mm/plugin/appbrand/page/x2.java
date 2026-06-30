package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class x2 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.d3 f87243d;

    public x2(com.tencent.mm.plugin.appbrand.page.d3 d3Var) {
        this.f87243d = d3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        java.util.Iterator it = ((java.util.HashSet) this.f87243d.f86516i).iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        java.util.Iterator it = ((java.util.HashSet) this.f87243d.f86517m).iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }
}
