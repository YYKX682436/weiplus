package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/feature/performance/scheduler/f0;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "com/tencent/mm/feature/performance/scheduler/e0", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class f0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.e0 f149217a = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.e0(null);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f149218b = new java.util.concurrent.ConcurrentHashMap();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        boolean z17;
        java.lang.String string;
        h04.a aVar;
        android.os.CancellationSignal cancellationSignal;
        jz5.f0 f0Var;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle);
        boolean z18 = false;
        try {
            z17 = bundle.getBoolean("key_is_cancel", false);
            string = bundle.getString("key_task_name");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "isCancel " + z17 + " task " + string);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f149218b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            java.lang.Object obj2 = concurrentHashMap.get(string);
            if (obj2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "create " + string + " instance");
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
            synchronized (aVar) {
                aVar.f69818x8132d58b = new android.os.CancellationSignal();
            }
            z18 = aVar.mo45118x3e7092d1(aVar.f69818x8132d58b);
            return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z18);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        synchronized (aVar) {
            cancellationSignal = aVar.f69818x8132d58b;
        }
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BgScheduler", string.concat(".cancellationSignal is null !!!"));
        }
        aVar.mo45117xe8454bd();
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z18);
        oj.j.d("MicroMsg.BgScheduler", th6, "", new java.lang.Object[0]);
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z18);
    }
}
