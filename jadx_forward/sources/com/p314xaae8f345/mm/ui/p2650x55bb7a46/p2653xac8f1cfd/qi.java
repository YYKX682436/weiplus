package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public final class qi extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oi f281319f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oi(null);

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21615x5b594e4d f281320e;

    @Override // yn.d
    public void U(long j17, java.lang.String str) {
        boolean contains = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).W.contains(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(j17, str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgComponent", "onEditModeItemClick msgId:" + j17 + " isSelected:" + contains);
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        java.lang.String x17 = this.f280113d.x();
        gb0.n nVar = (gb0.n) kVar;
        if (!nVar.m131177xdac2174d()) {
            fb0.j jVar = nVar.f351503e;
            if (jVar != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pi) jVar).a(false);
                return;
            }
            return;
        }
        java.util.HashMap hashMap = nVar.f351502d;
        if (!contains) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgService", "updateMsgMultiSelect remove msgId:" + j17);
            hashMap.remove(java.lang.Long.valueOf(j17));
            return;
        }
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgService", "updateMsgMultiSelect warning, msgId:" + j17);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(x17, j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 b17 = db0.g.f309361a.b(n17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgService", "updateMsgMultiSelect msgId:" + j17 + " msgInfo:" + n17 + " materialModel:" + b17);
        if (b17 != null) {
            hashMap.put(java.lang.Long.valueOf(j17), b17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5.class);
            java.util.Collection values = hashMap.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.List S0 = kz5.n0.S0(values);
            zh1.p pVar = (zh1.p) k5Var;
            pVar.getClass();
            java.lang.String a17 = S0.isEmpty() ? "" : ai1.b.f86614a.a(S0);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = nVar.f351504f;
            if (concurrentHashMap.containsKey(a17)) {
                java.lang.Object obj = concurrentHashMap.get(a17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    fb0.j jVar2 = nVar.f351503e;
                    if (jVar2 != null) {
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pi) jVar2).a(true);
                        return;
                    }
                    return;
                }
                fb0.j jVar3 = nVar.f351503e;
                if (jVar3 != null) {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pi) jVar3).a(false);
                    return;
                }
                return;
            }
            java.util.Collection values2 = hashMap.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 Di = pVar.Di(kz5.n0.S0(values2));
            if (Di == null || java.lang.System.currentTimeMillis() - Di.f167786h > ((java.lang.Number) ((jz5.n) db0.d.f309357b).mo141623x754a37bb()).longValue()) {
                java.util.Collection values3 = hashMap.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values3, "<get-values>(...)");
                pVar.Bi(kz5.n0.S0(values3), new gb0.m(nVar, a17));
            }
            if (Di != null) {
                if (Di.f167785g.size() > 0) {
                    fb0.j jVar4 = nVar.f351503e;
                    if (jVar4 != null) {
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pi) jVar4).a(true);
                        return;
                    }
                    return;
                }
                fb0.j jVar5 = nVar.f351503e;
                if (jVar5 != null) {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pi) jVar5).a(false);
                }
            }
        }
    }

    @Override // yn.d
    public void V(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgComponent", "onEnterEditMode");
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pi piVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pi(this);
        gb0.n nVar = (gb0.n) kVar;
        nVar.getClass();
        if (nVar.m131177xdac2174d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgService", "enableMultiSelect callback:" + piVar);
            nVar.f351502d.clear();
            nVar.f351503e = piVar;
        }
    }

    @Override // yn.d
    public void X() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgComponent", "onExitLongClickMode");
        gb0.n nVar = (gb0.n) ((fb0.k) i95.n0.c(fb0.k.class));
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgService", "disableMultiSelect");
        nVar.f351502d.clear();
        nVar.f351503e = null;
        nVar.f351504f.clear();
    }
}
