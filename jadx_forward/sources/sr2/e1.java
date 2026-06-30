package sr2;

/* loaded from: classes10.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o1 f493077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(sr2.o1 o1Var) {
        super(0);
        this.f493077d = o1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        zv2.c cVar = zv2.m.f557944t;
        sr2.o1 o1Var = this.f493077d;
        cVar.a(o1Var.m158354x19263085(), true, false);
        java.lang.String username = o1Var.f493192m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        g92.b bVar = g92.b.f351302e;
        m92.b j37 = g92.a.j3(bVar, username, false, 2, null);
        int i17 = j37 != null ? j37.f68698x26b1b2e8 : 0;
        boolean z17 = (4194304 & i17) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostChecker", "checkWindowProductSpam extFlag:" + i17 + ", ret " + z17);
        if (z17) {
            r45.za5 za5Var = (r45.za5) bVar.k2().e().m75936x14adae67(16);
            if (za5Var == null || (str = za5Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            db5.e1.E(o1Var.m158354x19263085(), str, "", o1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), true, null);
        } else {
            o1Var.S6(1);
            yz5.a aVar = o1Var.f493191i;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
