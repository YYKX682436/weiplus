package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class e extends com.tencent.mm.plugin.appbrand.page.mc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.a f86550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.appbrand.page.a aVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.page.p8 p8Var) {
        super(v5Var, p8Var);
        this.f86550d = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r1 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
    
        if (r1 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006d, code lost:
    
        r2 = r3;
     */
    @Override // ni1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            com.tencent.mm.plugin.appbrand.page.a r0 = r8.f86550d
            ze.n r1 = r0.J()
            k91.r r1 = r1.m0()
            boolean r1 = r1.g()
            ze.n r2 = r0.J()
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r2 = r2.u0()
            k91.z3 r2 = r2.r()
            k91.z3 r3 = k91.z3.TRANSPARENT
            r4 = 0
            if (r2 != r3) goto L21
            r0 = r4
            goto L36
        L21:
            android.content.Context r0 = r0.I()
            if (r1 == 0) goto L2b
            r2 = 2131099858(0x7f0600d2, float:1.7812081E38)
            goto L2e
        L2b:
            r2 = 2131100297(0x7f060289, float:1.7812971E38)
        L2e:
            int r0 = b3.l.getColor(r0, r2)
            int r0 = ik1.w.l(r10)     // Catch: java.lang.Exception -> L36
        L36:
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            ni1.g r2 = ni1.g.LIGHT
            ni1.g r3 = ni1.g.DARK
            if (r10 == 0) goto L43
            if (r1 == 0) goto L6d
            goto L6e
        L43:
            ni1.g[] r10 = ni1.g.values()
            int r5 = r10.length
        L48:
            if (r4 >= r5) goto L5f
            r6 = r10[r4]
            java.lang.String r7 = r6.name()
            java.lang.String r7 = r7.toLowerCase()
            boolean r7 = u46.l.d(r7, r9)
            if (r7 == 0) goto L5c
            r2 = r6
            goto L6e
        L5c:
            int r4 = r4 + 1
            goto L48
        L5f:
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "Luggage.AppBrandPageViewPullDownExtension.BackgroundTextStyle"
            java.lang.String r4 = "fromString(%s), unrecognized"
            com.tencent.mars.xlog.Log.e(r10, r4, r9)
            if (r1 == 0) goto L6d
            goto L6e
        L6d:
            r2 = r3
        L6e:
            r8.h(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.e.b(java.lang.String, java.lang.String):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.mc, ni1.h
    public void h(ni1.g gVar, int i17) {
        super.h(gVar, i17);
        com.tencent.mm.plugin.appbrand.page.a aVar = this.f86550d;
        if (aVar.F() == null) {
            return;
        }
        ((com.tencent.luggage.sdk.jsapi.component.b) aVar.F()).m(new com.tencent.mm.plugin.appbrand.page.d(this, i17));
    }
}
