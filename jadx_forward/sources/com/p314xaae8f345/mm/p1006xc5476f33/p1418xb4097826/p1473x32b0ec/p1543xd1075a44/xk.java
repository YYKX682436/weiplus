package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class xk extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f201876d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f201877e;

    /* renamed from: f, reason: collision with root package name */
    public int f201878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl f201879g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201880h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f201881i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f201882m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f201883n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f201884o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201885p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f201886q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f201887r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f201888s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f201889t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl hlVar, java.lang.String str, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, java.util.LinkedList linkedList, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f201879g = hlVar;
        this.f201880h = str;
        this.f201881i = z17;
        this.f201882m = h0Var;
        this.f201883n = h0Var2;
        this.f201884o = h0Var3;
        this.f201885p = str2;
        this.f201886q = g0Var;
        this.f201887r = linkedList;
        this.f201888s = h0Var4;
        this.f201889t = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xk(this.f201879g, this.f201880h, this.f201881i, this.f201882m, this.f201883n, this.f201884o, this.f201885p, this.f201886q, this.f201887r, this.f201888s, this.f201889t, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xk) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7 A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f201878f
            r3 = 2
            r4 = 0
            com.tencent.mm.plugin.finder.live.widget.hl r5 = r0.f201879g
            r6 = 1
            if (r2 == 0) goto L2a
            if (r2 == r6) goto L1e
            if (r2 != r3) goto L16
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            goto Lc8
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1e:
            java.lang.Object r2 = r0.f201877e
            kotlin.jvm.internal.h0 r2 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) r2
            java.lang.Object r7 = r0.f201876d
            xk2.c r7 = (xk2.c) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            goto L5a
        L2a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            com.tencent.mm.view.MMPAGView r2 = r5.f200106a
            java.lang.String r7 = r0.f201880h
            r2.mo82567x3e3ac3e8(r7)
            com.tencent.mm.view.MMPAGView r2 = r5.f200106a
            r2.d()
            boolean r2 = r0.f201881i
            if (r2 == 0) goto L5c
            xk2.c r7 = new xk2.c
            r7.<init>()
            kk4.c r2 = r7.f536551a
            kk4.f0 r2 = (kk4.f0) r2
            r2.mo100947xfd27780d(r4)
            r0.f201876d = r7
            kotlin.jvm.internal.h0 r2 = r0.f201882m
            r0.f201877e = r2
            r0.f201878f = r6
            java.lang.String r8 = r0.f201885p
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r2.f391656d = r7
        L5c:
            com.tencent.mm.view.MMPAGView r2 = r5.f200106a
            android.content.Context r2 = r2.getContext()
            java.lang.String r7 = "vibrator"
            java.lang.Object r15 = r2.getSystemService(r7)
            kotlin.jvm.internal.h0 r2 = r0.f201883n
            java.lang.Object r7 = r2.f391656d
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L7a
            int r7 = r7.length()
            if (r7 != 0) goto L78
            goto L7a
        L78:
            r7 = r4
            goto L7b
        L7a:
            r7 = r6
        L7b:
            if (r7 != 0) goto L9b
            kotlin.jvm.internal.h0 r7 = r0.f201884o
            java.lang.Object r8 = r7.f391656d
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L8b
            int r8 = r8.length()
            if (r8 != 0) goto L8c
        L8b:
            r4 = r6
        L8c:
            if (r4 != 0) goto L9b
            java.lang.Object r4 = r7.f391656d
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.f391656d
            java.lang.String r2 = (java.lang.String) r2
            com.tencent.mm.view.MMPAGView r5 = r5.f200106a
            r5.l(r4, r2)
        L9b:
            java.lang.String r2 = "FinderLiveGiftPlayPagWidget"
            java.lang.String r4 = "playFundingTaskAnim ready"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4)
            kotlinx.coroutines.p0 r2 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            com.tencent.mm.plugin.finder.live.widget.wk r4 = new com.tencent.mm.plugin.finder.live.widget.wk
            com.tencent.mm.plugin.finder.live.widget.hl r9 = r0.f201879g
            kotlin.jvm.internal.g0 r10 = r0.f201886q
            kotlin.jvm.internal.h0 r11 = r0.f201882m
            java.util.LinkedList r12 = r0.f201887r
            kotlin.jvm.internal.h0 r13 = r0.f201888s
            kotlinx.coroutines.y0 r14 = r0.f201889t
            r16 = 0
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r5 = 0
            r0.f201876d = r5
            r0.f201877e = r5
            r0.f201878f = r3
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.l.g(r2, r4, r0)
            if (r2 != r1) goto Lc8
            return r1
        Lc8:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xk.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
