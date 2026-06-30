package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes5.dex */
public final class x0 extends oz5.a {

    /* renamed from: e, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.w0 f392228e = new p3325xe03a0797.p3326xc267989b.w0(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f392229d;

    public x0(java.lang.String str) {
        super(f392228e);
        this.f392229d = str;
    }

    /* renamed from: equals */
    public boolean m144125xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3325xe03a0797.p3326xc267989b.x0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f392229d, ((p3325xe03a0797.p3326xc267989b.x0) obj).f392229d);
    }

    /* renamed from: hashCode */
    public int m144126x8cdac1b() {
        return this.f392229d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m144127x9616526c() {
        return "CoroutineName(" + this.f392229d + ')';
    }
}
