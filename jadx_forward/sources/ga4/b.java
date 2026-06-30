package ga4;

/* loaded from: classes.dex */
public final class b extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f351437d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f351438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String keyword, int i17) {
        super(i17, (r35.m3) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        this.f351437d = keyword;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$KeywordClickableSpan");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/keywords/SnsKeywordMatcher$KeywordClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        yz5.l lVar = this.f351438e;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f351437d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/keywords/SnsKeywordMatcher$KeywordClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$KeywordClickableSpan");
    }
}
