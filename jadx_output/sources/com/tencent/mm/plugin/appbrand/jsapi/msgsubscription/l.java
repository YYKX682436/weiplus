package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class l implements fl1.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor f82346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m31.c0 f82347b;

    public l(com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor, m31.c0 c0Var) {
        this.f82346a = getSubscribeMsgListExecutor;
        this.f82347b = c0Var;
    }

    @Override // fl1.c2
    public void a(fl1.b2 b2Var) {
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.e eVar = this.f82346a.f82300i;
        if (eVar != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q) eVar).b(this.f82347b);
        }
    }
}
