package xh2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f536076a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f536077b;

    /* renamed from: c, reason: collision with root package name */
    public final long f536078c;

    public e(java.lang.String micTopicTitle, java.lang.String micTopic, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micTopicTitle, "micTopicTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micTopic, "micTopic");
        this.f536076a = micTopicTitle;
        this.f536077b = micTopic;
        this.f536078c = j17;
    }

    /* renamed from: equals */
    public boolean m175545xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.e)) {
            return false;
        }
        xh2.e eVar = (xh2.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536076a, eVar.f536076a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536077b, eVar.f536077b) && this.f536078c == eVar.f536078c;
    }

    /* renamed from: hashCode */
    public int m175546x8cdac1b() {
        return (((this.f536076a.hashCode() * 31) + this.f536077b.hashCode()) * 31) + java.lang.Long.hashCode(this.f536078c);
    }

    /* renamed from: toString */
    public java.lang.String m175547x9616526c() {
        return "FinderLiveMicTopicData(micTopicTitle=" + this.f536076a + ", micTopic=" + this.f536077b + ", micTopicVersion=" + this.f536078c + ')';
    }
}
