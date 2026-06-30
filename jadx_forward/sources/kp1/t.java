package kp1;

/* loaded from: classes11.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c f392471d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c c12880x474fa32c) {
        this.f392471d = c12880x474fa32c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendMusicList$initRecentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c.f174528z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c c12880x474fa32c = this.f392471d;
        if (c12880x474fa32c.t()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6.l(c12880x474fa32c, false, true, 1, null);
            ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).f333729d = java.lang.Boolean.TRUE;
            gm4.a.f355090a.g("key_clicked_recommend", true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendMusicList$initRecentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
