package m11;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f404233a;

    /* renamed from: b, reason: collision with root package name */
    public final long f404234b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f404235c;

    /* renamed from: d, reason: collision with root package name */
    public final int f404236d;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f404238f;

    /* renamed from: g, reason: collision with root package name */
    public int f404239g = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f404237e = 0;

    public h(long j17, long j18, java.lang.String str, int i17) {
        this.f404233a = j17;
        this.f404234b = j18;
        this.f404235c = str;
        this.f404236d = i17;
    }

    public boolean a(k70.w wVar, java.lang.Object obj) {
        if (this.f404238f == null) {
            this.f404238f = java.util.Collections.synchronizedList(new java.util.LinkedList());
        }
        m11.i iVar = new m11.i(wVar, obj);
        if (this.f404238f.contains(iVar)) {
            return false;
        }
        this.f404238f.add(iVar);
        return true;
    }

    /* renamed from: equals */
    public boolean m146622xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof m11.h)) {
            return false;
        }
        m11.h hVar = (m11.h) obj;
        return hVar.f404233a == this.f404233a && hVar.f404234b == this.f404234b && java.util.Objects.equals(hVar.f404235c, this.f404235c) && hVar.f404236d == this.f404236d;
    }

    /* renamed from: hashCode */
    public int m146623x8cdac1b() {
        if (this.f404239g == 0) {
            this.f404239g = (this.f404233a + "_" + this.f404234b + "_" + this.f404235c + "_" + this.f404236d).hashCode();
        }
        return this.f404239g;
    }
}
