package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes15.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public j12.b f179089a;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f179092d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f179093e;

    /* renamed from: f, reason: collision with root package name */
    public int f179094f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0 f179095g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179096h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zj0 f179097i;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 f179099k;

    /* renamed from: b, reason: collision with root package name */
    public boolean f179090b = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f179100l = false;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f179091c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;

    /* renamed from: j, reason: collision with root package name */
    public final n22.q f179098j = new n22.q(2003);

    public final java.lang.String a(int i17) {
        return this.f179091c.getString(i17);
    }

    public void b(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        int i19;
        j12.f fVar;
        if (intent != null) {
            i19 = intent.getIntExtra("key_err_code", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.PayOrDownloadComponent", "errCode:" + i19);
            str = intent.getStringExtra("key_err_msg");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.PayOrDownloadComponent", "errMsg:" + str);
        } else {
            str = "";
            i19 = 0;
        }
        this.f179090b = false;
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.PayOrDownloadComponent", "onActivityResult unknow request");
                return;
            }
            java.lang.String str2 = this.f179098j.f415841a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            android.app.Activity activity = (android.app.Activity) this.f179092d;
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
        j12.b bVar = this.f179089a;
        if (bVar == null || (fVar = bVar.f378685e) == null) {
            return;
        }
        if (intent != null && i19 == 0) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_response_product_ids");
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_response_series_ids");
            int size = stringArrayListExtra.size();
            int i27 = 0;
            boolean z17 = false;
            while (i27 < size) {
                java.lang.String str3 = stringArrayListExtra.get(i27);
                java.lang.String str4 = stringArrayListExtra2.get(i27);
                com.p314xaae8f345.mm.p2621x8fb0427b.f5 e17 = this.f179089a.f378685e.e(str3);
                if (this.f179096h.equals(str3)) {
                    r45.zj0 zj0Var = this.f179097i;
                    java.lang.String str5 = zj0Var != null ? zj0Var.f473673s : null;
                    java.lang.String str6 = e17.f275451a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0 i0Var = this.f179095g;
                    if (i0Var != null) {
                        i0Var.s(str3, str4, str6, null, str5);
                    }
                    this.f179089a.r(this.f179096h, 0);
                    db5.e1.T(this.f179092d, str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", str3);
                    if (stringArrayListExtra.size() > 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "some other product verify.");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0 i0Var2 = this.f179095g;
                        if (i0Var2 != null) {
                            i0Var2.I0(false);
                        }
                    }
                    z17 = true;
                } else {
                    this.f179089a.s(this.f179096h, 5);
                }
                i27++;
                z17 = z17;
            }
            if (!z17) {
                d(str);
            }
            if (c01.z1.y()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 4L, 1L, false);
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 0L, 1L, false);
                return;
            }
        }
        if (intent != null && i19 == 100000002) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f5 e18 = fVar.e(this.f179096h);
            r45.zj0 zj0Var2 = this.f179097i;
            java.lang.String str7 = zj0Var2 != null ? zj0Var2.f473673s : null;
            java.lang.String str8 = this.f179096h;
            java.lang.String str9 = e18.f275451a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0 i0Var3 = this.f179095g;
            if (i0Var3 != null) {
                i0Var3.s(str8, null, str9, null, str7);
            }
            this.f179089a.r(this.f179096h, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "emoji has paied. now doScene ExchangeEmotionPackNetScene productId:%s", this.f179096h);
            d(str);
            if (c01.z1.y()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 7L, 1L, false);
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 3L, 1L, false);
                return;
            }
        }
        if (intent != null && i19 == 1) {
            if (c01.z1.y()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 6L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 2L, 1L, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "user cancel pay emoji.");
            return;
        }
        java.lang.String str10 = this.f179096h;
        if (str10 != null) {
            j12.i g17 = fVar.g(str10);
            if (g17 != null) {
                g17.c(-1);
                com.p314xaae8f345.mm.p2621x8fb0427b.f5 f5Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f5) fVar.f378692e.get(str10);
                java.util.HashMap hashMap = fVar.f378693f;
                g17.b(fVar.f378694g, f5Var, hashMap != null ? hashMap.containsKey(str10) : false);
            }
            j12.b bVar2 = this.f179089a;
            java.lang.String str11 = this.f179096h;
            java.util.HashMap hashMap2 = bVar2.f378688h;
            i12.c cVar = hashMap2 != null ? (i12.c) hashMap2.get(str11) : null;
            if (cVar != null) {
                cVar.h();
            }
        }
        d(str);
        if (c01.z1.y()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 5L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(166L, 1L, 1L, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "failed pay emoji. errormsg:%s", str);
    }

    public void c(i12.c cVar) {
        j12.i iVar;
        j12.b bVar;
        boolean z17;
        java.lang.String a17;
        if (cVar == null || (iVar = cVar.f368704c) == null || (bVar = this.f179089a) == null || bVar.f378685e == null) {
            return;
        }
        r45.zj0 zj0Var = iVar.f378700b;
        this.f179097i = zj0Var;
        if (zj0Var == null) {
            return;
        }
        java.lang.String str = zj0Var.f473661d;
        java.lang.String str2 = zj0Var.f473663f;
        java.lang.String str3 = zj0Var.f473674t;
        java.lang.String str4 = zj0Var.f473675u;
        int i17 = zj0Var.f473668n;
        int i18 = zj0Var.B;
        int f17 = cVar.f();
        j12.i iVar2 = cVar.f368704c;
        (iVar2 == null ? null : java.lang.Integer.valueOf(iVar2.f378705g)).intValue();
        j12.f fVar = this.f179089a.f378685e;
        boolean z18 = fVar.f378694g;
        boolean z19 = cVar.f368704c.f378706h;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = android.text.TextUtils.isEmpty(str3) ? "" : str3;
        objArr[2] = java.lang.Integer.valueOf(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", objArr);
        this.f179096h = str;
        if (f17 == -1) {
            if (j12.g.a(zj0Var) || j12.g.c(zj0Var) || (!z18 && android.text.TextUtils.isEmpty(zj0Var.f473666i))) {
                r15 = 3;
            } else if (z18) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f5 e17 = fVar.e(str);
                if (android.text.TextUtils.isEmpty(e17.f275455e)) {
                    r15 = e17.f275453c;
                }
            }
            this.f179089a.s(str, r15);
            return;
        }
        if (f17 == 0) {
            j12.b bVar2 = this.f179089a;
            if (bVar2 != null) {
                bVar2.s(str, 3);
                return;
            }
            return;
        }
        if (f17 != 3) {
            if (f17 != 4) {
                if (f17 != 5) {
                    if (f17 == 7) {
                        if (!z19) {
                            j12.i iVar3 = cVar.f368704c;
                            if (iVar3.f378708j) {
                                java.lang.String str5 = iVar3.f378700b.f473661d;
                                if (this.f179092d == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "start reward ui faild. context is null");
                                    return;
                                }
                                r15 = this.f179094f == 9 ? 3 : 4;
                                d22.b0 b0Var = new d22.b0(str5);
                                b0Var.f445723g = r15;
                                b0Var.f445688a = this.f179094f;
                                d22.u.f307409a.a(this.f179092d, b0Var);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12738, str5, java.lang.Integer.valueOf(r15), java.lang.Integer.valueOf(this.f179094f), 0);
                                return;
                            }
                            return;
                        }
                        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f179093e;
                        boolean z27 = componentCallbacksC1101xa17d4670 != null;
                        n22.q qVar = this.f179098j;
                        if (z27) {
                            qVar.getClass();
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
                            intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
                            java.util.List list = j45.l.f379246a;
                            java.lang.String concat = "com.tencent.mm".concat(".ui.transmit.SelectConversationUI");
                            intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, concat);
                            android.content.Context mo7438x76847179 = componentCallbacksC1101xa17d4670.mo7438x76847179();
                            java.util.List list2 = j45.l.f379246a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "getInterceptors(...)");
                            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list2).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z17 = false;
                                    break;
                                } else if (((j45.i) it.next()).b(mo7438x76847179, concat, intent, 2003, null)) {
                                    z17 = true;
                                    break;
                                }
                            }
                            if (!z17) {
                                componentCallbacksC1101xa17d4670.m7587x5dc77fb5(intent, 2003);
                                j45.l.a(componentCallbacksC1101xa17d4670.mo7430x19263085(), ".ui.transmit.SelectConversationUI", intent);
                            }
                            componentCallbacksC1101xa17d4670.mo7430x19263085().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd);
                        } else {
                            android.app.Activity activity = (android.app.Activity) this.f179092d;
                            qVar.getClass();
                            android.content.Intent intent2 = new android.content.Intent();
                            intent2.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
                            intent2.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
                            j45.l.v(activity, ".ui.transmit.SelectConversationUI", intent2, 2003);
                            activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd);
                        }
                        qVar.f415841a = str;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12069, 1, str);
                        return;
                    }
                    switch (f17) {
                        case 9:
                            gm0.j1.n().f354821b.g(new z12.w(str, 2));
                            return;
                        case 10:
                            switch (fVar.e(str).f275454d) {
                                case 10233:
                                    a17 = a(com.p314xaae8f345.mm.R.C30867xcad56011.bwv);
                                    break;
                                case 10234:
                                    a17 = a(com.p314xaae8f345.mm.R.C30867xcad56011.bwe);
                                    break;
                                case 10235:
                                    a17 = a(com.p314xaae8f345.mm.R.C30867xcad56011.c0a);
                                    break;
                                default:
                                    a17 = a(com.p314xaae8f345.mm.R.C30867xcad56011.c0f);
                                    break;
                            }
                            db5.e1.s(this.f179092d, a17, null);
                            return;
                        case 11:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] cannot action when loading.");
                            return;
                        case 12:
                            break;
                        default:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] unkonw product status");
                            return;
                    }
                }
            }
            if (this.f179090b) {
                return;
            }
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
                android.content.Context context = this.f179092d;
                java.lang.String content = a(com.p314xaae8f345.mm.R.C30867xcad56011.c0j);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
                u1Var.g(content);
                u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0i));
                u1Var.b(new n22.h(null));
                u1Var.q(false);
                u1Var.f293531c.k(-2, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "Pay Intercept, TeenModeEnable, ProductId:%s, WeCoinNum:%s", str, java.lang.Integer.valueOf(i18));
                return;
            }
            if ((i17 & 512) == 512) {
                n22.i iVar4 = n22.j.f415826a;
                if (iVar4.a()) {
                    iVar4.e(true);
                    iVar4.b(this.f179092d).C();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "onProductClick:productId %s, wecoinNum %s, currency %s", str, java.lang.Integer.valueOf(i18), str4);
                n22.j.a(this.f179092d, str, str4, i18, str3, str2);
                iVar4.e(true);
                this.f179090b = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12066, 2, java.lang.Integer.valueOf(this.f179094f), "", str, 0L, "", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(zj0Var.D)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(zj0Var.D)), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(zj0Var.D));
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("key_product_id", str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "onProductClick: price %s, currency %s", str3, str4);
            if (z18) {
                intent3.putExtra("key_currency_type", str4);
                intent3.putExtra("key_price", str4 + str3);
            } else {
                intent3.putExtra("key_currency_type", str4);
                intent3.putExtra("key_price", str3);
            }
            j45.l.n(this.f179092d, "wallet_index", ".ui.WalletIapUI", intent3, 2001);
            this.f179090b = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12066, 2, java.lang.Integer.valueOf(this.f179094f), "", str, 0L, "", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(zj0Var.D)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(zj0Var.D)), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(zj0Var.D));
            return;
        }
        if (n22.l.c(zj0Var)) {
            z12.e.f().h();
            return;
        }
        java.lang.String str6 = zj0Var.f473662e;
        java.lang.String str7 = zj0Var.f473673s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0 i0Var = this.f179095g;
        if (i0Var != null) {
            i0Var.s(str, null, str2, str6, str7);
        }
        j12.b bVar3 = this.f179089a;
        if (bVar3 != null) {
            bVar3.r(str, 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12066, 0, java.lang.Integer.valueOf(this.f179094f), "", str, 0L, "", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(zj0Var.D)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(zj0Var.D)), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(zj0Var.D));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 c6419xd51df726 = this.f179099k;
        if (c6419xd51df726 != null) {
            c6419xd51df726.f137605f = 2;
            c6419xd51df726.u(zj0Var.f473661d);
            this.f179099k.q(this.f179100l ? zj0Var.f473680z : zj0Var.f473678x);
            this.f179099k.p(java.lang.String.valueOf(cVar.f368705d + 1));
            this.f179099k.r(java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(zj0Var.D)));
            this.f179099k.t(java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(zj0Var.D)));
            this.f179099k.s(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(zj0Var.D));
            this.f179099k.v(iVar.f378709k);
            this.f179099k.k();
        }
    }

    public final void d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = a(com.p314xaae8f345.mm.R.C30867xcad56011.bx8);
        }
        db5.e1.t(this.f179092d, str, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.g0(this));
    }
}
