package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class nm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f195182d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f195183e;

    /* renamed from: f, reason: collision with root package name */
    public int f195184f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn f195185g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195186h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f195187i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f195188m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195189n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f195190o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f195191p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f195192q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f195193r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn bnVar, java.lang.String str, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, java.util.LinkedList linkedList, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195185g = bnVar;
        this.f195186h = str;
        this.f195187i = z17;
        this.f195188m = h0Var;
        this.f195189n = str2;
        this.f195190o = g0Var;
        this.f195191p = linkedList;
        this.f195192q = h0Var2;
        this.f195193r = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nm(this.f195185g, this.f195186h, this.f195187i, this.f195188m, this.f195189n, this.f195190o, this.f195191p, this.f195192q, this.f195193r, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nm) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f195184f
            r2 = 2
            r3 = 1
            com.tencent.mm.plugin.finder.live.plugin.bn r4 = r12.f195185g
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L94
        L13:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1b:
            java.lang.Object r1 = r12.f195183e
            kotlin.jvm.internal.h0 r1 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) r1
            java.lang.Object r3 = r12.f195182d
            xk2.c r3 = (xk2.c) r3
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L59
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            com.tencent.mm.view.MMPAGView r13 = r4.f193585p
            java.lang.String r1 = r12.f195186h
            r13.mo82567x3e3ac3e8(r1)
            com.tencent.mm.view.MMPAGView r13 = r4.f193585p
            r13.d()
            boolean r13 = r12.f195187i
            if (r13 == 0) goto L5b
            xk2.c r13 = new xk2.c
            r13.<init>()
            kk4.c r1 = r13.f536551a
            kk4.f0 r1 = (kk4.f0) r1
            r5 = 0
            r1.mo100947xfd27780d(r5)
            r12.f195182d = r13
            kotlin.jvm.internal.h0 r1 = r12.f195188m
            r12.f195183e = r1
            r12.f195184f = r3
            java.lang.String r3 = r12.f195189n
            java.lang.Object r3 = r13.a(r3, r12)
            if (r3 != r0) goto L58
            return r0
        L58:
            r3 = r13
        L59:
            r1.f391656d = r3
        L5b:
            com.tencent.mm.view.MMPAGView r13 = r4.f193585p
            android.content.Context r13 = r13.getContext()
            java.lang.String r1 = "vibrator"
            java.lang.Object r10 = r13.getSystemService(r1)
            java.lang.String r13 = "Finder.FinderLiveGiftPlayPlugin"
            java.lang.String r1 = "playFundingTaskAnim ready"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r13, r1)
            kotlinx.coroutines.p0 r13 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r13 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            com.tencent.mm.plugin.finder.live.plugin.mm r1 = new com.tencent.mm.plugin.finder.live.plugin.mm
            com.tencent.mm.plugin.finder.live.plugin.bn r4 = r12.f195185g
            kotlin.jvm.internal.g0 r5 = r12.f195190o
            kotlin.jvm.internal.h0 r6 = r12.f195188m
            java.util.LinkedList r7 = r12.f195191p
            kotlin.jvm.internal.h0 r8 = r12.f195192q
            kotlinx.coroutines.y0 r9 = r12.f195193r
            r11 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = 0
            r12.f195182d = r3
            r12.f195183e = r3
            r12.f195184f = r2
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r13, r1, r12)
            if (r13 != r0) goto L94
            return r0
        L94:
            jz5.f0 r13 = jz5.f0.f384359a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nm.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
