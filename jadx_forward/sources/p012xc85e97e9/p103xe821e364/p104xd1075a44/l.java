package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes16.dex */
public class l implements p012xc85e97e9.p103xe821e364.p104xd1075a44.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.r1 f93646a;

    /* renamed from: b, reason: collision with root package name */
    public int f93647b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f93648c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f93649d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f93650e = null;

    public l(p012xc85e97e9.p103xe821e364.p104xd1075a44.r1 r1Var) {
        this.f93646a = r1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        int i19;
        if (this.f93647b == 3) {
            int i27 = this.f93648c;
            int i28 = this.f93649d;
            if (i17 <= i27 + i28 && (i19 = i17 + i18) >= i27 && this.f93650e == obj) {
                this.f93648c = java.lang.Math.min(i17, i27);
                this.f93649d = java.lang.Math.max(i28 + i27, i19) - this.f93648c;
                return;
            }
        }
        e();
        this.f93648c = i17;
        this.f93649d = i18;
        this.f93650e = obj;
        this.f93647b = 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void b(int i17, int i18) {
        int i19;
        if (this.f93647b == 1 && i17 >= (i19 = this.f93648c)) {
            int i27 = this.f93649d;
            if (i17 <= i19 + i27) {
                this.f93649d = i27 + i18;
                this.f93648c = java.lang.Math.min(i17, i19);
                return;
            }
        }
        e();
        this.f93648c = i17;
        this.f93649d = i18;
        this.f93647b = 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void c(int i17, int i18) {
        int i19;
        if (this.f93647b == 2 && (i19 = this.f93648c) >= i17 && i19 <= i17 + i18) {
            this.f93649d += i18;
            this.f93648c = i17;
        } else {
            e();
            this.f93648c = i17;
            this.f93649d = i18;
            this.f93647b = 2;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void d(int i17, int i18) {
        e();
        this.f93646a.d(i17, i18);
    }

    public void e() {
        int i17 = this.f93647b;
        if (i17 == 0) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.r1 r1Var = this.f93646a;
        if (i17 == 1) {
            r1Var.b(this.f93648c, this.f93649d);
        } else if (i17 == 2) {
            r1Var.c(this.f93648c, this.f93649d);
        } else if (i17 == 3) {
            r1Var.a(this.f93648c, this.f93649d, this.f93650e);
        }
        this.f93650e = null;
        this.f93647b = 0;
    }
}
