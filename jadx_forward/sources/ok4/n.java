package ok4;

/* loaded from: classes4.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f427557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427560g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f427557d = i17;
        this.f427558e = str;
        this.f427559f = str2;
        this.f427560g = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var = jz5.f0.f384359a;
        int i17 = this.f427557d;
        jz5.f0 f0Var2 = null;
        java.lang.String str = this.f427560g;
        java.lang.String str2 = this.f427559f;
        java.lang.String str3 = this.f427558e;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a17 = ok4.u.f427574a.a(str3);
            if (a17 != null) {
                a17.f140797y = a17.b("FullScreen_ReqFlag", str2, true);
                a17.A = a17.b("FullScreen_RespFlag", str, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenReqFlagAndRepFlag >> " + str3 + ", " + str2 + ", " + str);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenReqFlagAndRepFlag >> " + str3 + ", " + str + ", " + str + " but data is no find");
            }
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a18 = ok4.u.f427574a.a(str3);
            if (a18 != null) {
                java.lang.String str4 = a18.f140787o;
                a18.f140787o = a18.b("Preview_ReqFlag", str2, true);
                a18.f140790r = a18.b("Preview_RespFlag", str, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewReqAndRespFlag >> " + str3 + ", " + str2 + ", " + str + ", " + str4);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewReqAndRespFlag >> " + str3 + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
