package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f0 f280533d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f0();

    public f0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        int i17 = x51.t1.f533619a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).wi(2147483647L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsComponent", "handleReadAndExpire batchSetReaded cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        long a17 = (long) x20.a.f533017a.a();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = ow.n.f430792a.c();
        if (c17 == null || (str = java.lang.Long.valueOf(c17.m124847x74d37ac6()).toString()) == null) {
            str = "";
        }
        if (str.length() > 0) {
            ow.x xVar = ow.x.f430806a;
            ((ku5.t0) ku5.t0.f394148d).A("BrandEcsNotifyTimerMgr");
            ((ku5.t0) ku5.t0.f394148d).h(new ow.w(a17, str), "BrandEcsNotifyTimerMgr");
            xVar.a(a17, str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsComponent", "handleReadAndExpire setExpire keepTime:" + a17 + ", latestNotifyMsgId:" + str);
        }
        return jz5.f0.f384359a;
    }
}
