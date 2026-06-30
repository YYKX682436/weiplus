package pc3;

/* loaded from: classes7.dex */
public final class u extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.ServiceC16423xa9fcb7b8 f434937a;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.ServiceC16423xa9fcb7b8 serviceC16423xa9fcb7b8) {
        this.f434937a = serviceC16423xa9fcb7b8;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServiceContext", "onEnterForeground");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.ServiceC16423xa9fcb7b8.f229423f;
        this.f434937a.a().d(true);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServiceContext", "onExitForeground");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.ServiceC16423xa9fcb7b8.f229423f;
        this.f434937a.a().d(false);
    }
}
