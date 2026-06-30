package oz;

/* loaded from: classes11.dex */
public final class h implements i40.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f431684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oz.g f431685b;

    public h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, oz.g gVar) {
        this.f431684a = f9Var;
        this.f431685b = gVar;
    }

    @Override // i40.a
    public void a(long j17, long j18) {
    }

    @Override // i40.a
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduledDownloadExecutor", "downloadFile: done, msgId=" + this.f431684a.m124847x74d37ac6());
        this.f431685b.mo157473x57429edc(0);
    }

    @Override // i40.a
    public void d(int i17, int i18, java.lang.String errMsg, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScheduledDownloadExecutor", "downloadFile: failed, msgId=" + this.f431684a.m124847x74d37ac6() + ", errorType=" + i17 + ", errorCode=" + i18 + ", errMsg=" + errMsg);
        this.f431685b.mo157473x57429edc(i18);
    }

    @Override // i40.a
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScheduledDownloadExecutor", "downloadFile: canceled, msgId=" + this.f431684a.m124847x74d37ac6());
        this.f431685b.mo157473x57429edc(-1);
    }
}
