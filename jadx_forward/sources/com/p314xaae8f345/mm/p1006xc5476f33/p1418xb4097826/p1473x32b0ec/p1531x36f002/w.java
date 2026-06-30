package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class w implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f197262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f197263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gk2.e f197264c;

    public w(boolean z17, dk2.zf zfVar, gk2.e eVar) {
        this.f197262a = z17;
        this.f197263b = zfVar;
        this.f197264c = eVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            r45.zm6 zm6Var = (r45.zm6) ((r45.tp2) fVar.f152151d).m75936x14adae67(7);
            if (zm6Var != null && zm6Var.m75933x41a8a7f2(1)) {
                java.lang.String m75945x2fec8307 = zm6Var.m75945x2fec8307(0);
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, zm6Var.m75945x2fec8307(0), 0).show();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveBoxUtil", "localLikeLog ".concat("cgi failed, revert like op"));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x.f197275a;
            boolean z17 = true ^ this.f197262a;
            dk2.zf zfVar = this.f197263b;
            xVar.j(z17, (dk2.cg) zfVar);
            ((mm2.j2) this.f197264c.a(mm2.j2.class)).c7(zfVar);
        }
        return jz5.f0.f384359a;
    }
}
