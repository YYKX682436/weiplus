package po3;

/* loaded from: classes9.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j {
    public static boolean A(java.lang.String str) {
        return !(com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(str)) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public boolean b(java.lang.String str, long j17) {
        return pt0.f0.Li(str, j17).m124847x74d37ac6() != 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public java.util.ArrayList e(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
        if (f9Var == null) {
            return null;
        }
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        final java.lang.String str = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7;
        if (cj6.Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            arrayList = new java.util.ArrayList(ot0.c3.l().e("getAllNeedResendMsg", new yz5.a(str) { // from class: com.tencent.mm.storage.g9$$j4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return new java.util.ArrayList(ot0.z2.f430355a.s(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7));
                }
            }, new yz5.a(str) { // from class: com.tencent.mm.storage.g9$$k4
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    android.database.Cursor D = g9Var.f275522r.D(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, null, "createTime>=? AND status=? AND isSend=?", new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 172800000), java.lang.String.valueOf(5), java.lang.String.valueOf(1)}, null, null, "createTime ASC", 2);
                    while (D.moveToNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var2.mo9015xbf5d97fd(D);
                        if (((!((f9Var2.F & 32) > 0)) & true) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(f9Var2.Q0()) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(f9Var2.Q0()) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(f9Var2.Q0()) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(f9Var2.Q0())) {
                            arrayList2.add(f9Var2);
                        }
                    }
                    D.close();
                    return new java.util.ArrayList(arrayList2);
                }
            }));
        } else if (cj6.Pb(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            arrayList = ot0.z2.f430355a.s(cj6.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        } else {
            arrayList = new java.util.ArrayList();
            android.database.Cursor D = cj6.f275522r.D(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, null, "createTime>=? AND status=? AND isSend=?", new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 172800000), java.lang.String.valueOf(5), java.lang.String.valueOf(1)}, null, null, "createTime ASC", 2);
            while (D.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var2.mo9015xbf5d97fd(D);
                if (((!((f9Var2.F & 32) > 0)) & true) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(f9Var2.Q0()) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(f9Var2.Q0()) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(f9Var2.Q0()) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(f9Var2.Q0())) {
                    arrayList.add(f9Var2);
                }
            }
            D.close();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var3.m124847x74d37ac6(), f9Var3.Q0()));
        }
        return arrayList2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public java.lang.String f(int i17) {
        return this.f233979d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hac, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public long g(java.lang.Object obj) {
        return ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).m124847x74d37ac6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 h(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
        return new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var.m124847x74d37ac6(), f9Var.Q0());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public java.lang.String i(int i17, int i18, int i19) {
        android.content.Context context = this.f233979d;
        return i19 <= 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbi, java.lang.Integer.valueOf(i18)) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbh, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public java.lang.String j(int i17, int i18, int i19) {
        return this.f233979d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbl, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public java.lang.String k(int i17, int i18) {
        return this.f233979d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbk, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public int l() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public void n(java.util.ArrayList arrayList) {
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendNormalMsgFailNotificaiton", "omitAllFailMsgImpl account no initialized");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u();
        l75.k0 k0Var = g9Var.f275522r;
        long b17 = k0Var.b();
        try {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it.next();
                java.lang.String a17 = c16564xb55e1d5.a();
                long j17 = c16564xb55e1d5.f231013d;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(a17, j17);
                Li.l1(Li.F | 32);
                c16564xb55e1d5.m66995x9616526c();
                g9Var.lb(j17, Li, true);
            }
        } finally {
            k0Var.w(java.lang.Long.valueOf(b17));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendNormalMsgFailNotificaiton", "onNotificationClick, mMsgList.size:%d", java.lang.Integer.valueOf(this.f233976a.b()));
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendNormalMsgFailNotificaiton", "account not ready.");
            return;
        }
        int b17 = this.f233976a.b();
        android.content.Context context = this.f233979d;
        if (b17 > 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            intent.putExtra("From_fail_notify", true);
            j45.l.u(context, "com.tencent.mm.ui.LauncherUI", intent, null);
            return;
        }
        if (this.f233976a.b() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) this.f233976a.f233986a.get(0);
            java.lang.String Q0 = pt0.f0.Li(c16564xb55e1d5.a(), c16564xb55e1d5.f231013d).Q0();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Main_User", Q0);
            intent2.putExtra("From_fail_notify", true);
            intent2.addFlags(67108864);
            intent2.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            j45.l.u(context, "com.tencent.mm.ui.LauncherUI", intent2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public void v(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new po3.j(this, j17, pt0.f0.Li(str, j17)));
    }
}
