package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class b0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256469d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar) {
        this.f256469d = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "redDotObserver invoke() called with: result = [" + aVar + "]");
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256469d;
            if (jVar.E) {
                if (pm4.w.n(jVar.h() != null ? jVar.h().f528851b : 0)) {
                    ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ri(jVar.F, "onUniformReddotDataChanged", cn4.a.f125210a.a(aVar.f186864e).mo126745xcc31ba03());
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar = jVar.f256526m;
            if (lVar != null) {
                lVar.w(aVar.f186864e);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "invoke:topStoryWebViewJSApi  topStoryWebViewJSApi is null");
            }
        }
        return f0Var;
    }
}
