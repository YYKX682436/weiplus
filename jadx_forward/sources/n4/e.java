package n4;

/* loaded from: classes13.dex */
public class e implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f416401d;

    /* renamed from: e, reason: collision with root package name */
    public final int f416402e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f416403f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f416404g;

    public e(int i17, int i18, java.lang.String str, java.lang.String str2) {
        this.f416401d = i17;
        this.f416402e = i18;
        this.f416403f = str;
        this.f416404g = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        n4.e eVar = (n4.e) obj;
        int i17 = this.f416401d - eVar.f416401d;
        return i17 == 0 ? this.f416402e - eVar.f416402e : i17;
    }
}
