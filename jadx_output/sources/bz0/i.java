package bz0;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f36748a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f36749b;

    public i(java.lang.String tmplId, java.util.List exposeMusic) {
        kotlin.jvm.internal.o.g(tmplId, "tmplId");
        kotlin.jvm.internal.o.g(exposeMusic, "exposeMusic");
        this.f36748a = tmplId;
        this.f36749b = exposeMusic;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz0.i)) {
            return false;
        }
        bz0.i iVar = (bz0.i) obj;
        return kotlin.jvm.internal.o.b(this.f36748a, iVar.f36748a) && kotlin.jvm.internal.o.b(this.f36749b, iVar.f36749b);
    }

    public int hashCode() {
        return (this.f36748a.hashCode() * 31) + this.f36749b.hashCode();
    }

    public java.lang.String toString() {
        return "TemplateMusicExpose(tmplId=" + this.f36748a + ", exposeMusic=" + this.f36749b + ')';
    }
}
