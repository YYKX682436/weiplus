package sp2;

/* loaded from: classes2.dex */
public final class o0 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f492651a;

    public o0(so2.h1 h1Var) {
        this.f492651a = h1Var;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        r45.nw1 m59258xd0557130;
        so2.h1 h1Var = this.f492651a;
        r45.nw1 m59258xd05571302 = h1Var.getFeedObject().m59258xd0557130();
        if ((m59258xd05571302 != null ? m59258xd05571302.m75942xfb822ef2(0) : 0L) != j17 || !(obj instanceof r45.l71)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#refreshLiveStatus, local liveId:");
            r45.nw1 m59258xd05571303 = h1Var.getFeedObject().m59258xd0557130();
            sb6.append(m59258xd05571303 != null ? java.lang.Long.valueOf(m59258xd05571303.m75942xfb822ef2(0)) : null);
            sb6.append(" resp live id ");
            sb6.append(j17);
            sb6.append(",liveInfoResp:");
            sb6.append(obj);
            sb6.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", sb6.toString());
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("change liveStatus,cur feed:");
        sb7.append(h1Var.getFeedObject().m59273x80025a04());
        sb7.append(" status:");
        r45.nw1 m59258xd05571304 = h1Var.getFeedObject().m59258xd0557130();
        sb7.append(m59258xd05571304 != null ? java.lang.Integer.valueOf(m59258xd05571304.m75939xb282bd08(2)) : null);
        sb7.append(", liveStatus:");
        sb7.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", sb7.toString());
        if (i17 <= 0 || (m59258xd0557130 = h1Var.getFeedObject().m59258xd0557130()) == null) {
            return;
        }
        m59258xd0557130.set(2, java.lang.Integer.valueOf(i17));
    }
}
