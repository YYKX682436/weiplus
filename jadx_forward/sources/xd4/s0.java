package xd4;

/* loaded from: classes4.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f535234d;

    /* renamed from: e, reason: collision with root package name */
    public int f535235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f535236f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xd4.t0 f535237g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, xd4.t0 t0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535236f = h0Var;
        this.f535237g = t0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        xd4.s0 s0Var = new xd4.s0(this.f535236f, this.f535237g, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        return s0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        java.lang.Object mo150x989b7ca4 = ((xd4.s0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f535235e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        xd4.t0 t0Var = this.f535237g;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f535236f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                t0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloader", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                fk4.u uVar = t0Var.f535240a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloader", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                this.f535234d = h0Var2;
                this.f535235e = 1;
                obj = ((fk4.k) uVar).d(this);
                if (obj == aVar) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
                    return aVar;
                }
                h0Var = h0Var2;
            } else {
                if (i17 != 1) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
                    throw illegalStateException;
                }
                h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f535234d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            h0Var.f391656d = obj;
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo) h0Var2.f391656d;
            if (videoInfo == null || (str = videoInfo.f18114x9330627b) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getDownloadFlag$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                java.lang.String str2 = t0Var.f535244e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getDownloadFlag$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                str = str2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setDownloadFlag$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            t0Var.f535244e = str;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setDownloadFlag$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try update downloadFlag to ");
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo2 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo) h0Var2.f391656d;
            sb6.append(videoInfo2 != null ? videoInfo2.f18114x9330627b : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoResourceDownloaderDelegate", sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "onMoovReady");
            xd4.t0.a(t0Var).a((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo) h0Var2.f391656d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
            return f0Var;
        } catch (java.util.concurrent.CancellationException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoResourceDownloaderDelegate", "waitForMoovReady job is canceled");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoResourceDownloaderDelegate", e17, "waitForMoovReady", new java.lang.Object[0]);
            xd4.t0.a(t0Var).mo70660xaf8aa769(e17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
            return f0Var;
        }
    }
}
