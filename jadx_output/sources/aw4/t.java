package aw4;

/* loaded from: classes8.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw4.u f14903d;

    public t(aw4.u uVar) {
        this.f14903d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uv4.g g17;
        try {
            try {
                g17 = com.tencent.mm.plugin.websearch.l2.g(this.f14903d.f14906a);
            } catch (java.lang.Exception e17) {
                this.f14903d.getClass();
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchClient", e17, "triggerTemplateIntegrityCheck failed, type=%d", java.lang.Integer.valueOf(this.f14903d.f14906a));
            }
            if (g17 == null) {
                aw4.u.f14905d.set(false);
                return;
            }
            java.lang.String l17 = g17.l();
            if (g17 instanceof uv4.p) {
                if (((uv4.p) g17).w(l17)) {
                    this.f14903d.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchClient", "triggerTemplateIntegrityCheck: UDR template integrity check passed, type=%d, path=%s", java.lang.Integer.valueOf(this.f14903d.f14906a), l17);
                } else {
                    this.f14903d.getClass();
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchClient", "triggerTemplateIntegrityCheck: UDR template integrity check FAILED, type=%d, path=%s, deleting and resetting", java.lang.Integer.valueOf(this.f14903d.f14906a), l17);
                    com.tencent.mm.vfs.w6.f(l17);
                    g17.k();
                    uv4.x xVar = uv4.x.f431458a;
                    uv4.x.f431461d = false;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "resetProcessCheck: isProcessCheck reset to false");
                }
            } else if (g17 instanceof uv4.b) {
                if (uv4.b.f431416g.d(l17, this.f14903d.f14906a)) {
                    this.f14903d.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchClient", "triggerTemplateIntegrityCheck: template integrity check passed, type=%d, path=%s", java.lang.Integer.valueOf(this.f14903d.f14906a), l17);
                } else {
                    this.f14903d.getClass();
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchClient", "triggerTemplateIntegrityCheck: template integrity check FAILED, type=%d, path=%s, triggering re-init", java.lang.Integer.valueOf(this.f14903d.f14906a), l17);
                    g17.g();
                }
            }
            aw4.u.f14905d.set(false);
        } catch (java.lang.Throwable th6) {
            aw4.u.f14905d.set(false);
            throw th6;
        }
    }
}
