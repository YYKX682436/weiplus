package com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class j implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private j() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48 c10747xff81be48 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48) obj;
        java.lang.Object obj2 = c10747xff81be48.f149877e;
        java.lang.String str = c10747xff81be48.f149876d;
        if (str == null || str.length() == 0) {
            rk0.c.b("IPC.XIPCInvoker", "proxy SyncInvoke failed, class is null or nil.", new java.lang.Object[0]);
            return new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48(null, null);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.k0 k0Var = (com.p314xaae8f345.mm.p794xb0fa9b5e.k0) com.p314xaae8f345.mm.p794xb0fa9b5e.v0.b(str, com.p314xaae8f345.mm.p794xb0fa9b5e.k0.class);
        if (k0Var != null) {
            return new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48(null, k0Var.mo32082xb9724478(obj2));
        }
        rk0.c.d("IPC.XIPCInvoker", "proxy SyncInvoke failed, newInstance(%s) return null.", str);
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48(null, null);
    }
}
