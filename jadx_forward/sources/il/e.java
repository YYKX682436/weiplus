package il;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static il.e f373515d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f373516a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f373517b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f373518c;

    public static il.e c() {
        if (f373515d == null) {
            synchronized (il.e.class) {
                if (f373515d == null) {
                    f373515d = new il.e();
                }
            }
        }
        return f373515d;
    }

    public synchronized boolean a(java.lang.String str) {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioCachePathMgr", "delete path:%s", str);
        java.lang.String a17 = rl.d.a("" + str.hashCode());
        if (!this.f373516a.contains(a17)) {
            this.f373516a.remove(a17);
        }
        return true;
    }

    public final com.p314xaae8f345.mm.vfs.r6 b() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f373518c);
        if (!r6Var.m()) {
            try {
                r6Var.k();
            } catch (java.io.IOException e17) {
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioCachePathMgr", e17, "getCacheFile", new java.lang.Object[0]);
            }
        }
        return r6Var;
    }

    public synchronized boolean d(java.lang.String str) {
        return this.f373516a.contains(rl.d.a("" + str.hashCode()));
    }
}
