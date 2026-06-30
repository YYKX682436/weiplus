package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f69901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.c1 f69902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f69903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f69904g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(androidx.paging.compose.e eVar, com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var, yz5.p pVar, yz5.p pVar2) {
        super(4);
        this.f69901d = eVar;
        this.f69902e = c1Var;
        this.f69903f = pVar;
        this.f69904g = pVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r14 == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (r8 == r2) goto L27;
     */
    @Override // yz5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            r10 = this;
            f0.x r11 = (f0.x) r11
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            n0.o r13 = (n0.o) r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            java.lang.String r0 = "$this$items"
            kotlin.jvm.internal.o.g(r11, r0)
            r11 = r14 & 112(0x70, float:1.57E-43)
            if (r11 != 0) goto L28
            r11 = r13
            n0.y0 r11 = (n0.y0) r11
            boolean r11 = r11.c(r12)
            if (r11 == 0) goto L25
            r11 = 32
            goto L27
        L25:
            r11 = 16
        L27:
            r14 = r14 | r11
        L28:
            r11 = r14 & 721(0x2d1, float:1.01E-42)
            r14 = 144(0x90, float:2.02E-43)
            if (r11 != r14) goto L3d
            r11 = r13
            n0.y0 r11 = (n0.y0) r11
            boolean r14 = r11.v()
            if (r14 != 0) goto L38
            goto L3d
        L38:
            r11.O()
            goto Lbe
        L3d:
            java.lang.Object r11 = n0.e1.f333492a
            androidx.paging.compose.e r11 = r10.f69901d
            java.lang.Object r11 = r11.b(r12)
            r0 = r11
            com.tencent.mm.mj_template.sns.compose.widget.m5 r0 = (com.tencent.mm.mj_template.sns.compose.widget.m5) r0
            if (r0 != 0) goto L4b
            goto Lbe
        L4b:
            com.tencent.mm.mj_template.sns.compose.widget.c1 r11 = r10.f69902e
            float r1 = r11.b()
            com.tencent.mm.mj_template.sns.compose.widget.x2 r3 = new com.tencent.mm.mj_template.sns.compose.widget.x2
            r3.<init>(r11)
            com.tencent.mm.mj_template.sns.compose.widget.y2 r5 = new com.tencent.mm.mj_template.sns.compose.widget.y2
            r5.<init>(r11)
            com.tencent.mm.mj_template.sns.compose.widget.z2 r6 = new com.tencent.mm.mj_template.sns.compose.widget.z2
            r6.<init>(r11)
            r7 = r13
            n0.y0 r7 = (n0.y0) r7
            r11 = -500843170(0xffffffffe225bd5e, float:-7.643395E20)
            r7.U(r11)
            yz5.p r11 = r10.f69903f
            boolean r13 = r7.e(r11)
            boolean r14 = r7.c(r12)
            r13 = r13 | r14
            java.lang.Object r14 = r7.y()
            java.lang.Object r2 = n0.n.f333620a
            if (r13 != 0) goto L80
            int r13 = n0.o.f333629a
            if (r14 != r2) goto L88
        L80:
            com.tencent.mm.mj_template.sns.compose.widget.a3 r14 = new com.tencent.mm.mj_template.sns.compose.widget.a3
            r14.<init>(r11, r12)
            r7.g0(r14)
        L88:
            r11 = r14
            yz5.l r11 = (yz5.l) r11
            r13 = 0
            r7.o(r13)
            r14 = -500843019(0xffffffffe225bdf5, float:-7.6435015E20)
            r7.U(r14)
            yz5.p r14 = r10.f69904g
            boolean r4 = r7.e(r14)
            boolean r8 = r7.c(r12)
            r4 = r4 | r8
            java.lang.Object r8 = r7.y()
            if (r4 != 0) goto Laa
            int r4 = n0.o.f333629a
            if (r8 != r2) goto Lb2
        Laa:
            com.tencent.mm.mj_template.sns.compose.widget.b3 r8 = new com.tencent.mm.mj_template.sns.compose.widget.b3
            r8.<init>(r14, r12)
            r7.g0(r8)
        Lb2:
            r4 = r8
            yz5.l r4 = (yz5.l) r4
            r7.o(r13)
            r8 = 0
            r9 = 0
            r2 = r11
            com.tencent.mm.mj_template.sns.compose.widget.q4.k(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
        Lbe:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.compose.widget.c3.C(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
