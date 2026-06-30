package df5;

/* loaded from: classes11.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final v11.s f313786a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.s f313787b;

    /* renamed from: c, reason: collision with root package name */
    public final v11.s f313788c;

    public x(v11.s sVar, v11.s sVar2, v11.s sVar3) {
        this.f313786a = sVar;
        this.f313787b = sVar2;
        this.f313788c = sVar3;
    }

    /* renamed from: equals */
    public boolean m124364xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.x)) {
            return false;
        }
        df5.x xVar = (df5.x) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313786a, xVar.f313786a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313787b, xVar.f313787b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313788c, xVar.f313788c);
    }

    /* renamed from: hashCode */
    public int m124365x8cdac1b() {
        v11.s sVar = this.f313786a;
        int m170946x8cdac1b = (sVar == null ? 0 : sVar.m170946x8cdac1b()) * 31;
        v11.s sVar2 = this.f313787b;
        int m170946x8cdac1b2 = (m170946x8cdac1b + (sVar2 == null ? 0 : sVar2.m170946x8cdac1b())) * 31;
        v11.s sVar3 = this.f313788c;
        return m170946x8cdac1b2 + (sVar3 != null ? sVar3.m170946x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m124366x9616526c() {
        return "CodeBlockCopyRanges(languageRange=" + this.f313786a + ", contentRange=" + this.f313787b + ", closingRange=" + this.f313788c + ')';
    }
}
