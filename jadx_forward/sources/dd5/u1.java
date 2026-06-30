package dd5;

/* loaded from: classes9.dex */
public abstract class u1 extends uc5.b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(ad5.l0[] availableOperation) {
        super(availableOperation);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(availableOperation, "availableOperation");
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.v1 v1Var = (dd5.v1) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (v1Var == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getTitleTv(...)");
        z(d17, context, v1Var.f310843a);
        android.widget.TextView b17 = binding.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getDescTv(...)");
        z(b17, context, v1Var.f310844b);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        float g17 = i65.a.g(context);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = v1Var.f310848f;
        java.lang.String str = v1Var.f310845c;
        android.graphics.Bitmap m07 = Di.m0(f9Var, str, g17, false);
        if (m07 != null && !m07.isRecycled()) {
            binding.c().setImageBitmap(m07);
            return;
        }
        android.graphics.Bitmap Di2 = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(v1Var.f310846d, 1, i65.a.g(context));
        if (Di2 != null && !Di2.isRecycled()) {
            binding.c().setImageBitmap(Di2);
            return;
        }
        java.lang.String b18 = qk.c.b(str, 4, v1Var.f310847e);
        if (b18 == null || r26.n0.N(b18)) {
            A(context, binding, com.p314xaae8f345.mm.R.raw.f80478xe39dc57);
            return;
        }
        int b19 = i65.a.b(context, 50);
        gk0.k kVar = new gk0.k(b19, b19);
        kVar.f353967e = com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b;
        gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21832xcd3ee688 c17 = binding.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getIconIv(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
        ((h83.g) n0Var).wi(c17, b18, kVar);
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
        int i18 = i17 + 11;
        java.lang.String v17 = o72.x1.v(context, bVar.m75945x2fec8307(i18));
        if (!(!(v17 == null || r26.n0.N(v17)))) {
            v17 = null;
        }
        int i19 = bVar.f449898d;
        if (v17 == null) {
            v17 = bVar.m75945x2fec8307(i19 + 3);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(bVar.m75945x2fec8307(i18), true);
        if (n17 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n17.d1(), bVar.m75945x2fec8307(i18))) {
            ((c01.k7) c01.n8.a()).b(bVar.m75945x2fec8307(i18), 14, null);
        } else {
            v17 = n17.g2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v17, "getDisplayRemark(...)");
        }
        java.lang.String str = v17;
        r05.g gVar = (r05.g) bVar.m75936x14adae67(i17 + 25);
        boolean z17 = gVar != null && bVar.m75939xb282bd08(i19 + 6) == 5 && gVar.p() == 1 && gVar.o() == 5;
        java.lang.String m75945x2fec8307 = bVar.m75945x2fec8307(i19 + 2);
        java.lang.String z07 = f9Var.z0();
        java.lang.String str2 = true ^ (z07 == null || r26.n0.N(z07)) ? z07 : null;
        return new dd5.v1(m75945x2fec8307, str, str2 == null ? bVar.m75945x2fec8307(i17 + 14) : str2, bVar.m75945x2fec8307(i19 + 0), z17, f9Var);
    }
}
