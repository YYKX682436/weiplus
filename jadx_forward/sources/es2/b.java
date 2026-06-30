package es2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.g f337862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f337863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f337864f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(es2.g gVar, int i17, int i18) {
        super(0);
        this.f337862d = gVar;
        this.f337863e = i17;
        this.f337864f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        es2.g gVar = this.f337862d;
        vr2.e eVar = gVar.f337881i;
        if (eVar != null && (i17 = gVar.f337879g) == eVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FMTPScheduler", "onPreloadComplete " + i17);
            for (cs2.k kVar : eVar.b(eVar.a())) {
                cs2.j jVar = kVar.f303609d;
                if (jVar != null) {
                    jVar.p("FMTPScheduler.onPreloadComplete." + eVar.a());
                }
                cs2.j jVar2 = kVar.f303609d;
                if (jVar2 != null) {
                    jVar2.P("FMTPScheduler.onPreloadComplete." + eVar.a());
                }
            }
        }
        yz5.p pVar = gVar.f337895z;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(this.f337863e), java.lang.Integer.valueOf(this.f337864f));
        }
        cs2.a aVar = gVar.f337885p;
        if (aVar != null) {
            aVar.a(gVar.m());
        }
        return jz5.f0.f384359a;
    }
}
