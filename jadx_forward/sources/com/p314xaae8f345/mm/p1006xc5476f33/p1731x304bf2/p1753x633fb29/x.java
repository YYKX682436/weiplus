package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f222041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f222042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f222043f;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0 b0Var, int i17, java.lang.String str, boolean z17) {
        this.f222041d = i17;
        this.f222042e = str;
        this.f222043f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.f221758b;
        synchronized (set) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z) it.next()).a(this.f222041d, this.f222042e, this.f222043f);
            }
        }
    }
}
