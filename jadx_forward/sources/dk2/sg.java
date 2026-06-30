package dk2;

/* loaded from: classes2.dex */
public final class sg {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f315615a;

    /* renamed from: b, reason: collision with root package name */
    public final long f315616b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f315617c;

    public sg(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 info, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 2) != 0 ? java.lang.System.currentTimeMillis() : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f315615a = info;
        this.f315616b = j17;
    }

    /* renamed from: equals */
    public boolean m124660xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.sg)) {
            return false;
        }
        dk2.sg sgVar = (dk2.sg) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315615a, sgVar.f315615a) && this.f315616b == sgVar.f315616b;
    }

    /* renamed from: hashCode */
    public int m124661x8cdac1b() {
        return (this.f315615a.hashCode() * 31) + java.lang.Long.hashCode(this.f315616b);
    }

    /* renamed from: toString */
    public java.lang.String m124662x9616526c() {
        return "LivingStatusInfoCacheItem(info=" + this.f315615a + ", timeStamp=" + this.f315616b + ')';
    }
}
