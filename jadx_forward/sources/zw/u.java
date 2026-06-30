package zw;

/* loaded from: classes7.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f558075d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f558075d = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zw.u(this.f558075d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zw.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
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
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            zw.v r1 = zw.v.f558076a
            java.lang.String r2 = r0.f558075d
            java.lang.String r3 = r1.b(r2)
            java.lang.String r6 = r1.c(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = zw.v.f558079d
            r1.append(r4)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.Map r10 = zw.v.f558077b
            r5 = r10
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.util.Set r5 = r5.keySet()
            boolean r5 = r5.contains(r2)
            jz5.f0 r11 = jz5.f0.f384359a
            java.lang.String r12 = " md5:"
            java.lang.String r13 = "MicroMsg.BizSelectPhotoCompressHelper"
            if (r5 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "preCompress has deal! path:"
            r1.<init>(r4)
            r1.append(r2)
            r1.append(r12)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r13, r1)
            return r11
        L52:
            j62.e r5 = j62.e.g()
            com.tencent.mm.repairer.config.newlife.RepairerConfigNewLifePostUseMaxShort r7 = new com.tencent.mm.repairer.config.newlife.RepairerConfigNewLifePostUseMaxShort
            r7.<init>()
            int r5 = r5.c(r7)
            if (r5 == 0) goto L6e
            r7 = 1
            if (r5 == r7) goto L6b
            r7 = 2
            if (r5 == r7) goto L68
            goto L6e
        L68:
            r5 = 2160(0x870, float:3.027E-42)
            goto L70
        L6b:
            r5 = 1440(0x5a0, float:2.018E-42)
            goto L70
        L6e:
            r5 = 1080(0x438, float:1.513E-42)
        L70:
            r9 = r5
            java.lang.Class<fe0.o4> r5 = fe0.o4.class
            i95.m r5 = i95.n0.c(r5)
            fe0.o4 r5 = (fe0.o4) r5
            java.lang.String r7 = r0.f558075d
            r8 = 0
            r14 = 0
            ee0.v4 r5 = (ee0.v4) r5
            r5.getClass()
            java.lang.String r15 = "createPic"
            java.lang.String r5 = "com.tencent.mm.feature.sns.SnsUtilService"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r15, r5)
            r16 = r5
            r5 = r7
            r7 = r8
            r8 = r14
            boolean r4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.P0(r4, r5, r6, r7, r8, r9)
            r5 = r16
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r15, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "preCompress:"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r6 = " path:"
            r5.append(r6)
            r5.append(r2)
            r5.append(r12)
            r5.append(r3)
            java.lang.String r3 = " preCompressPath:"
            r5.append(r3)
            r5.append(r1)
            java.lang.String r3 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r13, r3)
            if (r4 == 0) goto Lc4
            r10.put(r2, r1)
        Lc4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.u.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
