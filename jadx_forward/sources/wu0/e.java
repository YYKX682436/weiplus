package wu0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ru0.h f531190a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.ne4 f531191b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f531192c;

    public e(ru0.h uniqueHexKey, r45.ne4 ne4Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueHexKey, "uniqueHexKey");
        this.f531190a = uniqueHexKey;
        this.f531191b = ne4Var;
        this.f531192c = z17;
    }

    /* renamed from: equals */
    public boolean m174449xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu0.e)) {
            return false;
        }
        wu0.e eVar = (wu0.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f531190a, eVar.f531190a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f531191b, eVar.f531191b) && this.f531192c == eVar.f531192c;
    }

    /* renamed from: hashCode */
    public int m174450x8cdac1b() {
        int m163025x8cdac1b = this.f531190a.m163025x8cdac1b() * 31;
        r45.ne4 ne4Var = this.f531191b;
        return ((m163025x8cdac1b + (ne4Var == null ? 0 : ne4Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f531192c);
    }

    /* renamed from: toString */
    public java.lang.String m174451x9616526c() {
        return "SubtitleResultData(uniqueHexKey=" + this.f531190a + ", subtitleData=" + this.f531191b + ", isGroupCompleted=" + this.f531192c + ')';
    }
}
