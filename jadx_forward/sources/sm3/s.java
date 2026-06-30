package sm3;

/* loaded from: classes10.dex */
public final class s extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 f491438d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0) {
        this.f491438d = c16708x2eab1ea0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvTracksEditView", "onScrollStateChanged: newState=" + i17);
        if (i17 == 0) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0.F;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0 = this.f491438d;
            boolean z17 = true;
            if (!c16708x2eab1ea0.f233556s) {
                if (!(c16708x2eab1ea0.getDraggingIndex() != -1)) {
                    if (!(c16708x2eab1ea0.getSelectedIndex() != -1)) {
                        z17 = false;
                    }
                }
            }
            if (!z17) {
                c16708x2eab1ea0.m67416x4a2b286(c16708x2eab1ea0.B);
                c16708x2eab1ea0.getVideoProgress();
                sm3.u callback = c16708x2eab1ea0.getCallback();
                if (callback != null) {
                    long videoProgress = c16708x2eab1ea0.getVideoProgress();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onSeek: " + videoProgress);
                    ((mm3.h) callback).f411172g.T6(videoProgress);
                    kl3.t.g().a().c((int) videoProgress);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0.F;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0 = this.f491438d;
        c16708x2eab1ea0.a();
        c16708x2eab1ea0.f233558u.f491390m = c16708x2eab1ea0.B;
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
