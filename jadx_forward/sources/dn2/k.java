package dn2;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.p0 f323465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn2.m f323466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qq1 f323467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323468g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(cn2.p0 p0Var, dn2.m mVar, r45.qq1 qq1Var, android.view.View view) {
        super(1);
        this.f323465d = p0Var;
        this.f323466e = mVar;
        this.f323467f = qq1Var;
        this.f323468g = view;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        cn2.p0 p0Var = this.f323465d;
        p0Var.f125132j = booleanValue;
        r45.qq1 qq1Var = this.f323467f;
        dn2.m mVar = this.f323466e;
        if (booleanValue) {
            mVar.e(3, qq1Var.m75941xfb821914(0).size());
            p0Var.b().j(-1);
        } else {
            mVar.e(4, qq1Var.m75941xfb821914(0).size());
            p3325xe03a0797.p3326xc267989b.r2 r2Var = mVar.f323475e;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            mVar.f323475e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(p0Var.f125124b, null, null, new dn2.j(mVar, p0Var, this.f323468g, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
