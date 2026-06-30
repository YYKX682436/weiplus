package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public abstract class h5 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f91481a;

    public h5(com.tencent.mm.plugin.appbrand.widget.input.f5 f5Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final android.view.View a(android.view.View view) {
        android.view.View view2 = this.f91481a;
        if (view2 != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(view2)) {
                return this.f91481a;
            }
        }
        if (view != null) {
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            if (n3.x0.b(view)) {
                for (android.view.View view3 = view.getParent(); view3 instanceof android.view.View; view3 = view3.getParent()) {
                    android.view.View view4 = view3;
                    if (c(view4)) {
                        android.view.View b17 = b(view4);
                        this.f91481a = b17;
                        return b17;
                    }
                }
            }
        }
        return null;
    }

    public abstract android.view.View b(android.view.View view);

    public abstract boolean c(android.view.View view);
}
