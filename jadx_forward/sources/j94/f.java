package j94;

/* loaded from: classes4.dex */
public final class f implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f380082a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f380083b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f380084c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f380085d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.e80 f380086e;

    public f(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, java.lang.String kefuUrl, java.lang.String uxInfo, r45.e80 confirmInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kefuUrl, "kefuUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uxInfo, "uxInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confirmInfo, "confirmInfo");
        this.f380082a = context;
        this.f380083b = u3Var;
        this.f380084c = kefuUrl;
        this.f380085d = uxInfo;
        this.f380086e = confirmInfo;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper$FoldAdGetContactCallback");
        try {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f380083b;
            if (u3Var != null) {
                u3Var.dismiss();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WsFoldJumpWxKefuHelper", "onFinish dismiss progressDialog exp=%s", th6.toString());
        }
        j41.u uVar = i0Var != null ? i0Var.f379176d : null;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = uVar != null ? java.lang.Boolean.valueOf(((k41.g0) uVar).f385529p1) : null;
        objArr[1] = java.lang.Integer.valueOf(i0Var != null ? i0Var.f379177e : -1);
        objArr[2] = java.lang.Integer.valueOf(i0Var != null ? i0Var.f379173a : -1);
        objArr[3] = java.lang.Integer.valueOf(i0Var != null ? i0Var.f379174b : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldJumpWxKefuHelper", "onFinish, isValid=%s, confirmType=%d, errType=%d, errCode=%d", objArr);
        android.content.Context context = this.f380082a;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && activity.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WsFoldJumpWxKefuHelper", "onFinish, context isFinishing, return");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper$FoldAdGetContactCallback");
            return;
        }
        if (!(uVar != null && ((k41.g0) uVar).f385529p1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1903L, 15L);
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = java.lang.Integer.valueOf(i0Var != null ? i0Var.f379173a : -1);
            objArr2[1] = java.lang.Integer.valueOf(i0Var != null ? i0Var.f379174b : -1);
            objArr2[2] = i0Var != null ? i0Var.f379175c : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WsFoldJumpWxKefuHelper", "onFinish, contact is not valid, errType=%d, errCode=%d, errMsg=%s", objArr2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper$FoldAdGetContactCallback");
            return;
        }
        r45.e80 e80Var = this.f380086e;
        java.lang.String str = e80Var.f454625d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = e80Var.f454626e;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = e80Var.f454627f;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String str6 = ((k41.g0) uVar).f68609x68aa51e1;
        java.lang.String str7 = str6 == null ? "" : str6;
        k41.g0 g0Var = (k41.g0) uVar;
        java.lang.String str8 = g0Var.f68604x21f9b213;
        java.lang.String str9 = str8 == null ? "" : str8;
        java.lang.String str10 = g0Var.f68607xd03b1ae9;
        java.lang.String str11 = str10 == null ? "" : str10;
        java.lang.String str12 = g0Var.f68608x1223b30f;
        try {
            j94.g.a(j94.g.f380087a, context, this.f380084c, this.f380085d, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17703x743924d4(str2, str4, str5, str7, str9, str11, str12 == null ? "" : str12));
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WsFoldJumpWxKefuHelper", "onFinish, jumpToConfirmPage exp=%s", th7.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper$FoldAdGetContactCallback");
    }

    @Override // j41.w
    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTryFetch", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper$FoldAdGetContactCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldJumpWxKefuHelper", "onTryFetch, username=%s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTryFetch", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpWxKefuHelper$FoldAdGetContactCallback");
    }
}
