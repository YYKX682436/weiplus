package ga4;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f351451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f351452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f351453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f351454g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(1);
        this.f351451d = j17;
        this.f351452e = i17;
        this.f351453f = i18;
        this.f351454g = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2");
        java.lang.String keyword = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKeywordMatcher", "click keyword:".concat(keyword));
        zy2.kb kbVar = (zy2.kb) ga4.m.a().get(keyword);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", 9);
        intent.putExtra("key_hot_word", keyword);
        intent.putExtra("key_jump_scene", 0);
        intent.putExtra("key_pass_by_info", kbVar != null ? kbVar.f558981e : null);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 17, 115, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).kl(context);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new ga4.e(this.f351451d, this.f351452e, keyword, this.f351453f, this.f351454g));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2");
        return f0Var;
    }
}
