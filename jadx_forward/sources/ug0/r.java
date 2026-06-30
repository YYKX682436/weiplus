package ug0;

/* loaded from: classes8.dex */
public final class r implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ug0.s f509009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f509010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509011c;

    public r(ug0.s sVar, int i17, java.lang.String str) {
        this.f509009a = sVar;
        this.f509010b = i17;
        this.f509011c = str;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearchLiteAppFSC", "startWebSearchLiteApp, callback failed", null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchLiteAppFSC", "startWebSearchLiteApp, callback successfully", null);
        final ug0.s sVar = this.f509009a;
        j75.f Ai = sVar.f381800d.Ai();
        final int i18 = this.f509010b;
        if (Ai != null) {
            Ai.B3(new tg0.n2(p012xc85e97e9.p093xedfae76a.m.ON_CREATE, i18));
        }
        final java.lang.String appId = this.f509011c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "$appId");
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = sVar.f509012f;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        sVar.f509012f = null;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3> abstractC20980x9b9ad01d2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.feature.websearch.fsc.WebSearchLiteAppFSC$startLiteAppCloseListener$1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 event = c5675xda3892c3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ri riVar = event.f136001g;
                if (riVar.f89350a != 3) {
                    return false;
                }
                ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).pj(d85.f0.f308701s);
                java.lang.String str = riVar.f89352c;
                java.lang.String str2 = appId;
                if (str2.equals(str)) {
                    j75.f Ai2 = sVar.f381800d.Ai();
                    if (Ai2 != null) {
                        Ai2.B3(new tg0.n2(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY, i18));
                    }
                    java.lang.String concat = "liteAppCloseListener, LiteApp closed, stop listening, appId: ".concat(str2);
                    int i19 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchLiteAppFSC", concat, null);
                    mo48814x2efc64();
                    return false;
                }
                java.lang.String str3 = "liteAppCloseListener, appId not matched, started: " + str2 + ", closing: " + riVar.f89352c;
                int i27 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearchLiteAppFSC", str3, null);
                return false;
            }
        };
        sVar.f509012f = abstractC20980x9b9ad01d2;
        abstractC20980x9b9ad01d2.mo48813x58998cd();
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).oj(d85.f0.f308701s);
    }
}
