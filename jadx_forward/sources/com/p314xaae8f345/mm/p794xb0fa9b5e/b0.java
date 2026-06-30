package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class b0 extends lk0.e implements pk0.b {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f149865g = new java.util.WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f149866d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f149867e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f149868f;

    public b0(java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, boolean z17) {
        java.util.Set set;
        this.f149867e = rVar;
        this.f149866d = str;
        this.f149868f = z17;
        java.util.Set set2 = pk0.a.f436946a;
        if (str != null && str.length() != 0) {
            java.util.Map map = pk0.a.f436947b;
            synchronized (map) {
                set = (java.util.Set) ((java.util.HashMap) map).get(str);
                if (set == null) {
                    set = new java.util.HashSet();
                    ((java.util.HashMap) map).put(str, set);
                }
            }
            rk0.c.c("IPC.ObjectRecycler", "addIntoSet(%s)", str);
            synchronized (set) {
                set.add(this);
            }
        }
        rk0.c.c("IPC.IPCInvokeCallbackWrapper", "keep ref of callback(%s)", java.lang.Integer.valueOf(rVar.hashCode()));
        java.util.Map map2 = f149865g;
        synchronized (map2) {
            ((java.util.WeakHashMap) map2).put(rVar, new java.lang.ref.WeakReference(this));
        }
    }

    public void e() {
        java.util.Set set;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f149867e;
        if (rVar != null) {
            java.util.Map map = f149865g;
            synchronized (map) {
                ((java.util.WeakHashMap) map).remove(rVar);
            }
        }
        this.f149867e = null;
        java.lang.String str = this.f149866d;
        java.util.Set set2 = pk0.a.f436946a;
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Map map2 = pk0.a.f436947b;
        synchronized (map2) {
            set = (java.util.Set) ((java.util.HashMap) map2).get(str);
        }
        if (set == null) {
            return;
        }
        rk0.c.c("IPC.ObjectRecycler", "removeFromSet(%s)", str);
        synchronized (set) {
            set.remove(this);
        }
    }

    @Override // lk0.f
    public void f(android.os.Bundle bundle) {
        boolean z17 = this.f149868f;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f149867e;
        if (rVar == null) {
            rk0.c.d("IPC.IPCInvokeCallbackWrapper", "callback failed, ref has been release", new java.lang.Object[0]);
            return;
        }
        if (bundle == null) {
            rVar.a(null);
            return;
        }
        bundle.setClassLoader(com.p314xaae8f345.mm.p794xb0fa9b5e.d0.class.getClassLoader());
        if (bundle.getBoolean("__command_release_ref")) {
            rk0.c.c("IPC.IPCInvokeCallbackWrapper", "release ref of callback(%s)", java.lang.Integer.valueOf(rVar.hashCode()));
            e();
            return;
        }
        try {
            rVar.a(bundle.getParcelable("__remote_task_result_data"));
        } finally {
            if (z17) {
                e();
            }
        }
    }

    /* renamed from: finalize */
    public void m46190xd764dc1e() {
        e();
        rk0.c.c("IPC.IPCInvokeCallbackWrapper", "finalize(%s)", java.lang.Integer.valueOf(hashCode()));
        super.finalize();
    }
}
