package xu2;

/* loaded from: classes3.dex */
public final class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f538763p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f538764q;

    /* renamed from: r, reason: collision with root package name */
    public xu2.v f538765r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f538766s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f538767t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f538768u;

    /* renamed from: v, reason: collision with root package name */
    public android.os.CountDownTimer f538769v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f538770w;

    /* renamed from: x, reason: collision with root package name */
    public android.os.CountDownTimer f538771x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f538763p = statusMonitor;
        this.f538764q = "Finder.FinderLiveAdPlugin";
    }

    @Override // qo0.a
    public boolean B0() {
        ((mm2.c1) P0(mm2.c1.class)).N5 = 3;
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0127  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xu2.u.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        t1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        java.lang.String str;
        if (w1()) {
            r45.se2 se2Var = new r45.se2();
            se2Var.set(0, java.lang.Integer.valueOf(((mm2.c1) S0().a(mm2.c1.class)).K5));
            xu2.v vVar = this.f538765r;
            if (vVar != null) {
                str = vVar.f538782k.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
            } else {
                str = "";
            }
            se2Var.set(1, str);
            se2Var.set(2, java.lang.Integer.valueOf(((mm2.c1) P0(mm2.c1.class)).N5));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f538764q, "doCallback " + se2Var.m75939xb282bd08(0) + ", " + se2Var.m75945x2fec8307(1) + ", closeType: " + se2Var.m75939xb282bd08(2));
            vd2.g5 g5Var = xu2.w.f538783a;
            if (g5Var != null) {
                g5Var.a(se2Var);
            }
            xu2.w.f538783a = null;
            mm2.c1 c1Var = (mm2.c1) P0(mm2.c1.class);
            c1Var.I5 = null;
            c1Var.K5 = 0;
            c1Var.M5 = false;
            c1Var.L5 = false;
            c1Var.N5 = 0;
        }
    }

    public final int u1() {
        return java.lang.Math.max(V0().f390662d.Z - ((mm2.c1) S0().a(mm2.c1.class)).O5, 0);
    }

    public final int v1() {
        return java.lang.Math.max(((mm2.c1) S0().a(mm2.c1.class)).J5 - ((mm2.c1) S0().a(mm2.c1.class)).K5, 0);
    }

    public final boolean w1() {
        if (((mm2.c1) S0().a(mm2.c1.class)).I5 == null) {
            android.content.Context context = this.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (!((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                return false;
            }
        }
        return true;
    }

    public final void x1(yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.os.CountDownTimer countDownTimer = this.f538769v;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        android.view.ViewGroup viewGroup = this.f446856d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(viewGroup.getContext());
        u1Var.g(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2s));
        u1Var.n(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2r));
        u1Var.l(new xu2.p(callback));
        u1Var.j(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2q));
        u1Var.i(new xu2.q(this));
        u1Var.q(false);
    }

    public final void y1() {
        int v17 = v1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f538764q, "startCountDown rewardTime:" + ((mm2.c1) S0().a(mm2.c1.class)).J5 + ", getRemainSec:" + v17 + ", countTimeSec:" + ((mm2.c1) S0().a(mm2.c1.class)).K5);
        if (v17 <= 0) {
            return;
        }
        xu2.r rVar = new xu2.r(this, v17 * 1000);
        this.f538769v = rVar;
        rVar.start();
    }

    public final void z1() {
        android.os.CountDownTimer countDownTimer = this.f538771x;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ((mm2.c1) S0().a(mm2.c1.class)).O5 = V0().f390662d.Z;
    }
}
