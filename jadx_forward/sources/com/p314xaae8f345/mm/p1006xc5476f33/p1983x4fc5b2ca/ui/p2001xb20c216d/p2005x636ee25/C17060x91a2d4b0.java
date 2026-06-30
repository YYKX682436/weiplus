package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/NewLifeMusicPickerComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout;", "", "getPageTypeArray", "", "getDefaultSelectPageTabType", "Lyu3/b;", "setupInfo", "Ljz5/f0;", "setupConfig", "", "Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;", "audioList", "setLocalAudioList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.music.NewLifeMusicPickerComponentLayout */
/* loaded from: classes5.dex */
public final class C17060x91a2d4b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17060x91a2d4b0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, false, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14
    /* renamed from: getDefaultSelectPageTabType */
    public int mo46997x9d8ed979() {
        return 11;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14
    /* renamed from: getPageTypeArray */
    public int[] mo47000xdebf51ba() {
        return new int[]{11, 2};
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.a o() {
        kv3.h hVar = new kv3.h(this, this, false, r45.yv0.kFinderBgmListTypeNewLifeSearch, false, null, false, 116, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f d17 = d();
        hVar.A = d17 != null ? d17.w() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f d18 = d();
        hVar.B = d18 != null ? d18.f237756p : null;
        return hVar;
    }

    /* renamed from: setLocalAudioList */
    public final void m68334x60eb836b(java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a> audioList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioList, "audioList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0) b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0.class);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 o17 = h0Var != null ? h0Var.o(mo46997x9d8ed979()) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3 c17084x670031c3 = o17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3) o17 : null;
        if (c17084x670031c3 != null) {
            c17084x670031c3.P0(audioList);
        }
    }

    /* renamed from: setupConfig */
    public final void m68335x8a00181f(yu3.b setupInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setupInfo, "setupInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoRegisterComponentLayout", "setupConfig: ");
        st3.k kVar = setupInfo.f547396c;
        if (setupInfo.f547395b) {
            kVar.f494082d = false;
        }
        m68333xa05e42e(kVar.f494080b);
        p(kVar.f494082d, kVar.f494081c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0) b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0.class);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 o17 = h0Var != null ? h0Var.o(mo46997x9d8ed979()) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3 c17084x670031c3 = o17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3) o17 : null;
        if (c17084x670031c3 != null) {
            c17084x670031c3.R0(setupInfo.f547394a);
        }
    }
}
