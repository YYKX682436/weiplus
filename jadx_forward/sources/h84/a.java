package h84;

/* loaded from: classes4.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h84.h f361090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s34.c1 f361091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f361092f;

    public a(h84.h hVar, s34.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f361090d = hVar;
        this.f361091e = c1Var;
        this.f361092f = c17933xe8d1b226;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent$bindComponentModel$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adgamegift/AdWxaGameGiftTagComponent$bindComponentModel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h84.h hVar = this.f361090d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.j(), "click mWxaGameGiftTagViewContent");
        s34.c1 c1Var = this.f361091e;
        if (c1Var.a() != null) {
            c1Var.a().f244102a = 20;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
            w64.n nVar = hVar.f361100p;
            if (nVar != null) {
                nVar.p(new w64.c(c1Var.a(), this.f361092f, 0, null, false, 0, false, null, 252, null));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
            if (nVar != null) {
                nVar.k(view);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adgamegift/AdWxaGameGiftTagComponent$bindComponentModel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent$bindComponentModel$3");
    }
}
