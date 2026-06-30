package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes11.dex */
public class y2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f180644d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec f180645e;

    public y2() {
        super(0);
    }

    public final void b() {
        java.lang.Runnable runnable;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec = this.f180645e;
        if (c5587xf7a06bec == null || (runnable = c5587xf7a06bec.f273897d) == null) {
            return;
        }
        c5587xf7a06bec.f135910h.f88087a = 1;
        runnable.run();
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.ref.WeakReference weakReference;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec) abstractC20979x809547d1;
        if (!(c5587xf7a06bec instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "mismatched event");
            return false;
        }
        this.f180645e = c5587xf7a06bec;
        am.df dfVar = c5587xf7a06bec.f135909g;
        java.lang.String str = dfVar.f87980b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "action = %s, key = %s", java.lang.Integer.valueOf(dfVar.f87979a), str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        am.df dfVar2 = this.f180645e.f135909g;
        if (dfVar2.f87979a != 15 || (weakReference = dfVar2.f87981c) == null || !(weakReference.get() instanceof android.app.Activity)) {
            return false;
        }
        gm0.j1.n().f354821b.a(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.n2 n2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.n2(str);
        gm0.j1.n().f354821b.g(n2Var);
        this.f180644d = db5.e1.R((android.content.Context) this.f180645e.f135909g.f87981c.get(), ((android.content.Context) this.f180645e.f135909g.f87981c.get()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), ((android.content.Context) this.f180645e.f135909g.f87981c.get()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_b), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.x2(this, n2Var));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        r45.uw5 uw5Var;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        r45.ov3 ov3Var;
        java.lang.String str8;
        r45.d74 d74Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec;
        am.df dfVar;
        java.lang.ref.WeakReference weakReference;
        java.lang.Runnable runnable;
        java.lang.Runnable runnable2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "onSceneEnd errType = " + i17 + ", errCode = " + i18 + ",errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f180644d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f180644d.dismiss();
        }
        if (m1Var == null) {
            b();
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "scene.getType() = %s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
            b();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "scene.getType() = %s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        if (m1Var.mo808xfb85f7b0() == 540) {
            gm0.j1.n().f354821b.q(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c, this);
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.n2) m1Var).f180534e;
            r45.uw5 uw5Var2 = (oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.uw5) fVar;
            if (uw5Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "resp == null");
                b();
                return;
            }
            r45.nv3 nv3Var = uw5Var2.f469230e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "deviceId = %s, deviceType = %s", nv3Var.f463225e, nv3Var.f463224d);
            r45.ov3 ov3Var2 = uw5Var2.f469231f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "AuthKey = %s, BrandName = %s, CloseStrategy = %s, ConnProto = %s, ConnStrategy = %s, Mac = %s", ov3Var2.f464072e, ov3Var2.f464071d, java.lang.Integer.valueOf(ov3Var2.f464076i), ov3Var2.f464074g, java.lang.Integer.valueOf(ov3Var2.f464075h), ov3Var2.f464073f);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.b7 b7Var = uw5Var2.f469234i;
            if (b7Var != null) {
                str2 = b7Var.f452112d;
                if (str2 == null) {
                    str2 = "";
                }
                str3 = b7Var.f452114f;
                if (str3 == null) {
                    str3 = "";
                }
                java.util.LinkedList linkedList2 = b7Var.f452113e;
                if (linkedList2 != null) {
                    linkedList = linkedList2;
                }
            } else {
                str2 = "";
                str3 = str2;
            }
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            if (linkedList.size() > 0) {
                for (int i19 = 0; i19 < linkedList.size(); i19++) {
                    r45.ce6 ce6Var = (r45.ce6) linkedList.get(i19);
                    if (ce6Var.f453043d.contains(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24)) {
                        arrayList.add(ce6Var.f453044e);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "resp.BindTicket = %s", uw5Var2.f469232g);
            if (uw5Var2.f469233h == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("device_scan_mode", "SCAN_CATALOG");
                boolean z17 = ov3Var2.f464074g.contains("3") || ov3Var2.f464074g.contains("1");
                boolean contains = ov3Var2.f464074g.contains("4");
                if (z17 && contains) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Category connect proto can not be blue&wifi at the same time...");
                    return;
                }
                if (z17) {
                    intent.putExtra("device_scan_conn_proto", "blue");
                } else if (contains) {
                    intent.putExtra("device_scan_conn_proto", "wifi");
                }
                intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, nv3Var.f463225e);
                intent.putExtra("device_type", nv3Var.f463224d);
                intent.putExtra("device_title", ov3Var2.f464083s);
                intent.putExtra("device_desc", ov3Var2.f464084t);
                intent.putExtra("device_icon_url", ov3Var2.f464081q);
                intent.putExtra("device_category_id", ov3Var2.f464085u);
                intent.putExtra("device_brand_name", ov3Var2.f464071d);
                intent.putExtra("bind_ticket", uw5Var2.f469232g);
                intent.putExtra("device_ble_simple_proto", ov3Var2.f464088x);
                intent.putExtra("device_airkiss_key", str2);
                intent.putExtra("device_airkiss_title", str3);
                intent.putStringArrayListExtra("device_airkiss_steps", arrayList);
                j45.l.j((android.content.Context) this.f180645e.f135909g.f87981c.get(), "exdevice", ".ui.ExdeviceBindDeviceGuideUI", intent, null);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec2 = this.f180645e;
                if (c5587xf7a06bec2 == null || (runnable2 = c5587xf7a06bec2.f273897d) == null) {
                    return;
                }
                c5587xf7a06bec2.f135910h.f88087a = 2;
                runnable2.run();
                return;
            }
            r45.tn4 tn4Var = uw5Var2.f469229d;
            if (tn4Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "mContact == null");
                b();
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec3 = this.f180645e;
            if (c5587xf7a06bec3 != null && (runnable = c5587xf7a06bec3.f273897d) != null) {
                c5587xf7a06bec3.f135910h.f88087a = 2;
                runnable.run();
            }
            java.lang.String g17 = x51.j1.g(tn4Var.f468122d);
            java.lang.String str9 = tn4Var.Z;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str9 == null) {
                str9 = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "processModContact user is null user:%s enuser:%s", g17, str9);
                str4 = "bind_ticket";
            } else {
                str4 = "bind_ticket";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "processModContact : %s", g17);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g17, true);
                if (n17 == null || !g17.equals(n17.J0())) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(g17);
                    uw5Var = uw5Var2;
                    z3Var.k1(tn4Var.f468119J);
                    str5 = "device_icon_url";
                    z3Var.mo43621x7650bebc(tn4Var.f468129m & tn4Var.f468130n);
                    str6 = "device_desc";
                    str7 = "device_title";
                    z3Var.W1(tn4Var.U1 & tn4Var.V1);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
                        z3Var.K1(str9);
                    } else if (n17 != null && ((int) n17.E2) > 0) {
                        z3Var.K1(n17.J0());
                    }
                    z3Var.E2 = n17 == null ? 0L : (int) n17.E2;
                    z3Var.M1(x51.j1.g(tn4Var.f468123e));
                    z3Var.R1(x51.j1.g(tn4Var.f468124f));
                    z3Var.S1(x51.j1.g(tn4Var.f468125g));
                    z3Var.g3(tn4Var.f468126h);
                    z3Var.M2(tn4Var.f468137s);
                    z3Var.D1(x51.j1.g(tn4Var.f468140v));
                    z3Var.J2(tn4Var.f468141w);
                    z3Var.Z2(tn4Var.B);
                    z3Var.c3(com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(tn4Var.S, tn4Var.f468145y, tn4Var.f468148z));
                    z3Var.h3(tn4Var.A);
                    z3Var.Z1(tn4Var.D);
                    z3Var.o3(tn4Var.E);
                    z3Var.j3(tn4Var.G);
                    z3Var.a2(tn4Var.M);
                    z3Var.b2(tn4Var.L);
                    if (c01.e2.Y(tn4Var.H)) {
                        z3Var.p3(tn4Var.H);
                    }
                    z3Var.K2((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                    z3Var.n1(x51.j1.g(tn4Var.f468132p));
                    z3Var.o1(x51.j1.g(tn4Var.f468136r));
                    z3Var.p1(x51.j1.g(tn4Var.f468135q));
                    z3Var.d3(tn4Var.D1);
                    z3Var.e3(tn4Var.E1);
                    if (n17 != null) {
                        java.lang.String str10 = n17.f318124z1;
                        if (str10 == null) {
                            str10 = "";
                        }
                        java.lang.String str11 = tn4Var.E1;
                        if (str11 == null) {
                            str11 = "";
                        }
                        if (!str10.equals(str11)) {
                            com.p314xaae8f345.mm.vfs.w6.h(i21.q.h().b(g17));
                        }
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().j(g17);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.d1())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "dkinit dealModContactExtInfo failed invalid contact");
                        ov3Var = ov3Var2;
                        str8 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030;
                    } else {
                        java.lang.String d17 = z3Var.d1();
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
                        com.p314xaae8f345.mm.p943x351df9c2.g.e(d17, tn4Var, z3Var);
                        r45.cb6 cb6Var = tn4Var.R;
                        if (z3Var.d1().endsWith("@chatroom") || cb6Var == null) {
                            ov3Var = ov3Var2;
                            str8 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsFlag modcontact " + cb6Var.f452961d + " " + tn4Var.f468122d);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SnsBg modcontact ");
                            sb6.append(cb6Var.f452962e);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", sb6.toString());
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SnsBgId modcontact ");
                            ov3Var = ov3Var2;
                            str8 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030;
                            sb7.append(cb6Var.f452963f);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", sb7.toString());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsBgId modcontact " + cb6Var.f452964g);
                            if (p94.w0.c() != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).z1(z3Var.d1(), cb6Var);
                            }
                        }
                        java.lang.String r17 = c01.z1.r();
                        if (r17 != null && !r17.equals(d17)) {
                            dm.h1 h1Var = (dm.h1) ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Ai(d17);
                            h1Var.f66748xdec927b = d17;
                            h1Var.f66736x6bad7fc0 = tn4Var.V;
                            r45.va0 va0Var = tn4Var.W;
                            if (va0Var != null) {
                                h1Var.f66733x6baace8e = va0Var.f469554d;
                                h1Var.f66735x6bac33d0 = va0Var.f469556f;
                                h1Var.f66734xea1bd3d4 = va0Var.f469557g;
                                h1Var.f66740x26b3182a = va0Var.f469555e;
                                h1Var.f66731x4b3625c7 = null;
                                h1Var.f66742x48b98940 = 0L;
                            }
                            rv.t2 t2Var = (rv.t2) h1Var;
                            if (!((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(t2Var)) {
                                ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Bi(t2Var);
                            }
                            z3Var.D2(h1Var.f66746x2262335f);
                        }
                    }
                    z3Var.z1(tn4Var.C1);
                    r45.b5 b5Var = tn4Var.f468134p1;
                    if (b5Var != null && (d74Var = b5Var.f452062d) != null) {
                        z3Var.W2(d74Var.f453735e);
                        z3Var.X2(tn4Var.f468134p1.f452062d.f453734d);
                        z3Var.Y2(tn4Var.f468134p1.f452062d.f453736f);
                    }
                    if (c01.e2.D(g17)) {
                        z3Var.U2();
                    }
                    if (z3Var.k2()) {
                        z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() & (-65));
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(z3Var);
                    } else {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q0(str9, z3Var);
                    }
                    if (n17 != null && (n17.m124896xfb85f7b0() & 2048) != (z3Var.m124896xfb85f7b0() & 2048)) {
                        if ((z3Var.m124896xfb85f7b0() & 2048) != 0) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(z3Var.d1());
                        } else {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(z3Var.d1());
                        }
                    }
                    java.lang.String g18 = x51.j1.g(tn4Var.f468122d);
                    c5587xf7a06bec = this.f180645e;
                    if (c5587xf7a06bec != null || (dfVar = c5587xf7a06bec.f135909g) == null || (weakReference = dfVar.f87981c) == null || weakReference.get() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "a8KeyRedirectEvent null");
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g18, true);
                    if (n18 != null) {
                        r45.ov3 ov3Var3 = ov3Var;
                        if (ov3Var3.f464087w == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Jump to ContactInfoUI.");
                            android.content.Intent intent2 = new android.content.Intent();
                            intent2.putExtra("Contact_User", g18);
                            intent2.putExtra("KIsHardDevice", true);
                            intent2.putExtra("KHardDeviceBindTicket", uw5Var.f469232g);
                            intent2.putExtra(str8, nv3Var.f463225e);
                            intent2.putExtra("device_type", nv3Var.f463224d);
                            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent2, (android.content.Context) this.f180645e.f135909g.f87981c.get());
                            return;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Jump to DeviceProfileUI.");
                        android.content.Context context = (android.content.Context) this.f180645e.f135909g.f87981c.get();
                        android.content.Intent intent3 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13465x3d3dbc1e.class);
                        if (!(context instanceof android.app.Activity)) {
                            intent3.addFlags(268435456);
                        }
                        intent3.putExtra(str8, nv3Var.f463225e);
                        intent3.putExtra("device_type", nv3Var.f463224d);
                        intent3.putExtra("device_mac", ov3Var3.f464073f);
                        intent3.putExtra("device_brand_name", ov3Var3.f464071d);
                        intent3.putExtra("device_alias", ov3Var3.f464080p);
                        intent3.putExtra(str6, ov3Var3.f464084t);
                        intent3.putExtra(str7, ov3Var3.f464083s);
                        intent3.putExtra(str5, ov3Var3.f464081q);
                        intent3.putExtra("device_jump_url", ov3Var3.f464082r);
                        intent3.putExtra(str4, uw5Var.f469232g);
                        intent3.putExtra("device_has_bound", com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().d1(n18.d1(), nv3Var.f463225e) != null);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent3);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/model/SearchDeviceGetA8KeyRedirectListener", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(context, "com/tencent/mm/plugin/exdevice/model/SearchDeviceGetA8KeyRedirectListener", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "cat's replace user with stranger");
            }
            uw5Var = uw5Var2;
            str7 = "device_title";
            ov3Var = ov3Var2;
            str8 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030;
            str6 = "device_desc";
            str5 = "device_icon_url";
            java.lang.String g182 = x51.j1.g(tn4Var.f468122d);
            c5587xf7a06bec = this.f180645e;
            if (c5587xf7a06bec != null) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "a8KeyRedirectEvent null");
        }
    }
}
