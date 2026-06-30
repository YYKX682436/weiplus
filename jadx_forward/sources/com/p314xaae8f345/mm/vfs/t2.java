package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.o5 f294712a = new com.p314xaae8f345.mm.vfs.o5();

    /* renamed from: b, reason: collision with root package name */
    public boolean f294713b = false;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f294714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.b3 f294715d;

    public t2(com.p314xaae8f345.mm.vfs.b3 b3Var, boolean z17) {
        this.f294715d = b3Var;
        this.f294714c = z17;
    }

    public void a(boolean z17) {
        com.p314xaae8f345.mm.vfs.o5 o5Var;
        com.p314xaae8f345.mm.vfs.o5 o5Var2;
        android.os.Bundle bundle = null;
        if (this.f294714c) {
            o5Var2 = this.f294712a;
            o5Var = null;
        } else {
            o5Var = this.f294712a;
            o5Var2 = null;
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = this.f294715d;
        boolean z18 = this.f294713b;
        synchronized (b3Var.f294352m) {
            if (o5Var != null) {
                try {
                    b3Var.f294354o.a(o5Var);
                    if (z17) {
                        bundle = b3Var.f294354o.h();
                    }
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            if (o5Var2 != null) {
                b3Var.f294353n.a(o5Var2);
            }
            b3Var.l(z18);
        }
        if (bundle != null) {
            b3Var.k(bundle);
        }
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.C25627xeb892456 c25627xeb892456 = new com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.C25627xeb892456(4, "VFS.FileSystemManager");
        if (o5Var != null) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("VFS.FileSystemManager", "Patched layer [PUBLIC]");
            o5Var.d(c25627xeb892456);
        }
        if (o5Var2 != null) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("VFS.FileSystemManager", "Patched layer [PRIVATE]");
            o5Var2.d(c25627xeb892456);
        }
        this.f294712a = new com.p314xaae8f345.mm.vfs.o5();
    }

    public com.p314xaae8f345.mm.vfs.t2 b(java.lang.String str, com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb) {
        this.f294712a.f294644b.put(str, interfaceC22750xe27c22eb == null ? null : new com.p314xaae8f345.mm.vfs.t5(interfaceC22750xe27c22eb));
        return this;
    }

    public com.p314xaae8f345.mm.vfs.t2 c(java.lang.String str, com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb) {
        this.f294712a.f294645c.put(str, interfaceC22750xe27c22eb == null ? null : new com.p314xaae8f345.mm.vfs.t5(interfaceC22750xe27c22eb));
        return this;
    }

    public com.p314xaae8f345.mm.vfs.t2 d(java.lang.String str, java.lang.String str2) {
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, true, false);
        ((java.util.TreeMap) this.f294712a.f294646d).put(new com.p314xaae8f345.mm.vfs.f1(l17), str2);
        return this;
    }

    public com.p314xaae8f345.mm.vfs.t2 e(java.lang.String str, java.lang.String str2) {
        this.f294712a.f294647e.put(str, str2);
        this.f294713b = true;
        return this;
    }

    public com.p314xaae8f345.mm.vfs.t2 f(java.lang.String str) {
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, true, false);
        ((java.util.TreeMap) this.f294712a.f294646d).put(new com.p314xaae8f345.mm.vfs.f1(l17), null);
        return this;
    }
}
