package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wg0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f196463p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14272x316b2af8 f196464q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f196465r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f196466s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f196467t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f196468u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.tencent.mm.plugin.finder.live.plugin.FinderLiveVisitorClosePlugin$closeEventListener$1] */
    public wg0(android.view.ViewGroup root, qo0.c statueMonitor) {
        super(root, statueMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statueMonitor, "statueMonitor");
        this.f196463p = statueMonitor;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f196464q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5480xd2a43374>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveVisitorClosePlugin$closeEventListener$1
            {
                this.f39173x3fe91575 = -956107388;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5480xd2a43374 c5480xd2a43374) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5480xd2a43374 event = c5480xd2a43374;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorClosePlugin", "rcv FinderLiveCloseEvent");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0.this.u1(true);
                return false;
            }
        };
        this.f196465r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pg0(root, this));
        this.f196466s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sg0(root, this));
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.igy);
        this.f196467t = findViewById;
        com.p314xaae8f345.mm.ui.bl.c(root.getContext());
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lg0(this));
        if (root.getLayoutParams() != null && (root.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            if (x0()) {
                android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 32));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams2 = root.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 8));
            }
        }
        zl2.r4.f555483a.d(this);
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0 wg0Var) {
        jk2.l Z6;
        boolean z17;
        if (!((mm2.c1) wg0Var.P0(mm2.c1.class)).M7()) {
            android.content.Context context = wg0Var.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (!((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                om2.l lVar = (om2.l) wg0Var.P0(om2.l.class);
                boolean z18 = false;
                if (((mm2.e1) lVar.m147920xbba4bfc0(mm2.e1.class)).b7() && (((om2.g) lVar.m147920xbba4bfc0(om2.g.class)).f427849w > 0 || ((om2.g) lVar.m147920xbba4bfc0(om2.g.class)).S6())) {
                    ((fh2.g) ((jz5.n) wg0Var.f196465r).mo141623x754a37bb()).w();
                    return;
                }
                if (((mm2.o4) wg0Var.P0(mm2.o4.class)).z7()) {
                    ((ni2.e2) ((jz5.n) wg0Var.f196466s).mo141623x754a37bb()).w();
                    return;
                }
                df2.yv yvVar = (df2.yv) wg0Var.U0(df2.yv.class);
                if (yvVar != null && (Z6 = yvVar.Z6()) != null) {
                    long a17 = dk2.tf.f315666a.a(((mm2.c1) ((df2.wv) Z6.f381606a).b().a(mm2.c1.class)).f410385o);
                    java.util.ArrayList arrayList = Z6.f381607b;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (a17 >= ((long) ((jk2.j) next).f381603b.m75939xb282bd08(2))) {
                            arrayList2.add(next);
                        }
                    }
                    java.util.Iterator it6 = kz5.n0.F0(arrayList2, new jk2.k()).iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z17 = false;
                            break;
                        }
                        jk2.j jVar = (jk2.j) it6.next();
                        if (jVar.g()) {
                            jVar.d().putInt(jVar.c(), 1);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.p1519x5e23afc.C14255x699a7a9e c14255x699a7a9e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.p1519x5e23afc.C14255x699a7a9e) jVar.d().r(jVar.b(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.p1519x5e23afc.C14255x699a7a9e.class);
                            if (c14255x699a7a9e == null) {
                                c14255x699a7a9e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.p1519x5e23afc.C14255x699a7a9e();
                                c14255x699a7a9e.f193274d = c01.id.c();
                            }
                            c14255x699a7a9e.f193275e++;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f381605d, "save result: " + jVar.d().C(jVar.b(), c14255x699a7a9e));
                            jVar.i();
                            z17 = true;
                        }
                    }
                    if (z17) {
                        z18 = true;
                    }
                }
                if (z18) {
                    return;
                }
                wg0Var.u1(true);
                return;
            }
        }
        if (((mm2.c1) wg0Var.P0(mm2.c1.class)).L5) {
            ((mm2.c1) wg0Var.P0(mm2.c1.class)).N5 = 1;
            wg0Var.u1(true);
        } else {
            xu2.u uVar = (xu2.u) wg0Var.X0(xu2.u.class);
            if (uVar != null) {
                uVar.x1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg0(wg0Var));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void J0() {
        android.view.ViewGroup viewGroup = this.f446856d;
        if (com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext()) == 0) {
            com.p314xaae8f345.mm.ui.zk.a(viewGroup.getContext(), 16);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            if (ordinal == 7) {
                K0(0);
                return;
            } else if (ordinal == 213) {
                u1(true);
                return;
            } else if (ordinal != 27 && ordinal != 28) {
                return;
            }
        }
        K0(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        mo48814x2efc64();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f196468u;
        if (k0Var != null) {
            k0Var.u();
        }
        this.f196468u = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r15 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(boolean r15) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0.u1(boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        mo48813x58998cd();
    }
}
