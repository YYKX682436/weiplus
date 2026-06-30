package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class n0 extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f63446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f63447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.o0 f63448h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f63449i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Intent intent, java.lang.String str, java.lang.String str2, com.tencent.mm.booter.o0 o0Var, android.content.Context context) {
        super(intent);
        this.f63446f = str;
        this.f63447g = str2;
        this.f63448h = o0Var;
        this.f63449i = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
        com.tencent.mars.comm.MMWakerLock a17;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(service, "service");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProcessServiceConnected: class=");
        sb6.append(this.f63446f);
        sb6.append(", process=");
        java.lang.String str = this.f63447g;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.MMServiceHelperKt", sb6.toString());
        l85.l1.a(2L, 1L, false);
        try {
            try {
                l85.n0 d17 = l85.l0.d(service);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f317177a;
                kotlin.jvm.internal.o.f(concurrentHashMap, "getBinderHashMap(...)");
                concurrentHashMap.put(str, d17);
                this.f63448h.a(this.f63449i, str);
                a17 = com.tencent.mm.booter.k0.a(com.tencent.mm.booter.o0.f63532a);
                if (a17 == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain.MMServiceHelperKt", "getProcessServiceAidl err: " + e17.getMessage());
                l85.l1.a(3L, 1L, false);
                a17 = com.tencent.mm.booter.k0.a(com.tencent.mm.booter.o0.f63532a);
                if (a17 == null) {
                    return;
                }
            }
            a17.unLock();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.comm.MMWakerLock a18 = com.tencent.mm.booter.k0.a(com.tencent.mm.booter.o0.f63532a);
            if (a18 != null) {
                a18.unLock();
            }
            throw th6;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName name) {
        kotlin.jvm.internal.o.g(name, "name");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f317177a;
        java.lang.String str = this.f63447g;
        concurrentHashMap.remove(str);
        this.f63449i.getApplicationContext().unbindService(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.MMServiceHelperKt", "startService() ClassName = %s ProcessName = %s onServiceDisconnected()", this.f63446f, str);
        l85.l1.a(4L, 1L, false);
    }
}
