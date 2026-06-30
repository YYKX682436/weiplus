package kp1;

/* loaded from: classes11.dex */
public final class j0 implements qk.v8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 f392446a;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3) {
        this.f392446a = c12881xbe3683d3;
    }

    public void a(bw5.ac0 ac0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSyncResult headerOpen: false, isBackground: ");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3 = this.f392446a;
        c12881xbe3683d3.getClass();
        sb6.append(c12881xbe3683d3.f174545v);
        sb6.append(", syncItem: ");
        sb6.append(ac0Var != null ? ac0Var.b() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendV2", sb6.toString());
        c12881xbe3683d3.f174547x = ac0Var != null ? ac0Var.b() : null;
        ef0.m3 m3Var = (ef0.m3) ((qk.w8) i95.n0.c(qk.w8.class));
        java.lang.String str = m3Var.f333809f;
        if (str == null) {
            str = gm4.a.f355090a.e("ting_listen_sync_session_buffer", null);
            m3Var.f333809f = str;
        }
        c12881xbe3683d3.f174548y = str;
        pm0.v.X(new kp1.m0(c12881xbe3683d3));
    }
}
