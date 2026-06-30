package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class nf extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 f185627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f185628e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar) {
        super(0);
        this.f185627d = c5445x963cab3;
        this.f185628e = zfVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.util.List<in5.c> m82898xfb7e5820;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = this.f185627d;
        c5445x963cab3.f135785g.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedChangeListener update type:");
        am.ia iaVar = c5445x963cab3.f135785g;
        sb6.append(iaVar.f88452b);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        int i18 = iaVar.f88452b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = this.f185628e;
        if (i18 == 8 || i18 == 19) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(iaVar.f88454d);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(iaVar.f88451a);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(iaVar.f88458h);
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.D1;
            zfVar.getClass();
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lf(valueOf, zfVar, valueOf2, valueOf3, null));
        } else if (i18 == 29) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = zfVar.f185890J;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
            if (c22848x6ddd90cf != null && (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) != null) {
                i17 = 0;
                for (in5.c cVar : m82898xfb7e5820) {
                    if ((cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar).getFeedObject().m59251x5db1b11() == iaVar.f88451a) {
                        break;
                    }
                    i17++;
                }
            }
            i17 = -1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "feedChangeListener update Theme, position: " + i17 + " id: " + iaVar.f88451a);
            if (i17 >= 0) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = zfVar.f185890J;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c1163xf1deaba42 != null ? c1163xf1deaba42.q0(i17, false) : null;
                in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                so2.h1 h1Var = s0Var != null ? (so2.h1) s0Var.f374658i : null;
                so2.h1 h1Var2 = h1Var instanceof so2.h1 ? h1Var : null;
                if (s0Var != null && h1Var2 != null) {
                    zfVar.N0(s0Var, h1Var2);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
