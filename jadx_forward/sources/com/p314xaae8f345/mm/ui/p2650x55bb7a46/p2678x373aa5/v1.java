package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f284646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 f284647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f284648f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f284649g;

    public v1(int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 e2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i18) {
        this.f284646d = i17;
        this.f284647e = e2Var;
        this.f284648f = c1163xf1deaba4;
        this.f284649g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 e2Var = this.f284647e;
        int i17 = e2Var.f284458v;
        int i18 = this.f284646d;
        if (i18 == i17 && !e2Var.f284449m.e(e2Var.f284444h)) {
            boolean z17 = !e2Var.f284446j.isEmpty();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f284648f;
            if (z17) {
                e2Var.L(c1163xf1deaba4);
            }
            int i19 = this.f284649g - 1;
            if (i19 <= 0) {
                return;
            }
            c1163xf1deaba4.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v1(i18, e2Var, c1163xf1deaba4, i19));
        }
    }
}
