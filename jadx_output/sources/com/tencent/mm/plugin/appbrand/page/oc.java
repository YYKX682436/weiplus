package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class oc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f86972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.pc f86973e;

    public oc(com.tencent.mm.plugin.appbrand.page.pc pcVar, android.view.View view) {
        this.f86973e = pcVar;
        this.f86972d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        android.view.View view = this.f86972d;
        if (n3.x0.b(view) && !n3.x0.c(view)) {
            java.lang.String str = this.f86973e.f87016d.f86375m;
            view.forceLayout();
            android.view.ViewParent parent = view.getParent();
            do {
                ((android.view.View) parent).forceLayout();
                parent = parent.getParent();
            } while (parent instanceof android.view.View);
            if (parent != null) {
                parent.requestLayout();
            }
        }
    }
}
