package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p259x103fe905;

/* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$Behavior */
/* loaded from: classes14.dex */
public class C2713xe1cbd027 extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p246x5a0eb252.C2684x5190b082<android.view.View> {

    /* renamed from: n, reason: collision with root package name */
    public final ma.a f126064n = new ma.a(this);

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p246x5a0eb252.C2684x5190b082, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean e(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.MotionEvent motionEvent) {
        this.f126064n.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (ma.g.f406660b == null) {
                    ma.g.f406660b = new ma.g();
                }
                synchronized (ma.g.f406660b.f406661a) {
                }
            }
        } else if (c1081xa22a3e5a.q(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (ma.g.f406660b == null) {
                ma.g.f406660b = new ma.g();
            }
            synchronized (ma.g.f406660b.f406661a) {
            }
        }
        return super.e(c1081xa22a3e5a, view, motionEvent);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p246x5a0eb252.C2684x5190b082
    public boolean y(android.view.View view) {
        this.f126064n.getClass();
        return view instanceof ma.e;
    }
}
