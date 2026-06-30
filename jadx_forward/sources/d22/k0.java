package d22;

/* loaded from: classes12.dex */
public final class k0 extends qk.l7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f307385i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f307386j;

    /* renamed from: k, reason: collision with root package name */
    public final int f307387k;

    /* renamed from: l, reason: collision with root package name */
    public final int f307388l;

    /* renamed from: m, reason: collision with root package name */
    public final int f307389m;

    public k0(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 safeEmojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(safeEmojiInfo, "safeEmojiInfo");
        this.f307385i = safeEmojiInfo;
        this.f307386j = "MicroMsg.emoji.MMEmotionMsgBrowseLiteAppLogic";
        this.f307387k = 1;
        this.f307388l = 2;
        this.f307389m = 3;
    }

    public final void a(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.add(this.f445763h);
        intent.putStringArrayListExtra("k_outside_expose_proof_item_list", arrayList);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f445761f)) {
            intent.putExtra("k_username", this.f445758c);
        } else {
            intent.putExtra("k_username", this.f445761f);
        }
        intent.putExtra("k_expose_msg_id", this.f445762g);
        intent.putExtra("k_expose_msg_type", 47);
        intent.putExtra("showShare", false);
        java.lang.String KExposeH5Url = com.p314xaae8f345.mm.ui.n2.f290931a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KExposeH5Url, "KExposeH5Url");
        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{51}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void b(android.content.Context viewContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewContext, "viewContext");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(viewContext, 1, false);
        k0Var.f293405n = new d22.i0(this);
        k0Var.f293414s = new d22.j0(this, viewContext);
        k0Var.v();
    }

    public final void c(int i17) {
        int i18 = this.f445756a != 9 ? 2 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f307385i;
        g0Var.d(12789, valueOf, c21053xdbf1e5f4.mo42933xb5885648(), java.lang.Integer.valueOf(i18), c21053xdbf1e5f4.f68657xb76d85ab, c21053xdbf1e5f4.f68663x861009b5, this.f445758c, java.lang.String.valueOf(this.f445756a + 100000), "", "", c21053xdbf1e5f4.f68641x3342accf, this.f445759d, null, "");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        return false;
    }
}
