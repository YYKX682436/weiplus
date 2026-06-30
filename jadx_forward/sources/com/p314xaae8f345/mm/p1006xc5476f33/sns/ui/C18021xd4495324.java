package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsCollapsibleTextView;", "Lcom/tencent/mm/ui/widget/MMCollapsibleTextView;", "", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "Ljz5/f0;", "setCustomText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView */
/* loaded from: classes15.dex */
public final class C18021xd4495324 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22619x353059dc {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18021xd4495324(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22619x353059dc
    public void F() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rightCollapse", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        super.F();
        m81342x1ae1a5dd().j(android.text.TextUtils.TruncateAt.END, C(1.0f) + m81335x2fa1ce35().getMeasuredWidth());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rightCollapse", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22619x353059dc
    public void G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rightExpand", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        super.G();
        m81342x1ae1a5dd().m84166xb86dec4b(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rightExpand", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22619x353059dc
    public void I(java.lang.CharSequence text, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        if (z17) {
            E();
        }
        super.I(text, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
    }

    /* renamed from: setCustomText */
    public final void m70703xbe1e2a40(java.lang.CharSequence charSequence) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCustomText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCustomText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        if (charSequence == null || charSequence.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCustomText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        } else {
            int m81341x40077844 = (int) m81341x40077844();
            if (charSequence instanceof android.text.SpannableStringBuilder) {
                spannableStringBuilder = (android.text.SpannableStringBuilder) charSequence;
                spannableStringBuilder.setSpan(new cd4.a(m81341x40077844), 0, spannableStringBuilder.length(), 33);
            } else {
                android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(charSequence);
                spannableStringBuilder2.setSpan(new cd4.a(m81341x40077844), 0, charSequence.length(), 33);
                spannableStringBuilder = spannableStringBuilder2;
            }
            I(spannableStringBuilder, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCustomText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCustomText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18021xd4495324(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
