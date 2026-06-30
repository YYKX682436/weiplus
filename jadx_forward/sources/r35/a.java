package r35;

/* loaded from: classes11.dex */
public class a implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public r45.dz3 E;
    public r45.hy6 F;
    public r35.d4 G;
    public java.util.Map I;

    /* renamed from: d, reason: collision with root package name */
    public ns.e f450539d;

    /* renamed from: e, reason: collision with root package name */
    public ns.f f450540e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f450541f;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f450544i;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p755xc3c3c8ee.p756x316220.C10636x7e6467b7 f450546n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f450548p;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f450552t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f450553u;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f450547o = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f450549q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f450550r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f450551s = "";

    /* renamed from: v, reason: collision with root package name */
    public boolean f450554v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f450555w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f450556x = true;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f450557y = "";

    /* renamed from: z, reason: collision with root package name */
    public boolean f450558z = false;
    public java.lang.String A = "";
    public int B = 0;
    public int C = 0;
    public java.lang.String D = "";
    public java.lang.String H = "";

    /* renamed from: J, reason: collision with root package name */
    public final java.util.List f450538J = new java.util.LinkedList();
    public boolean K = false;
    public java.lang.String L = "";
    public long M = 0;
    public long N = 0;
    public final java.lang.String P = "";
    public final java.lang.String Q = "";
    public final java.lang.String R = "";

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f450543h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f450545m = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f450542g = null;

    public a(android.content.Context context, ns.e eVar) {
        this.f450541f = context;
        this.f450539d = eVar;
    }

    public static boolean h(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3 m3Var, r45.ny6 ny6Var) {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_stranger_bad_man_error_dialog_show_switch, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "isSupportStrangerBadManDialogShow() swt:%s", java.lang.Integer.valueOf(Ni));
        if (!(Ni == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "needShowDialog, isSupportStrangerBadManDialogShow is 0.");
            return false;
        }
        if (ny6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "needShowDialog, verifyUserSpamInfo is null.");
            return false;
        }
        if (m3Var.f270913g != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "needShowDialog, is not MM_VERIFYUSER_ADDCONTACT.");
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ny6Var.f463302f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ny6Var.f463301e)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "needShowDialog, key word is null.");
        return false;
    }

    public static boolean i(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3 m3Var) {
        if (!(m3Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3)) {
            return false;
        }
        r45.my6 my6Var = (r45.my6) m3Var.f270911e.f152244b.f152233a;
        if (my6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "needShowErrorDialog, response is null.");
            return false;
        }
        if (m3Var.f270913g == 1) {
            return h(m3Var, my6Var.f462465f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "needShowErrorDialog, MM_VERIFYUSER_ADDCONTACT is not.");
        return false;
    }

    public void a(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList) {
        this.f450551s = str2;
        b(str, linkedList, false, "");
    }

    public void b(java.lang.String str, java.util.LinkedList linkedList, boolean z17, java.lang.String str2) {
        iz5.a.g(null, str != null && str.length() > 0);
        iz5.a.g(null, linkedList != null);
        this.f450554v = z17;
        this.f450547o = str2;
        this.f450544i = linkedList;
        this.f450543h.add(str);
        this.f450550r = str;
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(r4.f450541f, r5, r6, r7) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            android.content.Context r0 = r4.f450541f
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L1a
            java.lang.Class<en.k> r0 = en.k.class
            i95.m r0 = i95.n0.c(r0)
            en.k r0 = (en.k) r0
            android.content.Context r1 = r4.f450541f
            en.a r0 = (en.a) r0
            boolean r0 = r0.Zi(r1, r5, r6, r7)
            if (r0 == 0) goto L1a
            goto La8
        L1a:
            tm.a r0 = tm.a.b(r7)
            if (r0 == 0) goto L2a
            java.lang.String r1 = r0.f501932b
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r1 != 0) goto L2a
            java.lang.String r7 = r0.f501932b
        L2a:
            boolean r1 = r4.f450558z
            if (r1 == 0) goto L3d
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r1 != 0) goto L3d
            android.content.Context r5 = r4.f450541f
            java.lang.String r6 = ""
            db5.e1.s(r5, r7, r6)
            goto La8
        L3d:
            r1 = 4
            r2 = 1
            if (r5 != r1) goto L56
            r3 = -22
            if (r6 != r3) goto L56
            android.content.Context r5 = r4.f450541f
            r6 = 2131755232(0x7f1000e0, float:1.9141337E38)
            java.lang.String r6 = r5.getString(r6)
            android.widget.Toast r5 = dp.a.m125854x26a183b(r5, r6, r2)
            r5.show()
            goto La8
        L56:
            if (r5 != r1) goto L98
            r5 = -24
            if (r6 == r5) goto L60
            r5 = -20604(0xffffffffffffaf84, float:NaN)
            if (r6 != r5) goto L98
        L60:
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r5 != 0) goto L98
            if (r0 == 0) goto L8e
            java.lang.String r5 = r0.f501932b
            boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)
            if (r6 != 0) goto La8
            int r6 = r0.f501933c
            if (r6 != r1) goto L84
            tm.j r6 = r0.f501937g
            if (r6 == 0) goto L84
            int r6 = r6.f501972d
            if (r6 != r2) goto L84
            cm5.c r5 = cm5.c.f124959a
            android.content.Context r6 = r4.f450541f
            r5.b(r6, r0)
            goto La8
        L84:
            android.content.Context r6 = r4.f450541f
            android.widget.Toast r5 = dp.a.m125854x26a183b(r6, r5, r2)
            r5.show()
            goto La8
        L8e:
            android.content.Context r5 = r4.f450541f
            android.widget.Toast r5 = dp.a.m125854x26a183b(r5, r7, r2)
            r5.show()
            goto La8
        L98:
            android.content.Context r5 = r4.f450541f
            r6 = 2131755231(0x7f1000df, float:1.9141335E38)
            java.lang.String r6 = r5.getString(r6)
            android.widget.Toast r5 = dp.a.m125854x26a183b(r5, r6, r2)
            r5.show()
        La8:
            java.lang.String r5 = r4.f450550r
            java.lang.String r6 = r4.f450557y
            r7 = 0
            r4.f(r7, r7, r5, r6)
            r4.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r35.a.c(int, int, java.lang.String):void");
    }

    public final void d() {
        gm0.j1.n().f354821b.a(30, this);
        gm0.j1.n().f354821b.a(ma1.a.f72799x366c91de, this);
        if (this.f450555w) {
            android.content.Context context = this.f450541f;
            this.f450542g = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f450541f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bbj), true, true, new r35.b(this));
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) this.f450543h.getFirst())) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3 m3Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3(1, this.f450543h, this.f450544i, this.f450545m, this.H, this.f450549q, this.I, this.f450551s, this.f450547o, this.L, this.f450538J);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f450552t)) {
                m3Var.U(this.f450552t, this.f450553u);
            }
            m3Var.T(this.A);
            m3Var.V(this.B);
            m3Var.P(this.F);
            int i17 = this.C;
            com.p314xaae8f345.mm.p944x882e457a.o oVar = m3Var.f270911e;
            java.util.Iterator it = ((r45.ly6) oVar.f152243a.f152217a).f461515f.iterator();
            while (it.hasNext()) {
                ((r45.gy6) it.next()).f457197u = i17;
            }
            java.lang.String str = this.D;
            java.util.Iterator it6 = ((r45.ly6) oVar.f152243a.f152217a).f461515f.iterator();
            while (it6.hasNext()) {
                ((r45.gy6) it6.next()).f457198v = str;
            }
            m3Var.S(this.f450556x);
            m3Var.R(this.E);
            m3Var.Q(this.M);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "[AddFriendVerifyRecordToCloud] addContact: mClientMsgId=%d", java.lang.Long.valueOf(this.M));
            gm0.j1.n().f354821b.g(m3Var);
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p755xc3c3c8ee.p756x316220.C10636x7e6467b7 c10636x7e6467b7 = this.f450546n;
        l41.o oVar2 = new l41.o((java.lang.String) this.f450543h.getFirst(), this.f450545m.isEmpty() ? "" : (java.lang.String) this.f450545m.getFirst(), c10636x7e6467b7 == null ? null : c10636x7e6467b7.f148853f);
        long j17 = this.M;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.String str2 = this.P;
        java.lang.String str3 = this.Q;
        java.lang.String str4 = this.R;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "setClientMsgIdWithExtInfo: clientMsgId=%s, openImCustomInfo=%s, openImAppId=%s, descWordingId=%s", valueOf, str2, str3, str4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "setClientMsgId: %s", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p944x882e457a.o oVar3 = oVar2.f397416e;
        ((r45.q4) oVar3.f152243a.f152217a).f465187h = java.lang.String.valueOf(j17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str2 != null && !str2.isEmpty()) {
            r45.k15 k15Var = new r45.k15();
            k15Var.f459845d = "openImCustomInfo";
            k15Var.f459846e = str2;
            arrayList.add(k15Var);
        }
        if (str3 != null && !str3.isEmpty()) {
            r45.k15 k15Var2 = new r45.k15();
            k15Var2.f459845d = "openImAppId";
            k15Var2.f459846e = str3;
            arrayList.add(k15Var2);
        }
        if (str4 != null && !str4.isEmpty()) {
            r45.k15 k15Var3 = new r45.k15();
            k15Var3.f459845d = "descWordingId";
            k15Var3.f459846e = str4;
            arrayList.add(k15Var3);
        }
        if (!arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "setMsgExtInfo: size=%s", java.lang.Integer.valueOf(arrayList.size()));
            r45.q4 q4Var = (r45.q4) oVar3.f152243a.f152217a;
            if (!arrayList.isEmpty()) {
                q4Var.f465188i = new java.util.LinkedList(arrayList);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "setClientMsgIdWithExtInfo: extInfo set, size=%s", java.lang.Integer.valueOf(arrayList.size()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "[AddFriendVerifyRecordToCloud] addContact isOpenIM: client msg id = %d, openImCustomInfo=%s openImAppId=%s descWordingId=%s", java.lang.Long.valueOf(this.M), str2, str3, str4);
        gm0.j1.n().f354821b.g(oVar2);
    }

    public final void e() {
        r35.d4 d4Var = this.G;
        if (d4Var != null) {
            d4Var.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "errorFinishAddContact.");
        }
    }

    public final void f(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        ns.e eVar = this.f450539d;
        if (eVar != null) {
            eVar.a(z17, z18, str, str2);
        }
        if (z17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5710xe74f28d8 c5710xe74f28d8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5710xe74f28d8();
            c5710xe74f28d8.f136030g.f89635a = str;
            c5710xe74f28d8.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        if (r4 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.p314xaae8f345.mm.p2621x8fb0427b.z3 r4, final java.lang.String r5, final java.lang.String r6, int r7) {
        /*
            r3 = this;
            if (r4 == 0) goto L8
            java.lang.String r4 = r4.F1
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r4 != 0) goto La
        L8:
            java.lang.String r4 = ""
        La:
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r6, r4}
            java.lang.String r1 = "MicroMsg.AddContact"
            java.lang.String r2 = "handleContactWithTicket userName:%s roomId:%s ticket:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L24
            r3.m(r4)
            java.util.LinkedList r4 = r3.f450544i
            r3.a(r5, r6, r4)
            goto L42
        L24:
            c01.p8 r4 = c01.n8.a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r7 == 0) goto L38
            r7.intValue()
            int r7 = r7.intValue()
            int r0 = r0 + r7
        L38:
            r35.a$$c r7 = new r35.a$$c
            r7.<init>()
            c01.k7 r4 = (c01.k7) r4
            r4.g(r5, r6, r0, r7)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r35.a.g(com.tencent.mm.storage.z3, java.lang.String, java.lang.String, int):void");
    }

    public final void j(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.n nVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f450542g;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f450542g = null;
        }
        gm0.j1.n().f354821b.q(30, this);
        gm0.j1.n().f354821b.q(ma1.a.f72799x366c91de, this);
        this.K = false;
        tm.a b17 = tm.a.b(str);
        java.lang.String str3 = (b17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f501932b)) ? str : b17.f501932b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "onLocalSceneEnd errType=%d, errCode=%d, errMsg=%s, scene=%s, errorCtx=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), str2);
        if (m1Var.mo808xfb85f7b0() == 667) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((l41.o) m1Var).f397416e;
            this.N = (oVar == null || (nVar = oVar.f152244b) == null) ? 0L : ((r45.r4) nVar.f152233a).f466049d;
        } else if (m1Var.mo808xfb85f7b0() == 30) {
            this.N = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).K();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "onLocalSceneEnd mServerMsgId = %d", java.lang.Long.valueOf(this.N));
        if (m1Var.mo808xfb85f7b0() == 667) {
            boolean z17 = (i17 == 0 && i18 == 0) || i18 == -44;
            com.p314xaae8f345.mm.p689xc5a27af6.p755xc3c3c8ee.p756x316220.C10636x7e6467b7 c10636x7e6467b7 = this.f450546n;
            int i19 = c10636x7e6467b7 != null && !android.text.TextUtils.isEmpty(c10636x7e6467b7.f148852e) ? 4 : 3;
            int i27 = z17 ? 1 : 2;
            com.p314xaae8f345.mm.p689xc5a27af6.p755xc3c3c8ee.p756x316220.C10636x7e6467b7 c10636x7e6467b72 = this.f450546n;
            cb0.a.a(i19, i27, c10636x7e6467b72 != null ? c10636x7e6467b72.f148851d : 0);
        }
        if (i17 == 0 && i18 == 0) {
            if (m1Var.mo808xfb85f7b0() == 30) {
                this.f450550r = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).J();
            } else if (m1Var.mo808xfb85f7b0() == 667) {
                this.f450550r = ((l41.o) m1Var).f397417f;
            }
            f(true, false, this.f450550r, this.f450557y);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[7];
            objArr[0] = this.f450552t;
            objArr[1] = 1;
            objArr[2] = 0;
            objArr[3] = 0;
            objArr[4] = java.lang.Integer.valueOf(this.f450544i.size() > 0 ? ((java.lang.Integer) this.f450544i.getLast()).intValue() : 0);
            objArr[5] = 1;
            objArr[6] = 0;
            g0Var.d(18713, objArr);
            return;
        }
        if (i18 == -44) {
            java.lang.String str4 = this.f450557y;
            ns.f fVar = this.f450540e;
            if (fVar != null) {
                if (fVar.a(this.f450550r, str4, this.f450545m.isEmpty() ? "" : (java.lang.String) this.f450545m.getFirst(), i18, str2)) {
                    f(false, false, this.f450550r, str4);
                    return;
                }
            }
            l();
            return;
        }
        if (i18 == -4000) {
            java.lang.String str5 = this.f450557y;
            ns.f fVar2 = this.f450540e;
            if (fVar2 != null) {
                if (fVar2.a(this.f450550r, str5, this.f450545m.isEmpty() ? "" : (java.lang.String) this.f450545m.getFirst(), i18, str2)) {
                    f(false, false, this.f450550r, str5);
                    return;
                }
            }
            l();
            return;
        }
        if (i18 == -87) {
            android.content.Context context = this.f450541f;
            db5.e1.G(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572486bc5), "", false, new android.content.DialogInterface.OnClickListener() { // from class: r35.a$$a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i28) {
                    r35.a aVar = r35.a.this;
                    aVar.f(false, false, aVar.f450550r, aVar.f450557y);
                    aVar.e();
                }
            });
            return;
        }
        if (i18 == -101 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            db5.e1.G(this.f450541f, str3, "", false, new r35.g(this));
            return;
        }
        if (i18 == -2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                c(i17, i18, null);
                return;
            } else {
                android.content.Context context2 = this.f450541f;
                db5.e1.E(context2, str3, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f450541f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), false, new android.content.DialogInterface.OnClickListener() { // from class: r35.a$$b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i28) {
                        r35.a aVar = r35.a.this;
                        aVar.f(false, false, aVar.f450550r, aVar.f450557y);
                        aVar.e();
                    }
                });
                return;
            }
        }
        if (i18 != -160) {
            c(i17, i18, str);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            c(i17, i18, str);
        } else {
            android.content.Context context3 = this.f450541f;
            db5.e1.A(context3, str3, "", context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq), this.f450541f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new r35.h(this), null);
        }
    }

    public void k(android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str, java.util.LinkedList linkedList) {
        this.f450544i = linkedList;
        if (this.f450545m == null) {
            this.f450545m = new java.util.LinkedList();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "sendRequestImmediateAddContact, userName: %s.", str);
        if (linkedList != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "sendRequestImmediateAddContact, lstScene.size: %s.", java.lang.Integer.valueOf(linkedList.size()));
        }
        if (z3Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "sendRequestImmediateAddContact, contact getUsername: %s, getAntiSpamTicket: %s.", z3Var.d1(), z3Var.F1);
        }
        java.lang.String stringExtra = activity.getIntent().getStringExtra("room_name");
        int intExtra = activity.getIntent().getIntExtra("Contact_Scene", 0);
        java.lang.String stringExtra2 = activity.getIntent().getStringExtra("AntispamTicket");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "sendRequestImmediateAddContact, roomId = %s.", stringExtra);
        if (!android.text.TextUtils.isEmpty(stringExtra2)) {
            m(stringExtra2);
            a(str, stringExtra, linkedList);
        } else if (android.text.TextUtils.isEmpty(stringExtra)) {
            g(z3Var, str, stringExtra, intExtra);
        } else if (android.text.TextUtils.isEmpty(this.f450549q)) {
            g(z3Var, str, stringExtra, intExtra);
        } else {
            a(str, stringExtra, linkedList);
        }
    }

    public final void l() {
        r35.e4 e4Var = new r35.e4(this.f450541f, new r35.i(this));
        java.lang.String str = this.f450548p;
        if (str != null) {
            e4Var.f450632v = str;
        }
        if (this.f450554v) {
            e4Var.g(this.f450543h, this.f450544i);
        } else {
            e4Var.f(this.f450543h, this.f450544i, this.f450545m);
        }
    }

    public void m(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f450545m.add(str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "onSceneEnd, errType = " + i17 + ", errCode = " + i18 + "," + str);
        if (m1Var.mo808xfb85f7b0() != 30 && m1Var.mo808xfb85f7b0() != 667) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AddContact", "not expected scene,  type = " + m1Var.mo808xfb85f7b0());
            return;
        }
        boolean z17 = m1Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3;
        if (z17 && ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).f270913g != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddContact", "not opcode addcontact!");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f450542g;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f450542g = null;
        }
        if (z17) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3 m3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var;
            r45.my6 my6Var = (r45.my6) m3Var.f270911e.f152244b.f152233a;
            if (this.K) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "needShowDialog, isShowErrorDialog.");
                return;
            }
            if (my6Var != null && h(m3Var, my6Var.f462465f)) {
                java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
                android.app.Activity activity = j17 != null ? (android.app.Activity) j17.get() : null;
                if (activity != null) {
                    db5.i3 i3Var = new db5.i3(activity);
                    i3Var.L.setText(my6Var.f462465f.f463301e);
                    i3Var.M.setText(my6Var.f462465f.f463302f);
                    i3Var.N.setOnClickListener(new r35.e(this, i3Var, i17, i18, str, m1Var, my6Var));
                    r35.d dVar = new r35.d(this, i3Var);
                    i3Var.P.setOnClickListener(dVar);
                    android.view.View view = i3Var.G;
                    if (view != null) {
                        view.setOnClickListener(dVar);
                    }
                    r35.c cVar = new r35.c(this, my6Var);
                    android.widget.TextView textView = i3Var.Q;
                    textView.setOnClickListener(cVar);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(my6Var.f462465f.f463303g)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHalfBottomDialog", "hideLinkTips");
                        textView.setVisibility(4);
                    }
                    i3Var.C();
                    this.K = true;
                    r35.d4 d4Var = this.G;
                    if (d4Var != null) {
                        d4Var.a();
                    }
                    i3Var.l(new r35.f(this));
                    return;
                }
            }
        }
        j(i17, i18, str, m1Var, null);
    }
}
