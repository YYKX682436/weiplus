package c01;

/* loaded from: classes11.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f37219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c01.da f37220f;

    public h0(java.lang.String str, long j17, c01.da daVar) {
        this.f37218d = str;
        this.f37219e = j17;
        this.f37220f = daVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.da daVar;
        com.tencent.mm.storage.v Bi = ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Bi(null);
        l75.k0 d17 = Bi.d();
        java.lang.String str = this.f37218d;
        java.lang.String e17 = Bi.e(str);
        long j17 = this.f37219e;
        android.database.Cursor E = d17.E(e17, null, Bi.l(str, j17), null, null, null, "createTime ASC ");
        if (E.moveToFirst()) {
            while (!E.isAfterLast() && ((daVar = this.f37220f) == null || !daVar.a())) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(E);
                c01.w9.e(f9Var, true);
                E.moveToNext();
            }
        }
        E.close();
        com.tencent.mm.storage.v Bi2 = ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Bi(null);
        java.lang.String str2 = this.f37218d;
        Bi2.getClass();
        com.tencent.mars.xlog.Log.w("MicroMsg.BizChatMessageStorage", "deleteByTalker :%s  stack:%s", str2, com.tencent.mm.sdk.platformtools.z3.b(true));
        java.lang.String e18 = Bi2.e(str2);
        java.lang.String l17 = Bi2.l(str2, j17);
        l75.l0 l0Var = Bi2.f193895a;
        com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) l0Var;
        g9Var.u0(e18, l17, null);
        int delete = Bi2.d().delete(Bi2.e(str2), Bi2.l(str2, j17), null);
        if (delete != 0) {
            ((l75.s0) l0Var).doNotify("delete_talker " + str2);
            xg3.l0 l0Var2 = new xg3.l0(str2, "delete", null, 0, delete);
            l0Var2.f454416g = -1L;
            g9Var.m0(l0Var2);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new c01.g0(this));
    }

    public java.lang.String toString() {
        return super.toString() + "|deleteMsgByTalker";
    }
}
