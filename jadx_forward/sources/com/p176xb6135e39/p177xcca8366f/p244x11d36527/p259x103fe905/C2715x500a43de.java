package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p259x103fe905;

/* renamed from: com.google.android.material.snackbar.SnackbarContentLayout */
/* loaded from: classes13.dex */
public class C2715x500a43de extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f126065d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f126066e;

    /* renamed from: f, reason: collision with root package name */
    public final int f126067f;

    /* renamed from: g, reason: collision with root package name */
    public final int f126068g;

    public C2715x500a43de(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f515662s);
        this.f126067f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f126068g = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean a(int i17, int i18, int i19) {
        boolean z17;
        if (i17 != getOrientation()) {
            setOrientation(i17);
            z17 = true;
        } else {
            z17 = false;
        }
        if (this.f126065d.getPaddingTop() == i18 && this.f126065d.getPaddingBottom() == i19) {
            return z17;
        }
        android.widget.TextView textView = this.f126065d;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.v0.g(textView)) {
            n3.v0.k(textView, n3.v0.f(textView), i18, n3.v0.e(textView), i19);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i18, textView.getPaddingRight(), i19);
        return true;
    }

    /* renamed from: getActionView */
    public android.widget.Button m20343x5ca2d9f1() {
        return this.f126066e;
    }

    /* renamed from: getMessageView */
    public android.widget.TextView m20344xa5cc9a16() {
        return this.f126065d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f126065d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.n1b);
        this.f126066e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.n1a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (a(1, r0, r0 - r1) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (a(0, r0, r0) != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f126067f
            if (r0 <= 0) goto L16
            int r1 = r7.getMeasuredWidth()
            if (r1 <= r0) goto L16
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r8)
            super.onMeasure(r8, r9)
        L16:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131166774(0x7f070636, float:1.7947803E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131166773(0x7f070635, float:1.79478E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f126065d
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = r4
            goto L3d
        L3c:
            r2 = r3
        L3d:
            if (r2 == 0) goto L54
            int r5 = r7.f126068g
            if (r5 <= 0) goto L54
            android.widget.Button r6 = r7.f126066e
            int r6 = r6.getMeasuredWidth()
            if (r6 <= r5) goto L54
            int r1 = r0 - r1
            boolean r0 = r7.a(r4, r0, r1)
            if (r0 == 0) goto L5f
            goto L5e
        L54:
            if (r2 == 0) goto L57
            goto L58
        L57:
            r0 = r1
        L58:
            boolean r0 = r7.a(r3, r0, r0)
            if (r0 == 0) goto L5f
        L5e:
            r3 = r4
        L5f:
            if (r3 == 0) goto L64
            super.onMeasure(r8, r9)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p259x103fe905.C2715x500a43de.onMeasure(int, int):void");
    }
}
