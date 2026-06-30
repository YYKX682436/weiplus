package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class w4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.v4 f277840a;

    public w4() {
        com.p314xaae8f345.mm.p2621x8fb0427b.v4 v4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.v4();
        this.f277840a = v4Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("checkmsgid.ini");
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(sb6.toString(), 0, -1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(N)) {
            return;
        }
        try {
            v4Var.mo11468x92b714fd(N);
            if (b()) {
                c();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DelSvrIdMgr", "DelSvrIDs parse Error");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DelSvrIdMgr", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public void a(int i17, long j17, long j18, boolean z17) {
        if (j17 == 0) {
            return;
        }
        if (z17) {
            b();
        }
        int i18 = i17 - ((int) (j18 / 86400));
        com.p314xaae8f345.mm.p2621x8fb0427b.v4 v4Var = this.f277840a;
        if (i18 == 0) {
            v4Var.f277814h.add(java.lang.Long.valueOf(j17));
        } else if (i18 == 1) {
            v4Var.f277815i.add(java.lang.Long.valueOf(j17));
        } else if (i18 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DelSvrIdMgr", "should not add to thease lists, dayIndex:%d", java.lang.Integer.valueOf(i18));
        } else {
            v4Var.f277816m.add(java.lang.Long.valueOf(j17));
        }
        if (z17) {
            c();
        }
    }

    public boolean b() {
        com.p314xaae8f345.mm.p2621x8fb0427b.v4 v4Var = this.f277840a;
        int i17 = v4Var.f277810d;
        v4Var.f277814h.size();
        v4Var.f277815i.size();
        v4Var.f277816m.size();
        int i18 = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() / 86400);
        int i19 = i18 - v4Var.f277810d;
        v4Var.f277810d = i18;
        if (i19 == 0) {
            return false;
        }
        if (i19 == 1) {
            v4Var.f277816m = v4Var.f277815i;
            java.util.LinkedList linkedList = v4Var.f277814h;
            v4Var.f277815i = linkedList;
            linkedList.clear();
            return true;
        }
        if (i19 != 2) {
            v4Var.f277816m.clear();
            v4Var.f277815i.clear();
            v4Var.f277814h.clear();
            return true;
        }
        v4Var.f277816m = v4Var.f277814h;
        v4Var.f277815i.clear();
        v4Var.f277814h.clear();
        return true;
    }

    public final void c() {
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        com.p314xaae8f345.mm.p2621x8fb0427b.v4 v4Var = this.f277840a;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(v4Var.f277814h.size());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(v4Var.f277815i.size());
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(v4Var.f277816m.size());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelSvrIdMgr", "summerdel toFile tid[%d] [%d, %d ,%d] stack[%s]", valueOf, valueOf2, valueOf3, valueOf4, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        try {
            v4Var.f277813g.clear();
            v4Var.f277812f.clear();
            v4Var.f277811e.clear();
            com.p314xaae8f345.mm.p2621x8fb0427b.v4 v4Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.v4();
            java.util.LinkedList linkedList = v4Var2.f277814h;
            linkedList.addAll(v4Var.f277814h);
            v4Var2.f277815i.addAll(v4Var.f277815i);
            v4Var2.f277816m.addAll(v4Var.f277816m);
            byte[] mo14344x5f01b1f6 = v4Var2.mo14344x5f01b1f6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb6.append(gm0.j1.u().h());
            sb6.append("checkmsgid.ini");
            com.p314xaae8f345.mm.vfs.w6.S(sb6.toString(), mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelSvrIdMgr", "summerdel toFile done [%d, %d, %d] data len[%d]", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(v4Var2.f277815i.size()), java.lang.Integer.valueOf(v4Var2.f277816m.size()), java.lang.Integer.valueOf(mo14344x5f01b1f6.length));
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 168L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DelSvrIdMgr", e17, "summerdel ", new java.lang.Object[0]);
        }
    }
}
