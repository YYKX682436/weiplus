package com.p314xaae8f345.p2926x359365.ui;

/* renamed from: com.tencent.rtmp.ui.Dashboard */
/* loaded from: classes5.dex */
public class C25490x38fd0a74 extends android.widget.LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    final java.lang.StringBuilder f296803a;

    /* renamed from: b, reason: collision with root package name */
    android.widget.TextView f296804b;

    /* renamed from: c, reason: collision with root package name */
    android.widget.TextView f296805c;

    /* renamed from: d, reason: collision with root package name */
    private final java.text.SimpleDateFormat f296806d;

    /* renamed from: e, reason: collision with root package name */
    private android.widget.ScrollView f296807e;

    /* renamed from: f, reason: collision with root package name */
    private int f296808f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f296809g;

    public C25490x38fd0a74(android.content.Context context) {
        this(context, null);
    }

    public final void a(int i17, int i18, int i19, int i27) {
        android.widget.TextView textView = this.f296804b;
        if (textView != null) {
            textView.setPadding(i17, i18, i19, 0);
        }
        android.widget.ScrollView scrollView = this.f296807e;
        if (scrollView != null) {
            scrollView.setPadding(i17, 0, i19, i27);
        }
    }

    /* renamed from: setEventTextSize */
    public void m94591xa29cfa46(float f17) {
        android.widget.TextView textView = this.f296805c;
        if (textView != null) {
            textView.setTextSize(f17);
        }
    }

    /* renamed from: setMessageMaxLength */
    public void m94592xe19265a5(int i17) {
        this.f296808f = i17;
    }

    /* renamed from: setShowLevel */
    public void m94593xe93c5845(int i17) {
        if (i17 == 0) {
            android.widget.TextView textView = this.f296804b;
            if (textView != null) {
                textView.setVisibility(4);
            }
            android.widget.ScrollView scrollView = this.f296807e;
            if (scrollView != null) {
                scrollView.setVisibility(4);
            }
            setVisibility(4);
            return;
        }
        if (i17 != 1) {
            a();
            this.f296804b.setVisibility(0);
            this.f296807e.setVisibility(0);
            setVisibility(0);
            return;
        }
        a();
        this.f296804b.setVisibility(0);
        this.f296807e.setVisibility(4);
        setVisibility(0);
    }

    /* renamed from: setStatusText */
    public void m94594x2b2d4641(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.f296804b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: setStatusTextSize */
    public void m94595xaad591e2(float f17) {
        android.widget.TextView textView = this.f296804b;
        if (textView != null) {
            textView.setTextSize(f17);
        }
    }

    public C25490x38fd0a74(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f296803a = new java.lang.StringBuilder();
        this.f296806d = new java.text.SimpleDateFormat("HH:mm:ss.SSS", java.util.Locale.ENGLISH);
        this.f296808f = 3000;
        this.f296809g = false;
        setOrientation(1);
        setVisibility(8);
    }

    private void a() {
        if (this.f296804b != null) {
            return;
        }
        this.f296804b = new android.widget.TextView(getContext());
        this.f296805c = new android.widget.TextView(getContext());
        this.f296807e = new android.widget.ScrollView(getContext());
        this.f296804b.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.f296804b.setTextColor(-49023);
        this.f296804b.setTypeface(android.graphics.Typeface.MONOSPACE);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        this.f296807e.setPadding(0, 10, 0, 0);
        this.f296807e.setLayoutParams(layoutParams);
        this.f296807e.setVerticalScrollBarEnabled(true);
        this.f296807e.setScrollbarFadingEnabled(true);
        this.f296805c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f296805c.setTextColor(-49023);
        this.f296807e.addView(this.f296805c);
        addView(this.f296804b);
        addView(this.f296807e);
        if (this.f296803a.length() <= 0) {
            this.f296803a.append("liteav sdk version:\n");
        }
        this.f296805c.setText(this.f296803a.toString());
    }
}
