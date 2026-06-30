package yx0;

/* loaded from: classes5.dex */
public final class d2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.l f548772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f548773g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f548774h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(yx0.b8 b8Var, jz5.l lVar, boolean z17, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548771e = b8Var;
        this.f548772f = lVar;
        this.f548773g = z17;
        this.f548774h = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.d2(this.f548771e, this.f548772f, this.f548773g, this.f548774h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.d2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009c  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f548770d
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L96
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L82
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L51
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            yx0.b8 r12 = r11.f548771e
            mx0.z r12 = r12.f548710d
            jz5.l r1 = r11.f548772f
            if (r1 == 0) goto L32
            r1 = r5
            goto L33
        L32:
            r1 = 0
        L33:
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout r12 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) r12
            r12.Y0(r1)
            yx0.b8 r12 = r11.f548771e
            jz5.l r1 = r11.f548772f
            if (r1 == 0) goto L43
            java.lang.Object r1 = r1.f384366d
            com.tencent.maas.camstudio.MJCamMusicDesc r1 = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984) r1
            goto L44
        L43:
            r1 = r4
        L44:
            r12.T = r1
            yx0.b8 r12 = r11.f548771e
            r11.f548770d = r5
            java.lang.Object r12 = yx0.b8.o(r12, r11)
            if (r12 != r0) goto L51
            return r0
        L51:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "executeSwitchToEmptyTemplate >> "
            r12.<init>(r1)
            boolean r1 = r11.f548773g
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            java.lang.String r1 = "MicroMsg.ShootComposingCorePlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r12)
            yx0.b8 r12 = r11.f548771e
            r12.Q = r4
            yx0.b8 r12 = r11.f548771e
            rx0.e r1 = rx0.e.f482448a
            r12.S = r1
            yx0.b8 r12 = r11.f548771e
            yx0.v r1 = yx0.v.f549228f
            r12.q0(r1)
            yx0.b8 r12 = r11.f548771e
            r11.f548770d = r3
            java.lang.Object r12 = yx0.b8.d(r12, r11)
            if (r12 != r0) goto L82
            return r0
        L82:
            yx0.b8 r5 = r11.f548771e
            r6 = 0
            jz5.l r7 = r11.f548772f
            r8 = 0
            java.util.List r9 = r11.f548774h
            r11.f548770d = r2
            java.util.concurrent.locks.ReentrantLock r12 = yx0.b8.f548704c2
            r10 = r11
            java.lang.Object r12 = r5.v0(r6, r7, r8, r9, r10)
            if (r12 != r0) goto L96
            return r0
        L96:
            yx0.b8 r12 = r11.f548771e
            yz5.l r12 = r12.f548723q
            if (r12 == 0) goto La3
            java.lang.String r0 = "kEmptyTemplateId"
            r12.mo146xb9724478(r0)
            jz5.f0 r4 = jz5.f0.f384359a
        La3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.d2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
