package xd4;

/* loaded from: classes4.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f535231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xd4.t0 f535232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(xd4.t0 t0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535232e = t0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        xd4.r0 r0Var = new xd4.r0(this.f535232e, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        return r0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        java.lang.Object mo150x989b7ca4 = ((xd4.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f535231d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        xd4.t0 t0Var = this.f535232e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                t0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloader", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                fk4.u uVar = t0Var.f535240a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloader", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                this.f535231d = 1;
                if (((fk4.k) uVar).c(this) == aVar) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
                    throw illegalStateException;
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "video is downloaded completely");
            xd4.t0.a(t0Var).mo70659xaa8b332c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            return f0Var;
        } catch (java.util.concurrent.CancellationException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoResourceDownloaderDelegate", "waitForComplete job is canceled");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoResourceDownloaderDelegate", e17, "waitForComplete", new java.lang.Object[0]);
            xd4.t0.a(t0Var).mo70660xaf8aa769(e17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            return f0Var;
        }
    }
}
