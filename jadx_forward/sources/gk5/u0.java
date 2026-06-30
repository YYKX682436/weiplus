package gk5;

/* loaded from: classes9.dex */
public final class u0 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk5.v0 f354253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f354254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354255c;

    public u0(gk5.v0 v0Var, java.util.List list, java.lang.String str) {
        this.f354253a = v0Var;
        this.f354254b = list;
        this.f354255c = str;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String str;
        wi5.n0 n0Var;
        gk5.v0 v0Var = this.f354253a;
        j75.f Q6 = v0Var.Q6();
        boolean z17 = (Q6 == null || (n0Var = (wi5.n0) Q6.mo140437x75286adb()) == null || !n0Var.G) ? false : true;
        java.util.List list = this.f354254b;
        if (!z17) {
            j75.f Q62 = v0Var.Q6();
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
            v0Var.f405047f = !r26.n0.N(str);
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                if (!r26.n0.N(str2)) {
                    java.lang.String cardUsername = this.f354255c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardUsername, "cardUsername");
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = v0Var.e7();
                    if (e76 != null) {
                        e76.t3();
                        com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
                        ob5.a aVar = (ob5.a) v0Var.c7();
                        cj6.lb(aVar.m75942xfb822ef2(aVar.f125235d + 0), e76, true);
                        ((ce0.e) ((xg3.t0) i95.n0.c(xg3.t0.class))).getClass();
                        com.p314xaae8f345.mm.p957x53236a1b.g1.L(e76, 21, 1);
                        w11.r1 b17 = w11.s1.b(str2, null, 2, null);
                        b17.g(str2);
                        b17.e(v0Var.d7());
                        b17.f523663e = 49;
                        b17.f523664f = 1;
                        b17.f523667i = 4;
                        c01.h7 h7Var = new c01.h7();
                        ob5.a aVar2 = (ob5.a) v0Var.c7();
                        h7Var.f118760b = aVar2.m75942xfb822ef2(aVar2.f125235d + 0);
                        ob5.a aVar3 = (ob5.a) v0Var.c7();
                        h7Var.f118762d = aVar3.m75945x2fec8307(aVar3.f125235d + 1);
                        h7Var.f118763e = v0Var.m158354x19263085().getIntent().getStringExtra("msg_forward_sns_obj_id");
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
                        jz5.g gVar = v0Var.f354257s;
                        java.lang.String str3 = (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "<get-cardReceiveUsername>(...)");
                        if (r26.n0.N(str3)) {
                            v0Var.q7(str2, ((ob5.a) v0Var.c7()).k());
                        } else {
                            java.lang.String str4 = (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "<get-cardReceiveUsername>(...)");
                            v0Var.q7(str4, cardUsername);
                        }
                    }
                    if (v0Var.f405047f) {
                        ((dk5.s5) tg3.t1.a()).Ui(str, str2);
                    }
                }
            }
            v0Var.Y6(list.size() > 1, false, null);
        }
    }
}
