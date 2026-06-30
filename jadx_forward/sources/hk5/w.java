package hk5;

/* loaded from: classes9.dex */
public final class w extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new gd5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        java.lang.String str;
        z01.g gVar;
        java.lang.String m75945x2fec8307;
        java.lang.String q17;
        v05.b k17;
        v05.b k18;
        z05.c cVar;
        gd5.a model = (gd5.a) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        l15.c j17 = model.j();
        java.lang.String l17 = (j17 == null || (k18 = j17.k()) == null || (cVar = (z05.c) k18.m75936x14adae67(k18.f513848e + 64)) == null) ? null : cVar.l();
        if (l17 == null || l17.length() == 0) {
            mi5.e0 e0Var = new mi5.e0();
            gd5.a aVar2 = e0Var.f408358e;
            e0Var.f408358e = model;
            e0Var.h(aVar2, model);
            android.view.View a17 = e0Var.a(m158354x19263085());
            a17.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
            return a17;
        }
        l15.c j18 = model.j();
        z05.c cVar2 = (j18 == null || (k17 = j18.k()) == null) ? null : (z05.c) k17.m75936x14adae67(k17.f513848e + 64);
        v05.b k19 = j18 != null ? j18.k() : null;
        java.lang.String l18 = cVar2 != null ? cVar2.l() : null;
        if (l18 == null || l18.length() == 0) {
            gVar = new z01.g();
        } else {
            z01.g gVar2 = new z01.g();
            java.lang.String str2 = "";
            if (cVar2 == null || (str = cVar2.l()) == null) {
                str = "";
            }
            gVar2.f550554o = str;
            gVar2.b();
            if (cVar2 != null && (q17 = cVar2.q()) != null) {
                if (q17.length() > 0) {
                    gVar2.f550550h = q17;
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o7k));
            if (gVar2.f550552m.length() > 0) {
                sb6.append(" · ");
                sb6.append(gVar2.f550552m);
            }
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            gVar2.f550551i = sb7;
            java.lang.String str3 = gVar2.f550548f;
            if (str3.length() == 0) {
                if (k19 != null && (m75945x2fec8307 = k19.m75945x2fec8307(k19.f513848e + 14)) != null) {
                    str2 = m75945x2fec8307;
                }
                str3 = str2;
            }
            gVar2.f550548f = str3;
            gVar2.f550560u = com.p314xaae8f345.mm.R.C30861xcebc809e.cyv;
            gVar = gVar2;
        }
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 c22073xa4763271 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271(context, null, 0, 6, null);
        pt0.e0 e0Var2 = pt0.f0.f439742b1;
        int i17 = model.f125235d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var2.n(model.m75945x2fec8307(i17 + 1), model.m75942xfb822ef2(i17 + 0));
        android.content.Context context2 = c22073xa4763271.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        gVar.f550559t = m11.b1.Di().m0(n17, n17.z0(), i65.a.g(context2), false);
        c22073xa4763271.m48330xfcfee142(gVar);
        l15.c j19 = model.j();
        if (j19 != null) {
            if (te5.f.f500167a.a()) {
                com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = c22073xa4763271.f286148g;
                if (abstractC11172x705e5905 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holderNew");
                    throw null;
                }
                abstractC11172x705e5905.setOnClickListener(new af5.p(n17, j19));
            } else {
                em.h hVar = c22073xa4763271.f286147f;
                if (hVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                    throw null;
                }
                hVar.f335893a.setOnClickListener(new af5.q(n17, j19));
            }
        }
        if (te5.f.f500167a.a()) {
            c22073xa4763271.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
            return c22073xa4763271;
        }
        c22073xa4763271.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        return c22073xa4763271;
    }
}
