package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.BaseRangeWidget */
/* loaded from: classes4.dex */
public abstract class AbstractC17949x28e47a30 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f247782d;

    public AbstractC17949x28e47a30(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f247782d = false;
    }

    public abstract void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 c18131x711b760);

    public abstract boolean b(int i17, int i18, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17947x83d458f1 c17947x83d458f1);

    /* renamed from: getLabelRange */
    public abstract int mo70559x8b2fba9f();

    /* renamed from: getSnsVisibilityData */
    public abstract bw5.nk0 mo70560xbaf30cbe();

    /* renamed from: setRangeTipClickListener */
    public abstract void mo70561xb720519c(android.view.View.OnClickListener onClickListener);

    /* renamed from: setSnsRangeChangeComplexCallback */
    public abstract void mo70562x8454105e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y0 y0Var);

    public AbstractC17949x28e47a30(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f247782d = false;
    }
}
