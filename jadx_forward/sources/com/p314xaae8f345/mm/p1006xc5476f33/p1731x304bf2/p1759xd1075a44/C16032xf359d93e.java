package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44;

/* renamed from: com.tencent.mm.plugin.game.widget.BouncyHScrollView */
/* loaded from: classes5.dex */
public class C16032xf359d93e extends android.widget.HorizontalScrollView implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f223464d;

    /* renamed from: e, reason: collision with root package name */
    public int f223465e;

    public C16032xf359d93e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f223464d = context;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f223465e = (int) (this.f223464d.getResources().getDisplayMetrics().density * 300.0f);
        setOverScrollMode(0);
        setSmoothScrollingEnabled(true);
        setHorizontalFadingEdgeEnabled(false);
    }

    @Override // android.view.View
    public boolean overScrollBy(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17) {
        return super.overScrollBy(i17, i18, i19, i27, i28, i29, this.f223465e, i38, z17);
    }

    public C16032xf359d93e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f223464d = context;
    }
}
