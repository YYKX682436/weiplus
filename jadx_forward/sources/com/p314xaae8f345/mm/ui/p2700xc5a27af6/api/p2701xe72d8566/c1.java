package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c f289996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 f289997e;

    public c1(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var) {
        this.f289996d = c10750x9556b48c;
        this.f289997e = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareToBiz IPC result: ");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = this.f289996d;
        sb6.append(c10750x9556b48c.f149933d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", sb6.toString());
        if (c10750x9556b48c.f149933d) {
            com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var = this.f289997e;
            qj5.n nVar = j1Var.f290033f;
            if (nVar != null) {
                nVar.u();
            }
            j1Var.f290033f = null;
        }
    }
}
