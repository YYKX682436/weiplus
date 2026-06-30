package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class dg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f289869d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f289870e;

    /* renamed from: f, reason: collision with root package name */
    public int f289871f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Intent f289872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21427xe5bb8a3 f289873h;

    public dg(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3, com.p314xaae8f345.mm.ui.pf pfVar) {
        this.f289873h = c21427xe5bb8a3;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean a17 = gm0.j1.a();
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f289873h;
        if (a17 && c21427xe5bb8a3.f278547a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "on post select image job, acc has ready, retry count %d", java.lang.Integer.valueOf(this.f289869d));
            c21427xe5bb8a3.r(c21427xe5bb8a3.f278553g, null, false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.cg(this));
        } else {
            if (this.f289869d >= 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "on post select image job, match max retry count");
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(c21427xe5bb8a3.f278547a != null);
            objArr[1] = java.lang.Integer.valueOf(this.f289869d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "on post select image job, acc not ready or view init(%B), cur retry count %d", objArr);
            this.f289869d++;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this, 300L);
        }
    }

    /* renamed from: toString */
    public java.lang.String m80631x9616526c() {
        return super.toString() + "|PostSelectImageJob";
    }
}
