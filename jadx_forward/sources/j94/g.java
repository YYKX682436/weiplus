package j94;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final j94.g f380087a = new j94.g();

    public static final void a(j94.g gVar, android.content.Context context, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17703x743924d4 c17703x743924d4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$jumpToConfirmPage", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
        gVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToConfirmPage", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("click_action_type", 18);
        intent.putExtra("ad_uxInfo", str2);
        intent.putExtra("ad_source", 0);
        intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13303xfe2b0e92, 0);
        intent.putExtra("kefu_confirm_info", c17703x743924d4);
        intent.putExtra("kefu_url", str);
        intent.putExtra("scroll_to_top", 0);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17747xd7fb98e8.class);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/wsfold/helper/WsFoldJumpWxKefuHelper", "jumpToConfirmPage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/ad/adxml/AdJumpKefuConfirmInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/ad/wsfold/helper/WsFoldJumpWxKefuHelper", "jumpToConfirmPage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/ad/adxml/AdJumpKefuConfirmInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToConfirmPage", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$jumpToConfirmPage", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
    }

    public final void b(android.content.Context context, java.lang.String str, java.lang.String str2, r45.e80 e80Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fetchContactThenJump", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
        java.lang.String str3 = "ADKEFU_" + str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldJumpWxKefuHelper", "fetchContactThenJump, prefixedUrl=%s", str3);
        j41.h0 h0Var = new j41.h0(23, "", str3);
        h0Var.f379168e = true;
        h0Var.f379170g = null;
        h0Var.f379171h = null;
        if (context instanceof android.app.Activity) {
            try {
                Q = db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), false, true, null);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WsFoldJumpWxKefuHelper", "showProgressDlg exp=%s", th6.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1903L, 14L);
            j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
            j94.f fVar = new j94.f(context, Q, str, str2, e80Var);
            ((l41.b2) yVar).getClass();
            k41.h1.b(h0Var, new l41.z1(h0Var, fVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchContactThenJump", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
        }
        Q = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1903L, 14L);
        j41.y yVar2 = (j41.y) i95.n0.c(j41.y.class);
        j94.f fVar2 = new j94.f(context, Q, str, str2, e80Var);
        ((l41.b2) yVar2).getClass();
        k41.h1.b(h0Var, new l41.z1(h0Var, fVar2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchContactThenJump", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper");
    }
}
