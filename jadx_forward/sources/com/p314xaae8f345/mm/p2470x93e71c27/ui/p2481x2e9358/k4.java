package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271978d;

    public k4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271978d = c19666xfd6e2f33;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271978d;
        try {
            hv4.l lVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.f271483x6;
            c19666xfd6e2f33.q0();
            boolean z17 = c19666xfd6e2f33.f271503d2 == 3 || c19666xfd6e2f33.f271543k2;
            int a17 = (int) com.p314xaae8f345.mm.ui.gk.a(i65.a.f(c19666xfd6e2f33.getContext(), z17 ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561229an0 : com.p314xaae8f345.mm.R.C30860x5b28f31.f561234cx));
            int max = z17 ? java.lang.Math.max(a17, c19666xfd6e2f33.f271611v2) : a17;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19678x1ab789dd c19678x1ab789dd = c19666xfd6e2f33.f271515f2;
            boolean z18 = c19678x1ab789dd != null && c19678x1ab789dd.a(max);
            if (!z18 && z17 && c19666xfd6e2f33.f271515f2 != null) {
                android.view.View view = c19666xfd6e2f33.f271592s;
                int height = view == null ? 0 : view.getHeight();
                android.view.View view2 = c19666xfd6e2f33.f271616w;
                int height2 = view2 == null ? 0 : view2.getHeight();
                int i17 = c19666xfd6e2f33.f271611v2;
                int[] iArr = {i17 + height, i17 + height + height2, i17 + java.lang.Math.max(height, a17)};
                int i18 = 0;
                while (true) {
                    if (i18 >= 3) {
                        break;
                    }
                    int i19 = iArr[i18];
                    if (i19 > max && c19666xfd6e2f33.f271515f2.a(i19)) {
                        z18 = true;
                        max = i19;
                        break;
                    }
                    i18++;
                }
                if (!z18) {
                    max = java.lang.Math.max(max, c19666xfd6e2f33.f271611v2 + java.lang.Math.max(height, a17));
                    z18 = true;
                }
            }
            if (!z18) {
                c19666xfd6e2f33.A2 = false;
                return;
            }
            c19666xfd6e2f33.f271638z2 = max;
            int i27 = c19666xfd6e2f33.f271503d2;
            c19666xfd6e2f33.B2 = i27;
            c19666xfd6e2f33.A2 = true;
            if (i27 != 4) {
                c19666xfd6e2f33.E1(4, true, -1);
            }
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
