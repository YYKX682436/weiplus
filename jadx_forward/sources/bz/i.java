package bz;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f118159a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f118160b;

    /* renamed from: c, reason: collision with root package name */
    public int f118161c;

    public i(java.lang.String key, p3325xe03a0797.p3326xc267989b.p3332x361a9b.d lock, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        lock = (i18 & 2) != 0 ? p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null) : lock;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lock, "lock");
        this.f118159a = key;
        this.f118160b = lock;
        this.f118161c = i17;
    }

    /* renamed from: equals */
    public boolean m13606xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz.i)) {
            return false;
        }
        bz.i iVar = (bz.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f118159a, iVar.f118159a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f118160b, iVar.f118160b) && this.f118161c == iVar.f118161c;
    }

    /* renamed from: hashCode */
    public int m13607x8cdac1b() {
        return (((this.f118159a.hashCode() * 31) + this.f118160b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f118161c);
    }

    /* renamed from: toString */
    public java.lang.String m13608x9616526c() {
        return "MutexWrap(key=" + this.f118159a + ", lock=" + this.f118160b + ", refCount=" + this.f118161c + ')';
    }
}
