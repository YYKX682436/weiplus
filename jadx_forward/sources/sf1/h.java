package sf1;

/* loaded from: classes13.dex */
public final class h implements rf1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488507c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf1.m f488508d;

    public h(java.lang.String str, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, sf1.m mVar) {
        this.f488505a = str;
        this.f488506b = str2;
        this.f488507c = h0Var;
        this.f488508d = mVar;
    }

    @Override // rf1.c
    public void a(rf1.h wiFiItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wiFiItem, "wiFiItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnect#sysListener");
    }

    @Override // rf1.c
    public void b(rf1.h wiFiItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wiFiItem, "wiFiItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnectAcceptIncomplete#sysListener");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f488505a, wiFiItem.f476155a)) {
            java.lang.String str = this.f488506b;
            if ((str.length() == 0) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, wiFiItem.f476156b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnectInternal#sysListener, match");
                wu5.c cVar = (wu5.c) this.f488507c.f391656d;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                rf1.d.c(this);
                this.f488508d.a();
            }
        }
    }

    @Override // rf1.c
    public void h() {
    }
}
