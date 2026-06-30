package ut2;

/* loaded from: classes3.dex */
public final class u2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f512642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f512643g;

    public u2(cm2.m0 m0Var, ut2.s3 s3Var, gk2.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar) {
        this.f512640d = m0Var;
        this.f512641e = s3Var;
        this.f512642f = eVar;
        this.f512643g = lVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        if (i17 == 0) {
            cm2.m0 m0Var = this.f512640d;
            int i18 = m0Var.i();
            gk2.e eVar = this.f512642f;
            ut2.s3 s3Var = this.f512641e;
            if (i18 == 1) {
                int i19 = ut2.s3.f512602l1;
                s3Var.T(m0Var);
                p3325xe03a0797.p3326xc267989b.y0 y0Var = s3Var.f374653d;
                if (y0Var != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ut2.z0(s3Var, eVar, m0Var, null), 3, null);
                    return;
                }
                return;
            }
            if (i18 == 2) {
                ut2.s3.l(s3Var, m0Var, eVar, this.f512643g);
                return;
            }
            android.content.Context context = s3Var.f3639x46306858.getContext();
            r45.ld5 ld5Var = (r45.ld5) m0Var.f124901v.m75936x14adae67(73);
            if (ld5Var == null || (str = ld5Var.m75945x2fec8307(1)) == null) {
                str = "";
            }
            db5.t7.g(context, str);
        }
    }
}
