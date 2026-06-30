package av5;

/* loaded from: classes16.dex */
public class k implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f95933d;

    /* renamed from: e, reason: collision with root package name */
    public final int f95934e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95935f;

    public k(int i17, int i18, int i19) {
        this.f95933d = i17;
        this.f95934e = i18;
        this.f95935f = i19;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        av5.k kVar = (av5.k) obj;
        int c17 = cv5.c.c(this.f95933d, kVar.f95933d);
        if (c17 != 0) {
            return c17;
        }
        int c18 = cv5.c.c(this.f95934e, kVar.f95934e);
        return c18 != 0 ? c18 : cv5.c.c(this.f95935f, kVar.f95935f);
    }
}
