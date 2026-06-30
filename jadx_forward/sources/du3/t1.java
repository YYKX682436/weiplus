package du3;

/* loaded from: classes3.dex */
public final class t1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.g2 f325248d;

    public t1(du3.g2 g2Var) {
        this.f325248d = g2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        int d17;
        du3.g2 g2Var = this.f325248d;
        java.lang.Object mo141623x754a37bb = ((jz5.n) g2Var.f325127p).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
        boolean z17 = ((hk0.o) obj).f363316b;
        android.view.ViewGroup viewGroup = g2Var.f325120f;
        if (z17) {
            hk0.z0 S6 = g2Var.C().S6();
            int ordinal = S6.ordinal();
            if (ordinal == 0 || ordinal == 3) {
                g2Var.C().g7(hk0.z0.f363396e, false);
            } else {
                g2Var.C().g7(S6, false);
            }
            d17 = i65.a.d(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.ac7);
        } else {
            d17 = i65.a.d(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560806ac5);
        }
        c22699x3dcdb352.m82040x7541828(d17);
        du3.g2.z(g2Var);
    }
}
