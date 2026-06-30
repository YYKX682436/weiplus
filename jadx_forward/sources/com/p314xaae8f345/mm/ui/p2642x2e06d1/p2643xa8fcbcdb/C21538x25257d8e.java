package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.AutoHintSizeEditText */
/* loaded from: classes5.dex */
public class C21538x25257d8e extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22669xa5de5760 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f279277i = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f279278d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f279279e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f279280f;

    /* renamed from: g, reason: collision with root package name */
    public int f279281g;

    /* renamed from: h, reason: collision with root package name */
    public float f279282h;

    public C21538x25257d8e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f279280f = "";
        this.f279281g = Integer.MIN_VALUE;
        float textSize = getTextSize();
        this.f279278d = textSize;
        this.f279282h = textSize;
        this.f279279e = new android.graphics.Paint(getPaint());
        addTextChangedListener(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.a(this));
    }

    public final void a(android.text.Editable editable, java.lang.CharSequence charSequence, int i17) {
        float f17;
        if (editable != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(editable.toString())) {
            if (getTextSize() != this.f279278d) {
                setTextSize(0, this.f279278d);
                return;
            }
            return;
        }
        if (charSequence == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence.toString())) {
            if (getTextSize() != this.f279278d) {
                setTextSize(0, this.f279278d);
                return;
            }
            return;
        }
        java.lang.String charSequence2 = charSequence.toString();
        if (this.f279280f.equals(charSequence2) && this.f279281g == i17) {
            if (getTextSize() != this.f279282h) {
                setTextSize(0, this.f279282h);
                return;
            }
            return;
        }
        this.f279280f = charSequence2;
        this.f279281g = i17;
        float f18 = i17;
        if (getPaint().measureText(charSequence2) > f18) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
            int b17 = i65.a.b(getContext(), 1);
            int i18 = (int) this.f279278d;
            do {
                i18 -= b17;
                if (i18 <= dimensionPixelSize) {
                    return;
                }
                f17 = i18;
                this.f279279e.setTextSize(f17);
            } while (this.f279279e.measureText(charSequence2) >= f18);
            this.f279282h = f17;
            setTextSize(0, f17);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            a(getText(), getHint(), ((i19 - i17) - getPaddingLeft()) - getPaddingRight());
        }
    }

    public C21538x25257d8e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279280f = "";
        this.f279281g = Integer.MIN_VALUE;
        float textSize = getTextSize();
        this.f279278d = textSize;
        this.f279282h = textSize;
        this.f279279e = new android.graphics.Paint(getPaint());
        addTextChangedListener(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.a(this));
    }
}
