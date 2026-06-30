package io;

/* loaded from: classes9.dex */
public final class b implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.o0 f374699a;

    /* renamed from: b, reason: collision with root package name */
    public nb5.a f374700b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.o0 o0Var = this.f374699a;
        android.view.View view = o0Var != null ? o0Var.f336189a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehn, (android.view.ViewGroup) null);
        this.f374699a = new em.o0(inflate);
        c(null, this.f374700b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        nb5.a aVar = (nb5.a) pVar;
        nb5.a aVar2 = this.f374700b;
        this.f374700b = aVar;
        c(aVar2, aVar);
    }

    public final void c(nb5.a aVar, nb5.a aVar2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        s05.a o17;
        s05.a o18;
        em.o0 o0Var = this.f374699a;
        v05.b j17 = aVar2 != null ? aVar2.j() : null;
        if (aVar2 == null || o0Var == null || j17 == null) {
            return;
        }
        android.view.View view = o0Var.f336189a;
        android.content.Context context = view.getContext();
        int i17 = j17.f513848e;
        s05.d dVar = (s05.d) j17.m75936x14adae67(i17 + 39);
        if (dVar == null || (str = dVar.y()) == null) {
            str = "";
        }
        k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(str);
        java.lang.String m75945x2fec8307 = Bi != null ? Bi.f68913x21f9b213 : j17.m75945x2fec8307(i17 + 12);
        if (Bi != null) {
            str2 = Bi.f68920x68aa7b8d;
        } else {
            s05.d dVar2 = (s05.d) j17.m75936x14adae67(i17 + 39);
            if (dVar2 == null || (str2 = dVar2.B()) == null) {
                str2 = "";
            }
        }
        s05.d dVar3 = (s05.d) j17.m75936x14adae67(i17 + 39);
        java.lang.String m163510xabfe893c = (dVar3 == null || (o18 = dVar3.o()) == null) ? null : o18.m163510xabfe893c();
        s05.d dVar4 = (s05.d) j17.m75936x14adae67(i17 + 39);
        java.lang.String j18 = (dVar4 == null || (o17 = dVar4.o()) == null) ? null : o17.j();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m163510xabfe893c) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j18)) {
            m75945x2fec8307 = m163510xabfe893c;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m163510xabfe893c) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j18)) {
            str2 = j18;
        }
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        gk0.k kVar = new gk0.k(h17, h17);
        kVar.f353966d = 0.5f;
        kVar.f353967e = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
        gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
        if (o0Var.f336192d == null) {
            o0Var.f336192d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ne8);
        }
        android.widget.ImageView imageView = o0Var.f336192d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getSourceIv(...)");
        if (str2 == null) {
            str2 = "";
        }
        ((h83.g) n0Var).wi(imageView, str2, kVar);
        int h18 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        gk0.k kVar2 = new gk0.k(h18, h18);
        if (com.p314xaae8f345.mm.vfs.w6.j(aVar2.k())) {
            gk0.n0 n0Var2 = (gk0.n0) i95.n0.c(gk0.n0.class);
            com.p314xaae8f345.mm.ui.C21405x85fc1ce0 a17 = o0Var.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getThumbIv(...)");
            ((h83.g) n0Var2).Ai(a17, aVar2.k(), kVar2);
        } else {
            s05.d dVar5 = (s05.d) j17.m75936x14adae67(i17 + 39);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar5 != null ? dVar5.C() : null)) {
                v05.a aVar3 = (v05.a) j17.m75936x14adae67(i17 + 8);
                if (aVar3 != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appcoverthumbdown_");
                    java.lang.String o19 = aVar3.o();
                    java.lang.String str4 = java.lang.Boolean.valueOf(o19.length() > 0).booleanValue() ? o19 : null;
                    if (str4 == null) {
                        str4 = aVar3.A();
                    }
                    sb6.append(str4);
                    y01.a aVar4 = new y01.a(sb6.toString());
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar3.A())) {
                        aVar4.a(aVar3.j());
                        aVar4.d(aVar3.o());
                        aVar4.b(aVar3.n());
                        aVar4.f540108d = 3;
                    } else {
                        aVar4.a(aVar3.w());
                        aVar4.d(aVar3.A());
                        aVar4.b(aVar3.z());
                        aVar4.c(aVar3.u());
                        aVar4.f540108d = 19;
                    }
                    ho.b.a(aVar4, o0Var.a(), kVar2);
                }
            } else {
                l01.b bVar = l01.d0.f396294a;
                com.p314xaae8f345.mm.ui.C21405x85fc1ce0 a18 = o0Var.a();
                s05.d dVar6 = (s05.d) j17.m75936x14adae67(i17 + 39);
                if (dVar6 == null || (str3 = dVar6.C()) == null) {
                    str3 = "";
                }
                bVar.b(a18, str3, null, null);
            }
        }
        if (o0Var.f336193e == null) {
            o0Var.f336193e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view.findViewById(com.p314xaae8f345.mm.R.id.odf);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = o0Var.f336193e;
        int i18 = j17.f449898d;
        java.lang.String m75945x2fec83072 = j17.m75945x2fec8307(i18 + 2);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        c22632xdab56332.setText(m75945x2fec83072);
        if (o0Var.f336191c == null) {
            o0Var.f336191c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view.findViewById(com.p314xaae8f345.mm.R.id.cut);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab563322 = o0Var.f336191c;
        java.lang.String m75945x2fec83073 = j17.m75945x2fec8307(i18 + 3);
        c22632xdab563322.setText(m75945x2fec83073 != null ? m75945x2fec83073 : "");
        if (o0Var.f336190b == null) {
            o0Var.f336190b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view.findViewById(com.p314xaae8f345.mm.R.id.nec);
        }
        o0Var.f336190b.setText(m75945x2fec8307);
        view.setOnClickListener(new io.a(str, j17));
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f374700b;
    }
}
