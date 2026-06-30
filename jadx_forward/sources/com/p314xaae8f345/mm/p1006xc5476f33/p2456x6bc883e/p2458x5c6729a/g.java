package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class g implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private g() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.h.f269865a.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.c) weakReference.get()).a(obj);
            }
        }
        rVar.a(null);
    }
}
