package dp2;

/* loaded from: classes2.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f323722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f323723b;

    public c(long j17, java.lang.String str) {
        this.f323722a = j17;
        this.f323723b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        dp2.e.f323726b = false;
        int i17 = fVar.f152148a;
        long j17 = this.f323722a;
        if ((i17 == 0 && fVar.f152149b == 0) || hc2.p.b(i17, fVar.f152149b)) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            if (c19792x256d2725 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEnterTargetLiveRoomChecker", "fetchTargetLiveRoomObject fetch time:" + (java.lang.System.currentTimeMillis() - dp2.e.f323728d));
                dp2.e.f323727c.put(dp2.e.f323725a.f(j17, this.f323723b), c19792x256d2725);
            }
            dp2.e eVar = dp2.e.f323725a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            if (c19792x256d27252 != null) {
                j17 = c19792x256d27252.m76784x5db1b11();
            }
            dp2.e.b(eVar, j17, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2));
        } else {
            dp2.e.b(dp2.e.f323725a, j17, null);
        }
        return jz5.f0.f384359a;
    }
}
