package dd5;

/* loaded from: classes9.dex */
public final class a2 extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.a2 f310617p = new dd5.a2();

    public a2() {
        super(dd5.d2.f310649b.f508072a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.c2 c2Var = (dd5.c2) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (c2Var == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getTitleTv(...)");
        z(d17, context, c2Var.f310637a);
        android.widget.TextView b17 = binding.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getDescTv(...)");
        z(b17, context, c2Var.f310638b);
        A(context, binding, com.p314xaae8f345.mm.R.raw.f80518xd4f4e112);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.c2 c2Var = (dd5.c2) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (c2Var == null) {
            return;
        }
        o15.a aVar = c2Var.f310639c;
        java.lang.String s17 = aVar.s();
        if (!(s17 == null || s17.length() == 0) || va3.w.d(aVar.u(), aVar.w())) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("kMsgId", c2Var.f310640d.m124847x74d37ac6());
            intent.putExtra("map_view_type", 1);
            intent.putExtra("kwebmap_slat", aVar.u());
            intent.putExtra("kwebmap_lng", aVar.w());
            intent.putExtra("kPoiName", aVar.s());
            intent.putExtra("Kwebmap_locaion", aVar.l());
            intent.putExtra("kShowshare", false);
            intent.putExtra("key_is_forward_preview", true);
            j45.l.j(context, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
        }
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String U1 = f9Var.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        o15.b bVar = new o15.b();
        bVar.m126728xdc93280d(U1);
        o15.a j17 = bVar.j();
        if (j17 == null) {
            return null;
        }
        java.lang.String s17 = j17.s();
        if (s17 == null) {
            s17 = "";
        }
        java.lang.String l17 = j17.l();
        return new dd5.c2(s17, l17 != null ? l17 : "", j17, f9Var);
    }

    @Override // uc5.b0, uc5.n
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void n(android.content.Context context, em.a2 binding, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        android.content.res.Resources resources = context.getResources();
        uc5.e eVar = uc5.n.f508060n;
        eVar.a();
        int color = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m, null);
        android.widget.TextView d17 = binding.d();
        java.lang.CharSequence text = binding.d().getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        d17.setText(eVar.b(text, query, color));
        android.widget.TextView b17 = binding.b();
        java.lang.CharSequence text2 = binding.b().getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text2, "getText(...)");
        b17.setText(eVar.b(text2, query, color));
    }
}
