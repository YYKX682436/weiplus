package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes7.dex */
public class k extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f158509d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f158510e = new java.util.HashSet();

    public void Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f c11741xcdfabd1f) {
        if (c11741xcdfabd1f == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11741xcdfabd1f.f158478d)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningManagerService", "receiveOperation in appbrand process, operation:%s", c11741xcdfabd1f);
        synchronized (this.f158510e) {
            java.util.Iterator it = this.f158510e.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t0) it.next()).a(c11741xcdfabd1f);
            }
        }
    }

    public void Bi(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0 u0Var) {
        if (u0Var == null) {
            return;
        }
        synchronized (this.f158509d) {
            this.f158509d.remove(u0Var);
        }
    }

    public void Di(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 c11738x6e2c0d85) {
        if (c11738x6e2c0d85 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningManagerService", "sendOperation from appbrand process, operation:%s", c11738x6e2c0d85);
            synchronized (this.f158509d) {
                java.util.Iterator it = this.f158509d.iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0) it.next()).a(c11738x6e2c0d85);
                }
            }
            if (c11738x6e2c0d85.f158476r) {
                return;
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c11738x6e2c0d85, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.j.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.i(this));
        }
    }

    public void wi(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0 u0Var) {
        if (u0Var == null) {
            return;
        }
        synchronized (this.f158509d) {
            this.f158509d.add(u0Var);
        }
    }
}
