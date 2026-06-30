package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f68472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f68473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Parcelable f68474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f68475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f68476h;

    public z(java.lang.Class cls, java.lang.String str, android.os.Parcelable parcelable, com.tencent.mm.ipcinvoker.r rVar, java.lang.String str2) {
        this.f68472d = cls;
        this.f68473e = str;
        this.f68474f = parcelable;
        this.f68475g = rVar;
        this.f68476h = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ipcinvoker.b0 b0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invokeAsync run, task=");
        java.lang.Class cls = this.f68472d;
        sb6.append(cls);
        sb6.append(", proc=");
        java.lang.String str = this.f68473e;
        sb6.append(str);
        boolean z17 = false;
        rk0.c.c("IPC.IPCInvoker", sb6.toString(), new java.lang.Object[0]);
        boolean b17 = com.tencent.mm.ipcinvoker.y.b(str);
        android.os.Parcelable parcelable = this.f68474f;
        com.tencent.mm.ipcinvoker.r rVar = this.f68475g;
        if (b17) {
            com.tencent.mm.ipcinvoker.j jVar = (com.tencent.mm.ipcinvoker.j) com.tencent.mm.ipcinvoker.v0.a(cls, com.tencent.mm.ipcinvoker.j.class);
            if (jVar == null) {
                rk0.c.b("IPC.IPCInvoker", "invokeAsync failed, newInstance(%s) return null.", cls);
                return;
            } else {
                jVar.invoke(parcelable, rVar);
                return;
            }
        }
        com.tencent.mm.ipcinvoker.d0.l(cls);
        lk0.c a17 = com.tencent.mm.ipcinvoker.q.b().a(str, false);
        if (a17 == null) {
            rk0.c.b("IPC.IPCInvoker", "invokeAsync failed, get bridge is null by process(%s).", str);
            if (rVar instanceof com.tencent.mm.ipcinvoker.s) {
                ((com.tencent.mm.ipcinvoker.s) rVar).d();
            }
            com.tencent.mm.ipcinvoker.d0.l(null);
            return;
        }
        try {
            z17 = rk0.a.a(cls, mk0.a.class);
        } catch (java.lang.Exception unused) {
        }
        if (rVar != null) {
            try {
                try {
                    b0Var = new com.tencent.mm.ipcinvoker.b0(str, rVar, z17);
                } catch (java.lang.Exception e17) {
                    rk0.c.a("IPC.IPCInvoker", "invokeAsync failed, ipc invoke error : %s", e17);
                    if (rVar instanceof com.tencent.mm.ipcinvoker.s) {
                        ((com.tencent.mm.ipcinvoker.s) rVar).c(e17);
                    }
                    com.tencent.mm.ipcinvoker.d0.l(null);
                    return;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.ipcinvoker.d0.l(null);
                throw th6;
            }
        } else {
            b0Var = null;
        }
        java.lang.String str2 = this.f68476h;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("__remote_task_data", parcelable);
        if (str2 != null) {
            bundle.putString("__command_tag", str2);
        }
        a17.Xf(bundle, cls.getName(), b0Var);
        com.tencent.mm.ipcinvoker.d0.l(null);
    }
}
