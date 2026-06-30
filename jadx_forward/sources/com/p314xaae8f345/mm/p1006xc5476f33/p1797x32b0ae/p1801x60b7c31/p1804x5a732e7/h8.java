package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes8.dex */
public final class h8 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f225138d;

    public h8(yz5.l lVar) {
        this.f225138d = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        yz5.l lVar = this.f225138d;
        if (i18 == -1) {
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e8.f225101d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSendGifToConversation", "doShare, resultCode is not RESULT_OK: " + i18);
        lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e8.f225102e);
    }
}
