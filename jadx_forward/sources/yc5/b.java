package yc5;

/* loaded from: classes5.dex */
public final class b implements i40.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f542421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f542422b;

    public b(p3325xe03a0797.p3326xc267989b.z zVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f542421a = zVar;
        this.f542422b = f9Var;
    }

    @Override // i40.a
    public void a(long j17, long j18) {
    }

    @Override // i40.a
    public void c() {
        ((p3325xe03a0797.p3326xc267989b.a0) this.f542421a).U(java.lang.Boolean.TRUE);
    }

    @Override // i40.a
    public void d(int i17, int i18, java.lang.String errMsg, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryFileHelper", "downloadFile: failed, msgId=" + this.f542422b.m124847x74d37ac6() + ", errType=" + i17 + ", errCode=" + i18);
        ((p3325xe03a0797.p3326xc267989b.a0) this.f542421a).U(java.lang.Boolean.FALSE);
    }

    @Override // i40.a
    public void e() {
        ((p3325xe03a0797.p3326xc267989b.a0) this.f542421a).U(java.lang.Boolean.FALSE);
    }
}
