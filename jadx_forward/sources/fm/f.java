package fm;

/* loaded from: classes13.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f345515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm.h f345516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f345517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345518g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(fm.h hVar, long j17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f345516e = hVar;
        this.f345517f = j17;
        this.f345518g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fm.f(this.f345516e, this.f345517f, this.f345518g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fm.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
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
            int r1 = r10.f345515d
            jz5.f0 r2 = jz5.f0.f384359a
            java.lang.String r3 = "mm_base_string_resource_96b2c56e4056b923191227d71602c0ce"
            java.lang.String r4 = "ilinkres_9f0a6b36"
            java.lang.String r5 = "BaseStringResFeatureService"
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L26
            if (r1 == r7) goto L22
            if (r1 != r6) goto L1a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L95
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L6a
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            long r8 = r10.f345517f
            fm.h r11 = r10.f345516e
            r11.f345526f = r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r8 = "start check resource: "
            r1.<init>(r8)
            gm0.m r8 = gm0.j1.b()
            boolean r8 = r8.n()
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r1)
            gm0.m r1 = gm0.j1.b()
            boolean r1 = r1.n()
            if (r1 == 0) goto L87
            java.lang.Class<com.tencent.mm.udr.d0> r11 = com.p314xaae8f345.mm.udr.d0.class
            i95.m r11 = i95.n0.c(r11)
            com.tencent.mm.udr.d0 r11 = (com.p314xaae8f345.mm.udr.d0) r11
            k65.l r1 = k65.l.f386150a
            k65.k[] r1 = k65.k.f386149d
            r10.f345515d = r7
            fa5.j r11 = (fa5.j) r11
            java.lang.Object r11 = r11.wi(r4, r3, r10)
            if (r11 != r0) goto L6a
            return r0
        L6a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L95
            java.lang.Class<com.tencent.mm.udr.e0> r11 = com.p314xaae8f345.mm.udr.e0.class
            i95.m r11 = i95.n0.c(r11)
            com.tencent.mm.udr.e0 r11 = (com.p314xaae8f345.mm.udr.e0) r11
            k65.l r0 = k65.l.f386150a
            k65.k[] r0 = k65.k.f386149d
            com.tencent.mm.udr.a1 r11 = (com.p314xaae8f345.mm.udr.a1) r11
            com.tencent.wechat.aff.udr.x r11 = r11.Ui(r4, r3)
            if (r11 == 0) goto L95
            return r2
        L87:
            fm.a[] r1 = fm.a.f345494d
            r10.f345515d = r6
            java.lang.String r1 = r10.f345518g
            r3 = 4
            java.lang.Object r11 = r11.wi(r1, r3, r10)
            if (r11 != r0) goto L95
            return r0
        L95:
            java.lang.String r11 = "forceCheckBaseResource downloadRes null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fm.f.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
