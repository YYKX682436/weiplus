package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class e0 implements kk0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Application f149875a;

    public e0(android.app.Application application) {
        this.f149875a = application;
    }

    public void a(java.lang.String str, java.lang.Class cls) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.q b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b();
        java.lang.String a17 = rk0.d.a(str, this.f149875a.getPackageName());
        b17.getClass();
        java.lang.String str2 = a17 + "/" + str;
        java.util.HashMap hashMap = (java.util.HashMap) b17.f149921a;
        java.lang.Class cls2 = (java.lang.Class) hashMap.get(str2);
        if (cls2 != null) {
            rk0.c.d("IPC.IPCBridgeManager", "warning: override ipc service: %s -> %s", str2, cls2);
        }
        hashMap.put(str2, cls);
    }
}
