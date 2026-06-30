package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f284638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 f284639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f284640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f284641g;

    public u1(int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 e2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i18) {
        this.f284638d = i17;
        this.f284639e = e2Var;
        this.f284640f = c1163xf1deaba4;
        this.f284641g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 e2Var = this.f284639e;
        int i17 = e2Var.f284459w;
        int i18 = this.f284638d;
        if (i18 == i17 && !e2Var.f284449m.e(e2Var.f284444h)) {
            boolean z17 = !e2Var.f284447k.isEmpty();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f284640f;
            if (z17 || (!e2Var.f284448l.isEmpty())) {
                e2Var.K(c1163xf1deaba4);
            }
            int i19 = this.f284641g - 1;
            if (i19 <= 0) {
                return;
            }
            c1163xf1deaba4.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u1(i18, e2Var, c1163xf1deaba4, i19));
        }
    }
}
