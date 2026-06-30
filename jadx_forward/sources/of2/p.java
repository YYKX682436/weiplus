package of2;

/* loaded from: classes10.dex */
public final class p implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of2.n f426626d;

    public p(of2.n nVar) {
        this.f426626d = nVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        nf2.w wVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsStyleOptionPanel", "menu selected: " + menuItem.getItemId());
        int itemId = menuItem.getItemId();
        of2.n nVar = this.f426626d;
        if (itemId == 0) {
            nf2.w wVar2 = ((nf2.h) nVar).f418280a;
            java.lang.Object obj = wVar2.f372632e;
            android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
            java.lang.Object context = view != null ? view.getContext() : null;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null) {
                return;
            }
            of2.m mVar = new of2.m(activity, wVar2.f418351w, new nf2.g(activity.getResources().getDisplayMetrics().heightPixels, wVar2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(mVar, null, false, 0, 7, null);
            mVar.H().post(new of2.l(mVar));
            return;
        }
        if (itemId != 1) {
            return;
        }
        nf2.h hVar = (nf2.h) nVar;
        hVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsController", "onCloseLyricsClick: stopping lyrics and music");
        nf2.w wVar3 = hVar.f418280a;
        sf2.e1 e1Var = (sf2.e1) wVar3.m56789x25fe639c(sf2.e1.class);
        if (e1Var != null && (wVar = (nf2.w) e1Var.m56789x25fe639c(nf2.w.class)) != null) {
            nf2.d1 d1Var = wVar.f418341m;
            if (d1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee3 = d1Var.f418231s;
                if (c14199x90952ee3 != null) {
                    c14199x90952ee3.i();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "stopRender");
            }
            wVar.f418346r = false;
            wVar.b7();
        }
        sf2.e1 e1Var2 = (sf2.e1) wVar3.m56789x25fe639c(sf2.e1.class);
        if (e1Var2 != null) {
            sf2.e1.m7(e1Var2, null, true, false, false, null, 28, null);
        }
        wVar3.f7(1, 1);
    }
}
