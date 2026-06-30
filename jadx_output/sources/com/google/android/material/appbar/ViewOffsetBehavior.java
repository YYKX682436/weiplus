package com.google.android.material.appbar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class ViewOffsetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.material.appbar.l f44335d;

    /* renamed from: e, reason: collision with root package name */
    public int f44336e;

    public ViewOffsetBehavior() {
        this.f44336e = 0;
    }

    public void A(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17) {
        coordinatorLayout.s(view, i17);
    }

    public boolean B(int i17) {
        com.google.android.material.appbar.l lVar = this.f44335d;
        if (lVar != null) {
            return lVar.a(i17);
        }
        this.f44336e = i17;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17) {
        A(coordinatorLayout, view, i17);
        if (this.f44335d == null) {
            this.f44335d = new com.google.android.material.appbar.l(view);
        }
        com.google.android.material.appbar.l lVar = this.f44335d;
        android.view.View view2 = lVar.f44347a;
        lVar.f44348b = view2.getTop();
        lVar.f44349c = view2.getLeft();
        lVar.b();
        int i18 = this.f44336e;
        if (i18 == 0) {
            return true;
        }
        this.f44335d.a(i18);
        this.f44336e = 0;
        return true;
    }

    public int y() {
        com.google.android.material.appbar.l lVar = this.f44335d;
        if (lVar != null) {
            return lVar.f44350d;
        }
        return 0;
    }

    public int z() {
        return y();
    }

    public ViewOffsetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44336e = 0;
    }
}
