package ok4;

/* loaded from: classes4.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f427569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, long j17) {
        super(0);
        this.f427568d = str;
        this.f427569e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        ok4.u uVar = ok4.u.f427574a;
        java.lang.String str = this.f427568d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a17 = uVar.a(str);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (a17 != null) {
            long j17 = this.f427569e;
            a17.f140775J = j17;
            a17.K = -1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setSwitchSourceStartTimeStamp >> " + str + ", " + j17);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setSwitchSourceStartTimeStamp >> " + str + " but data is no find");
        }
        return f0Var2;
    }
}
