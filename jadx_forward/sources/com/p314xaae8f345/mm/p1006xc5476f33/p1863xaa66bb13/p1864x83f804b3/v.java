package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

/* loaded from: classes11.dex */
public class v implements vg3.w4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.a0 f230266a = new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.a0(null);

    public static void b(final r45.tn4 tn4Var, java.lang.String str, byte[] bArr, boolean z17, boolean z18, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        r45.d74 d74Var;
        boolean z19;
        if (tn4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.ContactSyncExtension", "unable to parse mod contact");
            return;
        }
        java.lang.String g17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tn4Var.P1) ? tn4Var.P1 : x51.j1.g(tn4Var.f468122d);
        java.lang.String str2 = tn4Var.Z;
        java.lang.String str3 = str2 == null ? "" : str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactSyncExtension", "processModContact user is null user:%s enuser:%s", g17, str3);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "processModContact begin username %s mobileHash %s mobileFullHash %s modContactScene %s fromGetContactService:%s", tn4Var.f468122d, tn4Var.f468146y0, tn4Var.f468128l1, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 e07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e0(g17);
        if (e07 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "oldContact.getEncryptUsername() :%s %s", e07.J0(), java.lang.Integer.valueOf((int) e07.E2));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "oldContact is null ");
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(g17) && e07 != null && g17.equals(e07.J0()) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactSyncExtension", "cat's replace user with stranger  user:%s", g17);
            return;
        }
        if (e07 == null || (z3Var = e07.t3()) == null) {
            z3Var = e07;
            e07 = null;
        }
        if (e07 == null) {
            e07 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(g17);
        }
        e07.X1(g17);
        e07.k1(tn4Var.f468119J);
        e07.mo43621x7650bebc(tn4Var.f468129m & tn4Var.f468130n);
        e07.W1(tn4Var.U1 & tn4Var.V1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "processModContactType user:%s cmdMC.BitMask:%s cmdMC.BitVal:%s BitMask2:%s BitValue2:%s, uctTypeIsConv:%s uctUiTypeIsConv:%s uctIsTop:%s isMute:%s", g17, java.lang.Integer.valueOf(tn4Var.f468129m), java.lang.Integer.valueOf(tn4Var.f468130n), java.lang.Long.valueOf(tn4Var.U1), java.lang.Long.valueOf(tn4Var.V1), java.lang.Boolean.valueOf(e07.z2()), java.lang.Boolean.valueOf(e07.A2()), java.lang.Boolean.valueOf(e07.w2()), java.lang.Boolean.valueOf(c01.e2.P(e07)));
        if (z17 && z3Var != null && ((int) z3Var.E2) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactSyncExtension", "processModContact bad GETCONTACT can't give the REAL_TYPE (mariohuang), user:%s old:%d get:%d", g17, java.lang.Integer.valueOf(z3Var.m124896xfb85f7b0()), java.lang.Integer.valueOf(e07.m124896xfb85f7b0()));
            if ((e07.m124896xfb85f7b0() & 1) == 0 && (z3Var.m124896xfb85f7b0() & 1) == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "processModContact resetNoContact!!");
                z19 = true;
            } else {
                z19 = false;
            }
            e07.mo43621x7650bebc(e07.m124896xfb85f7b0() | z3Var.m124896xfb85f7b0());
            e07.W1(e07.c1() | z3Var.c1());
            if (z19) {
                e07.s3();
            }
        }
        if ("filehelper".equals(g17)) {
            int m124896xfb85f7b0 = e07.m124896xfb85f7b0();
            l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            e07.mo43621x7650bebc(m124896xfb85f7b0 | 1);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            e07.K1(str3);
        } else if (z3Var != null && ((int) z3Var.E2) > 0) {
            e07.K1(z3Var.J0());
        }
        e07.E2 = z3Var == null ? 0L : (int) z3Var.E2;
        e07.M1(x51.j1.g(tn4Var.f468123e));
        e07.R1(x51.j1.g(tn4Var.f468124f));
        e07.S1(x51.j1.g(tn4Var.f468125g));
        e07.g3(tn4Var.f468126h);
        e07.M2(tn4Var.f468137s);
        e07.D1(x51.j1.g(tn4Var.f468140v));
        e07.J2(tn4Var.f468141w);
        e07.Z2(tn4Var.B);
        e07.c3(com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(tn4Var.S, tn4Var.f468145y, tn4Var.f468148z));
        e07.h3(tn4Var.A);
        e07.Z1(tn4Var.D);
        e07.o3(tn4Var.E);
        if (tn4Var.G == 9 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tn4Var.M1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "fix addContactScene!");
            tn4Var.G = 14;
        }
        e07.j3(tn4Var.G);
        e07.a2(tn4Var.M);
        e07.b2(tn4Var.L);
        e07.U1(tn4Var.M1);
        e07.F2(tn4Var.O1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "username:%s nickname:%s SourceExtInfo:%s source:%s ChatroomBusinessType:%s", e07.d1(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(e07.P0()), e07.Z0(), java.lang.Integer.valueOf(tn4Var.G), java.lang.Long.valueOf(tn4Var.O1));
        if (c01.e2.Y(tn4Var.H)) {
            e07.p3(tn4Var.H);
        }
        if (e07.X4()) {
            e07.K2((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            e07.C2(str);
        }
        boolean z27 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2533xb4860a9e.C20207x1c7aac1e()) == 1;
        r45.hs0 G = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().G(g17);
        r45.hs0 hs0Var = tn4Var.f468121b2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = G != null ? G.mo12245xcc313de3() : "";
        objArr[1] = hs0Var != null ? hs0Var.mo12245xcc313de3() : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "processModContact localFieldUpdateInfo:%s srvFieldUpdateInfo:%s", objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "remark (%s -> %s), remarkpyshort:%s, nickname:%s, pyinitial:%s, quanpin:%s isFieldUpdateOpen:%s", e07.w0(), x51.j1.g(tn4Var.f468132p), x51.j1.g(tn4Var.f468135q), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(x51.j1.g(tn4Var.f468123e)), x51.j1.g(tn4Var.f468124f), x51.j1.g(tn4Var.f468125g), java.lang.Boolean.valueOf(z27));
        r45.hs0 hs0Var2 = tn4Var.f468121b2;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = e07;
        boolean z28 = z27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.c0.b(z3Var2, G, hs0Var2, 10, z28, new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$a
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u
            public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3) {
                z3Var3.n1(x51.j1.g(r45.tn4.this.f468132p));
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.c0.b(z3Var2, G, hs0Var2, 12, z28, new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$b
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u
            public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3) {
                z3Var3.o1(x51.j1.g(r45.tn4.this.f468136r));
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.c0.b(z3Var2, G, hs0Var2, 11, z28, new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$c
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u
            public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3) {
                z3Var3.p1(x51.j1.g(r45.tn4.this.f468135q));
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.c0.b(z3Var2, G, hs0Var2, 61, z28, new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$d
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u
            public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3) {
                z3Var3.r1(r45.tn4.this.F1);
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.c0.b(z3Var2, G, hs0Var2, 59, z28, new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$e
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u
            public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3) {
                z3Var3.d3(r45.tn4.this.D1);
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.c0.b(z3Var2, G, hs0Var2, 60, z28, new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$f
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u
            public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3) {
                z3Var3.e3(r45.tn4.this.E1);
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.c0.b(z3Var2, G, hs0Var2, 87, z28, new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$g
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u
            public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3) {
                z3Var3.u1(r45.tn4.this.Z1);
            }
        });
        byte[] d17 = x51.j1.d(tn4Var.W1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(d17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "ContactExtraInfoBuf is null!");
            e07.O2(null);
        } else {
            r45.o80 o80Var = new r45.o80();
            try {
                o80Var.mo11468x92b714fd(d17);
                e07.O2(o80Var);
            } catch (java.io.IOException unused) {
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().j(g17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactSyncExtension", "[processModContact] cmdBuf is null! user:%s", g17);
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            Bi.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactStorage", "getCmdbuf failed user is null");
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.a4 a4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a4();
                a4Var.f66483xf4f1e9de = bArr;
                a4Var.f66485xdec927b = g17;
                l75.k0 k0Var = Bi.f276604d;
                if (k0Var.p("ContactCmdBuf", a4Var.mo9763xeb27878e(), "username=?", new java.lang.String[]{g17}) <= 0) {
                    k0Var.l("ContactCmdBuf", dm.i4.f66875xa013b0d5, a4Var.mo9763xeb27878e());
                }
            }
        }
        e07.z1(tn4Var.C1);
        r45.b5 b5Var = tn4Var.f468134p1;
        if (b5Var != null && (d74Var = b5Var.f452062d) != null) {
            e07.W2(d74Var.f453735e);
            e07.X2(tn4Var.f468134p1.f452062d.f453734d);
            e07.Y2(tn4Var.f468134p1.f452062d.f453736f);
        }
        if ((z3Var == null || z3Var.r2() || !e07.r2()) ? false : true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.o.f230234a.a(g17, str3);
        }
        if (c01.e2.D(g17)) {
            e07.U2();
        }
        if (e07.k2()) {
            e07.mo43621x7650bebc(e07.m124896xfb85f7b0() & (-65));
        }
        java.lang.String str4 = tn4Var.H1;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(e07.D1, str4)) {
            e07.D1 = str4;
            e07.f318114u = true;
            e07.j2();
        }
        e07.G1 = tn4Var.L1;
        e07.f318114u = true;
        e07.m43620x2c62d486(i17);
        java.lang.Object[] objArr2 = new java.lang.Object[24];
        objArr2[0] = g17;
        objArr2[1] = str3;
        objArr2[2] = java.lang.Integer.valueOf((int) e07.E2);
        objArr2[3] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(e07.P0());
        objArr2[4] = e07.U0();
        objArr2[5] = java.lang.Integer.valueOf(e07.F0());
        objArr2[6] = java.lang.Integer.valueOf(e07.m124896xfb85f7b0());
        objArr2[7] = java.lang.Integer.valueOf(tn4Var.f468129m);
        objArr2[8] = java.lang.Integer.valueOf(tn4Var.f468130n);
        objArr2[9] = java.lang.Long.valueOf(e07.c1());
        objArr2[10] = java.lang.Long.valueOf(tn4Var.U1);
        objArr2[11] = java.lang.Long.valueOf(tn4Var.V1);
        objArr2[12] = java.lang.Integer.valueOf(e07.Q);
        objArr2[13] = java.lang.Integer.valueOf(e07.T);
        objArr2[14] = tn4Var.S;
        objArr2[15] = tn4Var.f468145y;
        objArr2[16] = tn4Var.f468148z;
        objArr2[17] = java.lang.Integer.valueOf(e07.m43619x2fa78b11());
        objArr2[18] = e07.D0();
        objArr2[19] = java.lang.Boolean.valueOf(z17);
        objArr2[20] = java.lang.Boolean.valueOf(tn4Var.D1 == null);
        java.lang.String str5 = tn4Var.D1;
        objArr2[21] = java.lang.Integer.valueOf(str5 == null ? 0 : str5.length());
        java.lang.String str6 = tn4Var.D1;
        objArr2[22] = str6 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str6) : "";
        objArr2[23] = java.lang.Integer.valueOf(tn4Var.D);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "processModContact:user[%s,%s] id:%d nick:%s pin:%s delflag:%d type:%d [%d,%d] uitype:%d [%d,%d] contype:%d notify:%d region[%s,%s,%s] src:%d LabelIDList:%s fromGetContactService:%b remark_Description:(%s,%s,%s) verifyFlag:%d", objArr2);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = e07;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var4 = z3Var;
        java.lang.String str7 = str3;
        f230266a.b0(z3Var3, z3Var, tn4Var, bArr, z18);
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(vg3.o4.class)).all()).iterator();
        while (it.hasNext()) {
            ((vg3.o4) ((fs.q) it.next()).get()).b0(z3Var3, z3Var4, tn4Var, bArr, z18);
        }
        com.p314xaae8f345.mm.p670x38b72420.a.d(z3Var3);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n0(g17, com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.c0.a(G, tn4Var.f468121b2));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(z3Var3);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q0(str7, z3Var3);
        }
        f230266a.M(z3Var3, z3Var4, tn4Var, bArr, z18);
        java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(vg3.o4.class)).all()).iterator();
        while (it6.hasNext()) {
            ((vg3.o4) ((fs.q) it6.next()).get()).M(z3Var3, z3Var4, tn4Var, bArr, z18);
        }
        boolean z29 = (z3Var3.m124896xfb85f7b0() & 2048) != 0;
        boolean K = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(z3Var3.d1());
        boolean z37 = (z3Var4 == null || (z3Var4.m124896xfb85f7b0() & 2048) == 0) ? false : true;
        if (!z29 || K) {
            if (!z29 && K) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(z3Var3.d1());
            }
        } else if (!z37) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(z3Var3.d1());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "processModContact end username:%s isSnsBlackContact:%s uctIsTop:%s convIsTop:%s oldIsTop:%s", g17, java.lang.Boolean.valueOf(z3Var3.x2()), java.lang.Boolean.valueOf(z29), java.lang.Boolean.valueOf(K), java.lang.Boolean.valueOf(z37));
    }

    @Override // vg3.w4
    public void a(java.lang.Object obj, r45.b50 b50Var, int i17, byte[] bArr, boolean z17, r45.cx4 cx4Var, vg3.z4 z4Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        int i18 = b50Var.f452063d;
        if (i18 != 2) {
            if (i18 == 4) {
                r45.xb0 xb0Var = (r45.xb0) new r45.xb0().mo11468x92b714fd(bArr);
                java.lang.String g17 = x51.j1.g(xb0Var.f471474d);
                boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(g17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.o.f230234a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.a0 a0Var = f230266a;
                if (R4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "processDelContact user:%s, but not del conv", g17);
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g17, true);
                    a0Var.m1(n18, xb0Var);
                    java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(vg3.o4.class)).all()).iterator();
                    while (it.hasNext()) {
                        ((vg3.o4) ((fs.q) it.next()).get()).m1(n18, xb0Var);
                    }
                    oVar.c(n18);
                    java.util.Set set = c01.e2.f118650a;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) && (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g17, true)) != null) {
                        n17.s3();
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(g17, n17);
                    }
                    ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).wi(g17);
                    vg3.b5.b(4, xb0Var);
                    return;
                }
                boolean z18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2533xb4860a9e.C20208x3c52dcee()) == 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncExtension", "processDelContact user:%s isDelContactDelConv:%s", g17, java.lang.Boolean.valueOf(z18));
                if (z18) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(g17);
                } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(g17)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(g17);
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g17, true);
                a0Var.m1(n19, xb0Var);
                java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(vg3.o4.class)).all()).iterator();
                while (it6.hasNext()) {
                    ((vg3.o4) ((fs.q) it6.next()).get()).m1(n19, xb0Var);
                }
                oVar.c(n19);
                c01.e2.G0(g17);
                vg3.b5.b(4, xb0Var);
                return;
            }
            if (i18 != 17) {
                return;
            }
        }
        r45.tn4 tn4Var = (r45.tn4) new r45.tn4().mo11468x92b714fd(bArr);
        if (!z17) {
            bArr = null;
        }
        b(tn4Var, "", bArr, false, z17, 0);
    }
}
