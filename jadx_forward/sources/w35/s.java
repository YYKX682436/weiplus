package w35;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w35.t f524297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 f524298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f524299f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 f524300g;

    public s(w35.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21) {
        this.f524297d = tVar;
        this.f524298e = h6Var;
        this.f524299f = context;
        this.f524300g = c12474x8b872a21;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w35.t tVar = this.f524297d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.f524301e, "tryLaunchAppBrand, launch appBrand, " + tVar.f524258c + ", " + tVar.f524259d);
        l81.b1 b1Var = new l81.b1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2 = this.f524300g.f167788d;
        b1Var.f398547b = c12475x7cfc32b2.f167795d;
        b1Var.f398549c = c12475x7cfc32b2.f167796e;
        b1Var.f398555f = c12475x7cfc32b2.f167797f;
        b1Var.f398565k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.r0.f34312x366c91de;
        java.lang.String str = tVar.f524258c;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = tVar.f524259d;
        if (str3 == null) {
            str3 = "";
        }
        b1Var.f398561i = new bi1.e(str2, str3, null, 0, 12, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) this.f524298e).bj(this.f524299f, b1Var);
    }
}
