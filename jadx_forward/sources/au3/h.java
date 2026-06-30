package au3;

/* loaded from: classes10.dex */
public final class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f95637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ au3.l f95638e;

    public h(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, au3.l lVar) {
        this.f95637d = k0Var;
        this.f95638e = lVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        java.lang.String mo15082x48bce8a4;
        this.f95637d.o(null);
        g4Var.clear();
        au3.l lVar = this.f95638e;
        java.lang.String str = "";
        if (lVar.f95660w) {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_pop_wordig_finder, "", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "PopupFinderWordingConfig: " + Zi);
            if (!android.text.TextUtils.isEmpty(Zi)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
                try {
                    cl0.g gVar = new cl0.g(Zi);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()) {
                        Zi = gVar.mo15082x48bce8a4(com.p314xaae8f345.p3121x37984a.fts.C26978x81e6d654.f58363x939d1dd2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n()) {
                        Zi = gVar.mo15082x48bce8a4("tradition");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
                    } else {
                        Zi = gVar.mo15082x48bce8a4("english");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
                    }
                } catch (cl0.f unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecondCutConfig", "parse wording JSON error");
                    Zi = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "PopupFinderWordingParse: ".concat(Zi));
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
            if (android.text.TextUtils.isEmpty(Zi)) {
                Zi = lVar.f95644d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.btn);
            }
            g4Var.f(0, Zi);
        }
        if (lVar.f95662y) {
            java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_pop_wording_second_cut, "", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "PopupSecondCutWordingConfig: " + Zi2);
            if (!android.text.TextUtils.isEmpty(Zi2)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi2);
                try {
                    cl0.g gVar2 = new cl0.g(Zi2);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()) {
                        Zi2 = gVar2.mo15082x48bce8a4(com.p314xaae8f345.p3121x37984a.fts.C26978x81e6d654.f58363x939d1dd2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi2);
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n()) {
                        Zi2 = gVar2.mo15082x48bce8a4("tradition");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi2);
                    } else {
                        Zi2 = gVar2.mo15082x48bce8a4("english");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi2);
                    }
                } catch (cl0.f unused2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecondCutConfig", "parse wording JSON error");
                    Zi2 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "PopupSecondCutWordingParse: ".concat(Zi2));
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi2);
            if (android.text.TextUtils.isEmpty(Zi2)) {
                Zi2 = lVar.f95644d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bto);
            }
            g4Var.f(2, Zi2);
        }
        if (lVar.f95661x) {
            java.lang.String Zi3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_pop_wording_wesee, "", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "PopupWeSeeWordingConfig: " + Zi3);
            if (!android.text.TextUtils.isEmpty(Zi3)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi3);
                try {
                    cl0.g gVar3 = new cl0.g(Zi3);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()) {
                        mo15082x48bce8a4 = gVar3.mo15082x48bce8a4(com.p314xaae8f345.p3121x37984a.fts.C26978x81e6d654.f58363x939d1dd2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n()) {
                        mo15082x48bce8a4 = gVar3.mo15082x48bce8a4("tradition");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                    } else {
                        mo15082x48bce8a4 = gVar3.mo15082x48bce8a4("english");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                    }
                    str = mo15082x48bce8a4;
                } catch (cl0.f unused3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecondCutConfig", "parse wording JSON error");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "PopupWeSeeWordingParse: ".concat(str));
                Zi3 = str;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi3);
            if (android.text.TextUtils.isEmpty(Zi3)) {
                Zi3 = lVar.f95644d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.btp);
            }
            g4Var.f(1, Zi3);
        }
    }
}
