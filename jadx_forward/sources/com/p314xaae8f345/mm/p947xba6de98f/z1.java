package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.h2 f152718d;

    public z1(com.p314xaae8f345.mm.p947xba6de98f.h2 h2Var) {
        this.f152718d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCrashTask onAppForeground = ");
        com.p314xaae8f345.mm.p947xba6de98f.h2 h2Var = this.f152718d;
        sb6.append(h2Var.f152525p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", sb6.toString());
        if (h2Var.f152525p) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : h2Var.f152518f.entrySet()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - ((com.p314xaae8f345.mm.p947xba6de98f.f2) entry.getValue()).f152483d;
            long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_cdn_callback_tooslow_crash_maxtime, u04.d.f505010c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "getToolSlowCrashMaxTime:" + Ui);
            if (currentTimeMillis > java.lang.Math.max(u04.d.f505010c, Ui) && ((com.p314xaae8f345.mm.p947xba6de98f.f2) entry.getValue()).f152484e == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "tooSlowlist add:" + ((com.p314xaae8f345.mm.p947xba6de98f.f2) entry.getValue()).f152481b);
                arrayList.add((com.p314xaae8f345.mm.p947xba6de98f.f2) entry.getValue());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkCrashTaskd");
        sb7.append(h2Var.f152525p);
        sb7.append(", ");
        sb7.append(h2Var.f152522m == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", sb7.toString());
        if (h2Var.f152525p) {
            return;
        }
        java.lang.Thread thread = h2Var.f152522m;
        if (thread != null) {
            for (java.lang.StackTraceElement stackTraceElement : thread.getStackTrace()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", stackTraceElement.toString());
            }
        }
        com.p314xaae8f345.mm.p947xba6de98f.g2 g2Var = (com.p314xaae8f345.mm.p947xba6de98f.g2) arrayList.get(0);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
        c6423x452b9f7c.f137646e = 1040L;
        c6423x452b9f7c.p(g2Var.f152481b);
        c6423x452b9f7c.f137645d = java.lang.System.currentTimeMillis() - g2Var.f152483d;
        c6423x452b9f7c.o();
        c6423x452b9f7c.k();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("assert(before sleep)");
        sb8.append(h2Var.f152525p);
        sb8.append(", ");
        sb8.append(h2Var.f152522m == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", sb8.toString());
        h2Var.getClass();
        java.lang.String a17 = j62.e.g().a("clicfg_cdn_callback_allow_slowcrash", "0", false, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "getIsAllowSlowCrash() sw:%s", a17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(a17, "1")) {
            try {
                java.lang.Thread.sleep(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            } catch (java.lang.InterruptedException unused) {
            }
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("assert(after sleep)");
            sb9.append(h2Var.f152525p);
            sb9.append(", ");
            sb9.append(h2Var.f152522m == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", sb9.toString());
            if (h2Var.f152525p) {
                return;
            }
            iz5.a.h("Cdn callback too Slow: " + ((com.p314xaae8f345.mm.p947xba6de98f.f2) arrayList.get(0)).f152481b);
            throw null;
        }
    }
}
