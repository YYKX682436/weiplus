package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class y00 extends com.tencent.mm.plugin.finder.feed.a1 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y00(com.tencent.mm.ui.MMActivity r10, int r11, int r12, boolean r13, int r14, boolean r15, int r16, kotlin.jvm.internal.i r17) {
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
            kotlin.jvm.internal.o.g(r10, r0)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.y00.<init>(com.tencent.mm.ui.MMActivity, int, int, boolean, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        r45.vx0 vx0Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f107156e.getSize()) {
            return;
        }
        java.lang.Object obj = z().f107156e.getDataListJustForAdapter().get(a07);
        java.lang.String str = null;
        ms2.b bVar = obj instanceof ms2.b ? (ms2.b) obj : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
        sb6.append(a07);
        sb6.append(" id:");
        if (bVar != null && (vx0Var = bVar.f330968d) != null) {
            str = vx0Var.getString(14);
        }
        sb6.append(str);
        sb6.append(", pos:");
        sb6.append(a07);
        com.tencent.mars.xlog.Log.i("TingAudioCollectionViewCallback", sb6.toString());
        if (bVar != null) {
            r45.dg4 dg4Var = new r45.dg4();
            dg4Var.f372417d = bVar.f330968d.getString(14);
            dg4Var.f372424n = 9;
            dg4Var.K = true;
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.assist.i0.gl((com.tencent.mm.plugin.finder.assist.i0) c17, this.f106174d, ms2.a.a(dg4Var), bw5.ar0.TingScene_FinderProfileAudio, false, this.f106177g, 8, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        return new com.tencent.mm.plugin.finder.feed.x00();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new androidx.recyclerview.widget.GridLayoutManager(context, 2);
    }
}
