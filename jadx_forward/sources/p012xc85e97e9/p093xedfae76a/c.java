package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f93145a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f93146b;

    public c(int i17, java.lang.reflect.Method method) {
        this.f93145a = i17;
        this.f93146b = method;
        method.setAccessible(true);
    }

    /* renamed from: equals */
    public boolean m7787xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p093xedfae76a.c)) {
            return false;
        }
        p012xc85e97e9.p093xedfae76a.c cVar = (p012xc85e97e9.p093xedfae76a.c) obj;
        return this.f93145a == cVar.f93145a && this.f93146b.getName().equals(cVar.f93146b.getName());
    }

    /* renamed from: hashCode */
    public int m7788x8cdac1b() {
        return (this.f93145a * 31) + this.f93146b.getName().hashCode();
    }
}
