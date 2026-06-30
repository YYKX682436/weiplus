package el2;

/* loaded from: classes3.dex */
public final class y0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f335482d;

    public y0(el2.i1 i1Var) {
        this.f335482d = i1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.y0 y0Var = (mm2.y0) obj;
        if (y0Var.f411082b == 9) {
            el2.i1 i1Var = this.f335482d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i1Var.f335348g, "[onGiftSendInstantClick]");
            boolean z17 = y0Var.f411081a == qs5.m.f447971d;
            android.view.ViewGroup viewGroup = i1Var.f335345d;
            if (z17) {
                if (!(viewGroup.getScaleX() == 1.4f)) {
                    viewGroup.postDelayed(new el2.d1(viewGroup, i1Var, 1.4f), 0L);
                }
            } else {
                i1Var.f335354p = false;
                i1Var.f335355q = false;
                i1Var.o(false);
                if (!(viewGroup.getScaleX() == 1.0f)) {
                    viewGroup.postDelayed(new el2.d1(viewGroup, i1Var, 1.0f), 0L);
                }
            }
            i1Var.o(false);
        }
    }
}
