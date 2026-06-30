package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f150005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Parcelable f150007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f150008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150009h;

    public z(java.lang.Class cls, java.lang.String str, android.os.Parcelable parcelable, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, java.lang.String str2) {
        this.f150005d = cls;
        this.f150006e = str;
        this.f150007f = parcelable;
        this.f150008g = rVar;
        this.f150009h = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.b0 b0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invokeAsync run, task=");
        java.lang.Class cls = this.f150005d;
        sb6.append(cls);
        sb6.append(", proc=");
        java.lang.String str = this.f150006e;
        sb6.append(str);
        boolean z17 = false;
        rk0.c.c("IPC.IPCInvoker", sb6.toString(), new java.lang.Object[0]);
        boolean b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.y.b(str);
        android.os.Parcelable parcelable = this.f150007f;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f150008g;
        if (b17) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.j jVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.j) com.p314xaae8f345.mm.p794xb0fa9b5e.v0.a(cls, com.p314xaae8f345.mm.p794xb0fa9b5e.j.class);
            if (jVar == null) {
                rk0.c.b("IPC.IPCInvoker", "invokeAsync failed, newInstance(%s) return null.", cls);
                return;
            } else {
                jVar.mo8834xb9724478(parcelable, rVar);
                return;
            }
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.l(cls);
        lk0.c a17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b().a(str, false);
        if (a17 == null) {
            rk0.c.b("IPC.IPCInvoker", "invokeAsync failed, get bridge is null by process(%s).", str);
            if (rVar instanceof com.p314xaae8f345.mm.p794xb0fa9b5e.s) {
                ((com.p314xaae8f345.mm.p794xb0fa9b5e.s) rVar).d();
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.l(null);
            return;
        }
        try {
            z17 = rk0.a.a(cls, mk0.a.class);
        } catch (java.lang.Exception unused) {
        }
        if (rVar != null) {
            try {
                try {
                    b0Var = new com.p314xaae8f345.mm.p794xb0fa9b5e.b0(str, rVar, z17);
                } catch (java.lang.Exception e17) {
                    rk0.c.a("IPC.IPCInvoker", "invokeAsync failed, ipc invoke error : %s", e17);
                    if (rVar instanceof com.p314xaae8f345.mm.p794xb0fa9b5e.s) {
                        ((com.p314xaae8f345.mm.p794xb0fa9b5e.s) rVar).c(e17);
                    }
                    com.p314xaae8f345.mm.p794xb0fa9b5e.d0.l(null);
                    return;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.l(null);
                throw th6;
            }
        } else {
            b0Var = null;
        }
        java.lang.String str2 = this.f150009h;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("__remote_task_data", parcelable);
        if (str2 != null) {
            bundle.putString("__command_tag", str2);
        }
        a17.Xf(bundle, cls.getName(), b0Var);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.l(null);
    }
}
