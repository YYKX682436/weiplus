package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui;

/* loaded from: classes15.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.c f220362d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.c cVar) {
        this.f220362d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.c cVar = this.f220362d;
        if (cVar.f220366c || cVar.f220365b || java.lang.System.currentTimeMillis() - cVar.f220367d < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            return;
        }
        cVar.f220365b = true;
        java.util.ArrayDeque arrayDeque = (java.util.ArrayDeque) cVar.f220368e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c) arrayDeque.poll();
        if (arrayDeque.isEmpty()) {
            wu5.c cVar2 = cVar.f220369f;
            if (cVar2 != null) {
                cVar2.cancel(false);
            }
            cVar.f220369f = null;
        }
        cVar.f220367d = java.lang.System.currentTimeMillis();
        s33.y.i(cVar.f220364a, c15780xf49d6a1c, 15, null);
    }
}
