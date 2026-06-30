package gk5;

/* loaded from: classes9.dex */
public final class r extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new gd5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String m126747x696739c;
        l15.c j17 = ((gd5.a) c7()).j();
        return (j17 == null || (m126747x696739c = j17.m126747x696739c()) == null) ? "" : m126747x696739c;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((gk5.m1) pf5.z.f435481a.a(activity).a(gk5.m1.class)).W6(action);
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        java.lang.String str;
        l15.c j17;
        v05.b k17;
        z05.c cVar;
        v05.b k18;
        z05.c cVar2;
        v05.b k19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (Z6() != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            l15.c j18 = ((gd5.a) c7()).j();
            byte[] bArr = null;
            java.lang.String m75945x2fec8307 = (j18 == null || (k19 = j18.k()) == null) ? null : k19.m75945x2fec8307(k19.f513848e + 14);
            l15.c j19 = ((gd5.a) c7()).j();
            if (j19 == null || (k18 = j19.k()) == null || (cVar2 = (z05.c) k18.m75936x14adae67(k18.f513848e + 64)) == null || (str = cVar2.l()) == null) {
                str = "";
            }
            if ((str.length() > 0) && ((j17 = ((gd5.a) c7()).j()) == null || (k17 = j17.k()) == null || (cVar = (z05.c) k17.m75936x14adae67(k17.f513848e + 64)) == null || (m75945x2fec8307 = cVar.q()) == null)) {
                m75945x2fec8307 = "";
            }
            if (m75945x2fec8307 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardLiteAppUIC", "[processTransfer] thumb url is null");
                q7(toUser, (byte[]) h0Var.f391656d);
                return;
            }
            if (r26.i0.y(m75945x2fec8307, "http", false)) {
                gk0.h hVar = new gk0.h(m75945x2fec8307);
                gk0.k kVar = new gk0.k(0, 0);
                p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new gk5.q(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Bi(hVar, kVar), kVar, hVar, h0Var2, h0Var, this, toUser, null), 2, null);
                return;
            }
            android.graphics.Bitmap c17 = com.p314xaae8f345.mm.p786x600aa8b.e.c(m75945x2fec8307);
            h0Var2.f391656d = c17;
            if (c17 != null && !c17.isRecycled()) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                c17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            }
            h0Var.f391656d = bArr;
            q7(toUser, bArr);
        }
    }

    public final void q7(java.lang.String str, byte[] bArr) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar;
        java.lang.String str5;
        v05.b k17;
        v05.b k18;
        v05.b k19;
        v05.b k27;
        v05.b k28;
        z05.d p17;
        z05.d p18;
        z05.d p19;
        z05.d p27;
        z05.d p28;
        v05.b k29;
        z05.c cVar;
        v05.b k37;
        z05.c cVar2;
        z05.d p29;
        z05.d p37;
        z05.d p38;
        z05.d p39;
        v05.b k38;
        z05.d p47;
        v05.b k39;
        z05.d p48;
        z05.b o17;
        z05.b o18;
        v05.b k47;
        z05.b o19;
        z05.b o27;
        z05.b o28;
        z05.d p49;
        z05.b o29;
        z05.d p57;
        z05.d p58;
        z05.b o37;
        l15.c j17 = ((gd5.a) c7()).j();
        java.lang.String j18 = (j17 == null || (o37 = j17.o()) == null) ? null : o37.j();
        if (!(j18 == null || j18.length() == 0)) {
            l15.c j19 = ((gd5.a) c7()).j();
            java.lang.String n17 = (j19 == null || (p58 = j19.p()) == null) ? null : p58.n();
            java.lang.String str6 = n17 == null ? "" : n17;
            l15.c j27 = ((gd5.a) c7()).j();
            java.lang.String o38 = (j27 == null || (p57 = j27.p()) == null) ? null : p57.o();
            java.lang.String str7 = o38 == null ? "" : o38;
            l15.c j28 = ((gd5.a) c7()).j();
            java.lang.String j29 = (j28 == null || (o29 = j28.o()) == null) ? null : o29.j();
            java.lang.String str8 = j29 == null ? "" : j29;
            l15.c j37 = ((gd5.a) c7()).j();
            java.lang.String p59 = (j37 == null || (p49 = j37.p()) == null) ? null : p49.p();
            l15.c j38 = ((gd5.a) c7()).j();
            java.lang.String o39 = (j38 == null || (o28 = j38.o()) == null) ? null : o28.o();
            l15.c j39 = ((gd5.a) c7()).j();
            java.lang.String n18 = (j39 == null || (o27 = j39.o()) == null) ? null : o27.n();
            java.lang.String str9 = n18 == null ? "" : n18;
            l15.c j47 = ((gd5.a) c7()).j();
            java.lang.String l17 = (j47 == null || (o19 = j47.o()) == null) ? null : o19.l();
            java.lang.String str10 = l17 == null ? "" : l17;
            l15.c j48 = ((gd5.a) c7()).j();
            java.lang.String m75945x2fec8307 = (j48 == null || (k47 = j48.k()) == null) ? null : k47.m75945x2fec8307(k47.f449898d + 2);
            java.lang.String str11 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
            l15.c j49 = ((gd5.a) c7()).j();
            java.lang.String p66 = (j49 == null || (o18 = j49.o()) == null) ? null : o18.p();
            l15.c j57 = ((gd5.a) c7()).j();
            java.lang.String k48 = (j57 == null || (o17 = j57.o()) == null) ? null : o17.k();
            l15.c j58 = ((gd5.a) c7()).j();
            java.lang.String q17 = (j58 == null || (p48 = j58.p()) == null) ? null : p48.q();
            java.lang.String str12 = q17 == null ? "" : q17;
            l15.c j59 = ((gd5.a) c7()).j();
            java.lang.String m75945x2fec83072 = (j59 == null || (k39 = j59.k()) == null) ? null : k39.m75945x2fec8307(k39.f449898d + 3);
            java.lang.String str13 = m75945x2fec83072 == null ? "" : m75945x2fec83072;
            int parseInt = p66 != null ? java.lang.Integer.parseInt(p66) : 0;
            int parseInt2 = k48 != null ? java.lang.Integer.parseInt(k48) : 0;
            int parseInt3 = p59 != null ? java.lang.Integer.parseInt(p59) : 0;
            int parseInt4 = o39 != null ? java.lang.Integer.parseInt(o39) : 0;
            l15.c j66 = ((gd5.a) c7()).j();
            ((l63.h) ((m63.g) i95.n0.c(m63.g.class))).Ai(new com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16074x60a84deb(new com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138((j66 == null || (p47 = j66.p()) == null) ? null : p47.m75945x2fec8307(p47.f449898d + 0), str6, str7, str8, java.lang.Integer.valueOf(parseInt3), parseInt4), str9, str10, str11, parseInt, parseInt2, str12, str13), bArr, str);
            return;
        }
        l15.c j67 = ((gd5.a) c7()).j();
        java.lang.String m75945x2fec83073 = (j67 == null || (k38 = j67.k()) == null) ? null : k38.m75945x2fec8307(k38.f449898d + 9);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        l15.c j68 = ((gd5.a) c7()).j();
        java.lang.String q18 = (j68 == null || (p39 = j68.p()) == null) ? null : p39.q();
        if (q18 == null) {
            q18 = "";
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(q18);
        l15.c j69 = ((gd5.a) c7()).j();
        boolean r17 = (j69 == null || (p38 = j69.p()) == null) ? false : p38.r();
        l15.c j76 = ((gd5.a) c7()).j();
        boolean k49 = (j76 == null || (p37 = j76.p()) == null) ? false : p37.k();
        l15.c j77 = ((gd5.a) c7()).j();
        boolean j78 = (j77 == null || (p29 = j77.p()) == null) ? false : p29.j();
        l15.c j79 = ((gd5.a) c7()).j();
        if (j79 == null || (k37 = j79.k()) == null || (cVar2 = (z05.c) k37.m75936x14adae67(k37.f513848e + 64)) == null || (str2 = cVar2.l()) == null) {
            str2 = "";
        }
        l15.c j86 = ((gd5.a) c7()).j();
        z05.e o47 = (j86 == null || (k29 = j86.k()) == null || (cVar = (z05.c) k29.m75936x14adae67(k29.f513848e + 64)) == null) ? null : cVar.o();
        if (o47 != null) {
            java.util.Objects.toString(o47.mo12245xcc313de3());
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        l15.c j87 = ((gd5.a) c7()).j();
        java.lang.String m75945x2fec83074 = (j87 == null || (p28 = j87.p()) == null) ? null : p28.m75945x2fec8307(p28.f449898d + 0);
        l15.c j88 = ((gd5.a) c7()).j();
        java.lang.String n19 = (j88 == null || (p27 = j88.p()) == null) ? null : p27.n();
        l15.c j89 = ((gd5.a) c7()).j();
        java.lang.String o48 = (j89 == null || (p19 = j89.p()) == null) ? null : p19.o();
        l15.c j96 = ((gd5.a) c7()).j();
        java.lang.String p67 = (j96 == null || (p18 = j96.p()) == null) ? null : p18.p();
        l15.c j97 = ((gd5.a) c7()).j();
        java.lang.String l18 = (j97 == null || (p17 = j97.p()) == null) ? null : p17.l();
        l15.c j98 = ((gd5.a) c7()).j();
        if (j98 == null || (k28 = j98.k()) == null) {
            str3 = "";
            str4 = null;
        } else {
            str3 = "";
            str4 = k28.m75945x2fec8307(k28.f449898d + 2);
        }
        l15.c j99 = ((gd5.a) c7()).j();
        if (j99 == null || (k27 = j99.k()) == null) {
            mVar = h17;
            str5 = null;
        } else {
            mVar = h17;
            str5 = k27.m75945x2fec8307(k27.f449898d + 3);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        ja3.a aVar = new ja3.a();
        aVar.f33110xf01afcf6 = m75945x2fec83074;
        aVar.f33107x346425 = n19;
        aVar.f33111xa1713a8c = m75945x2fec83073;
        aVar.f380145a = l18;
        aVar.f33108x66f18c8 = o48;
        aVar.f380146b = r17;
        aVar.f380147c = k49;
        aVar.f380148d = j78;
        aVar.f380149e = str2;
        aVar.f380150f = o47;
        if (p67 != null) {
            aVar.f33109xca90681b = java.lang.Integer.parseInt(p67);
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(aVar);
        c11286x34a5504.f33130x6942258 = str4;
        c11286x34a5504.f33121x993583fc = str5;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12 c5987xfe669c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12();
        if (bArr != null) {
            c11286x34a5504.f33128x4f3b3aa0 = bArr;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardLiteAppUIC", "[publicSendAppMgsEvent] thumbData is not null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardLiteAppUIC", "[publicSendAppMgsEvent] thumbData is null");
        }
        am.jt jtVar = c5987xfe669c12.f136282g;
        jtVar.f88613a = c11286x34a5504;
        jtVar.f88616d = str;
        jtVar.f88617e = 2;
        jtVar.f88614b = q18;
        jtVar.f88615c = mVar == null ? str3 : mVar.f67372x453d1e07;
        l15.c j100 = ((gd5.a) c7()).j();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((j100 == null || (k19 = j100.k()) == null) ? null : k19.m75945x2fec8307(k19.f513848e + 11))) {
            jtVar.f88620h = null;
        } else {
            l15.c j101 = ((gd5.a) c7()).j();
            jtVar.f88618f = (j101 == null || (k18 = j101.k()) == null) ? null : k18.m75945x2fec8307(k18.f513848e + 11);
            l15.c j102 = ((gd5.a) c7()).j();
            jtVar.f88619g = (j102 == null || (k17 = j102.k()) == null) ? null : k17.m75945x2fec8307(k17.f513848e + 12);
        }
        jtVar.f88622j = m75945x2fec83073;
        jtVar.f88621i = m75945x2fec83073;
        c5987xfe669c12.e();
    }
}
