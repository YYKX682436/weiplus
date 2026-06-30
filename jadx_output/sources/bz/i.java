package bz;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f36626a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f36627b;

    /* renamed from: c, reason: collision with root package name */
    public int f36628c;

    public i(java.lang.String key, kotlinx.coroutines.sync.d lock, int i17, int i18, kotlin.jvm.internal.i iVar) {
        lock = (i18 & 2) != 0 ? kotlinx.coroutines.sync.l.a(false, 1, null) : lock;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(lock, "lock");
        this.f36626a = key;
        this.f36627b = lock;
        this.f36628c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz.i)) {
            return false;
        }
        bz.i iVar = (bz.i) obj;
        return kotlin.jvm.internal.o.b(this.f36626a, iVar.f36626a) && kotlin.jvm.internal.o.b(this.f36627b, iVar.f36627b) && this.f36628c == iVar.f36628c;
    }

    public int hashCode() {
        return (((this.f36626a.hashCode() * 31) + this.f36627b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f36628c);
    }

    public java.lang.String toString() {
        return "MutexWrap(key=" + this.f36626a + ", lock=" + this.f36627b + ", refCount=" + this.f36628c + ')';
    }
}
