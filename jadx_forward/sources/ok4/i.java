package ok4;

/* loaded from: classes4.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f427544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427546f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i17, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f427544d = i17;
        this.f427545e = str;
        this.f427546f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var = jz5.f0.f384359a;
        int i17 = this.f427544d;
        jz5.f0 f0Var2 = null;
        java.lang.String str = this.f427546f;
        java.lang.String str2 = this.f427545e;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a17 = ok4.u.f427574a.a(str2);
            if (a17 != null) {
                a17.f140796x = a17.b("FullScreen_FileKey", str != null ? str : "", true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenFileKey >> " + str2 + ", " + str);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenFileKey >> " + str2 + " but data is no find");
            }
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a18 = ok4.u.f427574a.a(str2);
            if (a18 != null) {
                a18.f140786n = a18.b("Preview_FileKey", str != null ? str : "", true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewFileKey >> " + str2 + ", " + str);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewFileKey >> " + str2 + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
