package b2;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17315a;

    /* renamed from: b, reason: collision with root package name */
    public final android.text.Layout f17316b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17317c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17318d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17319e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17320f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f17321g;

    /* JADX WARN: Removed duplicated region for block: B:106:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(java.lang.CharSequence r28, float r29, android.text.TextPaint r30, int r31, android.text.TextUtils.TruncateAt r32, int r33, float r34, float r35, boolean r36, boolean r37, int r38, int r39, int r40, int r41, int[] r42, int[] r43, b2.g r44, int r45, kotlin.jvm.internal.i r46) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.t.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int[], int[], b2.g, int, kotlin.jvm.internal.i):void");
    }

    public static float d(b2.t tVar, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        return ((b2.c) tVar.f17321g.getValue()).a(i17, true, z17);
    }

    public final float a(int i17) {
        return this.f17318d + this.f17316b.getLineBaseline(i17);
    }

    public final float b(int i17) {
        return this.f17318d + this.f17316b.getLineBottom(i17) + (i17 == this.f17317c + (-1) ? this.f17319e : 0);
    }

    public final float c(int i17) {
        return this.f17316b.getLineTop(i17) + (i17 == 0 ? 0 : this.f17318d);
    }

    public final java.lang.CharSequence e() {
        java.lang.CharSequence text = this.f17316b.getText();
        kotlin.jvm.internal.o.f(text, "layout.text");
        return text;
    }

    public final void f(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int i17 = this.f17318d;
        if (i17 != 0) {
            canvas.translate(0.0f, i17);
        }
        this.f17316b.draw(canvas);
        if (i17 != 0) {
            canvas.translate(0.0f, (-1) * i17);
        }
    }
}
