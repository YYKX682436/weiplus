package ic5;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f371967a;

    /* renamed from: b, reason: collision with root package name */
    public final r15.d f371968b;

    public c(int i17, r15.d groupInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupInfo, "groupInfo");
        this.f371967a = i17;
        this.f371968b = groupInfo;
    }

    /* renamed from: equals */
    public boolean m135088xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic5.c)) {
            return false;
        }
        ic5.c cVar = (ic5.c) obj;
        return this.f371967a == cVar.f371967a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f371968b, cVar.f371968b);
    }

    /* renamed from: hashCode */
    public int m135089x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f371967a) * 31) + this.f371968b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m135090x9616526c() {
        return "GroupInfoCacheEntry(contentHash=" + this.f371967a + ", groupInfo=" + this.f371968b + ')';
    }
}
