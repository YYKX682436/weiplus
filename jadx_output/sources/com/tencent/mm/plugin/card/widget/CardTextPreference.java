package com.tencent.mm.plugin.card.widget;

/* loaded from: classes3.dex */
public class CardTextPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public int M;
    public android.widget.TextView N;
    public boolean P;
    public final android.content.Context Q;

    public CardTextPreference(android.content.Context context) {
        super(context, null);
        this.M = 0;
        this.P = true;
        this.Q = context;
    }

    public final void M(boolean z17) {
        android.widget.TextView textView = this.N;
        if (textView != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            rect.left = textView.getPaddingLeft();
            rect.right = textView.getPaddingRight();
            rect.top = textView.getPaddingTop();
            rect.bottom = textView.getPaddingBottom();
            this.N.setSingleLine(z17);
            if (z17) {
                return;
            }
            android.content.Context context = this.Q;
            rect.top = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479866hf);
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479866hf);
            rect.bottom = dimensionPixelOffset;
            android.widget.TextView textView2 = this.N;
            if (textView2 != null) {
                textView2.setPadding(rect.left, rect.top, rect.right, dimensionPixelOffset);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        int i17;
        super.t(view);
        this.L = (android.widget.TextView) view.findViewById(android.R.id.summary);
        this.N = (android.widget.TextView) view.findViewById(android.R.id.title);
        android.widget.TextView textView = this.L;
        if (textView != null && (i17 = this.M) != 0) {
            textView.setTextColor(i17);
        }
        M(this.P);
    }

    public CardTextPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = 0;
        this.P = true;
        this.Q = context;
    }

    public CardTextPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = 0;
        this.P = true;
        this.G = com.tencent.mm.R.layout.byv;
        this.Q = context;
    }
}
