package bt2;

/* loaded from: classes3.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.bw2 f105720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km2.m f105721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f105722c;

    public g(r45.bw2 bw2Var, km2.m mVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f105720a = bw2Var;
        this.f105721b = mVar;
        this.f105722c = h0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        r45.y23 y23Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        r45.bw2 bw2Var = this.f105720a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.bv1 bv1Var = (r45.bv1) fVar.f152151d;
            if (bv1Var == null || (y23Var = (r45.y23) bv1Var.m75936x14adae67(3)) == null || (str = y23Var.m75945x2fec8307(17)) == null) {
                str = "";
            }
            r45.y23 y23Var2 = (r45.y23) bw2Var.m75936x14adae67(4);
            if (y23Var2 != null) {
                y23Var2.set(17, str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "shop report requestId replay enter cgiback, ".concat(str));
        }
        bt2.h.O6(this.f105721b, (java.lang.String) this.f105722c.f391656d, bw2Var);
        return jz5.f0.f384359a;
    }
}
