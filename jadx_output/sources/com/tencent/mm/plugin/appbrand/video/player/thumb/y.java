package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes12.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.video.player.thumb.b0 f90923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f90924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.appbrand.video.player.thumb.b0 b0Var, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f90923d = b0Var;
        this.f90924e = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString historyPath = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        kotlin.jvm.internal.o.g(historyPath, "historyPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "CdnManager.Initialize, historyPath: " + historyPath.f68406d);
        com.tencent.mars.cdn.CdnManager cdnManager = new com.tencent.mars.cdn.CdnManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.cdn.CdnManager.class, cdnManager);
        cdnManager.onCreate(com.tencent.mm.vfs.w6.i(historyPath.f68406d, true), "cdnwx2013usrname", java.lang.Boolean.valueOf(!c01.e2.a0()));
        cdnManager.setAppCallback(this.f90923d);
        cdnManager.setRSAPublicKeyParams("1", "BFEDFFB5EA28509F9C89ED83FA7FDDA8881435D444E984D53A98AD8E9410F1145EDD537890E10456190B22E6E5006455EFC6C12E41FDA985F38FBBC7213ECB810E3053D4B8D74FFBC70B4600ABD728202322AFCE1406046631261BD5EE3D44721082FEAB74340D73645DC0D02A293B962B9D47E4A64100BD7524DE00D9D3B5C1", "010001");
        cdnManager.setToUserCiper("cdnwx2013usrname");
        com.tencent.mars.cdn.CdnC2Java.setCallback(new com.tencent.mars.cdn.CdnC2JavaCallBack());
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).setFlowReportParams("ANDROID.MM.CDN.WebviewCdnService", 5242880L, 60);
        com.tencent.mars.cdn.CdnManager.Config config = new com.tencent.mars.cdn.CdnManager.Config();
        config.EnableSafeCDN = 1;
        config.ApprovedVideoHosts = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_approved_videohosts, "weixinf.tc.qq.com,szwbwxsns.video.qq.com,szxzwxsns.video.qq.com,szzjwxsns.video.qq.com,shwbwxsns.video.qq.com,shxzwxsns.video.qq.com,shzjwxsns.video.qq.com,wxsnsdy.wxs.qq.com,vweixinthumb.tc.qq.com,wxsnsdythumb.wxs.qq.com,wxappthumb.tc.qq.com,wxapp.tc.qq.com,wxsnsdysvp.wxs.qq.com,finder.video.qq.com,findermp.video.qq.com,weixinf.tc.qq.com.cn,szwbwxsns.video.qq.com.cn,szxzwxsns.video.qq.com.cn,szzjwxsns.video.qq.com.cn,shwbwxsns.video.qq.com.cn,shxzwxsns.video.qq.com.cn,shzjwxsns.video.qq.com.cn,wxsnsdy.wxs.qq.com.cn,vweixinthumb.tc.qq.com.cn,wxsnsdythumb.wxs.qq.com.cn,wxappthumb.tc.qq.com.cn,wxapp.tc.qq.com.cn,wxsnsdysvp.wxs.qq.com.cn,finder.video.qq.com.cn,findermp.video.qq.com.cn,snsvideo.c2c.qq.com.cn,wxsnsdy.video.qq.com.cn,snsvideo.hk.wechat.com,snsvideo.c2c.wechat.com,findera4.video.qq.com", true);
        config.QuicExptValues = "clicfg_android_channelvideo_quic=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_channelvideo_quic, "224", true) + ";";
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).setConfig(config);
        ((java.util.concurrent.CountDownLatch) this.f90924e.f310123d).countDown();
        return jz5.f0.f302826a;
    }
}
