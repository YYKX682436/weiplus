package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class n0 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e {

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n0 f226987f;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n0 g() {
        if (f226987f == null) {
            f226987f = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n0();
        }
        return f226987f;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e
    public void b(com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetShowSourceAsyncLoader", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152149b), java.lang.Integer.valueOf(fVar.f152148a));
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            if (((r45.co3) fVar2).f453236d == 0) {
                try {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SNAPSHOT_STRING_SYNC, new java.lang.String(((r45.co3) fVar2).mo14344x5f01b1f6(), s46.a.f484534a));
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GetShowSourceAsyncLoader", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public r45.co3 a() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SNAPSHOT_STRING_SYNC, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            return (r45.co3) new r45.co3().mo11468x92b714fd(str.getBytes(s46.a.f484534a));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GetShowSourceAsyncLoader", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
