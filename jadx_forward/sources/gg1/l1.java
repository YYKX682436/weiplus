package gg1;

/* loaded from: classes7.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f353134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x91.h f353135e;

    public l1(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var, x91.h hVar, int i17) {
        this.f353134d = o4Var;
        this.f353135e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f353134d;
        java.util.Set stringSet = o4Var.getStringSet("VideoCastDeviceManager.saveDevice", null);
        java.util.List V0 = stringSet != null ? kz5.n0.V0(stringSet) : null;
        x91.h hVar = this.f353135e;
        x91.c cVar = hVar.f534180a;
        java.lang.String str = cVar != null ? cVar.f534174i : null;
        if (V0 == null) {
            x.d dVar = new x.d(0);
            dVar.add(str);
            o4Var.putStringSet("VideoCastDeviceManager.saveDevice", dVar);
            o4Var.putLong(str, java.lang.System.currentTimeMillis());
            return;
        }
        if (V0.contains(str)) {
            o4Var.putLong(str, java.lang.System.currentTimeMillis());
            return;
        }
        if (V0.size() >= 2) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(V0, 10));
            java.util.Iterator it = V0.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(o4Var.getLong((java.lang.String) it.next(), 0L)));
            }
            kz5.n0.D0(arrayList);
            o4Var.W((java.lang.String) V0.get(0));
            V0.set(0, str);
            o4Var.putLong(str, java.lang.System.currentTimeMillis());
        }
        x91.c cVar2 = hVar.f534180a;
        V0.add(cVar2 != null ? cVar2.f534174i : null);
        o4Var.putStringSet("VideoCastDeviceManager.saveDevice", kz5.n0.X0(V0));
        o4Var.putLong(str, java.lang.System.currentTimeMillis());
    }
}
