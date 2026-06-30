package ku3;

/* loaded from: classes10.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f393789d;

    /* renamed from: e, reason: collision with root package name */
    public int f393790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 f393791f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 c17028xc20c4c47, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f393791f = c17028xc20c4c47;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ku3.i1(this.f393791f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ku3.i1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5 A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r13.f393790e
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout r7 = r13.f393791f
            if (r1 == 0) goto L2e
            if (r1 == r6) goto L2a
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto Lc6
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.f393789d
            hu3.v0 r1 = (hu3.v0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L9f
        L2a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L4a
        L2e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            hu3.n0 r14 = r7.P
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r7.getConfigProvider()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            java.lang.String r1 = r1.D
            java.lang.String r8 = "inputPhotoPath"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r8)
            r13.f393790e = r6
            java.lang.Object r14 = r14.k(r1, r13)
            if (r14 != r0) goto L4a
            return r0
        L4a:
            r1 = r14
            hu3.v0 r1 = (hu3.v0) r1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r8 = "take picture "
            r14.<init>(r8)
            int r8 = r1.f366742a
            r14.append(r8)
            java.lang.String r14 = r14.toString()
            java.lang.String r8 = "MicroMsg.ProfessionalCameraKitPluginLayout"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r14)
            int r14 = r1.f366742a
            if (r14 != 0) goto Lc6
            int r14 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47.f237389x1
            boolean r14 = r7.getEnableLandscape()
            r8 = 0
            if (r14 == 0) goto L72
            r14 = r8
            goto L7d
        L72:
            yt3.x3 r14 = r7.getOrientationPlugin()
            int r14 = r14.f547252f
            int r14 = -r14
            int r14 = r14 + 360
            int r14 = r14 % 360
        L7d:
            ct0.b r9 = r1.f366743b
            if (r9 == 0) goto L84
            java.lang.String r10 = r9.f303746j
            goto L85
        L84:
            r10 = r5
        L85:
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG
            if (r9 == 0) goto L8c
            java.lang.String r9 = r9.f303746j
            goto L8d
        L8c:
            r9 = r5
        L8d:
            r12 = 100
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.y0(r10, r14, r11, r12, r9)
            r13.f393789d = r1
            r13.f393790e = r4
            ku3.l5 r14 = r7.E
            java.lang.Object r14 = r14.a(r8, r8, r13)
            if (r14 != r0) goto L9f
            return r0
        L9f:
            int r14 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47.f237389x1
            it3.y r14 = r7.getNavigator()
            if (r14 == 0) goto Lae
            ct0.b r1 = r1.f366743b
            jt3.h r14 = (jt3.h) r14
            r14.e(r6, r1)
        Lae:
            r13.f393789d = r5
            r13.f393790e = r3
            kotlinx.coroutines.p0 r14 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r14 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            ku3.n1 r1 = new ku3.n1
            r1.<init>(r7, r5)
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.l.g(r14, r1, r13)
            if (r14 != r0) goto Lc2
            goto Lc3
        Lc2:
            r14 = r2
        Lc3:
            if (r14 != r0) goto Lc6
            return r0
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ku3.i1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
