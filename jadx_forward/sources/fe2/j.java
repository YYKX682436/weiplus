package fe2;

/* loaded from: classes3.dex */
public final class j implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe2.q f343051d;

    public j(fe2.q qVar) {
        this.f343051d = qVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.qm1 qm1Var = (r45.qm1) obj;
        fe2.q qVar = this.f343051d;
        if (qm1Var != null) {
            boolean z17 = false;
            if (qm1Var.m75939xb282bd08(0) != 0) {
                if (qm1Var.m75939xb282bd08(0) == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "liveDataLog ".concat("curBoxObserver switchToBox"));
                    oa.i k17 = qVar.f343061s.k(1);
                    java.lang.Object obj2 = k17 != null ? k17.f425311a : null;
                    he2.e eVar = obj2 instanceof he2.e ? (he2.e) obj2 : null;
                    if (eVar != null) {
                        android.widget.ImageView imageView = eVar.f362423d;
                        if (imageView != null && imageView.getVisibility() == 0) {
                            z17 = true;
                        }
                    }
                    qVar.E1(1);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb) qVar.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb.class);
                    if (tbVar == null) {
                        return;
                    }
                    java.lang.String str = "status FINDER_LIVE_SWITCH_BOX true, hasReddot:" + z17;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "mainFlowLog ".concat(str));
                    qo0.b bVar = qo0.b.f446908k5;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("isShow", true);
                    qVar.f343059q.mo46557x60d69242(bVar, bundle);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBoxCommentPlugin", "resumeBoxComment " + tbVar.hashCode() + " id:" + tbVar.f195902q);
                    android.view.ViewTreeObserver viewTreeObserver = tbVar.t1().getViewTreeObserver();
                    jz5.g gVar = tbVar.f195905t;
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener((android.view.ViewTreeObserver.OnGlobalLayoutListener) ((jz5.n) gVar).mo141623x754a37bb());
                    }
                    android.view.ViewTreeObserver viewTreeObserver2 = tbVar.t1().getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.addOnGlobalLayoutListener((android.view.ViewTreeObserver.OnGlobalLayoutListener) ((jz5.n) gVar).mo141623x754a37bb());
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 t17 = tbVar.t1();
                    jz5.g gVar2 = tbVar.f195906u;
                    t17.V0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rb) ((jz5.n) gVar2).mo141623x754a37bb());
                    tbVar.t1().i((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rb) ((jz5.n) gVar2).mo141623x754a37bb());
                    tbVar.z1(true);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "liveDataLog ".concat("curBoxObserver switchToPublic"));
        qVar.F1();
    }
}
