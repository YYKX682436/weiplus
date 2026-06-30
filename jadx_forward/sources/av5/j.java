package av5;

/* loaded from: classes16.dex */
public class j implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f95929d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f95930e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95931f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95932g;

    public j(int[] iArr, int[] iArr2, int i17, int i18) {
        this.f95929d = iArr;
        this.f95930e = iArr2;
        this.f95931f = i17;
        this.f95932g = i18;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        av5.j jVar = (av5.j) obj;
        int b17 = cv5.c.b(this.f95929d, jVar.f95929d);
        if (b17 != 0) {
            return b17;
        }
        int b18 = cv5.c.b(this.f95930e, jVar.f95930e);
        return b18 != 0 ? b18 : cv5.c.c(this.f95931f, jVar.f95931f);
    }
}
