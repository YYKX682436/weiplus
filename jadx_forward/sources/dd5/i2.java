package dd5;

/* loaded from: classes9.dex */
public final class i2 extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.i2 f310705p = new dd5.i2();

    public i2() {
        super(dd5.l2.f310736b.f508072a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.k2 k2Var = (dd5.k2) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (k2Var == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getTitleTv(...)");
        java.lang.CharSequence charSequence = k2Var.f310726a;
        if (r26.n0.N(charSequence)) {
            charSequence = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572039x0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charSequence, "getString(...)");
        }
        z(d17, context, charSequence);
        android.widget.TextView b17 = binding.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getDescTv(...)");
        z(b17, context, k2Var.f310727b);
        A(context, binding, com.p314xaae8f345.mm.R.raw.f80737xdb17644f);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.k2 k2Var = (dd5.k2) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (k2Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a c5824x69fbb00a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a();
        am.sn snVar = c5824x69fbb00a.f136132g;
        snVar.f89439c = context;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = k2Var.f310729d;
        snVar.f89437a = f9Var.m124847x74d37ac6();
        c5824x69fbb00a.f136132g.f89442f = f9Var.Q0();
        am.sn snVar2 = c5824x69fbb00a.f136132g;
        snVar2.f89440d = false;
        snVar2.f89438b = k2Var.f310728c;
        snVar2.f89443g = 6;
        c5824x69fbb00a.e();
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.CharSequence m75945x2fec8307;
        java.lang.String U1 = f9Var.U1();
        int i17 = 0;
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(U1);
        int i18 = bVar.f449898d;
        java.lang.String m75945x2fec83072 = bVar.m75945x2fec8307(i18 + 3);
        java.lang.String str = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec83072)) {
            m75945x2fec8307 = bVar.m75945x2fec8307(i18 + 2);
        } else {
            if (m75945x2fec83072.length() > 1000) {
                m75945x2fec83072 = m75945x2fec83072.substring(0, 1000);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75945x2fec83072, "substring(...)");
            }
            java.util.List f07 = r26.n0.f0(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(m75945x2fec83072, "&lt;", "<", false), "&gt;", ">", false), "&amp;", "&", false), " ", " ", false), new java.lang.String[]{"\n"}, false, 0, 6, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = f07.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    i19 = 0;
                    break;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r26.n0.u0((java.lang.String) f07.get(i19)).toString())) {
                    arrayList.add(f07.get(i19));
                    break;
                }
                i19++;
            }
            int size2 = f07.size();
            java.lang.String str2 = "";
            for (int i27 = i19 + 1; i27 < size2; i27++) {
                str2 = str2 + ((java.lang.String) f07.get(i27)) + ' ';
            }
            java.lang.String obj = r26.n0.u0(str2).toString();
            if (obj.length() > 0) {
                arrayList.add(obj);
            }
            if (arrayList.size() > 0) {
                m75945x2fec8307 = (java.lang.CharSequence) arrayList.get(0);
                i17 = 1;
            } else {
                m75945x2fec8307 = bVar.m75945x2fec8307(i18 + 2);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int size3 = arrayList.size();
            while (i17 < size3) {
                arrayList2.add(arrayList.get(i17));
                i17++;
            }
            java.util.List K0 = kz5.n0.K0(arrayList2, 2);
            if (true ^ K0.isEmpty()) {
                str = kz5.n0.g0(K0, "\n", null, null, 0, null, null, 62, null);
            }
        }
        return new dd5.k2(m75945x2fec8307, str, bVar.m75945x2fec8307(bVar.f513848e + 44), f9Var);
    }
}
