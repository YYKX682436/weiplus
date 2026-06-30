package yf2;

/* loaded from: classes3.dex */
public final class u implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f543323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f543324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf2.z f543325f;

    public u(mm2.n0 n0Var, java.lang.String str, yf2.z zVar) {
        this.f543323d = n0Var;
        this.f543324e = str;
        this.f543325f = zVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.f50 f50Var = (r45.f50) obj;
        boolean Q6 = this.f543323d.Q6(this.f543324e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeCoLiveInviteeState: invitee=");
        sb6.append(Q6);
        sb6.append(", invitationId=");
        sb6.append(f50Var != null ? new java.lang.Long(f50Var.f455546d) : null);
        sb6.append(", status=");
        sb6.append(f50Var != null ? new java.lang.Integer(f50Var.f455547e) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLivePostButtonController", sb6.toString());
        this.f543325f.Z6(Q6);
        return jz5.f0.f384359a;
    }
}
