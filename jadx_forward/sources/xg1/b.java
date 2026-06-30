package xg1;

/* loaded from: classes7.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg1.c f535888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535889e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xg1.c cVar, java.lang.String str) {
        super(0);
        this.f535888d = cVar;
        this.f535889e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f535889e;
        xg1.c cVar = this.f535888d;
        try {
            android.content.Intent intent = new android.content.Intent(cVar.f535891a, java.lang.Class.forName(str));
            android.content.Context context = cVar.f535891a;
            jz5.g gVar = cVar.f535897g;
            boolean bindService = context.bindService(intent, (xg1.e) ((jz5.n) gVar).mo141623x754a37bb(), 64);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingLogic", "startAppBrandProgress: bind " + str + " ret = " + bindService);
            xg1.c.f535890h = !bindService ? null : (xg1.e) ((jz5.n) gVar).mo141623x754a37bb();
        } catch (java.lang.SecurityException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandPreLoadingLogic", "startAppBrandProgress: ", e17);
            xg1.c.f535890h = null;
            xg1.h.f535903a.a(cVar.f535896f);
        }
        return jz5.f0.f384359a;
    }
}
