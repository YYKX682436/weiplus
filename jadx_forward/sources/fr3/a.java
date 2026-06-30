package fr3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f347313a;

    /* renamed from: b, reason: collision with root package name */
    public long f347314b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f347315c;

    /* renamed from: d, reason: collision with root package name */
    public final long f347316d;

    public a(java.lang.String userName, long j17, java.lang.String source, long j18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        userName = (i17 & 1) != 0 ? "" : userName;
        j17 = (i17 & 2) != 0 ? 0L : j17;
        source = (i17 & 4) != 0 ? "" : source;
        j18 = (i17 & 8) != 0 ? 0L : j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f347313a = userName;
        this.f347314b = j17;
        this.f347315c = source;
        this.f347316d = j18;
    }

    /* renamed from: equals */
    public boolean m130058xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr3.a)) {
            return false;
        }
        fr3.a aVar = (fr3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f347313a, aVar.f347313a) && this.f347314b == aVar.f347314b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f347315c, aVar.f347315c) && this.f347316d == aVar.f347316d;
    }

    /* renamed from: hashCode */
    public int m130059x8cdac1b() {
        return (((((this.f347313a.hashCode() * 31) + java.lang.Long.hashCode(this.f347314b)) * 31) + this.f347315c.hashCode()) * 31) + java.lang.Long.hashCode(this.f347316d);
    }

    /* renamed from: toString */
    public java.lang.String m130060x9616526c() {
        return "ConversationData(userName=" + this.f347313a + ", conversationTime=" + this.f347314b + ", source=" + this.f347315c + ", addContactTime=" + this.f347316d + ')';
    }
}
