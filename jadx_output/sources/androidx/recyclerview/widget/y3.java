package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class y3 {

    /* renamed from: a, reason: collision with root package name */
    public int f12291a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f12292b;

    /* renamed from: c, reason: collision with root package name */
    public int f12293c;

    /* renamed from: d, reason: collision with root package name */
    public int f12294d;

    /* renamed from: e, reason: collision with root package name */
    public int f12295e;

    public boolean a() {
        int i17 = this.f12291a;
        int i18 = 2;
        if ((i17 & 7) != 0) {
            int i19 = this.f12294d;
            int i27 = this.f12292b;
            if ((((i19 > i27 ? 1 : i19 == i27 ? 2 : 4) << 0) & i17) == 0) {
                return false;
            }
        }
        if ((i17 & 112) != 0) {
            int i28 = this.f12294d;
            int i29 = this.f12293c;
            if ((((i28 > i29 ? 1 : i28 == i29 ? 2 : 4) << 4) & i17) == 0) {
                return false;
            }
        }
        if ((i17 & 1792) != 0) {
            int i37 = this.f12295e;
            int i38 = this.f12292b;
            if ((((i37 > i38 ? 1 : i37 == i38 ? 2 : 4) << 8) & i17) == 0) {
                return false;
            }
        }
        if ((i17 & 28672) != 0) {
            int i39 = this.f12295e;
            int i47 = this.f12293c;
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
