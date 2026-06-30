package ye5;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f542797a;

    /* renamed from: b, reason: collision with root package name */
    public final ze5.ma f542798b;

    public j(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, ze5.ma quoteProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quoteProvider, "quoteProvider");
        this.f542797a = msgInfo;
        this.f542798b = quoteProvider;
    }

    /* renamed from: equals */
    public boolean m176898xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye5.j)) {
            return false;
        }
        ye5.j jVar = (ye5.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542797a, jVar.f542797a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542798b, jVar.f542798b);
    }

    /* renamed from: hashCode */
    public int m176899x8cdac1b() {
        return (this.f542797a.hashCode() * 31) + this.f542798b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m176900x9616526c() {
        return "MediaQuoteInfo(msgInfo=" + this.f542797a + ", quoteProvider=" + this.f542798b + ')';
    }
}
