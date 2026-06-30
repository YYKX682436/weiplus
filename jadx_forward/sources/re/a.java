package re;

/* loaded from: classes7.dex */
public abstract class a extends com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.a implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7 {
    public a(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        super(bVar);
    }

    public void A() {
    }

    public final java.lang.String H() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l F = F();
        if (F != null) {
            return F.mo48798x74292566();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.AbstractPageViewRenderer", new java.lang.Throwable(), "getAppId", new java.lang.Object[0]);
        return null;
    }

    public android.content.Context I() {
        android.content.Context mo50352x76847179 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).mo50352x76847179();
        return mo50352x76847179 == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : mo50352x76847179;
    }

    public ze.n J() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F();
        if (bVar == null) {
            return null;
        }
        return bVar.t3();
    }

    public boolean b() {
        return false;
    }

    public void c(xi1.g gVar) {
    }

    public void k() {
        for (java.lang.Object obj : E()) {
            if (obj instanceof ni1.c) {
                ((ni1.c) obj).c();
            }
        }
    }

    public void m() {
        for (java.lang.Object obj : E()) {
            if (obj instanceof ni1.c) {
                ((ni1.c) obj).mo14691xac79a11b();
            }
        }
        synchronized (this.f128864e) {
            ((java.util.HashMap) this.f128864e).clear();
        }
        synchronized (this) {
            this.f128863d = null;
        }
    }

    public void n() {
        for (java.lang.Object obj : E()) {
            if (obj instanceof ni1.c) {
                ((ni1.c) obj).b();
            }
        }
    }

    public void u(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
    }

    public void v() {
    }
}
