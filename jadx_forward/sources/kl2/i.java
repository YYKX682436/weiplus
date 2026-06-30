package kl2;

/* loaded from: classes.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.n f390316d;

    public i(kl2.n nVar) {
        this.f390316d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p3325xe03a0797.p3326xc267989b.y0 b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kl2.n nVar = this.f390316d;
        nVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - nVar.f390334u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RestrictConsumeDialogWidget", "rightBtnClick offestTime: " + currentTimeMillis);
        kl2.l lVar = new kl2.l(nVar);
        long j17 = (long) nVar.f390332s;
        if (currentTimeMillis >= j17) {
            lVar.mo152xb9724478();
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(nVar.f199914d, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, 0, null);
            f17.show();
            long j18 = j17 - currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RestrictConsumeDialogWidget", "delay time: " + j18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var == null || (b17 = k0Var.m57691xa0fa63f9()) == null) {
                b17 = p3325xe03a0797.p3326xc267989b.z0.b();
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new kl2.j(j18, lVar, f17, null), 2, null);
        }
        nVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
