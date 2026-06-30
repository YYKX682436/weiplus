package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class w5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.app.Activity f196406p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 f196407q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        this.f196406p = (android.app.Activity) context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void J0() {
        t1(this.f196406p.getIntent());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            t1(this.f196406p.getIntent());
        } else {
            if (ordinal != 223) {
                return;
            }
            u1(bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 e5Var = this.f196407q;
        if (e5Var != null) {
            e5Var.f199759a.i();
            e5Var.f199760b.f199536J = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void k1(android.content.Intent intent) {
        t1(intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar;
        if (intent == null) {
            return;
        }
        boolean z17 = false;
        if (intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) == 2) {
            intent.removeExtra("KEY_PARAMS_DO_ACTION");
            if (this.f196407q == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 e5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5(this.f196406p, this.f446856d, S0());
                this.f196407q = e5Var;
                e5Var.f199759a.a(this);
            }
            r45.eq1 eq1Var = ((mm2.n2) P0(mm2.n2.class)).f410812g;
            if (eq1Var != null && eq1Var.m75933x41a8a7f2(1)) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 e5Var2 = this.f196407q;
                if (e5Var2 != null) {
                    e5Var2.f199759a.h(null, true);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 e5Var3 = this.f196407q;
            if (e5Var3 == null || (cfVar = e5Var3.f199760b) == null) {
                return;
            }
            cfVar.f0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r0.m75933x41a8a7f2(1) == true) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(android.os.Bundle r5) {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.live.widget.e5 r0 = r4.f196407q
            if (r0 != 0) goto L18
            com.tencent.mm.plugin.finder.live.widget.e5 r0 = new com.tencent.mm.plugin.finder.live.widget.e5
            gk2.e r1 = r4.S0()
            android.app.Activity r2 = r4.f196406p
            android.view.ViewGroup r3 = r4.f446856d
            r0.<init>(r2, r3, r1)
            r4.f196407q = r0
            com.tencent.mm.plugin.finder.live.widget.bh r0 = r0.f199759a
            r0.a(r4)
        L18:
            com.tencent.mm.plugin.finder.live.widget.e5 r0 = r4.f196407q
            r1 = 0
            if (r0 == 0) goto L20
            com.tencent.mm.plugin.finder.live.widget.cf r0 = r0.f199760b
            goto L21
        L20:
            r0 = r1
        L21:
            r2 = 0
            if (r0 != 0) goto L25
            goto L31
        L25:
            if (r5 == 0) goto L2e
            java.lang.String r3 = "PARAM_FINDER_LIVE_SHOW_FANS_FROM_WISH"
            boolean r3 = r5.getBoolean(r3)
            goto L2f
        L2e:
            r3 = r2
        L2f:
            r0.T = r3
        L31:
            java.lang.Class<mm2.n2> r0 = mm2.n2.class
            androidx.lifecycle.c1 r0 = r4.P0(r0)
            mm2.n2 r0 = (mm2.n2) r0
            r45.eq1 r0 = r0.f410812g
            if (r0 == 0) goto L45
            r3 = 1
            boolean r0 = r0.m75933x41a8a7f2(r3)
            if (r0 != r3) goto L45
            goto L46
        L45:
            r3 = r2
        L46:
            if (r3 == 0) goto L5a
            com.tencent.mm.plugin.finder.live.widget.e5 r0 = r4.f196407q
            if (r0 == 0) goto L65
            if (r5 == 0) goto L54
            java.lang.String r2 = "PARAM_FINDER_LIVE_SHOW_FANS_MODIFY"
            boolean r2 = r5.getBoolean(r2)
        L54:
            com.tencent.mm.plugin.finder.live.widget.bh r5 = r0.f199759a
            r5.h(r1, r2)
            goto L65
        L5a:
            com.tencent.mm.plugin.finder.live.widget.e5 r5 = r4.f196407q
            if (r5 == 0) goto L65
            com.tencent.mm.plugin.finder.live.widget.cf r5 = r5.f199760b
            if (r5 == 0) goto L65
            r5.f0()
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w5.u1(android.os.Bundle):void");
    }

    @Override // qo0.a
    public void y0(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 e5Var = this.f196407q;
        if (e5Var != null) {
            e5Var.a(i17, z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 e5Var = this.f196407q;
        if (e5Var != null) {
            e5Var.f199759a.a(this);
        }
    }
}
