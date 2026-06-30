package bx0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public e3.d f36295a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36296b;

    public j(e3.d insets, int i17) {
        kotlin.jvm.internal.o.g(insets, "insets");
        this.f36295a = insets;
        this.f36296b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx0.j)) {
            return false;
        }
        bx0.j jVar = (bx0.j) obj;
        return kotlin.jvm.internal.o.b(this.f36295a, jVar.f36295a) && this.f36296b == jVar.f36296b;
    }

    public int hashCode() {
        return (this.f36295a.hashCode() * 31) + java.lang.Integer.hashCode(this.f36296b);
    }

    public java.lang.String toString() {
        return "TimelineUIStyle(insets=" + this.f36295a + ", storylineHeight=" + this.f36296b + ')';
    }
}
