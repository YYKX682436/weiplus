package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class m implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f68368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.p f68369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f68370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.q f68371g;

    public m(com.tencent.mm.ipcinvoker.q qVar, java.lang.String str, com.tencent.mm.ipcinvoker.p pVar, android.content.Context context) {
        this.f68371g = qVar;
        this.f68368d = str;
        this.f68369e = pVar;
        this.f68370f = context;
    }

    public final void a(java.lang.String str) {
        java.util.LinkedList linkedList;
        rk0.c.c("IPC.IPCBridgeManager", "%s(%s, tid : %s)", str, java.lang.Integer.valueOf(this.f68369e.hashCode()), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        this.f68371g.c(this.f68368d);
        pk0.a.a(this.f68368d);
        com.tencent.mm.ipcinvoker.q qVar = this.f68371g;
        java.lang.String str2 = this.f68368d;
        synchronized (qVar.f68391d) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) qVar.f68391d).get(str2);
            linkedList = set != null ? new java.util.LinkedList(set) : null;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.ipcinvoker.t0) it.next()).h();
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
            rk0.c.c("IPC.IPCBridgeManager", "[%s]->[%s] onServiceConnected(%s) (%s), but service is null", com.tencent.mm.ipcinvoker.y.a(), this.f68368d, java.lang.Integer.valueOf(this.f68369e.hashCode()), java.lang.Integer.valueOf(this.f68369e.f68382b.hashCode()));
            this.f68370f.unbindService(this.f68369e.f68382b);
            ((java.util.concurrent.ConcurrentHashMap) this.f68371g.f68390c).remove(this.f68368d);
            com.tencent.mm.ipcinvoker.p pVar = this.f68369e;
            pVar.f68382b = null;
            pVar.f68381a = null;
        } else {
            com.tencent.mm.ipcinvoker.p pVar2 = this.f68369e;
            int i17 = lk0.b.f318994d;
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
            pVar2.f68381a = (queryLocalInterface == null || !(queryLocalInterface instanceof lk0.c)) ? new lk0.a(iBinder) : (lk0.c) queryLocalInterface;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(this.f68369e.hashCode());
            if (this.f68369e.f68381a == null) {
                str = "null";
            } else {
                str = "@" + this.f68369e.f68381a.hashCode();
            }
            objArr[1] = str;
            rk0.c.c("IPC.IPCBridgeManager", "onServiceConnected(%s), bridge:%s", objArr);
            try {
                iBinder.linkToDeath(new com.tencent.mm.ipcinvoker.l(this, this.f68369e.hashCode(), iBinder), 0);
            } catch (android.os.RemoteException e17) {
                rk0.c.b("IPC.IPCBridgeManager", "binder register linkToDeath listener error, %s", android.util.Log.getStackTraceString(e17));
            }
        }
        java.lang.Runnable runnable = this.f68369e.f68384d;
        if (runnable != null) {
            this.f68371g.f68389b.removeCallbacks(runnable);
        }
        synchronized (this.f68369e) {
            this.f68369e.f68383c = false;
            this.f68369e.notifyAll();
            com.tencent.mm.ipcinvoker.p pVar3 = this.f68369e;
            pVar3.f68384d = null;
            pVar3.f68382b = this;
        }
        rk0.c.f396397a.a(2, "IPC.IPCBridgeManager", "onServiceConnected: [%s]->[%s] success", com.tencent.mm.ipcinvoker.y.a(), this.f68368d);
        synchronized (this.f68371g.f68390c) {
            ((java.util.concurrent.ConcurrentHashMap) this.f68371g.f68390c).put(this.f68368d, this.f68369e);
        }
        com.tencent.mm.ipcinvoker.q qVar = this.f68371g;
        java.lang.String str2 = this.f68368d;
        synchronized (qVar.f68392e) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) qVar.f68392e).get(str2);
            linkedList = set != null ? new java.util.LinkedList(set) : null;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.ipcinvoker.u0) it.next()).R();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        a("onServiceDisconnected");
    }
}
