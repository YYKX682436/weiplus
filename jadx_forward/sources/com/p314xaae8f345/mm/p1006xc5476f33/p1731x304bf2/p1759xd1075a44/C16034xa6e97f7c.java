package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44;

/* renamed from: com.tencent.mm.plugin.game.widget.EllipsizingTextView */
/* loaded from: classes4.dex */
public class C16034xa6e97f7c extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f223485d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f223486e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f223487f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f223488g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f223489h;

    /* renamed from: i, reason: collision with root package name */
    public int f223490i;

    /* renamed from: m, reason: collision with root package name */
    public float f223491m;

    /* renamed from: n, reason: collision with root package name */
    public float f223492n;

    public C16034xa6e97f7c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f223485d = new java.util.ArrayList();
        this.f223490i = -1;
        this.f223491m = 1.0f;
        this.f223492n = 0.0f;
    }

    public final android.text.Layout a(java.lang.String str) {
        return new android.text.StaticLayout(str, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), android.text.Layout.Alignment.ALIGN_NORMAL, this.f223491m, this.f223492n, false);
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.f223490i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            boolean r0 = r8.f223487f
            if (r0 == 0) goto Lbe
            r0 = 0
            super.setEllipsize(r0)
            int r1 = r8.getMaxLines()
            java.lang.String r2 = r8.f223489h
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == r3) goto L88
            android.text.Layout r6 = r8.a(r2)
            int r7 = r6.getLineCount()
            if (r7 <= r1) goto L88
            java.lang.String r2 = r8.f223489h
            int r7 = r1 + (-1)
            int r6 = r6.getLineEnd(r7)
            java.lang.String r2 = r2.substring(r5, r6)
            java.lang.String r2 = r2.trim()
            byte[] r6 = r2.getBytes()
            int r6 = r6.length
            int r7 = r2.length()
            if (r6 == r7) goto L3a
            r6 = r4
            goto L3b
        L3a:
            r6 = r5
        L3b:
            java.lang.String r7 = "..."
            if (r6 != 0) goto L66
        L3f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.text.Layout r6 = r8.a(r6)
            int r6 = r6.getLineCount()
            if (r6 <= r1) goto L77
            r6 = 32
            int r6 = r2.lastIndexOf(r6)
            if (r6 != r3) goto L61
            goto L77
        L61:
            java.lang.String r2 = r2.substring(r5, r6)
            goto L3f
        L66:
            int r1 = r2.length()
            r3 = 2
            if (r1 < r3) goto L77
            int r1 = r2.length()
            int r1 = r1 - r4
            int r1 = r1 - r4
            java.lang.String r2 = r2.substring(r5, r1)
        L77:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = r1.toString()
            r1 = r4
            goto L89
        L88:
            r1 = r5
        L89:
            java.lang.CharSequence r3 = r8.getText()
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L9f
            r8.f223488g = r4
            r8.setText(r2)     // Catch: java.lang.Throwable -> L9b
            r8.f223488g = r5
            goto L9f
        L9b:
            r9 = move-exception
            r8.f223488g = r5
            throw r9
        L9f:
            r8.f223487f = r5
            boolean r2 = r8.f223486e
            if (r1 == r2) goto Lbe
            r8.f223486e = r1
            java.util.List r1 = r8.f223485d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto Lb6
            goto Lbe
        Lb6:
            java.lang.Object r9 = r1.next()
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(r9)
            throw r0
        Lbe:
            super.onDraw(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16034xa6e97f7c.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        if (this.f223488g) {
            return;
        }
        this.f223489h = charSequence.toString();
        this.f223487f = true;
    }

    @Override // android.widget.TextView
    public void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f17, float f18) {
        this.f223492n = f17;
        this.f223491m = f18;
        super.setLineSpacing(f17, f18);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i17) {
        super.setMaxLines(i17);
        this.f223490i = i17;
        this.f223487f = true;
    }

    public C16034xa6e97f7c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f223485d = new java.util.ArrayList();
        this.f223490i = -1;
        this.f223491m = 1.0f;
        this.f223492n = 0.0f;
    }
}
