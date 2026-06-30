package cj5;

/* loaded from: classes.dex */
public class d1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f123625d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f123626e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f123627f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f123628g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f123629h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f123630i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f123631m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ObjectAnimator f123632n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f123633o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123625d = jz5.h.b(new cj5.a1(this));
        this.f123626e = jz5.h.b(new cj5.r0(activity, this));
        this.f123627f = jz5.h.b(new cj5.q0(activity));
        this.f123628g = jz5.h.b(new cj5.y0(activity));
        this.f123629h = jz5.h.b(new cj5.z0(activity));
        this.f123630i = jz5.h.b(new cj5.x0(this));
        this.f123633o = jz5.h.b(new cj5.u0(this));
    }

    public final em.l2 T6() {
        return (em.l2) ((jz5.n) this.f123625d).mo141623x754a37bb();
    }

    public void U6(boolean z17) {
        T6().o().setVisibility(z17 ? 0 : 8);
        T6().o().post(new cj5.b1(this, z17));
        T6().n().setVisibility(8);
        if (z17) {
            T6().f().setOnClickListener(new cj5.c1(this));
        }
    }

    public final void V6(wi5.n0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.util.LinkedList linkedList = state.f527852o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (true ^ com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) next)) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactBottomMenuUIC", "updateMenu: " + size);
        jz5.g gVar = this.f123626e;
        if (size > 0) {
            T6().f().setText(((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb()) + '(' + size + ')');
        } else {
            T6().f().setText((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb());
        }
        android.widget.Button f17 = T6().f();
        jz5.g gVar2 = this.f123627f;
        if (((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue() == 1) {
            f17.setTextColor(f17.getContext().getResources().getColorStateList(com.p314xaae8f345.mm.R.C30861xcebc809e.cvh));
            f17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562600jw);
        } else if (((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue() == 0) {
            f17.setTextColor(f17.getContext().getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
            f17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562593jo);
        }
        T6().f().setEnabled(size > state.f527850m);
        T6().e().setVisibility((!((java.lang.Boolean) ((jz5.n) this.f123628g).mo141623x754a37bb()).booleanValue() || size <= 0) ? 8 : 0);
        T6().c().setVisibility(((java.lang.Boolean) ((jz5.n) this.f123629h).mo141623x754a37bb()).booleanValue() ? 0 : 8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        if (((java.lang.Boolean) ((jz5.n) this.f123629h).mo141623x754a37bb()).booleanValue()) {
            T6().c().m75367x3935f5b0((cj5.p0) ((jz5.n) this.f123630i).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new cj5.w0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        android.animation.ObjectAnimator objectAnimator = this.f123632n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f123631m;
        if (f5Var != null) {
            f5Var.d();
        }
        super.mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f123631m;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onWindowFocusChanged */
    public void mo14961xa4ec7b0b(boolean z17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var;
        super.mo14961xa4ec7b0b(z17);
        if (!z17 || (f5Var = this.f123631m) == null) {
            return;
        }
        f5Var.f();
    }
}
