package gx0;

/* loaded from: classes5.dex */
public final class zf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f358822d;

    public zf(gx0.gg ggVar) {
        this.f358822d = ggVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/uic/SubtitleRecommendedUseUIC$subtitleTipView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx0.gg ggVar = this.f358822d;
        yy0.m7 m7Var = (yy0.m7) ggVar.R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.c5(m7Var, null), 3, null);
        ggVar.a7();
        gx0.w8 d76 = ggVar.d7();
        gx0.u2 u2Var = (gx0.u2) ((jz5.n) ggVar.f358011n).mo141623x754a37bb();
        sw0.f fVar = sw0.f.f494965g;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("KEY_PANEL_ARGS", new ow0.a(fVar, true));
        yt0.c.Q5(d76, u2Var, hashMap, false, zw0.b.f558084e, 4, null);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/SubtitleRecommendedUseUIC$subtitleTipView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
