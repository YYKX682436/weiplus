package dk2;

/* loaded from: classes2.dex */
public final class i2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f315135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f315136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315137d;

    public i2(dk2.r4 r4Var, int i17, int i18, int i19) {
        this.f315134a = r4Var;
        this.f315135b = i17;
        this.f315136c = i18;
        this.f315137d = i19;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.ArrayList arrayList;
        r45.np1 np1Var = (r45.np1) ((com.p314xaae8f345.mm.p944x882e457a.f) obj).f152151d;
        km2.p pVar = new km2.p(null, null, null, 7, null);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = np1Var.m75934xbce7f2f(2);
        dk2.r4 r4Var = this.f315134a;
        if (m75934xbce7f2f != null) {
            pVar.f390700b = m75934xbce7f2f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "Guide nav buffer captured, size: " + m75934xbce7f2f.f273689a.length);
        }
        r45.lp1 lp1Var = (r45.lp1) np1Var.m75936x14adae67(3);
        boolean z17 = true;
        boolean z18 = false;
        if (lp1Var != null) {
            pVar.f390701c = lp1Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "Guide ext_info captured, lightUrl=" + lp1Var.m75945x2fec8307(0) + ", darkUrl=" + lp1Var.m75945x2fec8307(1));
        }
        java.util.LinkedList m75941xfb821914 = np1Var.m75941xfb821914(1);
        if (m75941xfb821914 != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((r45.fa2) obj2).f455659e == 18) {
                    break;
                }
            }
            r45.fa2 fa2Var = (r45.fa2) obj2;
            if (fa2Var != null) {
                int i17 = this.f315135b;
                int i18 = this.f315136c;
                int i19 = this.f315137d;
                pVar.f390699a = fa2Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "Guide container set to guidePageData, type=" + fa2Var.f455659e);
                km2.n nVar = dk2.ef.H;
                if (nVar != null && (arrayList = nVar.f390686e) != null) {
                    if (!arrayList.isEmpty()) {
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            if (((km2.t) it6.next()).f390756e != null) {
                                break;
                            }
                        }
                    }
                    z17 = false;
                    z18 = z17;
                }
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "Guide container already exists, skipping insertion");
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new dk2.h2(i17, new km2.t(pVar), r4Var, i18, i19));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
