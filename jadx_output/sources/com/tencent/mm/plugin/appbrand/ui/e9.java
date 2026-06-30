package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class e9 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.c9 f89687d;

    public e9(com.tencent.mm.plugin.appbrand.ui.c9 c9Var) {
        this.f89687d = c9Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17;
        com.tencent.mm.plugin.appbrand.ui.c9 c9Var = this.f89687d;
        android.widget.FrameLayout frameLayout = c9Var.K;
        if (frameLayout == null) {
            return true;
        }
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        if (q75.a.a(c9Var.getContext()) == null) {
            return true;
        }
        int[] iArr = new int[2];
        c9Var.getLocationInWindow(iArr);
        if (iArr[1] != 0) {
            return true;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(c9Var);
        if (a17 != null && (i17 = a17.f334338a.h(1).f247045b) > 0) {
            c9Var.n6(i17);
        }
        return true;
    }
}
