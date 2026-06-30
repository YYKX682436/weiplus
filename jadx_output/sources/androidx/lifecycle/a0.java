package androidx.lifecycle;

/* loaded from: classes13.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.n f11598a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.v f11599b;

    public a0(androidx.lifecycle.x xVar, androidx.lifecycle.n nVar) {
        androidx.lifecycle.v reflectiveGenericLifecycleObserver;
        java.util.Map map = androidx.lifecycle.c0.f11614a;
        boolean z17 = xVar instanceof androidx.lifecycle.v;
        boolean z18 = xVar instanceof androidx.lifecycle.h;
        if (z17 && z18) {
            reflectiveGenericLifecycleObserver = new androidx.lifecycle.FullLifecycleObserverAdapter((androidx.lifecycle.h) xVar, (androidx.lifecycle.v) xVar);
        } else if (z18) {
            reflectiveGenericLifecycleObserver = new androidx.lifecycle.FullLifecycleObserverAdapter((androidx.lifecycle.h) xVar, null);
        } else if (z17) {
            reflectiveGenericLifecycleObserver = (androidx.lifecycle.v) xVar;
        } else {
            java.lang.Class<?> cls = xVar.getClass();
            if (androidx.lifecycle.c0.c(cls) == 2) {
                java.util.List list = (java.util.List) ((java.util.HashMap) androidx.lifecycle.c0.f11615b).get(cls);
                if (list.size() == 1) {
                    androidx.lifecycle.c0.a((java.lang.reflect.Constructor) list.get(0), xVar);
                    reflectiveGenericLifecycleObserver = new androidx.lifecycle.SingleGeneratedAdapterObserver(null);
                } else {
                    androidx.lifecycle.j[] jVarArr = new androidx.lifecycle.j[list.size()];
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        androidx.lifecycle.c0.a((java.lang.reflect.Constructor) list.get(i17), xVar);
                        jVarArr[i17] = null;
                    }
                    reflectiveGenericLifecycleObserver = new androidx.lifecycle.CompositeGeneratedAdaptersObserver(jVarArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new androidx.lifecycle.ReflectiveGenericLifecycleObserver(xVar);
            }
        }
        this.f11599b = reflectiveGenericLifecycleObserver;
        this.f11598a = nVar;
    }

    public void a(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
        androidx.lifecycle.n h17 = mVar.h();
        androidx.lifecycle.n nVar = this.f11598a;
        if (h17 != null && h17.compareTo(nVar) < 0) {
            nVar = h17;
        }
        this.f11598a = nVar;
        this.f11599b.onStateChanged(yVar, mVar);
        this.f11598a = h17;
    }
}
