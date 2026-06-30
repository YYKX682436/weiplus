package jc2;

/* loaded from: classes8.dex */
public final class f implements jc2.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f380483a;

    public f() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("TLFollow");
        hashSet.add("TLRecommendTab");
        hashSet.add("finder_tl_hot_tab");
        hashSet.add("finder_tl_city_tab");
        this.f380483a = hashSet;
    }

    @Override // jc2.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb a(jc2.c chain) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chain, "chain");
        jc2.g gVar = (jc2.g) chain;
        boolean qj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).qj();
        r45.vs2 vs2Var = gVar.f380484a;
        if (qj6) {
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            java.util.LinkedList<r45.f03> linkedList = vs2Var.f470022g;
            if (linkedList != null) {
                for (r45.f03 f03Var : linkedList) {
                    java.util.HashSet hashSet = this.f380483a;
                    if (f03Var == null || (str = f03Var.f455425i) == null) {
                        str = "";
                    }
                    if (hashSet.contains(str)) {
                        java.lang.String str2 = f03Var.f455425i;
                        arrayMap.put(str2 != null ? str2 : "", vs2Var);
                    }
                }
            }
            int intValue = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.K() ? ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "视频号内部收到timeline tab红点丢弃策略", e42.d0.clicfg_finder_tab_red_dot_drop_inner, 0, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.hi0.f208431d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.N).mo141623x754a37bb()).r()).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.InnerDropTabRedDotInterceptor", "interceptTabRedDot dropValue:" + intValue);
            int i17 = ((ey2.t0) pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class)).f339040m;
            java.util.Iterator it = arrayMap.keySet().iterator();
            if (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.InnerDropTabRedDotInterceptor", "filter path:" + str3 + " redDotTabType:" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.b(str3) + " currentTabType:" + i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ta.f187412a.a(i17, false, intValue, new jc2.e(this, (r45.vs2) arrayMap.get(str3)));
            }
        }
        if (vs2Var.f470022g.isEmpty()) {
            return null;
        }
        return gVar.a(vs2Var);
    }
}
