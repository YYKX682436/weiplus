package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f289252d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f289253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d f289254f;

    public h7(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d, boolean z17) {
        this.f289254f = c22376x88ed722d;
        this.f289253e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = this.f289254f;
        if (c22376x88ed722d.f288905o == null) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.bl.i(c22376x88ed722d.mo7438x76847179(), -1);
        int a17 = o25.n1.a(c22376x88ed722d.f288905o.getContext());
        if (i17 <= 0 || a17 <= 0) {
            if (this.f289252d < 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "[trySetListViewMargin] try getStatusHeight again!");
                c22376x88ed722d.f288905o.post(this);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MainUI", "[trySetListViewMargin] try getStatusHeight finally!");
            }
            this.f289252d++;
        } else if (i17 != c22376x88ed722d.f288905o.getPaddingTop()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "[initListViewPadding] now:%s old:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c22376x88ed722d.f288905o.getPaddingTop()));
            if (this.f289253e) {
                a17 = 0;
            }
            c22376x88ed722d.t0(a17, i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "[trySetListViewMargin] has try more once! it's right! statusHeight:%s", java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "[trySetListViewMargin] tryCount:%s statusHeight:%s", java.lang.Integer.valueOf(this.f289252d), java.lang.Integer.valueOf(i17));
    }
}
