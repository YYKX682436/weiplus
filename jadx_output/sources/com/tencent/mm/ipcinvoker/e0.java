package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class e0 implements kk0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Application f68342a;

    public e0(android.app.Application application) {
        this.f68342a = application;
    }

    public void a(java.lang.String str, java.lang.Class cls) {
        com.tencent.mm.ipcinvoker.q b17 = com.tencent.mm.ipcinvoker.q.b();
        java.lang.String a17 = rk0.d.a(str, this.f68342a.getPackageName());
        b17.getClass();
        java.lang.String str2 = a17 + "/" + str;
        java.util.HashMap hashMap = (java.util.HashMap) b17.f68388a;
        java.lang.Class cls2 = (java.lang.Class) hashMap.get(str2);
        if (cls2 != null) {
            rk0.c.d("IPC.IPCBridgeManager", "warning: override ipc service: %s -> %s", str2, cls2);
        }
        hashMap.put(str2, cls);
    }
}
