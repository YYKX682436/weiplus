package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class zl extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public so2.u1 f218222d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f218223e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e2 f218224f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f218225g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2495xc50a8b8b.g f218226h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f218227i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f218228m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f218229n;

    /* renamed from: o, reason: collision with root package name */
    public int f218230o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 f218231p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f218232q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f218233r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f218234s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f218235t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f218236u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f218224f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e2();
        this.f218225g = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.f218228m = true;
        this.f218229n = true;
        this.f218230o = -1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|(1:21)(1:28)|(1:23)|24|(2:26|27))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r8 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl r8, so2.q6 r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pl
            if (r0 == 0) goto L16
            r0 = r10
            com.tencent.mm.plugin.finder.viewmodel.component.pl r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pl) r0
            int r1 = r0.f217092f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f217092f = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.viewmodel.component.pl r0 = new com.tencent.mm.plugin.finder.viewmodel.component.pl
            r0.<init>(r8, r10)
        L1b:
            r5 = r0
            java.lang.Object r10 = r5.f217090d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f217092f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L79
            goto L72
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            kotlin.Result$Companion r10 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L79
            db2.t1 r1 = new db2.t1     // Catch: java.lang.Throwable -> L79
            android.app.Activity r8 = r8.m80379x76847179()     // Catch: java.lang.Throwable -> L79
            java.lang.String r10 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r10)     // Catch: java.lang.Throwable -> L79
            boolean r10 = r8 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f     // Catch: java.lang.Throwable -> L79
            r3 = 0
            if (r10 == 0) goto L59
            androidx.appcompat.app.AppCompatActivity r8 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r8     // Catch: java.lang.Throwable -> L79
            pf5.z r10 = pf5.z.f435481a     // Catch: java.lang.Throwable -> L79
            pf5.v r8 = r10.a(r8)     // Catch: java.lang.Throwable -> L79
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r10 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r8 = r8.a(r10)     // Catch: java.lang.Throwable -> L79
            com.tencent.mm.plugin.finder.viewmodel.component.ny r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r8     // Catch: java.lang.Throwable -> L79
            goto L5a
        L59:
            r8 = r3
        L5a:
            if (r8 == 0) goto L60
            r45.qt2 r3 = r8.V6()     // Catch: java.lang.Throwable -> L79
        L60:
            r1.<init>(r9, r3)     // Catch: java.lang.Throwable -> L79
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f217092f = r2     // Catch: java.lang.Throwable -> L79
            r2 = r8
            java.lang.Object r10 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L79
            if (r10 != r0) goto L72
            goto L85
        L72:
            r45.oa1 r10 = (r45.oa1) r10     // Catch: java.lang.Throwable -> L79
            java.lang.Object r8 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)     // Catch: java.lang.Throwable -> L79
            goto L84
        L79:
            r8 = move-exception
            kotlin.Result$Companion r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r8 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r8)
            java.lang.Object r8 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r8)
        L84:
            r0 = r8
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl.O6(com.tencent.mm.plugin.finder.viewmodel.component.zl, so2.q6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl zlVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e2 e2Var = zlVar.f218224f;
        if (z17) {
            zlVar.f218234s = false;
            qr2.d dVar = qr2.e.f447603e;
            java.util.ArrayList arrayList = e2Var.f203829a;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = zlVar.f218233r;
            if (c22848x6ddd90cf != null) {
                qr2.d.a(dVar, arrayList, c22848x6ddd90cf, zlVar.f218228m, false, 8, null);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
        }
        zlVar.f218235t = false;
        qr2.g gVar = qr2.h.f447604e;
        java.util.ArrayList arrayList2 = e2Var.f203829a;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = zlVar.f218233r;
        if (c22848x6ddd90cf2 != null) {
            qr2.g.a(gVar, arrayList2, c22848x6ddd90cf2, zlVar.f218227i, false, 8, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }

    public static final void Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl zlVar, boolean z17) {
        r45.vx0 vx0Var;
        zlVar.getClass();
        so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
        q6Var.f492088a = zlVar.f218226h;
        q6Var.f492089b = 16;
        q6Var.f492090c = zlVar.R6().getFeedObject().m59251x5db1b11();
        q6Var.f492091d = zlVar.R6().getFeedObject().m59229xb5af1dd5();
        r45.dm2 m76806xdef68064 = zlVar.R6().getFeedObject().getFeedObject().m76806xdef68064();
        if (m76806xdef68064 != null && (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) != null) {
            q6Var.f492092e = vx0Var.m75942xfb822ef2(0);
        }
        q6Var.f492093f = z17 ? 1 : 0;
        p3325xe03a0797.p3326xc267989b.l.d(zlVar.f218225g, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xl(z17, zlVar, q6Var, null), 3, null);
    }

    public final so2.u1 R6() {
        so2.u1 u1Var = this.f218222d;
        if (u1Var != null) {
            return u1Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("attachFeed");
        throw null;
    }

    public final boolean S6(so2.u1 u1Var) {
        r45.vx0 vx0Var;
        r45.dm2 m76806xdef68064 = u1Var.getFeedObject().getFeedObject().m76806xdef68064();
        return (m76806xdef68064 == null || (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) == null || vx0Var.m75939xb282bd08(16) != 1) ? false : true;
    }

    public final void T6(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f218232q;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return;
        }
        int dimension = i17 == 0 ? 0 : (int) m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f218232q;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yl(this, c1162x665295de, i17, dimension));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
    }

    public final void U6(boolean z17) {
        this.f218228m = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalCollectionUIC", "set downContinue " + z17);
    }

    public final void V6(boolean z17) {
        this.f218227i = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalCollectionUIC", "set upContinue " + z17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }
}
