package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class m implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.p f149902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f149903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.q f149904g;

    public m(com.p314xaae8f345.mm.p794xb0fa9b5e.q qVar, java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.p pVar, android.content.Context context) {
        this.f149904g = qVar;
        this.f149901d = str;
        this.f149902e = pVar;
        this.f149903f = context;
    }

    public final void a(java.lang.String str) {
        java.util.LinkedList linkedList;
        rk0.c.c("IPC.IPCBridgeManager", "%s(%s, tid : %s)", str, java.lang.Integer.valueOf(this.f149902e.hashCode()), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        this.f149904g.c(this.f149901d);
        pk0.a.a(this.f149901d);
        com.p314xaae8f345.mm.p794xb0fa9b5e.q qVar = this.f149904g;
        java.lang.String str2 = this.f149901d;
        synchronized (qVar.f149924d) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) qVar.f149924d).get(str2);
            linkedList = set != null ? new java.util.LinkedList(set) : null;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p794xb0fa9b5e.t0) it.next()).h();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(android.content.ComponentName componentName) {
        a("onBindingDied");
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(android.content.ComponentName componentName) {
        a("onNullBinding");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        if (iBinder == null) {
            rk0.c.c("IPC.IPCBridgeManager", "[%s]->[%s] onServiceConnected(%s) (%s), but service is null", com.p314xaae8f345.mm.p794xb0fa9b5e.y.a(), this.f149901d, java.lang.Integer.valueOf(this.f149902e.hashCode()), java.lang.Integer.valueOf(this.f149902e.f149915b.hashCode()));
            this.f149903f.unbindService(this.f149902e.f149915b);
            ((java.util.concurrent.ConcurrentHashMap) this.f149904g.f149923c).remove(this.f149901d);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p pVar = this.f149902e;
            pVar.f149915b = null;
            pVar.f149914a = null;
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p pVar2 = this.f149902e;
            int i17 = lk0.b.f400527d;
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
            pVar2.f149914a = (queryLocalInterface == null || !(queryLocalInterface instanceof lk0.c)) ? new lk0.a(iBinder) : (lk0.c) queryLocalInterface;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(this.f149902e.hashCode());
            if (this.f149902e.f149914a == null) {
                str = "null";
            } else {
                str = "@" + this.f149902e.f149914a.hashCode();
            }
            objArr[1] = str;
            rk0.c.c("IPC.IPCBridgeManager", "onServiceConnected(%s), bridge:%s", objArr);
            try {
                iBinder.linkToDeath(new com.p314xaae8f345.mm.p794xb0fa9b5e.l(this, this.f149902e.hashCode(), iBinder), 0);
            } catch (android.os.RemoteException e17) {
                rk0.c.b("IPC.IPCBridgeManager", "binder register linkToDeath listener error, %s", android.util.Log.getStackTraceString(e17));
            }
        }
        java.lang.Runnable runnable = this.f149902e.f149917d;
        if (runnable != null) {
            this.f149904g.f149922b.removeCallbacks(runnable);
        }
        synchronized (this.f149902e) {
            this.f149902e.f149916c = false;
            this.f149902e.notifyAll();
            com.p314xaae8f345.mm.p794xb0fa9b5e.p pVar3 = this.f149902e;
            pVar3.f149917d = null;
            pVar3.f149915b = this;
        }
        rk0.c.f477930a.a(2, "IPC.IPCBridgeManager", "onServiceConnected: [%s]->[%s] success", com.p314xaae8f345.mm.p794xb0fa9b5e.y.a(), this.f149901d);
        synchronized (this.f149904g.f149923c) {
            ((java.util.concurrent.ConcurrentHashMap) this.f149904g.f149923c).put(this.f149901d, this.f149902e);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.q qVar = this.f149904g;
        java.lang.String str2 = this.f149901d;
        synchronized (qVar.f149925e) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) qVar.f149925e).get(str2);
            linkedList = set != null ? new java.util.LinkedList(set) : null;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p794xb0fa9b5e.u0) it.next()).R();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        a("onServiceDisconnected");
    }
}
