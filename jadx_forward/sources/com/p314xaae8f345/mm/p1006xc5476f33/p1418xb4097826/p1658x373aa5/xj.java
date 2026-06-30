package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class xj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f214868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f214869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f214870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(long j17, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f214869e = j17;
        this.f214870f = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xj(this.f214869e, this.f214870f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xj) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008e  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r16) {
        /*
            r15 = this;
            r9 = r15
            pz5.a r10 = pz5.a.f440719d
            int r0 = r9.f214868d
            java.lang.String r11 = ""
            com.tencent.mm.ipcinvoker.r r12 = r9.f214870f
            r13 = 2
            r14 = 1
            if (r0 == 0) goto L26
            if (r0 == r14) goto L20
            if (r0 != r13) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r16)
            r0 = r16
            goto L8a
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r16)
            r0 = r16
            goto L52
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r16)
            java.lang.ref.WeakReference r0 = com.p314xaae8f345.mm.app.w.k()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L38
            goto L3a
        L38:
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
        L3a:
            r1 = r0
            zl2.b0 r0 = zl2.b0.f555196a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            java.lang.String r2 = ""
            long r3 = r9.f214869e
            java.lang.String r5 = ""
            r6 = 2
            r7 = 0
            r9.f214868d = r14
            r8 = r15
            java.lang.Object r0 = r0.h(r1, r2, r3, r5, r6, r7, r8)
            if (r0 != r10) goto L52
            return r10
        L52:
            r45.ea1 r0 = (r45.ea1) r0
            r1 = 0
            if (r0 == 0) goto L60
            r2 = 3
            int r2 = r0.m75939xb282bd08(r2)
            if (r2 != r14) goto L60
            r2 = r14
            goto L61
        L60:
            r2 = r1
        L61:
            if (r2 == 0) goto Lc4
            if (r0 == 0) goto L6c
            int r2 = r0.m75939xb282bd08(r13)
            if (r2 != r14) goto L6c
            goto L6d
        L6c:
            r14 = r1
        L6d:
            if (r14 == 0) goto Lc4
            java.lang.Class<s40.a1> r1 = s40.a1.class
            i95.m r1 = i95.n0.c(r1)
            s40.a1 r1 = (s40.a1) r1
            r2 = 6
            java.lang.String r0 = r0.m75945x2fec8307(r2)
            if (r0 != 0) goto L7f
            r0 = r11
        L7f:
            r9.f214868d = r13
            com.tencent.mm.feature.finder.live.z5 r1 = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) r1
            java.lang.Object r0 = r1.Di(r0, r15)
            if (r0 != r10) goto L8a
            return r10
        L8a:
            com.tencent.mm.protocal.protobuf.FinderObject r0 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) r0
            if (r0 == 0) goto L93
            long r1 = r0.m76784x5db1b11()
            goto L95
        L93:
            r1 = 0
        L95:
            java.lang.String r1 = pm0.v.u(r1)
            if (r0 == 0) goto La3
            java.lang.String r0 = r0.m76803x6c285d75()
            if (r0 != 0) goto La2
            goto La3
        La2:
            r11 = r0
        La3:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "feedId"
            r0.put(r2, r1)
            java.lang.String r1 = "nonceId"
            r0.put(r1, r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            com.tencent.mm.ipcinvoker.type.IPCString r1 = new com.tencent.mm.ipcinvoker.type.IPCString
            r1.<init>(r0)
            r12.a(r1)
            goto Lcc
        Lc4:
            com.tencent.mm.ipcinvoker.type.IPCString r0 = new com.tencent.mm.ipcinvoker.type.IPCString
            r0.<init>()
            r12.a(r0)
        Lcc:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xj.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
