package of2;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of2.m f426623d;

    public l(of2.m mVar) {
        this.f426623d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        of2.m mVar = this.f426623d;
        mVar.H().getTop();
        int[] iArr = new int[2];
        mVar.H().getLocationOnScreen(iArr);
        of2.a aVar = mVar.I;
        int i17 = iArr[1];
        nf2.g gVar = (nf2.g) aVar;
        int i18 = gVar.f418270a;
        float f17 = (i18 - i17) / i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsController", "onPanelShown: panelTopY=" + i17 + ", screenHeight=" + i18 + ", previewY=" + f17);
        nf2.d1 d1Var = gVar.f418271b.f418341m;
        if (d1Var != null && !d1Var.f418236x) {
            d1Var.f418236x = true;
            d1Var.A = f17;
            jz5.l lVar = d1Var.D;
            if (lVar == null) {
                lVar = new jz5.l(java.lang.Float.valueOf(d1Var.f418215c.f418257f), java.lang.Float.valueOf(d1Var.f418215c.f418258g));
            }
            d1Var.f418237y = lVar;
            d1Var.f418238z = nf2.f1.a(d1Var.f418215c, 0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, 0L, null, 262143, null);
            android.view.View view = d1Var.f418221i;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "enterPreviewMode", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "enterPreviewMode", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            d1Var.l(0.5f, d1Var.A);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "enterPreviewMode: savedPosition=" + d1Var.f418237y);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsStyleEditPanel", "show: panelTopY=" + iArr[1]);
    }
}
