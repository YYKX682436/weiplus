package we3;

/* loaded from: classes11.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ we3.k f526810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve3.o f526811b;

    public j(we3.k kVar, ve3.o oVar) {
        this.f526810a = kVar;
        this.f526811b = oVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.nw1 m76794xd0557130;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        we3.k kVar = this.f526810a;
        kVar.f526818g = false;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
        int i17 = fVar.f152148a;
        int i18 = kVar.f526813b;
        ve3.o oVar = this.f526811b;
        if (i17 != 0 || fVar.f152149b != 0 || c19792x256d2725 == null || c19792x256d2725.m76794xd0557130() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBFinderLivePlayerItem", "GetFinderFeedComment failed, playId: " + i18);
            ((xd3.c) oVar).b(-1, "getCommentSceneFinderLivePage cgi failed, playId: " + i18);
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            if (c19792x256d27252 == null || (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) == null) {
                ((xd3.c) oVar).b(-1, "not feedObject, no liveInfo");
            } else if (m76794xd0557130.m75933x41a8a7f2(77)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBFinderLivePlayerItem", "disable auto play, playId: " + i18);
                ((xd3.c) oVar).b(2, "disable AutoPlay");
            } else if (kVar.f526817f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBFinderLivePlayerItem", "startPlay, playId: " + i18);
                mn0.b0.L(kVar.f526816e, m76794xd0557130, null, 2, null);
                ve3.o.a(oVar, null, 1, null);
            } else {
                ((xd3.c) oVar).b(-1, "not playing when requesting back");
            }
        }
        return jz5.f0.f384359a;
    }
}
