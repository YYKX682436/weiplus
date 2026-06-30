package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f264249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f264251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f264252g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.a1 f264253h;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.a1 a1Var, int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        this.f264253h = a1Var;
        this.f264249d = i17;
        this.f264250e = str;
        this.f264251f = i18;
        this.f264252g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264253h.f263675a;
        e0Var.getClass();
        int i17 = this.f264249d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "onError, reason = %d, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f264251f), java.lang.Integer.valueOf(this.f264252g));
        if ((i17 == 0 || i17 == 2 || i17 == 8 || i17 == 9) && !e0Var.y(this.f264250e)) {
            e0Var.f263723x.setVisibility(0);
            e0Var.w();
        }
    }
}
