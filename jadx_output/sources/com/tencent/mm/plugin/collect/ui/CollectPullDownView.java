package com.tencent.mm.plugin.collect.ui;

/* loaded from: classes9.dex */
public class CollectPullDownView extends com.tencent.mm.ui.base.MMPullDownView {
    public CollectPullDownView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.base.MMPullDownView
    public void g() {
        android.content.Context context = this.f197544y;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488634z4, null);
        android.view.View inflate2 = android.view.View.inflate(context, com.tencent.mm.R.layout.f488634z4, null);
        addView(inflate, 0, new android.widget.FrameLayout.LayoutParams(-1, i65.a.b(context, 48)));
        addView(inflate2, new android.widget.FrameLayout.LayoutParams(-1, i65.a.b(context, 48)));
    }

    public void setLoadDataEnd(boolean z17) {
        this.f197537r = z17;
    }

    public CollectPullDownView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
