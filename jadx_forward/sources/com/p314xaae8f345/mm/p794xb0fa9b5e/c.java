package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class c implements com.p314xaae8f345.mm.p794xb0fa9b5e.r, ok0.a {

    /* renamed from: d, reason: collision with root package name */
    public lk0.f f149869d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f149870e = new java.util.LinkedList();

    public c(lk0.f fVar) {
        this.f149869d = fVar;
        if (fVar != null) {
            rk0.c.c("IPC.IPCInvokeCallbackProxy", "keep ref of callback(%s)", java.lang.Integer.valueOf(fVar.hashCode()));
            java.util.Set set = pk0.a.f436946a;
            synchronized (set) {
                ((java.util.HashSet) set).add(fVar);
            }
            final int hashCode = fVar.hashCode();
            try {
                this.f149869d.asBinder().linkToDeath(new android.os.IBinder.DeathRecipient() { // from class: com.tencent.mm.ipcinvoker.c$$a
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

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Parcelable parcelable = (android.os.Parcelable) obj;
        lk0.f fVar = this.f149869d;
        if (fVar == null) {
            return;
        }
        try {
            rk0.c.c("IPC.IPCInvokeCallbackProxy", "onCallback(%d) invoke", java.lang.Integer.valueOf(fVar.hashCode()));
            rk0.c.c("IPC.IPCInvokeCallbackProxy", "onCallback(%d), isBinderAlive:%b, pingBinder:%b", java.lang.Integer.valueOf(this.f149869d.hashCode()), java.lang.Boolean.valueOf(this.f149869d.asBinder().isBinderAlive()), java.lang.Boolean.valueOf(this.f149869d.asBinder().pingBinder()));
        } catch (java.lang.Exception e17) {
            rk0.c.c("IPC.IPCInvokeCallbackProxy", "onCallback %s", e17.getMessage());
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("__remote_task_result_data", parcelable);
            this.f149869d.f(bundle);
        } catch (android.os.RemoteException e18) {
            rk0.c.b("IPC.IPCInvokeCallbackProxy", "%s", android.util.Log.getStackTraceString(e18));
            if (this.f149870e.isEmpty()) {
                return;
            }
            synchronized (this.f149870e) {
                java.util.Iterator it = new java.util.LinkedList(this.f149870e).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o1 o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o1) ((ok0.b) it.next());
                    o1Var.getClass();
                    if (e18 instanceof android.os.DeadObjectException) {
                        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.myLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.n1(o1Var));
                    } else {
                        if (e18 instanceof java.lang.RuntimeException) {
                            throw ((java.lang.RuntimeException) e18);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLocalUsageStorageIPCImpl", "onExceptionOccur(%s)", android.util.Log.getStackTraceString(e18));
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
        synchronized (this.f149870e) {
            if (((java.util.LinkedList) this.f149870e).contains(bVar)) {
                return;
            }
            ((java.util.LinkedList) this.f149870e).add(bVar);
        }
    }

    /* renamed from: finalize */
    public void m46191xd764dc1e() {
        try {
            if (this.f149869d != null) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.r0.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.d(this.f149869d));
                this.f149869d = null;
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
