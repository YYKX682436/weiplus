package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309;

/* renamed from: com.google.android.material.transformation.FabTransformationSheetBehavior */
/* loaded from: classes13.dex */
public class C2726xd3a2f4e1 extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2724x48049842 {

    /* renamed from: m, reason: collision with root package name */
    public java.util.Map f126164m;

    public C2726xd3a2f4e1() {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2724x48049842
    public pa.g E(android.content.Context context, boolean z17) {
        int i17 = z17 ? com.p314xaae8f345.mm.R.C30855xd09a2ae7.f559504p : com.p314xaae8f345.mm.R.C30855xd09a2ae7.f559503o;
        pa.g gVar = new pa.g();
        gVar.f434475a = w9.h.b(context, i17);
        gVar.f434476b = new w9.j(17, 0.0f, 0.0f);
        return gVar;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2723x75b6e8af, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2722x95223586
    public boolean y(android.view.View view, android.view.View view2, boolean z17, boolean z18) {
        android.view.ViewParent parent = view2.getParent();
        if (parent instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) {
            p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = (p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) parent;
            int childCount = c1081xa22a3e5a.getChildCount();
            if (z17) {
                this.f126164m = new java.util.HashMap(childCount);
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = c1081xa22a3e5a.getChildAt(i17);
                boolean z19 = (childAt.getLayoutParams() instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c) && (((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) childAt.getLayoutParams()).f92539a instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.C2725xe8948);
                if (childAt != view2 && !z19) {
                    if (z17) {
                        ((java.util.HashMap) this.f126164m).put(childAt, java.lang.Integer.valueOf(childAt.getImportantForAccessibility()));
                        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                        n3.u0.s(childAt, 4);
                    } else {
                        java.util.Map map = this.f126164m;
                        if (map != null && ((java.util.HashMap) map).containsKey(childAt)) {
                            int intValue = ((java.lang.Integer) ((java.util.HashMap) this.f126164m).get(childAt)).intValue();
                            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                            n3.u0.s(childAt, intValue);
                        }
                    }
                }
            }
            if (!z17) {
                this.f126164m = null;
            }
        }
        super.y(view, view2, z17, z18);
        return true;
    }

    public C2726xd3a2f4e1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
