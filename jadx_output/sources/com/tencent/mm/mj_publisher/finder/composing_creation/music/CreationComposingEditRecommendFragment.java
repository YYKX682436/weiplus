package com.tencent.mm.mj_publisher.finder.composing_creation.music;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/composing_creation/music/CreationComposingEditRecommendFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerEditRecommendFragment;", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreationComposingEditRecommendFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerEditRecommendFragment {

    /* renamed from: y, reason: collision with root package name */
    public final yz5.a f69169y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreationComposingEditRecommendFragment(ev3.d dVar, boolean z17, yz5.a getLocalMusicMjMusicIds) {
        super(dVar, z17, false);
        kotlin.jvm.internal.o.g(getLocalMusicMjMusicIds, "getLocalMusicMjMusicIds");
        this.f69169y = getLocalMusicMjMusicIds;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerEditRecommendFragment
    public void U0(java.util.LinkedList audioList, boolean z17, boolean z18, long j17) {
        java.util.LinkedList linkedList;
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(audioList, "audioList");
        java.util.Set set = (java.util.Set) this.f69169y.invoke();
        if (set.isEmpty() || audioList.isEmpty()) {
            linkedList = audioList;
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = audioList.iterator();
            while (it.hasNext()) {
                r45.vv0 vv0Var = (r45.vv0) it.next();
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    java.lang.String str = com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.M.a(vv0Var, 1, this.f156395n).C;
                    if (str == null) {
                        str = "";
                    }
                    m521constructorimpl = kotlin.Result.m521constructorimpl(str);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    m521constructorimpl = "";
                }
                java.lang.String str2 = (java.lang.String) m521constructorimpl;
                if ((str2.length() == 0) || !set.contains(str2)) {
                    linkedList2.add(vv0Var);
                }
            }
            if (linkedList2.size() != audioList.size()) {
                com.tencent.mars.xlog.Log.i("FinderMusicPickerEditRecommendFragment", "filterDuplicateMusic: before=" + audioList.size() + ", after=" + linkedList2.size());
            }
            linkedList = linkedList2;
        }
        super.U0(linkedList, z17, z18, j17);
    }
}
