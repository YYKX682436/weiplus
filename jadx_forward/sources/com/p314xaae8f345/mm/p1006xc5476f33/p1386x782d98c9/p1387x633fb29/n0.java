package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f180529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 f180530e;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 o0Var, java.util.List list) {
        this.f180530e = o0Var;
        this.f180529d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "Wifi device heart beat");
        java.util.List<v32.b> list = this.f180529d;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (v32.b bVar : list) {
            u32.h1.c().b(new w32.k(bVar.f66602x6bae49ad, bVar.f66607xe7b73b15, bVar.f66606x5fdff396, 1));
        }
        this.f180530e.U.mo50297x7c4d7ca2(this, 300000L);
    }
}
