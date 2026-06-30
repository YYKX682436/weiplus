package ok4;

/* loaded from: classes4.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f427547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17, java.lang.String str) {
        super(0);
        this.f427547d = i17;
        this.f427548e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var = jz5.f0.f384359a;
        int i17 = this.f427547d;
        jz5.f0 f0Var2 = null;
        java.lang.String str = this.f427548e;
        if (i17 == 2) {
            ok4.u uVar = ok4.u.f427574a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a17 = uVar.a(str);
            if (a17 != null) {
                long j17 = a17.H;
                a17.C = 1;
                a17.I = currentTimeMillis >= j17 ? (int) (currentTimeMillis - j17) : 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenIsDownLoadComplete >> " + str + ", " + currentTimeMillis + ", " + j17);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenIsDownLoadComplete >> " + str + " but data is no find");
            }
        } else {
            ok4.u uVar2 = ok4.u.f427574a;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a18 = uVar2.a(str);
            if (a18 != null) {
                long j18 = a18.F;
                a18.G = currentTimeMillis2 >= j18 ? (int) (currentTimeMillis2 - j18) : 0;
                a18.f140792t = 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewDownLoadFinish >> " + str + ", " + currentTimeMillis2 + ", " + j18 + ", " + java.lang.Thread.currentThread().getName());
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewDownLoadFinish >> " + str + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
