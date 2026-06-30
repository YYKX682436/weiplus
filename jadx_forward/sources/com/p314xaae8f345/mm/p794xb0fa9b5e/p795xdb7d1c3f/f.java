package com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f;

/* loaded from: classes7.dex */
public class f implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f149884d;

    public f(boolean z17, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f149884d = rVar;
        if (z17) {
            return;
        }
        java.util.Map map = com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.f149887a;
        synchronized (map) {
            ((java.util.WeakHashMap) map).put(rVar, new java.lang.ref.WeakReference(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48 c10747xff81be48 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48) obj;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f149884d;
        if (rVar != null) {
            if (c10747xff81be48 != null) {
                rVar.a(c10747xff81be48.f149877e);
            } else {
                rk0.c.d("IPC.XIPCInvoker", "async invoke callback error, wrapper parcelable data is null!", new java.lang.Object[0]);
                rVar.a(null);
            }
        }
    }
}
