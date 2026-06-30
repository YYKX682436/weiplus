package cj5;

/* loaded from: classes.dex */
public final class q4 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f123754d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f123755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123754d = jz5.h.b(new cj5.p4(activity));
        this.f123755e = jz5.h.b(new cj5.m4(activity, this));
    }

    public final void T6(wi5.n0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMenu: ");
        java.util.LinkedList linkedList = state.f527852o;
        sb6.append(linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactTopMenuUIC", sb6.toString());
        int size = linkedList.size();
        jz5.g gVar = this.f123755e;
        if (size > 0) {
            abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(1, ((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb()) + '(' + linkedList.size() + ')');
        } else {
            abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(1, (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb());
        }
        if (linkedList.size() > state.f527850m) {
            abstractActivityC21394xb3d2c0cf.m78500x43e00957(1, true);
        } else {
            abstractActivityC21394xb3d2c0cf.m78500x43e00957(1, false);
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
        m67437x4bd5310.L2(m158354x19263085(), new cj5.o4(this));
    }
}
