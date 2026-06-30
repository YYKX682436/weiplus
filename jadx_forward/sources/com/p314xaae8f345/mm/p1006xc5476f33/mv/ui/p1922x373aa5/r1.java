package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class r1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36 f233467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f233468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f233470h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233471i;

    public r1(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36 c16689xafe4de36, java.lang.Long l17, java.lang.String str2, long j17, java.lang.String str3) {
        this.f233466d = str;
        this.f233467e = c16689xafe4de36;
        this.f233468f = l17;
        this.f233469g = str2;
        this.f233470h = j17;
        this.f233471i = str3;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        java.lang.String str = this.f233469g;
        java.lang.Long l17 = this.f233468f;
        long j17 = this.f233470h;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36 c16689xafe4de36 = this.f233467e;
        if (itemId == 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(this.f233466d);
            dp.a.m125853x26a183b(c16689xafe4de36.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571894st, 0).show();
            rm3.a aVar = c16689xafe4de36.f233194g;
            if (aVar != null) {
                aVar.a(l17, str, j17);
                return;
            }
            return;
        }
        if (itemId != 2) {
            return;
        }
        ka0.r0 r0Var = (ka0.r0) i95.n0.c(ka0.r0.class);
        android.content.Context context = c16689xafe4de36.getContext();
        java.lang.String u17 = pm0.v.u(j17);
        ((ja0.o0) r0Var).getClass();
        int i18 = ll3.j2.f400718a;
        java.lang.String format = java.lang.String.format("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fys) + "/security/readtemplate?t=weixin_report/w_type&scene=%d&content_ID=%s&comment_ID=%s", 71, this.f233471i, u17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        rm3.a aVar2 = c16689xafe4de36.f233194g;
        if (aVar2 != null) {
            aVar2.b(l17, str, j17);
        }
    }
}
