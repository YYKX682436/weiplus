package ch0;

/* loaded from: classes8.dex */
public abstract class x {
    public x(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final ch0.a a(ch0.k params, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 activity, tg0.b2 callback, ch0.e0 configurer, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configurer, "configurer");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this, ch0.s.f122786a)) {
            if (activity.L3) {
                abstractC19224x1fe3df6e = null;
            } else {
                activity.L3 = true;
                abstractC19224x1fe3df6e = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) activity.f265348f;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC19224x1fe3df6e);
            qx4.d0 d0Var = activity.E3;
            d0Var.f448934j = new ch0.i0(callback);
            d0Var.f448936l = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = activity.L1;
            if (!d0Var.f448929e) {
                d0Var.p(new ch0.o(callback));
                java.lang.String stringExtra = activity.getIntent().getStringExtra("ftsrealurl");
                java.lang.String str = stringExtra != null ? stringExtra : "";
                int i17 = params.f122766c.f500574m;
                int i18 = su4.k2.f494511a;
                jx3.f.INSTANCE.d(27700, 10, str, java.lang.Integer.valueOf(i17));
            }
            configurer.a(params.f122765b, abstractC19224x1fe3df6e, viewGroup);
            int i19 = params.f122765b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e3Var);
            return new ch0.a(i19, abstractC19224x1fe3df6e, d0Var, e3Var, ch0.f0.f122736d, ch0.o0.f122780e, null, 64, null);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this, ch0.r.f122785a)) {
            throw new jz5.j();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e tVar = new ch0.t(activity.m81186xd24c19fa(), qx4.l0.a() ? com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS : com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE);
        configurer.a(params.f122765b, tVar, viewGroup);
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h;
        qx4.d0 d0Var2 = new qx4.d0(new ch0.w(tVar), new mu4.h(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.class, "webSearch", "", c19775x58fd37b3).a());
        d0Var2.f448934j = new ch0.i0(callback);
        tVar.mo120128x74041feb(d0Var2, "webSearchJSApi");
        if (!d0Var2.f448929e) {
            d0Var2.p(new ch0.o(callback));
        }
        d0Var2.f448936l = null;
        java.lang.String b17 = ch0.d0.f122732a.b(activity, params);
        tVar.mo32265x141096a9(b17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3(tVar, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b6(), new zg0.k2(null, false, false, false, false, 65, false, 83, null));
        e3Var2.E(new ch0.u(new aw4.u(0)));
        e3Var2.D(new ch0.v(e3Var2, activity));
        e3Var2.q0();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", b17);
        intent.putExtra("geta8key_scene", 65);
        intent.putExtra("useJs", true);
        intent.putExtra("hardcode_jspermission", c19775x58fd37b3);
        e3Var2.j(intent);
        activity.J3 = new ch0.j(callback);
        return new ch0.a(params.f122765b, tVar, d0Var2, e3Var2, ch0.f0.f122737e, ch0.o0.f122780e, null, 64, null);
    }
}
