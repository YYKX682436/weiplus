package b23;

/* loaded from: classes12.dex */
public final class g extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.k1 f98926b;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.k1 proxy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proxy, "proxy");
        this.f98926b = proxy;
    }

    /* renamed from: equals */
    public boolean m9651xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b23.g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98926b, ((b23.g) obj).f98926b);
    }

    /* renamed from: hashCode */
    public int m9652x8cdac1b() {
        return this.f98926b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m9653x9616526c() {
        return "VoiceSearchRequiredAction(proxy=" + this.f98926b + ')';
    }
}
