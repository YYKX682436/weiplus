package hj5;

/* loaded from: classes.dex */
public final class e extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f363201d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f363202e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f363201d = jz5.h.b(new hj5.d(this));
        this.f363202e = jz5.h.b(new hj5.c(this));
    }

    public final void T6(wi5.n0 state) {
        java.lang.StringBuilder sb6;
        int size;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateMenu: ");
        java.util.LinkedList linkedList = state.f527852o;
        sb7.append(linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectLabelTopMenuUIC", sb7.toString());
        int size2 = linkedList.size();
        com.p314xaae8f345.mm.ui.fb fbVar = com.p314xaae8f345.mm.ui.fb.GREEN;
        if (size2 > 0) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571992vn));
            if (state.f527849i > 0) {
                sb6 = new java.lang.StringBuilder("(");
                sb6.append(linkedList.size());
                sb6.append('/');
                size = state.f527849i;
            } else {
                sb6 = new java.lang.StringBuilder("(");
                size = linkedList.size();
            }
            sb6.append(size);
            sb6.append(')');
            sb8.append(sb6.toString());
            abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(1, sb8.toString());
            abstractActivityC21394xb3d2c0cf.m78615xdf8a9a94(1, fbVar);
        } else {
            abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(1, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571992vn));
            abstractActivityC21394xb3d2c0cf.m78615xdf8a9a94(1, fbVar);
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
        m67437x4bd5310.L2(m158354x19263085(), new hj5.b(this));
    }
}
