package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public abstract class h5 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f173014a;

    public h5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f5 f5Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final android.view.View a(android.view.View view) {
        android.view.View view2 = this.f173014a;
        if (view2 != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(view2)) {
                return this.f173014a;
            }
        }
        if (view != null) {
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            if (n3.x0.b(view)) {
                for (android.view.View view3 = view.getParent(); view3 instanceof android.view.View; view3 = view3.getParent()) {
                    android.view.View view4 = view3;
                    if (c(view4)) {
                        android.view.View b17 = b(view4);
                        this.f173014a = b17;
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
