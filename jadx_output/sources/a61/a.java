package a61;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final a61.d f1717a;

    /* renamed from: b, reason: collision with root package name */
    public final a61.c f1718b;

    public a(a61.d uiConfig, a61.c sourceConfig) {
        kotlin.jvm.internal.o.g(uiConfig, "uiConfig");
        kotlin.jvm.internal.o.g(sourceConfig, "sourceConfig");
        this.f1717a = uiConfig;
        this.f1718b = sourceConfig;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a61.a)) {
            return false;
        }
        a61.a aVar = (a61.a) obj;
        return kotlin.jvm.internal.o.b(this.f1717a, aVar.f1717a) && kotlin.jvm.internal.o.b(this.f1718b, aVar.f1718b);
    }

    public int hashCode() {
        return (this.f1717a.hashCode() * 31) + this.f1718b.hashCode();
    }

    public java.lang.String toString() {
        return "MMLivePhotoPlayerConfig(uiConfig=" + this.f1717a + ", sourceConfig=" + this.f1718b + ')';
    }
}
