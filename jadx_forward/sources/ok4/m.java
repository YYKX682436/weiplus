package ok4;

/* loaded from: classes4.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f427554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f427556f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i17, java.lang.String str, java.lang.Long l17) {
        super(0);
        this.f427554d = i17;
        this.f427555e = str;
        this.f427556f = l17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var = jz5.f0.f384359a;
        int i17 = this.f427554d;
        jz5.f0 f0Var2 = null;
        java.lang.Long l17 = this.f427556f;
        java.lang.String str = this.f427555e;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a17 = ok4.u.f427574a.a(str);
            if (a17 != null) {
                a17.D = l17 != null ? l17.longValue() : 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenReceiveLength >> " + str + ", " + l17);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenReceiveLength >> " + str + " but data is no find");
            }
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a18 = ok4.u.f427574a.a(str);
            if (a18 != null) {
                a18.f140793u = l17 != null ? l17.longValue() : 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewReceiverLength >> " + str + ", " + l17);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewReceiverLength >> " + str + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
