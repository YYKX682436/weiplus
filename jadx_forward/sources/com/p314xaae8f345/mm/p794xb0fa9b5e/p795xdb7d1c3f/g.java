package com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class g implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private g() {
    }

    public /* synthetic */ g(com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.f fVar) {
        this();
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48 c10747xff81be48 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48) obj;
        java.lang.Object obj2 = c10747xff81be48.f149877e;
        java.lang.String str = c10747xff81be48.f149876d;
        if (str == null || str.length() == 0) {
            rk0.c.b("IPC.IPCAsyncInvokeTaskProxy", "proxy AsyncInvoke failed, class is null or nil.", new java.lang.Object[0]);
            return;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.j jVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.j) com.p314xaae8f345.mm.p794xb0fa9b5e.v0.b(str, com.p314xaae8f345.mm.p794xb0fa9b5e.j.class);
        if (jVar == null) {
            rk0.c.d("IPC.IPCAsyncInvokeTaskProxy", "proxy AsyncInvoke failed, newInstance(%s) return null.", str);
        } else {
            jVar.mo8834xb9724478(obj2, new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.i(rVar));
        }
    }
}
