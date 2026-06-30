package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f284635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 f284636e;

    public u(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 n2Var) {
        this.f284635d = c1163xf1deaba4;
        this.f284636e = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f284635d;
        boolean E0 = c1163xf1deaba4.E0();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 n2Var = this.f284636e;
        if (E0) {
            c1163xf1deaba4.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u(c1163xf1deaba4, n2Var));
        } else if (c1163xf1deaba4.m7949x5701d990() == n2Var) {
            c1163xf1deaba4.m7964x8d4ad49c(null);
        }
    }
}
