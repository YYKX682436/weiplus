package kp1;

/* loaded from: classes11.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c f392463d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c c12880x474fa32c) {
        this.f392463d = c12880x474fa32c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendMusicList$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c.f174528z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c c12880x474fa32c = this.f392463d;
        if (c12880x474fa32c.t()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6.l(c12880x474fa32c, true, false, 2, null);
            bw5.o50 o50Var = c12880x474fa32c.f174534u;
            if (o50Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "jumpCategoryPage categoryItem is null");
            } else {
                bw5.qb0 qb0Var = c12880x474fa32c.f174535v;
                if (qb0Var != null && qb0Var.f113565d == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "jumpCategoryPage categoryId: " + o50Var.c() + ", type: " + o50Var.f112497n);
                    il4.e eVar = new il4.e(null, 0, 5, false, null, null, 0, 0, false, false, null, 5, null, null, null, null, false, false, null, null, false, null, false, null, false, 33552379, null);
                    eVar.f373649m = java.lang.Boolean.TRUE;
                    eVar.f373655s.f373663b = true;
                    qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
                    android.content.Context context = c12880x474fa32c.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    bw5.lp0 lp0Var = c12880x474fa32c.f174533t;
                    qk.f9.d(aj6, context, o50Var, lp0Var != null ? kz5.c0.d(lp0Var) : null, qk.ja.f445725e, bw5.ar0.TingScene_MediaControlCenter, eVar, new kp1.u(c12880x474fa32c), null, null, null, false, 1920, null);
                    ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ni(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.z.f34666x366c91de, o50Var);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "jumpCategoryPage not valid type");
                }
            }
            ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).f333729d = java.lang.Boolean.TRUE;
            gm4.a.f355090a.g("key_clicked_recommend", true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendMusicList$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
