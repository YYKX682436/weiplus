package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts;

/* loaded from: classes15.dex */
public class k implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 f179553a;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 activityC13331xc936a5b5) {
        this.f179553a = activityC13331xc936a5b5;
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q5
    public void a(boolean z17, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 activityC13331xc936a5b5;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4;
        if (interfaceC4987x84e327cb == null || !z17 || (c21053xdbf1e5f4 = (activityC13331xc936a5b5 = this.f179553a).f179532q) == null || !c21053xdbf1e5f4.mo42933xb5885648().equals(interfaceC4987x84e327cb.mo42933xb5885648())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "somethings error.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "emojiServiceCallback onDownload %s", activityC13331xc936a5b5.f179532q.mo42933xb5885648());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.j(this));
        }
    }
}
