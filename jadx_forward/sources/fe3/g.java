package fe3;

/* loaded from: classes7.dex */
public class g implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe3.i f343079d;

    public g(fe3.i iVar) {
        this.f343079d = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
        jc3.m0 m0Var;
        fe3.i iVar = this.f343079d;
        if (iVar.f343085d.contains(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgDownloadPkg", "down fail, id:%d,errCode:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            fe3.h hVar = (fe3.h) ((java.util.concurrent.ConcurrentHashMap) iVar.f343086e).get(java.lang.Long.valueOf(j17));
            if (hVar != null && (m0Var = hVar.f343081b) != null) {
                m0Var.J("download fail");
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd = hVar.f343082c;
                java.lang.String str = c16421xe4d4fcd != null ? c16421xe4d4fcd.f229391d : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed scene = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed.f37588x58f52ca8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
                ((je3.i) i95.n0.c(je3.i.class)).Rg(str, c16421xe4d4fcd != null ? c16421xe4d4fcd.f229398n : null, c16421xe4d4fcd != null ? c16421xe4d4fcd.f229399o : null, c16421xe4d4fcd != null ? c16421xe4d4fcd.f229393f : null, 0, scene, 2, 10000);
            }
            iVar.f343085d.remove(java.lang.Long.valueOf(j17));
            ((java.util.concurrent.ConcurrentHashMap) iVar.f343086e).remove(java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        if (this.f343079d.f343085d.contains(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgDownloadPkg", "onTaskFinished id:%s savedFilePath:%s", java.lang.Long.valueOf(j17), str);
            fe3.h hVar = (fe3.h) ((java.util.concurrent.ConcurrentHashMap) this.f343079d.f343086e).get(java.lang.Long.valueOf(j17));
            ((ku5.t0) ku5.t0.f394148d).h(new fe3.f(this, hVar, j17, str), "MagicPkgDownloadPkg");
            this.f343079d.f343085d.remove(java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void f(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void i(long j17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void k(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void l(long j17, java.lang.String str) {
        if (this.f343079d.f343085d.contains(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgDownloadPkg", "onTaskStarted id:%s savedFilePath:%s", java.lang.Long.valueOf(j17), str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
        fe3.i iVar = this.f343079d;
        iVar.f343085d.remove(java.lang.Long.valueOf(j17));
        ((java.util.concurrent.ConcurrentHashMap) iVar.f343086e).remove(java.lang.Long.valueOf(j17));
    }
}
