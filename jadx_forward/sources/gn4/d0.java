package gn4;

/* loaded from: classes15.dex */
public class d0 extends fn4.m implements gn4.a {

    /* renamed from: h, reason: collision with root package name */
    public gn4.z f355138h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f355139i;

    @Override // fn4.m
    public fn4.g i() {
        return this.f355138h;
    }

    @Override // fn4.m
    public android.view.View j() {
        return this.f355138h.mo129842x143e7d6c().m131888x98f24fae();
    }

    @Override // fn4.m
    public void n(android.view.View view) {
        this.f355139i = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.p0y);
    }

    @Override // fn4.m
    public void p() {
        if (this.f355138h == null) {
            fn4.b bVar = this.f346116d;
            if (bVar.p6()) {
                this.f355138h = new gn4.f1(bVar.B(), bVar, this);
            } else {
                this.f355138h = new gn4.z(bVar.B(), bVar, this);
            }
            this.f355139i.removeAllViews();
            this.f355139i.addView(this.f355138h, bVar.p6() ? new android.widget.FrameLayout.LayoutParams(bVar.y4().x, bVar.y4().y) : new android.widget.FrameLayout.LayoutParams(bVar.y4().y, bVar.y4().x));
        }
        this.f355138h.q(this.f346117e, m8183xf806b362());
    }

    @Override // fn4.m
    public void s(boolean z17) {
        r45.xn6 xn6Var = this.f346117e;
        fn4.b bVar = this.f346116d;
        bVar.a2(xn6Var);
        bVar.X1(m8183xf806b362());
        if (this.f355138h.n(z17, false)) {
            t();
            m();
        }
    }

    @Override // fn4.m, fn4.a
    public int u() {
        return m8183xf806b362();
    }
}
