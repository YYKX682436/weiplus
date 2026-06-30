package wd4;

/* loaded from: classes4.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 f526460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f526461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 abstractC17957x723314d2, int i17) {
        super(1);
        this.f526460d = abstractC17957x723314d2;
        this.f526461e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markTokenDone, token: ");
        int i17 = this.f526461e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", sb6.toString());
        java.util.WeakHashMap weakHashMap = wd4.j0.f526469a;
        if (weakHashMap == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 abstractC17957x723314d2 = this.f526460d;
            java.util.HashSet hashSet = (java.util.HashSet) weakHashMap.get(abstractC17957x723314d2);
            if (hashSet == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            } else {
                if (hashSet.remove(java.lang.Integer.valueOf(i17)) && hashSet.isEmpty() && weakHashMap.remove(abstractC17957x723314d2) != null && weakHashMap.isEmpty()) {
                    wd4.j0.f526469a = null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        return f0Var;
    }
}
