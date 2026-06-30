package au3;

/* loaded from: classes10.dex */
public final class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f14104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ au3.l f14105e;

    public h(com.tencent.mm.ui.widget.dialog.k0 k0Var, au3.l lVar) {
        this.f14104d = k0Var;
        this.f14105e = lVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String optString;
        this.f14104d.o(null);
        g4Var.clear();
        au3.l lVar = this.f14105e;
        java.lang.String str = "";
        if (lVar.f14127w) {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_pop_wordig_finder, "", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "PopupFinderWordingConfig: " + Zi);
            if (!android.text.TextUtils.isEmpty(Zi)) {
                kotlin.jvm.internal.o.d(Zi);
                try {
                    cl0.g gVar = new cl0.g(Zi);
                    if (com.tencent.mm.sdk.platformtools.m2.m()) {
                        Zi = gVar.optString(com.tencent.wcdb.fts.BuiltinTokenizer.Simple);
                        kotlin.jvm.internal.o.d(Zi);
                    } else if (com.tencent.mm.sdk.platformtools.m2.n()) {
                        Zi = gVar.optString("tradition");
                        kotlin.jvm.internal.o.d(Zi);
                    } else {
                        Zi = gVar.optString("english");
                        kotlin.jvm.internal.o.d(Zi);
                    }
                } catch (cl0.f unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SecondCutConfig", "parse wording JSON error");
                    Zi = "";
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "PopupFinderWordingParse: ".concat(Zi));
            }
            kotlin.jvm.internal.o.d(Zi);
            if (android.text.TextUtils.isEmpty(Zi)) {
                Zi = lVar.f14111d.getContext().getResources().getString(com.tencent.mm.R.string.btn);
            }
            g4Var.f(0, Zi);
        }
        if (lVar.f14129y) {
            java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_pop_wording_second_cut, "", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "PopupSecondCutWordingConfig: " + Zi2);
            if (!android.text.TextUtils.isEmpty(Zi2)) {
                kotlin.jvm.internal.o.d(Zi2);
                try {
                    cl0.g gVar2 = new cl0.g(Zi2);
                    if (com.tencent.mm.sdk.platformtools.m2.m()) {
                        Zi2 = gVar2.optString(com.tencent.wcdb.fts.BuiltinTokenizer.Simple);
                        kotlin.jvm.internal.o.d(Zi2);
                    } else if (com.tencent.mm.sdk.platformtools.m2.n()) {
                        Zi2 = gVar2.optString("tradition");
                        kotlin.jvm.internal.o.d(Zi2);
                    } else {
                        Zi2 = gVar2.optString("english");
                        kotlin.jvm.internal.o.d(Zi2);
                    }
                } catch (cl0.f unused2) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SecondCutConfig", "parse wording JSON error");
                    Zi2 = "";
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "PopupSecondCutWordingParse: ".concat(Zi2));
            }
            kotlin.jvm.internal.o.d(Zi2);
            if (android.text.TextUtils.isEmpty(Zi2)) {
                Zi2 = lVar.f14111d.getContext().getResources().getString(com.tencent.mm.R.string.bto);
            }
            g4Var.f(2, Zi2);
        }
        if (lVar.f14128x) {
            java.lang.String Zi3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_pop_wording_wesee, "", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "PopupWeSeeWordingConfig: " + Zi3);
            if (!android.text.TextUtils.isEmpty(Zi3)) {
                kotlin.jvm.internal.o.d(Zi3);
                try {
                    cl0.g gVar3 = new cl0.g(Zi3);
                    if (com.tencent.mm.sdk.platformtools.m2.m()) {
                        optString = gVar3.optString(com.tencent.wcdb.fts.BuiltinTokenizer.Simple);
                        kotlin.jvm.internal.o.d(optString);
                    } else if (com.tencent.mm.sdk.platformtools.m2.n()) {
                        optString = gVar3.optString("tradition");
                        kotlin.jvm.internal.o.d(optString);
                    } else {
                        optString = gVar3.optString("english");
                        kotlin.jvm.internal.o.d(optString);
                    }
                    str = optString;
                } catch (cl0.f unused3) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SecondCutConfig", "parse wording JSON error");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "PopupWeSeeWordingParse: ".concat(str));
                Zi3 = str;
            }
            kotlin.jvm.internal.o.d(Zi3);
            if (android.text.TextUtils.isEmpty(Zi3)) {
                Zi3 = lVar.f14111d.getContext().getResources().getString(com.tencent.mm.R.string.btp);
            }
            g4Var.f(1, Zi3);
        }
    }
}
