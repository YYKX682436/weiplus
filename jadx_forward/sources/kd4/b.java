package kd4;

/* loaded from: classes4.dex */
public abstract class b {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6070x7cbfe737> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6070x7cbfe737>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1
            {
                this.f39173x3fe91575 = -545742041;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6070x7cbfe737 c6070x7cbfe737) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6070x7cbfe737 event = c6070x7cbfe737;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.String str = event.f136353g.f87939a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineItemClickEventCenter", "jump to profile page username:" + str);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 101);
                intent.putExtra("Contact_User", str);
                yc4.b0.f542372a.e(intent, event);
                com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
                kd4.b.a();
                y7Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1");
                return true;
            }
        };
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6069xab724edf> abstractC20980x9b9ad01d2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6069xab724edf>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1
            {
                this.f39173x3fe91575 = -1390092593;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6069xab724edf c6069xab724edf) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6069xab724edf event = c6069xab724edf;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.bw bwVar = event.f136352g;
                long j17 = bwVar.f87825b;
                java.lang.String str = bwVar.f87824a;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("sns_permission_snsinfo_svr_id", j17);
                intent.putExtra("sns_permission_userName", str);
                intent.putExtra("sns_permission_anim", true);
                intent.putExtra("sns_permission_block_scene", 5);
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 0);
                kd4.b.a();
                j45.l.n(null, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, Ni == 0 ? ".ui.PermissionSettingUI" : ".ui.PermissionSettingUI2", intent, 11);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1");
                return true;
            }
        };
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6071x2b665040> abstractC20980x9b9ad01d3 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6071x2b665040>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1
            {
                this.f39173x3fe91575 = -1850845616;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6071x2b665040 c6071x2b665040) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6071x2b665040 event = c6071x2b665040;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.dw dwVar = event.f136354g;
                long j17 = dwVar.f88037b;
                java.lang.String str = dwVar.f88036a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineItemClickEventCenter", "expose id " + j17 + ' ' + str);
                if (j62.e.g().l("clicfg_sns_expose_config_switch_android", false, false, true)) {
                    q80.d0 d0Var = new q80.d0();
                    android.os.Bundle bundle = new android.os.Bundle();
                    d0Var.f442182a = "wxalited4df4810a40b1d9ddc0cbea44d263fd9";
                    d0Var.f442184c = "{\"scene\":33}";
                    bundle.putString("k_username", str);
                    bundle.putLong("k_expose_msg_id", j17);
                    d0Var.f442188g = bundle;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineItemClickEventCenter", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
                    q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                    kd4.b.a();
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).lk(null, d0Var, new kd4.a(event));
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    long j18 = dwVar.f88037b;
                    java.lang.String str2 = dwVar.f88036a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineItemClickEventCenter", "expose id " + j18 + ' ' + str2);
                    intent.putExtra("k_expose_msg_id", j18);
                    intent.putExtra("k_username", str2);
                    intent.putExtra("showShare", false);
                    java.lang.String KExposeH5Url = com.p314xaae8f345.mm.ui.n2.f290931a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KExposeH5Url, "KExposeH5Url");
                    java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{33}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    intent.putExtra("rawUrl", format);
                    kd4.b.a();
                    j45.l.j(null, "webview", ".ui.tools.WebViewUI", intent, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1");
                return true;
            }
        };
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6081xbb9388e8> abstractC20980x9b9ad01d4 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6081xbb9388e8>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1
            {
                this.f39173x3fe91575 = 323618552;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6081xbb9388e8 c6081xbb9388e8) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6081xbb9388e8 event = c6081xbb9388e8;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.iw iwVar = event.f136359g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var = iwVar.f88511b;
                android.view.View view = iwVar.f88512c;
                android.content.Context context = view.getContext();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.B;
                if (k4Var == null) {
                    k4Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l7(1);
                }
                int i17 = iwVar.f88510a;
                if (i17 == 3 || i17 == 4 || i17 == 5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.N(context, i2Var, view, k4Var, 0);
                } else if (i17 == 9) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.H(i2Var, context, k4Var);
                } else if (i17 == 10) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.m(i2Var, context, k4Var);
                } else if (i17 == 17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.j(i2Var, context, k4Var);
                } else if (i17 != 26) {
                    if (i17 != 34) {
                        if (i17 == 41) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.B(context, i2Var);
                        } else if (i17 != 101) {
                            if (i17 != 22) {
                                if (i17 == 23) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.l(i2Var, context, k4Var);
                                } else if (i17 == 55) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.F(context, i2Var);
                                } else if (i17 == 56) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.i(context, i2Var);
                                } else if (i17 != 58) {
                                    if (i17 != 59) {
                                        switch (i17) {
                                            case 12:
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.C(context, i2Var, k4Var);
                                                break;
                                            case 13:
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.d(context, i2Var, k4Var);
                                                break;
                                            case 14:
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.z(i2Var, context, k4Var);
                                                break;
                                            default:
                                                switch (i17) {
                                                    case 28:
                                                        break;
                                                    case 29:
                                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.v(context, i2Var);
                                                        break;
                                                    case 30:
                                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.L(context, i2Var, k4Var);
                                                        break;
                                                    default:
                                                        switch (i17) {
                                                            case 36:
                                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.t(context, i2Var);
                                                                break;
                                                            case 37:
                                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.q(context, i2Var);
                                                                break;
                                                            case 38:
                                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.p(context, i2Var);
                                                                break;
                                                            case 39:
                                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.o(context, i2Var);
                                                                break;
                                                            default:
                                                                switch (i17) {
                                                                    case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                                                                    case 45:
                                                                        break;
                                                                    case 44:
                                                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.G(context, i2Var);
                                                                        break;
                                                                    case 46:
                                                                    case 51:
                                                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.D(context, i2Var);
                                                                        break;
                                                                    case 47:
                                                                    case 48:
                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                                                                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = i2Var.f250082a;
                                                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSupportTingMsg$default", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
                                                                        je4.g.c(context, c19807x593d1720, true);
                                                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSupportTingMsg$default", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
                                                                        break;
                                                                    case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    case 52:
                                                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.M(context, i2Var);
                                                                        break;
                                                                    case 53:
                                                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.s(context, i2Var);
                                                                        break;
                                                                    default:
                                                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.N(context, i2Var, view, k4Var, 0);
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.u(context, i2Var);
                                } else {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.k(i2Var, context, k4Var);
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.n(i2Var, context, k4Var);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.w(context, i2Var);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.r(context, i2Var, null);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.E(context, i2Var);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1");
                return true;
            }
        };
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6059xe0ced7dc> abstractC20980x9b9ad01d5 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6059xe0ced7dc>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1
            {
                this.f39173x3fe91575 = 1192680940;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6059xe0ced7dc c6059xe0ced7dc) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6059xe0ced7dc event = c6059xe0ced7dc;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineItemClickEventCenter", "PhotoTimeLineItem click to post finder");
                am.qv qvVar = event.f136341g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = qvVar.f89281c;
                int i17 = qvVar.f89279a;
                android.content.Context context = qvVar.f89280b;
                wa4.d0 d0Var = wa4.d0.f525748d;
                boolean z17 = true;
                if (i17 == 0) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
                    java.lang.String j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", c17933xe8d1b226.f38324x142bbdc6);
                    n34.h3 h3Var = n34.h3.f416143d;
                    java.util.ArrayList g17 = h3Var.g(j17);
                    if (g17 == null || !((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).uj()) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                        java.lang.String ContentDesc = m70371x485d7.f39013x4c306a8a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ContentDesc, "ContentDesc");
                        z17 = h3Var.j(context, ContentDesc, c17933xe8d1b226.f68891x29d1292e, c17933xe8d1b226.f38324x142bbdc6, j17, true, false);
                    } else {
                        uy0.h hVar = (uy0.h) i95.n0.c(uy0.h.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("key_maas_entrance", 9);
                        java.lang.String ContentDesc2 = m70371x485d7.f39013x4c306a8a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ContentDesc2, "ContentDesc");
                        ((ez0.i) hVar).wi(context, intent, new com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb(g17, true, true, true, h3Var.f(ContentDesc2, c17933xe8d1b226.f68891x29d1292e, c17933xe8d1b226.f38324x142bbdc6, j17)));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
                } else {
                    if (i17 != 2 && i17 != 1) {
                        z17 = false;
                    }
                    if (z17) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d72 = c17933xe8d1b226.m70371x485d7();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d72, "getTimeLine(...)");
                        java.lang.String str = m70371x485d72.f39013x4c306a8a;
                        java.lang.String j18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", c17933xe8d1b226.f38324x142bbdc6);
                        n34.h3 h3Var2 = n34.h3.f416143d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        h3Var2.i(context, j18, str, c17933xe8d1b226.f68891x29d1292e, c17933xe8d1b226.f38324x142bbdc6, m70371x485d72.f39043xa1529a15, false, false);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
                    z17 = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
                return z17;
            }
        };
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6091xb432a48f> abstractC20980x9b9ad01d6 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6091xb432a48f>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$snsRepostListener$1
            {
                this.f39173x3fe91575 = -15715681;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6091xb432a48f c6091xb432a48f) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$snsRepostListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6091xb432a48f event = c6091xb432a48f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$snsRepostListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.String str = event.f136370g.f89571a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineItemClickEventCenter", "localId " + str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.s(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(str));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.r(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(str));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$snsRepostListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$snsRepostListener$1");
                return true;
            }
        };
        arrayList.add(abstractC20980x9b9ad01d);
        arrayList.add(abstractC20980x9b9ad01d2);
        arrayList.add(abstractC20980x9b9ad01d3);
        arrayList.add(abstractC20980x9b9ad01d4);
        arrayList.add(abstractC20980x9b9ad01d5);
        arrayList.add(abstractC20980x9b9ad01d6);
    }

    public static final /* synthetic */ android.content.Context a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContext$p", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContext$p", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter");
        return null;
    }
}
