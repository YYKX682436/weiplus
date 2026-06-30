package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class b extends lk0.b {
    public b(com.tencent.mm.ipcinvoker.BaseIPCService baseIPCService) {
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
        com.tencent.mm.ipcinvoker.k0 k0Var = (com.tencent.mm.ipcinvoker.k0) com.tencent.mm.ipcinvoker.v0.b(str, com.tencent.mm.ipcinvoker.k0.class);
        if (k0Var == null) {
            rk0.c.b("IPC.BaseIPCService", "invokeSync failed, can not newInstance by class %s.", str);
            return null;
        }
        bundle.setClassLoader(com.tencent.mm.ipcinvoker.BaseIPCService.class.getClassLoader());
        android.os.Parcelable parcelable = bundle.getParcelable("__remote_task_data");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("__remote_task_result_data", (android.os.Parcelable) k0Var.invoke(parcelable));
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
        bundle.setClassLoader(com.tencent.mm.ipcinvoker.BaseIPCService.class.getClassLoader());
        android.os.Parcelable parcelable = bundle.getParcelable("__remote_task_data");
        java.lang.String string = bundle.getString("__command_tag");
        com.tencent.mm.ipcinvoker.j jVar = (com.tencent.mm.ipcinvoker.j) com.tencent.mm.ipcinvoker.v0.b(str, com.tencent.mm.ipcinvoker.j.class);
        if (jVar == null) {
            rk0.c.b("IPC.BaseIPCService", "invokeAsync failed, can not newInstance by class %s.", str);
            return;
        }
        rk0.c.c("IPC.BaseIPCService", "invokeAsync in target process, before ThreadPool.post, clazz=%s", str);
        com.tencent.mm.ipcinvoker.a aVar = new com.tencent.mm.ipcinvoker.a(this, jVar, parcelable, fVar, str);
        com.tencent.mm.ipcinvoker.r0 r0Var = com.tencent.mm.ipcinvoker.r0.f68395b;
        rk0.c.c("IPC.IPCInvokeLogic", "getThreadPoolDelegate", new java.lang.Object[0]);
        com.tencent.mm.ipcinvoker.h hVar = com.tencent.mm.ipcinvoker.y.f68470c;
        if (string == null || string.isEmpty() || hVar == null) {
            com.tencent.mm.ipcinvoker.r0.a(aVar);
        } else {
            ((ku5.t0) ((p65.j$$a) hVar).f352446a).h(aVar, string);
        }
    }
}
