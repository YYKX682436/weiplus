package pv0;

/* loaded from: classes5.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final pv0.q f440076d = new pv0.q();

    public q() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pv0.g timbreManager = (pv0.g) obj;
        dw0.c timbreInfo = (dw0.c) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreManager, "timbreManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreInfo, "timbreInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimbrePanelUIC", "cancelTimbre: timbreInfo " + timbreInfo);
        pv0.n nVar = (pv0.n) timbreManager.f440053a;
        nVar.getClass();
        nVar.f440071a.g(timbreInfo);
        return java.lang.Boolean.TRUE;
    }
}
