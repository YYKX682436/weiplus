package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes4.dex */
public class d0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public long f182094d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 f182095e;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800) {
        this.f182095e = abstractActivityC13548xbf543800;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "[onNotifyChange] event=%s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800 = this.f182095e;
        abstractActivityC13548xbf543800.f181809q.mo50300x3fa464aa(abstractActivityC13548xbf543800.N);
        long j17 = this.f182094d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 <= 200) {
            abstractActivityC13548xbf543800.f181809q.mo50297x7c4d7ca2(abstractActivityC13548xbf543800.N, 200L);
        } else {
            this.f182094d = android.os.SystemClock.elapsedRealtime();
            abstractActivityC13548xbf543800.f181809q.mo50293x3498a0(abstractActivityC13548xbf543800.N);
        }
    }
}
