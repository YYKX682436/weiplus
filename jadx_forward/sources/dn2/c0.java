package dn2;

/* loaded from: classes3.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.p0 f323429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn2.d0 f323430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323431f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(cn2.p0 p0Var, dn2.d0 d0Var, android.view.View view) {
        super(1);
        this.f323429d = p0Var;
        this.f323430e = d0Var;
        this.f323431f = view;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        cn2.p0 p0Var = this.f323429d;
        p0Var.f125132j = booleanValue;
        dn2.d0 d0Var = this.f323430e;
        if (booleanValue) {
            d0Var.e(3, 1);
            p0Var.b().j(-1);
        } else {
            d0Var.e(4, 1);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = d0Var.f323438e;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            d0Var.f323438e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(p0Var.f125124b, null, null, new dn2.b0(d0Var, p0Var, this.f323431f, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
