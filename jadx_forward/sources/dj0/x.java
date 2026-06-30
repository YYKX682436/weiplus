package dj0;

/* loaded from: classes14.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final dj0.w f314420a;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            int i17 = dj0.v.f314417r;
        } else {
            int i18 = dj0.w.f314418b;
        }
    }

    public x(android.view.WindowInsets windowInsets) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            this.f314420a = new dj0.v(this, windowInsets);
            return;
        }
        if (i17 >= 29) {
            this.f314420a = new dj0.u(this, windowInsets);
        } else if (i17 >= 28) {
            this.f314420a = new dj0.t(this, windowInsets);
        } else {
            this.f314420a = new dj0.s(this, windowInsets);
        }
    }

    /* renamed from: equals */
    public boolean m124489xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj0.x)) {
            return false;
        }
        return m3.c.a(this.f314420a, ((dj0.x) obj).f314420a);
    }

    /* renamed from: hashCode */
    public int m124490x8cdac1b() {
        dj0.w wVar = this.f314420a;
        if (wVar == null) {
            return 0;
        }
        return wVar.mo124485x8cdac1b();
    }

    public x(dj0.x xVar) {
        if (xVar != null) {
            dj0.w wVar = xVar.f314420a;
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 >= 30 && (wVar instanceof dj0.v)) {
                this.f314420a = new dj0.v(this, (dj0.v) wVar);
            } else if (i17 >= 29 && (wVar instanceof dj0.u)) {
                this.f314420a = new dj0.u(this, (dj0.u) wVar);
            } else if (i17 >= 28 && (wVar instanceof dj0.t)) {
                this.f314420a = new dj0.t(this, (dj0.t) wVar);
            } else if (wVar instanceof dj0.s) {
                this.f314420a = new dj0.s(this, (dj0.s) wVar);
            } else if (wVar instanceof dj0.r) {
                this.f314420a = new dj0.r(this, (dj0.r) wVar);
            } else {
                this.f314420a = new dj0.w(this);
            }
            wVar.e(this);
            return;
        }
        this.f314420a = new dj0.w(this);
    }
}
