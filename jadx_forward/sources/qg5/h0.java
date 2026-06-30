package qg5;

/* loaded from: classes12.dex */
public final class h0 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.l0 f444540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f444541f;

    public h0(java.lang.String str, qg5.l0 l0Var, p3325xe03a0797.p3326xc267989b.z zVar) {
        this.f444539d = str;
        this.f444540e = l0Var;
        this.f444541f = zVar;
    }

    @Override // wf0.u1
    public final void h(wf0.r1 r1Var) {
        java.lang.String str = r1Var.f527062a;
        java.lang.String str2 = this.f444539d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
            if (r1Var.f527064c == wf0.t1.DOWNLOAD) {
                ((vf0.y1) ((wf0.x1) ((jz5.n) this.f444540e.f444586o).mo141623x754a37bb())).getClass();
                if (t21.d3.h(str2).f496544i == 198) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsStagingFeatureService", "[tryDownloadFile] video download failed " + str2);
                    ((p3325xe03a0797.p3326xc267989b.a0) this.f444541f).U(java.lang.Boolean.FALSE);
                }
            }
        }
    }
}
