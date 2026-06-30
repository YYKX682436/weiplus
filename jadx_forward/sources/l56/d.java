package l56;

/* loaded from: classes13.dex */
public class d implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f398211d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f398212e;

    public d(java.lang.String str, java.lang.String str2) {
        this.f398211d = str;
        this.f398212e = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        l56.d dVar = (l56.d) obj;
        int compareTo = this.f398211d.compareTo(dVar.f398211d);
        return compareTo != 0 ? compareTo : this.f398212e.compareTo(dVar.f398212e);
    }

    /* renamed from: equals */
    public boolean m145169xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l56.d)) {
            return false;
        }
        l56.d dVar = (l56.d) obj;
        return dVar.f398211d.equals(this.f398211d) && dVar.f398212e.equals(this.f398212e);
    }

    /* renamed from: hashCode */
    public int m145170x8cdac1b() {
        return this.f398211d.hashCode() + this.f398212e.hashCode();
    }
}
