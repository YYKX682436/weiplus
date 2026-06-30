package dh3;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 f314019a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f314020b;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 msgIdTalker, java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdTalker, "msgIdTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        this.f314019a = msgIdTalker;
        this.f314020b = toUser;
    }

    /* renamed from: equals */
    public boolean m124397xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh3.a)) {
            return false;
        }
        dh3.a aVar = (dh3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314019a, aVar.f314019a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314020b, aVar.f314020b);
    }

    /* renamed from: hashCode */
    public int m124398x8cdac1b() {
        return (this.f314019a.m66994x8cdac1b() * 31) + this.f314020b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124399x9616526c() {
        return "BatchSendRecord(msgIdTalker=" + this.f314019a + ", toUser=" + this.f314020b + ')';
    }
}
