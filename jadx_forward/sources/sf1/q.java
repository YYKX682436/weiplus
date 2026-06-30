package sf1;

/* loaded from: classes5.dex */
public final class q implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f488543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f488544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf1.g f488545c;

    public q(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, yz5.a aVar, sf1.g gVar) {
        this.f488543a = c0Var;
        this.f488544b = aVar;
        this.f488545c = gVar;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.Integer next;
        if (4660 != i17) {
            return false;
        }
        this.f488543a.f391645d = true;
        java.util.ArrayList<java.lang.Integer> integerArrayListExtra = intent != null ? intent.getIntegerArrayListExtra("android.provider.extra.WIFI_NETWORK_RESULT_LIST") : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "tryKeepConnectedWifi, onActivityResult, resultCode: " + i18 + ", addWifiNetworkResultList: " + integerArrayListExtra);
        yz5.a aVar = this.f488544b;
        sf1.g gVar = this.f488545c;
        if (i18 != -1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(integerArrayListExtra)) {
            aVar.mo152xb9724478();
            gVar.b("user denied");
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(integerArrayListExtra);
            java.util.Iterator<java.lang.Integer> it = integerArrayListExtra.iterator();
            while (it.hasNext() && ((next = it.next()) == null || next.intValue() != 0)) {
                aVar.mo152xb9724478();
                if (next != null && next.intValue() == 2) {
                    gVar.b("wifi config already exists");
                } else {
                    sf1.g.c(gVar, null, 1, null);
                }
            }
        }
        return true;
    }
}
