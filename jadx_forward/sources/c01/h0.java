package c01;

/* loaded from: classes11.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f118752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c01.da f118753f;

    public h0(java.lang.String str, long j17, c01.da daVar) {
        this.f118751d = str;
        this.f118752e = j17;
        this.f118753f = daVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.da daVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.v Bi = ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Bi(null);
        l75.k0 d17 = Bi.d();
        java.lang.String str = this.f118751d;
        java.lang.String e17 = Bi.e(str);
        long j17 = this.f118752e;
        android.database.Cursor E = d17.E(e17, null, Bi.l(str, j17), null, null, null, "createTime ASC ");
        if (E.moveToFirst()) {
            while (!E.isAfterLast() && ((daVar = this.f118753f) == null || !daVar.a())) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(E);
                c01.w9.e(f9Var, true);
                E.moveToNext();
            }
        }
        E.close();
        com.p314xaae8f345.mm.p2621x8fb0427b.v Bi2 = ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Bi(null);
        java.lang.String str2 = this.f118751d;
        Bi2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatMessageStorage", "deleteByTalker :%s  stack:%s", str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        java.lang.String e18 = Bi2.e(str2);
        java.lang.String l17 = Bi2.l(str2, j17);
        l75.l0 l0Var = Bi2.f275428a;
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) l0Var;
        g9Var.u0(e18, l17, null);
        int mo70514xb06685ab = Bi2.d().mo70514xb06685ab(Bi2.e(str2), Bi2.l(str2, j17), null);
        if (mo70514xb06685ab != 0) {
            ((l75.s0) l0Var).mo145247xf35bbb4("delete_talker " + str2);
            xg3.l0 l0Var2 = new xg3.l0(str2, "delete", null, 0, mo70514xb06685ab);
            l0Var2.f535949g = -1L;
            g9Var.m0(l0Var2);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new c01.g0(this));
    }

    /* renamed from: toString */
    public java.lang.String m13835x9616526c() {
        return super.toString() + "|deleteMsgByTalker";
    }
}
