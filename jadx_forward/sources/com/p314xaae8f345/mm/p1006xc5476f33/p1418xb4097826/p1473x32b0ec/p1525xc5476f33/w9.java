package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class w9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f196421d;

    /* renamed from: e, reason: collision with root package name */
    public final cm2.t f196422e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f196423f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f196424g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f196425h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f196426i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f196427m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f196428n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f196429o;

    public w9(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196421d = buContext;
        this.f196422e = tVar;
        this.f196423f = "FinderLiveAnchorRandomMicBubble";
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dmh, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f196424g = viewGroup;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.odb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        this.f196425h = textView;
        this.f196426i = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.cus);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.qz9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        this.f196427m = textView2;
        this.f196428n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s9(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public cm2.t A() {
        return this.f196422e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void U() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(cm2.e0 r12) {
        /*
            r11 = this;
            r45.gw1 r0 = r12.f124870v
            r1 = 2
            java.lang.String r0 = r0.m75945x2fec8307(r1)
            android.widget.TextView r1 = r11.f196425h
            r1.setText(r0)
            r45.gw1 r12 = r12.f124870v
            r0 = 3
            java.lang.String r1 = r12.m75945x2fec8307(r0)
            r2 = 1
            android.widget.TextView r3 = r11.f196426i
            r4 = 0
            if (r1 == 0) goto L36
            int r5 = r1.length()
            r6 = 0
            if (r5 <= 0) goto L22
            r5 = r2
            goto L23
        L22:
            r5 = r6
        L23:
            if (r5 == 0) goto L26
            goto L27
        L26:
            r1 = r4
        L27:
            if (r1 == 0) goto L36
            java.lang.String r12 = r12.m75945x2fec8307(r0)
            r3.setText(r12)
            r3.setVisibility(r6)
            jz5.f0 r12 = jz5.f0.f384359a
            goto L37
        L36:
            r12 = r4
        L37:
            if (r12 != 0) goto L3e
            r12 = 8
            r3.setVisibility(r12)
        L3e:
            ml2.q2 r12 = ml2.q2.K
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "report21054 op: "
            r0.<init>(r1)
            r1 = 40
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLiveMicReportUtil"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.lang.Class<ml2.j0> r0 = ml2.j0.class
            i95.m r0 = i95.n0.c(r0)
            ml2.j0 r0 = (ml2.j0) r0
            java.lang.String r1 = ""
            r3 = -1
            r0.Vj(r12, r1, r3, r3)
            com.tencent.mm.plugin.finder.live.plugin.t9 r12 = new com.tencent.mm.plugin.finder.live.plugin.t9
            r12.<init>(r11)
            android.widget.TextView r0 = r11.f196427m
            r0.setOnClickListener(r12)
            kotlinx.coroutines.r2 r12 = r11.f196429o
            if (r12 == 0) goto L79
            p3325xe03a0797.p3326xc267989b.p2.a(r12, r4, r2, r4)
        L79:
            gk2.e r12 = r11.f196421d
            yg2.b r5 = r12.f354008i
            kotlinx.coroutines.p0 r12 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r6 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r7 = 0
            com.tencent.mm.plugin.finder.live.plugin.u9 r8 = new com.tencent.mm.plugin.finder.live.plugin.u9
            r8.<init>(r11, r4)
            r9 = 2
            r10 = 0
            kotlinx.coroutines.r2 r12 = p3325xe03a0797.p3326xc267989b.l.d(r5, r6, r7, r8, r9, r10)
            r11.f196429o = r12
            jz5.g r12 = r11.f196428n
            jz5.n r12 = (jz5.n) r12
            java.lang.Object r12 = r12.mo141623x754a37bb()
            android.view.View r12 = (android.view.View) r12
            com.tencent.mm.plugin.finder.live.plugin.v9 r0 = new com.tencent.mm.plugin.finder.live.plugin.v9
            r0.<init>(r11)
            r12.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w9.a(cm2.e0):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int e0() {
        return com.p314xaae8f345.mm.R.id.eqy;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void f0(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.e0) {
            a((cm2.e0) data);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: getView */
    public android.view.View mo56902xfb86a31b() {
        return this.f196424g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.e0) {
            a((cm2.e0) data);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l0() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f196429o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int p0() {
        return com.p314xaae8f345.mm.R.id.hhj;
    }
}
