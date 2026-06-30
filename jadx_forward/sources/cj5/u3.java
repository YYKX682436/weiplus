package cj5;

/* loaded from: classes.dex */
public final class u3 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f123783d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f123784e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f123785f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123783d = jz5.h.b(new cj5.r3(this));
        this.f123784e = true;
        this.f123785f = new java.util.ArrayList();
    }

    public static final void U6(cj5.u3 u3Var, boolean z17, java.lang.String str) {
        if (z17) {
            u3Var.getClass();
            if (r26.n0.N(str)) {
                if (!(!u3Var.f123785f.isEmpty())) {
                    u3Var.V6().j().setVisibility(8);
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = u3Var.V6().k();
                    if (k17 == null) {
                        return;
                    }
                    k17.setImportantForAccessibility(0);
                    return;
                }
                u3Var.V6().j().setVisibility(0);
                u3Var.V6().a().r(null, u3Var.f123785f);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k18 = u3Var.V6().k();
                if (k18 == null) {
                    return;
                }
                k18.setImportantForAccessibility(4);
                return;
            }
        }
        u3Var.V6().j().setVisibility(8);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k19 = u3Var.V6().k();
        if (k19 == null) {
            return;
        }
        k19.setImportantForAccessibility(0);
    }

    public final em.l2 V6() {
        return (em.l2) ((jz5.n) this.f123783d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        j75.f Q6;
        wi5.n0 n0Var;
        super.mo2273x9d4787cb(i17, i18, intent);
        if (intent == null || i17 != 3) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        if ((stringExtra == null || r26.n0.N(stringExtra)) || (Q6 = Q6()) == null || (n0Var = (wi5.n0) Q6.mo140437x75286adb()) == null) {
            return;
        }
        if (n0Var.e()) {
            j75.f Q62 = Q6();
            if (Q62 != null) {
                Q62.B3(new wi5.j0(r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null), i17));
                return;
            }
            return;
        }
        j75.f Q63 = Q6();
        if (Q63 != null) {
            Q63.B3(new wi5.c0(r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null), i17));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new cj5.q3(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f123784e) {
            this.f123784e = false;
            pm0.v.K(null, new cj5.t3(this));
        }
    }
}
