package cw2;

/* loaded from: classes10.dex */
public final class ga implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f305267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 f305268b;

    public ga(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190) {
        this.f305267a = j17;
        this.f305268b = c15201xe049f190;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryToNotifyLiveEnd liveStatus:");
        sb6.append(i17);
        sb6.append(", local liveId:");
        long j18 = this.f305267a;
        sb6.append(j18);
        sb6.append(" resp live id ");
        sb6.append(j17);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AbsTXLivePlayListener", sb6.toString());
        if (j18 == j17 && i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190 = this.f305268b;
            mn0.b0 player = c15201xe049f190.getPlayer();
            if (player != null) {
                mn0.b0.C(player, true, false, false, 6, null);
            }
            c15201xe049f190.Y();
        }
    }
}
