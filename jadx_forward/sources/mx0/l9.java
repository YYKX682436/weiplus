package mx0;

/* loaded from: classes5.dex */
public final class l9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413669e = c10977x8e40eced;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.l9(this.f413669e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.l9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[RETURN] */
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
            int r1 = r13.f413668d
            r2 = 0
            r3 = 2
            jz5.f0 r4 = jz5.f0.f384359a
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout r5 = r13.f413669e
            r6 = 1
            if (r1 == 0) goto L21
            if (r1 == r6) goto L1d
            if (r1 != r3) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L71
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L3c
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            bs0.j r7 = r5.f151085q
            if (r7 == 0) goto L3f
            yt3.x3 r14 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced.X(r5)
            int r10 = r14.f547252f
            r11 = 0
            r13.f413668d = r6
            r8 = 0
            r9 = 1920(0x780, float:2.69E-42)
            r12 = r13
            java.lang.Object r14 = r7.y(r8, r9, r10, r11, r12)
            if (r14 != r0) goto L3c
            return r0
        L3c:
            jz5.l r14 = (jz5.l) r14
            goto L40
        L3f:
            r14 = r2
        L40:
            if (r14 != 0) goto L43
            return r4
        L43:
            java.lang.Object r1 = r14.f384366d
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L71
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r5.f151075J
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            java.lang.String r1 = r1.D
            java.lang.Object r14 = r14.f384367e     // Catch: java.io.IOException -> L6a
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14     // Catch: java.io.IOException -> L6a
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.io.IOException -> L6a
            r8 = 100
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(r14, r8, r7, r1, r6)     // Catch: java.io.IOException -> L6a
            kz5.p0 r14 = kz5.p0.f395529d
            r13.f413668d = r3
            java.lang.Object r14 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced.h0(r5, r1, r2, r14, r13)
            if (r14 != r0) goto L71
            return r0
        L6a:
            java.lang.String r14 = "MicroMsg.ShootComposingPluginLayout"
            java.lang.String r0 = "save picture error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r14, r0)
        L71:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.l9.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
