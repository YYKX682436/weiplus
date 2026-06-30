package hu1;

/* loaded from: classes15.dex */
public class h extends hu1.a {
    @Override // hu1.a, hu1.g
    public boolean a() {
        return false;
    }

    @Override // hu1.a, hu1.g
    public boolean c() {
        return false;
    }

    @Override // hu1.a, hu1.g
    public boolean e() {
        return false;
    }

    @Override // hu1.a, hu1.g
    public boolean f() {
        return !this.f366604d && this.f366603c.s0().S == 1;
    }

    @Override // hu1.a, hu1.g
    public boolean g() {
        if (super.g() || f()) {
            return true;
        }
        return this.f366603c.i() && this.f366604d;
    }

    @Override // hu1.a, hu1.g
    public boolean i() {
        return false;
    }

    @Override // hu1.a, hu1.g
    public boolean k() {
        return false;
    }

    @Override // hu1.a, hu1.g
    public boolean n() {
        return this.f366602b.f176636a == 3;
    }

    @Override // hu1.a, hu1.g
    public boolean p() {
        return this.f366604d;
    }

    @Override // hu1.a, hu1.g
    public boolean q() {
        return this.f366604d && super.q();
    }

    @Override // hu1.a, hu1.g
    public boolean r() {
        java.util.ArrayList h17 = eu1.f.h(this.f366603c.f());
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 p0Var = this.f366602b;
        if ((!p0Var.f176642g || p0Var.f176636a == 4) && !android.text.TextUtils.isEmpty(this.f366603c.a())) {
            return true;
        }
        return (this.f366602b.f176642g && h17.size() > 0) || (!android.text.TextUtils.isEmpty(this.f366603c.a()) && n());
    }

    @Override // hu1.a
    public void x() {
        super.x();
    }
}
