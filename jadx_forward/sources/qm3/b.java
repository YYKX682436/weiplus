package qm3;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final kp4.a f446298a;

    /* renamed from: b, reason: collision with root package name */
    public final long f446299b;

    public b(kp4.a track, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(track, "track");
        this.f446298a = track;
        this.f446299b = j17;
    }

    /* renamed from: equals */
    public boolean m160519xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm3.b)) {
            return false;
        }
        qm3.b bVar = (qm3.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f446298a, bVar.f446298a) && this.f446299b == bVar.f446299b;
    }

    /* renamed from: hashCode */
    public int m160520x8cdac1b() {
        return (this.f446298a.hashCode() * 31) + java.lang.Long.hashCode(this.f446299b);
    }

    /* renamed from: toString */
    public java.lang.String m160521x9616526c() {
        return "Key(track=" + this.f446298a + ", time=" + this.f446299b + ')';
    }
}
