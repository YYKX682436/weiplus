package df2;

/* loaded from: classes3.dex */
public final class nz extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f312431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz(df2.a00 a00Var) {
        super(1);
        this.f312431d = a00Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        df2.nm nmVar;
        r45.qa5 data = (r45.qa5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.f4 f4Var = ml2.f4.Y;
        cl0.g gVar = new cl0.g();
        gVar.h("extra_report_json", data.m75945x2fec8307(5));
        ml2.r0.Dj(r0Var, f4Var, null, null, null, null, null, 0, 0L, gVar, null, null, null, false, null, 16126, null);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) data.m75936x14adae67(2);
        if (c19786x6a1e2862 != null && (nmVar = (df2.nm) this.f312431d.m56789x25fe639c(df2.nm.class)) != null) {
            nmVar.Z6(c19786x6a1e2862);
        }
        return jz5.f0.f384359a;
    }
}
