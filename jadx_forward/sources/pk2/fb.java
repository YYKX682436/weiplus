package pk2;

/* loaded from: classes3.dex */
public final class fb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f437284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f437285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f437286g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(pk2.o9 o9Var, yz5.a aVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, android.view.MenuItem menuItem) {
        super(1);
        this.f437283d = o9Var;
        this.f437284e = aVar;
        this.f437285f = c19792x256d2725;
        this.f437286g = menuItem;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        o25.y1 y1Var;
        java.lang.String userName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        pk2.o9 o9Var = this.f437283d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "[clickAnchorQuickShare] onClick onMenuItemSelect");
        md0.e eVar = (md0.e) ((nd0.e) i95.n0.c(nd0.e.class));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        r45.pk5 pk5Var = (r45.pk5) eVar.Ai(abstractActivityC21394xb3d2c0cf, 14, r45.pk5.class);
        if (pk5Var != null) {
            pk2.d9 d9Var = o9Var.f437615f;
            pk5Var.f464669h = (d9Var == null || (y1Var = d9Var.f437199i) == null) ? 0 : ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).f270255e;
        }
        mm2.n0 n0Var = (mm2.n0) o9Var.c(mm2.n0.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f437285f;
        qe2.a.f(c19792x256d2725, n0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 16384);
        a17.m59367x7b6790db(((mm2.c1) o9Var.c(mm2.c1.class)).f410319c3);
        a17.m59422xb121f1ef(zl2.r4.f555483a.Z0());
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Nj(abstractActivityC21394xb3d2c0cf, userName, (db5.h4) this.f437286g, a17, new pk2.eb(o9Var));
        yz5.a aVar = this.f437284e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
