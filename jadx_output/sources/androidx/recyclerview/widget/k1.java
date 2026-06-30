package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f12108a;

    /* renamed from: b, reason: collision with root package name */
    public int f12109b;

    /* renamed from: c, reason: collision with root package name */
    public int f12110c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12111d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12112e;

    public k1() {
        d();
    }

    public void a() {
        this.f12110c = this.f12111d ? this.f12108a.g() : this.f12108a.k();
    }

    public void b(android.view.View view, int i17) {
        if (this.f12111d) {
            this.f12110c = this.f12108a.b(view) + this.f12108a.m();
        } else {
            this.f12110c = this.f12108a.e(view);
        }
        this.f12109b = i17;
    }

    public void c(android.view.View view, int i17) {
        int m17 = this.f12108a.m();
        if (m17 >= 0) {
            b(view, i17);
            return;
        }
        this.f12109b = i17;
        if (this.f12111d) {
            int g17 = (this.f12108a.g() - m17) - this.f12108a.b(view);
            this.f12110c = this.f12108a.g() - g17;
            if (g17 > 0) {
                int c17 = this.f12110c - this.f12108a.c(view);
                int k17 = this.f12108a.k();
                int min = c17 - (k17 + java.lang.Math.min(this.f12108a.e(view) - k17, 0));
                if (min < 0) {
                    this.f12110c += java.lang.Math.min(g17, -min);
                    return;
                }
                return;
            }
            return;
        }
        int e17 = this.f12108a.e(view);
        int k18 = e17 - this.f12108a.k();
        this.f12110c = e17;
        if (k18 > 0) {
            int g18 = (this.f12108a.g() - java.lang.Math.min(0, (this.f12108a.g() - m17) - this.f12108a.b(view))) - (e17 + this.f12108a.c(view));
            if (g18 < 0) {
                this.f12110c -= java.lang.Math.min(k18, -g18);
            }
        }
    }

    public void d() {
        this.f12109b = -1;
        this.f12110c = Integer.MIN_VALUE;
        this.f12111d = false;
        this.f12112e = false;
    }

    public java.lang.String toString() {
        return "AnchorInfo{mPosition=" + this.f12109b + ", mCoordinate=" + this.f12110c + ", mLayoutFromEnd=" + this.f12111d + ", mValid=" + this.f12112e + '}';
    }
}
