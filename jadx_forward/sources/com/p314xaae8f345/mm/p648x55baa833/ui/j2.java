package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.k2 f145778d;

    public j2(com.p314xaae8f345.mm.p648x55baa833.ui.k2 k2Var) {
        this.f145778d = k2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.k2 k2Var = this.f145778d;
        if (k2Var.f145801d.f145280e.getCount() == 0) {
            k2Var.f145801d.finish();
        }
    }
}
