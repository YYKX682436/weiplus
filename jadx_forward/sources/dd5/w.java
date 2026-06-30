package dd5;

/* loaded from: classes9.dex */
public final class w extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.w f310855p = new dd5.w();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w() {
        super(dd5.z.f310881c);
        dd5.z.f310880b.getClass();
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.y yVar = (dd5.y) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (yVar == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getTitleTv(...)");
        z(d17, context, yVar.f310869a);
        android.widget.TextView b17 = binding.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getDescTv(...)");
        z(b17, context, yVar.f310870b);
        binding.c().setImageResource(yVar.f310871c);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.y yVar = (dd5.y) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (yVar == null) {
            return;
        }
        ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).uj(context, yVar.f310872d, null);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        w05.e eVar;
        java.lang.String x17;
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(U1);
        w05.d dVar = (w05.d) bVar.m75936x14adae67(bVar.f513848e + 66);
        if (dVar == null) {
            return null;
        }
        java.util.LinkedList s17 = dVar.s();
        if ((s17 == null || s17.isEmpty()) || (eVar = (w05.e) dVar.s().getFirst()) == null) {
            return null;
        }
        int m75939xb282bd08 = bVar.m75939xb282bd08(bVar.f449898d + 6);
        long l17 = eVar.l();
        int i17 = h20.b.f359795a;
        int i18 = l17 == 0 ? com.p314xaae8f345.mm.R.raw.f78664x59152d74 : com.p314xaae8f345.mm.R.raw.f78665x4037e31b;
        java.lang.String C = dVar.C();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.x())) {
            x17 = eVar.x();
        } else if (m75939xb282bd08 == 115) {
            x17 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573701o45);
        } else if (m75939xb282bd08 != 124) {
            x17 = "";
        } else {
            int B = dVar.B();
            int i19 = h20.h.f359801a;
            x17 = B == 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573700o44) : B == 1 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573702o46) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573701o45);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x17);
        return new dd5.y(C, x17, i18, f9Var);
    }
}
