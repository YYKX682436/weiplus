package we2;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f526765a;

    /* renamed from: b, reason: collision with root package name */
    public final int f526766b;

    /* renamed from: c, reason: collision with root package name */
    public final we2.d f526767c;

    public m(int i17, int i18, we2.d spanItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanItem, "spanItem");
        this.f526765a = i17;
        this.f526766b = i18;
        this.f526767c = spanItem;
    }

    /* renamed from: equals */
    public boolean m173644xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we2.m)) {
            return false;
        }
        we2.m mVar = (we2.m) obj;
        return this.f526765a == mVar.f526765a && this.f526766b == mVar.f526766b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526767c, mVar.f526767c);
    }

    /* renamed from: hashCode */
    public int m173645x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f526765a) * 31) + java.lang.Integer.hashCode(this.f526766b)) * 31) + this.f526767c.m173636x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m173646x9616526c() {
        return "SpanPositionInfo(startPos=" + this.f526765a + ", endPos=" + this.f526766b + ", spanItem=" + this.f526767c + ')';
    }
}
