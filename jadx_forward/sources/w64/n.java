package w64;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public int f524841a;

    /* renamed from: b, reason: collision with root package name */
    public final int f524842b;

    /* renamed from: c, reason: collision with root package name */
    public int f524843c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f524844d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f524845e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 f524846f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f524848h;

    /* renamed from: i, reason: collision with root package name */
    public final i64.b1 f524849i;

    /* renamed from: j, reason: collision with root package name */
    public w64.k f524850j;

    /* renamed from: k, reason: collision with root package name */
    public w64.x f524851k;

    /* renamed from: l, reason: collision with root package name */
    public w64.l f524852l;

    /* renamed from: s, reason: collision with root package name */
    public n74.d f524859s;

    /* renamed from: t, reason: collision with root package name */
    public w64.m f524860t;

    /* renamed from: g, reason: collision with root package name */
    public boolean f524847g = false;

    /* renamed from: m, reason: collision with root package name */
    public int f524853m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f524854n = true;

    /* renamed from: o, reason: collision with root package name */
    public v64.d f524855o = null;

    /* renamed from: p, reason: collision with root package name */
    public u94.f f524856p = null;

    /* renamed from: q, reason: collision with root package name */
    public int f524857q = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final w64.k f524858r = new w64.d(this);

    public n(android.content.Context context, int i17, i64.b1 b1Var, w64.k kVar, w64.l lVar) {
        this.f524845e = context;
        this.f524842b = i17;
        this.f524849i = b1Var;
        this.f524850j = kVar;
        this.f524852l = lVar;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a(w64.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = nVar.f524848h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return c17702x544f64e9;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b(w64.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = nVar.f524844d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return c17933xe8d1b226;
    }

    public static int f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIndirectClickAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        int i17 = 0;
        if (c17702x544f64e9 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdClickActionHandler", "getIndirectClickAction, clickInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIndirectClickAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return 0;
        }
        switch (c17702x544f64e9.B0) {
            case 0:
                if (c17702x544f64e9.f244108d == 1) {
                    i17 = 59;
                    break;
                }
                break;
            case 1:
                i17 = 11;
                break;
            case 3:
            case 20:
            case 25:
                i17 = 21;
                break;
            case 4:
                i17 = 31;
                break;
            case 5:
                if (c17702x544f64e9.f244108d != 1) {
                    i17 = 32;
                    break;
                } else {
                    i17 = 61;
                    break;
                }
            case 6:
                i17 = 33;
                break;
            case 8:
                i17 = 42;
                break;
            case 10:
                if (!i64.y.j(i64.y.h(c17702x544f64e9, c17933xe8d1b226 == null ? "" : ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e)))) {
                    i17 = 44;
                    break;
                } else {
                    i17 = 68;
                    break;
                }
            case 11:
                i17 = 46;
                break;
            case 12:
                i17 = 37;
                break;
            case 14:
                i17 = 41;
                break;
            case 16:
                i17 = 50;
                break;
            case 17:
                i17 = 51;
                break;
            case 18:
                i17 = 52;
                break;
            case 19:
                i17 = 39;
                break;
            case 21:
                i17 = 53;
                break;
            case 22:
                if (c17702x544f64e9.f244108d != 1) {
                    i17 = 54;
                    break;
                } else {
                    i17 = 58;
                    break;
                }
            case 23:
                i17 = 56;
                break;
            case 24:
                i17 = 57;
                break;
            case 26:
                i17 = 60;
                break;
            case 27:
                i17 = 65;
                break;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickActionHandler", "getIndirectClickAction, originClickType=" + c17702x544f64e9.B0 + ", clickAction=" + i17 + ", jumpStyle=" + c17702x544f64e9.f244108d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIndirectClickAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return i17;
    }

    public static int g(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNativeLandingPageSource", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        int i18 = 2;
        if (i17 == 2) {
            i18 = 16;
        } else if (i17 != 1) {
            i18 = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNativeLandingPageSource", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return i18;
    }

    public static void q(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpCardDetail", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickActionHandler", "jumpCardDetail, cardTpId=" + str + ", cardExt=" + str2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_card_id", str);
        intent.putExtra("key_card_ext", str2);
        intent.putExtra("key_from_scene", 21);
        intent.putExtra("key_stastic_scene", 15);
        j45.l.j(activity, "card", ".ui.CardDetailUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpCardDetail", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public static boolean s(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad, int i17, android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpUpdateWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        try {
            java.lang.String m70348x7741d701 = c17933xe8d1b226.m70348x7741d701();
            if (android.text.TextUtils.isEmpty(m70348x7741d701)) {
                m70348x7741d701 = c17933xe8d1b226.m70349x104289b3();
            }
            if (android.text.TextUtils.isEmpty(m70348x7741d701)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdClickActionHandler", "jumpUpdateWebUI both url is empty");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpUpdateWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                return false;
            }
            t(m70348x7741d701, c17933xe8d1b226, c11137xb05b06ad, i17, context, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpUpdateWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdClickActionHandler", "jumpUpdateWebUI, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpUpdateWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return false;
        }
    }

    public static void t(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad, int i17, android.content.Context context, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e67;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickActionHandler", "jumpWebUI, url=" + str + ", source=" + i17 + ", snsInfo=" + c17933xe8d1b226);
        if (android.text.TextUtils.isEmpty(str) || c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        boolean z18 = x51.o1.f533604x ? false : c17933xe8d1b226.m70354x74235b3e().f38280x3e1f3ab == 0;
        if (c17933xe8d1b226.m70377x3172ed() && (m70347x10413e67 = c17933xe8d1b226.m70347x10413e67(i17)) != null) {
            intent.putExtra("KsnsViewId", m70347x10413e67.f38105xcf532ea0);
            if (!z17) {
                str = ca4.z0.b(str, m70347x10413e67.f38104xce64ddf1);
            }
            str = f44.a.e(str);
            ca4.z0.c(intent, m70347x10413e67.f38104xce64ddf1);
        }
        intent.putExtra("KRightBtn", z18);
        android.os.Bundle bundle = new android.os.Bundle();
        if (c11137xb05b06ad != null) {
            bundle.putParcelable("KSnsAdTag", c11137xb05b06ad);
        }
        bundle.putString("key_snsad_statextstr", c17933xe8d1b226.m70371x485d7().f39040xbd345fc4);
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        intent.putExtra("srcUsername", c17933xe8d1b226.f68896xdde069b);
        intent.putExtra("stastic_scene", 15);
        intent.putExtra("KPublisherId", "sns_" + ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        intent.putExtra("pre_username", c17933xe8d1b226.f68896xdde069b);
        intent.putExtra("prePublishId", "sns_" + ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        intent.putExtra("preUsername", c17933xe8d1b226.f68896xdde069b);
        if (i17 == 0) {
            ca4.z0.a(intent, 81);
        } else {
            ca4.z0.a(intent, 82);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public int c(int i17) {
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertSceneToClickPos", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        int i18 = 26;
        if (i17 != 1) {
            if (i17 == 2) {
                i18 = 33;
            } else if (i17 == 3) {
                i18 = 34;
            } else if (i17 == 4) {
                i18 = 35;
            } else if (i17 == 5) {
                i18 = 1001;
            } else if (i17 == 6) {
                i18 = 1002;
            } else if (i17 == 7 || i17 == 8) {
                i18 = 21;
            } else if (i17 == 9) {
                i18 = 37;
            } else if (i17 == 10) {
                i18 = 3;
            } else if (i17 == 11) {
                i18 = 39;
            } else if (i17 == 12) {
                i18 = 40;
            } else if (i17 == 14 || i17 == 13) {
                i18 = 22;
            } else if (i17 == 15) {
                i18 = 44;
            } else if (i17 == 16) {
                i18 = 25;
            } else if (i17 == 17) {
                i18 = 28;
            } else if (i17 == 19) {
                i18 = 45;
            } else if (i17 == 27) {
                i18 = 56;
            } else if (i17 == 18) {
                i18 = 46;
            } else if (i17 == 20) {
                i18 = 47;
            } else if (i17 == 21) {
                i18 = 48;
            } else if (i17 == 22) {
                i18 = 49;
            } else if (i17 == 23) {
                i18 = 50;
            } else if (i17 == 24) {
                i18 = 53;
            } else if (i17 == 25) {
                i18 = 54;
            } else if (i17 == 26) {
                i18 = 55;
            } else if (i17 == 28) {
                i18 = 57;
            } else if (i17 == 29) {
                v64.d dVar = this.f524855o;
                i18 = (dVar == null || (c11137xb05b06ad = (com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) dVar.a("ext_sns_ad_click", null)) == null) ? 1 : c11137xb05b06ad.f153002g;
            } else if (i17 == 30) {
                i18 = 58;
            } else if (i17 == 31) {
                i18 = 59;
            } else if (i17 == 32) {
                i18 = 60;
            } else if (i17 == 33) {
                i18 = 61;
            } else if (i17 == 34) {
                i18 = 62;
            } else if (i17 == 35) {
                i18 = 63;
            } else if (i17 == 36) {
                i18 = 64;
            } else if (i17 == 37) {
                i18 = 65;
            } else if (i17 == 38) {
                i18 = 66;
            } else if (i17 == 39) {
                i18 = 67;
            } else if (i17 == 40) {
                i18 = 68;
            } else if (i17 == 42) {
                i18 = 69;
            } else if (i17 == 41) {
                i18 = 70;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickActionHandler", "convertSceneToClickPos, scene=" + i17 + ", clickPos=" + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertSceneToClickPos", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickActionHandler", "convertSceneToClickPos, scene=" + i17 + ", clickPos=" + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertSceneToClickPos", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return i18;
    }

    public final void d(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createContinuePlayIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        i64.b1 b1Var = this.f524849i;
        if (b1Var == null || intent == null || c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdClickActionHandler", "snsAdStatistic or intent or info is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createContinuePlayIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs.j(c17933xe8d1b226) != 9 && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs.j(c17933xe8d1b226) != 19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickActionHandler", "viewType is not TYPE_SIGHT and is not TYPE_AD_SIGHT");
        } else if (c17933xe8d1b226.m70354x74235b3e().f38218xd253a6b3) {
            long g17 = b1Var.g(c17933xe8d1b226.f68891x29d1292e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickActionHandler", "snsId = " + c17933xe8d1b226.f68891x29d1292e + ", adSightVideoSeekTime = " + g17);
            intent.putExtra("sns_landing_page_sight_video_seek_time", g17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createContinuePlayIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("determineShouldCanvasOpenVoice", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        if (this.f524853m != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("determineShouldCanvasOpenVoice", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return;
        }
        if (this.f524844d.m70354x74235b3e().m70160x35b2ea06() || this.f524844d.m70354x74235b3e().m70151x59316745() || this.f524844d.m70354x74235b3e().m70139x9b8322ea() || ca4.m0.Y(this.f524844d)) {
            this.f524853m = 1;
        } else {
            this.f524853m = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("determineShouldCanvasOpenVoice", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Intent h(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r22, android.app.Activity r23, int r24, android.view.View r25, int r26) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w64.n.h(com.tencent.mm.plugin.sns.storage.SnsInfo, android.app.Activity, int, android.view.View, int):android.content.Intent");
    }

    public final int i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpenAppOrigin", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        int i17 = this.f524841a;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenAppOrigin", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return 0;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenAppOrigin", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return 3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenAppOrigin", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return 2;
    }

    public final void j(com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad) {
        ca4.k kVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleAddBrand", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        if (z3Var != null) {
            try {
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdClickActionHandler", th6.toString());
            }
            if (z3Var.r2()) {
                u94.f.f(this.f524845e, this.f524848h.M);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleAddBrand", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26321xaee9b201.f52302xff8c0727);
        u94.f fVar = new u94.f();
        this.f524856p = fVar;
        fVar.g(this.f524845e, this.f524844d, this.f524848h, this.f524842b, e8Var, z3Var, this.f524858r);
        u94.f fVar2 = this.f524856p;
        int i17 = this.f524842b;
        fVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendAddBrandFromTimeline", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        if (fVar2.f507381c != null && (kVar = fVar2.f507385g) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f121498a)) {
            android.content.Context context = fVar2.f507381c;
            fVar2.f507384f = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), fVar2.f507381c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j7k), true, true, null);
            com.p314xaae8f345.mm.p944x882e457a.m1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y.a(fVar2.f507385g.f121498a, new u94.c(fVar2, i17, null), i17);
            if (a17 instanceof ab0.s) {
                gm0.j1.d().g(a17);
            } else if (a17 instanceof ns.l) {
                gm0.j1.d().g(a17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendAddBrandFromTimeline", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleAddBrand", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendAddBrandFromTimeline", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleAddBrand", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:336|(2:337|338)|(19:346|347|(3:359|360|(1:362))|349|350|351|352|353|354|115|116|81|82|83|84|85|(3:49|(1:53)|54)|55|(1:57))(1:340)|341|342|115|116|81|82|83|84|85|(0)|55|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:336|337|338|(19:346|347|(3:359|360|(1:362))|349|350|351|352|353|354|115|116|81|82|83|84|85|(3:49|(1:53)|54)|55|(1:57))(1:340)|341|342|115|116|81|82|83|84|85|(0)|55|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x085d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x085e, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0941, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0942, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0944, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0945, code lost:
    
        r4 = r37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x00e9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x08d0 A[Catch: Exception -> 0x08ae, TRY_LEAVE, TryCatch #1 {Exception -> 0x08ae, blocks: (B:93:0x08a5, B:27:0x08b6, B:29:0x08ba, B:31:0x08be, B:33:0x08c8, B:35:0x08d0, B:69:0x08ee, B:72:0x08f8), top: B:92:0x08a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0902 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0974 A[Catch: Exception -> 0x09b5, TryCatch #6 {Exception -> 0x09b5, blocks: (B:47:0x095d, B:49:0x0974, B:51:0x0978, B:53:0x097d, B:54:0x09a6, B:55:0x09a9, B:57:0x09ad), top: B:46:0x095d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x09ad A[Catch: Exception -> 0x09b5, TRY_LEAVE, TryCatch #6 {Exception -> 0x09b5, blocks: (B:47:0x095d, B:49:0x0974, B:51:0x0978, B:53:0x097d, B:54:0x09a6, B:55:0x09a9, B:57:0x09ad), top: B:46:0x095d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x08a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r39v0, types: [w64.n] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v109 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v110 */
    /* JADX WARN: Type inference failed for: r4v111 */
    /* JADX WARN: Type inference failed for: r4v112 */
    /* JADX WARN: Type inference failed for: r4v113 */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v116 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v124 */
    /* JADX WARN: Type inference failed for: r4v125 */
    /* JADX WARN: Type inference failed for: r4v126 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v35, types: [com.tencent.mm.modelsns.SnsAdClick] */
    /* JADX WARN: Type inference failed for: r5v36, types: [com.tencent.mm.modelsns.SnsAdClick] */
    /* JADX WARN: Type inference failed for: r5v37, types: [com.tencent.mm.modelsns.SnsAdClick] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43, types: [com.tencent.mm.modelsns.SnsAdClick] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [com.tencent.mm.modelsns.SnsAdClick] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v92 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r9v23, types: [n44.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(android.view.View r40) {
        /*
            Method dump skipped, instructions count: 2610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w64.n.k(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int l(android.view.View r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad r54, int r55) {
        /*
            Method dump skipped, instructions count: 1935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w64.n.l(android.view.View, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.modelsns.SnsAdClick, int):int");
    }

    public void m(com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleQuickAddFinder", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickActionHandler", "onClick handleQuickAddFinder");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ui(this.f524848h.f38004xa53ddf1c, new w64.i(this, c11137xb05b06ad), 4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleQuickAddFinder", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public void n(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        p(new w64.c(c17702x544f64e9, c17933xe8d1b226, 0, null, false, 0, false, null, 252, null));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public void o(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        p(new w64.c(c17702x544f64e9, c17933xe8d1b226, i17, null));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public void p(w64.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f524848h = cVar.f524817a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f524844d = cVar.f524818b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f524848h;
        if (c17702x544f64e9 != null) {
            this.f524841a = c17702x544f64e9.f244102a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubClickPos", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubClickPos", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f524843c = cVar.f524819c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f524846f = cVar.f524820d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getForceUseNormalAnim", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getForceUseNormalAnim", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f524847g = cVar.f524821e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNativeSightType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNativeSightType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f524853m = cVar.f524822f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUseExternalClickType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUseExternalClickType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f524854n = cVar.f524823g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f524855o = cVar.f524824h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public void r(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.app.Activity activity, int i17, android.view.View view, com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad, int i18) {
        java.lang.String str;
        java.lang.String str2;
        w64.l lVar;
        w64.m mVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpNativeLandingPageUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpNativeLandingPageUI, snsId=");
        sb6.append(c17933xe8d1b226 == null ? 0L : c17933xe8d1b226.f68891x29d1292e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickActionHandler", sb6.toString());
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpNativeLandingPageUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return;
        }
        android.content.Intent h17 = h(c17933xe8d1b226, activity, i17, view, i18);
        if (h17 != null) {
            boolean z17 = c17933xe8d1b226.m70354x74235b3e().f38248xdb8989da;
            if (this.f524851k == null && (mVar = this.f524860t) != null) {
                this.f524851k = mVar.a();
            }
            w64.x xVar = this.f524851k;
            if (!((xVar == null || xVar.f() == null) ? false : this.f524851k.f().U(this.f524851k, z17)) && (lVar = this.f524852l) != null) {
                lVar.a();
            }
            if (this.f524857q == 2 && this.f524841a == 1) {
                h17.putExtra("sns_landing_pages_auto_download_for_action_btn", true);
            }
            w64.x.g(h17, this.f524851k, z17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(h17);
            java.util.Collections.reverse(arrayList);
            str = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler";
            str2 = "jumpNativeLandingPageUI";
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler", "jumpNativeLandingPageUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Landroid/app/Activity;ILandroid/view/View;Lcom/tencent/mm/modelsns/SnsAdClick;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler", "jumpNativeLandingPageUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Landroid/app/Activity;ILandroid/view/View;Lcom/tencent/mm/modelsns/SnsAdClick;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            w64.x xVar2 = this.f524851k;
            if (xVar2 == null || xVar2.l() == 0) {
                int i19 = this.f524841a;
                if (i19 == 10) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
                    return;
                }
                if (i19 == 7 || i19 == 8 || i19 == 13 || i19 == 14) {
                    if (!z17) {
                        activity.overridePendingTransition(0, 0);
                    }
                } else if (i19 != 18 && i19 != 22) {
                    activity.overridePendingTransition(0, 0);
                }
            } else if (!z17 && w64.x.h(this.f524851k)) {
                activity.overridePendingTransition(0, 0);
            }
        } else {
            str = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler";
            str2 = "jumpNativeLandingPageUI";
            s(this.f524844d, c11137xb05b06ad, this.f524842b, this.f524845e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void u(android.view.View view, com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad) {
        java.lang.String str;
        java.lang.String str2;
        android.content.Context context;
        int i17;
        java.lang.String str3;
        java.lang.String str4;
        boolean z17;
        java.lang.String str5;
        android.content.Intent intent;
        java.lang.String str6;
        i64.b1 b1Var;
        int i18;
        int i19;
        int i27;
        int i28;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openVangogh", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        boolean a17 = m54.v.a();
        android.content.Context context2 = this.f524845e;
        int i29 = this.f524842b;
        if (a17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f524844d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f524848h;
            int i37 = this.f524843c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createIntent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
            if (c17933xe8d1b226 == null || c17702x544f64e9 == null || (b1Var = this.f524849i) == null) {
                str = "openVangogh";
                str2 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler";
                context = context2;
                i17 = i29;
                str3 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher";
                str4 = "";
                z17 = true;
                str5 = "SnsAd.LandPageLauncher";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str5, "the sns info , click info or ad stat is null!!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createIntent", str3);
                intent = null;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("generateIntent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
                str4 = "";
                long j17 = c17702x544f64e9.f244135q0;
                java.lang.String str7 = c17702x544f64e9.f244137r0;
                str = "openVangogh";
                if (str7 == null) {
                    str7 = str4;
                }
                java.lang.String str8 = c17702x544f64e9.f244141t0;
                if (str8 == null) {
                    str8 = str4;
                }
                int i38 = c17702x544f64e9.f244102a;
                str2 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler";
                if (i38 == 10) {
                    i19 = 9;
                    i18 = 1;
                } else {
                    i18 = 1;
                    i19 = 1;
                }
                if (i29 != i18) {
                    if (i29 == 2) {
                        i19 = 16;
                    }
                    i27 = i19;
                } else {
                    i27 = 2;
                }
                if (i38 == 10 && i29 == 1) {
                    i17 = i29;
                    i28 = 10;
                } else {
                    i28 = i27;
                    i17 = i29;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
                context = context2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
                r45.a90 a90Var = m70371x485d7.f39014x86965dde;
                boolean z19 = (a90Var != null && a90Var.f451370e == 15) && m70371x485d7.f39035x65f3785d != 1;
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("sns_landing_pages_share_sns_id", c17933xe8d1b226.m70367x7525eefd());
                intent2.putExtra("sns_landing_pages_rawSnsId", c17933xe8d1b226.f68891x29d1292e);
                intent2.putExtra("sns_landing_pages_ux_info", c17933xe8d1b226.m70375x338a8cc7());
                intent2.putExtra("sns_landing_pages_pageid", j17);
                intent2.putExtra("sns_landing_page_canvas_dynamicinfo", str7);
                intent2.putExtra("sns_landing_page_canvas_ext_dynamicinfo", str8);
                intent2.putExtra("sns_landig_pages_from_source", i28);
                intent2.putExtra("sns_landing_is_native_sight_ad", z19);
                intent2.putExtra("sns_landing_pages_from_outer_index", i37);
                intent2.putExtra("sns_landing_pages_aid", c17933xe8d1b226.m70355xb5882a06());
                intent2.putExtra("sns_landing_pages_traceid", c17933xe8d1b226.m70372xfe2dfcea());
                if (i38 == 8 || i38 == 10) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70354x74235b3e, "getAdXml(...)");
                    z18 = true;
                    z18 = true;
                    if (m70354x74235b3e.f38218xd253a6b3) {
                        intent2.putExtra("sns_landing_page_sight_video_seek_time", b1Var.g(c17933xe8d1b226.f68891x29d1292e));
                    }
                } else {
                    z18 = true;
                }
                if (i38 == z18) {
                    intent2.putExtra("sns_landing_pages_auto_download_for_action_btn", z18);
                }
                str3 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateIntent", str3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createIntent", str3);
                intent = intent2;
                str5 = "SnsAd.LandPageLauncher";
                z17 = z18;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f524844d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e92 = this.f524848h;
            w64.j jVar = new w64.j(this, view, c11137xb05b06ad);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launch", str3);
            if (context == null || c17933xe8d1b2262 == null || c17702x544f64e92 == null || intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str5, "the context, sns info , click info , click data is null!!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launch", str3);
            } else {
                android.content.Context context3 = context;
                if (context3 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                    try {
                        m54.a aVar = m54.a.f405774a;
                        long j18 = c17933xe8d1b2262.f68891x29d1292e;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putSnsInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicAdSnsInfoLoader");
                        if (j18 == 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putSnsInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicAdSnsInfoLoader");
                        } else {
                            m54.a.f405775b.put(java.lang.Long.valueOf(j18), c17933xe8d1b2262);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putSnsInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicAdSnsInfoLoader");
                        }
                        int i39 = i17 == 0 ? z17 : 2;
                        long j19 = c17702x544f64e92.f244135q0;
                        java.lang.String str9 = c17702x544f64e92.f244137r0;
                        java.lang.String str10 = str9 == null ? str4 : str9;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b2262.m70346x10413e67();
                        java.lang.String str11 = m70346x10413e67 != null ? m70346x10413e67.f38104xce64ddf1 : null;
                        if (str11 == null) {
                            str11 = str4;
                        }
                        java.lang.String str12 = c17702x544f64e92.f244141t0;
                        if (str12 == null) {
                            str12 = str4;
                        }
                        str6 = "launch";
                        try {
                            m54.f.f405798a.b((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context3, j19, str10, str12, null, str11, i39, intent, jVar);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str5, "launch canvas: there is an exception " + th.getMessage());
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str3);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        str6 = "launch";
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str3);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str5, "the context is not AppCompatActivity");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launch", str3);
                }
            }
        } else {
            str = "openVangogh";
            str2 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler";
            try {
                java.lang.String str13 = this.f524844d.m70347x10413e67(i29).f38104xce64ddf1;
                if (context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e93 = this.f524848h;
                    a84.o0.i(c17702x544f64e93.f244135q0, this.f524842b, str13, c17702x544f64e93.f244137r0, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, this.f524844d, this.f524849i, this.f524843c, view, this.f524846f, c17702x544f64e93.f244102a, this.f524853m, c11137xb05b06ad, null);
                }
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdClickActionHandler", "there is something exception");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }

    public final void v(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendSubscribeInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new w64.f(this, context, c17702x544f64e9, c17933xe8d1b226, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendSubscribeInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public void w(w64.k kVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdClickActionStateChangeListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        this.f524850j = kVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdClickActionStateChangeListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public void x(w64.x xVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        this.f524851k = xVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }
}
