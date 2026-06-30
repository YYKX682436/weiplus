package t14;

/* loaded from: classes11.dex */
public final class x implements com.p314xaae8f345.mm.p944x882e457a.j1 {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Integer f496132d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f496133e;

    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            try {
                int h17 = gm0.j1.b().h();
                java.lang.String k17 = gm0.j1.b().k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountOnSceneEnd", "onSceneEnd() called errMsg = " + str + ", scene = " + m1Var + " uin:" + h17 + " username:" + k17);
                if (f496132d != null) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
                    c6423x452b9f7c.f137646e = 2877L;
                    c6423x452b9f7c.f137650i = h17;
                    c6423x452b9f7c.f137651j = f496132d != null ? r7.intValue() : 0L;
                    c6423x452b9f7c.r(k17);
                    c6423x452b9f7c.s(f496133e);
                    c6423x452b9f7c.t(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                    c6423x452b9f7c.o();
                    c6423x452b9f7c.k();
                }
                f496132d = java.lang.Integer.valueOf(h17);
                f496133e = k17;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SwitchAccountOnSceneEnd", th6, "onSceneEnd err", new java.lang.Object[0]);
            }
        }
    }
}
