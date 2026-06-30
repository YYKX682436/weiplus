package pk2;

/* loaded from: classes3.dex */
public final class j1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437392h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437393i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437392h = helper.I;
        this.f437393i = "anchorlive.more.extendtrylivetime";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9 e9Var;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        pk2.d9 d9Var = o9Var.f437615f;
        if (d9Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9 e9Var2 = d9Var.f437198h;
            if (e9Var2 == null) {
                e9Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9(o9Var.f437611d, o9Var.f437607b);
            }
            d9Var.f437198h = e9Var2;
        }
        if (d9Var != null && (e9Var = d9Var.f437198h) != null) {
            android.content.Context context = e9Var.f199770a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = "";
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            gk2.e eVar = e9Var.f199771b;
            r45.td2 td2Var = ((mm2.g0) eVar.a(mm2.g0.class)).f410599m;
            if ((td2Var != null ? td2Var.m75939xb282bd08(3) : 0) > 0) {
                string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9c);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                h0Var.f391656d = string2;
                i17 = 2;
            } else {
                java.lang.String string3 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                h0Var.f391656d = string3;
                i17 = 1;
            }
            z2Var.q(string);
            z2Var.m(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
            z2Var.v(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x8 x8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x8(z2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a9 a9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a9(e9Var, z2Var);
            z2Var.D = x8Var;
            z2Var.E = a9Var;
            mm2.g0 g0Var = (mm2.g0) eVar.a(mm2.g0.class);
            r45.td2 td2Var2 = g0Var.f410599m;
            int N6 = g0Var.N6((td2Var2 != null ? td2Var2.m75939xb282bd08(3) : 0) > 0 ? 2 : 1);
            z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570407ap5);
            android.view.View view = z2Var.f293591g;
            view.findViewById(com.p314xaae8f345.mm.R.id.i7l).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a4l);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.i7k);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.i7n);
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c9(e9Var, N6, h0Var, textView2, view, i17));
            if (i17 == 2) {
                textView.setText(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9d));
                ne2.c cVar = ne2.c.f418060a;
                android.content.Context context2 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                textView2.setText(cVar.a(context2, N6, 2));
            } else {
                textView.setText(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9b));
                ne2.c cVar2 = ne2.c.f418060a;
                android.content.Context context3 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                textView2.setText(cVar2.a(context3, N6, 1));
            }
            z2Var.C();
            e9Var.a().set(0, java.lang.Integer.valueOf(i17));
        }
        pk2.f8.a(pk2.f8.f437280a, 2, 2, null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437393i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f445960a;
        return mm2.g0.Q6((mm2.g0) o9Var.c(mm2.g0.class), null, 1, null) && !((mm2.e1) o9Var.c(mm2.e1.class)).b7();
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        r(menu, this.f437392h, com.p314xaae8f345.mm.R.C30867xcad56011.d9a, com.p314xaae8f345.mm.R.raw.f80329xebdaa825);
        pk2.f8.a(pk2.f8.f437280a, 2, 1, null, 4, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437392h;
    }
}
