package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo f152554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f152555f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f152556g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.l3 f152557h;

    public j3(com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var, java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo, int i17, int i18) {
        this.f152557h = l3Var;
        this.f152553d = str;
        this.f152554e = videoInfo;
        this.f152555f = i17;
        this.f152556g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo = this.f152554e;
        java.lang.String str = this.f152553d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "onMoovReady mediaId[%s] info:%s", str, videoInfo);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        cp.e.b("OnlineVideoService", new com.p314xaae8f345.mm.p947xba6de98f.i3(this));
    }
}
