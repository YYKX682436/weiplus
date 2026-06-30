package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class yn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho f281881d;

    public yn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar) {
        this.f281881d = hoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$initUseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar = this.f281881d;
        java.lang.String x17 = hoVar.f280113d.x();
        int length = hoVar.f280724u.length();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f2 = hoVar.f280716m;
        if (c21668xed8974f2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resultTv");
            throw null;
        }
        int length2 = c21668xed8974f2.getF213058i().toString().length();
        java.lang.String m07 = hoVar.m0();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6980x787b3d28 c6980x787b3d28 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6980x787b3d28();
        if (pn4.f1.f438638a.length() == 0) {
            str = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
            pn4.f1.f438638a = str;
        } else {
            str = pn4.f1.f438638a;
        }
        c6980x787b3d28.r(str);
        c6980x787b3d28.f142884f = 2;
        c6980x787b3d28.p("6");
        c6980x787b3d28.f142887i = length;
        c6980x787b3d28.f142888j = length2;
        c6980x787b3d28.f142890l = c6980x787b3d28.b("TargetLanguage", m07, true);
        c6980x787b3d28.q(x17);
        c6980x787b3d28.k();
        sb5.n2 n2Var = hoVar.f280711e;
        if (n2Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f22 = hoVar.f280716m;
            if (c21668xed8974f22 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resultTv");
                throw null;
            }
            java.lang.String obj = c21668xed8974f22.getF213058i().toString();
            hoVar.f280723t = obj;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h2) n2Var).f271873a;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
            if (y4Var != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) ((sb5.i0) y4Var.a().f542241c.a(sb5.i0.class))).P0(51);
            }
            c19666xfd6e2f33.f271554m.mo81590x765074af(obj);
            c19666xfd6e2f33.f271554m.mo81549xf579a34a(obj.length());
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ln lnVar = hoVar.A;
        lnVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(lnVar.f280984a.r0()).putInt(lnVar.a("useTrans"), 0);
        hoVar.u0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn.f280909d);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f23 = hoVar.f280716m;
        if (c21668xed8974f23 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resultTv");
            throw null;
        }
        c21668xed8974f23.m79447xac166b75("");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$initUseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
