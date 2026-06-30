package hk0;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f363285a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f363286b;

    public j(int i17, android.os.Bundle extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        this.f363285a = i17;
        this.f363286b = extra;
    }

    /* renamed from: equals */
    public boolean m133641xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.j)) {
            return false;
        }
        hk0.j jVar = (hk0.j) obj;
        return this.f363285a == jVar.f363285a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363286b, jVar.f363286b);
    }

    /* renamed from: hashCode */
    public int m133642x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f363285a) * 31) + this.f363286b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133643x9616526c() {
        return "EditEvent(eventType=" + this.f363285a + ", extra=" + this.f363286b + ')';
    }
}
