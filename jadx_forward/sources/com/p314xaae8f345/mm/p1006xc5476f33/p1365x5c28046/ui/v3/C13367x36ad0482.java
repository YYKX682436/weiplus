package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eB\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tR\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3TabView;", "Landroid/view/ViewGroup;", "", "pxValue", "Ljz5/f0;", "setTitleTextSize", "", "colors", "setTitleTextColor", "", "str", "setTitleText", "resId", "getText", "getUnread", "unread", "setUnread", "h", "I", "getTotal", "()I", "setTotal", "(I)V", "total", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView */
/* loaded from: classes11.dex */
public final class C13367x36ad0482 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final int f180005d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f180006e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f180007f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f180008g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int total;

    /* renamed from: i, reason: collision with root package name */
    public final int f180010i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13367x36ad0482(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f180005d = 2;
        this.total = 3;
        float h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k);
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f180006e = textView;
        textView.setSingleLine();
        textView.setTextColor(textView.getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        m54855x59160c04(h17);
        textView.setText("");
        addView(textView);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f180007f = imageView;
        imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b8i);
        imageView.setVisibility(4);
        addView(imageView);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        this.f180008g = textView2;
        textView2.setTextColor(textView2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        textView2.setTextSize(1, 11.0f);
        textView2.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.a(context));
        textView2.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        textView2.setGravity(17);
        textView2.setVisibility(4);
        addView(textView2);
        m54851x330196a5();
        la5.b.f399133a.d(this, m54849xfb85ada3(), m54851x330196a5(), 0);
        this.f180010i = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
    }

    /* renamed from: getText */
    public final java.lang.String m54849xfb85ada3() {
        android.widget.TextView textView = this.f180006e;
        return java.lang.String.valueOf(textView != null ? textView.getText() : null);
    }

    public final int getTotal() {
        return this.total;
    }

    /* renamed from: getUnread */
    public final java.lang.String m54851x330196a5() {
        android.widget.TextView textView = this.f180008g;
        return java.lang.String.valueOf(textView != null ? textView.getText() : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28 = i19 - i17;
        int i29 = i27 - i18;
        android.widget.TextView textView = this.f180006e;
        if (textView != null) {
            int measuredWidth = (i28 - textView.getMeasuredWidth()) / 2;
            int measuredWidth2 = textView.getMeasuredWidth() + measuredWidth;
            int measuredHeight = (i29 - textView.getMeasuredHeight()) / 2;
            textView.layout(measuredWidth, measuredHeight, measuredWidth2, textView.getMeasuredHeight() + measuredHeight);
            android.widget.ImageView imageView = this.f180007f;
            int i37 = this.f180010i;
            if (imageView != null) {
                int i38 = measuredWidth2 + i37;
                int measuredWidth3 = imageView.getMeasuredWidth() + i38;
                int measuredHeight2 = (i29 - imageView.getMeasuredHeight()) / 2;
                imageView.layout(i38, measuredHeight2, measuredWidth3, imageView.getMeasuredHeight() + measuredHeight2);
            }
            android.widget.TextView textView2 = this.f180008g;
            if (textView2 != null) {
                if (measuredWidth - i37 < textView2.getMeasuredWidth()) {
                    int measuredWidth4 = i28 - textView2.getMeasuredWidth();
                    int measuredWidth5 = textView2.getMeasuredWidth() + measuredWidth4;
                    int measuredHeight3 = (i29 - textView2.getMeasuredHeight()) / 2;
                    textView2.layout(measuredWidth4, measuredHeight3, measuredWidth5, textView2.getMeasuredHeight() + measuredHeight3);
                    return;
                }
                int i39 = measuredWidth2 + i37;
                int measuredWidth6 = textView2.getMeasuredWidth() + i39;
                int measuredHeight4 = (i29 - textView2.getMeasuredHeight()) / 2;
                textView2.layout(i39, measuredHeight4, measuredWidth6, textView2.getMeasuredHeight() + measuredHeight4);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i17) + getPaddingLeft() + getPaddingRight();
        android.widget.ImageView imageView = this.f180007f;
        if (imageView != null && imageView.getVisibility() == 0) {
            size = size + (imageView != null ? imageView.getMeasuredWidth() : 0) + ym5.x.a(getContext(), this.f180010i);
        }
        int size2 = (android.view.View.MeasureSpec.getSize(i18) - getPaddingTop()) - getPaddingBottom();
        int makeMeasureSpec = android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE ? android.view.View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.widget.TextView textView = this.f180006e;
        if (textView != null) {
            textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        }
        if (imageView != null) {
            imageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        }
        android.widget.TextView textView2 = this.f180008g;
        if (textView2 != null) {
            textView2.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: setTitleText */
    public final void m54853xdc742163(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        android.widget.TextView textView = this.f180006e;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    /* renamed from: setTitleTextColor */
    public final void m54854xc8cc83c0(int i17) {
        android.widget.TextView textView = this.f180006e;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    /* renamed from: setTitleTextSize */
    public final void m54855x59160c04(float f17) {
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        boolean j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j();
        boolean p17 = r26.i0.p(d17, "en", true);
        int q17 = j17 ? (int) (i65.a.q(getContext()) * i65.a.b(getContext(), this.f180005d)) : 0;
        android.widget.TextView textView = this.f180006e;
        if (textView != null) {
            textView.setTextSize(0, f17);
            if (j17) {
                textView.setTextSize(0, textView.getTextSize() + q17);
                textView.setTypeface(null, 0);
            } else if (p17) {
                textView.setTypeface(null, 1);
            }
        }
    }

    /* renamed from: setTotal */
    public final void m54856x53c29c02(int i17) {
        this.total = i17;
    }

    /* renamed from: setUnread */
    public final void m54857x2636cab1(java.lang.String unread) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unread, "unread");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(unread);
        android.widget.TextView textView = this.f180008g;
        if (K0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(4);
        } else if (textView != null) {
            textView.setVisibility(0);
            textView.post(new g22.q0(textView, unread, this));
        }
    }

    /* renamed from: setTitleText */
    public final void m54852xdc742163(int i17) {
        android.widget.TextView textView = this.f180006e;
        if (textView != null) {
            textView.setText(i17);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13367x36ad0482(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
