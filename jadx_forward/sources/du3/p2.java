package du3;

/* loaded from: classes3.dex */
public final class p2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.s2 f325210d;

    public p2(du3.s2 s2Var) {
        this.f325210d = s2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        hk0.y0 y0Var = (hk0.y0) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeDoodleState >> ");
        sb6.append(y0Var.f363379a);
        sb6.append(", ");
        hk0.z0 z0Var = y0Var.f363380b;
        sb6.append(z0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoMosaicPlugin", sb6.toString());
        hk0.z0 z0Var2 = y0Var.f363379a;
        if (z0Var == z0Var2) {
            return;
        }
        du3.s2 s2Var = this.f325210d;
        s2Var.getClass();
        hk0.z0 z0Var3 = hk0.z0.f363398g;
        android.widget.FrameLayout frameLayout = null;
        boolean z17 = y0Var.f363381c;
        if (z0Var == z0Var3) {
            s2Var.B().setBackground(null);
        } else {
            int ordinal = z0Var.ordinal();
            android.widget.FrameLayout A = ordinal != 1 ? ordinal != 2 ? null : s2Var.A() : s2Var.C();
            if (A != null) {
                if (z17) {
                    s2Var.z(A, 1.0f);
                } else {
                    A.setScaleY(1.0f);
                    A.setScaleY(1.0f);
                }
            }
        }
        if (z0Var2 == z0Var3) {
            s2Var.B().setBackground(i65.a.i(s2Var.f325230f.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.cjs));
            return;
        }
        int ordinal2 = z0Var2.ordinal();
        if (ordinal2 == 1) {
            frameLayout = s2Var.C();
        } else if (ordinal2 == 2) {
            frameLayout = s2Var.A();
        }
        if (frameLayout == null) {
            return;
        }
        if (z17) {
            s2Var.z(frameLayout, 1.4f);
        } else {
            frameLayout.setScaleX(1.4f);
            frameLayout.setScaleY(1.4f);
        }
    }
}
