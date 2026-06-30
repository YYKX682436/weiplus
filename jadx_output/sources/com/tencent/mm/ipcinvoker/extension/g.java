package com.tencent.mm.ipcinvoker.extension;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class g implements com.tencent.mm.ipcinvoker.j {
    private g() {
    }

    public /* synthetic */ g(com.tencent.mm.ipcinvoker.extension.f fVar) {
        this();
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable xIPCInvoker$WrapperParcelable = (com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable) obj;
        java.lang.Object obj2 = xIPCInvoker$WrapperParcelable.f68344e;
        java.lang.String str = xIPCInvoker$WrapperParcelable.f68343d;
        if (str == null || str.length() == 0) {
            rk0.c.b("IPC.IPCAsyncInvokeTaskProxy", "proxy AsyncInvoke failed, class is null or nil.", new java.lang.Object[0]);
            return;
        }
        com.tencent.mm.ipcinvoker.j jVar = (com.tencent.mm.ipcinvoker.j) com.tencent.mm.ipcinvoker.v0.b(str, com.tencent.mm.ipcinvoker.j.class);
        if (jVar == null) {
            rk0.c.d("IPC.IPCAsyncInvokeTaskProxy", "proxy AsyncInvoke failed, newInstance(%s) return null.", str);
        } else {
            jVar.invoke(obj2, new com.tencent.mm.ipcinvoker.extension.i(rVar));
        }
    }
}
