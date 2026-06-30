package p44;

/* loaded from: classes4.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99 f433322d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99 abstractC17721xf81e3d99) {
        this.f433322d = abstractC17721xf81e3d99;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$mOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$mOnClickListener$1");
            return;
        }
        java.lang.Object tag = view.getTag();
        p44.c0 c0Var = tag instanceof p44.c0 ? (p44.c0) tag : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99 abstractC17721xf81e3d99 = this.f433322d;
        if (c0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(abstractC17721xf81e3d99.m69359xb5886c64(), "onClick, vh=null");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$mOnClickListener$1");
            return;
        }
        if (!abstractC17721xf81e3d99.isEnabled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(abstractC17721xf81e3d99.m69359xb5886c64(), "onClick, !isEnabled");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$mOnClickListener$1");
            return;
        }
        p44.s h17 = c0Var.h();
        if (h17 != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99.f244246p;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMOnItemClickListener$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            p44.d0 d0Var = abstractC17721xf81e3d99.f244255o;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMOnItemClickListener$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            if (d0Var != null) {
                d0Var.a(view, h17, c0Var.i());
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(abstractC17721xf81e3d99.m69359xb5886c64(), "onClick, itemData=null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$mOnClickListener$1");
    }
}
