package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes13.dex */
public class q1 {

    /* renamed from: a, reason: collision with root package name */
    public int f91217a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f91218b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f91219c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f91220d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f91221e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f91222f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f91223g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f91224h = false;

    public void a(int i17, int i18) {
        this.f91219c = i17;
        this.f91220d = i18;
        this.f91224h = true;
        if (this.f91223g) {
            if (i18 != Integer.MIN_VALUE) {
                this.f91217a = i18;
            }
            if (i17 != Integer.MIN_VALUE) {
                this.f91218b = i17;
                return;
            }
            return;
        }
        if (i17 != Integer.MIN_VALUE) {
            this.f91217a = i17;
        }
        if (i18 != Integer.MIN_VALUE) {
            this.f91218b = i18;
        }
    }
}
