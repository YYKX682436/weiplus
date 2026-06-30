package aw4;

/* loaded from: classes8.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw4.u f96436d;

    public t(aw4.u uVar) {
        this.f96436d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uv4.g g17;
        try {
            try {
                g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(this.f96436d.f96439a);
            } catch (java.lang.Exception e17) {
                this.f96436d.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchClient", e17, "triggerTemplateIntegrityCheck failed, type=%d", java.lang.Integer.valueOf(this.f96436d.f96439a));
            }
            if (g17 == null) {
                aw4.u.f96438d.set(false);
                return;
            }
            java.lang.String l17 = g17.l();
            if (g17 instanceof uv4.p) {
                if (((uv4.p) g17).w(l17)) {
                    this.f96436d.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchClient", "triggerTemplateIntegrityCheck: UDR template integrity check passed, type=%d, path=%s", java.lang.Integer.valueOf(this.f96436d.f96439a), l17);
                } else {
                    this.f96436d.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchClient", "triggerTemplateIntegrityCheck: UDR template integrity check FAILED, type=%d, path=%s, deleting and resetting", java.lang.Integer.valueOf(this.f96436d.f96439a), l17);
                    com.p314xaae8f345.mm.vfs.w6.f(l17);
                    g17.k();
                    uv4.x xVar = uv4.x.f512991a;
                    uv4.x.f512994d = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "resetProcessCheck: isProcessCheck reset to false");
                }
            } else if (g17 instanceof uv4.b) {
                if (uv4.b.f512949g.d(l17, this.f96436d.f96439a)) {
                    this.f96436d.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchClient", "triggerTemplateIntegrityCheck: template integrity check passed, type=%d, path=%s", java.lang.Integer.valueOf(this.f96436d.f96439a), l17);
                } else {
                    this.f96436d.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchClient", "triggerTemplateIntegrityCheck: template integrity check FAILED, type=%d, path=%s, triggering re-init", java.lang.Integer.valueOf(this.f96436d.f96439a), l17);
                    g17.g();
                }
            }
            aw4.u.f96438d.set(false);
        } catch (java.lang.Throwable th6) {
            aw4.u.f96438d.set(false);
            throw th6;
        }
    }
}
