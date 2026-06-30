package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class xe implements mx2.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.df f104945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.d1 f104947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderMediaLayout f104948g;

    public xe(com.tencent.mm.plugin.finder.convert.df dfVar, in5.s0 s0Var, so2.d1 d1Var, com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout) {
        this.f104945d = dfVar;
        this.f104946e = s0Var;
        this.f104947f = d1Var;
        this.f104948g = finderMediaLayout;
    }

    @Override // com.tencent.mm.plugin.finder.view.sb
    public void a(int i17, boolean z17, boolean z18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPageChange] pre2Pos:");
        com.tencent.mm.plugin.finder.convert.df dfVar = this.f104945d;
        sb6.append(dfVar.f103148p1);
        sb6.append(" prePos:");
        sb6.append(dfVar.f103147l1);
        sb6.append(" lastReportPos:");
        sb6.append(dfVar.f103150y0);
        sb6.append(" position:");
        sb6.append(i17);
        sb6.append(" isAuto:");
        sb6.append(z18);
        sb6.append(" preExpType:");
        sb6.append(dfVar.f103149x1);
        sb6.append(" preTime:");
        sb6.append(dfVar.f103151y1);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullImageConvert", sb6.toString());
        boolean z19 = dfVar.f103152z1;
        in5.s0 s0Var = this.f104946e;
        if (z19) {
            java.lang.Object obj = s0Var.f293125i;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
            if (baseFinderFeed != null && (baseFinderFeed instanceof so2.d1)) {
                so2.e1 e1Var = ((so2.d1) baseFinderFeed).f410311e;
                int i18 = e1Var.f410327d;
                if (i18 <= 0) {
                    i18 = 1;
                }
                int i19 = dfVar.f103147l1;
                if (i19 < 0) {
                    i19 = ((i17 + i18) - 1) % i18;
                }
                if (z18) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
                    java.util.HashMap hashMap = e1Var.f410325b;
                    hashMap.put(valueOf, java.lang.Integer.valueOf(((java.lang.Number) hashMap.getOrDefault(java.lang.Integer.valueOf(i19), 0)).intValue() + 1));
                } else {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
                    java.util.HashMap hashMap2 = e1Var.f410326c;
                    hashMap2.put(valueOf2, java.lang.Integer.valueOf(((java.lang.Number) hashMap2.getOrDefault(java.lang.Integer.valueOf(i19), 0)).intValue() + 1));
                }
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
                java.util.HashMap hashMap3 = e1Var.f410324a;
                hashMap3.put(valueOf3, java.lang.Integer.valueOf(((java.lang.Number) hashMap3.getOrDefault(java.lang.Integer.valueOf(i17), 0)).intValue() + 1));
            }
        }
        com.tencent.mm.plugin.finder.convert.df dfVar2 = this.f104945d;
        if (i17 != dfVar2.f103150y0) {
            int i27 = z18 ? 1 : 2;
            in5.s0 s0Var2 = this.f104946e;
            so2.d1 d1Var = this.f104947f;
            com.tencent.mm.plugin.finder.view.FinderMediaLayout mediaLayout = this.f104948g;
            kotlin.jvm.internal.o.f(mediaLayout, "$mediaLayout");
            dfVar2.Q1(s0Var2, d1Var, mediaLayout, i27, i17, dfVar.f103147l1);
            kotlin.jvm.internal.o.f(mediaLayout, "$mediaLayout");
            dfVar.R1(s0Var, this.f104947f, mediaLayout);
            dfVar.f103151y1 = android.os.SystemClock.elapsedRealtime();
            dfVar.f103148p1 = dfVar.f103147l1;
            dfVar.f103147l1 = i17;
            dfVar.f103149x1 = i27;
            dfVar.f103150y0 = i17;
        }
    }
}
