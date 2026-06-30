package rk4;

/* loaded from: classes2.dex */
public final class i extends com.p314xaae8f345.mm.p944x882e457a.i {
    public i(java.lang.String categoryId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryId, "categoryId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        bw5.d50 d50Var = new bw5.d50();
        d50Var.f107861e = categoryId;
        d50Var.f107869p[4] = true;
        byte[] mo14344x5f01b1f6 = d50Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        lVar.f152197a = new qk.s9(mo14344x5f01b1f6);
        lVar.f152198b = new qk.t9();
        lVar.f152199c = "/cgi-bin/mmlistenappsvr/listencategories";
        lVar.f152200d = 6264;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TingFlutterPluginHelperImpl", "getListenCategoriesCGI categoryId: ".concat(categoryId));
    }
}
