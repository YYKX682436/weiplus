package a13;

/* loaded from: classes11.dex */
public final class e implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a13.t f82076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f82077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f82078c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f82079d;

    public e(a13.t tVar, boolean z17, boolean z18, yz5.l lVar) {
        this.f82076a = tVar;
        this.f82077b = z17;
        this.f82078c = z18;
        this.f82079d = lVar;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterVoipPlugin", "minimize, onResultAllow");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        a13.t tVar = this.f82076a;
        p3325xe03a0797.p3326xc267989b.l.d(tVar.f82109i, null, null, new a13.d(tVar, this.f82077b, this.f82078c, this.f82079d, null), 3, null);
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterVoipPlugin", "minimize, onResultCancel");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        this.f82079d.mo146xb9724478(java.lang.Boolean.FALSE);
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterVoipPlugin", "minimize, onResultRefuse");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        this.f82079d.mo146xb9724478(java.lang.Boolean.FALSE);
    }
}
