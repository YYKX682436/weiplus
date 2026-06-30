package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 f177431a = null;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.j f177433c = null;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f177432b = new android.util.SparseArray(5);

    public com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 a(boolean z17) {
        com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 interfaceC27802x9a5f7292;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: trigger validate callback %b", java.lang.Boolean.valueOf(z17));
        synchronized (this) {
            if (z17) {
                this.f177431a = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d0(this);
            } else {
                this.f177431a = null;
            }
            this.f177432b.clear();
            interfaceC27802x9a5f7292 = this.f177431a;
        }
        return interfaceC27802x9a5f7292;
    }

    public void b(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.e0 e0Var) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: registering event id: %d", java.lang.Integer.valueOf(i17));
        synchronized (this) {
            java.util.HashSet hashSet = (java.util.HashSet) this.f177432b.get(i17);
            if (hashSet == null) {
                z17 = true;
                hashSet = new java.util.HashSet(1);
            } else {
                z17 = false;
            }
            hashSet.add(e0Var);
            if (z17) {
                this.f177432b.append(i17, hashSet);
            }
        }
    }

    public void c(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.e0 e0Var) {
        synchronized (this) {
            java.util.HashSet hashSet = (java.util.HashSet) this.f177432b.get(i17);
            if (hashSet != null) {
                hashSet.remove(e0Var);
            }
        }
    }
}
