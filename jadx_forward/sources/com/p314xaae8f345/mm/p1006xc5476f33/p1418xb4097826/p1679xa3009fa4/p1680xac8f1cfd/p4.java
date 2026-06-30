package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class p4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f217040d;

    /* renamed from: e, reason: collision with root package name */
    public int f217041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f217042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.hz0 f217043g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.hz0 f217044h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f217045i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f217046m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4 f217047n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(java.lang.String str, r45.hz0 hz0Var, r45.hz0 hz0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4 q4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f217042f = str;
        this.f217043g = hz0Var;
        this.f217044h = hz0Var2;
        this.f217045i = f0Var;
        this.f217046m = f0Var2;
        this.f217047n = q4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p4(this.f217042f, this.f217043g, this.f217044h, this.f217045i, this.f217046m, this.f217047n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f217041e
            r2 = 0
            com.tencent.mm.plugin.finder.viewmodel.component.q4 r3 = r10.f217047n
            r4 = 2
            r5 = 3
            r6 = 1
            if (r1 == 0) goto L30
            if (r1 == r6) goto L26
            if (r1 == r4) goto L1f
            if (r1 != r5) goto L17
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lce
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            java.lang.Object r1 = r10.f217040d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lb0
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            kotlin.Result r11 = (p3321xbce91901.C29043x91b2b43d) r11
            java.lang.Object r11 = r11.getValue()
            goto L92
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            g92.b r11 = g92.b.f351302e
            m92.a r1 = new m92.a
            com.tencent.mm.plugin.finder.ui.a3 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.H1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "FinderCreateUser_"
            r7.<init>(r8)
            long r8 = java.lang.System.nanoTime()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r1.<init>(r7)
            java.lang.String r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4.f217190h
            java.lang.String r8 = "<set-?>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r8)
            r1.f406501b = r7
            java.lang.String r7 = ""
            r1.f406502c = r7
            java.lang.String r7 = r10.f217042f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r8)
            r1.f406503d = r7
            r45.hz0 r7 = r10.f217043g
            r1.f406504e = r7
            r45.hz0 r7 = r10.f217044h
            r1.f406505f = r7
            kotlin.jvm.internal.f0 r7 = r10.f217045i
            int r7 = r7.f391649d
            r1.f406506g = r7
            kotlin.jvm.internal.f0 r7 = r10.f217046m
            int r7 = r7.f391649d
            r1.f406507h = r7
            r1.f406508i = r6
            r7 = 0
            r1.f406509j = r7
            r45.fa0 r8 = new r45.fa0
            r8.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r8.set(r7, r9)
            r1.f406510k = r8
            r10.f217041e = r6
            java.lang.Object r11 = r11.D4(r1, r10)
            if (r11 != r0) goto L92
            return r0
        L92:
            r1 = r11
            boolean r11 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(r1)
            if (r11 == 0) goto Lb0
            r11 = r1
            r45.r01 r11 = (r45.r01) r11
            kotlinx.coroutines.p0 r6 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r6 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            com.tencent.mm.plugin.finder.viewmodel.component.n4 r7 = new com.tencent.mm.plugin.finder.viewmodel.component.n4
            r7.<init>(r11, r3, r2)
            r10.f217040d = r1
            r10.f217041e = r4
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r6, r7, r10)
            if (r11 != r0) goto Lb0
            return r0
        Lb0:
            java.lang.Throwable r11 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r1)
            if (r11 == 0) goto Lce
            boolean r4 = r11 instanceof rm0.j
            if (r4 == 0) goto Lce
            kotlinx.coroutines.p0 r4 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r4 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            com.tencent.mm.plugin.finder.viewmodel.component.o4 r6 = new com.tencent.mm.plugin.finder.viewmodel.component.o4
            r6.<init>(r3, r11, r2)
            r10.f217040d = r1
            r10.f217041e = r5
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r4, r6, r10)
            if (r11 != r0) goto Lce
            return r0
        Lce:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
