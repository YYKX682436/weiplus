package df2;

/* loaded from: classes3.dex */
public final class te extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public boolean f312968m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6() {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        android.content.Context b76 = b7();
        java.lang.Integer valueOf = (b76 == null || (resources = b76.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration.orientation);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveChangeOrientationController", "try forceChangeScreenToLandscape");
        if (valueOf != null && valueOf.intValue() == 1) {
            android.content.Context b77 = b7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = b77 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) b77 : null;
            if (abstractActivityC15087xee12defa != null) {
                abstractActivityC15087xee12defa.mo55332x76847179().getResources().getConfiguration().orientation = 2;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = abstractActivityC15087xee12defa.mo55332x76847179();
                if (!(mo55332x76847179 instanceof android.app.Activity)) {
                    mo55332x76847179 = null;
                }
                if (mo55332x76847179 != null && (intent2 = mo55332x76847179.getIntent()) != null) {
                    intent2.putExtra("KEY_SUPPORT_RESET_FRAGMENT", true);
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = abstractActivityC15087xee12defa.mo55332x76847179();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = mo55332x768471792 instanceof android.app.Activity ? mo55332x768471792 : null;
                if (activityC0065xcd7aa112 != null && (intent = activityC0065xcd7aa112.getIntent()) != null) {
                    intent.putExtra("KEY_PARAMS_RESET_LIVE", true);
                }
                abstractActivityC15087xee12defa.b7(true);
                boolean z17 = false;
                abstractActivityC15087xee12defa.setRequestedOrientation(0);
                dk2.ef efVar = dk2.ef.f314905a;
                gk2.e eVar = dk2.ef.I;
                if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).a8()) {
                    z17 = true;
                }
                if (!z17) {
                    ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410458z2 = 1;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveChangeOrientationController", "changeScreenToLandscape curOrientation:" + valueOf + ",requestOrientation:" + abstractActivityC15087xee12defa.mo55332x76847179().getRequestedOrientation());
            }
        }
    }

    public final void a7() {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveChangeOrientationController", "try forceChangeScreenToPortrait");
        android.content.Context b76 = b7();
        java.lang.Integer valueOf = (b76 == null || (resources = b76.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration.orientation);
        if (valueOf != null && valueOf.intValue() == 2) {
            android.content.Context b77 = b7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = b77 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) b77 : null;
            if (abstractActivityC15087xee12defa != null) {
                abstractActivityC15087xee12defa.mo55332x76847179().getResources().getConfiguration().orientation = 1;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = abstractActivityC15087xee12defa.mo55332x76847179();
                if (!(mo55332x76847179 instanceof android.app.Activity)) {
                    mo55332x76847179 = null;
                }
                if (mo55332x76847179 != null && (intent2 = mo55332x76847179.getIntent()) != null) {
                    intent2.putExtra("KEY_PARAMS_RESET_LIVE", true);
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = abstractActivityC15087xee12defa.mo55332x76847179();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = mo55332x768471792 instanceof android.app.Activity ? mo55332x768471792 : null;
                if (activityC0065xcd7aa112 != null && (intent = activityC0065xcd7aa112.getIntent()) != null) {
                    intent.putExtra("KEY_SUPPORT_RESET_FRAGMENT", true);
                }
                abstractActivityC15087xee12defa.b7(true);
                abstractActivityC15087xee12defa.setRequestedOrientation(1);
                dk2.ef efVar = dk2.ef.f314905a;
                gk2.e eVar = dk2.ef.I;
                if (!(eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).a8())) {
                    ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410458z2 = 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveChangeOrientationController", "changeScreenToPortrait curOrientation:" + valueOf + ",requestOrientation:" + abstractActivityC15087xee12defa.mo55332x76847179().getRequestedOrientation());
            }
        }
    }

    public final android.content.Context b7() {
        java.lang.Object obj = this.f372632e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view != null) {
            return view.getContext();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }
}
