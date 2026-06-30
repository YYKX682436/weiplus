package nl4;

/* loaded from: classes11.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nl4.d f419728a;

    public c(nl4.d dVar) {
        this.f419728a = dVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.nw1 m76794xd0557130;
        r45.nw1 m76794xd05571302;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
        java.lang.Integer valueOf = (c19792x256d2725 == null || (m76794xd05571302 = c19792x256d2725.m76794xd0557130()) == null) ? null : java.lang.Integer.valueOf(m76794xd05571302.m75939xb282bd08(2));
        boolean z17 = (valueOf != null && 2 == valueOf.intValue()) || (valueOf != null && 5 == valueOf.intValue());
        nl4.d dVar = this.f419728a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f419736h, "cgiGetFinderFeedComment end errType=" + fVar.f152148a + ", errCode=" + fVar.f152149b + ", liveStatus=" + valueOf + ", isLiveEnd=" + z17);
        if (fVar.f152148a != 0 || fVar.f152149b != 0 || c19792x256d2725 == null || c19792x256d2725.m76794xd0557130() == null || z17) {
            ll4.a aVar = dVar.f419729a;
            if (aVar != null) {
                ll4.a.a(aVar, 12, null, 2, null);
            }
        } else if (dVar.f419730b || dVar.f419731c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(dVar.f419736h, "hasCallStop do not call play " + dVar.f419730b + ", " + dVar.f419731c);
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            if (c19792x256d27252 != null && (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) != null) {
                mn0.b0.L(dVar.f419734f, m76794xd0557130, null, 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
