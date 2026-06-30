package nu0;

/* loaded from: classes5.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(nu0.b4 b4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421577d = b4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.n2(this.f421577d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.n2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        nu0.b4 b4Var = this.f421577d;
        b4Var.h7().m7963x830bc99d(true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(b4Var.m80379x76847179());
        c1162x665295de.Q(0);
        c1162x665295de.m8091xc21abdf5(true);
        b4Var.h7().mo7967x900dcbe1(c1162x665295de);
        b4Var.h7().m7964x8d4ad49c(new p012xc85e97e9.p103xe821e364.p104xd1075a44.z());
        b4Var.h7().N(new nu0.d2());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = b4Var.f421420w.iterator();
        while (it.hasNext()) {
            arrayList.add(new ku0.a((zu0.a) it.next(), false, 2, null));
        }
        if (arrayList.size() < b4Var.n7()) {
            arrayList.add(new ku0.a(new zu0.a(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1(qg.a.Unknown, "", qg.c.Unknown), 0, 0), false, 2, null));
        }
        ju0.b bVar = b4Var.K;
        bVar.E(arrayList);
        android.view.View mo144222x4ff8c0f0 = b4Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.t2z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        b4Var.F = mo144222x4ff8c0f0;
        android.view.View mo144222x4ff8c0f02 = b4Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ct9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f02, "findViewById(...)");
        b4Var.G = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo144222x4ff8c0f02;
        android.view.View mo144222x4ff8c0f03 = b4Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565579t33);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f03, "findViewById(...)");
        b4Var.H = (android.widget.TextView) mo144222x4ff8c0f03;
        new p012xc85e97e9.p103xe821e364.p104xd1075a44.g1(new ju0.a(bVar, new nu0.g2(b4Var))).d(b4Var.h7());
        bVar.f332455e = new nu0.f2(b4Var);
        b4Var.h7().mo7960x6cab2c8d(bVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(b4Var.m80379x76847179(), 0, false);
        b4Var.k7().mo7967x900dcbe1(c1162x665295de2);
        b4Var.f421410J = new ju0.d(kz5.p0.f395529d);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 k76 = b4Var.k7();
        ju0.d dVar = b4Var.f421410J;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentImageAdapter");
            throw null;
        }
        k76.mo7960x6cab2c8d(dVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 y1Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.y1();
        y1Var.b(b4Var.k7());
        b4Var.k7().i(new nu0.b2(y1Var, c1162x665295de2, b4Var));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = b4Var.k7().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10998xc859527c p76 = b4Var.p7();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 k77 = b4Var.k7();
        p76.getClass();
        java.util.ArrayList arrayList2 = p76.f151220e;
        if (!arrayList2.contains(k77)) {
            arrayList2.add(k77);
        }
        nu0.q0 U6 = b4Var.U6();
        nu0.c2 c2Var = new nu0.c2(b4Var);
        U6.getClass();
        U6.f421611u = c2Var;
        return b4Var.V6().Z6();
    }
}
