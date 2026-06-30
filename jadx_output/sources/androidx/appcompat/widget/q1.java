package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class q1 {

    /* renamed from: a, reason: collision with root package name */
    public int f9684a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9685b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f9686c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f9687d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f9688e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f9689f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9690g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9691h = false;

    public void a(int i17, int i18) {
        this.f9686c = i17;
        this.f9687d = i18;
        this.f9691h = true;
        if (this.f9690g) {
            if (i18 != Integer.MIN_VALUE) {
                this.f9684a = i18;
            }
            if (i17 != Integer.MIN_VALUE) {
                this.f9685b = i17;
                return;
            }
            return;
        }
        if (i17 != Integer.MIN_VALUE) {
            this.f9684a = i17;
        }
        if (i18 != Integer.MIN_VALUE) {
            this.f9685b = i18;
        }
    }
}
