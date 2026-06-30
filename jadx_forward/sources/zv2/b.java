package zv2;

/* loaded from: classes10.dex */
public abstract class b implements zv2.r0, ya2.r1, ya2.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f557928d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 f557929e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f557930f;

    /* renamed from: g, reason: collision with root package name */
    public zv2.q0 f557931g;

    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 jumpView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        this.f557928d = activity;
        this.f557929e = jumpView;
        e();
        f();
    }

    @Override // zv2.r0
    public void a() {
    }

    public boolean c() {
        return true;
    }

    public void d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        this.f557929e.setVisibility(0);
        f();
        k();
    }

    public void e() {
    }

    public void f() {
        int dimensionPixelSize = this.f557928d.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c15305x8b2e5786 = this.f557929e;
        c15305x8b2e5786.setMinimumHeight(dimensionPixelSize);
        c15305x8b2e5786.setOnClickListener(new zv2.a(this));
    }

    public void g() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f557930f;
        if (c19786x6a1e2862 != null) {
            xc2.y2.i(xc2.y2.f534876a, this.f557928d, new xc2.p0(c19786x6a1e2862), 0, null, 12, null);
        }
    }

    public void h() {
        zv2.r0.b(this, null, 1, null);
    }

    public void i(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15281x1c66dc31 c15281x1c66dc31;
        this.f557930f = c19786x6a1e2862;
        boolean z17 = c19786x6a1e2862 != null && c();
        if (!z17 || c19786x6a1e2862 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c15305x8b2e5786 = this.f557929e;
            c15305x8b2e5786.setVisibility(8);
            c15305x8b2e5786.defaultTitle = "";
            c15305x8b2e5786.defaultIconId = 0;
            c15305x8b2e5786.filledIconId = 0;
            c15305x8b2e5786.filledTextColor = true;
            c15305x8b2e5786.defaultIconColor = c15305x8b2e5786.f212705d;
            c15305x8b2e5786.filledIconColor = c15305x8b2e5786.f212706e;
            c15305x8b2e5786.iconUrl = null;
            c15305x8b2e5786.b();
            c15305x8b2e5786.a(null);
        } else {
            d(c19786x6a1e2862);
        }
        zv2.q0 q0Var = this.f557931g;
        if (q0Var != null) {
            sr2.q1 q1Var = (sr2.q1) q0Var;
            if (z17) {
                q1Var.f493214f = this;
            } else {
                q1Var.f493214f = null;
                if (q1Var.f493212d) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = q1Var.m158354x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.class)).Q7(new android.content.Intent(), getClass().getName());
                }
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = q1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            sr2.o1 o1Var = (sr2.o1) pf5.z.f435481a.a(activity2).a(sr2.o1.class);
            if (z17) {
                aw2.n nVar = o1Var.f493187e;
                c15281x1c66dc31 = nVar != null ? nVar.f96316n : null;
                if (c15281x1c66dc31 != null) {
                    c15281x1c66dc31.setVisibility(8);
                }
                o1Var.W6();
                return;
            }
            aw2.n nVar2 = o1Var.f493187e;
            c15281x1c66dc31 = nVar2 != null ? nVar2.f96316n : null;
            if (c15281x1c66dc31 == null) {
                return;
            }
            c15281x1c66dc31.setVisibility(0);
        }
    }

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }

    @Override // ya2.q1
    public void n0(ya2.b2 contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
        i(this.f557930f);
    }
}
