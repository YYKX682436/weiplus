package rt1;

/* loaded from: classes7.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f481026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 f481027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f481028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 activityC13028x321e1ca7, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481027e = activityC13028x321e1ca7;
        this.f481028f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rt1.w(this.f481027e, this.f481028f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt1.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041 A[Catch: f -> 0x002c, TryCatch #0 {f -> 0x002c, blocks: (B:15:0x0028, B:20:0x0031, B:22:0x0035, B:27:0x0041, B:30:0x004f), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f A[Catch: f -> 0x002c, TRY_LEAVE, TryCatch #0 {f -> 0x002c, blocks: (B:15:0x0028, B:20:0x0031, B:22:0x0035, B:27:0x0041, B:30:0x004f), top: B:2:0x000e }] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f481026d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 4
            r4 = 3
            r5 = 2
            java.lang.String r6 = r9.f481028f
            r7 = 1
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI r8 = r9.f481027e
            if (r1 == 0) goto L2e
            if (r1 == r7) goto L28
            if (r1 == r5) goto L28
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L70
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L7f
        L28:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: qt1.f -> L2c
            goto L62
        L2c:
            r10 = move-exception
            goto L71
        L2e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.String r10 = r8.f176146h     // Catch: qt1.f -> L2c
            if (r10 == 0) goto L3e
            int r10 = r10.length()     // Catch: qt1.f -> L2c
            if (r10 != 0) goto L3c
            goto L3e
        L3c:
            r10 = 0
            goto L3f
        L3e:
            r10 = r7
        L3f:
            if (r10 == 0) goto L4f
            qt1.d r10 = new qt1.d     // Catch: qt1.f -> L2c
            r10.<init>(r6)     // Catch: qt1.f -> L2c
            r9.f481026d = r7     // Catch: qt1.f -> L2c
            java.lang.Object r10 = r10.e(r9)     // Catch: qt1.f -> L2c
            if (r10 != r0) goto L62
            return r0
        L4f:
            qt1.k r10 = new qt1.k     // Catch: qt1.f -> L2c
            java.lang.String r1 = r8.f176146h     // Catch: qt1.f -> L2c
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)     // Catch: qt1.f -> L2c
            r10.<init>(r1, r6)     // Catch: qt1.f -> L2c
            r9.f481026d = r5     // Catch: qt1.f -> L2c
            java.lang.Object r10 = r10.e(r9)     // Catch: qt1.f -> L2c
            if (r10 != r0) goto L62
            return r0
        L62:
            rt1.v r10 = new rt1.v
            r10.<init>(r8, r6)
            r9.f481026d = r3
            java.lang.Object r10 = st1.g.d(r10, r9)
            if (r10 != r0) goto L70
            return r0
        L70:
            return r2
        L71:
            rt1.u r1 = new rt1.u
            r1.<init>(r10, r8)
            r9.f481026d = r4
            java.lang.Object r10 = st1.g.d(r1, r9)
            if (r10 != r0) goto L7f
            return r0
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rt1.w.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
