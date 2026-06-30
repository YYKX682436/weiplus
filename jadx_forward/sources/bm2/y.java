package bm2;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public int f103971a;

    /* renamed from: b, reason: collision with root package name */
    public int f103972b;

    public y(int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i19 & 1) != 0 ? -1 : i17;
        i18 = (i19 & 2) != 0 ? -1 : i18;
        this.f103971a = i17;
        this.f103972b = i18;
    }

    /* renamed from: equals */
    public boolean m10792xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.y)) {
            return false;
        }
        bm2.y yVar = (bm2.y) obj;
        return this.f103971a == yVar.f103971a && this.f103972b == yVar.f103972b;
    }

    /* renamed from: hashCode */
    public int m10793x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f103971a) * 31) + java.lang.Integer.hashCode(this.f103972b);
    }

    /* renamed from: toString */
    public java.lang.String m10794x9616526c() {
        return "SpanIndex(start=" + this.f103971a + ", end=" + this.f103972b + ')';
    }
}
