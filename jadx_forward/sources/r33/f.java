package r33;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f450510a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f450511b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f450512c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f450513d;

    public f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetLaunchGameInfo", "CgiGetLaunchGameInfo appId:%s, url:%s", str, str2);
        this.f450510a = str;
        this.f450511b = str2;
        this.f450512c = str3;
    }

    public final void a(int i17, m53.t3 t3Var, m33.h1 h1Var) {
        m53.x4 x4Var = new m53.x4();
        x4Var.f405708d = this.f450513d;
        x4Var.f405710f = t3Var.f405605d;
        x4Var.f405709e = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = x4Var;
        lVar.f152198b = new m53.y4();
        lVar.f152199c = "/cgi-bin/mmgame-bin/reportdistributestainid";
        lVar.f152200d = 5070;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        java.lang.String str = this.f450510a;
        java.lang.String str2 = this.f450511b;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new r33.e(this, h1Var, i17, str, str2, t3Var));
    }
}
