package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 f231106a;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.v4 f231108c = null;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f231107b = new android.util.SparseArray(5);

    public f0() {
        this.f231106a = null;
        this.f231106a = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.d0(this);
    }

    public com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 a(boolean z17) {
        com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 interfaceC27802x9a5f7292;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: trigger validate callback %b", java.lang.Boolean.valueOf(z17));
        synchronized (this) {
            if (z17) {
                this.f231107b.clear();
            }
            interfaceC27802x9a5f7292 = this.f231106a;
        }
        return interfaceC27802x9a5f7292;
    }

    public void b(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0 e0Var) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: registering event id: %d", java.lang.Integer.valueOf(i17));
        synchronized (this) {
            java.util.HashSet hashSet = (java.util.HashSet) this.f231107b.get(i17);
            if (hashSet == null) {
                z17 = true;
                hashSet = new java.util.HashSet(1);
            } else {
                z17 = false;
            }
            hashSet.add(e0Var);
            if (z17) {
                this.f231107b.append(i17, hashSet);
            }
        }
    }

    public void c(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0 e0Var) {
        synchronized (this) {
            java.util.HashSet hashSet = (java.util.HashSet) this.f231107b.get(i17);
            if (hashSet != null) {
                hashSet.remove(e0Var);
            }
        }
    }
}
