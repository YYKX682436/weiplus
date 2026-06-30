package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerTemplateClipRecommendFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerDataFragment;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerTemplateClipRecommendFragment */
/* loaded from: classes5.dex */
public final class C17088xd9d6732f extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad {

    /* renamed from: n, reason: collision with root package name */
    public final ev3.d f237938n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f237939o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f237940p;

    public C17088xd9d6732f(ev3.d dVar) {
        super(dVar);
        this.f237938n = dVar;
        this.f237939o = "MicroMsg.MusicPickerSnsTemplateRecommendFragment";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.q(this);
        dv3.f fVar = new dv3.f(new in5.s() { // from class: com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerTemplateClipRecommendFragment$buildRVItemConverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new rv3.s(yz5.p.this);
            }
        }, arrayList);
        fVar.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.r(this, fVar);
        this.f237914e = fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    public int n0() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237939o, "onDestroy: ");
        p0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237939o, "onViewCreated: ");
        if (this.f237940p) {
            return;
        }
        x0();
    }
}
