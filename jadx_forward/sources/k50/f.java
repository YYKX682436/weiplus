package k50;

/* loaded from: classes9.dex */
public final class f implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k50.g f385738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f385739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385740c;

    public f(k50.g gVar, java.util.List list, java.lang.String str) {
        this.f385738a = gVar;
        this.f385739b = list;
        this.f385740c = str;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String str;
        wi5.n0 n0Var;
        k50.g gVar = this.f385738a;
        j75.f Q6 = gVar.Q6();
        boolean z17 = (Q6 == null || (n0Var = (wi5.n0) Q6.mo140437x75286adb()) == null || !n0Var.G) ? false : true;
        java.util.List list = this.f385739b;
        if (!z17) {
            j75.f Q62 = gVar.Q6();
            if (Q62 != null) {
                Q62.B3(new xi5.g(list, intent, i17));
                return;
            }
            return;
        }
        if (i17 == -1) {
            if (intent == null || (str = intent.getStringExtra("Retr_ForwardExtraText")) == null) {
                str = "";
            }
            gVar.f405047f = !r26.n0.N(str);
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                if (!r26.n0.N(str2)) {
                    java.lang.String cardUsername = this.f385740c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardUsername, "cardUsername");
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = gVar.e7();
                    if (e76 != null) {
                        int i18 = 42;
                        if (e76.mo78013xfb85f7b0() == 42) {
                            e76.t3();
                            com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
                            pb5.a aVar = (pb5.a) gVar.c7();
                            cj6.lb(aVar.m75942xfb822ef2(aVar.f125235d + 0), e76, true);
                            ((ce0.e) ((xg3.t0) i95.n0.c(xg3.t0.class))).getClass();
                            com.p314xaae8f345.mm.p957x53236a1b.g1.L(e76, 21, 1);
                        }
                        if (e76.K2()) {
                            i18 = 67;
                        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(com.p314xaae8f345.mm.p2621x8fb0427b.y8.i(gVar.d7()).f277891a)) {
                            i18 = 66;
                        }
                        w11.r1 b17 = w11.s1.b(str2, null, 2, null);
                        b17.g(str2);
                        b17.e(gVar.d7());
                        b17.f523663e = i18;
                        b17.f523664f = 1;
                        b17.f523667i = 4;
                        c01.h7 h7Var = new c01.h7();
                        pb5.a aVar2 = (pb5.a) gVar.c7();
                        h7Var.f118760b = aVar2.m75942xfb822ef2(aVar2.f125235d + 0);
                        pb5.a aVar3 = (pb5.a) gVar.c7();
                        h7Var.f118762d = aVar3.m75945x2fec8307(aVar3.f125235d + 1);
                        h7Var.f118763e = gVar.m158354x19263085().getIntent().getStringExtra("msg_forward_sns_obj_id");
                        b17.f(h7Var);
                        w11.n1 a17 = b17.a();
                        w11.r0 r0Var = (w11.r0) a17.f523628a;
                        java.lang.Long valueOf = r0Var != null ? java.lang.Long.valueOf(r0Var.f523650f) : null;
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a c6194x6522023a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a();
                        long longValue = valueOf != null ? valueOf.longValue() : 0L;
                        am.xz xzVar = c6194x6522023a.f136451g;
                        xzVar.f89942a = longValue;
                        xzVar.f89943b = 0;
                        xzVar.f89944c = str2;
                        c6194x6522023a.e();
                        a17.a();
                    } else {
                        jz5.g gVar2 = gVar.f385746s;
                        java.lang.String str3 = (java.lang.String) ((jz5.n) gVar2).mo141623x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "<get-cardReceiveUsername>(...)");
                        if (r26.n0.N(str3)) {
                            gVar.q7(str2, ((pb5.a) gVar.c7()).k());
                        } else {
                            java.lang.String str4 = (java.lang.String) ((jz5.n) gVar2).mo141623x754a37bb();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "<get-cardReceiveUsername>(...)");
                            gVar.q7(str4, cardUsername);
                        }
                    }
                    if (gVar.f405047f) {
                        ((dk5.s5) tg3.t1.a()).Ui(str, str2);
                    }
                }
            }
            gVar.Y6(list.size() > 1, false, null);
        }
    }
}
