package androidx.fragment.app;

/* loaded from: classes14.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f11526a = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.FragmentManager f11527b;

    public z0(androidx.fragment.app.FragmentManager fragmentManager) {
        this.f11527b = fragmentManager;
    }

    public void a(androidx.fragment.app.Fragment fragment, android.os.Bundle bundle, boolean z17) {
        androidx.fragment.app.Fragment parent = this.f11527b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().a(fragment, bundle, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void b(androidx.fragment.app.Fragment fragment, boolean z17) {
        androidx.fragment.app.FragmentManager fragmentManager = this.f11527b;
        android.content.Context context = fragmentManager.getHost().f11494e;
        androidx.fragment.app.Fragment parent = fragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().b(fragment, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void c(androidx.fragment.app.Fragment fragment, android.os.Bundle bundle, boolean z17) {
        androidx.fragment.app.Fragment parent = this.f11527b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().c(fragment, bundle, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void d(androidx.fragment.app.Fragment fragment, boolean z17) {
        androidx.fragment.app.Fragment parent = this.f11527b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().d(fragment, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void e(androidx.fragment.app.Fragment fragment, boolean z17) {
        androidx.fragment.app.Fragment parent = this.f11527b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().e(fragment, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void f(androidx.fragment.app.Fragment fragment, boolean z17) {
        androidx.fragment.app.Fragment parent = this.f11527b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().f(fragment, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void g(androidx.fragment.app.Fragment fragment, boolean z17) {
        androidx.fragment.app.FragmentManager fragmentManager = this.f11527b;
        android.content.Context context = fragmentManager.getHost().f11494e;
        androidx.fragment.app.Fragment parent = fragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().g(fragment, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void h(androidx.fragment.app.Fragment fragment, android.os.Bundle bundle, boolean z17) {
        androidx.fragment.app.Fragment parent = this.f11527b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().h(fragment, bundle, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void i(androidx.fragment.app.Fragment fragment, boolean z17) {
        androidx.fragment.app.Fragment parent = this.f11527b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().i(fragment, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void j(androidx.fragment.app.Fragment fragment, android.os.Bundle bundle, boolean z17) {
        androidx.fragment.app.Fragment parent = this.f11527b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().j(fragment, bundle, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void k(androidx.fragment.app.Fragment fragment, boolean z17) {
        androidx.fragment.app.Fragment parent = this.f11527b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().k(fragment, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void l(androidx.fragment.app.Fragment fragment, boolean z17) {
        androidx.fragment.app.Fragment parent = this.f11527b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().l(fragment, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void m(androidx.fragment.app.Fragment fragment, android.view.View view, android.os.Bundle bundle, boolean z17) {
        androidx.fragment.app.Fragment parent = this.f11527b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().m(fragment, view, bundle, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }

    public void n(androidx.fragment.app.Fragment fragment, boolean z17) {
        androidx.fragment.app.Fragment parent = this.f11527b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().n(fragment, true);
        }
        java.util.Iterator it = this.f11526a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.y0 y0Var = (androidx.fragment.app.y0) it.next();
            if (!z17 || y0Var.f11514a) {
                y0Var.getClass();
                throw null;
            }
        }
    }
}
