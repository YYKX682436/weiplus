package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class i8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f182705d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f182706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 f182709h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f182710i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f182711m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f182707f = str;
        this.f182708g = str2;
        this.f182709h = y8Var;
        this.f182710i = i17;
        this.f182711m = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i8 i8Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i8(this.f182707f, this.f182708g, this.f182709h, this.f182710i, this.f182711m, interfaceC29045xdcb5ca57);
        i8Var.f182706e = obj;
        return i8Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7 A[RETURN] */
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
            int r1 = r12.f182705d
            jz5.f0 r2 = jz5.f0.f384359a
            java.lang.String r3 = r12.f182708g
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto Lc8
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L9b
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            java.lang.Object r13 = r12.f182706e
            kotlinx.coroutines.y0 r13 = (p3325xe03a0797.p3326xc267989b.y0) r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "[editTag] start, current thread = "
            r13.<init>(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            int r1 = rl.b.f478676a
            java.lang.String r1 = "MicroMsg.FavTopMenu"
            r6 = 0
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r13, r6)
            t72.b r13 = t72.b.f497573a
            java.lang.String r7 = r12.f182707f
            t72.a r13 = r13.f(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r13 == 0) goto L65
            r45.xo5 r1 = new r45.xo5
            r1.<init>()
            int r13 = r13.f68043xc8a07680
            r1.f471828d = r13
            r1.f471829e = r3
            r8.add(r1)
            goto L7b
        L65:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r9 = "[editTag] name = "
            r13.<init>(r9)
            r13.append(r7)
            java.lang.String r7 = ", can not find id"
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r13, r6)
        L7b:
            boolean r13 = r8.isEmpty()
            r13 = r13 ^ r5
            if (r13 == 0) goto Lc8
            java.lang.Class<o72.f5> r13 = o72.f5.class
            i95.m r13 = i95.n0.c(r13)
            o72.f5 r13 = (o72.f5) r13
            com.tencent.mm.plugin.fav.o r13 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.o) r13
            o72.z4 r13 = r13.uj()
            r12.f182705d = r5
            t72.l r13 = (t72.l) r13
            java.lang.Object r13 = r13.X6(r8, r12)
            if (r13 != r0) goto L9b
            return r0
        L9b:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            t72.b r1 = t72.b.f497573a
            t72.a r8 = r1.f(r3)
            if (r13 == 0) goto Lc8
            if (r8 != 0) goto Lac
            goto Lc8
        Lac:
            kotlinx.coroutines.p0 r13 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r13 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            com.tencent.mm.plugin.fav.ui.h8 r1 = new com.tencent.mm.plugin.fav.ui.h8
            com.tencent.mm.plugin.fav.ui.y8 r6 = r12.f182709h
            int r7 = r12.f182710i
            java.lang.String r9 = r12.f182708g
            int r10 = r12.f182711m
            r11 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.f182705d = r4
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r13, r1, r12)
            if (r13 != r0) goto Lc8
            return r0
        Lc8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i8.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
