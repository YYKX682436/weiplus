package dd5;

/* loaded from: classes9.dex */
public final class k extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.k f310720p = new dd5.k();

    public k() {
        super(dd5.n.f310755b.f508072a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        jz5.f0 f0Var;
        em.a2 binding = (em.a2) obj;
        dd5.m mVar = (dd5.m) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (mVar == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getTitleTv(...)");
        z(d17, context, mVar.f310740a);
        android.widget.TextView b17 = binding.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getDescTv(...)");
        z(b17, context, mVar.f310741b);
        int width = binding.c().getWidth();
        gk0.k kVar = new gk0.k(width, width);
        kVar.f353967e = com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b;
        kVar.f353966d = 0.5f;
        java.lang.String str = mVar.f310742c;
        if (str != null) {
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21832xcd3ee688 c17 = binding.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getIconIv(...)");
            ((h83.g) n0Var).wi(c17, str, kVar);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            gk0.n0 n0Var2 = (gk0.n0) i95.n0.c(gk0.n0.class);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21832xcd3ee688 c18 = binding.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getIconIv(...)");
            ((h83.g) n0Var2).Ai(c18, mVar.f310743d, kVar);
        }
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.m mVar = (dd5.m) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (mVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = mVar.f310748i;
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0());
        java.lang.String Q0 = f9Var.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        java.lang.String d17 = g95.e0.d(f9Var);
        if (d17 == null) {
            d17 = "";
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_username", mVar.f310744e);
        if (R4) {
            intent.putExtra("key_scene_note", Q0 + ':' + d17);
        } else {
            intent.putExtra("key_scene_note", Q0);
        }
        k91.z5 z5Var = new k91.z5();
        z5Var.f387396a = mVar.f310745f;
        z5Var.f387405j = 6;
        z5Var.f387403h = mVar.f310747h;
        z5Var.f387402g = mVar.f310746g;
        intent.putExtra("key_scene_exposed_params", z5Var.a());
        j45.l.j(context, "appbrand", ".ui.AppBrandProfileUI", intent, null);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String B;
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(U1);
        int i17 = bVar.f513848e;
        s05.d dVar = (s05.d) bVar.m75936x14adae67(i17 + 39);
        if (dVar == null || dVar.m163514xfb85f7b0() != 1) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6 f6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class);
        k91.v5 Bi = f6Var != null ? ((k91.g4) f6Var).Bi(dVar.y()) : null;
        java.lang.String str = Bi != null ? Bi.f68913x21f9b213 : null;
        if (str == null) {
            str = bVar.m75945x2fec8307(i17 + 12);
        }
        java.lang.String str2 = str;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (Bi == null || (B = Bi.f68910xea1bd3d4) == null) {
            B = dVar.B();
        }
        java.lang.String str3 = (B == null || r26.n0.N(B)) ^ true ? B : null;
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String D2 = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D2, "getFullThumbPathByCache(...)");
        java.lang.String y17 = dVar.y();
        java.lang.String str4 = y17 == null ? "" : y17;
        java.lang.String m163512x74292566 = dVar.m163512x74292566();
        java.lang.String str5 = m163512x74292566 == null ? "" : m163512x74292566;
        int m163515x52c258a2 = dVar.m163515x52c258a2();
        s05.e q17 = dVar.q();
        return new dd5.m(str2, string, str3, D2, str4, str5, m163515x52c258a2, q17 != null ? q17.m163516xfb85f7b0() : 0, f9Var);
    }
}
