package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class b0 extends lk0.e implements pk0.b {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f68332g = new java.util.WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f68333d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f68334e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f68335f;

    public b0(java.lang.String str, com.tencent.mm.ipcinvoker.r rVar, boolean z17) {
        java.util.Set set;
        this.f68334e = rVar;
        this.f68333d = str;
        this.f68335f = z17;
        java.util.Set set2 = pk0.a.f355413a;
        if (str != null && str.length() != 0) {
            java.util.Map map = pk0.a.f355414b;
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
        java.util.Map map2 = f68332g;
        synchronized (map2) {
            ((java.util.WeakHashMap) map2).put(rVar, new java.lang.ref.WeakReference(this));
        }
    }

    public void e() {
        java.util.Set set;
        com.tencent.mm.ipcinvoker.r rVar = this.f68334e;
        if (rVar != null) {
            java.util.Map map = f68332g;
            synchronized (map) {
                ((java.util.WeakHashMap) map).remove(rVar);
            }
        }
        this.f68334e = null;
        java.lang.String str = this.f68333d;
        java.util.Set set2 = pk0.a.f355413a;
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Map map2 = pk0.a.f355414b;
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
        boolean z17 = this.f68335f;
        com.tencent.mm.ipcinvoker.r rVar = this.f68334e;
        if (rVar == null) {
            rk0.c.d("IPC.IPCInvokeCallbackWrapper", "callback failed, ref has been release", new java.lang.Object[0]);
            return;
        }
        if (bundle == null) {
            rVar.a(null);
            return;
        }
        bundle.setClassLoader(com.tencent.mm.ipcinvoker.d0.class.getClassLoader());
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

    public void finalize() {
        e();
        rk0.c.c("IPC.IPCInvokeCallbackWrapper", "finalize(%s)", java.lang.Integer.valueOf(hashCode()));
        super.finalize();
    }
}
