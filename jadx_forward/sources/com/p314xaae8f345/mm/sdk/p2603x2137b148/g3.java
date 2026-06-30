package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public final class g3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.o {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f274247f;

    /* renamed from: g, reason: collision with root package name */
    public final long f274248g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f274249h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(java.lang.String name, long j17) {
        super(j17, 0, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f274247f = "MMFileSlotManager";
        this.f274248g = 1000L;
        this.f274249h = name + '/' + j17 + '/';
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o
    public void b(long j17, java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.HashMap hashMap;
        com.p314xaae8f345.mm.vfs.r6 slot = (com.p314xaae8f345.mm.vfs.r6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slot, "slot");
        try {
            java.lang.String[] E = slot.E(new com.p314xaae8f345.mm.sdk.p2603x2137b148.d3(j17));
            if (E != null) {
                arrayList = new java.util.ArrayList(E.length);
                for (java.lang.String str : E) {
                    arrayList.add(slot.u() + '/' + str);
                }
            } else {
                arrayList = null;
            }
            long j18 = this.f274248g;
            java.lang.String str2 = java.util.List.class.getCanonicalName() + "_batch";
            synchronized (com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274039a) {
                hashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274040b;
                p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) hashMap.get(str2);
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                java.util.HashMap hashMap2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274041c;
                if (!hashMap2.containsKey(str2)) {
                    hashMap2.put(str2, new java.util.LinkedList());
                }
                java.lang.Object obj2 = hashMap2.get(str2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type java.util.LinkedList<T of com.tencent.mm.sdk.platformtools.MMBatchRunKt.batchRun$lambda$1$lambda$0>");
                ((java.util.LinkedList) obj2).add(arrayList);
            }
            hashMap.put(str2, p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.sdk.p2603x2137b148.f3(j18, str2, null, this), 2, null));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f274247f, e17, "clearSlot", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o
    public boolean c(java.lang.Object obj, java.lang.String key) {
        com.p314xaae8f345.mm.vfs.r6 slot = (com.p314xaae8f345.mm.vfs.r6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slot, "slot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(slot.u() + '/' + key);
        return r6Var.m() && r6Var.C() > 0;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o
    public java.lang.String f() {
        return this.f274249h;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o
    public java.lang.Object g(java.lang.String slotKey, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotKey, "slotKey");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(m(slotKey, j17));
        r6Var.u();
        if (!r6Var.m()) {
            r6Var.J();
            r6Var.m82469x9616526c();
        }
        return r6Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o
    public void j(java.lang.String slotKey, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotKey, "slotKey");
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o
    public boolean l(java.lang.String slotKey, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotKey, "slotKey");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(m(slotKey, j17));
        return r6Var.m() && r6Var.C() > 0;
    }

    public final java.lang.String m(java.lang.String str, long j17) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.e());
        sb6.append("mmslot/");
        sb6.append(str);
        sb6.append('/');
        if (j17 > 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(j17);
            sb7.append('/');
            str2 = sb7.toString();
        } else {
            str2 = "";
        }
        sb6.append(str2);
        return sb6.toString();
    }
}
