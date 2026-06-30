package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class y3 {

    /* renamed from: a, reason: collision with root package name */
    public int f93824a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f93825b;

    /* renamed from: c, reason: collision with root package name */
    public int f93826c;

    /* renamed from: d, reason: collision with root package name */
    public int f93827d;

    /* renamed from: e, reason: collision with root package name */
    public int f93828e;

    public boolean a() {
        int i17 = this.f93824a;
        int i18 = 2;
        if ((i17 & 7) != 0) {
            int i19 = this.f93827d;
            int i27 = this.f93825b;
            if ((((i19 > i27 ? 1 : i19 == i27 ? 2 : 4) << 0) & i17) == 0) {
                return false;
            }
        }
        if ((i17 & 112) != 0) {
            int i28 = this.f93827d;
            int i29 = this.f93826c;
            if ((((i28 > i29 ? 1 : i28 == i29 ? 2 : 4) << 4) & i17) == 0) {
                return false;
            }
        }
        if ((i17 & 1792) != 0) {
            int i37 = this.f93828e;
            int i38 = this.f93825b;
            if ((((i37 > i38 ? 1 : i37 == i38 ? 2 : 4) << 8) & i17) == 0) {
                return false;
            }
        }
        if ((i17 & 28672) != 0) {
            int i39 = this.f93828e;
            int i47 = this.f93826c;
            if (i39 > i47) {
                i18 = 1;
            } else if (i39 != i47) {
                i18 = 4;
            }
            if ((i17 & (i18 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
