package w03;

/* loaded from: classes8.dex */
public final class n extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f523422d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f523423e;

    /* renamed from: f, reason: collision with root package name */
    public vn2.q f523424f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        this.f523424f = new vn2.q(b17);
    }

    public final void O6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideo19943ReportUIC", "isCreate from " + this.f523423e + " to " + z17);
        this.f523423e = z17;
    }

    public final void P6(java.lang.String pageName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        vn2.q qVar = this.f523424f;
        if (qVar != null) {
            qVar.f519894g = pageName;
        }
        vn2.q qVar2 = this.f523424f;
        if (qVar2 == null) {
            return;
        }
        qVar2.f519895h = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        O6(true);
        vn2.q qVar = this.f523424f;
        if (qVar != null) {
            qVar.e();
        }
        vn2.q qVar2 = this.f523424f;
        if (qVar2 != null) {
            qVar2.b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f523424f = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        vn2.q qVar;
        super.mo2281xb01dfb57();
        vn2.q qVar2 = this.f523424f;
        if (qVar2 != null) {
            qVar2.c();
        }
        if (this.f523422d || (qVar = this.f523424f) == null) {
            return;
        }
        qVar.f();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        vn2.q qVar;
        if (!this.f523423e) {
            vn2.q qVar2 = this.f523424f;
            if (qVar2 != null) {
                qVar2.b();
            }
            if (!this.f523422d && (qVar = this.f523424f) != null) {
                qVar.e();
            }
        }
        O6(false);
        this.f523422d = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        vn2.q qVar = this.f523424f;
        if (qVar != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            qVar.d("onStart ".concat(activity.getClass().getName()));
            qVar.f519890c = activity;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        vn2.q qVar = this.f523424f;
        if (qVar != null) {
            qVar.a(m158354x19263085());
        }
    }
}
