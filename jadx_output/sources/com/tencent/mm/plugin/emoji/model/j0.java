package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes15.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public j12.b f97556a;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f97559d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.fragment.app.Fragment f97560e;

    /* renamed from: f, reason: collision with root package name */
    public int f97561f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.i0 f97562g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f97563h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zj0 f97564i;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct f97566k;

    /* renamed from: b, reason: collision with root package name */
    public boolean f97557b = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f97567l = false;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f97558c = com.tencent.mm.sdk.platformtools.x2.f193071a;

    /* renamed from: j, reason: collision with root package name */
    public final n22.q f97565j = new n22.q(2003);

    public final java.lang.String a(int i17) {
        return this.f97558c.getString(i17);
    }

    public void b(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        int i19;
        j12.f fVar;
        if (intent != null) {
            i19 = intent.getIntExtra("key_err_code", 0);
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.PayOrDownloadComponent", "errCode:" + i19);
            str = intent.getStringExtra("key_err_msg");
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.PayOrDownloadComponent", "errMsg:" + str);
        } else {
            str = "";
            i19 = 0;
        }
        this.f97557b = false;
        if (i18 != -1) {
            if (i17 == 2001) {
                if (c01.z1.y()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 6L, 1L, false);
                    return;
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 2L, 1L, false);
                    return;
                }
            }
            return;
        }
        if (i17 != 2001) {
            if (i17 != 2003) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.PayOrDownloadComponent", "onActivityResult unknow request");
                return;
            }
            java.lang.String str2 = this.f97565j.f334308a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            android.app.Activity activity = (android.app.Activity) this.f97559d;
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Chat_User", stringExtra);
                    intent2.putExtra("smiley_product_id", str2);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent2, activity);
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12069, 3, str2);
            return;
        }
        j12.b bVar = this.f97556a;
        if (bVar == null || (fVar = bVar.f297152e) == null) {
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
                com.tencent.mm.storage.f5 e17 = this.f97556a.f297152e.e(str3);
                if (this.f97563h.equals(str3)) {
                    r45.zj0 zj0Var = this.f97564i;
                    java.lang.String str5 = zj0Var != null ? zj0Var.f392140s : null;
                    java.lang.String str6 = e17.f193918a;
                    com.tencent.mm.plugin.emoji.model.i0 i0Var = this.f97562g;
                    if (i0Var != null) {
                        i0Var.s(str3, str4, str6, null, str5);
                    }
                    this.f97556a.r(this.f97563h, 0);
                    db5.e1.T(this.f97559d, str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", str3);
                    if (stringArrayListExtra.size() > 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "some other product verify.");
                        com.tencent.mm.plugin.emoji.model.i0 i0Var2 = this.f97562g;
                        if (i0Var2 != null) {
                            i0Var2.I0(false);
                        }
                    }
                    z17 = true;
                } else {
                    this.f97556a.s(this.f97563h, 5);
                }
                i27++;
                z17 = z17;
            }
            if (!z17) {
                d(str);
            }
            if (c01.z1.y()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 4L, 1L, false);
                return;
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 0L, 1L, false);
                return;
            }
        }
        if (intent != null && i19 == 100000002) {
            com.tencent.mm.storage.f5 e18 = fVar.e(this.f97563h);
            r45.zj0 zj0Var2 = this.f97564i;
            java.lang.String str7 = zj0Var2 != null ? zj0Var2.f392140s : null;
            java.lang.String str8 = this.f97563h;
            java.lang.String str9 = e18.f193918a;
            com.tencent.mm.plugin.emoji.model.i0 i0Var3 = this.f97562g;
            if (i0Var3 != null) {
                i0Var3.s(str8, null, str9, null, str7);
            }
            this.f97556a.r(this.f97563h, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "emoji has paied. now doScene ExchangeEmotionPackNetScene productId:%s", this.f97563h);
            d(str);
            if (c01.z1.y()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 7L, 1L, false);
                return;
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 3L, 1L, false);
                return;
            }
        }
        if (intent != null && i19 == 1) {
            if (c01.z1.y()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 6L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 2L, 1L, false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "user cancel pay emoji.");
            return;
        }
        java.lang.String str10 = this.f97563h;
        if (str10 != null) {
            j12.i g17 = fVar.g(str10);
            if (g17 != null) {
                g17.c(-1);
                com.tencent.mm.storage.f5 f5Var = (com.tencent.mm.storage.f5) fVar.f297159e.get(str10);
                java.util.HashMap hashMap = fVar.f297160f;
                g17.b(fVar.f297161g, f5Var, hashMap != null ? hashMap.containsKey(str10) : false);
            }
            j12.b bVar2 = this.f97556a;
            java.lang.String str11 = this.f97563h;
            java.util.HashMap hashMap2 = bVar2.f297155h;
            i12.c cVar = hashMap2 != null ? (i12.c) hashMap2.get(str11) : null;
            if (cVar != null) {
                cVar.h();
            }
        }
        d(str);
        if (c01.z1.y()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 5L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(166L, 1L, 1L, false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "failed pay emoji. errormsg:%s", str);
    }

    public void c(i12.c cVar) {
        j12.i iVar;
        j12.b bVar;
        boolean z17;
        java.lang.String a17;
        if (cVar == null || (iVar = cVar.f287171c) == null || (bVar = this.f97556a) == null || bVar.f297152e == null) {
            return;
        }
        r45.zj0 zj0Var = iVar.f297167b;
        this.f97564i = zj0Var;
        if (zj0Var == null) {
            return;
        }
        java.lang.String str = zj0Var.f392128d;
        java.lang.String str2 = zj0Var.f392130f;
        java.lang.String str3 = zj0Var.f392141t;
        java.lang.String str4 = zj0Var.f392142u;
        int i17 = zj0Var.f392135n;
        int i18 = zj0Var.B;
        int f17 = cVar.f();
        j12.i iVar2 = cVar.f287171c;
        (iVar2 == null ? null : java.lang.Integer.valueOf(iVar2.f297172g)).intValue();
        j12.f fVar = this.f97556a.f297152e;
        boolean z18 = fVar.f297161g;
        boolean z19 = cVar.f287171c.f297173h;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = android.text.TextUtils.isEmpty(str3) ? "" : str3;
        objArr[2] = java.lang.Integer.valueOf(f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", objArr);
        this.f97563h = str;
        if (f17 == -1) {
            if (j12.g.a(zj0Var) || j12.g.c(zj0Var) || (!z18 && android.text.TextUtils.isEmpty(zj0Var.f392133i))) {
                r15 = 3;
            } else if (z18) {
                com.tencent.mm.storage.f5 e17 = fVar.e(str);
                if (android.text.TextUtils.isEmpty(e17.f193922e)) {
                    r15 = e17.f193920c;
                }
            }
            this.f97556a.s(str, r15);
            return;
        }
        if (f17 == 0) {
            j12.b bVar2 = this.f97556a;
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
                            j12.i iVar3 = cVar.f287171c;
                            if (iVar3.f297175j) {
                                java.lang.String str5 = iVar3.f297167b.f392128d;
                                if (this.f97559d == null) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "start reward ui faild. context is null");
                                    return;
                                }
                                r15 = this.f97561f == 9 ? 3 : 4;
                                d22.b0 b0Var = new d22.b0(str5);
                                b0Var.f364190g = r15;
                                b0Var.f364155a = this.f97561f;
                                d22.u.f225876a.a(this.f97559d, b0Var);
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12738, str5, java.lang.Integer.valueOf(r15), java.lang.Integer.valueOf(this.f97561f), 0);
                                return;
                            }
                            return;
                        }
                        androidx.fragment.app.Fragment fragment = this.f97560e;
                        boolean z27 = fragment != null;
                        n22.q qVar = this.f97565j;
                        if (z27) {
                            qVar.getClass();
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477783bc);
                            intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
                            java.util.List list = j45.l.f297713a;
                            java.lang.String concat = "com.tencent.mm".concat(".ui.transmit.SelectConversationUI");
                            intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, concat);
                            android.content.Context context = fragment.getContext();
                            java.util.List list2 = j45.l.f297713a;
                            kotlin.jvm.internal.o.f(list2, "getInterceptors(...)");
                            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list2).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z17 = false;
                                    break;
                                } else if (((j45.i) it.next()).b(context, concat, intent, 2003, null)) {
                                    z17 = true;
                                    break;
                                }
                            }
                            if (!z17) {
                                fragment.startActivityForResult(intent, 2003);
                                j45.l.a(fragment.getActivity(), ".ui.transmit.SelectConversationUI", intent);
                            }
                            fragment.getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477784bd);
                        } else {
                            android.app.Activity activity = (android.app.Activity) this.f97559d;
                            qVar.getClass();
                            android.content.Intent intent2 = new android.content.Intent();
                            intent2.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477783bc);
                            intent2.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
                            j45.l.v(activity, ".ui.transmit.SelectConversationUI", intent2, 2003);
                            activity.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477784bd);
                        }
                        qVar.f334308a = str;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12069, 1, str);
                        return;
                    }
                    switch (f17) {
                        case 9:
                            gm0.j1.n().f273288b.g(new z12.w(str, 2));
                            return;
                        case 10:
                            switch (fVar.e(str).f193921d) {
                                case 10233:
                                    a17 = a(com.tencent.mm.R.string.bwv);
                                    break;
                                case 10234:
                                    a17 = a(com.tencent.mm.R.string.bwe);
                                    break;
                                case 10235:
                                    a17 = a(com.tencent.mm.R.string.c0a);
                                    break;
                                default:
                                    a17 = a(com.tencent.mm.R.string.c0f);
                                    break;
                            }
                            db5.e1.s(this.f97559d, a17, null);
                            return;
                        case 11:
                            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] cannot action when loading.");
                            return;
                        case 12:
                            break;
                        default:
                            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] unkonw product status");
                            return;
                    }
                }
            }
            if (this.f97557b) {
                return;
            }
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                android.content.Context context2 = this.f97559d;
                java.lang.String content = a(com.tencent.mm.R.string.c0j);
                kotlin.jvm.internal.o.g(context2, "context");
                kotlin.jvm.internal.o.g(content, "content");
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context2);
                u1Var.g(content);
                u1Var.n(context2.getString(com.tencent.mm.R.string.c0i));
                u1Var.b(new n22.h(null));
                u1Var.q(false);
                u1Var.f211998c.k(-2, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "Pay Intercept, TeenModeEnable, ProductId:%s, WeCoinNum:%s", str, java.lang.Integer.valueOf(i18));
                return;
            }
            if ((i17 & 512) == 512) {
                n22.i iVar4 = n22.j.f334293a;
                if (iVar4.a()) {
                    iVar4.e(true);
                    iVar4.b(this.f97559d).C();
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "onProductClick:productId %s, wecoinNum %s, currency %s", str, java.lang.Integer.valueOf(i18), str4);
                n22.j.a(this.f97559d, str, str4, i18, str3, str2);
                iVar4.e(true);
                this.f97557b = true;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12066, 2, java.lang.Integer.valueOf(this.f97561f), "", str, 0L, "", java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(zj0Var.D)), java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(zj0Var.D)), com.tencent.mm.plugin.emoji.model.EmojiLogic.m(zj0Var.D));
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("key_product_id", str);
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "onProductClick: price %s, currency %s", str3, str4);
            if (z18) {
                intent3.putExtra("key_currency_type", str4);
                intent3.putExtra("key_price", str4 + str3);
            } else {
                intent3.putExtra("key_currency_type", str4);
                intent3.putExtra("key_price", str3);
            }
            j45.l.n(this.f97559d, "wallet_index", ".ui.WalletIapUI", intent3, 2001);
            this.f97557b = true;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12066, 2, java.lang.Integer.valueOf(this.f97561f), "", str, 0L, "", java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(zj0Var.D)), java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(zj0Var.D)), com.tencent.mm.plugin.emoji.model.EmojiLogic.m(zj0Var.D));
            return;
        }
        if (n22.l.c(zj0Var)) {
            z12.e.f().h();
            return;
        }
        java.lang.String str6 = zj0Var.f392129e;
        java.lang.String str7 = zj0Var.f392140s;
        com.tencent.mm.plugin.emoji.model.i0 i0Var = this.f97562g;
        if (i0Var != null) {
            i0Var.s(str, null, str2, str6, str7);
        }
        j12.b bVar3 = this.f97556a;
        if (bVar3 != null) {
            bVar3.r(str, 0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", str);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12066, 0, java.lang.Integer.valueOf(this.f97561f), "", str, 0L, "", java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(zj0Var.D)), java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(zj0Var.D)), com.tencent.mm.plugin.emoji.model.EmojiLogic.m(zj0Var.D));
        com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct emoticonStoreActionStruct = this.f97566k;
        if (emoticonStoreActionStruct != null) {
            emoticonStoreActionStruct.f56072f = 2;
            emoticonStoreActionStruct.u(zj0Var.f392128d);
            this.f97566k.q(this.f97567l ? zj0Var.f392147z : zj0Var.f392145x);
            this.f97566k.p(java.lang.String.valueOf(cVar.f287172d + 1));
            this.f97566k.r(java.lang.String.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(zj0Var.D)));
            this.f97566k.t(java.lang.String.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(zj0Var.D)));
            this.f97566k.s(com.tencent.mm.plugin.emoji.model.EmojiLogic.m(zj0Var.D));
            this.f97566k.v(iVar.f297176k);
            this.f97566k.k();
        }
    }

    public final void d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = a(com.tencent.mm.R.string.bx8);
        }
        db5.e1.t(this.f97559d, str, "", new com.tencent.mm.plugin.emoji.model.g0(this));
    }
}
