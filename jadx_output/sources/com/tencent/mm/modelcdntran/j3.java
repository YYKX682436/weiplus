package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.VideoInfo f71021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f71022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f71023g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.l3 f71024h;

    public j3(com.tencent.mm.modelcdntran.l3 l3Var, java.lang.String str, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo, int i17, int i18) {
        this.f71024h = l3Var;
        this.f71020d = str;
        this.f71021e = videoInfo;
        this.f71022f = i17;
        this.f71023g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = this.f71021e;
        java.lang.String str = this.f71020d;
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "onMoovReady mediaId[%s] info:%s", str, videoInfo);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        cp.e.b("OnlineVideoService", new com.tencent.mm.modelcdntran.i3(this));
    }
}
