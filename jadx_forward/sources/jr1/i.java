package jr1;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final jr1.i f382893a = new jr1.i();

    public final boolean a(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jr1.j.e(str, i17), c(i17));
    }

    public final void b() {
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("bizphotofansnofiticationholder@picfansmsg");
        Di.m(linkedList);
        nr1.f Vi = yq1.u0.Vi();
        hr1.e z07 = Vi.z0("bizphotofansnofiticationholder@picfansmsg");
        if (z07.f72763xa3c65b86 < 0) {
            hr1.g gVar = hr1.i.f364882e;
            hr1.e eVar = new hr1.e(hr1.i.f364884g);
            jr1.j.f(eVar, 5);
            Vi.mo55864x413cb2b4(eVar, true);
        }
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0.f299291c.h(c(5), new jr1.b(z07, Vi));
    }

    public final java.lang.String c(int i17) {
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            return ((ox.r) d0Var).Bi(2).c();
        }
        rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr2 = tk.s.f501403d;
        return ((ox.r) d0Var2).Bi(1).c();
    }

    public final void d(int i17, java.lang.String currentBiz, java.lang.String identityName, int i18, boolean z17, yz5.l onBlockFinished) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentBiz, "currentBiz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(identityName, "identityName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onBlockFinished, "onBlockFinished");
        r45.r16 r16Var = new r45.r16();
        if (currentBiz.length() == 0) {
            currentBiz = f382893a.c(i17);
        }
        r16Var.f465967d = currentBiz;
        r16Var.f465968e = i18;
        if (i17 == 5) {
            r16Var.f465969f = r26.n0.Z(identityName, "@picfansmsg");
        } else {
            r16Var.f465969f = r26.n0.Z(identityName, "@bizfansmsg");
        }
        r16Var.f465970g = z17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 26275;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mp/setblacklist";
        lVar.f152197a = r16Var;
        lVar.f152198b = new r45.s16();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new jr1.e(onBlockFinished));
    }

    public final void e(int i17, java.lang.String openId, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openId, "openId");
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0.f299291c.i(c(i18), i17, i18 == 5 ? com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275337b : com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a, openId, jr1.f.f382890a);
    }
}
