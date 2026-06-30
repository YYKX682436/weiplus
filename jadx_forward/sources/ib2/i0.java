package ib2;

/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f371652a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f371653b;

    /* renamed from: c, reason: collision with root package name */
    public ib2.l0 f371654c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f371655d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f371656e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vx0 f371657f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2495xc50a8b8b.g f371658g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f371659h;

    public i0(android.app.Activity context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f371652a = context;
        this.f371653b = new java.util.ArrayList();
        this.f371656e = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|(1:21)(1:28)|(1:23)|24|(2:26|27))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r8 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ib2.i0 r8, so2.q6 r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof ib2.x
            if (r0 == 0) goto L16
            r0 = r10
            ib2.x r0 = (ib2.x) r0
            int r1 = r0.f371711f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f371711f = r1
            goto L1b
        L16:
            ib2.x r0 = new ib2.x
            r0.<init>(r8, r10)
        L1b:
            r5 = r0
            java.lang.Object r10 = r5.f371709d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f371711f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L77
            goto L70
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            kotlin.Result$Companion r10 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L77
            db2.t1 r1 = new db2.t1     // Catch: java.lang.Throwable -> L77
            android.app.Activity r8 = r8.f371652a     // Catch: java.lang.Throwable -> L77
            java.lang.String r10 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r10)     // Catch: java.lang.Throwable -> L77
            boolean r10 = r8 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f     // Catch: java.lang.Throwable -> L77
            r3 = 0
            if (r10 == 0) goto L57
            androidx.appcompat.app.AppCompatActivity r8 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r8     // Catch: java.lang.Throwable -> L77
            pf5.z r10 = pf5.z.f435481a     // Catch: java.lang.Throwable -> L77
            pf5.v r8 = r10.a(r8)     // Catch: java.lang.Throwable -> L77
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r10 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r8 = r8.a(r10)     // Catch: java.lang.Throwable -> L77
            com.tencent.mm.plugin.finder.viewmodel.component.ny r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r8     // Catch: java.lang.Throwable -> L77
            goto L58
        L57:
            r8 = r3
        L58:
            if (r8 == 0) goto L5e
            r45.qt2 r3 = r8.V6()     // Catch: java.lang.Throwable -> L77
        L5e:
            r1.<init>(r9, r3)     // Catch: java.lang.Throwable -> L77
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f371711f = r2     // Catch: java.lang.Throwable -> L77
            r2 = r8
            java.lang.Object r10 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L77
            if (r10 != r0) goto L70
            goto L83
        L70:
            r45.oa1 r10 = (r45.oa1) r10     // Catch: java.lang.Throwable -> L77
            java.lang.Object r8 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)     // Catch: java.lang.Throwable -> L77
            goto L82
        L77:
            r8 = move-exception
            kotlin.Result$Companion r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r8 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r8)
            java.lang.Object r8 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r8)
        L82:
            r0 = r8
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ib2.i0.a(ib2.i0, so2.q6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(ib2.i0 i0Var, r45.ux0 ux0Var) {
        i0Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", ux0Var.m75945x2fec8307(0));
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, ux0Var.m75945x2fec8307(1));
        bundle.putString("query", ux0Var.m75945x2fec8307(2));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(i0Var.f371652a, bundle, true, false, new ib2.h0());
    }

    public final void c() {
        this.f371653b.clear();
        this.f371658g = null;
        ib2.l0 l0Var = this.f371654c;
        if (l0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        l0Var.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCollectionPresenter", "requestInit CgiFinderGetTopicFeed");
        so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
        r45.vx0 vx0Var = this.f371657f;
        int m75939xb282bd08 = vx0Var != null ? vx0Var.m75939xb282bd08(21) : 0;
        q6Var.f492089b = m75939xb282bd08;
        if (m75939xb282bd08 <= 0) {
            q6Var.f492089b = 16;
        }
        r45.vx0 vx0Var2 = this.f371657f;
        q6Var.f492092e = vx0Var2 != null ? vx0Var2.m75942xfb822ef2(0) : 0L;
        p3325xe03a0797.p3326xc267989b.l.d(this.f371656e, null, null, new ib2.d0(this, q6Var, null), 3, null);
    }
}
