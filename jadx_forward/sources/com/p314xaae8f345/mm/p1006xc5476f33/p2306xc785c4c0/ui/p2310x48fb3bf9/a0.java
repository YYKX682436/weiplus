package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes8.dex */
public class a0 implements tg0.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l f256711a;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar) {
        this.f256711a = lVar;
    }

    @Override // tg0.h1
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission, dismiss");
        this.f256711a.q("notifyHaoKanPermission", false, true);
        aw4.n0.a(2L, 1L, 2L);
    }

    @Override // tg0.h1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission onPosition");
        this.f256711a.q("notifyHaoKanPermission", true, true);
        aw4.n0.a(1L, 1L, 2L);
    }
}
