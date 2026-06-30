package s;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final b.c f483360a;

    public c(b.c cVar) {
        this.f483360a = cVar;
    }

    /* renamed from: equals */
    public boolean m163478xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof s.c) {
            return ((s.c) obj).f483360a.asBinder().equals(this.f483360a.asBinder());
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m163479x8cdac1b() {
        return this.f483360a.asBinder().hashCode();
    }
}
