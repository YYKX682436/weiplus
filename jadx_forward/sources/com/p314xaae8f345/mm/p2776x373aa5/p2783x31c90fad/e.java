package com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad;

/* loaded from: classes8.dex */
public class e implements ur.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d f295188a;

    public e(com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar) {
        this.f295188a = dVar;
    }

    public void a(java.lang.String str, final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f295188a.f295178u) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, this.f295188a.f295178u)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "user not match toUser:%s, talkName:$s", str, this.f295188a.f295178u);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.view.manager.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.e.this.f295188a;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var = dVar.C;
                if (v9Var != null) {
                    v9Var.b(interfaceC4987x84e327cb);
                }
                java.lang.Runnable runnable = dVar.M;
                if (runnable != null) {
                    runnable.run();
                    dVar.M = null;
                }
            }
        });
    }
}
