package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class xn implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f218013c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f218015e;

    public xn(int i17, java.lang.String str, android.widget.TextView textView, java.lang.String str2, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f218011a = i17;
        this.f218012b = str;
        this.f218013c = textView;
        this.f218014d = str2;
        this.f218015e = c19786x6a1e2862;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w
    public final void a(java.lang.String str) {
        java.lang.String str2 = this.f218012b;
        android.widget.TextView textView = this.f218013c;
        int i17 = this.f218011a;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            j45.l.j(textView.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (i17 == 1) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = this.f218014d;
            b1Var.f398555f = str2;
            b1Var.f398565k = 1205;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(textView.getContext(), b1Var);
            return;
        }
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveIncomeListUIC", "invalid actionType:" + i17);
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f218015e;
        if (c19786x6a1e2862 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveIncomeListUIC", "invalid jumpInfo is null");
            return;
        }
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        xc2.y2.i(y2Var, context, new xc2.p0(c19786x6a1e2862), 0, null, 8, null);
    }
}
