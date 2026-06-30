package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class e2 extends l75.n0 implements p94.j0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f247502g = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2.f247498p1, "snsExtInfo3")};

    /* renamed from: d, reason: collision with root package name */
    public boolean f247503d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f247504e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i1 f247505f;

    public e2(l75.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i1 i1Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2.f247498p1, "snsExtInfo3", null);
        boolean z17 = false;
        this.f247503d = false;
        this.f247505f = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryAddDBCol", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        android.database.Cursor f17 = k0Var.f("PRAGMA table_info( snsExtInfo3 )", null, 2);
        int columnIndex = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        boolean z18 = false;
        boolean z19 = false;
        boolean z27 = false;
        while (f17.moveToNext()) {
            if (columnIndex >= 0) {
                java.lang.String string = f17.getString(columnIndex);
                z17 = "imBGaeskey".equalsIgnoreCase(string) ? true : z17;
                z18 = "imBGauthkey".equalsIgnoreCase(string) ? true : z18;
                z19 = "imBGmd5sum".equalsIgnoreCase(string) ? true : z19;
                if ("imBGfileid".equalsIgnoreCase(string)) {
                    z27 = true;
                }
            }
        }
        f17.close();
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (!z17) {
            k0Var.A("snsExtInfo3", "Alter table snsExtInfo3 add imBGaeskey STRING");
        }
        if (!z18) {
            k0Var.A("snsExtInfo3", "Alter table snsExtInfo3 add imBGauthkey STRING");
        }
        if (!z19) {
            k0Var.A("snsExtInfo3", "Alter table snsExtInfo3 add imBGmd5sum STRING");
        }
        if (!z27) {
            k0Var.A("snsExtInfo3", "Alter table snsExtInfo3 add imBGfileid STRING");
        }
        k0Var.w(java.lang.Long.valueOf(F));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryAddDBCol", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        this.f247504e = k0Var;
        this.f247505f = i1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsExtStorage", "createExtStorage " + k0Var + "  " + java.lang.Thread.currentThread().getId());
    }

    public boolean C1(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = J0(str);
        int i17 = J0.f67941x2931f7f0;
        J0.f67941x2931f7f0 = z17 ? i17 | 1 : i17 & (-2);
        u1(J0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return true;
    }

    public void D0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("detchCache", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        this.f247503d = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o5 o5Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o5) this.f247505f;
        o5Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pushAll", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m5(o5Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushAll", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("detchCache", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i1 i1Var = this.f247505f;
        if (i1Var != null && this.f247503d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o5 o5Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o5) i1Var;
            o5Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExt", "com.tencent.mm.plugin.sns.model.SnsExtCache");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 d2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2) o5Var.f246082a.get(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExt", "com.tencent.mm.plugin.sns.model.SnsExtCache");
            if (d2Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                return d2Var2;
            }
            d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2();
        }
        d2Var.f67957xdde069b = str;
        super.get(d2Var, m145254xa242f8f3());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return d2Var;
    }

    public boolean K1(java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = J0(str);
        int i19 = J0.f67941x2931f7f0 | 4096;
        int i27 = (J0.u0() != null ? J0.u0().f452964g : 0) | 4096;
        int i28 = z17 ? 4320 : -1;
        if (z18) {
            i28 = 72;
        }
        if (z27) {
            i28 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf;
        }
        if (z19) {
            i17 = i19 | 2048;
            i18 = i27 | 2048;
        } else {
            i17 = i19 & (-2049);
            i18 = i27 & (-2049);
        }
        J0.f67941x2931f7f0 = i17;
        r45.cb6 u07 = J0.u0();
        if (u07 != null) {
            u07.f452964g = i18;
            u07.f452965h = i28;
            J0.w0(u07);
        }
        u1(J0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return true;
    }

    public r45.k53 L0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFault", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markFaultEnter", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        java.lang.String u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().u("Anr.SnsFaultKey", "");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_fix_fault_oom_error, 1) == 1;
        if (!android.text.TextUtils.isEmpty(u17) && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsExtStorage", "delete username:%s", u17);
            z0(u17);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().D("Anr.SnsFaultKey", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFaultEnter", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        r45.k53 k53Var = new r45.k53();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = J0(str);
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(J0.f67940xf96f3956)) {
                k53Var = (r45.k53) new r45.k53().mo11468x92b714fd(J0.f67940xf96f3956);
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsExtStorage", "parser field_faultS error");
        }
        if (k53Var == null) {
            k53Var = new r45.k53();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markFaultOut", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().D("Anr.SnsFaultKey", "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFaultOut", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFault", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return k53Var;
    }

    public r45.cb6 P0(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        r45.cb6 u07 = J0(str).u0();
        if (u07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsExtStorage", "userinfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return null;
        }
        int i17 = u07.f452964g;
        u07.f452964g = z17 ? i17 | 1 : i17 & (-2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return u07;
    }

    public void P1(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSnsYearMonthInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsExtStorage", "updateSnsYearMonthInfo info is null");
            list = new java.util.ArrayList();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsExtStorage", "updateSnsYearMonthInfo size:%s", java.lang.Integer.valueOf(list.size()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = J0(str);
        r45.bb6 v07 = J0.v0();
        java.util.LinkedList linkedList = v07.f452193d;
        linkedList.clear();
        linkedList.addAll(list);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        try {
            J0.f67955x5c28f19e = v07.mo14344x5f01b1f6();
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        u1(J0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSnsYearMonthInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    public r45.cb6 W0(java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        r45.cb6 u07 = J0(str).u0();
        if (u07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsExtStorage", "userinfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return null;
        }
        int i17 = u07.f452964g | 4096;
        int i18 = z17 ? 4320 : -1;
        if (z18) {
            i18 = 72;
        }
        if (z27) {
            i18 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf;
        }
        u07.f452964g = z19 ? i17 | 2048 : i17 & (-2049);
        u07.f452965h = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return u07;
    }

    public r45.cb6 b1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsUserInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        r45.cb6 u07 = J0(str).u0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsUserInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return u07;
    }

    public int d1(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = J0(str);
        J0.f67937x79146e34 = str2;
        J0.f67949xff3c52b4 = i17;
        J0.f67948xff347167 = i18;
        super.mo11260x413cb2b4(J0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return 0;
    }

    public int f1(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = J0(str);
        J0.f67951x4b6e68b9 = str2;
        J0.f67949xff3c52b4 = i17;
        J0.f67948xff347167 = i18;
        super.mo11260x413cb2b4(J0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return 0;
    }

    public int i1(java.lang.String str, java.lang.String str2, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = J0(str);
        J0.f67951x4b6e68b9 = str2;
        J0.f67936xd2d2440e = bArr;
        super.mo11260x413cb2b4(J0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return 0;
    }

    public boolean k1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 d2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i1 i1Var;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (!this.f247503d || (i1Var = this.f247505f) == null) {
            boolean n17 = n1(d2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return n17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o5 o5Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o5) i1Var;
        o5Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        if (d2Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d2Var.f67957xdde069b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.SnsExtCache");
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n5(o5Var, d2Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.SnsExtCache");
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63, "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (i1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63, "com.tencent.mm.plugin.sns.model.SnsExtCache");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l5((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o5) i1Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63, "com.tencent.mm.plugin.sns.model.SnsExtCache");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63, "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return z17;
    }

    public boolean n1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 d2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceImp", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        boolean mo11260x413cb2b4 = super.mo11260x413cb2b4(d2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceImp", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return mo11260x413cb2b4;
    }

    public boolean o1(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceNewerIds", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = J0(str);
        J0.f67952x702e9ad0 = str2;
        boolean mo11260x413cb2b4 = super.mo11260x413cb2b4(J0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceNewerIds", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return mo11260x413cb2b4;
    }

    public void p1() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetTimeLineMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = J0("@__weixintimtline");
        J0.f67951x4b6e68b9 = "";
        J0.f67937x79146e34 = "";
        k1(J0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetTimeLineMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    @Override // l75.n0
    /* renamed from: replace */
    public /* bridge */ /* synthetic */ boolean mo11260x413cb2b4(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        boolean k17 = k1((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2) f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return k17;
    }

    public boolean u1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 d2Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (d2Var == null || (str = d2Var.f67957xdde069b) == null || str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return false;
        }
        boolean mo11260x413cb2b4 = super.mo11260x413cb2b4(d2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return mo11260x413cb2b4;
    }

    public void y0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 d2Var, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearBackgroundImageIfBanned", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsExtStorage", "clear cached background image as it has been banned: username=%s", str2);
            java.lang.String Di = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di();
            com.p314xaae8f345.mm.vfs.w6.h(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(Di, str2) + (str2 + "tbg_"));
            com.p314xaae8f345.mm.vfs.w6.h(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(Di, str2) + (str2 + "bg_"));
            d2Var.f67953x6c9a44f0 = null;
            d2Var.f67938x2259bc65 = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearBackgroundImageIfBanned", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    public void z0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = J0(str);
        J0.f67957xdde069b = str;
        super.mo9951xb06685ab(J0, m145254xa242f8f3());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    public boolean z1(java.lang.String str, r45.cb6 cb6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBg", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (cb6Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBg", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = J0(str);
        java.lang.String t07 = ca4.z0.t0(cb6Var.f452963f);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cb6Var.f452962e) && (J0.f67939x28ddff65 == null || !J0.f67938x2259bc65.equals(t07))) {
            J0.f67953x6c9a44f0 = J0.f67938x2259bc65;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setChnage", "com.tencent.mm.plugin.sns.storage.SnsExt");
            J0.f67950x6d5f825 |= 1;
            J0.y0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setChnage", "com.tencent.mm.plugin.sns.storage.SnsExt");
        }
        J0.f67938x2259bc65 = t07;
        java.lang.String str2 = cb6Var.f452962e;
        J0.f67939x28ddff65 = str2;
        y0(J0, str2, str);
        J0.f67941x2931f7f0 = cb6Var.f452961d;
        J0.f67954xfa287b93 = cb6Var.f452963f;
        J0.f67950x6d5f825 |= 4;
        int i17 = cb6Var.f452964g;
        if ((i17 & 4096) == 0) {
            if ((i17 & 512) > 0) {
                cb6Var.f452964g = i17 | 4096;
                cb6Var.f452965h = 4320;
            } else if ((i17 & 1024) > 0) {
                cb6Var.f452964g = i17 | 4096;
                cb6Var.f452965h = 72;
            }
        }
        J0.w0(cb6Var);
        k1(J0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBg", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return true;
    }
}
