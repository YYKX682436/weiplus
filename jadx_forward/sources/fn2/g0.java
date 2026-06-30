package fn2;

/* loaded from: classes9.dex */
public final class g0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.m0 f345794d;

    public g0(fn2.m0 m0Var) {
        this.f345794d = m0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.ox1 ox1Var = (r45.ox1) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Play list count to_sing ");
        sb6.append(ox1Var != null ? new java.lang.Integer(ox1Var.f464127d) : null);
        sb6.append(" has_sung ");
        sb6.append(ox1Var != null ? new java.lang.Integer(ox1Var.f464128e) : null);
        sb6.append(" self_to_sing ");
        sb6.append(ox1Var != null ? new java.lang.Integer(ox1Var.f464129f) : null);
        sb6.append(" self_sung ");
        sb6.append(ox1Var != null ? new java.lang.Integer(ox1Var.f464130g) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongTabRequested", sb6.toString());
        int i17 = ox1Var != null ? ox1Var.f464127d : 0;
        fn2.m0 m0Var = this.f345794d;
        fn2.m0.b(m0Var, 0, i17);
        fn2.m0.b(m0Var, 1, ox1Var != null ? ox1Var.f464128e : 0);
        fn2.m0.b(m0Var, 2, (ox1Var != null ? ox1Var.f464129f : 0) + (ox1Var != null ? ox1Var.f464130g : 0));
        return jz5.f0.f384359a;
    }
}
