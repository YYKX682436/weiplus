package com.tencent.mm.feature.performance.scheduler;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/feature/performance/scheduler/f0;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "com/tencent/mm/feature/performance/scheduler/e0", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class f0 implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.scheduler.e0 f67684a = new com.tencent.mm.feature.performance.scheduler.e0(null);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f67685b = new java.util.concurrent.ConcurrentHashMap();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        java.lang.String string;
        h04.a aVar;
        android.os.CancellationSignal cancellationSignal;
        jz5.f0 f0Var;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.d(bundle);
        boolean z18 = false;
        try {
            z17 = bundle.getBoolean("key_is_cancel", false);
            string = bundle.getString("key_task_name");
            com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "isCancel " + z17 + " task " + string);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f67685b;
            kotlin.jvm.internal.o.d(string);
            java.lang.Object obj2 = concurrentHashMap.get(string);
            if (obj2 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "create " + string + " instance");
                obj2 = (h04.a) java.lang.Class.forName(string).newInstance();
                java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(string, obj2);
                if (putIfAbsent != null) {
                    obj2 = putIfAbsent;
                }
            }
            aVar = (h04.a) obj2;
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.BgScheduler", th6, "", new java.lang.Object[0]);
        }
        if (!z17) {
            kotlin.jvm.internal.o.d(aVar);
            synchronized (aVar) {
                aVar.cancellationSignal = new android.os.CancellationSignal();
            }
            z18 = aVar.onTaskExecute(aVar.cancellationSignal);
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(z18);
        }
        kotlin.jvm.internal.o.d(aVar);
        synchronized (aVar) {
            cancellationSignal = aVar.cancellationSignal;
        }
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BgScheduler", string.concat(".cancellationSignal is null !!!"));
        }
        aVar.onTaskCanceled();
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(z18);
        oj.j.d("MicroMsg.BgScheduler", th6, "", new java.lang.Object[0]);
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(z18);
    }
}
