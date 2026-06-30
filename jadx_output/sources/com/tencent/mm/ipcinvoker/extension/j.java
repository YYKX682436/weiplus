package com.tencent.mm.ipcinvoker.extension;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class j implements com.tencent.mm.ipcinvoker.k0 {
    private j() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable xIPCInvoker$WrapperParcelable = (com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable) obj;
        java.lang.Object obj2 = xIPCInvoker$WrapperParcelable.f68344e;
        java.lang.String str = xIPCInvoker$WrapperParcelable.f68343d;
        if (str == null || str.length() == 0) {
            rk0.c.b("IPC.XIPCInvoker", "proxy SyncInvoke failed, class is null or nil.", new java.lang.Object[0]);
            return new com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable(null, null);
        }
        com.tencent.mm.ipcinvoker.k0 k0Var = (com.tencent.mm.ipcinvoker.k0) com.tencent.mm.ipcinvoker.v0.b(str, com.tencent.mm.ipcinvoker.k0.class);
        if (k0Var != null) {
            return new com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable(null, k0Var.invoke(obj2));
        }
        rk0.c.d("IPC.XIPCInvoker", "proxy SyncInvoke failed, newInstance(%s) return null.", str);
        return new com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable(null, null);
    }
}
