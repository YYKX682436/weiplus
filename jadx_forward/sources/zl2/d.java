package zl2;

/* loaded from: classes13.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f555239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zl2.e f555241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f555242g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str, zl2.e eVar, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(0);
        this.f555239d = c0Var;
        this.f555240e = str;
        this.f555241f = eVar;
        this.f555242g = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f555239d;
        if (!c0Var.f391645d) {
            pm0.z.b(xy2.b.f539688b, this.f555240e + "_timeout", false, null, null, false, false, null, 124, null);
            ((sb0.f) ((tb0.i) i95.n0.c(tb0.i.class))).Vi(this.f555241f);
            zl2.f.a(c0Var, this.f555242g, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u0(null));
        }
        return jz5.f0.f384359a;
    }
}
