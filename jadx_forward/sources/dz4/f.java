package dz4;

/* loaded from: classes11.dex */
public final class f extends dz4.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f326765m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f326766n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f326767o;

    /* renamed from: p, reason: collision with root package name */
    public final int f326768p;

    /* renamed from: q, reason: collision with root package name */
    public final long f326769q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f326770r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String msgId, java.lang.String conversationName, java.lang.String xml, int i17, long j17, boolean z17) {
        super(i17, false, xml, j17, 0, 0, false, 0, null, null, null, null, 4080, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgId, "msgId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversationName, "conversationName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
        this.f326765m = msgId;
        this.f326766n = conversationName;
        this.f326767o = xml;
        this.f326768p = i17;
        this.f326769q = j17;
        this.f326770r = z17;
    }

    /* renamed from: equals */
    public boolean m126492xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.f)) {
            return false;
        }
        dz4.f fVar = (dz4.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326765m, fVar.f326765m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326766n, fVar.f326766n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326767o, fVar.f326767o) && this.f326768p == fVar.f326768p && this.f326769q == fVar.f326769q && this.f326770r == fVar.f326770r;
    }

    /* renamed from: hashCode */
    public int m126493x8cdac1b() {
        return (((((((((this.f326765m.hashCode() * 31) + this.f326766n.hashCode()) * 31) + this.f326767o.hashCode()) * 31) + java.lang.Integer.hashCode(this.f326768p)) * 31) + java.lang.Long.hashCode(this.f326769q)) * 31) + java.lang.Boolean.hashCode(this.f326770r);
    }

    /* renamed from: toString */
    public java.lang.String m126494x9616526c() {
        return "Chat(msgId=" + this.f326765m + ", conversationName=" + this.f326766n + ", xml=" + this.f326767o + ", scene=" + this.f326768p + ", noteLocalId=" + this.f326769q + ", isFromGroupChat=" + this.f326770r + ')';
    }
}
