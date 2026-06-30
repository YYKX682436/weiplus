package androidx.lifecycle;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f11612a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f11613b;

    public c(int i17, java.lang.reflect.Method method) {
        this.f11612a = i17;
        this.f11613b = method;
        method.setAccessible(true);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.lifecycle.c)) {
            return false;
        }
        androidx.lifecycle.c cVar = (androidx.lifecycle.c) obj;
        return this.f11612a == cVar.f11612a && this.f11613b.getName().equals(cVar.f11613b.getName());
    }

    public int hashCode() {
        return (this.f11612a * 31) + this.f11613b.getName().hashCode();
    }
}
