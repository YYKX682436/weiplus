package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class a5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f184387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f184388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184389f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str) {
        super(1);
        this.f184387d = context;
        this.f184388e = abstractC14490x69736cb5;
        this.f184389f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ec2.d e27;
        java.lang.String txt = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(txt, "txt");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c5 c5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185858i;
        if (!c5Var.k()) {
            android.content.Context context = this.f184387d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            boolean z17 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            int i17 = nyVar != null ? nyVar.f216913n : 0;
            android.content.Intent intent = new android.content.Intent();
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            java.lang.String str = this.f184389f;
            java.lang.String a17 = c5Var.a(str, 156, i17 + 10000, currentTimeMillis);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedCommentHeaderConvert", "click linkLayout, url:" + str + ", urlWithReportParams:" + a17);
            intent.putExtra("rawUrl", a17);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar2 != null && (e27 = zy2.ra.e2(nyVar2, 0, 1, null)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f184388e;
                e27.a(new ec2.a(19, abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w()));
            }
        }
        return jz5.f0.f384359a;
    }
}
