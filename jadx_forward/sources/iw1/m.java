package iw1;

/* loaded from: classes12.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final iw1.m f376757d = new iw1.m();

    public m() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MTRHandlerThreadDispatcher-");
        int i17 = iw1.n.f376758g;
        iw1.n.f376758g = i17 + 1;
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        int i18 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(sb7, -16);
        a17.start();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MTRHandlerThreadDispatcher", "worker thread start");
        return a17;
    }
}
