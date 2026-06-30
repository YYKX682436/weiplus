package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

/* loaded from: classes7.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t f161942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161943e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar, int i17) {
        this.f161942d = tVar;
        this.f161943e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar = this.f161942d;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y C0 = tVar.f161989d.C0();
        if (C0 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatToolService", "dispatch onChatToolStatusChange currentChatToolMode:" + tVar.f161993h + " sendToUserName:" + tVar.f161991f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.v.f162006i.a(C0, tVar.f161993h, java.lang.Integer.valueOf(this.f161943e), tVar.f161991f);
        }
    }
}
