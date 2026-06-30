package a2;

/* loaded from: classes14.dex */
public final class d implements java.lang.CharSequence {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82214d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f82215e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f82216f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f82217g;

    public d(java.lang.String text, java.util.List spanStyles, java.util.List paragraphStyles, java.util.List annotations) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanStyles, "spanStyles");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paragraphStyles, "paragraphStyles");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        this.f82214d = text;
        this.f82215e = spanStyles;
        this.f82216f = paragraphStyles;
        this.f82217g = annotations;
        int size = paragraphStyles.size();
        int i17 = -1;
        int i18 = 0;
        while (i18 < size) {
            a2.c cVar = (a2.c) paragraphStyles.get(i18);
            if (cVar.f82209b >= i17) {
                int length = this.f82214d.length();
                int i19 = cVar.f82210c;
                if (!(i19 <= length)) {
                    throw new java.lang.IllegalArgumentException(("ParagraphStyle range [" + cVar.f82209b + ", " + i19 + ") is out of boundary").toString());
                }
                i18++;
                i17 = i19;
            } else {
                throw new java.lang.IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    public final a2.d a(a2.d other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        a2.b bVar = new a2.b(this);
        bVar.b(other);
        return bVar.e();
    }

    @Override // java.lang.CharSequence
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a2.d subSequence(int i17, int i18) {
        if (!(i17 <= i18)) {
            throw new java.lang.IllegalArgumentException(("start (" + i17 + ") should be less or equal to end (" + i18 + ')').toString());
        }
        java.lang.String str = this.f82214d;
        if (i17 == 0 && i18 == str.length()) {
            return this;
        }
        java.lang.String substring = str.substring(i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new a2.d(substring, a2.e.a(this.f82215e, i17, i18), a2.e.a(this.f82216f, i17, i18), a2.e.a(this.f82217g, i17, i18));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i17) {
        return this.f82214d.charAt(i17);
    }

    /* renamed from: equals */
    public boolean m339xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.d)) {
            return false;
        }
        a2.d dVar = (a2.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82214d, dVar.f82214d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82215e, dVar.f82215e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82216f, dVar.f82216f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82217g, dVar.f82217g);
    }

    /* renamed from: hashCode */
    public int m340x8cdac1b() {
        return (((((this.f82214d.hashCode() * 31) + this.f82215e.hashCode()) * 31) + this.f82216f.hashCode()) * 31) + this.f82217g.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f82214d.length();
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return this.f82214d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.lang.String r2, java.util.List r3, java.util.List r4, int r5, p3321xbce91901.jvm.p3324x21ffc6bd.i r6) {
        /*
            r1 = this;
            r6 = r5 & 2
            kz5.p0 r0 = kz5.p0.f395529d
            if (r6 == 0) goto L7
            r3 = r0
        L7:
            r5 = r5 & 4
            if (r5 == 0) goto Lc
            r4 = r0
        Lc:
            java.lang.String r5 = "text"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r5)
            java.lang.String r5 = "spanStyles"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r5)
            java.lang.String r5 = "paragraphStyles"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r5)
            r1.<init>(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.d.<init>(java.lang.String, java.util.List, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}
