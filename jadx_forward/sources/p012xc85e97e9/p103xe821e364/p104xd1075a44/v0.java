package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class v0 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 f93782d;

    public v0(p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var) {
        this.f93782d = g1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.MotionEvent motionEvent) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var = this.f93782d;
        g1Var.D.a(motionEvent);
        android.view.VelocityTracker velocityTracker = g1Var.f93581z;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (g1Var.f93573r == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(g1Var.f93573r);
        if (findPointerIndex >= 0) {
            g1Var.f(actionMasked, motionEvent, findPointerIndex);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = g1Var.f93564f;
        if (k3Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    g1Var.p(motionEvent, g1Var.f93576u, findPointerIndex);
                    g1Var.l(k3Var);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = g1Var.f93579x;
                    java.lang.Runnable runnable = g1Var.f93580y;
                    c1163xf1deaba42.removeCallbacks(runnable);
                    ((p012xc85e97e9.p103xe821e364.p104xd1075a44.u0) runnable).run();
                    g1Var.f93579x.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == g1Var.f93573r) {
                    g1Var.f93573r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    g1Var.p(motionEvent, g1Var.f93576u, actionIndex);
                    return;
                }
                return;
            }
            android.view.VelocityTracker velocityTracker2 = g1Var.f93581z;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        g1Var.n(null, 0);
        g1Var.f93573r = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.MotionEvent motionEvent) {
        int findPointerIndex;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var = this.f93782d;
        g1Var.D.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 d1Var = null;
        if (actionMasked == 0) {
            g1Var.f93573r = motionEvent.getPointerId(0);
            g1Var.f93565g = motionEvent.getX();
            g1Var.f93566h = motionEvent.getY();
            android.view.VelocityTracker velocityTracker = g1Var.f93581z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            g1Var.f93581z = android.view.VelocityTracker.obtain();
            if (g1Var.f93564f == null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) g1Var.f93577v;
                if (!arrayList.isEmpty()) {
                    android.view.View i17 = g1Var.i(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 d1Var2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.d1) arrayList.get(size);
                        if (d1Var2.f93523h.f3639x46306858 == i17) {
                            d1Var = d1Var2;
                            break;
                        }
                        size--;
                    }
                }
                if (d1Var != null) {
                    g1Var.f93565g -= d1Var.f93527o;
                    g1Var.f93566h -= d1Var.f93528p;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = d1Var.f93523h;
                    g1Var.h(k3Var, true);
                    if (((java.util.ArrayList) g1Var.f93562d).remove(k3Var.f3639x46306858)) {
                        g1Var.f93574s.mo8113xb4407692(g1Var.f93579x, k3Var);
                    }
                    g1Var.n(k3Var, d1Var.f93524i);
                    g1Var.p(motionEvent, g1Var.f93576u, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            g1Var.f93573r = -1;
            g1Var.n(null, 0);
        } else {
            int i18 = g1Var.f93573r;
            if (i18 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i18)) >= 0) {
                g1Var.f(actionMasked, motionEvent, findPointerIndex);
            }
        }
        android.view.VelocityTracker velocityTracker2 = g1Var.f93581z;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return g1Var.f93564f != null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void c(boolean z17) {
        if (z17) {
            this.f93782d.n(null, 0);
        }
    }
}
