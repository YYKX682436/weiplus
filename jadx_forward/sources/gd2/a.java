package gd2;

/* loaded from: classes3.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.i f352056d;

    public a(gd2.i iVar) {
        this.f352056d = iVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        gd2.i iVar = this.f352056d;
        java.lang.String string = iVar.f352065a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jdx);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = iVar.f352065a;
        int i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m;
        g4Var.h(1, string, com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, b3.l.m9702x7444d5ad(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        g4Var.h(3, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f78683x36757420, 0);
        if (((qk.s6) gm0.j1.s(qk.s6.class)).mo13794x74219ae7()) {
            return;
        }
        i95.m c17 = i95.n0.c(tg0.f1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String Di = ((sg0.e) ((tg0.f1) c17)).Di(3, 2);
        i95.m c18 = i95.n0.c(tg0.f1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        int Bi = ((sg0.e) ((tg0.f1) c18)).Bi(3, 2);
        i95.m c19 = i95.n0.c(tg0.f1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        int Bi2 = ((sg0.e) ((tg0.f1) c19)).Bi(3, 2);
        if (Bi2 != com.p314xaae8f345.mm.R.raw.f79767x4e69e538) {
            i17 = Bi2 == com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac : com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an;
        }
        g4Var.h(6, Di, Bi, resources.getColor(i17));
    }
}
