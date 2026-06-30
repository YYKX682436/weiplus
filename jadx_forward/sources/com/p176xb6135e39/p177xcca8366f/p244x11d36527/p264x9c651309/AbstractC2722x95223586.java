package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309;

/* renamed from: com.google.android.material.transformation.ExpandableBehavior */
/* loaded from: classes15.dex */
public abstract class AbstractC2722x95223586 extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior<android.view.View> {

    /* renamed from: d, reason: collision with root package name */
    public int f126156d;

    public AbstractC2722x95223586() {
        this.f126156d = 0;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public abstract boolean b(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean d(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2) {
        int i17;
        java.lang.Object obj = (da.a) view2;
        boolean z17 = ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e) obj).f126037u.f309260b;
        if (!(!z17 ? this.f126156d != 1 : !((i17 = this.f126156d) == 0 || i17 == 2))) {
            return false;
        }
        this.f126156d = z17 ? 1 : 2;
        return y((android.view.View) obj, view, z17, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
        da.a aVar;
        int i18;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.c(view)) {
            java.util.ArrayList arrayList = (java.util.ArrayList) c1081xa22a3e5a.k(view);
            int size = arrayList.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    aVar = null;
                    break;
                }
                android.view.View view2 = (android.view.View) arrayList.get(i19);
                if (b(c1081xa22a3e5a, view, view2)) {
                    aVar = (da.a) view2;
                    break;
                }
                i19++;
            }
            if (aVar != null) {
                boolean z17 = ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e) aVar).f126037u.f309260b;
                if (!z17 ? this.f126156d != 1 : !((i18 = this.f126156d) == 0 || i18 == 2)) {
                    int i27 = z17 ? 1 : 2;
                    this.f126156d = i27;
                    view.getViewTreeObserver().addOnPreDrawListener(new pa.a(this, view, i27, aVar));
                }
            }
        }
        return false;
    }

    public abstract boolean y(android.view.View view, android.view.View view2, boolean z17, boolean z18);

    public AbstractC2722x95223586(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f126156d = 0;
    }
}
