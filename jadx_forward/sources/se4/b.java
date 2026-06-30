package se4;

/* loaded from: classes9.dex */
public class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public km5.b f488453a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f488454b = -1;

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        ju5.h hVar = new ju5.h(null);
        hVar.f383625a = re4.g0.b();
        hVar.f383629e = "WechatASK";
        hVar.f383626b = new int[]{1, 2, 920, 3};
        hVar.f383628d = new re4.e0();
        hVar.f383627c = new re4.a0();
        se4.m mVar = new se4.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, hVar);
        km5.b b17 = km5.u.b();
        this.f488453a = b17;
        b17.b();
        mVar.f383621a = new se4.a(this);
        if (ju5.n.c().a(mVar, new eu5.d())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 1);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterInitFunc", "add soterTaskInitForWX failed.");
        }
        java.lang.System.currentTimeMillis();
        return bVar;
    }
}
