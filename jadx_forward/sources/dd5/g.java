package dd5;

/* loaded from: classes9.dex */
public final class g extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.g f310678p = new dd5.g();

    public g() {
        super(dd5.j.f310706b.f508072a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.i iVar = (dd5.i) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (iVar == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getTitleTv(...)");
        z(d17, context, iVar.f310699a);
        android.widget.TextView b17 = binding.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getDescTv(...)");
        z(b17, context, iVar.f310700b);
        int width = binding.c().getWidth();
        gk0.k kVar = new gk0.k(width, width);
        kVar.f353967e = com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b;
        gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21832xcd3ee688 c17 = binding.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getIconIv(...)");
        ((h83.g) n0Var).Ai(c17, iVar.f310701c, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // uc5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(android.content.Context r18, java.lang.Object r19, uc5.r0 r20) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dd5.g.u(android.content.Context, java.lang.Object, uc5.r0):void");
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
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
        if (dVar == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6 f6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class);
        k91.v5 Bi = f6Var != null ? ((k91.g4) f6Var).Bi(dVar.y()) : null;
        java.lang.String m75945x2fec8307 = bVar.m75945x2fec8307(bVar.f449898d + 2);
        java.lang.String str = Bi != null ? Bi.f68913x21f9b213 : null;
        if (str == null) {
            str = bVar.m75945x2fec8307(i17 + 12);
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String D2 = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D2, "getFullThumbPathByCache(...)");
        return new dd5.i(m75945x2fec8307, str, D2, f9Var);
    }
}
