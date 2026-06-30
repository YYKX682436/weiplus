package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/TimelineRandomPickCardView;", "Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView */
/* loaded from: classes4.dex */
public final class C17722xf4627fba extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99 {

    /* renamed from: q, reason: collision with root package name */
    public android.animation.Animator f244256q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.Animator f244257r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f244258s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17722xf4627fba(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelLastAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m69359xb5886c64(), "cancelLastAnim");
        android.animation.Animator animator = this.f244256q;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.Animator animator2 = this.f244257r;
        if (animator2 != null) {
            animator2.cancel();
        }
        java.util.List list = this.f244258s;
        if (!(list == null || list.isEmpty())) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((android.animation.Animator) it.next()).cancel();
            }
        }
        java.util.List<p44.c0> m69357xc1ad766d = m69357xc1ad766d();
        if (!(m69357xc1ad766d == null || m69357xc1ad766d.isEmpty())) {
            java.util.Iterator<p44.c0> it6 = m69357xc1ad766d().iterator();
            while (it6.hasNext()) {
                a(it6.next());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelLastAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99
    public void h(p44.c0 vh6, p44.s itemData, p44.u cardInfo) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initItem", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vh6, "vh");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardInfo, "cardInfo");
        android.widget.TextView g17 = vh6.g();
        if (g17 != null) {
            g17.setText(itemData.e());
            if (itemData.g()) {
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleColorPickedDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                    i18 = cardInfo.f433390d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleColorPickedDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleColorPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                    i18 = cardInfo.f433389c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleColorPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                }
                g17.setTextColor(i18);
            } else {
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleColorAvailableDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                    i17 = cardInfo.f433388b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleColorAvailableDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleColorAvailable", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                    i17 = cardInfo.f433387a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleColorAvailable", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                }
                g17.setTextColor(i17);
            }
        }
        android.widget.ImageView d17 = vh6.d();
        if (d17 != null) {
            d17.setImageResource(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f81087x39b02589 : com.p314xaae8f345.mm.R.raw.f81088x4eaf54fb);
        }
        android.widget.ImageView e17 = vh6.e();
        if (e17 != null) {
            a84.z.e(itemData.f76387xccc36214, e17);
            e17.setRotationY(0.0f);
        }
        android.widget.ImageView b17 = vh6.b();
        if (b17 != null) {
            a84.z.e(cardInfo.f76388xc65d0d62, b17);
            b17.setRotationY(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initItem", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99
    public int k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
        int m69356x1d9f755c = (int) ((m69356x1d9f755c() * i17) / 298.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
        return m69356x1d9f755c;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0521 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0543 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(boolean r45) {
        /*
            Method dump skipped, instructions count: 2656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17722xf4627fba.n(boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17722xf4627fba(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        m69366xca0293d8("TimelineRandomPickCardView");
    }
}
