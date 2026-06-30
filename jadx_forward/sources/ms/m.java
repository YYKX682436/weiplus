package ms;

/* loaded from: classes5.dex */
public final class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms.n f412466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f412467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412468c;

    public m(ms.n nVar, yz5.a aVar, java.lang.String str) {
        this.f412466a = nVar;
        this.f412467b = aVar;
        this.f412468c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = fVar.f152152e;
        ms.n nVar = this.f412466a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = nVar.f412469d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyUserPreCheckUIC", "verifyUserPreCheckRequest() called " + fVar.f152148a + ' ' + fVar.f152149b + ' ');
        int i17 = fVar.f152149b;
        if (i17 == -3401 || i17 == -3402) {
            tm.a b17 = tm.a.b(fVar.f152150c);
            if (b17 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var.f391656d = "contacts_max_limit_tips";
                if (b17.f501935e == 2 || fVar.f152149b == -3401) {
                    h0Var.f391656d = "contacts_max_limit_pure_tips";
                }
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.lang.String str = this.f412468c;
                ((cy1.a) rVar).Hj("contacts_max_limit_tips", "view_exp", kz5.b1.e(new jz5.l("contacts_max_limit_sort_sessionid", str)), 32337);
                android.app.Activity m80379x76847179 = nVar.m80379x76847179();
                java.lang.String str2 = b17.f501932b;
                tm.j jVar = b17.f501937g;
                return db5.e1.K(m80379x76847179, false, null, str2, jVar.f501974f, jVar.f501975g, new ms.k(fVar, nVar, str, h0Var), new ms.l(nVar, str, h0Var));
            }
        } else {
            yz5.a aVar = this.f412467b;
            if (aVar != null) {
                aVar.mo152xb9724478();
                return jz5.f0.f384359a;
            }
        }
        return null;
    }
}
