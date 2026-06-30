package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* renamed from: com.tencent.mm.plugin.remittance.ui.KindaPlatformLayout */
/* loaded from: classes5.dex */
public class C17126x37de6e0a extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a9 f238633d;

    public C17126x37de6e0a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f238633d = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a9();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.onLayout(z17, i17, i18, i19, i27);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a9 a9Var = this.f238633d;
        a9Var.f239171b += currentTimeMillis2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformLayout", "testandroid root layout out %s %s", java.lang.Long.valueOf(currentTimeMillis2), a9Var.a());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.onMeasure(i17, i18);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a9 a9Var = this.f238633d;
        a9Var.f239170a += currentTimeMillis2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformLayout", "testandroid root measure out %s %s", java.lang.Long.valueOf(currentTimeMillis2), a9Var.a());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    public C17126x37de6e0a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f238633d = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a9();
    }
}
