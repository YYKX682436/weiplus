package ns4;

/* loaded from: classes2.dex */
public final class c2 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f421014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f421016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f421018e;

    public c2(int i17, java.lang.String str, android.widget.TextView textView, java.lang.String str2, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f421014a = i17;
        this.f421015b = str;
        this.f421016c = textView;
        this.f421017d = str2;
        this.f421018e = c19786x6a1e2862;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w
    public final void a(java.lang.String str) {
        java.lang.String str2 = this.f421015b;
        android.widget.TextView textView = this.f421016c;
        int i17 = this.f421014a;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            j45.l.j(textView.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (i17 == 1) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = this.f421017d;
            b1Var.f398555f = str2;
            b1Var.f398565k = 1205;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(textView.getContext(), b1Var);
            return;
        }
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeCoinIncomeDetailView", "invalid actionType:" + i17);
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info = this.f421018e;
        if (info == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeCoinIncomeDetailView", "invalid jumpInfo is null");
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        xc2.y2 y2Var = xc2.y2.f534876a;
        xc2.p0 p0Var = new xc2.p0(info);
        p0Var.f534785n = 0;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
    }
}
