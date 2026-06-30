package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f219677a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f219678b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f219679c = false;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 activityC15592x3f0b3363, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363.AnonymousClass1 anonymousClass1) {
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.v2 v2Var, u13.g gVar) {
        if (v2Var != null) {
            boolean z17 = gVar instanceof e23.b1;
            if (z17) {
                v2Var.f219734a = 256;
            }
            ((java.util.ArrayList) this.f219677a).add(v2Var);
            if (z17) {
                d(v2Var, true);
            } else if (v2Var.f219734a == 16384) {
                d(v2Var, false);
            } else {
                c(v2Var);
            }
        }
    }

    public java.lang.Boolean b() {
        java.util.List list = this.f219677a;
        if (list == null || ((java.util.ArrayList) list).isEmpty()) {
            return null;
        }
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.v2) ((java.util.ArrayList) list).get(0)).f219734a;
        return java.lang.Boolean.valueOf(i17 == 256 || i17 == 16384);
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.v2 v2Var) {
        java.lang.Boolean b17 = b();
        java.util.Iterator it = ((java.util.ArrayList) this.f219678b).iterator();
        while (it.hasNext()) {
            try {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.s0) it.next()).a(v2Var, true, this.f219679c, b17, false, ((java.util.ArrayList) this.f219677a).isEmpty());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSMainUI", "notifyAdapterAdded error", e17);
            }
        }
    }

    public void d(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.v2 v2Var, boolean z17) {
        java.lang.Boolean b17 = b();
        java.util.Iterator it = ((java.util.ArrayList) this.f219678b).iterator();
        while (it.hasNext()) {
            try {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.s0) it.next()).a(v2Var, z17, this.f219679c, b17, true, ((java.util.ArrayList) this.f219677a).isEmpty());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSMainUI", "notifyRelevantSearchAdded error", e17);
            }
        }
    }
}
