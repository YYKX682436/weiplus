package com.tencent.mm.plugin.emoji.ui.v3;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eB\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tR\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3TabView;", "Landroid/view/ViewGroup;", "", "pxValue", "Ljz5/f0;", "setTitleTextSize", "", "colors", "setTitleTextColor", "", "str", "setTitleText", "resId", "getText", "getUnread", "unread", "setUnread", "h", "I", "getTotal", "()I", "setTotal", "(I)V", "total", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class EmojiStoreV3TabView extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final int f98472d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f98473e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f98474f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f98475g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int total;

    /* renamed from: i, reason: collision with root package name */
    public final int f98477i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiStoreV3TabView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98472d = 2;
        this.total = 3;
        float h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479568k);
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f98473e = textView;
        textView.setSingleLine();
        textView.setTextColor(textView.getResources().getColorStateList(com.tencent.mm.R.color.FG_1));
        setTitleTextSize(h17);
        textView.setText("");
        addView(textView);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f98474f = imageView;
        imageView.setBackgroundResource(com.tencent.mm.R.drawable.b8i);
        imageView.setVisibility(4);
        addView(imageView);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        this.f98475g = textView2;
        textView2.setTextColor(textView2.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        textView2.setTextSize(1, 11.0f);
        textView2.setBackgroundResource(com.tencent.mm.ui.tools.pd.a(context));
        textView2.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        textView2.setGravity(17);
        textView2.setVisibility(4);
        addView(textView2);
        getUnread();
        la5.b.f317600a.d(this, getText(), getUnread(), 0);
        this.f98477i = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_);
    }

    public final java.lang.String getText() {
        android.widget.TextView textView = this.f98473e;
        return java.lang.String.valueOf(textView != null ? textView.getText() : null);
    }

    public final int getTotal() {
        return this.total;
    }

    public final java.lang.String getUnread() {
        android.widget.TextView textView = this.f98475g;
        return java.lang.String.valueOf(textView != null ? textView.getText() : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28 = i19 - i17;
        int i29 = i27 - i18;
        android.widget.TextView textView = this.f98473e;
        if (textView != null) {
            int measuredWidth = (i28 - textView.getMeasuredWidth()) / 2;
            int measuredWidth2 = textView.getMeasuredWidth() + measuredWidth;
            int measuredHeight = (i29 - textView.getMeasuredHeight()) / 2;
            textView.layout(measuredWidth, measuredHeight, measuredWidth2, textView.getMeasuredHeight() + measuredHeight);
            android.widget.ImageView imageView = this.f98474f;
            int i37 = this.f98477i;
            if (imageView != null) {
                int i38 = measuredWidth2 + i37;
                int measuredWidth3 = imageView.getMeasuredWidth() + i38;
                int measuredHeight2 = (i29 - imageView.getMeasuredHeight()) / 2;
                imageView.layout(i38, measuredHeight2, measuredWidth3, imageView.getMeasuredHeight() + measuredHeight2);
            }
            android.widget.TextView textView2 = this.f98475g;
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
        android.widget.ImageView imageView = this.f98474f;
        if (imageView != null && imageView.getVisibility() == 0) {
            size = size + (imageView != null ? imageView.getMeasuredWidth() : 0) + ym5.x.a(getContext(), this.f98477i);
        }
        int size2 = (android.view.View.MeasureSpec.getSize(i18) - getPaddingTop()) - getPaddingBottom();
        int makeMeasureSpec = android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE ? android.view.View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.widget.TextView textView = this.f98473e;
        if (textView != null) {
            textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        }
        if (imageView != null) {
            imageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        }
        android.widget.TextView textView2 = this.f98475g;
        if (textView2 != null) {
            textView2.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        }
        setMeasuredDimension(size, size2);
    }

    public final void setTitleText(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "str");
        android.widget.TextView textView = this.f98473e;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    public final void setTitleTextColor(int i17) {
        android.widget.TextView textView = this.f98473e;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    public final void setTitleTextSize(float f17) {
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        boolean j17 = com.tencent.mm.sdk.platformtools.m2.j();
        boolean p17 = r26.i0.p(d17, "en", true);
        int q17 = j17 ? (int) (i65.a.q(getContext()) * i65.a.b(getContext(), this.f98472d)) : 0;
        android.widget.TextView textView = this.f98473e;
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

    public final void setTotal(int i17) {
        this.total = i17;
    }

    public final void setUnread(java.lang.String unread) {
        kotlin.jvm.internal.o.g(unread, "unread");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(unread);
        android.widget.TextView textView = this.f98475g;
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

    public final void setTitleText(int i17) {
        android.widget.TextView textView = this.f98473e;
        if (textView != null) {
            textView.setText(i17);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiStoreV3TabView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
