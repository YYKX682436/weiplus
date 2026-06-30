package r01;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f449668a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f449669b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f449670c;

    /* renamed from: d, reason: collision with root package name */
    public final int f449671d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f449672e;

    /* renamed from: f, reason: collision with root package name */
    public final int f449673f;

    public l(long j17, java.lang.String frameSetName, java.lang.String frameSetData, int i17, java.lang.String cardId, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetData, "frameSetData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardId, "cardId");
        this.f449668a = j17;
        this.f449669b = frameSetName;
        this.f449670c = frameSetData;
        this.f449671d = i17;
        this.f449672e = cardId;
        this.f449673f = i18;
    }

    /* renamed from: equals */
    public boolean m161204xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01.l)) {
            return false;
        }
        r01.l lVar = (r01.l) obj;
        return this.f449668a == lVar.f449668a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449669b, lVar.f449669b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449670c, lVar.f449670c) && this.f449671d == lVar.f449671d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449672e, lVar.f449672e) && this.f449673f == lVar.f449673f;
    }

    /* renamed from: hashCode */
    public int m161205x8cdac1b() {
        return (((((((((java.lang.Long.hashCode(this.f449668a) * 31) + this.f449669b.hashCode()) * 31) + this.f449670c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f449671d)) * 31) + this.f449672e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f449673f);
    }

    /* renamed from: toString */
    public java.lang.String m161206x9616526c() {
        return "BizDynamicCardInfo(msgId=" + this.f449668a + ", frameSetName=" + this.f449669b + ", frameSetData=" + this.f449670c + ", pos=" + this.f449671d + ", cardId=" + this.f449672e + ", subPos=" + this.f449673f + ')';
    }
}
