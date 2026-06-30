package ok4;

/* loaded from: classes4.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f427564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427565e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i17, java.lang.String str) {
        super(0);
        this.f427564d = i17;
        this.f427565e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var = jz5.f0.f384359a;
        int i17 = this.f427564d;
        jz5.f0 f0Var2 = null;
        java.lang.String str = this.f427565e;
        if (i17 == 2) {
            ok4.u uVar = ok4.u.f427574a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a17 = uVar.a(str);
            if (a17 != null) {
                a17.H = currentTimeMillis;
                a17.C = 0;
                a17.f140798z = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenStartToDownLoad >> " + str + ", " + currentTimeMillis);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenStartToDownLoad >> " + str + " but data is no find");
            }
        } else {
            ok4.u uVar2 = ok4.u.f427574a;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a18 = uVar2.a(str);
            if (a18 != null) {
                a18.F = currentTimeMillis2;
                a18.f140792t = 0;
                a18.f140789q = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewStartDownLoadTimeStamp >> " + str + ' ' + a18.F + ' ' + java.lang.Thread.currentThread());
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewStartDownLoadTimeStamp >> " + str + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
