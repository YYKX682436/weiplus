package df2;

/* loaded from: classes3.dex */
public final class hu extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ju f311886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f311887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yd5 f311888f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(df2.ju juVar, boolean z17, r45.yd5 yd5Var) {
        super(0);
        this.f311886d = juVar;
        this.f311887e = z17;
        this.f311888f = yd5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.ju juVar = this.f311886d;
        ((mm2.c1) juVar.m56788xbba4bfc0(mm2.c1.class)).W = this.f311887e;
        java.lang.String m75945x2fec8307 = this.f311888f.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        long m75939xb282bd08 = r0.m75939xb282bd08(3) * 1000;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = juVar.f312033n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        juVar.f312033n = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(juVar, null, null, new df2.gu(juVar, m75945x2fec8307, m75939xb282bd08, null), 3, null);
        return jz5.f0.f384359a;
    }
}
