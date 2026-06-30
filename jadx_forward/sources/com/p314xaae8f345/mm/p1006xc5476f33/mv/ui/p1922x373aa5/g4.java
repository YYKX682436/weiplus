package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes15.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f233366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f233367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f233368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a f233369g;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a c16705xabefc23a, int i17, int i18, int i19) {
        this.f233369g = c16705xabefc23a;
        this.f233366d = i17;
        this.f233367e = i18;
        this.f233368f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a c16705xabefc23a = this.f233369g;
        int i17 = c16705xabefc23a.f233276o * 2;
        int i18 = this.f233366d;
        if (i18 <= i17) {
            throw new java.lang.IllegalStateException("MaxExtent can not less than sliderWidth * 2");
        }
        c16705xabefc23a.f233268d = true;
        int i19 = this.f233367e;
        c16705xabefc23a.f233286y = i19;
        c16705xabefc23a.f233270f = java.lang.Math.min(i18, c16705xabefc23a.getWidth() - (i19 * 2));
        c16705xabefc23a.f233271g = java.lang.Math.max(this.f233368f, 0);
        if (c16705xabefc23a.C) {
            android.graphics.drawable.Drawable drawable = c16705xabefc23a.f233274m;
            int i27 = c16705xabefc23a.f233286y;
            drawable.setBounds(i27, 0, c16705xabefc23a.f233276o + i27, c16705xabefc23a.getHeight());
            android.graphics.drawable.Drawable drawable2 = c16705xabefc23a.f233275n;
            int i28 = c16705xabefc23a.f233286y + c16705xabefc23a.f233270f;
            drawable2.setBounds(i28 - c16705xabefc23a.f233276o, 0, i28, c16705xabefc23a.getHeight());
        } else {
            android.graphics.drawable.Drawable drawable3 = c16705xabefc23a.f233274m;
            int i29 = c16705xabefc23a.f233286y;
            drawable3.setBounds(i29 - c16705xabefc23a.f233276o, 0, i29, c16705xabefc23a.getHeight());
            android.graphics.drawable.Drawable drawable4 = c16705xabefc23a.f233275n;
            int i37 = c16705xabefc23a.f233286y + c16705xabefc23a.f233270f;
            drawable4.setBounds(i37, 0, c16705xabefc23a.f233276o + i37, c16705xabefc23a.getHeight());
        }
        if (c16705xabefc23a.A == null && c16705xabefc23a.B == null) {
            c16705xabefc23a.A = new android.graphics.Rect(c16705xabefc23a.f233274m.getBounds().left, c16705xabefc23a.f233274m.getBounds().top, c16705xabefc23a.f233274m.getBounds().right, c16705xabefc23a.f233274m.getBounds().bottom);
            c16705xabefc23a.B = new android.graphics.Rect(c16705xabefc23a.f233275n.getBounds().left, c16705xabefc23a.f233275n.getBounds().top, c16705xabefc23a.f233275n.getBounds().right, c16705xabefc23a.f233275n.getBounds().bottom);
        }
        c16705xabefc23a.invalidate();
    }
}
