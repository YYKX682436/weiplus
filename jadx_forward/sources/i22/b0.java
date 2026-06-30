package i22;

/* loaded from: classes15.dex */
public class b0 {

    /* renamed from: n, reason: collision with root package name */
    public static final n22.q f369464n = new n22.q(2003);

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f369467c;

    /* renamed from: d, reason: collision with root package name */
    public i22.q0 f369468d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.f0 f369469e;

    /* renamed from: f, reason: collision with root package name */
    public int f369470f;

    /* renamed from: i, reason: collision with root package name */
    public i22.a0 f369473i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f369474j;

    /* renamed from: k, reason: collision with root package name */
    public r45.zj0 f369475k;

    /* renamed from: l, reason: collision with root package name */
    public bw5.ra f369476l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 f369477m;

    /* renamed from: a, reason: collision with root package name */
    public boolean f369465a = false;

    /* renamed from: g, reason: collision with root package name */
    public long f369471g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369472h = "";

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f369466b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;

    public void a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        int i19;
        if (intent != null) {
            i19 = intent.getIntExtra("key_err_code", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "errCode:" + i19);
            str = intent.getStringExtra("key_err_msg");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "errMsg:" + str);
        } else {
            str = "";
            i19 = 0;
        }
        this.f369465a = false;
        if (i18 != -1) {
            if (i17 == 2001) {
                if (c01.z1.y()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 6L, 1L, false);
                    return;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 2L, 1L, false);
                    return;
                }
            }
            return;
        }
        if (i17 != 2001) {
            if (i17 != 2003) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "onActivityResult unknow request");
                return;
            }
            java.lang.String str2 = f369464n.f415841a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            android.app.Activity activity = (android.app.Activity) this.f369467c;
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Chat_User", stringExtra);
                    intent2.putExtra("smiley_product_id", str2);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent2, activity);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12069, 3, str2);
            return;
        }
        if (intent != null && i19 == 0) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_response_product_ids");
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_response_series_ids");
            int size = stringArrayListExtra.size();
            boolean z17 = false;
            for (int i27 = 0; i27 < size; i27++) {
                java.lang.String str3 = stringArrayListExtra.get(i27);
                java.lang.String str4 = stringArrayListExtra2.get(i27);
                if (this.f369474j.equals(str3)) {
                    r45.zj0 zj0Var = this.f369475k;
                    if (zj0Var != null) {
                        java.lang.String str5 = zj0Var.f473673s;
                        java.lang.String str6 = zj0Var.f473663f;
                        java.lang.String str7 = zj0Var.f473662e;
                        i22.a0 a0Var = this.f369473i;
                        if (a0Var != null) {
                            a0Var.s(str3, str4, str6, str7, str5);
                        }
                    }
                    this.f369468d.b(0, this.f369474j);
                    db5.e1.T(this.f369467c, str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", str3);
                    if (stringArrayListExtra.size() > 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "some other product verify.");
                        i22.a0 a0Var2 = this.f369473i;
                        if (a0Var2 != null) {
                            a0Var2.x();
                        }
                    }
                    z17 = true;
                } else {
                    this.f369468d.b(5, this.f369474j);
                }
            }
            if (!z17) {
                c(str);
            }
            if (c01.z1.y()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 4L, 1L, false);
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 0L, 1L, false);
                return;
            }
        }
        if (intent == null || i19 != 100000002) {
            if (intent != null && i19 == 1) {
                if (c01.z1.y()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 6L, 1L, false);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 2L, 1L, false);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "user cancel pay emoji.");
                return;
            }
            java.lang.String str8 = this.f369474j;
            if (str8 != null) {
                this.f369468d.e(str8);
                this.f369468d.f();
            }
            c(str);
            if (c01.z1.y()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 5L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 1L, 1L, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "failed pay emoji. errormsg:%s", str);
            return;
        }
        r45.zj0 zj0Var2 = this.f369475k;
        if (zj0Var2 != null) {
            java.lang.String str9 = zj0Var2.f473673s;
            java.lang.String str10 = this.f369474j;
            java.lang.String str11 = zj0Var2.f473663f;
            java.lang.String str12 = zj0Var2.f473662e;
            i22.a0 a0Var3 = this.f369473i;
            if (a0Var3 != null) {
                a0Var3.s(str10, null, str11, str12, str9);
            }
            this.f369468d.b(0, this.f369474j);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "emoji has paied. now doScene ExchangeEmotionPackNetScene productId:%s", this.f369474j);
        c(str);
        if (c01.z1.y()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 7L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 3L, 1L, false);
        }
    }

    public void b() {
        java.lang.String string;
        i22.q0 q0Var = this.f369468d;
        if (q0Var == null || q0Var.d() == null) {
            return;
        }
        j12.i d17 = this.f369468d.d();
        if (d17 != null) {
            this.f369475k = d17.f378700b;
            this.f369476l = d17.f378701c;
        }
        r45.zj0 zj0Var = this.f369475k;
        if (zj0Var == null && this.f369476l == null) {
            return;
        }
        if (zj0Var == null) {
            this.f369475k = n22.k.a(this.f369476l);
        }
        r45.zj0 zj0Var2 = this.f369475k;
        java.lang.String str = zj0Var2.f473661d;
        java.lang.String str2 = zj0Var2.f473663f;
        java.lang.String str3 = zj0Var2.f473674t;
        int i17 = zj0Var2.f473668n;
        int i18 = zj0Var2.B;
        int i19 = this.f369468d.d().f378704f;
        boolean y17 = c01.z1.y();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = android.text.TextUtils.isEmpty(str3) ? "" : str3;
        objArr[2] = java.lang.Integer.valueOf(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", objArr);
        this.f369474j = str;
        if (i19 == -1) {
            if (!j12.g.a(this.f369475k) && !j12.g.c(this.f369475k) && (y17 || !android.text.TextUtils.isEmpty(this.f369475k.f473666i))) {
                if (y17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.f0 f0Var = this.f369469e;
                    if (f0Var == null) {
                        return;
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.f5 b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q) f0Var).b(str);
                    if (android.text.TextUtils.isEmpty(b17.f275455e)) {
                        r3 = b17.f275453c;
                    }
                }
                r3 = 4;
            }
            this.f369468d.b(r3, str);
            return;
        }
        if (i19 == 0) {
            this.f369468d.b(3, str);
            return;
        }
        if (i19 != 3) {
            if (i19 != 4) {
                if (i19 != 5) {
                    if (i19 == 7) {
                        if (this.f369468d.d().f378708j) {
                            java.lang.String str4 = this.f369475k.f473661d;
                            if (str4 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "pid must not be null");
                                return;
                            }
                            if (this.f369467c == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "start reward ui faild. context is null");
                                return;
                            }
                            r3 = this.f369470f != 9 ? 4 : 3;
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            d22.b0 b0Var = new d22.b0(str4);
                            b0Var.f445723g = r3;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(java.lang.String.valueOf(this.f369471g), "<set-?>");
                            b0Var.f445688a = this.f369470f;
                            d22.u.f307409a.a(this.f369467c, b0Var);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12738, str4, java.lang.Integer.valueOf(r3), java.lang.Integer.valueOf(this.f369470f), 0);
                            return;
                        }
                        return;
                    }
                    switch (i19) {
                        case 9:
                            gm0.j1.n().f354821b.g(new z12.w(str, 2));
                            return;
                        case 10:
                            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.f0 f0Var2 = this.f369469e;
                            if (f0Var2 != null) {
                                int i27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q) f0Var2).b(str).f275454d;
                                android.content.Context context = this.f369466b;
                                switch (i27) {
                                    case 10233:
                                        string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwv);
                                        break;
                                    case 10234:
                                        string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwe);
                                        break;
                                    case 10235:
                                        string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0a);
                                        break;
                                    default:
                                        string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0f);
                                        break;
                                }
                                db5.e1.s(this.f369467c, string, null);
                                return;
                            }
                            return;
                        case 11:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "[onProductClick] cannot action when loading.");
                            return;
                        case 12:
                            break;
                        default:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "[onProductClick] unkonw product status");
                            return;
                    }
                }
            }
            if (this.f369465a) {
                return;
            }
            if ((i17 & 512) == 512) {
                n22.i iVar = n22.j.f415826a;
                if (iVar.a()) {
                    iVar.e(true);
                    iVar.b(this.f369467c).C();
                    return;
                } else {
                    n22.j.a(this.f369467c, str, "", i18, str3, str2);
                    iVar.e(true);
                    this.f369465a = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12066, 2, java.lang.Integer.valueOf(this.f369470f), "", str, java.lang.Long.valueOf(this.f369471g), this.f369472h, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(this.f369475k.D)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(this.f369475k.D)), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(this.f369475k.D));
                    return;
                }
            }
            return;
        }
        if (n22.l.c(this.f369475k)) {
            z12.e.f().h();
            return;
        }
        r45.zj0 zj0Var3 = this.f369475k;
        java.lang.String str5 = zj0Var3.f473662e;
        java.lang.String str6 = zj0Var3.f473673s;
        i22.a0 a0Var = this.f369473i;
        if (a0Var != null) {
            a0Var.s(str, null, str2, str5, str6);
        }
        this.f369468d.h(0, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12066, 0, java.lang.Integer.valueOf(this.f369470f), "", str, java.lang.Long.valueOf(this.f369471g), this.f369472h, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(this.f369475k.D)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(this.f369475k.D)), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(this.f369475k.D));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 c6419xd51df726 = this.f369477m;
        if (c6419xd51df726 != null) {
            c6419xd51df726.f137605f = 2;
            c6419xd51df726.u(this.f369475k.f473661d);
            this.f369477m.q(this.f369475k.f473663f);
            this.f369477m.r(java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(this.f369475k.D)));
            this.f369477m.t(java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(this.f369475k.D)));
            this.f369477m.s(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(this.f369475k.D));
            this.f369477m.k();
        }
    }

    public final void c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = this.f369466b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bx8);
        }
        db5.e1.t(this.f369467c, str, "", new i22.z(this));
    }
}
