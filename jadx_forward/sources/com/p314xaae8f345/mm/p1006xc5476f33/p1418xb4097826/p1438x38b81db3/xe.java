package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class xe implements mx2.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.df f186478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.d1 f186480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 f186481g;

    public xe(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.df dfVar, in5.s0 s0Var, so2.d1 d1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808) {
        this.f186478d = dfVar;
        this.f186479e = s0Var;
        this.f186480f = d1Var;
        this.f186481g = c15324x3354d808;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sb
    public void a(int i17, boolean z17, boolean z18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPageChange] pre2Pos:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.df dfVar = this.f186478d;
        sb6.append(dfVar.f184681p1);
        sb6.append(" prePos:");
        sb6.append(dfVar.f184680l1);
        sb6.append(" lastReportPos:");
        sb6.append(dfVar.f184683y0);
        sb6.append(" position:");
        sb6.append(i17);
        sb6.append(" isAuto:");
        sb6.append(z18);
        sb6.append(" preExpType:");
        sb6.append(dfVar.f184682x1);
        sb6.append(" preTime:");
        sb6.append(dfVar.f184684y1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullImageConvert", sb6.toString());
        boolean z19 = dfVar.f184685z1;
        in5.s0 s0Var = this.f186479e;
        if (z19) {
            java.lang.Object obj = s0Var.f374658i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
            if (abstractC14490x69736cb5 != null && (abstractC14490x69736cb5 instanceof so2.d1)) {
                so2.e1 e1Var = ((so2.d1) abstractC14490x69736cb5).f491844e;
                int i18 = e1Var.f491860d;
                if (i18 <= 0) {
                    i18 = 1;
                }
                int i19 = dfVar.f184680l1;
                if (i19 < 0) {
                    i19 = ((i17 + i18) - 1) % i18;
                }
                if (z18) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
                    java.util.HashMap hashMap = e1Var.f491858b;
                    hashMap.put(valueOf, java.lang.Integer.valueOf(((java.lang.Number) hashMap.getOrDefault(java.lang.Integer.valueOf(i19), 0)).intValue() + 1));
                } else {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
                    java.util.HashMap hashMap2 = e1Var.f491859c;
                    hashMap2.put(valueOf2, java.lang.Integer.valueOf(((java.lang.Number) hashMap2.getOrDefault(java.lang.Integer.valueOf(i19), 0)).intValue() + 1));
                }
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
                java.util.HashMap hashMap3 = e1Var.f491857a;
                hashMap3.put(valueOf3, java.lang.Integer.valueOf(((java.lang.Number) hashMap3.getOrDefault(java.lang.Integer.valueOf(i17), 0)).intValue() + 1));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.df dfVar2 = this.f186478d;
        if (i17 != dfVar2.f184683y0) {
            int i27 = z18 ? 1 : 2;
            in5.s0 s0Var2 = this.f186479e;
            so2.d1 d1Var = this.f186480f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 mediaLayout = this.f186481g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaLayout, "$mediaLayout");
            dfVar2.Q1(s0Var2, d1Var, mediaLayout, i27, i17, dfVar.f184680l1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaLayout, "$mediaLayout");
            dfVar.R1(s0Var, this.f186480f, mediaLayout);
            dfVar.f184684y1 = android.os.SystemClock.elapsedRealtime();
            dfVar.f184681p1 = dfVar.f184680l1;
            dfVar.f184680l1 = i17;
            dfVar.f184682x1 = i27;
            dfVar.f184683y0 = i17;
        }
    }
}
