package xt2;

/* loaded from: classes3.dex */
public abstract class m extends xt2.m6 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f538408d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f538409e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f538410f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f538411g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f538412h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f538413i;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f538414m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f538415n;

    public m(android.view.ViewGroup root1, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root1, "root1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f538408d = root1;
        this.f538409e = statusMonitor;
        this.f538410f = basePlugin;
        this.f538415n = "FinderLiveBaseAnimateEntranceWidget";
    }

    public abstract java.lang.String k();

    public abstract java.lang.String l();

    public abstract com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b m();

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(dk2.y4 r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.m.n(dk2.y4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r18, java.lang.Object r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            r17 = this;
            r10 = r17
            r1 = r19
            r0 = r20
            boolean r2 = r0 instanceof xt2.g
            if (r2 == 0) goto L19
            r2 = r0
            xt2.g r2 = (xt2.g) r2
            int r3 = r2.f538291f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f538291f = r3
            goto L1e
        L19:
            xt2.g r2 = new xt2.g
            r2.<init>(r10, r0)
        L1e:
            r11 = r2
            java.lang.Object r0 = r11.f538289d
            pz5.a r12 = pz5.a.f440719d
            int r2 = r11.f538291f
            r13 = 0
            r14 = 1
            if (r2 == 0) goto L39
            if (r2 != r14) goto L31
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            r0 = r13
            goto Lb9
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            android.view.ViewGroup r0 = r10.f538408d
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L45
            return r13
        L45:
            kotlin.jvm.internal.c0 r4 = new kotlin.jvm.internal.c0
            r4.<init>()
            kotlin.jvm.internal.h0 r6 = new kotlin.jvm.internal.h0
            r6.<init>()
            kotlin.jvm.internal.h0 r8 = new kotlin.jvm.internal.h0
            r8.<init>()
            java.lang.String r0 = ""
            r8.f391656d = r0
            kotlin.jvm.internal.h0 r5 = new kotlin.jvm.internal.h0
            r5.<init>()
            boolean r0 = r1 instanceof com.p314xaae8f345.mm.rfx.C20942x379cf5ee
            java.lang.String r2 = "path(...)"
            if (r0 == 0) goto L74
            r4.f391645d = r14
            r5.f391656d = r1
            r0 = r1
            com.tencent.mm.rfx.RfxPagFile r0 = (com.p314xaae8f345.mm.rfx.C20942x379cf5ee) r0
            java.lang.String r0 = r0.m77406x346425()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            r8.f391656d = r0
            goto L89
        L74:
            boolean r0 = r1 instanceof org.p3363xbe4143f1.C29690xfae77312
            if (r0 == 0) goto L89
            r0 = 0
            r4.f391645d = r0
            r6.f391656d = r1
            r0 = r1
            org.libpag.PAGFile r0 = (org.p3363xbe4143f1.C29690xfae77312) r0
            java.lang.String r0 = r0.m154733x346425()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            r8.f391656d = r0
        L89:
            com.tencent.mm.view.MMPAGView r3 = r17.m()
            ym5.l2 r0 = ym5.l2.f544957a
            ym5.j2[] r0 = ym5.j2.f544925d
            boolean r0 = r4.f391645d
            r3.o(r0)
            android.widget.ImageView r7 = r17.j()
            r0 = r18
            r10.f538412h = r0
            kotlinx.coroutines.p0 r15 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            xt2.l r9 = new xt2.l
            r16 = 0
            r0 = r9
            r1 = r19
            r2 = r17
            r13 = r9
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.f538291f = r14
            java.lang.Object r0 = p3325xe03a0797.p3326xc267989b.l.g(r15, r13, r11)
            if (r0 != r12) goto Lb8
            return r12
        Lb8:
            r0 = 0
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.m.o(java.lang.String, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void p() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f538413i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        ((mm2.c1) this.f538410f.S0().a(mm2.c1.class)).f410376m4.remove(l());
        java.lang.String str = l() + " stop loop play";
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f538415n, str, null);
    }

    public final void q() {
        dk2.y4 y4Var = (dk2.y4) ((mm2.c1) this.f538410f.S0().a(mm2.c1.class)).f410376m4.get(l());
        if (y4Var != null) {
            java.lang.String str = l() + " restart loop";
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f538415n, str, null);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f538413i;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f538413i = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this.f538410f, null, null, new xt2.f(y4Var, this, false, null), 3, null);
        }
    }
}
