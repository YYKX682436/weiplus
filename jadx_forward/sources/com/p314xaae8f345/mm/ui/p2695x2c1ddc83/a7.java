package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f288973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b7 f288974e;

    public a7(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b7 b7Var, java.lang.Integer num) {
        this.f288974e = b7Var;
        this.f288973d = num;
    }

    @Override // java.lang.Runnable
    public void run() {
        int firstVisiblePosition;
        int i17;
        java.lang.String str;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b7 b7Var = this.f288974e;
        long j17 = currentTimeMillis - b7Var.f289013d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = b7Var.f289016g;
        if ((j17 >= 3000 || (firstVisiblePosition = b7Var.f289014e) < 0) && (firstVisiblePosition = (c22376x88ed722d.f288905o.getFirstVisiblePosition() - c22376x88ed722d.f288905o.getHeaderViewsCount()) + 1) < 0) {
            firstVisiblePosition = 0;
        }
        yf5.j0 j0Var = c22376x88ed722d.f288912v;
        boolean z17 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3.f289747g.c() > 0;
        yf5.w0 w0Var = (yf5.w0) j0Var;
        int i18 = w0Var.f543518q.f543377a;
        if (i18 > 0) {
            i17 = (int) java.lang.Math.abs((firstVisiblePosition + 1) % i18);
            while (i17 != firstVisiblePosition) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 item = w0Var.getItem(i17);
                if (item != null && ((item.d1() > 0 || item.f1() > 0) && (!z17 || com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3.b(item) == 2))) {
                    break;
                } else {
                    i17 = (i17 + 1) % i18;
                }
            }
        }
        i17 = -1;
        if (i17 < 0) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b7.a(b7Var, c22376x88ed722d.f288905o.getHeaderViewsCount());
        } else {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b7.a(b7Var, c22376x88ed722d.f288905o.getHeaderViewsCount() + i17);
        }
        b7Var.f289013d = currentTimeMillis;
        b7Var.f289014e = i17 < 0 ? 0 : i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 item2 = ((yf5.w0) c22376x88ed722d.f288912v).getItem(i17);
        fg5.c.f344034a.a(2L, this.f288973d.intValue(), item2, c22376x88ed722d.f288912v);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(c22376x88ed722d.f288905o.getHeaderViewsCount());
        objArr[1] = java.lang.Integer.valueOf(firstVisiblePosition);
        objArr[2] = java.lang.Integer.valueOf(i17);
        if (item2 == null || (str = item2.h1()) == null) {
            str = "";
        }
        objArr[3] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "headerCount %d, scroll from %d to %d, usr:%s", objArr);
    }
}
