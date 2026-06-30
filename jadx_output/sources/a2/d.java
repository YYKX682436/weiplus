package a2;

/* loaded from: classes14.dex */
public final class d implements java.lang.CharSequence {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f681d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f682e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f683f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f684g;

    public d(java.lang.String text, java.util.List spanStyles, java.util.List paragraphStyles, java.util.List annotations) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(spanStyles, "spanStyles");
        kotlin.jvm.internal.o.g(paragraphStyles, "paragraphStyles");
        kotlin.jvm.internal.o.g(annotations, "annotations");
        this.f681d = text;
        this.f682e = spanStyles;
        this.f683f = paragraphStyles;
        this.f684g = annotations;
        int size = paragraphStyles.size();
        int i17 = -1;
        int i18 = 0;
        while (i18 < size) {
            a2.c cVar = (a2.c) paragraphStyles.get(i18);
            if (cVar.f676b >= i17) {
                int length = this.f681d.length();
                int i19 = cVar.f677c;
                if (!(i19 <= length)) {
                    throw new java.lang.IllegalArgumentException(("ParagraphStyle range [" + cVar.f676b + ", " + i19 + ") is out of boundary").toString());
                }
                i18++;
                i17 = i19;
            } else {
                throw new java.lang.IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    public final a2.d a(a2.d other) {
        kotlin.jvm.internal.o.g(other, "other");
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
        java.lang.String str = this.f681d;
        if (i17 == 0 && i18 == str.length()) {
            return this;
        }
        java.lang.String substring = str.substring(i17, i18);
        kotlin.jvm.internal.o.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new a2.d(substring, a2.e.a(this.f682e, i17, i18), a2.e.a(this.f683f, i17, i18), a2.e.a(this.f684g, i17, i18));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i17) {
        return this.f681d.charAt(i17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.d)) {
            return false;
        }
        a2.d dVar = (a2.d) obj;
        return kotlin.jvm.internal.o.b(this.f681d, dVar.f681d) && kotlin.jvm.internal.o.b(this.f682e, dVar.f682e) && kotlin.jvm.internal.o.b(this.f683f, dVar.f683f) && kotlin.jvm.internal.o.b(this.f684g, dVar.f684g);
    }

    public int hashCode() {
        return (((((this.f681d.hashCode() * 31) + this.f682e.hashCode()) * 31) + this.f683f.hashCode()) * 31) + this.f684g.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f681d.length();
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return this.f681d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.lang.String r2, java.util.List r3, java.util.List r4, int r5, kotlin.jvm.internal.i r6) {
        /*
            r1 = this;
            r6 = r5 & 2
            kz5.p0 r0 = kz5.p0.f313996d
            if (r6 == 0) goto L7
            r3 = r0
        L7:
            r5 = r5 & 4
            if (r5 == 0) goto Lc
            r4 = r0
        Lc:
            java.lang.String r5 = "text"
            kotlin.jvm.internal.o.g(r2, r5)
            java.lang.String r5 = "spanStyles"
            kotlin.jvm.internal.o.g(r3, r5)
            java.lang.String r5 = "paragraphStyles"
            kotlin.jvm.internal.o.g(r4, r5)
            r1.<init>(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.d.<init>(java.lang.String, java.util.List, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}
