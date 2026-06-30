package sm3;

/* loaded from: classes10.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp4.a f491416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm3.o f491417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f491418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sm3.n f491419g;

    public k(kp4.a aVar, sm3.o oVar, int i17, sm3.n nVar) {
        this.f491416d = aVar;
        this.f491417e = oVar;
        this.f491418f = i17;
        this.f491419g = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clicked ");
        kp4.a aVar = this.f491416d;
        sb6.append(aVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvTracksAdapter", sb6.toString());
        sm3.o oVar = this.f491417e;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0 = ((sm3.q) oVar.f491429d).f491436a;
        java.util.List<kp4.a> mo67409x317d5b7e = c16708x2eab1ea0.mo67409x317d5b7e();
        int i17 = this.f491418f;
        long d17 = mo67409x317d5b7e.get(i17).d();
        if (d17 < 2000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MvTracksEditView", "video's duration is too short: index=" + i17 + ", duration=" + d17);
        } else {
            kp4.a aVar2 = c16708x2eab1ea0.mo67409x317d5b7e().get(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvTracksEditView", "startSelecting: " + i17 + ", start=" + aVar2.f392607d + ", end=" + aVar2.f392608e);
            int selectedIndex = c16708x2eab1ea0.getSelectedIndex();
            sm3.o oVar2 = c16708x2eab1ea0.f233547g;
            if (selectedIndex != -1) {
                int selectedIndex2 = c16708x2eab1ea0.getSelectedIndex();
                oVar2.getClass();
                oVar2.m8147xed6e4d18(selectedIndex2 + 1);
            }
            c16708x2eab1ea0.m67414xa5ced1b5(i17);
            oVar2.getClass();
            oVar2.m8147xed6e4d18(i17 + 1);
            c16708x2eab1ea0.f233560w.f491365q = false;
            c16708x2eab1ea0.f233545e.setVisibility(4);
            c16708x2eab1ea0.f233544d.D0();
            sm3.u uVar = c16708x2eab1ea0.callback;
            if (uVar != null) {
                long j17 = aVar2.f392607d;
                long j18 = aVar2.f392608e;
                mm3.h hVar = (mm3.h) uVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onSelectStarted: " + i17 + ", startTime=" + j17 + ", endTime=" + j18);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                mm3.n nVar = hVar.f411173h;
                nVar.f411196q.put(valueOf, new android.util.Range(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)));
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea02 = nVar.f411186d;
                if (c16708x2eab1ea02 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tracksEditView");
                    throw null;
                }
                long j19 = c16708x2eab1ea02.mo67409x317d5b7e().get(i17).f392613j;
                pk4.c cVar = hVar.f411172g.f232719n;
                if (cVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar).e(j19, (j18 - j17) + j19);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l a17 = kl3.t.g().a();
                java.util.LinkedList linkedList = nVar.f411190h;
                if (linkedList == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trackList");
                    throw null;
                }
                a17.c((int) ((r45.jf2) linkedList.get(i17)).m75942xfb822ef2(0));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "enterSelectMode");
                android.view.ViewGroup viewGroup = nVar.f411187e;
                if (viewGroup == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectButtonsContainer");
                    throw null;
                }
                viewGroup.setVisibility(0);
                android.widget.Button button = nVar.f411188f;
                if (button == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("completeButton");
                    throw null;
                }
                button.setVisibility(8);
            }
        }
        oVar.f491431f = new sm3.j(this.f491419g, aVar, oVar);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
