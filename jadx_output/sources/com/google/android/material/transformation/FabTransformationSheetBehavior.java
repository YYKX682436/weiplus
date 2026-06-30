package com.google.android.material.transformation;

/* loaded from: classes13.dex */
public class FabTransformationSheetBehavior extends com.google.android.material.transformation.FabTransformationBehavior {

    /* renamed from: m, reason: collision with root package name */
    public java.util.Map f44631m;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public pa.g E(android.content.Context context, boolean z17) {
        int i17 = z17 ? com.tencent.mm.R.animator.f477971p : com.tencent.mm.R.animator.f477970o;
        pa.g gVar = new pa.g();
        gVar.f352942a = w9.h.b(context, i17);
        gVar.f352943b = new w9.j(17, 0.0f, 0.0f);
        return gVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean y(android.view.View view, android.view.View view2, boolean z17, boolean z18) {
        android.view.ViewParent parent = view2.getParent();
        if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z17) {
                this.f44631m = new java.util.HashMap(childCount);
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = coordinatorLayout.getChildAt(i17);
                boolean z19 = (childAt.getLayoutParams() instanceof androidx.coordinatorlayout.widget.c) && (((androidx.coordinatorlayout.widget.c) childAt.getLayoutParams()).f11006a instanceof com.google.android.material.transformation.FabTransformationScrimBehavior);
                if (childAt != view2 && !z19) {
                    if (z17) {
                        ((java.util.HashMap) this.f44631m).put(childAt, java.lang.Integer.valueOf(childAt.getImportantForAccessibility()));
                        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                        n3.u0.s(childAt, 4);
                    } else {
                        java.util.Map map = this.f44631m;
                        if (map != null && ((java.util.HashMap) map).containsKey(childAt)) {
                            int intValue = ((java.lang.Integer) ((java.util.HashMap) this.f44631m).get(childAt)).intValue();
                            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                            n3.u0.s(childAt, intValue);
                        }
                    }
                }
            }
            if (!z17) {
                this.f44631m = null;
            }
        }
        super.y(view, view2, z17, z18);
        return true;
    }

    public FabTransformationSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
