package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class v0 implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.g1 f12249d;

    public v0(androidx.recyclerview.widget.g1 g1Var) {
        this.f12249d = g1Var;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        androidx.recyclerview.widget.g1 g1Var = this.f12249d;
        g1Var.D.a(motionEvent);
        android.view.VelocityTracker velocityTracker = g1Var.f12048z;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (g1Var.f12040r == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(g1Var.f12040r);
        if (findPointerIndex >= 0) {
            g1Var.f(actionMasked, motionEvent, findPointerIndex);
        }
        androidx.recyclerview.widget.k3 k3Var = g1Var.f12031f;
        if (k3Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    g1Var.p(motionEvent, g1Var.f12043u, findPointerIndex);
                    g1Var.l(k3Var);
                    androidx.recyclerview.widget.RecyclerView recyclerView2 = g1Var.f12046x;
                    java.lang.Runnable runnable = g1Var.f12047y;
                    recyclerView2.removeCallbacks(runnable);
                    ((androidx.recyclerview.widget.u0) runnable).run();
                    g1Var.f12046x.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == g1Var.f12040r) {
                    g1Var.f12040r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    g1Var.p(motionEvent, g1Var.f12043u, actionIndex);
                    return;
                }
                return;
            }
            android.view.VelocityTracker velocityTracker2 = g1Var.f12048z;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        g1Var.n(null, 0);
        g1Var.f12040r = -1;
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        int findPointerIndex;
        androidx.recyclerview.widget.g1 g1Var = this.f12249d;
        g1Var.D.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        androidx.recyclerview.widget.d1 d1Var = null;
        if (actionMasked == 0) {
            g1Var.f12040r = motionEvent.getPointerId(0);
            g1Var.f12032g = motionEvent.getX();
            g1Var.f12033h = motionEvent.getY();
            android.view.VelocityTracker velocityTracker = g1Var.f12048z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            g1Var.f12048z = android.view.VelocityTracker.obtain();
            if (g1Var.f12031f == null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) g1Var.f12044v;
                if (!arrayList.isEmpty()) {
                    android.view.View i17 = g1Var.i(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        androidx.recyclerview.widget.d1 d1Var2 = (androidx.recyclerview.widget.d1) arrayList.get(size);
                        if (d1Var2.f11990h.itemView == i17) {
                            d1Var = d1Var2;
                            break;
                        }
                        size--;
                    }
                }
                if (d1Var != null) {
                    g1Var.f12032g -= d1Var.f11994o;
                    g1Var.f12033h -= d1Var.f11995p;
                    androidx.recyclerview.widget.k3 k3Var = d1Var.f11990h;
                    g1Var.h(k3Var, true);
                    if (((java.util.ArrayList) g1Var.f12029d).remove(k3Var.itemView)) {
                        g1Var.f12041s.clearView(g1Var.f12046x, k3Var);
                    }
                    g1Var.n(k3Var, d1Var.f11991i);
                    g1Var.p(motionEvent, g1Var.f12043u, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            g1Var.f12040r = -1;
            g1Var.n(null, 0);
        } else {
            int i18 = g1Var.f12040r;
            if (i18 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i18)) >= 0) {
                g1Var.f(actionMasked, motionEvent, findPointerIndex);
            }
        }
        android.view.VelocityTracker velocityTracker2 = g1Var.f12048z;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return g1Var.f12031f != null;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
        if (z17) {
            this.f12249d.n(null, 0);
        }
    }
}
