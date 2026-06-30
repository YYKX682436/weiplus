package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMDotView */
/* loaded from: classes8.dex */
public class C21487xa86ce1ce extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f278863d;

    /* renamed from: e, reason: collision with root package name */
    public int f278864e;

    /* renamed from: f, reason: collision with root package name */
    public int f278865f;

    public C21487xa86ce1ce(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278863d = 9;
        this.f278864e = com.p314xaae8f345.mm.R.C30861xcebc809e.ats;
        this.f278865f = com.p314xaae8f345.mm.R.C30861xcebc809e.atq;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528730o);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        m78919xc4325fc8(resourceId);
    }

    /* renamed from: setDarkStyle */
    public void m78918xecb3a999(boolean z17) {
        if (z17) {
            this.f278864e = com.p314xaae8f345.mm.R.C30861xcebc809e.att;
            this.f278865f = com.p314xaae8f345.mm.R.C30861xcebc809e.atr;
        } else {
            this.f278864e = com.p314xaae8f345.mm.R.C30861xcebc809e.ats;
            this.f278865f = com.p314xaae8f345.mm.R.C30861xcebc809e.atq;
        }
    }

    /* renamed from: setDotCount */
    public void m78919xc4325fc8(int i17) {
        if (i17 < 0) {
            return;
        }
        if (i17 > this.f278863d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDotView", "large than max count");
            i17 = this.f278863d;
        }
        removeAllViews();
        while (i17 != 0) {
            android.widget.ImageView imageView = (android.widget.ImageView) android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c1t, null);
            imageView.setImageResource(this.f278864e);
            addView(imageView);
            i17--;
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) getChildAt(0);
        if (imageView2 != null) {
            imageView2.setImageResource(this.f278865f);
        }
    }

    /* renamed from: setInvertedStyle */
    public void m78920x1b70d27a(boolean z17) {
        if (z17) {
            this.f278864e = com.p314xaae8f345.mm.R.C30861xcebc809e.atq;
            this.f278865f = com.p314xaae8f345.mm.R.C30861xcebc809e.ats;
        } else {
            this.f278864e = com.p314xaae8f345.mm.R.C30861xcebc809e.ats;
            this.f278865f = com.p314xaae8f345.mm.R.C30861xcebc809e.atq;
        }
    }

    /* renamed from: setMaxCount */
    public void m78921x8d59188d(int i17) {
        this.f278863d = i17;
    }

    /* renamed from: setSelectedDot */
    public void m78922x7d600aec(int i17) {
        if (i17 >= getChildCount()) {
            i17 = getChildCount() - 1;
        } else if (i17 < 0) {
            i17 = 0;
        }
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            ((android.widget.ImageView) getChildAt(i18)).setImageResource(this.f278864e);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) getChildAt(i17);
        if (imageView != null) {
            imageView.setImageResource(this.f278865f);
        }
    }

    public C21487xa86ce1ce(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278863d = 9;
        this.f278864e = com.p314xaae8f345.mm.R.C30861xcebc809e.ats;
        this.f278865f = com.p314xaae8f345.mm.R.C30861xcebc809e.atq;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528730o);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        m78919xc4325fc8(resourceId);
    }
}
