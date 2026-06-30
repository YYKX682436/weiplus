package rd3;

/* loaded from: classes7.dex */
public final class e extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showActionSheet";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        android.content.Context context;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("headTitle", "");
        java.lang.String optString2 = data.optString("headIconUrl", "");
        java.lang.String optString3 = data.optString("cancelText", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiShowActionSheet", "headTitle: " + optString + ", headIconUrl: " + optString2 + ", cancelText: " + optString3);
        lc3.e eVar = this.f399423a;
        if (eVar == null || (context = eVar.B0()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
            k0Var2.q(optString, 17);
            k0Var = k0Var2;
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b_e, (android.view.ViewGroup) null);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ocb);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            o11.f fVar = new o11.f();
            fVar.f423612c = true;
            n11.a.b().h(optString2, (android.widget.ImageView) findViewById, fVar.a());
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            ((android.widget.TextView) findViewById2).setText(optString);
            k0Var3.s(inflate, false);
            k0Var = k0Var3;
        }
        k0Var.f293405n = new rd3.a(data, this);
        k0Var.f293414s = new rd3.b(this);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            k0Var.m(optString3);
        }
        k0Var.C = new rd3.c(this);
        k0Var.p(new rd3.d(this));
        k0Var.v();
    }
}
