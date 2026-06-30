package ps3;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final r45.oi5 f439651a;

    /* renamed from: b, reason: collision with root package name */
    public final ps3.e f439652b;

    public p(r45.oi5 member, ps3.e state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(member, "member");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f439651a = member;
        this.f439652b = state;
    }

    /* renamed from: equals */
    public boolean m158935xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps3.p)) {
            return false;
        }
        ps3.p pVar = (ps3.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439651a, pVar.f439651a) && this.f439652b == pVar.f439652b;
    }

    /* renamed from: hashCode */
    public int m158936x8cdac1b() {
        return (this.f439651a.hashCode() * 31) + this.f439652b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m158937x9616526c() {
        return "LatestChangeStat(member=" + this.f439651a + ", state=" + this.f439652b + ')';
    }
}
