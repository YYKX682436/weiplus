package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class p3 implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mm5 f227074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q f227075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r3 f227076f;

    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r3 r3Var, r45.mm5 mm5Var, ot0.q qVar) {
        this.f227076f = r3Var;
        this.f227074d = mm5Var;
        this.f227075e = qVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePreview", "download finish: %s", java.lang.Integer.valueOf(message.arg1));
        if (message.arg1 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.d();
            r45.mm5 mm5Var = this.f227074d;
            java.lang.String str = mm5Var.f462197d;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.d1(str);
            f9Var.r1(2);
            f9Var.u1("1@fackuser");
            f9Var.e1(c01.w9.o("1@fackuser"));
            f9Var.j1(0);
            f9Var.m124850x7650bebc(436207665);
            long M9 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
            at4.k1 z07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().z0(this.f227075e.f430237r1);
            if (z07 != null) {
                z07.f66556xfcd83239 = 0;
                z07.f66555x2592af31 = 0;
                z07.f66562xd3086e30 = 0;
                z07.f66561xb3f4ee96 = 0L;
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().mo11260x413cb2b4(z07);
            }
            ((java.util.HashMap) gb3.l.f351552c).put(java.lang.Long.valueOf(M9), mm5Var);
            j05.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.f227268a;
            if (eVar != null) {
                ((pg0.q2) eVar).f435579a.mo79477xa6db431b();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f227076f.f227106a;
            if (u3Var != null) {
                u3Var.dismiss();
            }
        }
        return false;
    }
}
