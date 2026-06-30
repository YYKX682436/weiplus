package sk4;

/* loaded from: classes15.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f490508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sk4.p f490509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.l lVar, sk4.p pVar) {
        super(0);
        this.f490508d = lVar;
        this.f490509e = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.MICRO_PHONE, d85.f0.R, sk4.f.f490507a)) {
            yz5.l lVar = this.f490508d;
            if (lVar != null) {
                lVar.mo146xb9724478("permission_denied");
            }
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new sk4.e(this.f490509e, this.f490508d), "MicroMsg.AudioRecorderImpl");
        }
        return jz5.f0.f384359a;
    }
}
