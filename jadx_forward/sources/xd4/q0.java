package xd4;

/* loaded from: classes4.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f535227d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f535228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xd4.t0 f535229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(xd4.t0 t0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535229f = t0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        xd4.q0 q0Var = new xd4.q0(this.f535229f, interfaceC29045xdcb5ca57);
        q0Var.f535228e = obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        return q0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        java.lang.Object mo150x989b7ca4 = ((xd4.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f535227d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f535228e;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
                throw illegalStateException;
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f535228e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            xd4.t0 t0Var = this.f535229f;
            xd4.p0 a17 = xd4.t0.a(t0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloader", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            fk4.u uVar = t0Var.f535240a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloader", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            a17.mo70661x696ee52c(((fk4.k) uVar).f345155j);
            this.f535228e = y0Var;
            this.f535227d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(500L, this) == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
                return aVar;
            }
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        return f0Var;
    }
}
