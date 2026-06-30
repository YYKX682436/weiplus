package qf2;

/* loaded from: classes3.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f444095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.s3 f444096f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, qf2.s3 s3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444095e = f0Var;
        this.f444096f = s3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.r3(this.f444095e, this.f444096f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.r3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x002b). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f444094d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r8 = r7
            goto L2b
        Le:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L16:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r8 = r7
        L1a:
            kotlin.jvm.internal.f0 r1 = r8.f444095e
            int r1 = r1.f391649d
            if (r1 <= 0) goto L56
            r8.f444094d = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.k1.b(r3, r8)
            if (r1 != r0) goto L2b
            return r0
        L2b:
            kotlin.jvm.internal.f0 r1 = r8.f444095e
            int r3 = r1.f391649d
            int r3 = r3 + (-1)
            r1.f391649d = r3
            qf2.s3 r3 = r8.f444096f
            java.lang.String r4 = r3.f444109b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "countDown: "
            r5.<init>(r6)
            int r6 = r1.f391649d
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)
            qf2.a4 r3 = r3.f444111d
            if (r3 == 0) goto L1a
            int r1 = r1.f391649d
            wj2.j0 r3 = (wj2.j0) r3
            r3.a(r1)
            goto L1a
        L56:
            qf2.s3 r8 = r8.f444096f
            java.lang.String r0 = r8.f444109b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "onTimeOut isKeepMic: "
            r1.<init>(r3)
            boolean r3 = r8.f444112e
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            boolean r0 = r8.f444112e
            if (r0 != 0) goto Lc8
            qf2.t3 r0 = r8.f444113f
            qf2.q3 r1 = r0.f444123a
            java.lang.Class<mm2.o4> r3 = mm2.o4.class
            androidx.lifecycle.c1 r1 = r1.m56788xbba4bfc0(r3)
            mm2.o4 r1 = (mm2.o4) r1
            r45.il4 r1 = r1.U
            r45.kf5 r1 = r1.f458665g
            if (r1 == 0) goto L86
            int r1 = r1.f460190e
            goto L87
        L86:
            r1 = 0
        L87:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onTimeOut breakType: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r8.f444109b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3)
            if (r1 == r2) goto L9d
            goto Lc8
        L9d:
            zl2.r4 r1 = zl2.r4.f555483a
            boolean r1 = r1.x1()
            if (r1 == 0) goto Lc8
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            xh2.a r8 = r8.f444108a
            km2.q r8 = r8.f536053a
            if (r8 == 0) goto Lb4
            java.lang.String r8 = r8.f390708f
            if (r8 != 0) goto Lb6
        Lb4:
            java.lang.String r8 = ""
        Lb6:
            java.lang.String r2 = "PARAM_FINDER_LIVE_MIC_ID"
            r1.putString(r2, r8)
            java.lang.String r8 = "PARAM_FINDER_LIVE_MIC_CLOSE_SCENE"
            r2 = 6
            r1.putInt(r8, r2)
            qo0.b r8 = qo0.b.M3
            qf2.q3 r0 = r0.f444123a
            r0.X6(r8, r1)
        Lc8:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.r3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
