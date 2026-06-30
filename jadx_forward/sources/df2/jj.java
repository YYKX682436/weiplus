package df2;

/* loaded from: classes3.dex */
public final class jj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.oj f312014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f312015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f312016f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f312017g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312018h;

    public jj(df2.oj ojVar, r45.fr1 fr1Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, r45.xq1 xq1Var, java.lang.String str) {
        this.f312014d = ojVar;
        this.f312015e = fr1Var;
        this.f312016f = f0Var;
        this.f312017g = xq1Var;
        this.f312018h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var;
        df2.oj ojVar = this.f312014d;
        mm2.c1 c1Var = (mm2.c1) ojVar.m56788xbba4bfc0(mm2.c1.class);
        r45.fr1 fr1Var = this.f312015e;
        r45.i73 i73Var = (r45.i73) fr1Var.m75936x14adae67(24);
        c1Var.H2 = i73Var != null ? i73Var.m75939xb282bd08(1) : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 ai0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0) ojVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0.class);
        if (ai0Var == null || (m10Var = ai0Var.f193424s) == null) {
            return;
        }
        m10Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u00(m10Var, this.f312016f.f391649d, fr1Var, this.f312017g, this.f312018h));
    }
}
