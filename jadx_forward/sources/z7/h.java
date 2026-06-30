package z7;

/* loaded from: classes16.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f552006a;

    /* renamed from: b, reason: collision with root package name */
    public final z7.l f552007b;

    public h(java.lang.String str, z7.l lVar) {
        this.f552006a = str;
        this.f552007b = lVar;
    }

    /* renamed from: equals */
    public boolean m178489xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z7.h.class != obj.getClass()) {
            return false;
        }
        z7.h hVar = (z7.h) obj;
        return this.f552006a.equals(hVar.f552006a) && this.f552007b.mo178486xb2c87fbf(hVar.f552007b);
    }

    /* renamed from: hashCode */
    public int m178490x8cdac1b() {
        return ((this.f552006a.hashCode() + 31) * 31) + this.f552007b.mo178487x8cdac1b();
    }
}
