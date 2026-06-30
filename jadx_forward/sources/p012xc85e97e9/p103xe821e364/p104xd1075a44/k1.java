package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f93641a;

    /* renamed from: b, reason: collision with root package name */
    public int f93642b;

    /* renamed from: c, reason: collision with root package name */
    public int f93643c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f93644d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93645e;

    public k1() {
        d();
    }

    public void a() {
        this.f93643c = this.f93644d ? this.f93641a.g() : this.f93641a.k();
    }

    public void b(android.view.View view, int i17) {
        if (this.f93644d) {
            this.f93643c = this.f93641a.b(view) + this.f93641a.m();
        } else {
            this.f93643c = this.f93641a.e(view);
        }
        this.f93642b = i17;
    }

    public void c(android.view.View view, int i17) {
        int m17 = this.f93641a.m();
        if (m17 >= 0) {
            b(view, i17);
            return;
        }
        this.f93642b = i17;
        if (this.f93644d) {
            int g17 = (this.f93641a.g() - m17) - this.f93641a.b(view);
            this.f93643c = this.f93641a.g() - g17;
            if (g17 > 0) {
                int c17 = this.f93643c - this.f93641a.c(view);
                int k17 = this.f93641a.k();
                int min = c17 - (k17 + java.lang.Math.min(this.f93641a.e(view) - k17, 0));
                if (min < 0) {
                    this.f93643c += java.lang.Math.min(g17, -min);
                    return;
                }
                return;
            }
            return;
        }
        int e17 = this.f93641a.e(view);
        int k18 = e17 - this.f93641a.k();
        this.f93643c = e17;
        if (k18 > 0) {
            int g18 = (this.f93641a.g() - java.lang.Math.min(0, (this.f93641a.g() - m17) - this.f93641a.b(view))) - (e17 + this.f93641a.c(view));
            if (g18 < 0) {
                this.f93643c -= java.lang.Math.min(k18, -g18);
            }
        }
    }

    public void d() {
        this.f93642b = -1;
        this.f93643c = Integer.MIN_VALUE;
        this.f93644d = false;
        this.f93645e = false;
    }

    /* renamed from: toString */
    public java.lang.String m8173x9616526c() {
        return "AnchorInfo{mPosition=" + this.f93642b + ", mCoordinate=" + this.f93643c + ", mLayoutFromEnd=" + this.f93644d + ", mValid=" + this.f93645e + '}';
    }
}
