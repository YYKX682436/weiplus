package lu;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f402849a;

    /* renamed from: b, reason: collision with root package name */
    public final oi3.g f402850b;

    public c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, oi3.g simpleMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        this.f402849a = msgInfo;
        this.f402850b = simpleMsgInfo;
    }

    /* renamed from: equals */
    public boolean m146330xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu.c)) {
            return false;
        }
        lu.c cVar = (lu.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f402849a, cVar.f402849a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f402850b, cVar.f402850b);
    }

    /* renamed from: hashCode */
    public int m146331x8cdac1b() {
        return (this.f402849a.hashCode() * 31) + this.f402850b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m146332x9616526c() {
        return "ResolvedQuoteMsg(msgInfo=" + this.f402849a + ", simpleMsgInfo=" + this.f402850b + ')';
    }
}
