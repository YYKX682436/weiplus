package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p246x5a0eb252;

/* renamed from: com.google.android.material.behavior.SwipeDismissBehavior */
/* loaded from: classes14.dex */
public class C2684x5190b082<V extends android.view.View> extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior<V> {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f125888d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f125889e;

    /* renamed from: f, reason: collision with root package name */
    public int f125890f = 2;

    /* renamed from: g, reason: collision with root package name */
    public final float f125891g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public float f125892h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f125893i = 0.5f;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k f125894m = new x9.b(this);

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean e(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17 = this.f125889e;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z17 = c1081xa22a3e5a.q(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f125889e = z17;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f125889e = false;
        }
        if (!z17) {
            return false;
        }
        if (this.f125888d == null) {
            this.f125888d = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l(c1081xa22a3e5a.getContext(), c1081xa22a3e5a, this.f125894m);
        }
        return this.f125888d.t(motionEvent);
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean x(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.MotionEvent motionEvent) {
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f125888d;
        if (lVar == null) {
            return false;
        }
        lVar.m(motionEvent);
        return true;
    }

    public boolean y(android.view.View view) {
        return true;
    }
}
