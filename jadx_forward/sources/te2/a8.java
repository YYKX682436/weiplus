package te2;

/* loaded from: classes3.dex */
public final class a8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f499412d;

    /* renamed from: e, reason: collision with root package name */
    public int f499413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f499415g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(te2.p8 p8Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499414f = p8Var;
        this.f499415g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.a8(this.f499414f, this.f499415g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.a8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f499413e
            r3 = 0
            boolean r4 = r0.f499415g
            r5 = 0
            r6 = 2
            r7 = 1
            te2.p8 r8 = r0.f499414f
            if (r2 == 0) goto L2d
            if (r2 == r7) goto L22
            if (r2 != r6) goto L1a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            r2 = r17
            goto L73
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            java.lang.Object r2 = r0.f499412d
            te2.p8 r2 = (te2.p8) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            r9 = r2
            r2 = r17
            goto L48
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            java.lang.String r2 = r8.f499866y1
            boolean r2 = com.p314xaae8f345.mm.vfs.w6.j(r2)
            if (r2 == 0) goto L4b
            zl2.o0 r2 = zl2.o0.f555440a
            java.lang.String r9 = r8.f499866y1
            r0.f499412d = r8
            r0.f499413e = r7
            java.lang.Object r2 = r2.b(r9, r0)
            if (r2 != r1) goto L47
            return r1
        L47:
            r9 = r8
        L48:
            java.lang.String r2 = (java.lang.String) r2
            goto L4e
        L4b:
            java.lang.String r2 = r8.f499866y1
            r9 = r8
        L4e:
            r9.t7(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r9 = "REQUEST_CODE_CROP_IMAGE uploadImage result: "
            r2.<init>(r9)
            java.lang.String r9 = r8.f499866y1
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.String r9 = "FinderLiveNoticeQRCodeUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r2)
            if (r4 != 0) goto L80
            r0.f499412d = r5
            r0.f499413e = r6
            java.lang.Object r2 = te2.p8.T6(r8, r3, r0, r7, r5)
            if (r2 != r1) goto L73
            return r1
        L73:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            if (r1 == 0) goto L7c
            goto L80
        L7c:
            r8.Y6()
            goto Lbf
        L80:
            java.lang.String r1 = r8.f499847l1
            java.lang.String r2 = r8.f499866y1
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r2)
            if (r1 != 0) goto La9
            java.lang.Class<zy2.zb> r1 = zy2.zb.class
            i95.m r1 = i95.n0.c(r1)
            java.lang.String r2 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            r9 = r1
            zy2.zb r9 = (zy2.zb) r9
            ml2.y2 r10 = ml2.y2.f409793p
            java.lang.String r11 = ""
            te2.rc r1 = r8.A1
            java.lang.String r12 = r1.b()
            r13 = 0
            r14 = 8
            r15 = 0
            zy2.zb.qg(r9, r10, r11, r12, r13, r14, r15)
        La9:
            java.lang.String r1 = r8.f499866y1
            r8.f499847l1 = r1
            int r1 = r8.f499862x0
            r8.f499865y0 = r1
            if (r4 == 0) goto Lb7
            r1 = 3
            r8.E1 = r1
            goto Lb9
        Lb7:
            r8.E1 = r6
        Lb9:
            r8.r7(r7)
            r8.p7()
        Lbf:
            te2.p8.x7(r8, r3, r5, r6, r5)
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.a8.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
