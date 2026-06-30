package com.p314xaae8f345.p3210x3857dc.p3213xdb7d1c3f.p3214x6b0147b;

/* renamed from: com.tencent.xweb.extension.video.VideoDotPercentIndicator */
/* loaded from: classes13.dex */
public class C27837x3854e658 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.LayoutInflater f301799d;

    /* renamed from: e, reason: collision with root package name */
    public int f301800e;

    public C27837x3854e658(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f301799d = android.view.LayoutInflater.from(context);
        m120244x1f2fbc1a(0);
    }

    /* renamed from: setDotsNum */
    public void m120244x1f2fbc1a(int i17) {
        if (i17 <= 1) {
            i17 = 8;
        }
        this.f301800e = i17;
        removeAllViews();
        for (int i18 = 0; i18 < this.f301800e; i18++) {
            addView((android.widget.ImageView) this.f301799d.inflate(com.p314xaae8f345.p3222x9cba06de.R.C27875xbddafb2a.f61378xe0a1fb02, (android.view.ViewGroup) this, false));
        }
    }

    /* renamed from: setProgress */
    public void m120245x3ae760af(float f17) {
        int rint = (int) java.lang.Math.rint(java.lang.Math.min(java.lang.Math.max(f17 / 100.0f, 0.0f), 1.0f) * this.f301800e);
        int i17 = 0;
        while (i17 < rint && i17 < getChildCount()) {
            ((android.widget.ImageView) getChildAt(i17)).setImageResource(com.p314xaae8f345.p3222x9cba06de.R.C27874xcebc809e.f61269x98c06fa8);
            i17++;
        }
        while (i17 < getChildCount()) {
            ((android.widget.ImageView) getChildAt(i17)).setImageResource(com.p314xaae8f345.p3222x9cba06de.R.C27874xcebc809e.f61268x910ccb4a);
            i17++;
        }
    }

    public C27837x3854e658(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f301799d = android.view.LayoutInflater.from(context);
        m120244x1f2fbc1a(0);
    }
}
