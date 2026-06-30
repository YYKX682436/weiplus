package com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8;

/* loaded from: classes11.dex */
public class a1 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile pq5.d f270152b;

    /* renamed from: a, reason: collision with root package name */
    public final a25.u f270153a;

    public a1() {
        if (f270152b != null) {
            this.f270153a = (a25.u) f270152b.get();
        } else {
            this.f270153a = null;
        }
    }

    public void a(java.lang.Object obj) {
        a25.u uVar = this.f270153a;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.z2 z2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.z2) uVar;
            z2Var.getClass();
            boolean z17 = obj instanceof w11.z0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.z2.f230302b;
            if (z17) {
                z2Var.f230303a.a();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Pa(((w11.z0) obj).f523715d);
                v2Var.x(obj);
            } else if ((obj instanceof java.lang.String) && obj.equals("NetSceneInit")) {
                z2Var.f230303a.a();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Pa((java.lang.String) obj);
                v2Var.x(obj);
            } else if (obj instanceof w11.u) {
                z2Var.f230303a.a();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Pa(obj.toString());
                v2Var.x(obj);
            }
        }
    }

    public void b(java.lang.Object obj) {
        a25.u uVar = this.f270153a;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.z2 z2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.z2) uVar;
            z2Var.getClass();
            pq5.d dVar = vg3.b5.f518183b;
            if (dVar != null) {
                z2Var.f230303a = (vg3.z4) dVar.get();
            }
            if (z2Var.f230303a == null) {
                z2Var.f230303a = new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u2();
            }
            boolean z17 = obj instanceof w11.z0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.z2.f230302b;
            if (z17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().aa(((w11.z0) obj).f523715d);
                v2Var.y(obj);
            } else {
                if (obj instanceof java.lang.String) {
                    if (obj.equals("NetSceneInit")) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().aa((java.lang.String) obj);
                        v2Var.y(obj);
                        return;
                    }
                    return;
                }
                if (obj instanceof w11.u) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().aa(obj.toString());
                    v2Var.y(obj);
                }
            }
        }
    }

    public void c(java.lang.Object obj) {
        a25.u uVar = this.f270153a;
        if (uVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.z2) uVar).getClass();
            if (obj instanceof w11.z0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Pa(((w11.z0) obj).f523715d);
            }
        }
    }

    public boolean d(java.lang.Object obj, int i17, int i18, r45.b50 b50Var, boolean z17, r45.cx4 cx4Var, int i19) {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncDoCmdDelegate", "account storage disabled, discard all commands");
            return false;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        byte[] d17 = x51.j1.d(b50Var.f452064e);
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Long.valueOf(currentTimeMillis);
        objArr[1] = java.lang.Integer.valueOf(b50Var.f452063d);
        objArr[2] = java.lang.Integer.valueOf(d17 == null ? -1 : d17.length);
        objArr[3] = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        objArr[4] = java.lang.Integer.valueOf(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncDoCmdDelegate", "doCmd %d cmdid:%d buf:%d thr:[%d] callSource:%s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(d17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncDoCmdDelegate", "docmd: no protobuf found.");
            return false;
        }
        try {
            a25.u uVar = this.f270153a;
            if (uVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.z2) uVar).a(obj, i17, i18, b50Var, d17, z17, cx4Var);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncDoCmdDelegate", "doCmd FIN %d cmdid:%d Time:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(b50Var.f452063d), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return true;
        } catch (java.lang.Error | java.lang.Exception e17) {
            w11.k.f523601a.b(b50Var, e17, i19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SyncDoCmdDelegate", e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}
