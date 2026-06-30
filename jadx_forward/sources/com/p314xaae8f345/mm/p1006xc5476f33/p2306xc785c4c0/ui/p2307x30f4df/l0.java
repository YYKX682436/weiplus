package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class l0 implements mf0.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256565a;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar) {
        this.f256565a = jVar;
    }

    public boolean a(int i17) {
        for (wm4.y yVar : this.f256565a.f256532q) {
            if (yVar != null && i17 == yVar.f528851b && yVar.f528855f > 0) {
                return true;
            }
        }
        return false;
    }

    public void b(r45.qn6 qn6Var, int i17) {
        java.lang.String str = qn6Var.f465646d;
        long j17 = qn6Var.f465654o;
        int i18 = qn6Var.f465651i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256565a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar = jVar.f256526m;
        if (lVar != null) {
            lVar.s(str, j17, i18);
        }
        java.util.Iterator it = ((java.util.ArrayList) jVar.f256532q).iterator();
        while (it.hasNext()) {
            wm4.y yVar = (wm4.y) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onNewRedDotReceived item.category:%s category:%s", java.lang.Integer.valueOf(yVar.f528851b), java.lang.Integer.valueOf(i17));
            if (jVar.f256519d.mo78538xecd98af8() && wm4.u.q()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "proxyActivity is paused in MultiTask, does not clear finderMoreEntry timestamp");
                return;
            }
            if (pm4.w.l(yVar.f528851b) && pm4.w.l(i17)) {
                jVar.f256519d.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d0(this, yVar, str));
                if (!jVar.f256539x && yVar.f528856g <= 0) {
                    su4.k3.i(((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f427967b, 107, 1, 0, 0L, "");
                }
            }
            if (pm4.w.m(yVar.f528851b) && pm4.w.m(i17)) {
                jVar.f256519d.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.e0(this, yVar, str));
                if (!jVar.f256539x && yVar.f528856g <= 0) {
                    su4.k3.i(((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f427966a, 107, 1, 0, 0L, "");
                }
            }
            if (pm4.w.n(yVar.f528851b) && pm4.w.n(i17)) {
                jVar.f256519d.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.f0(this, yVar, str));
                if (!jVar.f256539x && yVar.f528856g <= 0) {
                    su4.k3.i(((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f427968c, 107, 1, 0, 0L, "");
                }
            }
        }
    }

    public void c(int i17, java.lang.String str, java.lang.String str2, int i18, int i19, java.lang.String str3, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256565a;
        if (z17 && (lVar = jVar.f256526m) != null) {
            lVar.r(str, str2, i18, i19, i17, str3);
        }
        for (wm4.y yVar : jVar.f256532q) {
            if (pm4.w.l(yVar.f528851b)) {
                jVar.f256519d.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.g0(this, yVar, i17, str2));
                if (i17 <= 0 || jVar.f256539x) {
                    return;
                }
                su4.k3.i(((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().r(), 107, 2, yVar.f528856g, 0L, "");
                return;
            }
        }
    }

    public void d(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256565a;
        for (wm4.y yVar : jVar.f256532q) {
            if (pm4.w.m(yVar.f528851b)) {
                jVar.f256519d.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.i0(this, yVar));
                return;
            }
        }
    }

    public void e(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256565a;
        for (wm4.y yVar : jVar.f256532q) {
            if (pm4.w.n(yVar.f528851b)) {
                jVar.f256519d.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j0(this, yVar));
                return;
            }
        }
    }
}
