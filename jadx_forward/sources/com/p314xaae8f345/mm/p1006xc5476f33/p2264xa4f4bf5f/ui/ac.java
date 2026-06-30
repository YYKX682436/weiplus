package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class ac extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f255259d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f255260e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f255261f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f255262g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f255263h;

    /* renamed from: i, reason: collision with root package name */
    public tj4.e f255264i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f255265m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f255259d = "MicroMsg.TextStatusGroupPageDataUIC";
        this.f255260e = new java.util.ArrayList();
        this.f255263h = new java.util.ArrayList();
        this.f255265m = new java.util.ArrayList();
    }

    public final void O6(boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var;
        java.util.List N = ai4.m0.f86706a.N();
        if (N.isEmpty()) {
            return;
        }
        int size = this.f255263h.size();
        boolean Q6 = (this.f255263h.isEmpty() || !(kz5.n0.X(this.f255263h) instanceof jj4.b)) ? Q6(this.f255263h, N) : Q6(this.f255263h, N);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255259d, "dealCardActivityDataForMultiplePublish:needUpdate=" + Q6 + ", selfStatusListSize=" + N.size() + ", oldSize=" + size + ", newSize=" + this.f255263h.size());
        if (Q6 && z17 && (f2Var = this.f255261f) != null) {
            f2Var.m8146xced61ae5();
        }
    }

    public final void P6(java.lang.String statusId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255259d, "deleteStatusById: ".concat(statusId));
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 O6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).O6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.yb ybVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.yb(statusId);
        if (O6 != null) {
            O6.d(ybVar, new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.xb(this, O6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0202 A[LOOP:9: B:98:0x01c6->B:113:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q6(java.util.ArrayList r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.Q6(java.util.ArrayList, java.util.List):boolean");
    }
}
