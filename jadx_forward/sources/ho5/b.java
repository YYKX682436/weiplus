package ho5;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f364433a;

    /* renamed from: b, reason: collision with root package name */
    public final long f364434b;

    public b(java.lang.String group, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(group, "group");
        this.f364433a = group;
        this.f364434b = j17;
    }

    /* renamed from: equals */
    public boolean m133848xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho5.b)) {
            return false;
        }
        ho5.b bVar = (ho5.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f364433a, bVar.f364433a) && this.f364434b == bVar.f364434b;
    }

    /* renamed from: hashCode */
    public int m133849x8cdac1b() {
        return (this.f364433a.hashCode() * 31) + java.lang.Long.hashCode(this.f364434b);
    }

    /* renamed from: toString */
    public java.lang.String m133850x9616526c() {
        return "MultiTalkMsgCache(group=" + this.f364433a + ", msgId=" + this.f364434b + ')';
    }
}
