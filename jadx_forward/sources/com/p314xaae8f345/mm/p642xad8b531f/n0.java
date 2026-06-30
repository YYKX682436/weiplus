package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public final class n0 extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.o0 f144981h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f144982i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Intent intent, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p642xad8b531f.o0 o0Var, android.content.Context context) {
        super(intent);
        this.f144979f = str;
        this.f144980g = str2;
        this.f144981h = o0Var;
        this.f144982i = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProcessServiceConnected: class=");
        sb6.append(this.f144979f);
        sb6.append(", process=");
        java.lang.String str = this.f144980g;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.MMServiceHelperKt", sb6.toString());
        l85.l1.a(2L, 1L, false);
        try {
            try {
                l85.n0 d17 = l85.l0.d(service);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f398710a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(concurrentHashMap, "getBinderHashMap(...)");
                concurrentHashMap.put(str, d17);
                this.f144981h.a(this.f144982i, str);
                a17 = com.p314xaae8f345.mm.p642xad8b531f.k0.a(com.p314xaae8f345.mm.p642xad8b531f.o0.f145065a);
                if (a17 == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PushToMain.MMServiceHelperKt", "getProcessServiceAidl err: " + e17.getMessage());
                l85.l1.a(3L, 1L, false);
                a17 = com.p314xaae8f345.mm.p642xad8b531f.k0.a(com.p314xaae8f345.mm.p642xad8b531f.o0.f145065a);
                if (a17 == null) {
                    return;
                }
            }
            a17.mo40017xcdd95364();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 a18 = com.p314xaae8f345.mm.p642xad8b531f.k0.a(com.p314xaae8f345.mm.p642xad8b531f.o0.f145065a);
            if (a18 != null) {
                a18.mo40017xcdd95364();
            }
            throw th6;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f398710a;
        java.lang.String str = this.f144980g;
        concurrentHashMap.remove(str);
        this.f144982i.getApplicationContext().unbindService(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.MMServiceHelperKt", "startService() ClassName = %s ProcessName = %s onServiceDisconnected()", this.f144979f, str);
        l85.l1.a(4L, 1L, false);
    }
}
