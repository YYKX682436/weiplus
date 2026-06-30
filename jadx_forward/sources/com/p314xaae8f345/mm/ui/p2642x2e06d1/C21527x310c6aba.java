package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.OnLayoutChangedLinearLayout */
/* loaded from: classes11.dex */
public class C21527x310c6aba extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22601x66cbd65e {

    /* renamed from: d, reason: collision with root package name */
    public db5.x8 f279219d;

    public C21527x310c6aba(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22601x66cbd65e, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        db5.x8 x8Var = this.f279219d;
        if (x8Var != null) {
            x8Var.a();
        }
    }

    /* renamed from: setOnChattingLayoutChangedListener */
    public void m79277x8880a9f7(db5.x8 x8Var) {
        this.f279219d = x8Var;
    }

    public C21527x310c6aba(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
