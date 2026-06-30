package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class l8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements android.view.View.OnClickListener {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f194891p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n7 f194892q;

    /* renamed from: r, reason: collision with root package name */
    public int f194893r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f194894s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194891p = statusMonitor;
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f446856d.getVisibility() != 0) {
            return false;
        }
        int i17 = this.f194893r;
        if (i17 == 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i8(this));
        } else if (i17 == 1) {
            this.f194893r = 0;
            qo0.c.a(this.f194891p, qo0.b.f446925o2, null, 2, null);
        } else {
            if (i17 != 2) {
                return false;
            }
            this.f194893r = 0;
            sf2.x xVar = (sf2.x) U0(sf2.x.class);
            if (xVar != null) {
                xVar.g7();
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 94) {
            u1(null);
            return;
        }
        if (ordinal != 95) {
            return;
        }
        int i17 = this.f194893r;
        if (i17 == 1) {
            qo0.c.a(this.f194891p, qo0.b.f446925o2, null, 2, null);
            this.f194893r = 0;
        } else if (i17 == 2) {
            this.f194893r = 0;
            sf2.x xVar = (sf2.x) U0(sf2.x.class);
            if (xVar != null) {
                xVar.g7();
            }
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i8(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicSelectPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicSelectPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(boolean z17) {
        if (((mm2.c1) P0(mm2.c1.class)).a8()) {
            mm2.c1 c1Var = (mm2.c1) P0(mm2.c1.class);
            c1Var.N1 = z17;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", c1Var.N1);
            this.f194891p.mo46557x60d69242(qo0.b.Z2, bundle);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r2.P() ? false : true) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(yz5.a r8) {
        /*
            r7 = this;
            r0 = 0
            r7.f194893r = r0
            r7.f194894s = r8
            android.view.ViewGroup r8 = r7.f446856d
            android.content.Context r8 = r8.getContext()
            boolean r1 = r8 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r1 == 0) goto L12
            androidx.appcompat.app.AppCompatActivity r8 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r8
            goto L13
        L12:
            r8 = 0
        L13:
            if (r8 != 0) goto L16
            goto L48
        L16:
            r1 = 1
            r7.t1(r1)
            com.tencent.mm.plugin.finder.live.widget.n7 r2 = r7.f194892q
            if (r2 == 0) goto L27
            boolean r2 = r2.P()
            if (r2 != 0) goto L25
            r0 = r1
        L25:
            if (r0 == 0) goto L3c
        L27:
            com.tencent.mm.plugin.finder.live.widget.n7 r0 = new com.tencent.mm.plugin.finder.live.widget.n7
            r0.<init>(r8, r7)
            r7.f194892q = r0
            com.tencent.mm.plugin.finder.live.plugin.j8 r8 = new com.tencent.mm.plugin.finder.live.plugin.j8
            r8.<init>(r7)
            r0.N = r8
            com.tencent.mm.plugin.finder.live.plugin.k8 r8 = new com.tencent.mm.plugin.finder.live.plugin.k8
            r8.<init>(r7)
            r0.P = r8
        L3c:
            com.tencent.mm.plugin.finder.live.widget.n7 r1 = r7.f194892q
            if (r1 == 0) goto L48
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 7
            r6 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(r1, r2, r3, r4, r5, r6)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l8.u1(yz5.a):void");
    }
}
