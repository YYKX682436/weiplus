package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class z implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 f202836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f202837f;

    public z(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var, android.widget.TextView textView) {
        this.f202835d = i17;
        this.f202836e = c0Var;
        this.f202837f = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int lineHeight;
        android.widget.TextView textView = this.f202837f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var = this.f202836e;
        int i17 = this.f202835d;
        if (i17 != -1) {
            android.widget.TextView textView2 = c0Var.f202715i;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewIntro");
                throw null;
            }
            if (textView2.getLineCount() > i17) {
                android.widget.TextView textView3 = c0Var.f202717m;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewIntroExpend");
                    throw null;
                }
                textView3.setVisibility(0);
                textView.setMaxLines(i17);
            } else {
                android.widget.TextView textView4 = c0Var.f202717m;
                if (textView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewIntroExpend");
                    throw null;
                }
                textView4.setVisibility(8);
            }
        } else {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                android.graphics.Rect rect = new android.graphics.Rect();
                textView.getLineBounds(0, rect);
                lineHeight = rect.bottom - rect.top;
            } else {
                lineHeight = textView.getLineHeight();
            }
            if (textView.getHeight() <= com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0.V6(c0Var) || lineHeight == 0) {
                android.widget.TextView textView5 = c0Var.f202717m;
                if (textView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewIntroExpend");
                    throw null;
                }
                textView5.setVisibility(8);
                textView.setMaxLines(Integer.MAX_VALUE);
            } else {
                int V6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0.V6(c0Var) / lineHeight;
                if (V6 < 1) {
                    V6 = 1;
                }
                textView.setMaxLines(V6);
                android.widget.TextView textView6 = c0Var.f202717m;
                if (textView6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewIntroExpend");
                    throw null;
                }
                textView6.setVisibility(0);
            }
        }
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
