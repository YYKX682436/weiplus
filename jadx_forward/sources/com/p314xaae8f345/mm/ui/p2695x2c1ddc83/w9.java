package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class w9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x9 f289758d;

    public w9(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x9 x9Var) {
        this.f289758d = x9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x9 x9Var = this.f289758d;
        if (x9Var.f289775d) {
            return;
        }
        int lastVisiblePosition = x9Var.f289772a.getLastVisiblePosition();
        int firstVisiblePosition = x9Var.f289772a.getFirstVisiblePosition();
        int i17 = lastVisiblePosition - firstVisiblePosition;
        if (firstVisiblePosition == x9Var.f289778g) {
            return;
        }
        x9Var.f289778g = firstVisiblePosition;
        int i18 = lastVisiblePosition + 1;
        int i19 = i18;
        while (true) {
            try {
                yf5.j0 j0Var = x9Var.f289773b;
                if (i19 >= ((yf5.w0) j0Var).f543518q.f543377a || i19 >= (i17 * 1) + lastVisiblePosition) {
                    break;
                }
                ((yf5.w0) j0Var).j(i19);
                i19++;
            } catch (java.lang.RuntimeException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PreLoadHelper", e17, "Failed to preload MainUI avatars", new java.lang.Object[0]);
                return;
            }
        }
        for (int i27 = firstVisiblePosition - 1; i27 >= 0 && i27 > firstVisiblePosition - (i17 * 1); i27--) {
            ((yf5.w0) x9Var.f289773b).j(i27);
        }
        while (true) {
            yf5.j0 j0Var2 = x9Var.f289773b;
            if (i18 >= ((yf5.w0) j0Var2).f543518q.f543377a || i18 >= (i17 * 10) + lastVisiblePosition || x9Var.f289775d) {
                return;
            }
            ((yf5.w0) j0Var2).getItem(i18);
            j0Var2.getClass();
            i18++;
        }
    }
}
