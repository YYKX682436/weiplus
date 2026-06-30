package b2;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f98848a;

    /* renamed from: b, reason: collision with root package name */
    public final android.text.Layout f98849b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98850c;

    /* renamed from: d, reason: collision with root package name */
    public final int f98851d;

    /* renamed from: e, reason: collision with root package name */
    public final int f98852e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f98853f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f98854g;

    /* JADX WARN: Removed duplicated region for block: B:106:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(java.lang.CharSequence r28, float r29, android.text.TextPaint r30, int r31, android.text.TextUtils.TruncateAt r32, int r33, float r34, float r35, boolean r36, boolean r37, int r38, int r39, int r40, int r41, int[] r42, int[] r43, b2.g r44, int r45, p3321xbce91901.jvm.p3324x21ffc6bd.i r46) {
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
        return ((b2.c) tVar.f98854g.mo141623x754a37bb()).a(i17, true, z17);
    }

    public final float a(int i17) {
        return this.f98851d + this.f98849b.getLineBaseline(i17);
    }

    public final float b(int i17) {
        return this.f98851d + this.f98849b.getLineBottom(i17) + (i17 == this.f98850c + (-1) ? this.f98852e : 0);
    }

    public final float c(int i17) {
        return this.f98849b.getLineTop(i17) + (i17 == 0 ? 0 : this.f98851d);
    }

    public final java.lang.CharSequence e() {
        java.lang.CharSequence text = this.f98849b.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "layout.text");
        return text;
    }

    public final void f(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int i17 = this.f98851d;
        if (i17 != 0) {
            canvas.translate(0.0f, i17);
        }
        this.f98849b.draw(canvas);
        if (i17 != 0) {
            canvas.translate(0.0f, (-1) * i17);
        }
    }
}
