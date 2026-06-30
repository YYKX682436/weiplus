package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class c implements com.tencent.mm.ipcinvoker.r, ok0.a {

    /* renamed from: d, reason: collision with root package name */
    public lk0.f f68336d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f68337e = new java.util.LinkedList();

    public c(lk0.f fVar) {
        this.f68336d = fVar;
        if (fVar != null) {
            rk0.c.c("IPC.IPCInvokeCallbackProxy", "keep ref of callback(%s)", java.lang.Integer.valueOf(fVar.hashCode()));
            java.util.Set set = pk0.a.f355413a;
            synchronized (set) {
                ((java.util.HashSet) set).add(fVar);
            }
            final int hashCode = fVar.hashCode();
            try {
                this.f68336d.asBinder().linkToDeath(new android.os.IBinder.DeathRecipient() { // from class: com.tencent.mm.ipcinvoker.c$$a
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        try {
                            rk0.c.c("IPC.IPCInvokeCallbackProxy", "binderDied(%s)", java.lang.Integer.valueOf(hashCode));
                        } catch (java.lang.Exception e17) {
                            rk0.c.c("IPC.IPCInvokeCallbackProxy", "DeathRecipient %s", e17.getMessage());
                        }
                    }
                }, 0);
            } catch (android.os.RemoteException e17) {
                rk0.c.c("IPC.IPCInvokeCallbackProxy", "%s", e17.getMessage());
            }
        }
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Parcelable parcelable = (android.os.Parcelable) obj;
        lk0.f fVar = this.f68336d;
        if (fVar == null) {
            return;
        }
        try {
            rk0.c.c("IPC.IPCInvokeCallbackProxy", "onCallback(%d) invoke", java.lang.Integer.valueOf(fVar.hashCode()));
            rk0.c.c("IPC.IPCInvokeCallbackProxy", "onCallback(%d), isBinderAlive:%b, pingBinder:%b", java.lang.Integer.valueOf(this.f68336d.hashCode()), java.lang.Boolean.valueOf(this.f68336d.asBinder().isBinderAlive()), java.lang.Boolean.valueOf(this.f68336d.asBinder().pingBinder()));
        } catch (java.lang.Exception e17) {
            rk0.c.c("IPC.IPCInvokeCallbackProxy", "onCallback %s", e17.getMessage());
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("__remote_task_result_data", parcelable);
            this.f68336d.f(bundle);
        } catch (android.os.RemoteException e18) {
            rk0.c.b("IPC.IPCInvokeCallbackProxy", "%s", android.util.Log.getStackTraceString(e18));
            if (this.f68337e.isEmpty()) {
                return;
            }
            synchronized (this.f68337e) {
                java.util.Iterator it = new java.util.LinkedList(this.f68337e).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.appbrand.appusage.o1 o1Var = (com.tencent.mm.plugin.appbrand.appusage.o1) ((ok0.b) it.next());
                    o1Var.getClass();
                    if (e18 instanceof android.os.DeadObjectException) {
                        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.myLooper()).post(new com.tencent.mm.plugin.appbrand.appusage.n1(o1Var));
                    } else {
                        if (e18 instanceof java.lang.RuntimeException) {
                            throw ((java.lang.RuntimeException) e18);
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLocalUsageStorageIPCImpl", "onExceptionOccur(%s)", android.util.Log.getStackTraceString(e18));
                    }
                }
            }
        }
    }

    @Override // ok0.a
    public void b(ok0.b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.f68337e) {
            if (((java.util.LinkedList) this.f68337e).contains(bVar)) {
                return;
            }
            ((java.util.LinkedList) this.f68337e).add(bVar);
        }
    }

    public void finalize() {
        try {
            if (this.f68336d != null) {
                com.tencent.mm.ipcinvoker.r0.a(new com.tencent.mm.ipcinvoker.d(this.f68336d));
                this.f68336d = null;
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
