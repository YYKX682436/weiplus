package mu4;

/* loaded from: classes7.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f412953a;

    /* renamed from: b, reason: collision with root package name */
    public final mu4.g0 f412954b;

    /* renamed from: c, reason: collision with root package name */
    public final long f412955c;

    public h0(long j17, mu4.g0 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f412953a = j17;
        this.f412954b = type;
        this.f412955c = 1478L;
    }

    public final void a(mu4.f0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        long j17 = this.f412955c;
        long j18 = item.f412940a;
        g0Var.B(j17, j18);
        long j19 = this.f412953a;
        if (j19 > 0) {
            g0Var.B(j19, j18);
        }
    }
}
