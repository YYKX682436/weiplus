package androidx.recyclerview.widget;

/* loaded from: classes16.dex */
public class l implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.r1 f12113a;

    /* renamed from: b, reason: collision with root package name */
    public int f12114b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f12115c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f12116d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f12117e = null;

    public l(androidx.recyclerview.widget.r1 r1Var) {
        this.f12113a = r1Var;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        int i19;
        if (this.f12114b == 3) {
            int i27 = this.f12115c;
            int i28 = this.f12116d;
            if (i17 <= i27 + i28 && (i19 = i17 + i18) >= i27 && this.f12117e == obj) {
                this.f12115c = java.lang.Math.min(i17, i27);
                this.f12116d = java.lang.Math.max(i28 + i27, i19) - this.f12115c;
                return;
            }
        }
        e();
        this.f12115c = i17;
        this.f12116d = i18;
        this.f12117e = obj;
        this.f12114b = 3;
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        int i19;
        if (this.f12114b == 1 && i17 >= (i19 = this.f12115c)) {
            int i27 = this.f12116d;
            if (i17 <= i19 + i27) {
                this.f12116d = i27 + i18;
                this.f12115c = java.lang.Math.min(i17, i19);
                return;
            }
        }
        e();
        this.f12115c = i17;
        this.f12116d = i18;
        this.f12114b = 1;
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        int i19;
        if (this.f12114b == 2 && (i19 = this.f12115c) >= i17 && i19 <= i17 + i18) {
            this.f12116d += i18;
            this.f12115c = i17;
        } else {
            e();
            this.f12115c = i17;
            this.f12116d = i18;
            this.f12114b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        e();
        this.f12113a.d(i17, i18);
    }

    public void e() {
        int i17 = this.f12114b;
        if (i17 == 0) {
            return;
        }
        androidx.recyclerview.widget.r1 r1Var = this.f12113a;
        if (i17 == 1) {
            r1Var.b(this.f12115c, this.f12116d);
        } else if (i17 == 2) {
            r1Var.c(this.f12115c, this.f12116d);
        } else if (i17 == 3) {
            r1Var.a(this.f12115c, this.f12116d, this.f12117e);
        }
        this.f12117e = null;
        this.f12114b = 0;
    }
}
