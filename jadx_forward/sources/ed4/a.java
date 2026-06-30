package ed4;

/* loaded from: classes4.dex */
public class a implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 f332815a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 abstractC18285x291d0ca5) {
        this.f332815a = abstractC18285x291d0ca5;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 abstractC18285x291d0ca5 = this.f332815a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAdTagClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$4");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdTagClickableHelper", th6.toString());
        }
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdTagClickableHelper", "BaseTimeLineItem, position < 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdTagClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$4");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17 = abstractC18285x291d0ca5.f250784h.c(i17);
        if (c17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdTagClickableHelper", "BaseTimeLineItem position = " + i17 + ", snsId = " + c17.f68891x29d1292e + ", source = SOURCE_TIMELINE , clickPos = " + i18);
            n74.o0.c(abstractC18285x291d0ca5.f250782f, 0, c17, i18);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdTagClickableHelper", "BaseTimeLineItem, snsInfo is null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdTagClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$4");
    }
}
