package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes7.dex */
public class d implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0> {
    private d() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159436b;
        java.lang.String str = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj).f149939d;
        aVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBleKeepAlive", "scheduleRestart: " + str);
        synchronized (aVar) {
            java.util.Iterator it = ((android.util.ArraySet) aVar.f159397b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    c11858x835ced59 = null;
                    break;
                }
                android.util.Pair pair = (android.util.Pair) it.next();
                if ((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59) pair.first).f65990x28d45f97 + ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59) pair.first).f65995x94d24c6d + ((java.lang.String) pair.second)).equals(str)) {
                    c11858x835ced59 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59) pair.first;
                    break;
                }
            }
        }
        if (c11858x835ced59 != null) {
            synchronized (aVar) {
                ((android.util.ArraySet) aVar.f159398c).add(c11858x835ced59);
                ((android.util.ArraySet) aVar.f159397b).remove(new android.util.Pair(c11858x835ced59, str));
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.a aVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.a.this;
                    aVar2.getClass();
                    android.util.ArraySet arraySet = new android.util.ArraySet();
                    synchronized (aVar2) {
                        arraySet.addAll(aVar2.f159398c);
                        ((android.util.ArraySet) aVar2.f159398c).clear();
                    }
                    java.util.Iterator it6 = arraySet.iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced592 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59) it6.next();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBleKeepAlive", "restart: " + c11858x835ced592);
                        if (aVar2.b()) {
                            aVar2.f159396a.j(c11858x835ced592, true);
                            synchronized (aVar2) {
                                ((java.util.ArrayList) aVar2.f159399d).add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                            }
                        }
                    }
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.t(runnable, 5000L, null);
        }
        rVar.a(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d);
    }
}
