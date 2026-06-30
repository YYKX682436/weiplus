package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class y00 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y00(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r10, int r11, int r12, boolean r13, int r14, boolean r15, int r16, p3321xbce91901.jvm.p3324x21ffc6bd.i r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r16 & 16
            if (r0 == 0) goto Lf
            r0 = -1
            r7 = r0
            goto L10
        Lf:
            r7 = r14
        L10:
            r0 = r16 & 32
            if (r0 == 0) goto L16
            r8 = r1
            goto L17
        L16:
            r8 = r15
        L17:
            java.lang.String r0 = "context"
            r1 = r10
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y00.<init>(com.tencent.mm.ui.MMActivity, int, int, boolean, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17) {
        r45.vx0 vx0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f188689e.m56393xfb854877()) {
            return;
        }
        java.lang.Object obj = z().f188689e.m56388xcaeb60d0().get(a07);
        java.lang.String str = null;
        ms2.b bVar = obj instanceof ms2.b ? (ms2.b) obj : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
        sb6.append(a07);
        sb6.append(" id:");
        if (bVar != null && (vx0Var = bVar.f412501d) != null) {
            str = vx0Var.m75945x2fec8307(14);
        }
        sb6.append(str);
        sb6.append(", pos:");
        sb6.append(a07);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TingAudioCollectionViewCallback", sb6.toString());
        if (bVar != null) {
            r45.dg4 dg4Var = new r45.dg4();
            dg4Var.f453950d = bVar.f412501d.m75945x2fec8307(14);
            dg4Var.f453957n = 9;
            dg4Var.K = true;
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.gl((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17, this.f187707d, ms2.a.a(dg4Var), bw5.ar0.TingScene_FinderProfileAudio, false, this.f187710g, 8, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void M() {
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f187707d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.String s(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View t() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 x() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x00();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager y(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 2);
    }
}
