package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class mf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f200601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f200602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f200603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.of f200604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f200605h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(az2.f fVar, jz5.l lVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.of ofVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f200601d = fVar;
        this.f200602e = lVar;
        this.f200603f = context;
        this.f200604g = ofVar;
        this.f200605h = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mf(this.f200601d, this.f200602e, this.f200603f, this.f200604g, this.f200605h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mf mfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        mfVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r1 != null) goto L26;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            az2.f r8 = r7.f200601d
            r8.b()
            jz5.l r8 = r7.f200602e
            java.lang.Object r0 = r8.f384366d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            android.content.Context r2 = r7.f200603f
            if (r0 == 0) goto L35
            android.content.res.Resources r8 = r2.getResources()
            r0 = 2131763530(0x7f10214a, float:1.9158168E38)
            java.lang.String r8 = r8.getString(r0)
            db5.t7.h(r2, r8)
            com.tencent.mm.plugin.finder.live.widget.of r8 = r7.f200604g
            r8.f200831v = r1
            r8.f200832w = r1
            r8.getClass()
            r8.A()
            goto L9d
        L35:
            java.lang.Object r0 = r8.f384367e
            rm0.j r0 = (rm0.j) r0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L46
            r5 = -200201(0xfffffffffffcf1f7, float:NaN)
            int r0 = r0.f478958f
            if (r0 != r5) goto L46
            r0 = r3
            goto L47
        L46:
            r0 = r4
        L47:
            r5 = 2131763528(0x7f102148, float:1.9158164E38)
            if (r0 == 0) goto L92
            com.tencent.mm.ui.widget.dialog.u1 r0 = new com.tencent.mm.ui.widget.dialog.u1
            r0.<init>(r2)
            java.lang.Object r8 = r8.f384367e
            rm0.j r8 = (rm0.j) r8
            if (r8 == 0) goto L6a
            java.lang.String r8 = r8.f478959g
            if (r8 == 0) goto L6a
            int r6 = r8.length()
            if (r6 <= 0) goto L63
            r6 = r3
            goto L64
        L63:
            r6 = r4
        L64:
            if (r6 == 0) goto L67
            r1 = r8
        L67:
            if (r1 == 0) goto L6a
            goto L77
        L6a:
            android.content.res.Resources r8 = r2.getResources()
            java.lang.String r1 = r8.getString(r5)
            java.lang.String r8 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r8)
        L77:
            r0.g(r1)
            r0.a(r3)
            android.content.res.Resources r8 = r2.getResources()
            r1 = 2131763529(0x7f102149, float:1.9158166E38)
            java.lang.String r8 = r8.getString(r1)
            r0.n(r8)
            r0.r(r3)
            r0.q(r4)
            goto L9d
        L92:
            android.content.res.Resources r8 = r2.getResources()
            java.lang.String r8 = r8.getString(r5)
            db5.t7.g(r2, r8)
        L9d:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mf.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
