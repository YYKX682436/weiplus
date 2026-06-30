package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes14.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 f241507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f241508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f241509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ny4.c f241510g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var, int i17, int i18, ny4.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f241507d = t0Var;
        this.f241508e = i17;
        this.f241509f = i18;
        this.f241510g = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r0(this.f241507d, this.f241508e, this.f241509f, this.f241510g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            com.tencent.mm.plugin.scanner.view.t0 r9 = r8.f241507d
            android.view.View r0 = r9.f241523t
            r1 = 0
            if (r0 == 0) goto L11
            int r0 = r0.getWidth()
            goto L12
        L11:
            r0 = r1
        L12:
            float r0 = (float) r0
            android.view.View r2 = r9.f241523t
            if (r2 == 0) goto L1b
            int r1 = r2.getHeight()
        L1b:
            float r1 = (float) r1
            ny4.c r2 = r8.f241510g
            ny4.b r3 = r2.f422982c
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            if (r3 == 0) goto L3b
            ny4.b r6 = r2.f422981b
            if (r6 == 0) goto L33
            float r3 = r9.s(r3, r6)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r3)
            goto L34
        L33:
            r6 = r5
        L34:
            if (r6 == 0) goto L3b
            float r3 = r6.floatValue()
            goto L3c
        L3b:
            r3 = r4
        L3c:
            ny4.b r6 = r2.f422982c
            if (r6 == 0) goto L56
            ny4.b r7 = r2.f422981b
            if (r7 == 0) goto L4f
            float r6 = r6.f422978a
            float r7 = r7.f422978a
            float r6 = r6 - r7
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r6)
            goto L50
        L4f:
            r7 = r5
        L50:
            if (r7 == 0) goto L56
            float r4 = r7.floatValue()
        L56:
            ny4.b r6 = r2.f422982c
            if (r6 == 0) goto L6e
            ny4.b r2 = r2.f422981b
            if (r2 == 0) goto L69
            float r5 = r6.f422979b
            float r2 = r2.f422979b
            float r5 = r5 - r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r5 = r2
        L69:
            if (r5 == 0) goto L6e
            r5.floatValue()
        L6e:
            float r4 = r4 / r3
            double r2 = (double) r4
            java.lang.Math.acos(r2)
            java.lang.String r9 = r9.f241518p
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "viewHeight="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ", viewWidth="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r0)
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
