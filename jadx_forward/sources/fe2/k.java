package fe2;

/* loaded from: classes3.dex */
public final class k implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe2.q f343052d;

    public k(fe2.q qVar) {
        this.f343052d = qVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        fe2.q qVar = this.f343052d;
        boolean x07 = qVar.x0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "onCardVisibleLiveData, visible = " + bool + ", isLandscape = " + x07);
        if (x07 || qVar.f343062t.getChildCount() < 2) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        int i17 = bool.booleanValue() ? qVar.A : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb) qVar.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb.class);
        android.view.ViewGroup viewGroup = qVar.f446856d;
        if (tbVar != null) {
            android.view.ViewGroup.LayoutParams layoutParams = tbVar.t1().getLayoutParams();
            layoutParams.width = com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).x - i17;
            tbVar.t1().setLayoutParams(layoutParams);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = tbVar.t1().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0 vk0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0) qVar.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0.class);
        if (vk0Var != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = vk0Var.u1().getLayoutParams();
            layoutParams2.width = com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).x - i17;
            vk0Var.u1().setLayoutParams(layoutParams2);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = vk0Var.u1().mo7946xf939df19();
            if (mo7946xf939df192 != null) {
                mo7946xf939df192.m8146xced61ae5();
            }
        }
    }
}
