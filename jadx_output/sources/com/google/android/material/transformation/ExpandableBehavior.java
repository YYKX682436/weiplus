package com.google.android.material.transformation;

/* loaded from: classes15.dex */
public abstract class ExpandableBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<android.view.View> {

    /* renamed from: d, reason: collision with root package name */
    public int f44623d;

    public ExpandableBehavior() {
        this.f44623d = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        int i17;
        java.lang.Object obj = (da.a) view2;
        boolean z17 = ((com.google.android.material.floatingactionbutton.FloatingActionButton) obj).f44504u.f227727b;
        if (!(!z17 ? this.f44623d != 1 : !((i17 = this.f44623d) == 0 || i17 == 2))) {
            return false;
        }
        this.f44623d = z17 ? 1 : 2;
        return y((android.view.View) obj, view, z17, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17) {
        da.a aVar;
        int i18;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.c(view)) {
            java.util.ArrayList arrayList = (java.util.ArrayList) coordinatorLayout.k(view);
            int size = arrayList.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    aVar = null;
                    break;
                }
                android.view.View view2 = (android.view.View) arrayList.get(i19);
                if (b(coordinatorLayout, view, view2)) {
                    aVar = (da.a) view2;
                    break;
                }
                i19++;
            }
            if (aVar != null) {
                boolean z17 = ((com.google.android.material.floatingactionbutton.FloatingActionButton) aVar).f44504u.f227727b;
                if (!z17 ? this.f44623d != 1 : !((i18 = this.f44623d) == 0 || i18 == 2)) {
                    int i27 = z17 ? 1 : 2;
                    this.f44623d = i27;
                    view.getViewTreeObserver().addOnPreDrawListener(new pa.a(this, view, i27, aVar));
                }
            }
        }
        return false;
    }

    public abstract boolean y(android.view.View view, android.view.View view2, boolean z17, boolean z18);

    public ExpandableBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44623d = 0;
    }
}
