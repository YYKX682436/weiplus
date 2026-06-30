package g2;

/* loaded from: classes14.dex */
public final class c implements g2.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f349220a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349221b;

    public c(int i17, int i18) {
        this.f349220a = i17;
        this.f349221b = i18;
    }

    @Override // g2.d
    public void a(g2.f buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        int i17 = 0;
        for (int i18 = 0; i18 < this.f349220a; i18++) {
            i17++;
            int i19 = buffer.f349230b;
            if (i19 > i17) {
                if (java.lang.Character.isHighSurrogate(buffer.b((i19 - i17) + (-1))) && java.lang.Character.isLowSurrogate(buffer.b(buffer.f349230b - i17))) {
                    i17++;
                }
            }
            if (i17 == buffer.f349230b) {
                break;
            }
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f349221b; i28++) {
            i27++;
            if (buffer.f349231c + i27 < buffer.c()) {
                if (java.lang.Character.isHighSurrogate(buffer.b((buffer.f349231c + i27) + (-1))) && java.lang.Character.isLowSurrogate(buffer.b(buffer.f349231c + i27))) {
                    i27++;
                }
            }
            if (buffer.f349231c + i27 == buffer.c()) {
                break;
            }
        }
        int i29 = buffer.f349231c;
        buffer.a(i29, i27 + i29);
        int i37 = buffer.f349230b;
        buffer.a(i37 - i17, i37);
    }

    /* renamed from: equals */
    public boolean m130679xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.c)) {
            return false;
        }
        g2.c cVar = (g2.c) obj;
        return this.f349220a == cVar.f349220a && this.f349221b == cVar.f349221b;
    }

    /* renamed from: hashCode */
    public int m130680x8cdac1b() {
        return (this.f349220a * 31) + this.f349221b;
    }

    /* renamed from: toString */
    public java.lang.String m130681x9616526c() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f349220a + ", lengthAfterCursor=" + this.f349221b + ')';
    }
}
