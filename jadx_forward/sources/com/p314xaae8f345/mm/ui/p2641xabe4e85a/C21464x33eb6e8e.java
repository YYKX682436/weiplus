package com.p314xaae8f345.mm.ui.p2641xabe4e85a;

/* renamed from: com.tencent.mm.ui.applet.StrokeScrollBar */
/* loaded from: classes15.dex */
public class C21464x33eb6e8e extends com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 {
    public C21464x33eb6e8e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10
    public void c() {
        this.f279239f = new java.lang.String[18];
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = this.f279239f;
            if (i17 >= strArr.length) {
                this.f279237d = 2.0f;
                this.f279238e = 79;
                return;
            } else {
                strArr[i17] = java.lang.Integer.toString(i17 + 3) + "劃";
                i17++;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10
    /* renamed from: getToastLayoutId */
    public int mo65174x34508176() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cnb;
    }
}
