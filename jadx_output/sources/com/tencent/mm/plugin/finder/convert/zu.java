package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes3.dex */
public final class zu extends in5.r {
    static {
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        fVar.f464083g = com.tencent.mm.R.raw.finder_filled_activity;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        fVar.f464082f = t70Var.k2();
        fVar.f464081e = t70Var.l2();
        fVar.f464086j = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        fVar.a();
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b8m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dc, code lost:
    
        if (r10 == null) goto L30;
     */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r9, in5.c r10, int r11, int r12, boolean r13, java.util.List r14) {
        /*
            r8 = this;
            so2.x r10 = (so2.x) r10
            java.lang.String r11 = "holder"
            kotlin.jvm.internal.o.g(r9, r11)
            java.lang.String r11 = "item"
            kotlin.jvm.internal.o.g(r10, r11)
            r11 = 2131319604(0x7f095b34, float:1.8257779E38)
            android.view.View r11 = r9.p(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r12 = 2131319606(0x7f095b36, float:1.8257783E38)
            android.view.View r12 = r9.p(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r13 = 2131319608(0x7f095b38, float:1.8257787E38)
            android.view.View r13 = r9.p(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 2131319607(0x7f095b37, float:1.8257785E38)
            android.view.View r14 = r9.p(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r45.e21 r10 = r10.f410694d
            r0 = 5
            java.lang.String r1 = r10.getString(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L44
            int r1 = r1.length()
            if (r1 != 0) goto L42
            goto L44
        L42:
            r1 = r3
            goto L45
        L44:
            r1 = r2
        L45:
            r4 = 8
            if (r1 == 0) goto L50
            r12.setVisibility(r3)
            r11.setVisibility(r4)
            goto L77
        L50:
            mn2.g1 r1 = mn2.g1.f329975a
            vo0.d r5 = r1.e()
            mn2.q3 r6 = new mn2.q3
            java.lang.String r0 = r10.getString(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = ""
        L60:
            com.tencent.mm.plugin.finder.storage.y90 r7 = com.tencent.mm.plugin.finder.storage.y90.f128355e
            r6.<init>(r0, r7)
            kotlin.jvm.internal.o.d(r11)
            mn2.f1 r0 = mn2.f1.f329953d
            yo0.i r0 = r1.h(r0)
            r5.c(r6, r11, r0)
            r11.setVisibility(r3)
            r12.setVisibility(r4)
        L77:
            r11 = 17
            long r11 = r10.getLong(r11)
            boolean r11 = hc2.a0.c(r11)
            r12 = 2
            if (r11 == 0) goto Lad
            android.content.Context r11 = r9.f293121e
            android.content.res.Resources r11 = r11.getResources()
            java.lang.Object[] r0 = new java.lang.Object[r12]
            com.tencent.mm.protobuf.f r1 = r10.getCustom(r2)
            com.tencent.mm.protocal.protobuf.FinderContact r1 = (com.tencent.mm.protocal.protobuf.FinderContact) r1
            if (r1 == 0) goto L99
            java.lang.String r1 = r1.getNickname()
            goto L9a
        L99:
            r1 = 0
        L9a:
            r0[r3] = r1
            java.lang.String r1 = r10.getString(r12)
            r0[r2] = r1
            r1 = 2131761586(0x7f1019b2, float:1.9154225E38)
            java.lang.String r11 = r11.getString(r1, r0)
            r13.setText(r11)
            goto Lb4
        Lad:
            java.lang.String r11 = r10.getString(r12)
            r13.setText(r11)
        Lb4:
            r11 = 7
            int r11 = r10.getInteger(r11)
            java.lang.String r11 = com.tencent.mm.plugin.finder.assist.w2.g(r12, r11)
            r13 = 18
            com.tencent.mm.protobuf.f r10 = r10.getCustom(r13)
            r45.h21 r10 = (r45.h21) r10
            if (r10 == 0) goto Lde
            java.lang.String r10 = r10.getString(r12)
            if (r10 == 0) goto Lde
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            if (r10 != 0) goto Lf4
        Lde:
            android.view.View r9 = r9.itemView
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131761581(0x7f1019ad, float:1.9154215E38)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r10 = r9.getString(r10, r11)
            java.lang.String r9 = "getString(...)"
            kotlin.jvm.internal.o.f(r10, r9)
        Lf4:
            r14.setText(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.zu.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
