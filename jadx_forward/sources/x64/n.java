package x64;

/* loaded from: classes4.dex */
public final class n implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f533841a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f533842b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f533843c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f533844d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f533845e;

    /* renamed from: f, reason: collision with root package name */
    public final int f533846f;

    /* renamed from: g, reason: collision with root package name */
    public final int f533847g;

    public n(java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, java.lang.ref.WeakReference weakReference3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, int i18, java.lang.String str) {
        this.f533841a = weakReference;
        this.f533842b = weakReference2;
        this.f533843c = weakReference3;
        this.f533844d = c17702x544f64e9;
        this.f533845e = c17933xe8d1b226;
        this.f533846f = i17;
        this.f533847g = i18;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        android.content.Context context;
        android.view.View view;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback");
        java.lang.ref.WeakReference weakReference = this.f533842b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = weakReference != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) weakReference.get() : null;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        j41.u uVar = i0Var != null ? i0Var.f379176d : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchConfirmInfo onFinish, isValid: ");
        sb6.append(uVar != null ? java.lang.Boolean.valueOf(((k41.g0) uVar).f385529p1) : null);
        sb6.append(", confirmType: ");
        sb6.append(i0Var != null ? java.lang.Integer.valueOf(i0Var.f379177e) : null);
        sb6.append(", ");
        sb6.append(uVar != null ? ((k41.g0) uVar).t0() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdJumpWxKefuClick", sb6.toString());
        java.lang.ref.WeakReference weakReference2 = this.f533841a;
        if (weakReference2 == null || (context = (android.content.Context) weakReference2.get()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback");
            return;
        }
        java.lang.ref.WeakReference weakReference3 = this.f533843c;
        if (weakReference3 == null || (view = (android.view.View) weakReference3.get()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback");
            return;
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && activity.isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdJumpWxKefuClick", "fetchConfirmInfo, isFinishing return");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback");
            return;
        }
        if (uVar != null && ((k41.g0) uVar).f385529p1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f533844d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17703x743924d4 c17703x743924d4 = c17702x544f64e9 != null ? c17702x544f64e9.A0 : null;
            if (c17703x743924d4 != null) {
                java.lang.String str5 = ((k41.g0) uVar).f68609x68aa51e1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setKefuIconUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
                c17703x743924d4.f244157g = str5;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setKefuIconUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17703x743924d4 c17703x743924d42 = c17702x544f64e9 != null ? c17702x544f64e9.A0 : null;
            if (c17703x743924d42 != null) {
                java.lang.String str6 = ((k41.g0) uVar).f68604x21f9b213;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setKefuNickname", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
                c17703x743924d42.f244158h = str6;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setKefuNickname", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17703x743924d4 c17703x743924d43 = c17702x544f64e9 != null ? c17702x544f64e9.A0 : null;
            if (c17703x743924d43 != null) {
                java.lang.String str7 = ((k41.g0) uVar).f68607xd03b1ae9;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOpenImAppId", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
                c17703x743924d43.f244159i = str7;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOpenImAppId", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17703x743924d4 c17703x743924d44 = c17702x544f64e9 != null ? c17702x544f64e9.A0 : null;
            if (c17703x743924d44 != null) {
                java.lang.String str8 = ((k41.g0) uVar).f68608x1223b30f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOpenImDescWordingId", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
                c17703x743924d44.f244160m = str8;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOpenImDescWordingId", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
            }
            boolean z17 = c17702x544f64e9 != null && c17702x544f64e9.f244108d == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f533845e;
            if (z17) {
                n44.p pVar = new n44.p();
                int i17 = this.f533847g;
                int i18 = this.f533846f;
                str = "onFinish";
                str2 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openHalfScreenKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                if (!(c17702x544f64e9 == null)) {
                    if (!(c17933xe8d1b226 == null)) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e67 = c17933xe8d1b226.m70347x10413e67(i18);
                        if (m70347x10413e67 != null) {
                            str4 = m70347x10413e67.f38104xce64ddf1;
                            str3 = "kefu_url";
                        } else {
                            str3 = "kefu_url";
                            str4 = null;
                        }
                        java.lang.String m70355xb5882a06 = c17933xe8d1b226.m70355xb5882a06();
                        java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenJumpHelper", "openHalfScreenKefuConfirmUI, snsId is " + t07 + ", uxInfo is " + str4 + ", aid is " + m70355xb5882a06);
                        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                            if (!(str4 == null || str4.length() == 0)) {
                                if (!(t07 == null || t07.length() == 0)) {
                                    android.content.Intent b17 = pVar.b(view, m70371x485d7, i17, m70355xb5882a06, str4, t07, i18);
                                    if (b17 == null) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openHalfScreenKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                    } else {
                                        b17.putExtra("scroll_to_top", 0);
                                        b17.putExtra("click_action_type", c17702x544f64e9.f244104b);
                                        b17.putExtra("is_half_screen_height_assigned", 1);
                                        b17.putExtra("kefu_confirm_info", c17702x544f64e9.A0);
                                        b17.putExtra(str3, c17702x544f64e9.f244131o0);
                                        b17.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.class);
                                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add(b17);
                                        java.util.Collections.reverse(arrayList);
                                        yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenJumpHelper", "openHalfScreenKefuConfirmUI", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;IILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
                                        yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenJumpHelper", "openHalfScreenKefuConfirmUI", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;IILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        abstractActivityC21394xb3d2c0cf.overridePendingTransition(0, 0);
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openHalfScreenKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                    }
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openHalfScreenKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openHalfScreenKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHalfScreenJumpHelper", "openHalfScreenKefuConfirmUI, click view or clickActionInfo or snsInfo is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openHalfScreenKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
            } else {
                str = "onFinish";
                str2 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                if (!(c17702x544f64e9 == null)) {
                    if (!(c17933xe8d1b226 == null)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17933xe8d1b226.m70371x485d7(), "getTimeLine(...)");
                        int i19 = this.f533846f;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e672 = c17933xe8d1b226.m70347x10413e67(i19);
                        java.lang.String str9 = m70347x10413e672 != null ? m70347x10413e672.f38104xce64ddf1 : null;
                        java.lang.String m70355xb5882a062 = c17933xe8d1b226.m70355xb5882a06();
                        java.lang.String t08 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdJumpWxKefuClick", "openKefuConfirmUI, snsId is " + t08 + ", uxInfo is " + str9 + ", aid is " + m70355xb5882a062);
                        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                            if (!(str9 == null || str9.length() == 0)) {
                                if (!(t08 == null || t08.length() == 0)) {
                                    android.content.Intent intent = new android.content.Intent();
                                    intent.putExtra("ad_uxInfo", str9);
                                    intent.putExtra("ad_source", i19);
                                    intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13303xfe2b0e92, 0);
                                    intent.putExtra("click_action_type", c17702x544f64e9.f244104b);
                                    intent.putExtra("kefu_confirm_info", c17702x544f64e9.A0);
                                    intent.putExtra("kefu_url", c17702x544f64e9.f244131o0);
                                    intent.putExtra("scroll_to_top", 0);
                                    intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17747xd7fb98e8.class);
                                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    arrayList2.add(intent);
                                    java.util.Collections.reverse(arrayList2);
                                    yj0.a.d(abstractActivityC21394xb3d2c0cf2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/impl/AdJumpWxKefuClick", "openKefuConfirmUI", "(Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    abstractActivityC21394xb3d2c0cf2.startActivity((android.content.Intent) arrayList2.get(0));
                                    yj0.a.f(abstractActivityC21394xb3d2c0cf2, "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/impl/AdJumpWxKefuClick", "openKefuConfirmUI", "(Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdJumpWxKefuClick", "openKefuConfirmUI, click view or clickActionInfo or snsInfo is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            }
        } else {
            str = "onFinish";
            str2 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback";
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1903, 15);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("contact is not valid, errType is ");
            sb7.append(i0Var != null ? java.lang.Integer.valueOf(i0Var.f379173a) : null);
            sb7.append(", errCode is ");
            sb7.append(i0Var != null ? java.lang.Integer.valueOf(i0Var.f379174b) : null);
            sb7.append(", errMsg is ");
            sb7.append(i0Var != null ? i0Var.f379175c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdJumpWxKefuClick", sb7.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }

    @Override // j41.w
    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTryFetch", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdJumpWxKefuClick", "onTryFetch username: %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTryFetch", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback");
    }
}
