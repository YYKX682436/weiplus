package com.p314xaae8f345.mm.p1006xc5476f33.sns;

/* renamed from: com.tencent.mm.plugin.sns.SnsStarListDataUIC */
/* loaded from: classes4.dex */
public final class C17692xcc3ccb9d extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public ca4.l f244060d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f244061e;

    /* renamed from: f, reason: collision with root package name */
    public int f244062f;

    /* renamed from: g, reason: collision with root package name */
    public int f244063g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f244064h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f244065i;

    /* renamed from: m, reason: collision with root package name */
    public int f244066m;

    /* renamed from: n, reason: collision with root package name */
    public long f244067n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f244068o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f244069p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f244070q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f244071r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f244072s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17692xcc3ccb9d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f244061e = new java.util.ArrayList();
        this.f244065i = "";
        this.f244070q = true;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f244072s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e>(a0Var) { // from class: com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1
            {
                this.f39173x3fe91575 = 778735630;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e c6098x8f514c1e) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e event = c6098x8f514c1e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                ((ku5.t0) ku5.t0.f394148d).B(new n34.e4(event, com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1");
                return false;
            }
        };
    }

    public static final int O6(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d c17692xcc3ccb9d, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$findPosition", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        c17692xcc3ccb9d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findPosition", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        java.util.Iterator it = c17692xcc3ccb9d.f244061e.iterator();
        int i17 = -1;
        int i18 = -1;
        while (true) {
            if (!it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findPosition", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
                break;
            }
            i18++;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it.next()).m70367x7525eefd().equals(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findPosition", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
                i17 = i18;
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$findPosition", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x01ef, code lost:
    
        if (r3.V6(r5) == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c2, code lost:
    
        if (r0.T6(r4, r5) == r6) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P6(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.P6(com.tencent.mm.plugin.sns.SnsStarListDataUIC, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final /* synthetic */ java.util.ArrayList Q6(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d c17692xcc3ccb9d) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getList$p", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        java.util.ArrayList arrayList = c17692xcc3ccb9d.f244061e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getList$p", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        return arrayList;
    }

    public static final /* synthetic */ java.lang.String R6(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d c17692xcc3ccb9d) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUserName$p", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        java.lang.String str = c17692xcc3ccb9d.f244065i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUserName$p", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        return str;
    }

    public static final /* synthetic */ java.lang.Object S6(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d c17692xcc3ccb9d, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$initFixData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        java.lang.Object T6 = c17692xcc3ccb9d.T6(list, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$initFixData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        return T6;
    }

    public final java.lang.Object T6(java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initFixData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new n34.z3(list, this, null), interfaceC29045xdcb5ca57);
        if (g17 == pz5.a.f440719d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initFixData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
            return g17;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initFixData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        return f0Var;
    }

    public final void U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        if (this.f244069p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListDataUIC", "loadData but is finish");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        } else if (this.f244071r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListDataUIC", "loadData and is loading data");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        } else {
            this.f244071r = true;
            pf5.e.m158343xd39de650(this, null, null, new n34.b4(this, null), 3, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        this.f244064h = m158359x1e885992().getBooleanExtra("KEY_IS_SELF", false);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("KEY_USER_NAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f244065i = stringExtra;
        U6();
        this.f244072s.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        this.f244072s.mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
    }
}
