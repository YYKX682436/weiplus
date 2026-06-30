package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class r4 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27357x62b32574.ReadDynamicMenuConfigCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f268341a;

    public r4(yz5.l lVar) {
        this.f268341a = lVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27357x62b32574.ReadDynamicMenuConfigCallback
    /* renamed from: complete */
    public final void mo74782xdc453139(com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27359xf892a56f.ReadDynamicMenuConfigResp readDynamicMenuConfigResp) {
        yz5.l lVar = this.f268341a;
        java.util.List<com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27359xf892a56f.DynamicMenuConfig> mo113641xdbe93079 = readDynamicMenuConfigResp.mo113641xdbe93079();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo113641xdbe93079, "getConfigsList(...)");
        lVar.mo146xb9724478(mo113641xdbe93079);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t4 t4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t4.f268417a;
        java.util.List<com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27359xf892a56f.DynamicMenuConfig> mo113641xdbe930792 = readDynamicMenuConfigResp.mo113641xdbe93079();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo113641xdbe930792, "getConfigsList(...)");
        synchronized (t4Var) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t4.f268421e = new java.lang.ref.WeakReference(mo113641xdbe930792);
        }
    }
}
