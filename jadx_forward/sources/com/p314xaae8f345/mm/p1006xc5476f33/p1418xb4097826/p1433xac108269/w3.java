package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class w3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f184181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184182b;

    public w3(yz5.r rVar, java.lang.String str) {
        this.f184181a = rVar;
        this.f184182b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.i23 i23Var;
        r45.i23 i23Var2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        yz5.r rVar = this.f184181a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.l23 l23Var = (r45.l23) fVar.f152151d;
            if ((l23Var != null ? (r45.i23) l23Var.m75936x14adae67(1) : null) != null) {
                if (zl2.q4.f555466a.E()) {
                    r45.l23 l23Var2 = (r45.l23) fVar.f152151d;
                    java.lang.String m75945x2fec8307 = (l23Var2 == null || (i23Var2 = (r45.i23) l23Var2.m75936x14adae67(1)) == null) ? null : i23Var2.m75945x2fec8307(3);
                    if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                        db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "img is empty", 0).show();
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imgUrl: ");
                r45.l23 l23Var3 = (r45.l23) fVar.f152151d;
                sb6.append((l23Var3 == null || (i23Var = (r45.i23) l23Var3.m75936x14adae67(1)) == null) ? null : i23Var.m75945x2fec8307(3));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMpLinkVerifier", sb6.toString());
                r45.l23 l23Var4 = (r45.l23) fVar.f152151d;
                rVar.C(0, "", this.f184182b, l23Var4 != null ? (r45.i23) l23Var4.m75936x14adae67(1) : null);
            } else {
                rVar.C(java.lang.Integer.valueOf(org.p3343x72743996.net.InterfaceC29524x4f65168b.f73904x1eea26f3), "", "", null);
            }
        } else {
            rVar.C(java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c, "", null);
        }
        return jz5.f0.f384359a;
    }
}
