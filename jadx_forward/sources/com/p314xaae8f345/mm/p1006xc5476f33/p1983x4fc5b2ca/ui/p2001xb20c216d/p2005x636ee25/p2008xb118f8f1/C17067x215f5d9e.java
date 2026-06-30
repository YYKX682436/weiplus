package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0014\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u000f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/drawer/TemplateClipMusicPickerComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout;", "", "getPageTypeArray", "", "getDefaultSelectPageTabType", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerTemplateClipRecommendFragment;", "getDefaultTabFragmentInstance", "", "Lcom/tencent/maas/model/MJMusicInfo;", "musicList", "Ljz5/f0;", "setLocalMJMusicInfoList", "Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;", "audioList", "setLocalAudioList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout */
/* loaded from: classes5.dex */
public class C17067x215f5d9e extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17067x215f5d9e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, false, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14
    /* renamed from: getDefaultSelectPageTabType */
    public int mo46997x9d8ed979() {
        return 5;
    }

    /* renamed from: getDefaultTabFragmentInstance */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17088xd9d6732f m68368xeb7470af() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17088xd9d6732f) e(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17088xd9d6732f.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14
    /* renamed from: getPageTypeArray */
    public int[] mo47000xdebf51ba() {
        return new int[]{5};
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14, fv3.c
    public void j(fv3.d status, android.os.Bundle bundle) {
        zy0.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.j(status, bundle);
        if (status != com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i0.f237789s || bundle == null) {
            return;
        }
        java.lang.String string = bundle.getString("key_string_1", "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f d17 = d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m1 m1Var = d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m1) d17 : null;
        if (m1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar = m1Var.f237755o;
            ev3.a aVar2 = aVar instanceof ev3.a ? (ev3.a) aVar : null;
            if (aVar2 == null || (fVar = ((zy0.c) aVar2).f558843a.f558848d) == null) {
                return;
            }
            mz0.b2 b2Var = ((mz0.n0) fVar).f414538a;
            b2Var.G7(b2Var.o7().a(), string);
            android.app.Activity context = b2Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).f151322m.f326589g = "";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f k() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m1(this, this, mo46997x9d8ed979());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.a o() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_music_search_use_finder_cgi, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XConfigUtil", "isMusicSearchUseFinderCgi:" + fj6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1 bVar = fj6 ? new uv3.b(this, this, null, true, 4, null) : new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.p1(this, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f d17 = d();
        bVar.A = d17 != null ? d17.w() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f d18 = d();
        bVar.B = d18 != null ? d18.f237756p : null;
        return bVar;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a r(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a.M.b(it, 1);
        b17.f237252p = 3;
        b17.f237255s = true;
        return b17;
    }

    /* renamed from: setLocalAudioList */
    public final void m68369x60eb836b(java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a> audioList) {
        rv3.h L0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioList, "audioList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17088xd9d6732f m68368xeb7470af = m68368xeb7470af();
        if (m68368xeb7470af != null) {
            java.lang.String str = "setLocalAudioList: size=" + audioList.size();
            java.lang.String str2 = m68368xeb7470af.f237939o;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
            dv3.c cVar = m68368xeb7470af.f237914e;
            if (cVar != null) {
                cVar.T0(audioList);
            }
            dv3.c cVar2 = m68368xeb7470af.f237914e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = (cVar2 == null || (L0 = cVar2.L0()) == null) ? null : L0.f481928d;
            if (c16997xb0aa383a != null) {
                java.lang.String a17 = c16997xb0aa383a.a();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryPlayCurrentFirstAudio: now ");
                sb6.append(a17);
                sb6.append(' ');
                sb6.append(c16997xb0aa383a.f237256t);
                sb6.append(", old ");
                dv3.c cVar3 = m68368xeb7470af.f237914e;
                sb6.append(cVar3 != null ? cVar3.f325529J : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                c16997xb0aa383a.f237242J = true;
                dv3.c cVar4 = m68368xeb7470af.f237914e;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, cVar4 != null ? cVar4.f325529J : null)) {
                    dv3.c cVar5 = m68368xeb7470af.f237914e;
                    if (cVar5 != null) {
                        cVar5.I0();
                    }
                } else {
                    dv3.c cVar6 = m68368xeb7470af.f237914e;
                    if (cVar6 != null) {
                        cVar6.S0(c16997xb0aa383a.a());
                    }
                    ev3.d dVar = m68368xeb7470af.f237913d;
                    if (dVar != null) {
                        ev3.d.e(dVar, 5, c16997xb0aa383a, true, false, true, 8, null);
                    }
                    wv3.b.f531581a.d(c16997xb0aa383a, false);
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = m68368xeb7470af.f237915f;
                if (c22849x81a93d25 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerTemplateClipRecommendFragment", "tryPlayCurrentFirstAudio", "()V", "Undefined", "scrollToPosition", "(I)V");
                    c22849x81a93d25.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerTemplateClipRecommendFragment", "tryPlayCurrentFirstAudio", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
            }
        }
    }

    /* renamed from: setLocalMJMusicInfoList */
    public final void m68370xd81035cb(java.util.List<? extends com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356> musicList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicList, "musicList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(musicList, 10));
        java.util.Iterator<T> it = musicList.iterator();
        while (it.hasNext()) {
            arrayList.add(r((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) it.next()));
        }
        m68369x60eb836b(arrayList);
    }
}
