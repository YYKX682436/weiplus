package av5;

/* loaded from: classes16.dex */
public class j implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f14396d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f14397e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14398f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14399g;

    public j(int[] iArr, int[] iArr2, int i17, int i18) {
        this.f14396d = iArr;
        this.f14397e = iArr2;
        this.f14398f = i17;
        this.f14399g = i18;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        av5.j jVar = (av5.j) obj;
        int b17 = cv5.c.b(this.f14396d, jVar.f14396d);
        if (b17 != 0) {
            return b17;
        }
        int b18 = cv5.c.b(this.f14397e, jVar.f14397e);
        return b18 != 0 ? b18 : cv5.c.c(this.f14398f, jVar.f14398f);
    }
}
