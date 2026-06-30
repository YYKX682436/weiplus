package qg3;

/* loaded from: classes2.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f444392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f444393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f444394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f444395g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.d30 f444396h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444397i;

    public s0(int i17, int i18, byte[] bArr, int i19, bw5.d30 d30Var, yz5.l lVar) {
        this.f444392d = i17;
        this.f444393e = i18;
        this.f444394f = bArr;
        this.f444395g = i19;
        this.f444396h = d30Var;
        this.f444397i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f444392d;
        int i18 = this.f444393e;
        int i19 = this.f444395g;
        bw5.d30 d30Var = this.f444396h;
        byte[] lastBuffer = this.f444394f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastBuffer, "lastBuffer");
        yz5.l callback = this.f444397i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) qg3.e1.f444352b).mo141623x754a37bb(), null, null, new qg3.u0(i19, d30Var, lastBuffer, i17, i18, callback, null), 3, null);
    }
}
