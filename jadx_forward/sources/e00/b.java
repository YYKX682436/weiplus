package e00;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.x7 f327271a;

    /* renamed from: b, reason: collision with root package name */
    public final long f327272b;

    public b(bw5.x7 jumpInfo, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        this.f327271a = jumpInfo;
        this.f327272b = j17;
    }

    /* renamed from: equals */
    public boolean m126540xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e00.b)) {
            return false;
        }
        e00.b bVar = (e00.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f327271a, bVar.f327271a) && this.f327272b == bVar.f327272b;
    }

    /* renamed from: hashCode */
    public int m126541x8cdac1b() {
        return (this.f327271a.hashCode() * 31) + java.lang.Long.hashCode(this.f327272b);
    }

    /* renamed from: toString */
    public java.lang.String m126542x9616526c() {
        return "JumpInfoCache(jumpInfo=" + this.f327271a + ", cacheTimeSecond=" + this.f327272b + ')';
    }
}
