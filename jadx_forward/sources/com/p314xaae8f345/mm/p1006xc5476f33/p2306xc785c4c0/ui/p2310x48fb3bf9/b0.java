package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes8.dex */
public class b0 implements tg0.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l f256712a;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar) {
        this.f256712a = lVar;
    }

    @Override // tg0.h1
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, dismiss.");
        this.f256712a.q("notifyHaoKanCommentPermission", false, true);
        aw4.n0.a(2L, 2L, 2L);
    }

    @Override // tg0.h1
    public void b() {
        this.f256712a.q("notifyHaoKanCommentPermission", true, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, onPosition.");
        aw4.n0.a(1L, 2L, 2L);
    }
}
