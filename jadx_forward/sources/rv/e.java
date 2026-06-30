package rv;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.l4 f481373a;

    /* renamed from: b, reason: collision with root package name */
    public final int f481374b;

    public e(com.p314xaae8f345.mm.p2621x8fb0427b.l4 conversation, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        this.f481373a = conversation;
        this.f481374b = i17;
    }

    /* renamed from: equals */
    public boolean m163079xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv.e)) {
            return false;
        }
        rv.e eVar = (rv.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481373a, eVar.f481373a) && this.f481374b == eVar.f481374b;
    }

    /* renamed from: hashCode */
    public int m163080x8cdac1b() {
        return (this.f481373a.hashCode() * 31) + java.lang.Integer.hashCode(this.f481374b);
    }

    /* renamed from: toString */
    public java.lang.String m163081x9616526c() {
        return "ConversationInfo(conversation=" + this.f481373a + ", position=" + this.f481374b + ')';
    }
}
