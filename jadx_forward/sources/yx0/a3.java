package yx0;

/* loaded from: classes5.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f548655d;

    /* renamed from: e, reason: collision with root package name */
    public int f548656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548657f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f548658g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(yx0.b8 b8Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548657f = b8Var;
        this.f548658g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.a3(this.f548657f, this.f548658g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.a3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
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
            int r1 = r9.f548656e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L2e
            if (r1 == r6) goto L2a
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r9.f548655d
            com.tencent.maas.camerafun.MJRecordingFinishInfo r0 = (com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L74
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f548655d
            com.tencent.maas.camerafun.MJRecordingFinishInfo r1 = (com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r10 = r1
            goto L53
        L2a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L40
        L2e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            yx0.b8 r10 = r9.f548657f
            pp0.p0 r10 = r10.K
            if (r10 == 0) goto L43
            r9.f548656e = r6
            java.lang.Object r10 = r10.t0(r5, r9)
            if (r10 != r0) goto L40
            return r0
        L40:
            com.tencent.maas.camerafun.MJRecordingFinishInfo r10 = (com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5) r10
            goto L44
        L43:
            r10 = r2
        L44:
            yx0.b8 r1 = r9.f548657f
            r9.f548655d = r10
            r9.f548656e = r4
            java.lang.String r4 = "interruptRecordingInternal"
            java.lang.Object r1 = yx0.b8.b(r1, r4, r5, r9)
            if (r1 != r0) goto L53
            return r0
        L53:
            yx0.b8 r1 = r9.f548657f
            com.tencent.maas.camstudio.MJCamTemplateInfo r1 = r1.Q
            if (r1 == 0) goto L60
            boolean r1 = r1.m32768x2bff7042()
            if (r1 != r6) goto L60
            r5 = r6
        L60:
            if (r5 == 0) goto L75
            boolean r1 = r9.f548658g
            if (r1 != 0) goto L75
            yx0.b8 r1 = r9.f548657f
            r9.f548655d = r10
            r9.f548656e = r3
            java.lang.Object r1 = yx0.b8.j(r1, r9)
            if (r1 != r0) goto L73
            return r0
        L73:
            r0 = r10
        L74:
            r10 = r0
        L75:
            if (r10 == 0) goto L98
            java.lang.String r10 = r10.f129350a
            if (r10 == 0) goto L98
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L8a
            boolean r10 = com.p314xaae8f345.mm.vfs.w6.h(r10)     // Catch: java.lang.Throwable -> L8a
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)     // Catch: java.lang.Throwable -> L8a
            goto L95
        L8a:
            r10 = move-exception
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r10 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r10)
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)
        L95:
            p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(r10)
        L98:
            yx0.b8 r10 = r9.f548657f
            mx0.z r10 = r10.f548710d
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout r10 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) r10
            kotlinx.coroutines.y0 r3 = r10.getScope()
            kotlinx.coroutines.p0 r0 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r4 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r5 = 0
            mx0.o7 r6 = new mx0.o7
            r6.<init>(r10, r2)
            r7 = 2
            r8 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r3, r4, r5, r6, r7, r8)
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.a3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
