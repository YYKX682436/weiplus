package pu4;

/* loaded from: classes12.dex */
public class l extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f439980q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.CharSequence f439981r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f439982s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f439983t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f439984u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f439985v;

    /* renamed from: w, reason: collision with root package name */
    public final pu4.k f439986w;

    /* renamed from: x, reason: collision with root package name */
    public final pu4.j f439987x;

    public l(int i17) {
        super(23, i17);
        this.f439984u = new java.util.ArrayList();
        this.f439985v = new java.util.ArrayList();
        this.f439986w = new pu4.k(this);
        this.f439987x = new pu4.j(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // u13.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r10, u13.e r11, java.lang.Object... r12) {
        /*
            r9 = this;
            p13.y r11 = r9.f439980q
            if (r11 != 0) goto L5
            return
        L5:
            java.lang.String r11 = r11.f432723h
            java.lang.String r12 = ""
            if (r11 == 0) goto L13
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L13
            r0 = r11
            goto L14
        L13:
            r0 = r12
        L14:
            r9.f439981r = r0
            p13.y r0 = r9.f439980q
            java.lang.String r0 = r0.f432726k
            if (r0 == 0) goto L23
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L23
            r12 = r0
        L23:
            r9.f439982s = r12
            p13.y r12 = r9.f439980q
            int r12 = r12.f432718c
            r0 = 2
            r1 = 1
            r2 = 0
            if (r12 == r0) goto L36
            r0 = 3
            if (r12 == r0) goto L34
            r5 = r2
            r6 = r5
            goto L39
        L34:
            r12 = r1
            goto L37
        L36:
            r12 = r2
        L37:
            r6 = r12
            r5 = r1
        L39:
            p13.r r4 = r9.f505295e
            if (r4 == 0) goto L56
            java.lang.CharSequence r3 = r9.f439981r
            int r12 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.b.f219550b
            float r7 = (float) r12
            android.text.TextPaint r8 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d.f219567c
            p13.i r12 = p13.i.e(r3, r4, r5, r6, r7, r8)
            p13.j r12 = o13.q.e(r12)
            java.lang.CharSequence r12 = r12.f432638a
            r9.f439981r = r12
            java.util.List r12 = r9.o(r12)
            r9.f439984u = r12
        L56:
            p13.r r12 = r9.f505295e
            if (r12 == 0) goto L7d
            java.lang.CharSequence r12 = r9.f439982s
            int r12 = r12.length()
            if (r12 <= 0) goto L7d
            java.lang.CharSequence r12 = r9.f439982s
            p13.r r0 = r9.f505295e
            int r3 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.b.f219550b
            float r3 = (float) r3
            android.text.TextPaint r4 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d.f219569e
            p13.i r12 = p13.i.c(r12, r0, r3, r4)
            p13.j r12 = o13.q.e(r12)
            java.lang.CharSequence r12 = r12.f432638a
            r9.f439982s = r12
            java.util.List r12 = r9.o(r12)
            r9.f439985v = r12
        L7d:
            java.util.List r12 = r9.f439984u
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L9f
            java.util.List r12 = r9.f439985v
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L9f
            if (r11 == 0) goto L9f
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L9f
            java.util.List r12 = r9.f439984u
            r12.add(r11)
            java.util.List r12 = r9.f439985v
            r12.add(r11)
        L9f:
            p13.y r11 = r9.f439980q
            long r11 = r11.f432721f
            r3 = 0
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto Laf
            java.lang.CharSequence r10 = k35.m1.f(r10, r11, r1, r2)
            r9.f439983t = r10
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pu4.l.a(android.content.Context, u13.e, java.lang.Object[]):void");
    }

    @Override // u13.g
    public u13.f k() {
        return this.f439986w;
    }

    public final java.util.List o(java.lang.CharSequence charSequence) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (charSequence instanceof android.text.Spannable) {
            android.text.Spannable spannable = (android.text.Spannable) charSequence;
            for (android.text.style.ForegroundColorSpan foregroundColorSpan : (android.text.style.ForegroundColorSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.ForegroundColorSpan.class)) {
                java.lang.String charSequence2 = spannable.subSequence(spannable.getSpanStart(foregroundColorSpan), spannable.getSpanEnd(foregroundColorSpan)).toString();
                if (!charSequence2.isEmpty()) {
                    arrayList.add(charSequence2);
                }
            }
        }
        return arrayList;
    }
}
