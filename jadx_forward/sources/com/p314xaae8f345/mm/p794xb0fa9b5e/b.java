package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class b extends lk0.b {
    public b(com.p314xaae8f345.mm.p794xb0fa9b5e.AbstractServiceC10745xd59a50ca abstractServiceC10745xd59a50ca) {
    }

    @Override // lk0.c
    public android.os.Bundle D5(android.os.Bundle bundle, java.lang.String str) {
        if (str == null || str.length() == 0) {
            rk0.c.b("IPC.BaseIPCService", "invokeSync failed, class is null or nil.", new java.lang.Object[0]);
            return null;
        }
        if (bundle == null) {
            rk0.c.b("IPC.BaseIPCService", "invokeSync failed, data is null.", new java.lang.Object[0]);
            return null;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.k0 k0Var = (com.p314xaae8f345.mm.p794xb0fa9b5e.k0) com.p314xaae8f345.mm.p794xb0fa9b5e.v0.b(str, com.p314xaae8f345.mm.p794xb0fa9b5e.k0.class);
        if (k0Var == null) {
            rk0.c.b("IPC.BaseIPCService", "invokeSync failed, can not newInstance by class %s.", str);
            return null;
        }
        bundle.setClassLoader(com.p314xaae8f345.mm.p794xb0fa9b5e.AbstractServiceC10745xd59a50ca.class.getClassLoader());
        android.os.Parcelable parcelable = bundle.getParcelable("__remote_task_data");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("__remote_task_result_data", (android.os.Parcelable) k0Var.mo32082xb9724478(parcelable));
        return bundle2;
    }

    @Override // lk0.c
    public void Xf(android.os.Bundle bundle, java.lang.String str, lk0.f fVar) {
        if (str == null || str.length() == 0) {
            rk0.c.b("IPC.BaseIPCService", "invokeAsync failed, class is null or nil.", new java.lang.Object[0]);
            return;
        }
        if (bundle == null) {
            rk0.c.b("IPC.BaseIPCService", "invokeAsync failed, data is null.", new java.lang.Object[0]);
            return;
        }
        bundle.setClassLoader(com.p314xaae8f345.mm.p794xb0fa9b5e.AbstractServiceC10745xd59a50ca.class.getClassLoader());
        android.os.Parcelable parcelable = bundle.getParcelable("__remote_task_data");
        java.lang.String string = bundle.getString("__command_tag");
        com.p314xaae8f345.mm.p794xb0fa9b5e.j jVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.j) com.p314xaae8f345.mm.p794xb0fa9b5e.v0.b(str, com.p314xaae8f345.mm.p794xb0fa9b5e.j.class);
        if (jVar == null) {
            rk0.c.b("IPC.BaseIPCService", "invokeAsync failed, can not newInstance by class %s.", str);
            return;
        }
        rk0.c.c("IPC.BaseIPCService", "invokeAsync in target process, before ThreadPool.post, clazz=%s", str);
        com.p314xaae8f345.mm.p794xb0fa9b5e.a aVar = new com.p314xaae8f345.mm.p794xb0fa9b5e.a(this, jVar, parcelable, fVar, str);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r0 r0Var = com.p314xaae8f345.mm.p794xb0fa9b5e.r0.f149928b;
        rk0.c.c("IPC.IPCInvokeLogic", "getThreadPoolDelegate", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p794xb0fa9b5e.h hVar = com.p314xaae8f345.mm.p794xb0fa9b5e.y.f150003c;
        if (string == null || string.isEmpty() || hVar == null) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.r0.a(aVar);
        } else {
            ((ku5.t0) ((p65.C29968x30bb37) hVar).f433979a).h(aVar, string);
        }
    }
}
