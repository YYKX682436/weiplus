package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes14.dex */
public class v {

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v f181570b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f181571c = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f181572a = null;

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v vVar;
        if (f181570b != null) {
            return f181570b;
        }
        synchronized (f181571c) {
            if (f181570b == null) {
                f181570b = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v();
            }
            vVar = f181570b;
        }
        return vVar;
    }

    public synchronized void a(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u uVar) {
        if (uVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceCameraDataCallbackHolder", "hy: invalid callbacker");
            return;
        }
        synchronized (f181571c) {
            if (this.f181572a == null) {
                this.f181572a = java.util.Collections.synchronizedList(new java.util.ArrayList(5));
            }
            this.f181572a.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.t(this, uVar));
        }
    }

    public void c(byte[] bArr) {
        synchronized (f181571c) {
            java.util.List list = this.f181572a;
            if (list != null && list.size() != 0) {
                if (bArr != null && bArr.length != 0) {
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.t tVar : this.f181572a) {
                        int length = bArr.length;
                        byte[] bArr2 = (byte[]) tVar.f181568a.b().m(java.lang.Integer.valueOf(length));
                        tVar.f181569b = bArr2;
                        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
                        tVar.f181568a.a(tVar.f181569b);
                    }
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceCameraDataCallbackHolder", "hy: null camera data got");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceCameraDataCallbackHolder", "hy: nothing's listening to preview data");
        }
    }

    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u uVar) {
        synchronized (f181571c) {
            java.util.List list = this.f181572a;
            if (list != null) {
                list.remove(new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.t(this, uVar));
            }
        }
    }
}
