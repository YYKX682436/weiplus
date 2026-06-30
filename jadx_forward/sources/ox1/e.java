package ox1;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int f431128a;

    /* renamed from: b, reason: collision with root package name */
    public int f431129b;

    /* renamed from: c, reason: collision with root package name */
    public int f431130c;

    /* renamed from: d, reason: collision with root package name */
    public int f431131d;

    public e() {
        this.f431128a = -1;
        this.f431129b = -1;
        this.f431130c = -1;
        this.f431131d = -1;
    }

    public int a() {
        int i17;
        int i18;
        int i19;
        int i27 = this.f431128a;
        if (i27 >= 0 && (i17 = this.f431129b) >= 0 && (i18 = this.f431130c) >= 0 && (i19 = this.f431131d) >= 0 && i27 <= i18 && (i27 != i18 || i17 <= i19)) {
            ix1.a l17 = nx1.d.q().l(this.f431128a);
            ix1.a l18 = nx1.d.q().l(this.f431130c);
            if (l17 != null && l18 != null) {
                int i28 = this.f431128a;
                int i29 = this.f431130c;
                if (i28 == i29 && this.f431129b == this.f431131d) {
                    return 1;
                }
                return (i28 == i29 && l17.b() == 1) ? 2 : 3;
            }
        }
        return 0;
    }

    public e(int i17, int i18, int i19, int i27) {
        this.f431128a = i17;
        this.f431129b = i18;
        this.f431130c = i19;
        this.f431131d = i27;
    }
}
