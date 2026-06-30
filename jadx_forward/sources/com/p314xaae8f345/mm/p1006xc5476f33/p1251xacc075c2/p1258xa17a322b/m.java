package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f174185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.ParcelFileDescriptor f174186e;

    public m(int i17, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.f174185d = i17;
        this.f174186e = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "open accessory successfully, fd=" + this.f174185d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a c12844xf7745c1a = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a.f174086a;
        int i17 = this.f174185d;
        c12844xf7745c1a.getClass();
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a.f174090e;
        synchronized (arrayList) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.k) it.next()).a(true);
            }
        }
        if (i17 >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "Notify affroam a new fd=" + i17 + " is opened");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.c0 c0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.c0();
            c0Var.f297335e = true;
            c0Var.f297334d = 2;
            c0Var.f297338h = i17;
            c0Var.f297337g = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().j(c0Var);
        }
        this.f174186e.close();
    }
}
