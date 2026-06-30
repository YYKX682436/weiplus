package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsUploadV2SayFooter;", "Lcom/tencent/mm/plugin/sns/ui/widget/AbsSnsUploadSayFooter;", "", "getSoftInputMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter */
/* loaded from: classes4.dex */
public final class C18139x1f77f311 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f249124u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f249125v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18139x1f77f311(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f249124u = "MicroMsg.SnsUploadV2SayFooter";
    }

    public static final /* synthetic */ java.lang.String i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18139x1f77f311 c18139x1f77f311) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        java.lang.String str = c18139x1f77f311.f249124u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        return str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(this.f252289f);
        android.view.ViewGroup.LayoutParams layoutParams = this.f252290g.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = g17;
        }
        this.f252290g.setLayoutParams(layoutParams);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f249124u, "refreshBottomPanelHeight: smileyPanel height=%d", java.lang.Integer.valueOf(g17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf
    public void d(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshUIOnInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        if (this.f252295o != i17 && i17 != 0) {
            this.f252295o = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            fp.w.m(getContext(), i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            c();
        }
        if (z17) {
            f();
        } else {
            e();
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ju(this, z17, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUIOnInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.AbstractC22647xb041ad02
    /* renamed from: getSoftInputMode */
    public int mo70813x19d607cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSoftInputMode", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        int i17 = com.p314xaae8f345.mm.ui.b4.c(this.f252289f) ? 32 : 18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSoftInputMode", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(hc1.i.f69827x24728b, "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        this.f252296p = true;
        this.f252290g.i();
        m81438xb2a7481e().e(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lu(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(hc1.i.f69827x24728b, "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
    }
}
