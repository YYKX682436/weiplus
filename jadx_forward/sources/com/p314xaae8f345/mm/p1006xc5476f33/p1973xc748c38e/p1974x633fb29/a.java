package com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec f236482d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f236483e;

    public a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec, com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.n nVar) {
        this.f236482d = c5587xf7a06bec;
        this.f236483e = new java.lang.ref.WeakReference(nVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec;
        am.ef efVar;
        java.lang.ref.WeakReference weakReference = this.f236483e;
        if (weakReference == null || weakReference.get() == null || (c5587xf7a06bec = this.f236482d) == null || (efVar = c5587xf7a06bec.f135910h) == null) {
            return;
        }
        int i17 = efVar.f88087a;
        if (i17 == 1) {
            ((e04.p) ((com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.n) weakReference.get())).D(true);
        } else if (i17 == 2) {
            ((e04.p) ((com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.n) weakReference.get())).D(false);
        }
    }
}
