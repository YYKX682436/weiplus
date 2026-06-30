package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMVisiblePasswordEditText */
/* loaded from: classes5.dex */
public class C21521x2d1d70e4 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22669xa5de5760 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f279169d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f279170e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f279171f;

    public C21521x2d1d70e4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279169d = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80526xf15f7c6a);
        this.f279170e = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80527xf7591477);
        this.f279171f = false;
        a(context);
    }

    public final void a(android.content.Context context) {
        android.graphics.drawable.Drawable drawable = this.f279169d;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        android.graphics.drawable.Drawable drawable2 = this.f279170e;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        drawable.getIntrinsicWidth();
        drawable.getIntrinsicHeight();
        b();
        setHeight(drawable.getIntrinsicHeight() + (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561431ib) * 5));
        setOnTouchListener(new db5.q8(this));
    }

    public final void b() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f279171f) {
            setInputType(1);
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f279170e, getCompoundDrawables()[3]);
        } else {
            setInputType(129);
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f279169d, getCompoundDrawables()[3]);
        }
        setSelection(selectionStart, selectionEnd);
    }

    public C21521x2d1d70e4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f279169d = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80526xf15f7c6a);
        this.f279170e = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80527xf7591477);
        this.f279171f = false;
        a(context);
    }
}
