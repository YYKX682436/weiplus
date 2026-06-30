package ng2;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f418509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 f418510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f418511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f418512g;

    public o(ng2.s sVar, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614, yz5.l lVar, yz5.a aVar) {
        this.f418509d = sVar;
        this.f418510e = c10850xc00cf614;
        this.f418511f = lVar;
        this.f418512g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ng2.s sVar = this.f418509d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f400090e, "switchInLiveRoom switch view success. #2");
        if (ig2.e.f372905a.c()) {
            qg2.d dVar = qg2.d.f444326a;
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 view = this.f418510e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.addView(view);
            }
        }
        this.f418511f.mo146xb9724478(java.lang.Boolean.FALSE);
        boolean z17 = sVar.d().f372919k;
        yz5.a aVar = this.f418512g;
        if (z17 && ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue()) {
            sVar.p();
        } else {
            pm0.v.V(60L, new ng2.n(aVar, sVar));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f400090e, "switchInLiveRoom switch view success. #3");
    }
}
