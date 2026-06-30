package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.d1.class)
/* loaded from: classes9.dex */
public class zg extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e, sb5.d1 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f281908e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f281909f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public boolean f281910g = false;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f281911h = new android.graphics.Rect();

    /* renamed from: i, reason: collision with root package name */
    public boolean f281912i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f281913m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f281914n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f281915o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f281916p = false;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        this.f281912i = false;
        if (c01.e2.L(this.f280113d.x())) {
            return;
        }
        ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).oj(this.f280113d.x());
        n0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        if (!c01.e2.L(this.f280113d.x())) {
            ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).oj(this.f280113d.x());
        }
        p0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        if (!c01.e2.L(this.f280113d.x())) {
            ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).oj(this.f280113d.x());
        }
        p0();
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (c01.e2.L(this.f280113d.x())) {
            return;
        }
        if (i17 == 0) {
            n0();
        }
        this.f281910g = i17 != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0048, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r18.f471034g.f472026w) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r18.f471034g.E) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m0(int r17, r45.wv3 r18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 r19, int r20) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zg.m0(int, r45.wv3, com.tencent.mm.ui.chatting.viewitems.a4, int):void");
    }

    public final void n0() {
        int o17 = this.f280113d.o();
        for (int j17 = this.f280113d.j(); j17 < o17 + 1; j17++) {
            android.view.View C = this.f280113d.p().C(j17, 0);
            if (C != null && (C.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4) C.getTag();
                if (a4Var.f284813x != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a4Var.f284815z) && a4Var.E) {
                    r45.wv3 wv3Var = new r45.wv3();
                    wv3Var.f471032e = a4Var.B;
                    r45.xv3 xv3Var = new r45.xv3();
                    wv3Var.f471034g = xv3Var;
                    xv3Var.f472026w = a4Var.f284815z;
                    xv3Var.A = a4Var.A;
                    m0(0, wv3Var, a4Var, 0);
                }
                if (a4Var.G != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a4Var.F) && a4Var.K) {
                    r45.wv3 wv3Var2 = new r45.wv3();
                    wv3Var2.f471032e = a4Var.B;
                    r45.xv3 xv3Var2 = new r45.xv3();
                    wv3Var2.f471034g = xv3Var2;
                    xv3Var2.E = a4Var.F;
                    m0(9, wv3Var2, a4Var, 0);
                }
            }
        }
    }

    public boolean o0(int i17, long j17) {
        java.util.HashSet hashSet = i17 == 9 ? this.f281909f : this.f281908e;
        if (hashSet == null || hashSet.size() <= 0) {
            return false;
        }
        return hashSet.contains(java.lang.Long.valueOf(j17));
    }

    public final void p0() {
        java.util.HashSet hashSet = this.f281908e;
        if (hashSet != null) {
            hashSet.clear();
        }
        java.util.HashSet hashSet2 = this.f281909f;
        if (hashSet2 != null) {
            hashSet2.clear();
        }
        if (this.f280113d.p() == null) {
            return;
        }
        int m75886x3d79f549 = this.f280113d.p().m75886x3d79f549();
        for (int i17 = 0; i17 < m75886x3d79f549; i17++) {
            android.view.View m75885x6a486239 = this.f280113d.p().m75885x6a486239(i17);
            if (m75885x6a486239 != null && (m75885x6a486239.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4) m75885x6a486239.getTag();
                if (a4Var.f284813x != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a4Var.f284815z) && a4Var.E) {
                    a4Var.f284812w.n();
                    android.view.View view = a4Var.f284813x;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/LuckyMoneyComponent", "releasePagView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/chatting/component/LuckyMoneyComponent", "releasePagView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (a4Var.D) {
                        a4Var.f284812w.m82582x3ae760af(0.0d);
                        a4Var.f284814y.setVisibility(8);
                    } else {
                        a4Var.f284814y.setVisibility(0);
                    }
                }
                if (a4Var.G != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a4Var.F) && a4Var.K) {
                    a4Var.I.n();
                    a4Var.G.setVisibility(8);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        this.f281912i = true;
        this.f281913m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_lucky_money_dynamic_bubble_close_switch, false);
        this.f281914n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_dynamic_atmosphere_bubble_close_switch, false);
        this.f281915o = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_dynamic_atmosphere_bubble_clip_close_switch, false);
        this.f281916p = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) ((gb3.j) i95.n0.c(gb3.j.class))).Ri();
    }
}
