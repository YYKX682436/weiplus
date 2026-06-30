package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p881x636ee25;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/composing_creation/music/CreationComposingEditRecommendFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerEditRecommendFragment;", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingEditRecommendFragment */
/* loaded from: classes5.dex */
public final class C10924x8f12fe92 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17068xcb12955 {

    /* renamed from: y, reason: collision with root package name */
    public final yz5.a f150702y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10924x8f12fe92(ev3.d dVar, boolean z17, yz5.a getLocalMusicMjMusicIds) {
        super(dVar, z17, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getLocalMusicMjMusicIds, "getLocalMusicMjMusicIds");
        this.f150702y = getLocalMusicMjMusicIds;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17068xcb12955
    public void U0(java.util.LinkedList audioList, boolean z17, boolean z18, long j17) {
        java.util.LinkedList linkedList;
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioList, "audioList");
        java.util.Set set = (java.util.Set) this.f150702y.mo152xb9724478();
        if (set.isEmpty() || audioList.isEmpty()) {
            linkedList = audioList;
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = audioList.iterator();
            while (it.hasNext()) {
                r45.vv0 vv0Var = (r45.vv0) it.next();
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a.M.a(vv0Var, 1, this.f237928n).C;
                    if (str == null) {
                        str = "";
                    }
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                    m143895xf1229813 = "";
                }
                java.lang.String str2 = (java.lang.String) m143895xf1229813;
                if ((str2.length() == 0) || !set.contains(str2)) {
                    linkedList2.add(vv0Var);
                }
            }
            if (linkedList2.size() != audioList.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicPickerEditRecommendFragment", "filterDuplicateMusic: before=" + audioList.size() + ", after=" + linkedList2.size());
            }
            linkedList = linkedList2;
        }
        super.U0(linkedList, z17, z18, j17);
    }
}
