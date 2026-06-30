package tm2;

/* loaded from: classes3.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f502080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(tm2.s2 s2Var, r45.hc1 hc1Var) {
        super(5);
        this.f502079d = s2Var;
        this.f502080e = hc1Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        java.lang.String str = (java.lang.String) obj4;
        tm2.s2 s2Var = this.f502079d;
        if (booleanValue) {
            fm2.b bVar = s2Var.f101134c;
            if (bVar != null) {
                qo0.c.a(bVar, qo0.b.f446919n, null, 2, null);
            }
            fm2.b bVar2 = s2Var.f101134c;
            if (bVar2 != null && (m57663xfb7e5820 = bVar2.m57663xfb7e5820()) != null && (c14197x319b1b9e = m57663xfb7e5820.f390664f) != null) {
                if2.z.f372686a.h(c14197x319b1b9e, this.f502080e);
            }
            dk2.ef.f314905a.J(1);
        } else {
            pm0.v.X(new tm2.l(s2Var, str, intValue));
        }
        return jz5.f0.f384359a;
    }
}
