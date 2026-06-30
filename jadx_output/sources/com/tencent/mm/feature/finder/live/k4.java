package com.tencent.mm.feature.finder.live;

/* loaded from: classes11.dex */
public final class k4 implements l30.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f66801a;

    public k4(boolean z17) {
        this.f66801a = z17;
    }

    @Override // l30.g
    public void a(z95.c cVar) {
        boolean a17 = com.tencent.liteav.base.util.q.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "int liteavsdk ret: " + a17);
        if (a17) {
            ko0.t.f309903a.e(this.f66801a);
        }
    }
}
