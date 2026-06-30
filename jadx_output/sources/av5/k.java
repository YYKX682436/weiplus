package av5;

/* loaded from: classes16.dex */
public class k implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f14400d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14401e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14402f;

    public k(int i17, int i18, int i19) {
        this.f14400d = i17;
        this.f14401e = i18;
        this.f14402f = i19;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        av5.k kVar = (av5.k) obj;
        int c17 = cv5.c.c(this.f14400d, kVar.f14400d);
        if (c17 != 0) {
            return c17;
        }
        int c18 = cv5.c.c(this.f14401e, kVar.f14401e);
        return c18 != 0 ? c18 : cv5.c.c(this.f14402f, kVar.f14402f);
    }
}
